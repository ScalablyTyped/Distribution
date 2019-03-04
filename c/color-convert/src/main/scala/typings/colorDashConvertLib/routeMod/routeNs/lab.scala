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
    ansi16: js.Function1[colorDashConvertLib.conversionsMod.LAB, colorDashConvertLib.conversionsMod.ANSI16],
    ansi256: js.Function1[colorDashConvertLib.conversionsMod.LAB, colorDashConvertLib.conversionsMod.ANSI256],
    apple: js.Function1[colorDashConvertLib.conversionsMod.LAB, colorDashConvertLib.conversionsMod.APPLE],
    cmyk: js.Function1[colorDashConvertLib.conversionsMod.LAB, colorDashConvertLib.conversionsMod.CMYK],
    gray: js.Function1[colorDashConvertLib.conversionsMod.LAB, colorDashConvertLib.conversionsMod.GRAY],
    hcg: js.Function1[colorDashConvertLib.conversionsMod.LAB, colorDashConvertLib.conversionsMod.HCG],
    hex: js.Function1[colorDashConvertLib.conversionsMod.LAB, colorDashConvertLib.conversionsMod.HEX],
    hsl: js.Function1[colorDashConvertLib.conversionsMod.LAB, colorDashConvertLib.conversionsMod.HSL],
    hsv: js.Function1[colorDashConvertLib.conversionsMod.LAB, colorDashConvertLib.conversionsMod.HSV],
    hwb: js.Function1[colorDashConvertLib.conversionsMod.LAB, colorDashConvertLib.conversionsMod.HWB],
    keyword: js.Function1[colorDashConvertLib.conversionsMod.LAB, colorDashConvertLib.conversionsMod.KEYWORD],
    lch: js.Function1[colorDashConvertLib.conversionsMod.LAB, colorDashConvertLib.conversionsMod.LCH],
    rgb: js.Function1[colorDashConvertLib.conversionsMod.LAB, colorDashConvertLib.conversionsMod.RGB],
    xyz: js.Function1[colorDashConvertLib.conversionsMod.LAB, colorDashConvertLib.conversionsMod.XYZ]
  ): lab = {
    val __obj = js.Dynamic.literal(ansi16 = ansi16, ansi256 = ansi256, apple = apple, cmyk = cmyk, gray = gray, hcg = hcg, hex = hex, hsl = hsl, hsv = hsv, hwb = hwb, keyword = keyword, lch = lch, rgb = rgb, xyz = xyz)
  
    __obj.asInstanceOf[lab]
  }
}

