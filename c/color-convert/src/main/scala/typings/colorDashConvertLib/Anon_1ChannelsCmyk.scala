package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1ChannelsCmyk extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`1`
  val labels: js.Array[colorDashConvertLib.colorDashConvertLibStrings.gray]
  def cmyk(gray: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.CMYK
  def hex(gray: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.HEX
  def hsl(gray: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.HSL
  def hsv(gray: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.HSV
  def hwb(gray: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.HWB
  def lab(gray: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.LAB
  def rgb(gray: colorDashConvertLib.conversionsMod.GRAY): colorDashConvertLib.conversionsMod.RGB
}

object Anon_1ChannelsCmyk {
  @scala.inline
  def apply(
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`1`,
    cmyk: colorDashConvertLib.conversionsMod.GRAY => colorDashConvertLib.conversionsMod.CMYK,
    hex: colorDashConvertLib.conversionsMod.GRAY => colorDashConvertLib.conversionsMod.HEX,
    hsl: colorDashConvertLib.conversionsMod.GRAY => colorDashConvertLib.conversionsMod.HSL,
    hsv: colorDashConvertLib.conversionsMod.GRAY => colorDashConvertLib.conversionsMod.HSV,
    hwb: colorDashConvertLib.conversionsMod.GRAY => colorDashConvertLib.conversionsMod.HWB,
    lab: colorDashConvertLib.conversionsMod.GRAY => colorDashConvertLib.conversionsMod.LAB,
    labels: js.Array[colorDashConvertLib.colorDashConvertLibStrings.gray],
    rgb: colorDashConvertLib.conversionsMod.GRAY => colorDashConvertLib.conversionsMod.RGB
  ): Anon_1ChannelsCmyk = {
    val __obj = js.Dynamic.literal(channels = channels, cmyk = js.Any.fromFunction1(cmyk), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), lab = js.Any.fromFunction1(lab), labels = labels, rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Anon_1ChannelsCmyk]
  }
}

