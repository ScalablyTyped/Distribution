package typings.baseui.datepickerMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarState extends js.Object {
  var date: Date
  var focused: Boolean
  var highlightedDate: Date
  var quickSelectId: js.UndefOr[String] = js.undefined
}

object CalendarState {
  @scala.inline
  def apply(date: Date, focused: Boolean, highlightedDate: Date, quickSelectId: String = null): CalendarState = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], highlightedDate = highlightedDate.asInstanceOf[js.Any])
    if (quickSelectId != null) __obj.updateDynamic("quickSelectId")(quickSelectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarState]
  }
}

