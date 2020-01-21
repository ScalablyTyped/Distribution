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

trait ansi16 extends js.Object {
  def ansi256(from: ANSI16_): ANSI256_
  def apple(from: ANSI16_): APPLE_
  def cmyk(from: ANSI16_): CMYK_
  def gray(from: ANSI16_): GRAY_
  def hcg(from: ANSI16_): HCG_
  def hex(from: ANSI16_): HEX_
  def hsl(from: ANSI16_): HSL_
  def hsv(from: ANSI16_): HSV_
  def hwb(from: ANSI16_): HWB_
  def keyword(from: ANSI16_): KEYWORD_
  def lab(from: ANSI16_): LAB_
  def lch(from: ANSI16_): LCH_
  def rgb(from: ANSI16_): RGB_
  def xyz(from: ANSI16_): XYZ_
}

object ansi16 {
  @scala.inline
  def apply(
    ansi256: ANSI16_ => ANSI256_,
    apple: ANSI16_ => APPLE_,
    cmyk: ANSI16_ => CMYK_,
    gray: ANSI16_ => GRAY_,
    hcg: ANSI16_ => HCG_,
    hex: ANSI16_ => HEX_,
    hsl: ANSI16_ => HSL_,
    hsv: ANSI16_ => HSV_,
    hwb: ANSI16_ => HWB_,
    keyword: ANSI16_ => KEYWORD_,
    lab: ANSI16_ => LAB_,
    lch: ANSI16_ => LCH_,
    rgb: ANSI16_ => RGB_,
    xyz: ANSI16_ => XYZ_
  ): ansi16 = {
    val __obj = js.Dynamic.literal(ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[ansi16]
  }
}

