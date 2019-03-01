package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcoshAsinh extends js.Object {
  def acosh(x: scala.Double): scala.Double
  def asinh(x: scala.Double): scala.Double
  def atanh(x: scala.Double): scala.Double
  def cbrt(x: scala.Double): scala.Double
  def clz32(x: scala.Double): scala.Double
  def cosh(x: scala.Double): scala.Double
  def expm1(x: scala.Double): scala.Double
  def fround(x: scala.Double): scala.Double
  def hypot(values: scala.Double*): scala.Double
  def imul(x: scala.Double, y: scala.Double): scala.Double
  def log10(x: scala.Double): scala.Double
  def log1p(x: scala.Double): scala.Double
  def log2(x: scala.Double): scala.Double
  def sign(x: scala.Double): scala.Double
  def sinh(x: scala.Double): scala.Double
  def tanh(x: scala.Double): scala.Double
  def trunc(x: scala.Double): scala.Double
}

object Anon_AcoshAsinh {
  @scala.inline
  def apply(
    acosh: js.Function1[scala.Double, scala.Double],
    asinh: js.Function1[scala.Double, scala.Double],
    atanh: js.Function1[scala.Double, scala.Double],
    cbrt: js.Function1[scala.Double, scala.Double],
    clz32: js.Function1[scala.Double, scala.Double],
    cosh: js.Function1[scala.Double, scala.Double],
    expm1: js.Function1[scala.Double, scala.Double],
    fround: js.Function1[scala.Double, scala.Double],
    hypot: js.Function1[/* repeated */ scala.Double, scala.Double],
    imul: js.Function2[scala.Double, scala.Double, scala.Double],
    log10: js.Function1[scala.Double, scala.Double],
    log1p: js.Function1[scala.Double, scala.Double],
    log2: js.Function1[scala.Double, scala.Double],
    sign: js.Function1[scala.Double, scala.Double],
    sinh: js.Function1[scala.Double, scala.Double],
    tanh: js.Function1[scala.Double, scala.Double],
    trunc: js.Function1[scala.Double, scala.Double]
  ): Anon_AcoshAsinh = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acosh")(acosh)
    __obj.updateDynamic("asinh")(asinh)
    __obj.updateDynamic("atanh")(atanh)
    __obj.updateDynamic("cbrt")(cbrt)
    __obj.updateDynamic("clz32")(clz32)
    __obj.updateDynamic("cosh")(cosh)
    __obj.updateDynamic("expm1")(expm1)
    __obj.updateDynamic("fround")(fround)
    __obj.updateDynamic("hypot")(hypot)
    __obj.updateDynamic("imul")(imul)
    __obj.updateDynamic("log10")(log10)
    __obj.updateDynamic("log1p")(log1p)
    __obj.updateDynamic("log2")(log2)
    __obj.updateDynamic("sign")(sign)
    __obj.updateDynamic("sinh")(sinh)
    __obj.updateDynamic("tanh")(tanh)
    __obj.updateDynamic("trunc")(trunc)
    __obj.asInstanceOf[Anon_AcoshAsinh]
  }
}

