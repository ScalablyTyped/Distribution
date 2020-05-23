package typings.blueprintjsDatetime.datePickerMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePickerState extends js.Object {
  var displayMonth: Double
  var displayYear: Double
  var selectedDay: Double | Null
  var selectedShortcutIndex: js.UndefOr[Double] = js.undefined
  var value: Date | Null
}

object IDatePickerState {
  @scala.inline
  def apply(
    displayMonth: Double,
    displayYear: Double,
    selectedDay: Double = null.asInstanceOf[Double],
    selectedShortcutIndex: js.UndefOr[Double] = js.undefined,
    value: Date = null
  ): IDatePickerState = {
    val __obj = js.Dynamic.literal(displayMonth = displayMonth.asInstanceOf[js.Any], displayYear = displayYear.asInstanceOf[js.Any], selectedDay = selectedDay.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedShortcutIndex)) __obj.updateDynamic("selectedShortcutIndex")(selectedShortcutIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerState]
  }
}

