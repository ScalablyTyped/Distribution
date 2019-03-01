package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHightfield extends js.Object {
  var elementSize: scala.Double
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  var minValue: js.UndefOr[scala.Double] = js.undefined
}

object IHightfield {
  @scala.inline
  def apply(
    elementSize: scala.Double,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null
  ): IHightfield = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("elementSize")(elementSize)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHightfield]
  }
}

