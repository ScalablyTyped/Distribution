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

trait cmyk extends js.Object {
  def ansi16(from: CMYK): ANSI16
  def ansi256(from: CMYK): ANSI256
  def apple(from: CMYK): APPLE
  def gray(from: CMYK): GRAY
  def hcg(from: CMYK): HCG
  def hex(from: CMYK): HEX
  def hsl(from: CMYK): HSL
  def hsv(from: CMYK): HSV
  def hwb(from: CMYK): HWB
  def keyword(from: CMYK): KEYWORD
  def lab(from: CMYK): LAB
  def lch(from: CMYK): LCH
  def rgb(from: CMYK): RGB
  def xyz(from: CMYK): XYZ
}

object cmyk {
  @scala.inline
  def apply(
    ansi16: CMYK => ANSI16,
    ansi256: CMYK => ANSI256,
    apple: CMYK => APPLE,
    gray: CMYK => GRAY,
    hcg: CMYK => HCG,
    hex: CMYK => HEX,
    hsl: CMYK => HSL,
    hsv: CMYK => HSV,
    hwb: CMYK => HWB,
    keyword: CMYK => KEYWORD,
    lab: CMYK => LAB,
    lch: CMYK => LCH,
    rgb: CMYK => RGB,
    xyz: CMYK => XYZ
  ): cmyk = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[cmyk]
  }
}

