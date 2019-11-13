package typings.atBlueprintjsDatetime.libEsmDatePickerMod

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
    selectedDay: Int | Double = null,
    selectedShortcutIndex: Int | Double = null,
    value: Date = null
  ): IDatePickerState = {
    val __obj = js.Dynamic.literal(displayMonth = displayMonth, displayYear = displayYear)
    if (selectedDay != null) __obj.updateDynamic("selectedDay")(selectedDay.asInstanceOf[js.Any])
    if (selectedShortcutIndex != null) __obj.updateDynamic("selectedShortcutIndex")(selectedShortcutIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IDatePickerState]
  }
}

