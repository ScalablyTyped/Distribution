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

trait hsv extends js.Object {
  def ansi16(from: HSV_): ANSI16_
  def ansi256(from: HSV_): ANSI256_
  def apple(from: HSV_): APPLE_
  def cmyk(from: HSV_): CMYK_
  def gray(from: HSV_): GRAY_
  def hcg(from: HSV_): HCG_
  def hex(from: HSV_): HEX_
  def hsl(from: HSV_): HSL_
  def hwb(from: HSV_): HWB_
  def keyword(from: HSV_): KEYWORD_
  def lab(from: HSV_): LAB_
  def lch(from: HSV_): LCH_
  def rgb(from: HSV_): RGB_
  def xyz(from: HSV_): XYZ_
}

object hsv {
  @scala.inline
  def apply(
    ansi16: HSV_ => ANSI16_,
    ansi256: HSV_ => ANSI256_,
    apple: HSV_ => APPLE_,
    cmyk: HSV_ => CMYK_,
    gray: HSV_ => GRAY_,
    hcg: HSV_ => HCG_,
    hex: HSV_ => HEX_,
    hsl: HSV_ => HSL_,
    hwb: HSV_ => HWB_,
    keyword: HSV_ => KEYWORD_,
    lab: HSV_ => LAB_,
    lch: HSV_ => LCH_,
    rgb: HSV_ => RGB_,
    xyz: HSV_ => XYZ_
  ): hsv = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[hsv]
  }
}

