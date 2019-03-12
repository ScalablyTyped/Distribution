package typings
package colorDashConvertLib.routeMod.routeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hsl extends js.Object {
  def ansi16(from: colorDashConvertLib.conversionsMod.HSL): colorDashConvertLib.conversionsMod.ANSI16
  def ansi256(from: colorDashConvertLib.conversionsMod.HSL): colorDashConvertLib.conversionsMod.ANSI256
  def apple(from: colorDashConvertLib.conversionsMod.HSL): colorDashConvertLib.conversionsMod.APPLE
  def cmyk(from: colorDashConvertLib.conversionsMod.HSL): colorDashConvertLib.conversionsMod.CMYK
  def gray(from: colorDashConvertLib.conversionsMod.HSL): colorDashConvertLib.conversionsMod.GRAY
  def hcg(from: colorDashConvertLib.conversionsMod.HSL): colorDashConvertLib.conversionsMod.HCG
  def hex(from: colorDashConvertLib.conversionsMod.HSL): colorDashConvertLib.conversionsMod.HEX
  def hsv(from: colorDashConvertLib.conversionsMod.HSL): colorDashConvertLib.conversionsMod.HSV
  def hwb(from: colorDashConvertLib.conversionsMod.HSL): colorDashConvertLib.conversionsMod.HWB
  def keyword(from: colorDashConvertLib.conversionsMod.HSL): colorDashConvertLib.conversionsMod.KEYWORD
  def lab(from: colorDashConvertLib.conversionsMod.HSL): colorDashConvertLib.conversionsMod.LAB
  def lch(from: colorDashConvertLib.conversionsMod.HSL): colorDashConvertLib.conversionsMod.LCH
  def rgb(from: colorDashConvertLib.conversionsMod.HSL): colorDashConvertLib.conversionsMod.RGB
  def xyz(from: colorDashConvertLib.conversionsMod.HSL): colorDashConvertLib.conversionsMod.XYZ
}

object hsl {
  @scala.inline
  def apply(
    ansi16: colorDashConvertLib.conversionsMod.HSL => colorDashConvertLib.conversionsMod.ANSI16,
    ansi256: colorDashConvertLib.conversionsMod.HSL => colorDashConvertLib.conversionsMod.ANSI256,
    apple: colorDashConvertLib.conversionsMod.HSL => colorDashConvertLib.conversionsMod.APPLE,
    cmyk: colorDashConvertLib.conversionsMod.HSL => colorDashConvertLib.conversionsMod.CMYK,
    gray: colorDashConvertLib.conversionsMod.HSL => colorDashConvertLib.conversionsMod.GRAY,
    hcg: colorDashConvertLib.conversionsMod.HSL => colorDashConvertLib.conversionsMod.HCG,
    hex: colorDashConvertLib.conversionsMod.HSL => colorDashConvertLib.conversionsMod.HEX,
    hsv: colorDashConvertLib.conversionsMod.HSL => colorDashConvertLib.conversionsMod.HSV,
    hwb: colorDashConvertLib.conversionsMod.HSL => colorDashConvertLib.conversionsMod.HWB,
    keyword: colorDashConvertLib.conversionsMod.HSL => colorDashConvertLib.conversionsMod.KEYWORD,
    lab: colorDashConvertLib.conversionsMod.HSL => colorDashConvertLib.conversionsMod.LAB,
    lch: colorDashConvertLib.conversionsMod.HSL => colorDashConvertLib.conversionsMod.LCH,
    rgb: colorDashConvertLib.conversionsMod.HSL => colorDashConvertLib.conversionsMod.RGB,
    xyz: colorDashConvertLib.conversionsMod.HSL => colorDashConvertLib.conversionsMod.XYZ
  ): hsl = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[hsl]
  }
}

