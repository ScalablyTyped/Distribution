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

trait apple extends js.Object {
  def ansi16(from: APPLE): ANSI16
  def ansi256(from: APPLE): ANSI256
  def cmyk(from: APPLE): CMYK
  def gray(from: APPLE): GRAY
  def hcg(from: APPLE): HCG
  def hex(from: APPLE): HEX
  def hsl(from: APPLE): HSL
  def hsv(from: APPLE): HSV
  def hwb(from: APPLE): HWB
  def keyword(from: APPLE): KEYWORD
  def lab(from: APPLE): LAB
  def lch(from: APPLE): LCH
  def rgb(from: APPLE): RGB
  def xyz(from: APPLE): XYZ
}

object apple {
  @scala.inline
  def apply(
    ansi16: APPLE => ANSI16,
    ansi256: APPLE => ANSI256,
    cmyk: APPLE => CMYK,
    gray: APPLE => GRAY,
    hcg: APPLE => HCG,
    hex: APPLE => HEX,
    hsl: APPLE => HSL,
    hsv: APPLE => HSV,
    hwb: APPLE => HWB,
    keyword: APPLE => KEYWORD,
    lab: APPLE => LAB,
    lch: APPLE => LCH,
    rgb: APPLE => RGB,
    xyz: APPLE => XYZ
  ): apple = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[apple]
  }
}

