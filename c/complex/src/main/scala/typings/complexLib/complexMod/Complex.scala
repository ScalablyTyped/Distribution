package typings
package complexLib.complexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Complex extends js.Object {
  /**
       * The Complex number's imaginary component
       */
  var im: scala.Double = js.native
  /**
       * The Complex number's real component
       */
  var real: scala.Double = js.native
  /**
       * Alias for magnitude(). Calculate the magnitude of the complex number.
       */
  def abs(): scala.Double = js.native
  /**
       * Add a real or complex number
       * @param z The number to add
       */
  def add(z: Complex): Complex = js.native
  /**
       * Add a real or complex number
       * @param z The number to add
       */
  def add(z: scala.Double): Complex = js.native
  /**
       * Calculate the angle with respect to the real axis, in radians.
       */
  def angle(): scala.Double = js.native
  /**
       * Alias for angle(). Calculate the angle with respect to the real axis, in radians.
       */
  def arg(): scala.Double = js.native
  /**
       * Calculate the conjugate of the complex number (multiplies the imaginary part with -1)
       */
  def conjugate(): Complex = js.native
  /**
       * Calculate the cosine of the complex number
       */
  def cos(): Complex = js.native
  /**
       * Calculate the hyperbolic cosine of the complex number
       */
  def cosh(): Complex = js.native
  /**
       * Alias for divide(). Divide the number by a real or complex number
       * @param z The number to divide by
       */
  def div(z: Complex): Complex = js.native
  /**
       * Alias for divide(). Divide the number by a real or complex number
       * @param z The number to divide by
       */
  def div(z: scala.Double): Complex = js.native
  /**
       * Divide the number by a real or complex number
       * @param z The number to divide by
       */
  def divide(z: Complex): Complex = js.native
  /**
       * Divide the number by a real or complex number
       * @param z The number to divide by
       */
  def divide(z: scala.Double): Complex = js.native
  /**
       * Check if the real and imaginary components are equal to the passed in compelex components.
       *
       * Examples:
       * new Complex(1, 4).equals(new Complex(1, 4)); // true
       * new Complex(1, 4).equals(new Complex(1, 3)); // false
       *
       * @param z The complex number to compare with
       */
  def equals(z: Complex): scala.Boolean = js.native
  /**
       * Check if the real and imaginary components are equal to the passed in compelex components.
       *
       * Examples:
       * new Complex(1, 4).equals(new Complex(1, 4)); // true
       * new Complex(1, 4).equals(new Complex(1, 3)); // false
       *
       * @param z The complex number to compare with
       */
  def equals(z: scala.Double): scala.Boolean = js.native
  /**
       * Calculate the e^z where the base is E and the exponential the complex number.
       */
  def exp(): Complex = js.native
  /**
       * Set the a and b in a + bi from a polar representation.
       * @param r The radius/magnitude of the number
       * @param phi The angle/phase of the number
       */
  def fromPolar(r: scala.Double, phi: scala.Double): Complex = js.native
  /**
       * Set the real and imaginary properties a and b from a + bi.
       * @param real The real part of the number
       * @param im The imaginary part of the number
       */
  def fromRect(real: scala.Double, im: scala.Double): Complex = js.native
  /**
       * Return the natural logarithm (base E)
       * @param k The actual answer has a multiplicity (ln(z) = ln|z| + arg(z)) where arg(z) can return the same for
       * different angles (every 2*pi), with this argument you can define which answer is required
       */
  def log(): Complex = js.native
  /**
       * Return the natural logarithm (base E)
       * @param k The actual answer has a multiplicity (ln(z) = ln|z| + arg(z)) where arg(z) can return the same for
       * different angles (every 2*pi), with this argument you can define which answer is required
       */
  def log(k: scala.Double): Complex = js.native
  /**
       * Calculate the magnitude of the complex number
       */
  def magnitude(): scala.Double = js.native
  /**
       * Alias for multiply(). Multiply the number with a real or complex number
       * @param z The number to multiply with
       */
  def mult(z: Complex): Complex = js.native
  /**
       * Alias for multiply(). Multiply the number with a real or complex number
       * @param z The number to multiply with
       */
  def mult(z: scala.Double): Complex = js.native
  /**
       * Multiply the number with a real or complex number
       * @param z The number to multiply with
       */
  def multiply(z: Complex): Complex = js.native
  /**
       * Multiply the number with a real or complex number
       * @param z The number to multiply with
       */
  def multiply(z: scala.Double): Complex = js.native
  /**
       * Negate the number (multiplies both the real and imaginary part with -1)
       */
  def negate(): Complex = js.native
  /**
       * Alias for angle(). Calculate the angle with respect to the real axis, in radians.
       */
  def phase(): scala.Double = js.native
  /**
       * Return the base to the exponent
       * @param z The exponent
       */
  def pow(z: Complex): Complex = js.native
  /**
       * Return the base to the exponent
       * @param z The exponent
       */
  def pow(z: scala.Double): Complex = js.native
  /**
       * Calculate the sine of the complex number
       */
  def sin(): Complex = js.native
  /**
       * Calculate the hyperbolic sine of the complex number
       */
  def sinh(): Complex = js.native
  /**
       * Return the square root
       */
  def sqrt(): Complex = js.native
  /**
       * Alias for subtract(). Subtract a real or complex number
       * @param z The number to subtract
       */
  def sub(z: Complex): Complex = js.native
  /**
       * Alias for subtract(). Subtract a real or complex number
       * @param z The number to subtract
       */
  def sub(z: scala.Double): Complex = js.native
  /**
       * Subtract a real or complex number
       * @param z The number to subtract
       */
  def subtract(z: Complex): Complex = js.native
  /**
       * Subtract a real or complex number
       * @param z The number to subtract
       */
  def subtract(z: scala.Double): Complex = js.native
  /**
       * Calculate the tangent of the complex number
       */
  def tan(): Complex = js.native
  /**
       * Calculate the hyperbolic tangent of the complex number
       */
  def tanh(): Complex = js.native
  /**
       * Format a number using fixed-point notation. Similar to Number.prototype.toFixed.
       * Useful before printing the number with the toString method.
       * @param k The number of digits to appear after the decimal point [0 - 20].
       * Implementations may optionally support a larger range of values.
       * If this argument is omitted, it is treated as 0.
       */
  def toFixed(k: scala.Double): Complex = js.native
  /**
       * Set the precision of the numbers. Similar to Number.prototype.toPrecision.
       * Useful before printing the number with the toString method.
       * @param k An integer specifying the number of significant digits
       */
  def toPrecision(k: scala.Double): Complex = js.native
}

