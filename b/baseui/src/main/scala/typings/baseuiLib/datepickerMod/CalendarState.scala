package typings
package baseuiLib.datepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarState extends js.Object {
  var date: stdLib.Date
  var focused: scala.Boolean
  var highlightedDate: stdLib.Date
  var quickSelectId: js.UndefOr[java.lang.String] = js.undefined
}

object CalendarState {
  @scala.inline
  def apply(
    date: stdLib.Date,
    focused: scala.Boolean,
    highlightedDate: stdLib.Date,
    quickSelectId: java.lang.String = null
  ): CalendarState = {
    val __obj = js.Dynamic.literal(date = date, focused = focused, highlightedDate = highlightedDate)
    if (quickSelectId != null) __obj.updateDynamic("quickSelectId")(quickSelectId)
    __obj.asInstanceOf[CalendarState]
  }
}

