package typings
package bootstrapDashDatepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatepickerBeforeShowDayResponse extends DatepickerBeforeShowResponse {
  var content: js.UndefOr[java.lang.String] = js.undefined
}

object DatepickerBeforeShowDayResponse {
  @scala.inline
  def apply(
    classes: java.lang.String = null,
    content: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    tooltip: java.lang.String = null
  ): DatepickerBeforeShowDayResponse = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (content != null) __obj.updateDynamic("content")(content)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[DatepickerBeforeShowDayResponse]
  }
}

