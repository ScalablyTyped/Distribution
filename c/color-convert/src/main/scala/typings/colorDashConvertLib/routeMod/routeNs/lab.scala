package typings
package colorDashConvertLib.routeMod.routeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait lab extends js.Object {
  def ansi16(from: colorDashConvertLib.conversionsMod.LAB): colorDashConvertLib.conversionsMod.ANSI16
  def ansi256(from: colorDashConvertLib.conversionsMod.LAB): colorDashConvertLib.conversionsMod.ANSI256
  def apple(from: colorDashConvertLib.conversionsMod.LAB): colorDashConvertLib.conversionsMod.APPLE
  def cmyk(from: colorDashConvertLib.conversionsMod.LAB): colorDashConvertLib.conversionsMod.CMYK
  def gray(from: colorDashConvertLib.conversionsMod.LAB): colorDashConvertLib.conversionsMod.GRAY
  def hcg(from: colorDashConvertLib.conversionsMod.LAB): colorDashConvertLib.conversionsMod.HCG
  def hex(from: colorDashConvertLib.conversionsMod.LAB): colorDashConvertLib.conversionsMod.HEX
  def hsl(from: colorDashConvertLib.conversionsMod.LAB): colorDashConvertLib.conversionsMod.HSL
  def hsv(from: colorDashConvertLib.conversionsMod.LAB): colorDashConvertLib.conversionsMod.HSV
  def hwb(from: colorDashConvertLib.conversionsMod.LAB): colorDashConvertLib.conversionsMod.HWB
  def keyword(from: colorDashConvertLib.conversionsMod.LAB): colorDashConvertLib.conversionsMod.KEYWORD
  def lch(from: colorDashConvertLib.conversionsMod.LAB): colorDashConvertLib.conversionsMod.LCH
  def rgb(from: colorDashConvertLib.conversionsMod.LAB): colorDashConvertLib.conversionsMod.RGB
  def xyz(from: colorDashConvertLib.conversionsMod.LAB): colorDashConvertLib.conversionsMod.XYZ
}

object lab {
  @scala.inline
  def apply(
    ansi16: colorDashConvertLib.conversionsMod.LAB => colorDashConvertLib.conversionsMod.ANSI16,
    ansi256: colorDashConvertLib.conversionsMod.LAB => colorDashConvertLib.conversionsMod.ANSI256,
    apple: colorDashConvertLib.conversionsMod.LAB => colorDashConvertLib.conversionsMod.APPLE,
    cmyk: colorDashConvertLib.conversionsMod.LAB => colorDashConvertLib.conversionsMod.CMYK,
    gray: colorDashConvertLib.conversionsMod.LAB => colorDashConvertLib.conversionsMod.GRAY,
    hcg: colorDashConvertLib.conversionsMod.LAB => colorDashConvertLib.conversionsMod.HCG,
    hex: colorDashConvertLib.conversionsMod.LAB => colorDashConvertLib.conversionsMod.HEX,
    hsl: colorDashConvertLib.conversionsMod.LAB => colorDashConvertLib.conversionsMod.HSL,
    hsv: colorDashConvertLib.conversionsMod.LAB => colorDashConvertLib.conversionsMod.HSV,
    hwb: colorDashConvertLib.conversionsMod.LAB => colorDashConvertLib.conversionsMod.HWB,
    keyword: colorDashConvertLib.conversionsMod.LAB => colorDashConvertLib.conversionsMod.KEYWORD,
    lch: colorDashConvertLib.conversionsMod.LAB => colorDashConvertLib.conversionsMod.LCH,
    rgb: colorDashConvertLib.conversionsMod.LAB => colorDashConvertLib.conversionsMod.RGB,
    xyz: colorDashConvertLib.conversionsMod.LAB => colorDashConvertLib.conversionsMod.XYZ
  ): lab = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[lab]
  }
}

