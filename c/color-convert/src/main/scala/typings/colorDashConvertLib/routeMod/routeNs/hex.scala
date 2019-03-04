package typings
package colorDashConvertLib.routeMod.routeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hex extends js.Object {
  def ansi16(from: colorDashConvertLib.conversionsMod.HEX): colorDashConvertLib.conversionsMod.ANSI16
  def ansi256(from: colorDashConvertLib.conversionsMod.HEX): colorDashConvertLib.conversionsMod.ANSI256
  def apple(from: colorDashConvertLib.conversionsMod.HEX): colorDashConvertLib.conversionsMod.APPLE
  def cmyk(from: colorDashConvertLib.conversionsMod.HEX): colorDashConvertLib.conversionsMod.CMYK
  def gray(from: colorDashConvertLib.conversionsMod.HEX): colorDashConvertLib.conversionsMod.GRAY
  def hcg(from: colorDashConvertLib.conversionsMod.HEX): colorDashConvertLib.conversionsMod.HCG
  def hsl(from: colorDashConvertLib.conversionsMod.HEX): colorDashConvertLib.conversionsMod.HSL
  def hsv(from: colorDashConvertLib.conversionsMod.HEX): colorDashConvertLib.conversionsMod.HSV
  def hwb(from: colorDashConvertLib.conversionsMod.HEX): colorDashConvertLib.conversionsMod.HWB
  def keyword(from: colorDashConvertLib.conversionsMod.HEX): colorDashConvertLib.conversionsMod.KEYWORD
  def lab(from: colorDashConvertLib.conversionsMod.HEX): colorDashConvertLib.conversionsMod.LAB
  def lch(from: colorDashConvertLib.conversionsMod.HEX): colorDashConvertLib.conversionsMod.LCH
  def rgb(from: colorDashConvertLib.conversionsMod.HEX): colorDashConvertLib.conversionsMod.RGB
  def xyz(from: colorDashConvertLib.conversionsMod.HEX): colorDashConvertLib.conversionsMod.XYZ
}

object hex {
  @scala.inline
  def apply(
    ansi16: js.Function1[colorDashConvertLib.conversionsMod.HEX, colorDashConvertLib.conversionsMod.ANSI16],
    ansi256: js.Function1[colorDashConvertLib.conversionsMod.HEX, colorDashConvertLib.conversionsMod.ANSI256],
    apple: js.Function1[colorDashConvertLib.conversionsMod.HEX, colorDashConvertLib.conversionsMod.APPLE],
    cmyk: js.Function1[colorDashConvertLib.conversionsMod.HEX, colorDashConvertLib.conversionsMod.CMYK],
    gray: js.Function1[colorDashConvertLib.conversionsMod.HEX, colorDashConvertLib.conversionsMod.GRAY],
    hcg: js.Function1[colorDashConvertLib.conversionsMod.HEX, colorDashConvertLib.conversionsMod.HCG],
    hsl: js.Function1[colorDashConvertLib.conversionsMod.HEX, colorDashConvertLib.conversionsMod.HSL],
    hsv: js.Function1[colorDashConvertLib.conversionsMod.HEX, colorDashConvertLib.conversionsMod.HSV],
    hwb: js.Function1[colorDashConvertLib.conversionsMod.HEX, colorDashConvertLib.conversionsMod.HWB],
    keyword: js.Function1[colorDashConvertLib.conversionsMod.HEX, colorDashConvertLib.conversionsMod.KEYWORD],
    lab: js.Function1[colorDashConvertLib.conversionsMod.HEX, colorDashConvertLib.conversionsMod.LAB],
    lch: js.Function1[colorDashConvertLib.conversionsMod.HEX, colorDashConvertLib.conversionsMod.LCH],
    rgb: js.Function1[colorDashConvertLib.conversionsMod.HEX, colorDashConvertLib.conversionsMod.RGB],
    xyz: js.Function1[colorDashConvertLib.conversionsMod.HEX, colorDashConvertLib.conversionsMod.XYZ]
  ): hex = {
    val __obj = js.Dynamic.literal(ansi16 = ansi16, ansi256 = ansi256, apple = apple, cmyk = cmyk, gray = gray, hcg = hcg, hsl = hsl, hsv = hsv, hwb = hwb, keyword = keyword, lab = lab, lch = lch, rgb = rgb, xyz = xyz)
  
    __obj.asInstanceOf[hex]
  }
}

