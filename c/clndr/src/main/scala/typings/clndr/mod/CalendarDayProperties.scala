package typings.clndr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarDayProperties extends js.Object {
  var isAdjacentMonth: Boolean
  var isInactive: Boolean
  var isToday: Boolean
}

object CalendarDayProperties {
  @scala.inline
  def apply(isAdjacentMonth: Boolean, isInactive: Boolean, isToday: Boolean): CalendarDayProperties = {
    val __obj = js.Dynamic.literal(isAdjacentMonth = isAdjacentMonth.asInstanceOf[js.Any], isInactive = isInactive.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarDayProperties]
  }
}

