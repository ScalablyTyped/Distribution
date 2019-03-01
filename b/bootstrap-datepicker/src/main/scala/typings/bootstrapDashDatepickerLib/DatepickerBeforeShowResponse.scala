package typings
package bootstrapDashDatepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatepickerBeforeShowResponse extends js.Object {
  var classes: js.UndefOr[java.lang.String] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
}

object DatepickerBeforeShowResponse {
  @scala.inline
  def apply(
    classes: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    tooltip: java.lang.String = null
  ): DatepickerBeforeShowResponse = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[DatepickerBeforeShowResponse]
  }
}

