package typings
package colorDashConvertLib.routeMod.routeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait lch extends js.Object {
  def ansi16(from: colorDashConvertLib.conversionsMod.LCH): colorDashConvertLib.conversionsMod.ANSI16
  def ansi256(from: colorDashConvertLib.conversionsMod.LCH): colorDashConvertLib.conversionsMod.ANSI256
  def apple(from: colorDashConvertLib.conversionsMod.LCH): colorDashConvertLib.conversionsMod.APPLE
  def cmyk(from: colorDashConvertLib.conversionsMod.LCH): colorDashConvertLib.conversionsMod.CMYK
  def gray(from: colorDashConvertLib.conversionsMod.LCH): colorDashConvertLib.conversionsMod.GRAY
  def hcg(from: colorDashConvertLib.conversionsMod.LCH): colorDashConvertLib.conversionsMod.HCG
  def hex(from: colorDashConvertLib.conversionsMod.LCH): colorDashConvertLib.conversionsMod.HEX
  def hsl(from: colorDashConvertLib.conversionsMod.LCH): colorDashConvertLib.conversionsMod.HSL
  def hsv(from: colorDashConvertLib.conversionsMod.LCH): colorDashConvertLib.conversionsMod.HSV
  def hwb(from: colorDashConvertLib.conversionsMod.LCH): colorDashConvertLib.conversionsMod.HWB
  def keyword(from: colorDashConvertLib.conversionsMod.LCH): colorDashConvertLib.conversionsMod.KEYWORD
  def lab(from: colorDashConvertLib.conversionsMod.LCH): colorDashConvertLib.conversionsMod.LAB
  def rgb(from: colorDashConvertLib.conversionsMod.LCH): colorDashConvertLib.conversionsMod.RGB
  def xyz(from: colorDashConvertLib.conversionsMod.LCH): colorDashConvertLib.conversionsMod.XYZ
}

object lch {
  @scala.inline
  def apply(
    ansi16: colorDashConvertLib.conversionsMod.LCH => colorDashConvertLib.conversionsMod.ANSI16,
    ansi256: colorDashConvertLib.conversionsMod.LCH => colorDashConvertLib.conversionsMod.ANSI256,
    apple: colorDashConvertLib.conversionsMod.LCH => colorDashConvertLib.conversionsMod.APPLE,
    cmyk: colorDashConvertLib.conversionsMod.LCH => colorDashConvertLib.conversionsMod.CMYK,
    gray: colorDashConvertLib.conversionsMod.LCH => colorDashConvertLib.conversionsMod.GRAY,
    hcg: colorDashConvertLib.conversionsMod.LCH => colorDashConvertLib.conversionsMod.HCG,
    hex: colorDashConvertLib.conversionsMod.LCH => colorDashConvertLib.conversionsMod.HEX,
    hsl: colorDashConvertLib.conversionsMod.LCH => colorDashConvertLib.conversionsMod.HSL,
    hsv: colorDashConvertLib.conversionsMod.LCH => colorDashConvertLib.conversionsMod.HSV,
    hwb: colorDashConvertLib.conversionsMod.LCH => colorDashConvertLib.conversionsMod.HWB,
    keyword: colorDashConvertLib.conversionsMod.LCH => colorDashConvertLib.conversionsMod.KEYWORD,
    lab: colorDashConvertLib.conversionsMod.LCH => colorDashConvertLib.conversionsMod.LAB,
    rgb: colorDashConvertLib.conversionsMod.LCH => colorDashConvertLib.conversionsMod.RGB,
    xyz: colorDashConvertLib.conversionsMod.LCH => colorDashConvertLib.conversionsMod.XYZ
  ): lch = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[lch]
  }
}

