package typings
package colorDashConvertLib.routeMod.routeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hwb extends js.Object {
  def ansi16(from: colorDashConvertLib.conversionsMod.HWB): colorDashConvertLib.conversionsMod.ANSI16
  def ansi256(from: colorDashConvertLib.conversionsMod.HWB): colorDashConvertLib.conversionsMod.ANSI256
  def apple(from: colorDashConvertLib.conversionsMod.HWB): colorDashConvertLib.conversionsMod.APPLE
  def cmyk(from: colorDashConvertLib.conversionsMod.HWB): colorDashConvertLib.conversionsMod.CMYK
  def gray(from: colorDashConvertLib.conversionsMod.HWB): colorDashConvertLib.conversionsMod.GRAY
  def hcg(from: colorDashConvertLib.conversionsMod.HWB): colorDashConvertLib.conversionsMod.HCG
  def hex(from: colorDashConvertLib.conversionsMod.HWB): colorDashConvertLib.conversionsMod.HEX
  def hsl(from: colorDashConvertLib.conversionsMod.HWB): colorDashConvertLib.conversionsMod.HSL
  def hsv(from: colorDashConvertLib.conversionsMod.HWB): colorDashConvertLib.conversionsMod.HSV
  def keyword(from: colorDashConvertLib.conversionsMod.HWB): colorDashConvertLib.conversionsMod.KEYWORD
  def lab(from: colorDashConvertLib.conversionsMod.HWB): colorDashConvertLib.conversionsMod.LAB
  def lch(from: colorDashConvertLib.conversionsMod.HWB): colorDashConvertLib.conversionsMod.LCH
  def rgb(from: colorDashConvertLib.conversionsMod.HWB): colorDashConvertLib.conversionsMod.RGB
  def xyz(from: colorDashConvertLib.conversionsMod.HWB): colorDashConvertLib.conversionsMod.XYZ
}

object hwb {
  @scala.inline
  def apply(
    ansi16: colorDashConvertLib.conversionsMod.HWB => colorDashConvertLib.conversionsMod.ANSI16,
    ansi256: colorDashConvertLib.conversionsMod.HWB => colorDashConvertLib.conversionsMod.ANSI256,
    apple: colorDashConvertLib.conversionsMod.HWB => colorDashConvertLib.conversionsMod.APPLE,
    cmyk: colorDashConvertLib.conversionsMod.HWB => colorDashConvertLib.conversionsMod.CMYK,
    gray: colorDashConvertLib.conversionsMod.HWB => colorDashConvertLib.conversionsMod.GRAY,
    hcg: colorDashConvertLib.conversionsMod.HWB => colorDashConvertLib.conversionsMod.HCG,
    hex: colorDashConvertLib.conversionsMod.HWB => colorDashConvertLib.conversionsMod.HEX,
    hsl: colorDashConvertLib.conversionsMod.HWB => colorDashConvertLib.conversionsMod.HSL,
    hsv: colorDashConvertLib.conversionsMod.HWB => colorDashConvertLib.conversionsMod.HSV,
    keyword: colorDashConvertLib.conversionsMod.HWB => colorDashConvertLib.conversionsMod.KEYWORD,
    lab: colorDashConvertLib.conversionsMod.HWB => colorDashConvertLib.conversionsMod.LAB,
    lch: colorDashConvertLib.conversionsMod.HWB => colorDashConvertLib.conversionsMod.LCH,
    rgb: colorDashConvertLib.conversionsMod.HWB => colorDashConvertLib.conversionsMod.RGB,
    xyz: colorDashConvertLib.conversionsMod.HWB => colorDashConvertLib.conversionsMod.XYZ
  ): hwb = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[hwb]
  }
}

