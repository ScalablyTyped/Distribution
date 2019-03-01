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
    ansi16: js.Function1[colorDashConvertLib.conversionsMod.HCG, colorDashConvertLib.conversionsMod.ANSI16],
    ansi256: js.Function1[colorDashConvertLib.conversionsMod.HCG, colorDashConvertLib.conversionsMod.ANSI256],
    apple: js.Function1[colorDashConvertLib.conversionsMod.HCG, colorDashConvertLib.conversionsMod.APPLE],
    cmyk: js.Function1[colorDashConvertLib.conversionsMod.HCG, colorDashConvertLib.conversionsMod.CMYK],
    gray: js.Function1[colorDashConvertLib.conversionsMod.HCG, colorDashConvertLib.conversionsMod.GRAY],
    hex: js.Function1[colorDashConvertLib.conversionsMod.HCG, colorDashConvertLib.conversionsMod.HEX],
    hsl: js.Function1[colorDashConvertLib.conversionsMod.HCG, colorDashConvertLib.conversionsMod.HSL],
    hsv: js.Function1[colorDashConvertLib.conversionsMod.HCG, colorDashConvertLib.conversionsMod.HSV],
    hwb: js.Function1[colorDashConvertLib.conversionsMod.HCG, colorDashConvertLib.conversionsMod.HWB],
    keyword: js.Function1[colorDashConvertLib.conversionsMod.HCG, colorDashConvertLib.conversionsMod.KEYWORD],
    lab: js.Function1[colorDashConvertLib.conversionsMod.HCG, colorDashConvertLib.conversionsMod.LAB],
    lch: js.Function1[colorDashConvertLib.conversionsMod.HCG, colorDashConvertLib.conversionsMod.LCH],
    rgb: js.Function1[colorDashConvertLib.conversionsMod.HCG, colorDashConvertLib.conversionsMod.RGB],
    xyz: js.Function1[colorDashConvertLib.conversionsMod.HCG, colorDashConvertLib.conversionsMod.XYZ]
  ): hcg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ansi16")(ansi16)
    __obj.updateDynamic("ansi256")(ansi256)
    __obj.updateDynamic("apple")(apple)
    __obj.updateDynamic("cmyk")(cmyk)
    __obj.updateDynamic("gray")(gray)
    __obj.updateDynamic("hex")(hex)
    __obj.updateDynamic("hsl")(hsl)
    __obj.updateDynamic("hsv")(hsv)
    __obj.updateDynamic("hwb")(hwb)
    __obj.updateDynamic("keyword")(keyword)
    __obj.updateDynamic("lab")(lab)
    __obj.updateDynamic("lch")(lch)
    __obj.updateDynamic("rgb")(rgb)
    __obj.updateDynamic("xyz")(xyz)
    __obj.asInstanceOf[hcg]
  }
}

