package typings.colorConvert.routeMod

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
import typings.colorConvert.conversionsMod.LCH_
import typings.colorConvert.conversionsMod.RGB_
import typings.colorConvert.conversionsMod.XYZ_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait rgb extends js.Object {
  def ansi16(from: RGB_): ANSI16_
  def ansi256(from: RGB_): ANSI256_
  def apple(from: RGB_): APPLE_
  def cmyk(from: RGB_): CMYK_
  def gray(from: RGB_): GRAY_
  def hcg(from: RGB_): HCG_
  def hex(from: RGB_): HEX_
  def hsl(from: RGB_): HSL_
  def hsv(from: RGB_): HSV_
  def hwb(from: RGB_): HWB_
  def keyword(from: RGB_): KEYWORD_
  def lab(from: RGB_): LAB_
  def lch(from: RGB_): LCH_
  def xyz(from: RGB_): XYZ_
}

object rgb {
  @scala.inline
  def apply(
    ansi16: RGB_ => ANSI16_,
    ansi256: RGB_ => ANSI256_,
    apple: RGB_ => APPLE_,
    cmyk: RGB_ => CMYK_,
    gray: RGB_ => GRAY_,
    hcg: RGB_ => HCG_,
    hex: RGB_ => HEX_,
    hsl: RGB_ => HSL_,
    hsv: RGB_ => HSV_,
    hwb: RGB_ => HWB_,
    keyword: RGB_ => KEYWORD_,
    lab: RGB_ => LAB_,
    lch: RGB_ => LCH_,
    xyz: RGB_ => XYZ_
  ): rgb = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[rgb]
  }
}

