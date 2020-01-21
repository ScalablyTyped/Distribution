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

trait ansi256 extends js.Object {
  def ansi16(from: ANSI256_): ANSI16_
  def apple(from: ANSI256_): APPLE_
  def cmyk(from: ANSI256_): CMYK_
  def gray(from: ANSI256_): GRAY_
  def hcg(from: ANSI256_): HCG_
  def hex(from: ANSI256_): HEX_
  def hsl(from: ANSI256_): HSL_
  def hsv(from: ANSI256_): HSV_
  def hwb(from: ANSI256_): HWB_
  def keyword(from: ANSI256_): KEYWORD_
  def lab(from: ANSI256_): LAB_
  def lch(from: ANSI256_): LCH_
  def rgb(from: ANSI256_): RGB_
  def xyz(from: ANSI256_): XYZ_
}

object ansi256 {
  @scala.inline
  def apply(
    ansi16: ANSI256_ => ANSI16_,
    apple: ANSI256_ => APPLE_,
    cmyk: ANSI256_ => CMYK_,
    gray: ANSI256_ => GRAY_,
    hcg: ANSI256_ => HCG_,
    hex: ANSI256_ => HEX_,
    hsl: ANSI256_ => HSL_,
    hsv: ANSI256_ => HSV_,
    hwb: ANSI256_ => HWB_,
    keyword: ANSI256_ => KEYWORD_,
    lab: ANSI256_ => LAB_,
    lch: ANSI256_ => LCH_,
    rgb: ANSI256_ => RGB_,
    xyz: ANSI256_ => XYZ_
  ): ansi256 = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[ansi256]
  }
}

