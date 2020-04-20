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

trait hcg extends js.Object {
  def ansi16(from: HCG_): ANSI16_
  def ansi256(from: HCG_): ANSI256_
  def apple(from: HCG_): APPLE_
  def cmyk(from: HCG_): CMYK_
  def gray(from: HCG_): GRAY_
  def hex(from: HCG_): HEX_
  def hsl(from: HCG_): HSL_
  def hsv(from: HCG_): HSV_
  def hwb(from: HCG_): HWB_
  def keyword(from: HCG_): KEYWORD_
  def lab(from: HCG_): LAB_
  def lch(from: HCG_): LCH_
  def rgb(from: HCG_): RGB_
  def xyz(from: HCG_): XYZ_
}

object hcg {
  @scala.inline
  def apply(
    ansi16: HCG_ => ANSI16_,
    ansi256: HCG_ => ANSI256_,
    apple: HCG_ => APPLE_,
    cmyk: HCG_ => CMYK_,
    gray: HCG_ => GRAY_,
    hex: HCG_ => HEX_,
    hsl: HCG_ => HSL_,
    hsv: HCG_ => HSV_,
    hwb: HCG_ => HWB_,
    keyword: HCG_ => KEYWORD_,
    lab: HCG_ => LAB_,
    lch: HCG_ => LCH_,
    rgb: HCG_ => RGB_,
    xyz: HCG_ => XYZ_
  ): hcg = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[hcg]
  }
}

