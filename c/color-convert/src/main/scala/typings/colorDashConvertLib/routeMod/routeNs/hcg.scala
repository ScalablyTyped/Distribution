package typings
package colorDashConvertLib.routeMod.routeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hcg extends js.Object {
  def ansi16(from: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.ANSI16
  def ansi256(from: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.ANSI256
  def apple(from: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.APPLE
  def cmyk(from: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.CMYK
  def gray(from: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.GRAY
  def hex(from: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.HEX
  def hsl(from: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.HSL
  def hsv(from: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.HSV
  def hwb(from: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.HWB
  def keyword(from: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.KEYWORD
  def lab(from: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.LAB
  def lch(from: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.LCH
  def rgb(from: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.RGB
  def xyz(from: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.XYZ
}

object hcg {
  @scala.inline
  def apply(
    ansi16: colorDashConvertLib.conversionsMod.HCG => colorDashConvertLib.conversionsMod.ANSI16,
    ansi256: colorDashConvertLib.conversionsMod.HCG => colorDashConvertLib.conversionsMod.ANSI256,
    apple: colorDashConvertLib.conversionsMod.HCG => colorDashConvertLib.conversionsMod.APPLE,
    cmyk: colorDashConvertLib.conversionsMod.HCG => colorDashConvertLib.conversionsMod.CMYK,
    gray: colorDashConvertLib.conversionsMod.HCG => colorDashConvertLib.conversionsMod.GRAY,
    hex: colorDashConvertLib.conversionsMod.HCG => colorDashConvertLib.conversionsMod.HEX,
    hsl: colorDashConvertLib.conversionsMod.HCG => colorDashConvertLib.conversionsMod.HSL,
    hsv: colorDashConvertLib.conversionsMod.HCG => colorDashConvertLib.conversionsMod.HSV,
    hwb: colorDashConvertLib.conversionsMod.HCG => colorDashConvertLib.conversionsMod.HWB,
    keyword: colorDashConvertLib.conversionsMod.HCG => colorDashConvertLib.conversionsMod.KEYWORD,
    lab: colorDashConvertLib.conversionsMod.HCG => colorDashConvertLib.conversionsMod.LAB,
    lch: colorDashConvertLib.conversionsMod.HCG => colorDashConvertLib.conversionsMod.LCH,
    rgb: colorDashConvertLib.conversionsMod.HCG => colorDashConvertLib.conversionsMod.RGB,
    xyz: colorDashConvertLib.conversionsMod.HCG => colorDashConvertLib.conversionsMod.XYZ
  ): hcg = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[hcg]
  }
}

