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

trait xyz extends js.Object {
  def ansi16(from: XYZ): ANSI16
  def ansi256(from: XYZ): ANSI256
  def apple(from: XYZ): APPLE
  def cmyk(from: XYZ): CMYK
  def gray(from: XYZ): GRAY
  def hcg(from: XYZ): HCG
  def hex(from: XYZ): HEX
  def hsl(from: XYZ): HSL
  def hsv(from: XYZ): HSV
  def hwb(from: XYZ): HWB
  def keyword(from: XYZ): KEYWORD
  def lab(from: XYZ): LAB
  def lch(from: XYZ): LCH
  def rgb(from: XYZ): RGB
}

object xyz {
  @scala.inline
  def apply(
    ansi16: XYZ => ANSI16,
    ansi256: XYZ => ANSI256,
    apple: XYZ => APPLE,
    cmyk: XYZ => CMYK,
    gray: XYZ => GRAY,
    hcg: XYZ => HCG,
    hex: XYZ => HEX,
    hsl: XYZ => HSL,
    hsv: XYZ => HSV,
    hwb: XYZ => HWB,
    keyword: XYZ => KEYWORD,
    lab: XYZ => LAB,
    lch: XYZ => LCH,
    rgb: XYZ => RGB
  ): xyz = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[xyz]
  }
}

