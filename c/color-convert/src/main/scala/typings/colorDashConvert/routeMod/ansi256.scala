package typings.colorDashConvert.routeMod

import typings.colorDashConvert.conversionsMod.ANSI16
import typings.colorDashConvert.conversionsMod.ANSI256
import typings.colorDashConvert.conversionsMod.APPLE
import typings.colorDashConvert.conversionsMod.CMYK
import typings.colorDashConvert.conversionsMod.GRAY
import typings.colorDashConvert.conversionsMod.HCG
import typings.colorDashConvert.conversionsMod.HEX
import typings.colorDashConvert.conversionsMod.HSL
import typings.colorDashConvert.conversionsMod.HSV
import typings.colorDashConvert.conversionsMod.HWB
import typings.colorDashConvert.conversionsMod.KEYWORD
import typings.colorDashConvert.conversionsMod.LAB
import typings.colorDashConvert.conversionsMod.LCH
import typings.colorDashConvert.conversionsMod.RGB
import typings.colorDashConvert.conversionsMod.XYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ansi256 extends js.Object {
  def ansi16(from: ANSI256): ANSI16
  def apple(from: ANSI256): APPLE
  def cmyk(from: ANSI256): CMYK
  def gray(from: ANSI256): GRAY
  def hcg(from: ANSI256): HCG
  def hex(from: ANSI256): HEX
  def hsl(from: ANSI256): HSL
  def hsv(from: ANSI256): HSV
  def hwb(from: ANSI256): HWB
  def keyword(from: ANSI256): KEYWORD
  def lab(from: ANSI256): LAB
  def lch(from: ANSI256): LCH
  def rgb(from: ANSI256): RGB
  def xyz(from: ANSI256): XYZ
}

object ansi256 {
  @scala.inline
  def apply(
    ansi16: ANSI256 => ANSI16,
    apple: ANSI256 => APPLE,
    cmyk: ANSI256 => CMYK,
    gray: ANSI256 => GRAY,
    hcg: ANSI256 => HCG,
    hex: ANSI256 => HEX,
    hsl: ANSI256 => HSL,
    hsv: ANSI256 => HSV,
    hwb: ANSI256 => HWB,
    keyword: ANSI256 => KEYWORD,
    lab: ANSI256 => LAB,
    lch: ANSI256 => LCH,
    rgb: ANSI256 => RGB,
    xyz: ANSI256 => XYZ
  ): ansi256 = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[ansi256]
  }
}

