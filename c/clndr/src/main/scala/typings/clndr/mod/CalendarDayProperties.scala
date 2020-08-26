package typings.clndr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarDayProperties extends js.Object {
  var isAdjacentMonth: Boolean = js.native
  var isInactive: Boolean = js.native
  var isToday: Boolean = js.native
}

object CalendarDayProperties {
  @scala.inline
  def apply(isAdjacentMonth: Boolean, isInactive: Boolean, isToday: Boolean): CalendarDayProperties = {
    val __obj = js.Dynamic.literal(isAdjacentMonth = isAdjacentMonth.asInstanceOf[js.Any], isInactive = isInactive.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarDayProperties]
  }
  @scala.inline
  implicit class CalendarDayPropertiesOps[Self <: CalendarDayProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsAdjacentMonth(value: Boolean): Self = this.set("isAdjacentMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsInactive(value: Boolean): Self = this.set("isInactive", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsToday(value: Boolean): Self = this.set("isToday", value.asInstanceOf[js.Any])
  }
  
}

