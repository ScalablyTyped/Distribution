package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoflch extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`
  val labels: colorDashConvertLib.colorDashConvertLibStrings.lch
  def lab(lch: colorDashConvertLib.conversionsMod.LCH): colorDashConvertLib.conversionsMod.LAB
}

object Typeoflch {
  @scala.inline
  def apply(
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`,
    lab: colorDashConvertLib.conversionsMod.LCH => colorDashConvertLib.conversionsMod.LAB,
    labels: colorDashConvertLib.colorDashConvertLibStrings.lch
  ): Typeoflch = {
    val __obj = js.Dynamic.literal(channels = channels, lab = js.Any.fromFunction1(lab), labels = labels)
  
    __obj.asInstanceOf[Typeoflch]
  }
}

