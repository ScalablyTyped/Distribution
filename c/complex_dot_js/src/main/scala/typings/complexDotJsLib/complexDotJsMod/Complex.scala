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
    abs: () => scala.Double,
    acos: () => Complex,
    acosh: () => Complex,
    acot: () => Complex,
    acoth: () => Complex,
    acsc: () => Complex,
    acsch: () => Complex,
    add: (scala.Double, scala.Double) => Complex,
    arg: () => scala.Double,
    asec: () => Complex,
    asech: () => Complex,
    asin: () => Complex,
    asinh: () => Complex,
    atan: () => Complex,
    atanh: () => Complex,
    ceil: scala.Double => Complex,
    clone: () => Complex,
    conjugate: () => Complex,
    cos: () => Complex,
    cosh: () => Complex,
    cot: () => Complex,
    coth: () => Complex,
    csc: () => Complex,
    csch: () => Complex,
    div: (scala.Double, scala.Double) => Complex,
    equals: (scala.Double, scala.Double) => scala.Boolean,
    exp: () => Complex,
    floor: scala.Double => Complex,
    inverse: () => Complex,
    isFinite: () => scala.Boolean,
    isInfinite: () => scala.Boolean,
    isNaN: () => scala.Boolean,
    isZero: () => scala.Boolean,
    log: () => Complex,
    mul: (scala.Double, scala.Double) => Complex,
    neg: () => Complex,
    pow: (scala.Double, scala.Double) => Complex,
    round: scala.Double => Complex,
    sec: () => Complex,
    sech: () => Complex,
    sign: () => Complex,
    sin: () => Complex,
    sinh: () => Complex,
    sqrt: () => Complex,
    sub: (scala.Double, scala.Double) => Complex,
    tan: () => Complex,
    tanh: () => Complex,
    toString: () => java.lang.String,
    toVector: () => js.Array[scala.Double],
    valueOf: () => js.UndefOr[scala.Double]
  ): Complex = {
    val __obj = js.Dynamic.literal(abs = js.Any.fromFunction0(abs), acos = js.Any.fromFunction0(acos), acosh = js.Any.fromFunction0(acosh), acot = js.Any.fromFunction0(acot), acoth = js.Any.fromFunction0(acoth), acsc = js.Any.fromFunction0(acsc), acsch = js.Any.fromFunction0(acsch), add = js.Any.fromFunction2(add), arg = js.Any.fromFunction0(arg), asec = js.Any.fromFunction0(asec), asech = js.Any.fromFunction0(asech), asin = js.Any.fromFunction0(asin), asinh = js.Any.fromFunction0(asinh), atan = js.Any.fromFunction0(atan), atanh = js.Any.fromFunction0(atanh), ceil = js.Any.fromFunction1(ceil), clone = js.Any.fromFunction0(clone), conjugate = js.Any.fromFunction0(conjugate), cos = js.Any.fromFunction0(cos), cosh = js.Any.fromFunction0(cosh), cot = js.Any.fromFunction0(cot), coth = js.Any.fromFunction0(coth), csc = js.Any.fromFunction0(csc), csch = js.Any.fromFunction0(csch), div = js.Any.fromFunction2(div), equals = js.Any.fromFunction2(equals), exp = js.Any.fromFunction0(exp), floor = js.Any.fromFunction1(floor), inverse = js.Any.fromFunction0(inverse), isFinite = js.Any.fromFunction0(isFinite), isInfinite = js.Any.fromFunction0(isInfinite), isNaN = js.Any.fromFunction0(isNaN), isZero = js.Any.fromFunction0(isZero), log = js.Any.fromFunction0(log), mul = js.Any.fromFunction2(mul), neg = js.Any.fromFunction0(neg), pow = js.Any.fromFunction2(pow), round = js.Any.fromFunction1(round), sec = js.Any.fromFunction0(sec), sech = js.Any.fromFunction0(sech), sign = js.Any.fromFunction0(sign), sin = js.Any.fromFunction0(sin), sinh = js.Any.fromFunction0(sinh), sqrt = js.Any.fromFunction0(sqrt), sub = js.Any.fromFunction2(sub), tan = js.Any.fromFunction0(tan), tanh = js.Any.fromFunction0(tanh), toString = js.Any.fromFunction0(toString), toVector = js.Any.fromFunction0(toVector), valueOf = js.Any.fromFunction0(valueOf))
  
    __obj.asInstanceOf[Complex]
  }
}

