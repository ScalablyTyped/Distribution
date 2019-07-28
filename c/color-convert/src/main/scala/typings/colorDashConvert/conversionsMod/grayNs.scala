package typings.colorDashConvert.conversionsMod

import typings.colorDashConvert.colorDashConvertNumbers.`1`
import typings.colorDashConvert.colorDashConvertStrings.gray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-convert/conversions", "gray")
@js.native
object grayNs extends js.Object {
  val channels: `1` = js.native
  val labels: js.Array[gray] = js.native
  def cmyk(gray: GRAY): CMYK = js.native
  def hex(gray: GRAY): HEX = js.native
  def hsl(gray: GRAY): HSL = js.native
  def hsv(gray: GRAY): HSV = js.native
  def hwb(gray: GRAY): HWB = js.native
  def lab(gray: GRAY): LAB = js.native
  def rgb(gray: GRAY): RGB = js.native
}

