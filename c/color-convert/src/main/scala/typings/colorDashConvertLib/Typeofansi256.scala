package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofansi256 extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`1`
  val labels: js.Array[colorDashConvertLib.colorDashConvertLibStrings.ansi256]
  def rgb(ansi256: colorDashConvertLib.conversionsMod.ANSI256): colorDashConvertLib.conversionsMod.RGB
}

object Typeofansi256 {
  @scala.inline
  def apply(
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`1`,
    labels: js.Array[colorDashConvertLib.colorDashConvertLibStrings.ansi256],
    rgb: colorDashConvertLib.conversionsMod.ANSI256 => colorDashConvertLib.conversionsMod.RGB
  ): Typeofansi256 = {
    val __obj = js.Dynamic.literal(channels = channels, labels = labels, rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofansi256]
  }
}

