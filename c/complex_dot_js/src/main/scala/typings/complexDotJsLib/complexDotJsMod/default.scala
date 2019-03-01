package typings
package complexDotJsLib.complexDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("complex.js", JSImport.Default)
@js.native
class default protected () extends Complex {
  def this(x: scala.Double, y: scala.Double) = this()
  /**
    * Calculates the magnitude of the complex number.
    */
  /* CompleteClass */
  override def abs(): scala.Double = js.native
  /**
    * Calculate the complex arcus cosinus.
    */
  /* CompleteClass */
  override def acos(): Complex = js.native
  /**
    * Calculate the complex asinh.
    */
  /* CompleteClass */
  override def acosh(): Complex = js.native
  /**
    * Calculate the complex arcus cotangent.
    */
  /* CompleteClass */
  override def acot(): Complex = js.native
  /**
    * Calculate the complex acoth.
    */
  /* CompleteClass */
  override def acoth(): Complex = js.native
  /**
    * Calculate the complex arcus cosecans.
    */
  /* CompleteClass */
  override def acsc(): Complex = js.native
  /**
    * Calculate the complex acsch.
    */
  /* CompleteClass */
  override def acsch(): Complex = js.native
  /**
    * Adds another complex number.
    */
  /* CompleteClass */
  override def add(a: scala.Double, b: scala.Double): Complex = js.native
  /**
    * Calculate the angle of the complex number.
    */
  /* CompleteClass */
  override def arg(): scala.Double = js.native
  /**
    * Calculate the complex arcus secant.
    */
  /* CompleteClass */
  override def asec(): Complex = js.native
  /**
    * Calculate the complex asech.
    */
  /* CompleteClass */
  override def asech(): Complex = js.native
  /**
    * Calculate the complex arcus sinus.
    */
  /* CompleteClass */
  override def asin(): Complex = js.native
  /**
    * Calculate the complex asinh.
    */
  /* CompleteClass */
  override def asinh(): Complex = js.native
  /**
    * Calculate the complex arcus tangent.
    */
  /* CompleteClass */
  override def atan(): Complex = js.native
  /**
    * Calculate the complex atanh.
    */
  /* CompleteClass */
  override def atanh(): Complex = js.native
  /**
    * Ceils the complex number parts off zero.
    */
  /* CompleteClass */
  override def ceil(places: scala.Double): Complex = js.native
  /**
    * Calculates the conjugate of the complex number (multiplies the imaginary part with -1).
    */
  /* CompleteClass */
  override def conjugate(): Complex = js.native
  /**
    * Calculate the cosine.
    */
  /* CompleteClass */
  override def cos(): Complex = js.native
  /**
    * Calculate the complex cosh.
    */
  /* CompleteClass */
  override def cosh(): Complex = js.native
  /**
    * Calculate the cotangent.
    */
  /* CompleteClass */
  override def cot(): Complex = js.native
  /**
    * Calculate the complex coth.
    */
  /* CompleteClass */
  override def coth(): Complex = js.native
  /**
    * Calculate the cosecans.
    */
  /* CompleteClass */
  override def csc(): Complex = js.native
  /**
    * Calculate the complex csch.
    */
  /* CompleteClass */
  override def csch(): Complex = js.native
  /**
    * Divides the number by another complex number.
    */
  /* CompleteClass */
  override def div(a: scala.Double, b: scala.Double): Complex = js.native
  /**
    * Checks if both numbers are exactly the same,
    * if both numbers are infinite they are considered not equal.
    */
  /* CompleteClass */
  override def equals(a: scala.Double, b: scala.Double): scala.Boolean = js.native
  /**
    * Returns e^n with complex exponent n
    */
  /* CompleteClass */
  override def exp(): Complex = js.native
  /**
    * Floors the complex number parts towards zero.
    */
  /* CompleteClass */
  override def floor(places: scala.Double): Complex = js.native
  /**
    * Calculates the multiplicative inverse of the complex number (1 / z).
    */
  /* CompleteClass */
  override def inverse(): Complex = js.native
  /**
    * Checks if the given number is finite.
    */
  /* CompleteClass */
  override def isFinite(): scala.Boolean = js.native
  /**
    * Determines whether or not a complex number is at the infinity pole of the
    * Riemann sphere.
    */
  /* CompleteClass */
  override def isInfinite(): scala.Boolean = js.native
  /**
    * Checks if the given number is not a number.
    */
  /* CompleteClass */
  override def isNaN(): scala.Boolean = js.native
  /**
    * Determines whether or not a complex number is at the zero pole of the
    * Riemann sphere.
    */
  /* CompleteClass */
  override def isZero(): scala.Boolean = js.native
  /**
    * Returns the natural logarithm (base E) of the actual complex number.
    */
  /* CompleteClass */
  override def log(): Complex = js.native
  /**
    * Multiplies the number with another complex number.
    */
  /* CompleteClass */
  override def mul(a: scala.Double, b: scala.Double): Complex = js.native
  /**
    * Negates the number (multiplies both the real and imaginary part with -1) in order to get the additive inverse.
    */
  /* CompleteClass */
  override def neg(): Complex = js.native
  /**
    * Returns the number raised to the complex exponent.
    */
  /* CompleteClass */
  override def pow(a: scala.Double, b: scala.Double): Complex = js.native
  /**
    * Rounds the complex number parts.
    */
  /* CompleteClass */
  override def round(places: scala.Double): Complex = js.native
  /**
    * Calculate the secant.
    */
  /* CompleteClass */
  override def sec(): Complex = js.native
  /**
    * Calculate the complex sech.
    */
  /* CompleteClass */
  override def sech(): Complex = js.native
  /**
    * Returns the complex sign, defined as the complex number
    * normalized by it's absolute value.
    */
  /* CompleteClass */
  override def sign(): Complex = js.native
  /**
    * Calculate the sine of the complex number.
    */
  /* CompleteClass */
  override def sin(): Complex = js.native
  /**
    * Calculate the complex sinh.
    */
  /* CompleteClass */
  override def sinh(): Complex = js.native
  /**
    * Returns the complex square root of the number.
    */
  /* CompleteClass */
  override def sqrt(): Complex = js.native
  /**
    * Subtracts another complex number.
    */
  /* CompleteClass */
  override def sub(a: scala.Double, b: scala.Double): Complex = js.native
  /**
    * Calculate the tangent.
    */
  /* CompleteClass */
  override def tan(): Complex = js.native
  /**
    * Calculate the complex tanh.
    */
  /* CompleteClass */
  override def tanh(): Complex = js.native
  /**
    * Returns a Vector of the actual complex number with two components.
    */
  /* CompleteClass */
  override def toVector(): js.Array[scala.Double] = js.native
}

/* static members */
@JSImport("complex.js", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * A complex euler number instance.
    */
  var E: complexDotJsLib.complexDotJsMod.Complex = js.native
  /**
    * A small epsilon value used for equals() comparison in order to circumvent double inprecision.
    */
  var EPSILON: scala.Double = js.native
  /**
    * An imaginary number i instance.
    */
  var I: complexDotJsLib.complexDotJsMod.Complex = js.native
  /**
    * A complex infinity value (north pole on the Riemann Sphere).
    */
  var INFINITY: complexDotJsLib.complexDotJsMod.Complex = js.native
  /**
    * A complex NaN value (not on the Riemann Sphere).
    */
  var NAN: complexDotJsLib.complexDotJsMod.Complex = js.native
  /**
    * A complex one instance.
    */
  var ONE: complexDotJsLib.complexDotJsMod.Complex = js.native
  /**
    * A complex PI instance.
    */
  var PI: complexDotJsLib.complexDotJsMod.Complex = js.native
  /**
    * A complex zero value (south pole on the Riemann Sphere).
    */
  var ZERO: complexDotJsLib.complexDotJsMod.Complex = js.native
}

