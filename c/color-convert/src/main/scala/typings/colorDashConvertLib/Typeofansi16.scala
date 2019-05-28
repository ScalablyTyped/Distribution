package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofansi16 extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`1`
  val labels: js.Array[colorDashConvertLib.colorDashConvertLibStrings.ansi16]
  def rgb(ansi16: colorDashConvertLib.conversionsMod.ANSI16): colorDashConvertLib.conversionsMod.RGB
}

object Typeofansi16 {
  @scala.inline
  def apply(
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`1`,
    labels: js.Array[colorDashConvertLib.colorDashConvertLibStrings.ansi16],
    rgb: colorDashConvertLib.conversionsMod.ANSI16 => colorDashConvertLib.conversionsMod.RGB
  ): Typeofansi16 = {
    val __obj = js.Dynamic.literal(channels = channels, labels = labels, rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofansi16]
  }
}

