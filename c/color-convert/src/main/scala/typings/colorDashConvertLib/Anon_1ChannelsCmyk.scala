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

