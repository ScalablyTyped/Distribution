package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1 extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`1`
  val labels: js.Array[colorDashConvertLib.colorDashConvertLibStrings.hex]
  def rgb(hex: colorDashConvertLib.conversionsMod.HEX): colorDashConvertLib.conversionsMod.RGB
}

object Anon_1 {
  @scala.inline
  def apply(
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`1`,
    labels: js.Array[colorDashConvertLib.colorDashConvertLibStrings.hex],
    rgb: js.Function1[colorDashConvertLib.conversionsMod.HEX, colorDashConvertLib.conversionsMod.RGB]
  ): Anon_1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channels")(channels)
    __obj.updateDynamic("labels")(labels)
    __obj.updateDynamic("rgb")(rgb)
    __obj.asInstanceOf[Anon_1]
  }
}

