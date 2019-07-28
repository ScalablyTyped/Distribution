package typings.colorDashConvert.conversionsMod

import typings.colorDashConvert.colorDashConvertNumbers.`3`
import typings.colorDashConvert.colorDashConvertStrings.hsv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-convert/conversions", "hsv")
@js.native
object hsvNs extends js.Object {
  val channels: `3` = js.native
  val labels: hsv = js.native
  def ansi16(hsv: HSV): ANSI16 = js.native
  def hcg(hsv: HSV): HCG = js.native
  def hsl(hsv: HSV): HSL = js.native
  def rgb(hsv: HSV): RGB = js.native
}

