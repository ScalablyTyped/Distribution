package typings
package complexDotJsLib.complexDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Complex extends js.Object {
  // the imaginary part of this complex number
  var im: scala.Double = js.native
  // the real part of this complex number
  var re: scala.Double = js.native
  /**
    * Calculates the magnitude of the complex number.
    */
  def abs(): scala.Double = js.native
  /**
    * Calculate the complex arcus cosinus.
    */
  def acos(): Complex = js.native
  /**
    * Calculate the complex asinh.
    */
  def acosh(): Complex = js.native
  /**
    * Calculate the complex arcus cotangent.
    */
  def acot(): Complex = js.native
  /**
    * Calculate the complex acoth.
    */
  def acoth(): Complex = js.native
  /**
    * Calculate the complex arcus cosecans.
    */
  def acsc(): Complex = js.native
  /**
    * Calculate the complex acsch.
    */
  def acsch(): Complex = js.native
  def add(a: Complex): Complex = js.native
  /**
    * Adds another complex number.
    */
  def add(a: scala.Double, b: scala.Double): Complex = js.native
  /**
    * Calculate the angle of the complex number.
    */
  def arg(): scala.Double = js.native
  /**
    * Calculate the complex arcus secant.
    */
  def asec(): Complex = js.native
  /**
    * Calculate the complex asech.
    */
  def asech(): Complex = js.native
  /**
    * Calculate the complex arcus sinus.
    */
  def asin(): Complex = js.native
  /**
    * Calculate the complex asinh.
    */
  def asinh(): Complex = js.native
  /**
    * Calculate the complex arcus tangent.
    */
  def atan(): Complex = js.native
  /**
    * Calculate the complex atanh.
    */
  def atanh(): Complex = js.native
  /**
    * Ceils the complex number parts off zero.
    */
  def ceil(places: scala.Double): Complex = js.native
  /**
    * Calculates the conjugate of the complex number (multiplies the imaginary part with -1).
    */
  def conjugate(): Complex = js.native
  /**
    * Calculate the cosine.
    */
  def cos(): Complex = js.native
  /**
    * Calculate the complex cosh.
    */
  def cosh(): Complex = js.native
  /**
    * Calculate the cotangent.
    */
  def cot(): Complex = js.native
  /**
    * Calculate the complex coth.
    */
  def coth(): Complex = js.native
  /**
    * Calculate the cosecans.
    */
  def csc(): Complex = js.native
  /**
    * Calculate the complex csch.
    */
  def csch(): Complex = js.native
  def div(a: Complex): Complex = js.native
  /**
    * Divides the number by another complex number.
    */
  def div(a: scala.Double, b: scala.Double): Complex = js.native
  def equals(a: Complex): scala.Boolean = js.native
  /**
    * Checks if both numbers are exactly the same,
    * if both numbers are infinite they are considered not equal.
    */
  def equals(a: scala.Double, b: scala.Double): scala.Boolean = js.native
  /**
    * Returns e^n with complex exponent n
    */
  def exp(): Complex = js.native
  /**
    * Floors the complex number parts towards zero.
    */
  def floor(places: scala.Double): Complex = js.native
  /**
    * Calculates the multiplicative inverse of the complex number (1 / z).
    */
  def inverse(): Complex = js.native
  /**
    * Checks if the given number is finite.
    */
  def isFinite(): scala.Boolean = js.native
  /**
    * Determines whether or not a complex number is at the infinity pole of the
    * Riemann sphere.
    */
  def isInfinite(): scala.Boolean = js.native
  /**
    * Checks if the given number is not a number.
    */
  def isNaN(): scala.Boolean = js.native
  /**
    * Determines whether or not a complex number is at the zero pole of the
    * Riemann sphere.
    */
  def isZero(): scala.Boolean = js.native
  /**
    * Returns the natural logarithm (base E) of the actual complex number.
    */
  def log(): Complex = js.native
  def mul(a: Complex): Complex = js.native
  /**
    * Multiplies the number with another complex number.
    */
  def mul(a: scala.Double, b: scala.Double): Complex = js.native
  /**
    * Negates the number (multiplies both the real and imaginary part with -1) in order to get the additive inverse.
    */
  def neg(): Complex = js.native
  def pow(a: Complex): Complex = js.native
  /**
    * Returns the number raised to the complex exponent.
    */
  def pow(a: scala.Double, b: scala.Double): Complex = js.native
  /**
    * Rounds the complex number parts.
    */
  def round(places: scala.Double): Complex = js.native
  /**
    * Calculate the secant.
    */
  def sec(): Complex = js.native
  /**
    * Calculate the complex sech.
    */
  def sech(): Complex = js.native
  /**
    * Returns the complex sign, defined as the complex number
    * normalized by it's absolute value.
    */
  def sign(): Complex = js.native
  /**
    * Calculate the sine of the complex number.
    */
  def sin(): Complex = js.native
  /**
    * Calculate the complex sinh.
    */
  def sinh(): Complex = js.native
  /**
    * Returns the complex square root of the number.
    */
  def sqrt(): Complex = js.native
  def sub(a: Complex): Complex = js.native
  /**
    * Subtracts another complex number.
    */
  def sub(a: scala.Double, b: scala.Double): Complex = js.native
  /**
    * Calculate the tangent.
    */
  def tan(): Complex = js.native
  /**
    * Calculate the complex tanh.
    */
  def tanh(): Complex = js.native
  /**
    * Returns a Vector of the actual complex number with two components.
    */
  def toVector(): js.Array[scala.Double] = js.native
}

