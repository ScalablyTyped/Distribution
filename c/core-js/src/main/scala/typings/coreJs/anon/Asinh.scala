package typings.coreJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Asinh extends js.Object {
  def acosh(x: Double): Double = js.native
  def asinh(x: Double): Double = js.native
  def atanh(x: Double): Double = js.native
  def cbrt(x: Double): Double = js.native
  def clz32(x: Double): Double = js.native
  def cosh(x: Double): Double = js.native
  def expm1(x: Double): Double = js.native
  def fround(x: Double): Double = js.native
  def hypot(values: Double*): Double = js.native
  def imul(x: Double, y: Double): Double = js.native
  def log10(x: Double): Double = js.native
  def log1p(x: Double): Double = js.native
  def log2(x: Double): Double = js.native
  def sign(x: Double): Double = js.native
  def sinh(x: Double): Double = js.native
  def tanh(x: Double): Double = js.native
  def trunc(x: Double): Double = js.native
}

object Asinh {
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
  ): Asinh = {
    val __obj = js.Dynamic.literal(acosh = js.Any.fromFunction1(acosh), asinh = js.Any.fromFunction1(asinh), atanh = js.Any.fromFunction1(atanh), cbrt = js.Any.fromFunction1(cbrt), clz32 = js.Any.fromFunction1(clz32), cosh = js.Any.fromFunction1(cosh), expm1 = js.Any.fromFunction1(expm1), fround = js.Any.fromFunction1(fround), hypot = js.Any.fromFunction1(hypot), imul = js.Any.fromFunction2(imul), log10 = js.Any.fromFunction1(log10), log1p = js.Any.fromFunction1(log1p), log2 = js.Any.fromFunction1(log2), sign = js.Any.fromFunction1(sign), sinh = js.Any.fromFunction1(sinh), tanh = js.Any.fromFunction1(tanh), trunc = js.Any.fromFunction1(trunc))
    __obj.asInstanceOf[Asinh]
  }
  @scala.inline
  implicit class AsinhOps[Self <: Asinh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcosh(value: Double => Double): Self = this.set("acosh", js.Any.fromFunction1(value))
    @scala.inline
    def setAsinh(value: Double => Double): Self = this.set("asinh", js.Any.fromFunction1(value))
    @scala.inline
    def setAtanh(value: Double => Double): Self = this.set("atanh", js.Any.fromFunction1(value))
    @scala.inline
    def setCbrt(value: Double => Double): Self = this.set("cbrt", js.Any.fromFunction1(value))
    @scala.inline
    def setClz32(value: Double => Double): Self = this.set("clz32", js.Any.fromFunction1(value))
    @scala.inline
    def setCosh(value: Double => Double): Self = this.set("cosh", js.Any.fromFunction1(value))
    @scala.inline
    def setExpm1(value: Double => Double): Self = this.set("expm1", js.Any.fromFunction1(value))
    @scala.inline
    def setFround(value: Double => Double): Self = this.set("fround", js.Any.fromFunction1(value))
    @scala.inline
    def setHypot(value: /* repeated */ Double => Double): Self = this.set("hypot", js.Any.fromFunction1(value))
    @scala.inline
    def setImul(value: (Double, Double) => Double): Self = this.set("imul", js.Any.fromFunction2(value))
    @scala.inline
    def setLog10(value: Double => Double): Self = this.set("log10", js.Any.fromFunction1(value))
    @scala.inline
    def setLog1p(value: Double => Double): Self = this.set("log1p", js.Any.fromFunction1(value))
    @scala.inline
    def setLog2(value: Double => Double): Self = this.set("log2", js.Any.fromFunction1(value))
    @scala.inline
    def setSign(value: Double => Double): Self = this.set("sign", js.Any.fromFunction1(value))
    @scala.inline
    def setSinh(value: Double => Double): Self = this.set("sinh", js.Any.fromFunction1(value))
    @scala.inline
    def setTanh(value: Double => Double): Self = this.set("tanh", js.Any.fromFunction1(value))
    @scala.inline
    def setTrunc(value: Double => Double): Self = this.set("trunc", js.Any.fromFunction1(value))
  }
  
}

