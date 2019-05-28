package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrgb extends js.Object {
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

object Typeofrgb {
  @scala.inline
  def apply(
    ansi16: colorDashConvertLib.conversionsMod.RGB => colorDashConvertLib.conversionsMod.ANSI16,
    ansi256: colorDashConvertLib.conversionsMod.RGB => colorDashConvertLib.conversionsMod.ANSI256,
    apple: colorDashConvertLib.conversionsMod.RGB => colorDashConvertLib.conversionsMod.APPLE,
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`,
    cmyk: colorDashConvertLib.conversionsMod.RGB => colorDashConvertLib.conversionsMod.CMYK,
    gray: colorDashConvertLib.conversionsMod.RGB => colorDashConvertLib.conversionsMod.GRAY,
    hcg: colorDashConvertLib.conversionsMod.RGB => colorDashConvertLib.conversionsMod.HCG,
    hex: colorDashConvertLib.conversionsMod.RGB => colorDashConvertLib.conversionsMod.HEX,
    hsl: colorDashConvertLib.conversionsMod.RGB => colorDashConvertLib.conversionsMod.HSL,
    hsv: colorDashConvertLib.conversionsMod.RGB => colorDashConvertLib.conversionsMod.HSV,
    hwb: colorDashConvertLib.conversionsMod.RGB => colorDashConvertLib.conversionsMod.HWB,
    keyword: colorDashConvertLib.conversionsMod.RGB => colorDashConvertLib.conversionsMod.KEYWORD,
    lab: colorDashConvertLib.conversionsMod.RGB => colorDashConvertLib.conversionsMod.LAB,
    labels: colorDashConvertLib.colorDashConvertLibStrings.rgb,
    xyz: colorDashConvertLib.conversionsMod.RGB => colorDashConvertLib.conversionsMod.XYZ
  ): Typeofrgb = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), channels = channels, cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), labels = labels, xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[Typeofrgb]
  }
}

