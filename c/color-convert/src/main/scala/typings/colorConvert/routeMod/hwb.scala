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

trait hwb extends js.Object {
  def ansi16(from: HWB_): ANSI16_
  def ansi256(from: HWB_): ANSI256_
  def apple(from: HWB_): APPLE_
  def cmyk(from: HWB_): CMYK_
  def gray(from: HWB_): GRAY_
  def hcg(from: HWB_): HCG_
  def hex(from: HWB_): HEX_
  def hsl(from: HWB_): HSL_
  def hsv(from: HWB_): HSV_
  def keyword(from: HWB_): KEYWORD_
  def lab(from: HWB_): LAB_
  def lch(from: HWB_): LCH_
  def rgb(from: HWB_): RGB_
  def xyz(from: HWB_): XYZ_
}

object hwb {
  @scala.inline
  def apply(
    ansi16: HWB_ => ANSI16_,
    ansi256: HWB_ => ANSI256_,
    apple: HWB_ => APPLE_,
    cmyk: HWB_ => CMYK_,
    gray: HWB_ => GRAY_,
    hcg: HWB_ => HCG_,
    hex: HWB_ => HEX_,
    hsl: HWB_ => HSL_,
    hsv: HWB_ => HSV_,
    keyword: HWB_ => KEYWORD_,
    lab: HWB_ => LAB_,
    lch: HWB_ => LCH_,
    rgb: HWB_ => RGB_,
    xyz: HWB_ => XYZ_
  ): hwb = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[hwb]
  }
}

