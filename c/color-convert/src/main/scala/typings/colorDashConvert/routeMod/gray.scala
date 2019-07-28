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

trait gray extends js.Object {
  def ansi16(from: GRAY): ANSI16
  def ansi256(from: GRAY): ANSI256
  def apple(from: GRAY): APPLE
  def cmyk(from: GRAY): CMYK
  def hcg(from: GRAY): HCG
  def hex(from: GRAY): HEX
  def hsl(from: GRAY): HSL
  def hsv(from: GRAY): HSV
  def hwb(from: GRAY): HWB
  def keyword(from: GRAY): KEYWORD
  def lab(from: GRAY): LAB
  def lch(from: GRAY): LCH
  def rgb(from: GRAY): RGB
  def xyz(from: GRAY): XYZ
}

object gray {
  @scala.inline
  def apply(
    ansi16: GRAY => ANSI16,
    ansi256: GRAY => ANSI256,
    apple: GRAY => APPLE,
    cmyk: GRAY => CMYK,
    hcg: GRAY => HCG,
    hex: GRAY => HEX,
    hsl: GRAY => HSL,
    hsv: GRAY => HSV,
    hwb: GRAY => HWB,
    keyword: GRAY => KEYWORD,
    lab: GRAY => LAB,
    lch: GRAY => LCH,
    rgb: GRAY => RGB,
    xyz: GRAY => XYZ
  ): gray = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[gray]
  }
}

