package typings.colorDashConvert.conversionsMod

import typings.colorDashConvert.colorDashConvertNumbers.`3`
import typings.colorDashConvert.colorDashConvertStrings.rgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-convert/conversions", "rgb")
@js.native
object rgbNs extends js.Object {
  val channels: `3` = js.native
  val labels: rgb = js.native
  def ansi16(rgb: RGB): ANSI16 = js.native
  def ansi256(rgb: RGB): ANSI256 = js.native
  def apple(rgb: RGB): APPLE = js.native
  def cmyk(rgb: RGB): CMYK = js.native
  def gray(rgb: RGB): GRAY = js.native
  def hcg(rgb: RGB): HCG = js.native
  def hex(rgb: RGB): HEX = js.native
  def hsl(rgb: RGB): HSL = js.native
  def hsv(rgb: RGB): HSV = js.native
  def hwb(rgb: RGB): HWB = js.native
  def keyword(rgb: RGB): KEYWORD = js.native
  def lab(rgb: RGB): LAB = js.native
  def xyz(rgb: RGB): XYZ = js.native
}

