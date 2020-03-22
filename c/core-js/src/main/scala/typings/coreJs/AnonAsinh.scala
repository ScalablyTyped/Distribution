package typings.coreJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsinh extends js.Object {
  def acosh(x: Double): Double
  def asinh(x: Double): Double
  def atanh(x: Double): Double
  def cbrt(x: Double): Double
  def clz32(x: Double): Double
  def cosh(x: Double): Double
  def expm1(x: Double): Double
  def fround(x: Double): Double
  def hypot(values: Double*): Double
  def imul(x: Double, y: Double): Double
  def log10(x: Double): Double
  def log1p(x: Double): Double
  def log2(x: Double): Double
  def sign(x: Double): Double
  def sinh(x: Double): Double
  def tanh(x: Double): Double
  def trunc(x: Double): Double
}

object AnonAsinh {
  @scala.inline
  def apply(
    acosh: Double => Double,
    asinh: Double => Double,
    atanh: Double => Double,
    cbrt: Double => Double,
    clz32: Double => Double,
    cosh: Double => Double,
    expm1: Double => Double,
    fround: Double => Double,
    hypot: /* repeated */ Double => Double,
    imul: (Double, Double) => Double,
    log10: Double => Double,
    log1p: Double => Double,
    log2: Double => Double,
    sign: Double => Double,
    sinh: Double => Double,
    tanh: Double => Double,
    trunc: Double => Double
  ): AnonAsinh = {
    val __obj = js.Dynamic.literal(acosh = js.Any.fromFunction1(acosh), asinh = js.Any.fromFunction1(asinh), atanh = js.Any.fromFunction1(atanh), cbrt = js.Any.fromFunction1(cbrt), clz32 = js.Any.fromFunction1(clz32), cosh = js.Any.fromFunction1(cosh), expm1 = js.Any.fromFunction1(expm1), fround = js.Any.fromFunction1(fround), hypot = js.Any.fromFunction1(hypot), imul = js.Any.fromFunction2(imul), log10 = js.Any.fromFunction1(log10), log1p = js.Any.fromFunction1(log1p), log2 = js.Any.fromFunction1(log2), sign = js.Any.fromFunction1(sign), sinh = js.Any.fromFunction1(sinh), tanh = js.Any.fromFunction1(tanh), trunc = js.Any.fromFunction1(trunc))
  
    __obj.asInstanceOf[AnonAsinh]
  }
}

