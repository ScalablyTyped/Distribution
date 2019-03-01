package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_4 extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`4`
  val labels: colorDashConvertLib.colorDashConvertLibStrings.cmyk
  def rgb(cmyk: colorDashConvertLib.conversionsMod.CMYK): colorDashConvertLib.conversionsMod.RGB
}

object Anon_4 {
  @scala.inline
  def apply(
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`4`,
    labels: colorDashConvertLib.colorDashConvertLibStrings.cmyk,
    rgb: js.Function1[colorDashConvertLib.conversionsMod.CMYK, colorDashConvertLib.conversionsMod.RGB]
  ): Anon_4 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channels")(channels)
    __obj.updateDynamic("labels")(labels)
    __obj.updateDynamic("rgb")(rgb)
    __obj.asInstanceOf[Anon_4]
  }
}

