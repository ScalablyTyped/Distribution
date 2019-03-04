package typings
package colorDashConvertLib.routeMod.routeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hsv extends js.Object {
  def ansi16(from: colorDashConvertLib.conversionsMod.HSV): colorDashConvertLib.conversionsMod.ANSI16
  def ansi256(from: colorDashConvertLib.conversionsMod.HSV): colorDashConvertLib.conversionsMod.ANSI256
  def apple(from: colorDashConvertLib.conversionsMod.HSV): colorDashConvertLib.conversionsMod.APPLE
  def cmyk(from: colorDashConvertLib.conversionsMod.HSV): colorDashConvertLib.conversionsMod.CMYK
  def gray(from: colorDashConvertLib.conversionsMod.HSV): colorDashConvertLib.conversionsMod.GRAY
  def hcg(from: colorDashConvertLib.conversionsMod.HSV): colorDashConvertLib.conversionsMod.HCG
  def hex(from: colorDashConvertLib.conversionsMod.HSV): colorDashConvertLib.conversionsMod.HEX
  def hsl(from: colorDashConvertLib.conversionsMod.HSV): colorDashConvertLib.conversionsMod.HSL
  def hwb(from: colorDashConvertLib.conversionsMod.HSV): colorDashConvertLib.conversionsMod.HWB
  def keyword(from: colorDashConvertLib.conversionsMod.HSV): colorDashConvertLib.conversionsMod.KEYWORD
  def lab(from: colorDashConvertLib.conversionsMod.HSV): colorDashConvertLib.conversionsMod.LAB
  def lch(from: colorDashConvertLib.conversionsMod.HSV): colorDashConvertLib.conversionsMod.LCH
  def rgb(from: colorDashConvertLib.conversionsMod.HSV): colorDashConvertLib.conversionsMod.RGB
  def xyz(from: colorDashConvertLib.conversionsMod.HSV): colorDashConvertLib.conversionsMod.XYZ
}

object hsv {
  @scala.inline
  def apply(
    ansi16: js.Function1[colorDashConvertLib.conversionsMod.HSV, colorDashConvertLib.conversionsMod.ANSI16],
    ansi256: js.Function1[colorDashConvertLib.conversionsMod.HSV, colorDashConvertLib.conversionsMod.ANSI256],
    apple: js.Function1[colorDashConvertLib.conversionsMod.HSV, colorDashConvertLib.conversionsMod.APPLE],
    cmyk: js.Function1[colorDashConvertLib.conversionsMod.HSV, colorDashConvertLib.conversionsMod.CMYK],
    gray: js.Function1[colorDashConvertLib.conversionsMod.HSV, colorDashConvertLib.conversionsMod.GRAY],
    hcg: js.Function1[colorDashConvertLib.conversionsMod.HSV, colorDashConvertLib.conversionsMod.HCG],
    hex: js.Function1[colorDashConvertLib.conversionsMod.HSV, colorDashConvertLib.conversionsMod.HEX],
    hsl: js.Function1[colorDashConvertLib.conversionsMod.HSV, colorDashConvertLib.conversionsMod.HSL],
    hwb: js.Function1[colorDashConvertLib.conversionsMod.HSV, colorDashConvertLib.conversionsMod.HWB],
    keyword: js.Function1[colorDashConvertLib.conversionsMod.HSV, colorDashConvertLib.conversionsMod.KEYWORD],
    lab: js.Function1[colorDashConvertLib.conversionsMod.HSV, colorDashConvertLib.conversionsMod.LAB],
    lch: js.Function1[colorDashConvertLib.conversionsMod.HSV, colorDashConvertLib.conversionsMod.LCH],
    rgb: js.Function1[colorDashConvertLib.conversionsMod.HSV, colorDashConvertLib.conversionsMod.RGB],
    xyz: js.Function1[colorDashConvertLib.conversionsMod.HSV, colorDashConvertLib.conversionsMod.XYZ]
  ): hsv = {
    val __obj = js.Dynamic.literal(ansi16 = ansi16, ansi256 = ansi256, apple = apple, cmyk = cmyk, gray = gray, hcg = hcg, hex = hex, hsl = hsl, hwb = hwb, keyword = keyword, lab = lab, lch = lch, rgb = rgb, xyz = xyz)
  
    __obj.asInstanceOf[hsv]
  }
}

