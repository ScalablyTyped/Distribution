package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1Ansi16 extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`1`
  val labels: js.Array[colorDashConvertLib.colorDashConvertLibStrings.ansi16]
  def rgb(ansi16: colorDashConvertLib.conversionsMod.ANSI16): colorDashConvertLib.conversionsMod.RGB
}

object Anon_1Ansi16 {
  @scala.inline
  def apply(
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`1`,
    labels: js.Array[colorDashConvertLib.colorDashConvertLibStrings.ansi16],
    rgb: js.Function1[colorDashConvertLib.conversionsMod.ANSI16, colorDashConvertLib.conversionsMod.RGB]
  ): Anon_1Ansi16 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channels")(channels)
    __obj.updateDynamic("labels")(labels)
    __obj.updateDynamic("rgb")(rgb)
    __obj.asInstanceOf[Anon_1Ansi16]
  }
}

