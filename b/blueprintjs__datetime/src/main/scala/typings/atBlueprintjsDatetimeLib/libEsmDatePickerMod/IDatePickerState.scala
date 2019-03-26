package typings
package atBlueprintjsDatetimeLib.libEsmDatePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePickerState extends js.Object {
  var displayMonth: scala.Double
  var displayYear: scala.Double
  var selectedDay: scala.Double | scala.Null
  var value: stdLib.Date | scala.Null
}

object IDatePickerState {
  @scala.inline
  def apply(
    displayMonth: scala.Double,
    displayYear: scala.Double,
    selectedDay: scala.Int | scala.Double = null,
    value: stdLib.Date = null
  ): IDatePickerState = {
    val __obj = js.Dynamic.literal(displayMonth = displayMonth, displayYear = displayYear)
    if (selectedDay != null) __obj.updateDynamic("selectedDay")(selectedDay.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IDatePickerState]
  }
}

