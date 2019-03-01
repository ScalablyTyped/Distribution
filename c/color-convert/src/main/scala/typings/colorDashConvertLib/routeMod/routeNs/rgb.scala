package typings
package colorDashConvertLib.routeMod.routeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait rgb extends js.Object {
  def ansi16(from: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.ANSI16
  def ansi256(from: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.ANSI256
  def apple(from: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.APPLE
  def cmyk(from: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.CMYK
  def gray(from: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.GRAY
  def hcg(from: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.HCG
  def hex(from: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.HEX
  def hsl(from: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.HSL
  def hsv(from: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.HSV
  def hwb(from: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.HWB
  def keyword(from: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.KEYWORD
  def lab(from: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.LAB
  def lch(from: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.LCH
  def xyz(from: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.XYZ
}

object rgb {
  @scala.inline
  def apply(
    ansi16: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.ANSI16],
    ansi256: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.ANSI256],
    apple: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.APPLE],
    cmyk: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.CMYK],
    gray: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.GRAY],
    hcg: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.HCG],
    hex: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.HEX],
    hsl: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.HSL],
    hsv: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.HSV],
    hwb: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.HWB],
    keyword: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.KEYWORD],
    lab: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.LAB],
    lch: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.LCH],
    xyz: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.XYZ]
  ): rgb = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ansi16")(ansi16)
    __obj.updateDynamic("ansi256")(ansi256)
    __obj.updateDynamic("apple")(apple)
    __obj.updateDynamic("cmyk")(cmyk)
    __obj.updateDynamic("gray")(gray)
    __obj.updateDynamic("hcg")(hcg)
    __obj.updateDynamic("hex")(hex)
    __obj.updateDynamic("hsl")(hsl)
    __obj.updateDynamic("hsv")(hsv)
    __obj.updateDynamic("hwb")(hwb)
    __obj.updateDynamic("keyword")(keyword)
    __obj.updateDynamic("lab")(lab)
    __obj.updateDynamic("lch")(lch)
    __obj.updateDynamic("xyz")(xyz)
    __obj.asInstanceOf[rgb]
  }
}

