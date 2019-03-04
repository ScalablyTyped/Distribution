package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_3 extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`
  val labels: colorDashConvertLib.colorDashConvertLibStrings.rgb
  def ansi16(rgb: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.ANSI16
  def ansi256(rgb: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.ANSI256
  def apple(rgb: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.APPLE
  def cmyk(rgb: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.CMYK
  def gray(rgb: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.GRAY
  def hcg(rgb: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.HCG
  def hex(rgb: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.HEX
  def hsl(rgb: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.HSL
  def hsv(rgb: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.HSV
  def hwb(rgb: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.HWB
  def keyword(rgb: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.KEYWORD
  def lab(rgb: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.LAB
  def xyz(rgb: colorDashConvertLib.conversionsMod.RGB): colorDashConvertLib.conversionsMod.XYZ
}

object Anon_3 {
  @scala.inline
  def apply(
    ansi16: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.ANSI16],
    ansi256: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.ANSI256],
    apple: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.APPLE],
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`,
    cmyk: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.CMYK],
    gray: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.GRAY],
    hcg: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.HCG],
    hex: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.HEX],
    hsl: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.HSL],
    hsv: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.HSV],
    hwb: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.HWB],
    keyword: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.KEYWORD],
    lab: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.LAB],
    labels: colorDashConvertLib.colorDashConvertLibStrings.rgb,
    xyz: js.Function1[colorDashConvertLib.conversionsMod.RGB, colorDashConvertLib.conversionsMod.XYZ]
  ): Anon_3 = {
    val __obj = js.Dynamic.literal(ansi16 = ansi16, ansi256 = ansi256, apple = apple, channels = channels, cmyk = cmyk, gray = gray, hcg = hcg, hex = hex, hsl = hsl, hsv = hsv, hwb = hwb, keyword = keyword, lab = lab, labels = labels, xyz = xyz)
  
    __obj.asInstanceOf[Anon_3]
  }
}

