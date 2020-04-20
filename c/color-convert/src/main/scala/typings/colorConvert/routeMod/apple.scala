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

trait apple extends js.Object {
  def ansi16(from: APPLE_): ANSI16_
  def ansi256(from: APPLE_): ANSI256_
  def cmyk(from: APPLE_): CMYK_
  def gray(from: APPLE_): GRAY_
  def hcg(from: APPLE_): HCG_
  def hex(from: APPLE_): HEX_
  def hsl(from: APPLE_): HSL_
  def hsv(from: APPLE_): HSV_
  def hwb(from: APPLE_): HWB_
  def keyword(from: APPLE_): KEYWORD_
  def lab(from: APPLE_): LAB_
  def lch(from: APPLE_): LCH_
  def rgb(from: APPLE_): RGB_
  def xyz(from: APPLE_): XYZ_
}

object apple {
  @scala.inline
  def apply(
    ansi16: APPLE_ => ANSI16_,
    ansi256: APPLE_ => ANSI256_,
    cmyk: APPLE_ => CMYK_,
    gray: APPLE_ => GRAY_,
    hcg: APPLE_ => HCG_,
    hex: APPLE_ => HEX_,
    hsl: APPLE_ => HSL_,
    hsv: APPLE_ => HSV_,
    hwb: APPLE_ => HWB_,
    keyword: APPLE_ => KEYWORD_,
    lab: APPLE_ => LAB_,
    lch: APPLE_ => LCH_,
    rgb: APPLE_ => RGB_,
    xyz: APPLE_ => XYZ_
  ): apple = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[apple]
  }
}

