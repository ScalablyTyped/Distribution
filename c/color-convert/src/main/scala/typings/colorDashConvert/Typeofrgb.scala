package typings.colorDashConvert

import typings.colorDashConvert.colorDashConvertNumbers.`3`
import typings.colorDashConvert.colorDashConvertStrings.rgb
import typings.colorDashConvert.conversionsMod.ANSI16
import typings.colorDashConvert.conversionsMod.ANSI256
import typings.colorDashConvert.conversionsMod.APPLE
import typings.colorDashConvert.conversionsMod.CMYK
import typings.colorDashConvert.conversionsMod.GRAY
import typings.colorDashConvert.conversionsMod.HCG
import typings.colorDashConvert.conversionsMod.HEX
import typings.colorDashConvert.conversionsMod.HSL
import typings.colorDashConvert.conversionsMod.HSV
import typings.colorDashConvert.conversionsMod.HWB
import typings.colorDashConvert.conversionsMod.KEYWORD
import typings.colorDashConvert.conversionsMod.LAB
import typings.colorDashConvert.conversionsMod.RGB
import typings.colorDashConvert.conversionsMod.XYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrgb extends js.Object {
  val channels: `3`
  val labels: rgb
  def ansi16(rgb: RGB): ANSI16
  def ansi256(rgb: RGB): ANSI256
  def apple(rgb: RGB): APPLE
  def cmyk(rgb: RGB): CMYK
  def gray(rgb: RGB): GRAY
  def hcg(rgb: RGB): HCG
  def hex(rgb: RGB): HEX
  def hsl(rgb: RGB): HSL
  def hsv(rgb: RGB): HSV
  def hwb(rgb: RGB): HWB
  def keyword(rgb: RGB): KEYWORD
  def lab(rgb: RGB): LAB
  def xyz(rgb: RGB): XYZ
}

object Typeofrgb {
  @scala.inline
  def apply(
    ansi16: RGB => ANSI16,
    ansi256: RGB => ANSI256,
    apple: RGB => APPLE,
    channels: `3`,
    cmyk: RGB => CMYK,
    gray: RGB => GRAY,
    hcg: RGB => HCG,
    hex: RGB => HEX,
    hsl: RGB => HSL,
    hsv: RGB => HSV,
    hwb: RGB => HWB,
    keyword: RGB => KEYWORD,
    lab: RGB => LAB,
    labels: rgb,
    xyz: RGB => XYZ
  ): Typeofrgb = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), channels = channels, cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), labels = labels, xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[Typeofrgb]
  }
}

