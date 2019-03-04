package typings
package colorDashConvertLib.routeMod.routeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ansi256 extends js.Object {
  def ansi16(from: colorDashConvertLib.conversionsMod.ANSI256): colorDashConvertLib.conversionsMod.ANSI16
  def apple(from: colorDashConvertLib.conversionsMod.ANSI256): colorDashConvertLib.conversionsMod.APPLE
  def cmyk(from: colorDashConvertLib.conversionsMod.ANSI256): colorDashConvertLib.conversionsMod.CMYK
  def gray(from: colorDashConvertLib.conversionsMod.ANSI256): colorDashConvertLib.conversionsMod.GRAY
  def hcg(from: colorDashConvertLib.conversionsMod.ANSI256): colorDashConvertLib.conversionsMod.HCG
  def hex(from: colorDashConvertLib.conversionsMod.ANSI256): colorDashConvertLib.conversionsMod.HEX
  def hsl(from: colorDashConvertLib.conversionsMod.ANSI256): colorDashConvertLib.conversionsMod.HSL
  def hsv(from: colorDashConvertLib.conversionsMod.ANSI256): colorDashConvertLib.conversionsMod.HSV
  def hwb(from: colorDashConvertLib.conversionsMod.ANSI256): colorDashConvertLib.conversionsMod.HWB
  def keyword(from: colorDashConvertLib.conversionsMod.ANSI256): colorDashConvertLib.conversionsMod.KEYWORD
  def lab(from: colorDashConvertLib.conversionsMod.ANSI256): colorDashConvertLib.conversionsMod.LAB
  def lch(from: colorDashConvertLib.conversionsMod.ANSI256): colorDashConvertLib.conversionsMod.LCH
  def rgb(from: colorDashConvertLib.conversionsMod.ANSI256): colorDashConvertLib.conversionsMod.RGB
  def xyz(from: colorDashConvertLib.conversionsMod.ANSI256): colorDashConvertLib.conversionsMod.XYZ
}

object ansi256 {
  @scala.inline
  def apply(
    ansi16: js.Function1[
      colorDashConvertLib.conversionsMod.ANSI256, 
      colorDashConvertLib.conversionsMod.ANSI16
    ],
    apple: js.Function1[
      colorDashConvertLib.conversionsMod.ANSI256, 
      colorDashConvertLib.conversionsMod.APPLE
    ],
    cmyk: js.Function1[
      colorDashConvertLib.conversionsMod.ANSI256, 
      colorDashConvertLib.conversionsMod.CMYK
    ],
    gray: js.Function1[
      colorDashConvertLib.conversionsMod.ANSI256, 
      colorDashConvertLib.conversionsMod.GRAY
    ],
    hcg: js.Function1[colorDashConvertLib.conversionsMod.ANSI256, colorDashConvertLib.conversionsMod.HCG],
    hex: js.Function1[colorDashConvertLib.conversionsMod.ANSI256, colorDashConvertLib.conversionsMod.HEX],
    hsl: js.Function1[colorDashConvertLib.conversionsMod.ANSI256, colorDashConvertLib.conversionsMod.HSL],
    hsv: js.Function1[colorDashConvertLib.conversionsMod.ANSI256, colorDashConvertLib.conversionsMod.HSV],
    hwb: js.Function1[colorDashConvertLib.conversionsMod.ANSI256, colorDashConvertLib.conversionsMod.HWB],
    keyword: js.Function1[
      colorDashConvertLib.conversionsMod.ANSI256, 
      colorDashConvertLib.conversionsMod.KEYWORD
    ],
    lab: js.Function1[colorDashConvertLib.conversionsMod.ANSI256, colorDashConvertLib.conversionsMod.LAB],
    lch: js.Function1[colorDashConvertLib.conversionsMod.ANSI256, colorDashConvertLib.conversionsMod.LCH],
    rgb: js.Function1[colorDashConvertLib.conversionsMod.ANSI256, colorDashConvertLib.conversionsMod.RGB],
    xyz: js.Function1[colorDashConvertLib.conversionsMod.ANSI256, colorDashConvertLib.conversionsMod.XYZ]
  ): ansi256 = {
    val __obj = js.Dynamic.literal(ansi16 = ansi16, apple = apple, cmyk = cmyk, gray = gray, hcg = hcg, hex = hex, hsl = hsl, hsv = hsv, hwb = hwb, keyword = keyword, lab = lab, lch = lch, rgb = rgb, xyz = xyz)
  
    __obj.asInstanceOf[ansi256]
  }
}

