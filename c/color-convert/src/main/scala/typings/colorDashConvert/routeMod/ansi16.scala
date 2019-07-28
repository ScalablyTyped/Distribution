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

trait ansi16 extends js.Object {
  def ansi256(from: ANSI16): ANSI256
  def apple(from: ANSI16): APPLE
  def cmyk(from: ANSI16): CMYK
  def gray(from: ANSI16): GRAY
  def hcg(from: ANSI16): HCG
  def hex(from: ANSI16): HEX
  def hsl(from: ANSI16): HSL
  def hsv(from: ANSI16): HSV
  def hwb(from: ANSI16): HWB
  def keyword(from: ANSI16): KEYWORD
  def lab(from: ANSI16): LAB
  def lch(from: ANSI16): LCH
  def rgb(from: ANSI16): RGB
  def xyz(from: ANSI16): XYZ
}

object ansi16 {
  @scala.inline
  def apply(
    ansi256: ANSI16 => ANSI256,
    apple: ANSI16 => APPLE,
    cmyk: ANSI16 => CMYK,
    gray: ANSI16 => GRAY,
    hcg: ANSI16 => HCG,
    hex: ANSI16 => HEX,
    hsl: ANSI16 => HSL,
    hsv: ANSI16 => HSV,
    hwb: ANSI16 => HWB,
    keyword: ANSI16 => KEYWORD,
    lab: ANSI16 => LAB,
    lch: ANSI16 => LCH,
    rgb: ANSI16 => RGB,
    xyz: ANSI16 => XYZ
  ): ansi16 = {
    val __obj = js.Dynamic.literal(ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[ansi16]
  }
}

