
package bankmonteria;

import java.util.Date;

/**
 *
 * @author sergio
 */
public class Empleado extends Persona {
  private boolean turno;
  private String cargo;

  //Constructor super vacio
  public Empleado() {
    super();
  }

  //Constructor super con parametros
  public Empleado(String identificacion, String nombre, String apellido, Date fechaNacimiento, String direccion, String cargo, boolean turno) {
    super(identificacion, nombre, apellido, fechaNacimiento, direccion);
    this.cargo = cargo;
    this.turno = turno;
  }

  //Getters y Setters
  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public boolean isTurno() {
    return turno;
  }

  public void setTurno(boolean turno) {
    this.turno = turno;
  }

  public void setIdentificacion(String identificacion) {
    this.identificacion = identificacion;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public void setFechaNacimiento(Date fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  @Override
  public String toString() {
    return "Empleado{" + "identificacion=" + identificacion + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion + ", cargo=" + cargo + ", turno=" + turno + '}';
  }

  






    
    
}