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

trait hex extends js.Object {
  def ansi16(from: HEX_): ANSI16_
  def ansi256(from: HEX_): ANSI256_
  def apple(from: HEX_): APPLE_
  def cmyk(from: HEX_): CMYK_
  def gray(from: HEX_): GRAY_
  def hcg(from: HEX_): HCG_
  def hsl(from: HEX_): HSL_
  def hsv(from: HEX_): HSV_
  def hwb(from: HEX_): HWB_
  def keyword(from: HEX_): KEYWORD_
  def lab(from: HEX_): LAB_
  def lch(from: HEX_): LCH_
  def rgb(from: HEX_): RGB_
  def xyz(from: HEX_): XYZ_
}

object hex {
  @scala.inline
  def apply(
    ansi16: HEX_ => ANSI16_,
    ansi256: HEX_ => ANSI256_,
    apple: HEX_ => APPLE_,
    cmyk: HEX_ => CMYK_,
    gray: HEX_ => GRAY_,
    hcg: HEX_ => HCG_,
    hsl: HEX_ => HSL_,
    hsv: HEX_ => HSV_,
    hwb: HEX_ => HWB_,
    keyword: HEX_ => KEYWORD_,
    lab: HEX_ => LAB_,
    lch: HEX_ => LCH_,
    rgb: HEX_ => RGB_,
    xyz: HEX_ => XYZ_
  ): hex = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[hex]
  }
}

