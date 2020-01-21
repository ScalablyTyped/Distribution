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

trait keyword extends js.Object {
  def ansi16(from: KEYWORD_): ANSI16_
  def ansi256(from: KEYWORD_): ANSI256_
  def apple(from: KEYWORD_): APPLE_
  def cmyk(from: KEYWORD_): CMYK_
  def gray(from: KEYWORD_): GRAY_
  def hcg(from: KEYWORD_): HCG_
  def hex(from: KEYWORD_): HEX_
  def hsl(from: KEYWORD_): HSL_
  def hsv(from: KEYWORD_): HSV_
  def hwb(from: KEYWORD_): HWB_
  def lab(from: KEYWORD_): LAB_
  def lch(from: KEYWORD_): LCH_
  def rgb(from: KEYWORD_): RGB_
  def xyz(from: KEYWORD_): XYZ_
}

object keyword {
  @scala.inline
  def apply(
    ansi16: KEYWORD_ => ANSI16_,
    ansi256: KEYWORD_ => ANSI256_,
    apple: KEYWORD_ => APPLE_,
    cmyk: KEYWORD_ => CMYK_,
    gray: KEYWORD_ => GRAY_,
    hcg: KEYWORD_ => HCG_,
    hex: KEYWORD_ => HEX_,
    hsl: KEYWORD_ => HSL_,
    hsv: KEYWORD_ => HSV_,
    hwb: KEYWORD_ => HWB_,
    lab: KEYWORD_ => LAB_,
    lch: KEYWORD_ => LCH_,
    rgb: KEYWORD_ => RGB_,
    xyz: KEYWORD_ => XYZ_
  ): keyword = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[keyword]
  }
}

