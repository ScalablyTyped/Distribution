package typings
package complexDotJsLib.complexDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Complex extends js.Object {
  /**
    * Calculates the magnitude of the complex number.
    */
  def abs(): scala.Double
  /**
    * Calculate the complex arcus cosinus.
    */
  def acos(): Complex
  /**
    * Calculate the complex asinh.
    */
  def acosh(): Complex
  /**
    * Calculate the complex arcus cotangent.
    */
  def acot(): Complex
  /**
    * Calculate the complex acoth.
    */
  def acoth(): Complex
  /**
    * Calculate the complex arcus cosecans.
    */
  def acsc(): Complex
  /**
    * Calculate the complex acsch.
    */
  def acsch(): Complex
  /**
    * Adds another complex number.
    */
  def add(a: scala.Double, b: scala.Double): Complex
  /**
    * Calculate the angle of the complex number.
    */
  def arg(): scala.Double
  /**
    * Calculate the complex arcus secant.
    */
  def asec(): Complex
  /**
    * Calculate the complex asech.
    */
  def asech(): Complex
  /**
    * Calculate the complex arcus sinus.
    */
  def asin(): Complex
  /**
    * Calculate the complex asinh.
    */
  def asinh(): Complex
  /**
    * Calculate the complex arcus tangent.
    */
  def atan(): Complex
  /**
    * Calculate the complex atanh.
    */
  def atanh(): Complex
  /**
    * Ceils the complex number parts off zero.
    */
  def ceil(places: scala.Double): Complex
  /**
    * Calculates the conjugate of the complex number (multiplies the imaginary part with -1).
    */
  def conjugate(): Complex
  /**
    * Calculate the cosine.
    */
  def cos(): Complex
  /**
    * Calculate the complex cosh.
    */
  def cosh(): Complex
  /**
    * Calculate the cotangent.
    */
  def cot(): Complex
  /**
    * Calculate the complex coth.
    */
  def coth(): Complex
  /**
    * Calculate the cosecans.
    */
  def csc(): Complex
  /**
    * Calculate the complex csch.
    */
  def csch(): Complex
  /**
    * Divides the number by another complex number.
    */
  def div(a: scala.Double, b: scala.Double): Complex
  /**
    * Checks if both numbers are exactly the same,
    * if both numbers are infinite they are considered not equal.
    */
  def equals(a: scala.Double, b: scala.Double): scala.Boolean
  /**
    * Returns e^n with complex exponent n
    */
  def exp(): Complex
  /**
    * Floors the complex number parts towards zero.
    */
  def floor(places: scala.Double): Complex
  /**
    * Calculates the multiplicative inverse of the complex number (1 / z).
    */
  def inverse(): Complex
  /**
    * Checks if the given number is finite.
    */
  def isFinite(): scala.Boolean
  /**
    * Determines whether or not a complex number is at the infinity pole of the
    * Riemann sphere.
    */
  def isInfinite(): scala.Boolean
  /**
    * Checks if the given number is not a number.
    */
  def isNaN(): scala.Boolean
  /**
    * Determines whether or not a complex number is at the zero pole of the
    * Riemann sphere.
    */
  def isZero(): scala.Boolean
  /**
    * Returns the natural logarithm (base E) of the actual complex number.
    */
  def log(): Complex
  /**
    * Multiplies the number with another complex number.
    */
  def mul(a: scala.Double, b: scala.Double): Complex
  /**
    * Negates the number (multiplies both the real and imaginary part with -1) in order to get the additive inverse.
    */
  def neg(): Complex
  /**
    * Returns the number raised to the complex exponent.
    */
  def pow(a: scala.Double, b: scala.Double): Complex
  /**
    * Rounds the complex number parts.
    */
  def round(places: scala.Double): Complex
  /**
    * Calculate the secant.
    */
  def sec(): Complex
  /**
    * Calculate the complex sech.
    */
  def sech(): Complex
  /**
    * Returns the complex sign, defined as the complex number
    * normalized by it's absolute value.
    */
  def sign(): Complex
  /**
    * Calculate the sine of the complex number.
    */
  def sin(): Complex
  /**
    * Calculate the complex sinh.
    */
  def sinh(): Complex
  /**
    * Returns the complex square root of the number.
    */
  def sqrt(): Complex
  /**
    * Subtracts another complex number.
    */
  def sub(a: scala.Double, b: scala.Double): Complex
  /**
    * Calculate the tangent.
    */
  def tan(): Complex
  /**
    * Calculate the complex tanh.
    */
  def tanh(): Complex
  /**
    * Returns a Vector of the actual complex number with two components.
    */
  def toVector(): js.Array[scala.Double]
}

object Complex {
  @scala.inline
  def apply(
    abs: js.Function0[scala.Double],
    acos: js.Function0[Complex],
    acosh: js.Function0[Complex],
    acot: js.Function0[Complex],
    acoth: js.Function0[Complex],
    acsc: js.Function0[Complex],
    acsch: js.Function0[Complex],
    add: js.Function2[scala.Double, scala.Double, Complex],
    arg: js.Function0[scala.Double],
    asec: js.Function0[Complex],
    asech: js.Function0[Complex],
    asin: js.Function0[Complex],
    asinh: js.Function0[Complex],
    atan: js.Function0[Complex],
    atanh: js.Function0[Complex],
    ceil: js.Function1[scala.Double, Complex],
    clone: js.Function0[Complex],
    conjugate: js.Function0[Complex],
    cos: js.Function0[Complex],
    cosh: js.Function0[Complex],
    cot: js.Function0[Complex],
    coth: js.Function0[Complex],
    csc: js.Function0[Complex],
    csch: js.Function0[Complex],
    div: js.Function2[scala.Double, scala.Double, Complex],
    equals: js.Function2[scala.Double, scala.Double, scala.Boolean],
    exp: js.Function0[Complex],
    floor: js.Function1[scala.Double, Complex],
    inverse: js.Function0[Complex],
    isFinite: js.Function0[scala.Boolean],
    isInfinite: js.Function0[scala.Boolean],
    isNaN: js.Function0[scala.Boolean],
    isZero: js.Function0[scala.Boolean],
    log: js.Function0[Complex],
    mul: js.Function2[scala.Double, scala.Double, Complex],
    neg: js.Function0[Complex],
    pow: js.Function2[scala.Double, scala.Double, Complex],
    round: js.Function1[scala.Double, Complex],
    sec: js.Function0[Complex],
    sech: js.Function0[Complex],
    sign: js.Function0[Complex],
    sin: js.Function0[Complex],
    sinh: js.Function0[Complex],
    sqrt: js.Function0[Complex],
    sub: js.Function2[scala.Double, scala.Double, Complex],
    tan: js.Function0[Complex],
    tanh: js.Function0[Complex],
    toString: js.Function0[java.lang.String],
    toVector: js.Function0[js.Array[scala.Double]],
    valueOf: js.Function0[js.UndefOr[scala.Double]]
  ): Complex = {
    val __obj = js.Dynamic.literal(abs = abs, acos = acos, acosh = acosh, acot = acot, acoth = acoth, acsc = acsc, acsch = acsch, add = add, arg = arg, asec = asec, asech = asech, asin = asin, asinh = asinh, atan = atan, atanh = atanh, ceil = ceil, clone = clone, conjugate = conjugate, cos = cos, cosh = cosh, cot = cot, coth = coth, csc = csc, csch = csch, div = div, equals = equals, exp = exp, floor = floor, inverse = inverse, isFinite = isFinite, isInfinite = isInfinite, isNaN = isNaN, isZero = isZero, log = log, mul = mul, neg = neg, pow = pow, round = round, sec = sec, sech = sech, sign = sign, sin = sin, sinh = sinh, sqrt = sqrt, sub = sub, tan = tan, tanh = tanh, toString = toString, toVector = toVector, valueOf = valueOf)
  
    __obj.asInstanceOf[Complex]
  }
}

