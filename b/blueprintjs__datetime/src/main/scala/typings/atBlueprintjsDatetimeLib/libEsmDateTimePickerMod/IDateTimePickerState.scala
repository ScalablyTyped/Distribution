package typings
package atBlueprintjsDatetimeLib.libEsmDateTimePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateTimePickerState extends js.Object {
  var dateValue: js.UndefOr[stdLib.Date] = js.undefined
  var timeValue: js.UndefOr[stdLib.Date] = js.undefined
}

object IDateTimePickerState {
  @scala.inline
  def apply(dateValue: stdLib.Date = null, timeValue: stdLib.Date = null): IDateTimePickerState = {
    val __obj = js.Dynamic.literal()
    if (dateValue != null) __obj.updateDynamic("dateValue")(dateValue)
    if (timeValue != null) __obj.updateDynamic("timeValue")(timeValue)
    __obj.asInstanceOf[IDateTimePickerState]
  }
}

