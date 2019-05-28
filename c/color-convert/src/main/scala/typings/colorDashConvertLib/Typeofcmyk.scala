package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcmyk extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`4`
  val labels: colorDashConvertLib.colorDashConvertLibStrings.cmyk
  def rgb(cmyk: colorDashConvertLib.conversionsMod.CMYK): colorDashConvertLib.conversionsMod.RGB
}

object Typeofcmyk {
  @scala.inline
  def apply(
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`4`,
    labels: colorDashConvertLib.colorDashConvertLibStrings.cmyk,
    rgb: colorDashConvertLib.conversionsMod.CMYK => colorDashConvertLib.conversionsMod.RGB
  ): Typeofcmyk = {
    val __obj = js.Dynamic.literal(channels = channels, labels = labels, rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofcmyk]
  }
}

