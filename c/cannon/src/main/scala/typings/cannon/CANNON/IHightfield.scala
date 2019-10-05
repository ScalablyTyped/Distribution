package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHightfield extends js.Object {
  var elementSize: Double
  var maxValue: js.UndefOr[Double] = js.undefined
  var minValue: js.UndefOr[Double] = js.undefined
}

object IHightfield {
  @scala.inline
  def apply(elementSize: Double, maxValue: Int | Double = null, minValue: Int | Double = null): IHightfield = {
    val __obj = js.Dynamic.literal(elementSize = elementSize)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHightfield]
  }
}

