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

trait gray extends js.Object {
  def ansi16(from: GRAY_): ANSI16_
  def ansi256(from: GRAY_): ANSI256_
  def apple(from: GRAY_): APPLE_
  def cmyk(from: GRAY_): CMYK_
  def hcg(from: GRAY_): HCG_
  def hex(from: GRAY_): HEX_
  def hsl(from: GRAY_): HSL_
  def hsv(from: GRAY_): HSV_
  def hwb(from: GRAY_): HWB_
  def keyword(from: GRAY_): KEYWORD_
  def lab(from: GRAY_): LAB_
  def lch(from: GRAY_): LCH_
  def rgb(from: GRAY_): RGB_
  def xyz(from: GRAY_): XYZ_
}

object gray {
  @scala.inline
  def apply(
    ansi16: GRAY_ => ANSI16_,
    ansi256: GRAY_ => ANSI256_,
    apple: GRAY_ => APPLE_,
    cmyk: GRAY_ => CMYK_,
    hcg: GRAY_ => HCG_,
    hex: GRAY_ => HEX_,
    hsl: GRAY_ => HSL_,
    hsv: GRAY_ => HSV_,
    hwb: GRAY_ => HWB_,
    keyword: GRAY_ => KEYWORD_,
    lab: GRAY_ => LAB_,
    lch: GRAY_ => LCH_,
    rgb: GRAY_ => RGB_,
    xyz: GRAY_ => XYZ_
  ): gray = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[gray]
  }
}

