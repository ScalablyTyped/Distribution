package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhex extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`1`
  val labels: js.Array[colorDashConvertLib.colorDashConvertLibStrings.hex]
  def rgb(hex: colorDashConvertLib.conversionsMod.HEX): colorDashConvertLib.conversionsMod.RGB
}

object Typeofhex {
  @scala.inline
  def apply(
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`1`,
    labels: js.Array[colorDashConvertLib.colorDashConvertLibStrings.hex],
    rgb: colorDashConvertLib.conversionsMod.HEX => colorDashConvertLib.conversionsMod.RGB
  ): Typeofhex = {
    val __obj = js.Dynamic.literal(channels = channels, labels = labels, rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofhex]
  }
}

