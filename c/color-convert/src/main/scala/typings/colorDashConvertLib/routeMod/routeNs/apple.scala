package typings
package colorDashConvertLib.routeMod.routeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait apple extends js.Object {
  def ansi16(from: colorDashConvertLib.conversionsMod.APPLE): colorDashConvertLib.conversionsMod.ANSI16
  def ansi256(from: colorDashConvertLib.conversionsMod.APPLE): colorDashConvertLib.conversionsMod.ANSI256
  def cmyk(from: colorDashConvertLib.conversionsMod.APPLE): colorDashConvertLib.conversionsMod.CMYK
  def gray(from: colorDashConvertLib.conversionsMod.APPLE): colorDashConvertLib.conversionsMod.GRAY
  def hcg(from: colorDashConvertLib.conversionsMod.APPLE): colorDashConvertLib.conversionsMod.HCG
  def hex(from: colorDashConvertLib.conversionsMod.APPLE): colorDashConvertLib.conversionsMod.HEX
  def hsl(from: colorDashConvertLib.conversionsMod.APPLE): colorDashConvertLib.conversionsMod.HSL
  def hsv(from: colorDashConvertLib.conversionsMod.APPLE): colorDashConvertLib.conversionsMod.HSV
  def hwb(from: colorDashConvertLib.conversionsMod.APPLE): colorDashConvertLib.conversionsMod.HWB
  def keyword(from: colorDashConvertLib.conversionsMod.APPLE): colorDashConvertLib.conversionsMod.KEYWORD
  def lab(from: colorDashConvertLib.conversionsMod.APPLE): colorDashConvertLib.conversionsMod.LAB
  def lch(from: colorDashConvertLib.conversionsMod.APPLE): colorDashConvertLib.conversionsMod.LCH
  def rgb(from: colorDashConvertLib.conversionsMod.APPLE): colorDashConvertLib.conversionsMod.RGB
  def xyz(from: colorDashConvertLib.conversionsMod.APPLE): colorDashConvertLib.conversionsMod.XYZ
}

object apple {
  @scala.inline
  def apply(
    ansi16: js.Function1[
      colorDashConvertLib.conversionsMod.APPLE, 
      colorDashConvertLib.conversionsMod.ANSI16
    ],
    ansi256: js.Function1[
      colorDashConvertLib.conversionsMod.APPLE, 
      colorDashConvertLib.conversionsMod.ANSI256
    ],
    cmyk: js.Function1[colorDashConvertLib.conversionsMod.APPLE, colorDashConvertLib.conversionsMod.CMYK],
    gray: js.Function1[colorDashConvertLib.conversionsMod.APPLE, colorDashConvertLib.conversionsMod.GRAY],
    hcg: js.Function1[colorDashConvertLib.conversionsMod.APPLE, colorDashConvertLib.conversionsMod.HCG],
    hex: js.Function1[colorDashConvertLib.conversionsMod.APPLE, colorDashConvertLib.conversionsMod.HEX],
    hsl: js.Function1[colorDashConvertLib.conversionsMod.APPLE, colorDashConvertLib.conversionsMod.HSL],
    hsv: js.Function1[colorDashConvertLib.conversionsMod.APPLE, colorDashConvertLib.conversionsMod.HSV],
    hwb: js.Function1[colorDashConvertLib.conversionsMod.APPLE, colorDashConvertLib.conversionsMod.HWB],
    keyword: js.Function1[
      colorDashConvertLib.conversionsMod.APPLE, 
      colorDashConvertLib.conversionsMod.KEYWORD
    ],
    lab: js.Function1[colorDashConvertLib.conversionsMod.APPLE, colorDashConvertLib.conversionsMod.LAB],
    lch: js.Function1[colorDashConvertLib.conversionsMod.APPLE, colorDashConvertLib.conversionsMod.LCH],
    rgb: js.Function1[colorDashConvertLib.conversionsMod.APPLE, colorDashConvertLib.conversionsMod.RGB],
    xyz: js.Function1[colorDashConvertLib.conversionsMod.APPLE, colorDashConvertLib.conversionsMod.XYZ]
  ): apple = {
    val __obj = js.Dynamic.literal(ansi16 = ansi16, ansi256 = ansi256, cmyk = cmyk, gray = gray, hcg = hcg, hex = hex, hsl = hsl, hsv = hsv, hwb = hwb, keyword = keyword, lab = lab, lch = lch, rgb = rgb, xyz = xyz)
  
    __obj.asInstanceOf[apple]
  }
}

