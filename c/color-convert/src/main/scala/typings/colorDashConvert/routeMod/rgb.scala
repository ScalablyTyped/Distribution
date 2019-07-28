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

trait rgb extends js.Object {
  def ansi16(from: RGB): ANSI16
  def ansi256(from: RGB): ANSI256
  def apple(from: RGB): APPLE
  def cmyk(from: RGB): CMYK
  def gray(from: RGB): GRAY
  def hcg(from: RGB): HCG
  def hex(from: RGB): HEX
  def hsl(from: RGB): HSL
  def hsv(from: RGB): HSV
  def hwb(from: RGB): HWB
  def keyword(from: RGB): KEYWORD
  def lab(from: RGB): LAB
  def lch(from: RGB): LCH
  def xyz(from: RGB): XYZ
}

object rgb {
  @scala.inline
  def apply(
    ansi16: RGB => ANSI16,
    ansi256: RGB => ANSI256,
    apple: RGB => APPLE,
    cmyk: RGB => CMYK,
    gray: RGB => GRAY,
    hcg: RGB => HCG,
    hex: RGB => HEX,
    hsl: RGB => HSL,
    hsv: RGB => HSV,
    hwb: RGB => HWB,
    keyword: RGB => KEYWORD,
    lab: RGB => LAB,
    lch: RGB => LCH,
    xyz: RGB => XYZ
  ): rgb = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[rgb]
  }
}

