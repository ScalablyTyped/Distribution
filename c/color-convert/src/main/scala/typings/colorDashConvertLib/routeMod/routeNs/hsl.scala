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
    ansi16: js.Function1[colorDashConvertLib.conversionsMod.HSL, colorDashConvertLib.conversionsMod.ANSI16],
    ansi256: js.Function1[colorDashConvertLib.conversionsMod.HSL, colorDashConvertLib.conversionsMod.ANSI256],
    apple: js.Function1[colorDashConvertLib.conversionsMod.HSL, colorDashConvertLib.conversionsMod.APPLE],
    cmyk: js.Function1[colorDashConvertLib.conversionsMod.HSL, colorDashConvertLib.conversionsMod.CMYK],
    gray: js.Function1[colorDashConvertLib.conversionsMod.HSL, colorDashConvertLib.conversionsMod.GRAY],
    hcg: js.Function1[colorDashConvertLib.conversionsMod.HSL, colorDashConvertLib.conversionsMod.HCG],
    hex: js.Function1[colorDashConvertLib.conversionsMod.HSL, colorDashConvertLib.conversionsMod.HEX],
    hsv: js.Function1[colorDashConvertLib.conversionsMod.HSL, colorDashConvertLib.conversionsMod.HSV],
    hwb: js.Function1[colorDashConvertLib.conversionsMod.HSL, colorDashConvertLib.conversionsMod.HWB],
    keyword: js.Function1[colorDashConvertLib.conversionsMod.HSL, colorDashConvertLib.conversionsMod.KEYWORD],
    lab: js.Function1[colorDashConvertLib.conversionsMod.HSL, colorDashConvertLib.conversionsMod.LAB],
    lch: js.Function1[colorDashConvertLib.conversionsMod.HSL, colorDashConvertLib.conversionsMod.LCH],
    rgb: js.Function1[colorDashConvertLib.conversionsMod.HSL, colorDashConvertLib.conversionsMod.RGB],
    xyz: js.Function1[colorDashConvertLib.conversionsMod.HSL, colorDashConvertLib.conversionsMod.XYZ]
  ): hsl = {
    val __obj = js.Dynamic.literal(ansi16 = ansi16, ansi256 = ansi256, apple = apple, cmyk = cmyk, gray = gray, hcg = hcg, hex = hex, hsv = hsv, hwb = hwb, keyword = keyword, lab = lab, lch = lch, rgb = rgb, xyz = xyz)
  
    __obj.asInstanceOf[hsl]
  }
}

