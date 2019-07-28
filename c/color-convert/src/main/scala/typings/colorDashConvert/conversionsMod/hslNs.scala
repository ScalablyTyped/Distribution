package typings.colorDashConvert.conversionsMod

import typings.colorDashConvert.colorDashConvertNumbers.`3`
import typings.colorDashConvert.colorDashConvertStrings.hsl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-convert/conversions", "hsl")
@js.native
object hslNs extends js.Object {
  val channels: `3` = js.native
  val labels: hsl = js.native
  def hcg(hsl: HSL): HCG = js.native
  def hsv(hsl: HSL): HSV = js.native
  def rgb(hsl: HSL): RGB = js.native
}

