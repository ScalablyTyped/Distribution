package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMax extends js.Object {
  /** Defaults to `100`. */
  var max: js.UndefOr[Double] = js.undefined
  var unit: js.UndefOr[String] = js.undefined
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object AnonMax {
  @scala.inline
  def apply(max: Int | Double = null, unit: String = null, values: js.Array[_] = null): AnonMax = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMax]
  }
}

