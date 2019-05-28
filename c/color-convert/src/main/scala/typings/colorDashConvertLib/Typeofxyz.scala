package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofxyz extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`
  val labels: colorDashConvertLib.colorDashConvertLibStrings.xyz
  def lab(xyz: colorDashConvertLib.conversionsMod.XYZ): colorDashConvertLib.conversionsMod.LAB
  def rgb(xyz: colorDashConvertLib.conversionsMod.XYZ): colorDashConvertLib.conversionsMod.RGB
}

object Typeofxyz {
  @scala.inline
  def apply(
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`,
    lab: colorDashConvertLib.conversionsMod.XYZ => colorDashConvertLib.conversionsMod.LAB,
    labels: colorDashConvertLib.colorDashConvertLibStrings.xyz,
    rgb: colorDashConvertLib.conversionsMod.XYZ => colorDashConvertLib.conversionsMod.RGB
  ): Typeofxyz = {
    val __obj = js.Dynamic.literal(channels = channels, lab = js.Any.fromFunction1(lab), labels = labels, rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofxyz]
  }
}

