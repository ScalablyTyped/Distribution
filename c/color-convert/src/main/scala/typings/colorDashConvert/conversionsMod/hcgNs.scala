package typings.colorDashConvert.conversionsMod

import typings.colorDashConvert.colorDashConvertNumbers.`3`
import typings.colorDashConvert.colorDashConvertStrings.c
import typings.colorDashConvert.colorDashConvertStrings.g
import typings.colorDashConvert.colorDashConvertStrings.h
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-convert/conversions", "hcg")
@js.native
object hcgNs extends js.Object {
  val channels: `3` = js.native
  val labels: js.Tuple3[h, c, g] = js.native
  def hsl(hcg: HCG): HSL = js.native
  def hsv(hcg: HCG): HSV = js.native
  def hwb(hcg: HCG): HWB = js.native
  def rgb(hcg: HCG): RGB = js.native
}

