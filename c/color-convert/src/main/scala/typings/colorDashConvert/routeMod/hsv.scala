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

trait hsv extends js.Object {
  def ansi16(from: HSV): ANSI16
  def ansi256(from: HSV): ANSI256
  def apple(from: HSV): APPLE
  def cmyk(from: HSV): CMYK
  def gray(from: HSV): GRAY
  def hcg(from: HSV): HCG
  def hex(from: HSV): HEX
  def hsl(from: HSV): HSL
  def hwb(from: HSV): HWB
  def keyword(from: HSV): KEYWORD
  def lab(from: HSV): LAB
  def lch(from: HSV): LCH
  def rgb(from: HSV): RGB
  def xyz(from: HSV): XYZ
}

object hsv {
  @scala.inline
  def apply(
    ansi16: HSV => ANSI16,
    ansi256: HSV => ANSI256,
    apple: HSV => APPLE,
    cmyk: HSV => CMYK,
    gray: HSV => GRAY,
    hcg: HSV => HCG,
    hex: HSV => HEX,
    hsl: HSV => HSL,
    hwb: HSV => HWB,
    keyword: HSV => KEYWORD,
    lab: HSV => LAB,
    lch: HSV => LCH,
    rgb: HSV => RGB,
    xyz: HSV => XYZ
  ): hsv = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[hsv]
  }
}

