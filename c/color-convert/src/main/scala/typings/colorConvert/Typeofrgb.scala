package typings.colorConvert

import typings.colorConvert.colorConvertNumbers.`3`
import typings.colorConvert.colorConvertStrings.rgb
import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.HSL_
import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.HWB_
import typings.colorConvert.conversionsMod.KEYWORD_
import typings.colorConvert.conversionsMod.LAB_
import typings.colorConvert.conversionsMod.RGB_
import typings.colorConvert.conversionsMod.XYZ_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrgb extends js.Object {
  val channels: `3`
  val labels: rgb
  def ansi16(rgb: RGB_): ANSI16_
  def ansi256(rgb: RGB_): ANSI256_
  def apple(rgb: RGB_): APPLE_
  def cmyk(rgb: RGB_): CMYK_
  def gray(rgb: RGB_): GRAY_
  def hcg(rgb: RGB_): HCG_
  def hex(rgb: RGB_): HEX_
  def hsl(rgb: RGB_): HSL_
  def hsv(rgb: RGB_): HSV_
  def hwb(rgb: RGB_): HWB_
  def keyword(rgb: RGB_): KEYWORD_
  def lab(rgb: RGB_): LAB_
  def xyz(rgb: RGB_): XYZ_
}

object Typeofrgb {
  @scala.inline
  def apply(
    ansi16: RGB_ => ANSI16_,
    ansi256: RGB_ => ANSI256_,
    apple: RGB_ => APPLE_,
    channels: `3`,
    cmyk: RGB_ => CMYK_,
    gray: RGB_ => GRAY_,
    hcg: RGB_ => HCG_,
    hex: RGB_ => HEX_,
    hsl: RGB_ => HSL_,
    hsv: RGB_ => HSV_,
    hwb: RGB_ => HWB_,
    keyword: RGB_ => KEYWORD_,
    lab: RGB_ => LAB_,
    labels: rgb,
    xyz: RGB_ => XYZ_
  ): Typeofrgb = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), channels = channels.asInstanceOf[js.Any], cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), labels = labels.asInstanceOf[js.Any], xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[Typeofrgb]
  }
}

