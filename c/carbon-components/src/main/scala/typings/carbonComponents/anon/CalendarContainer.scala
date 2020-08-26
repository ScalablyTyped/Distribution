package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarContainer extends js.Object {
  var calendarContainer: js.Any = js.native
  var selectedDates: js.Any = js.native
}

object CalendarContainer {
  @scala.inline
  def apply(calendarContainer: js.Any, selectedDates: js.Any): CalendarContainer = {
    val __obj = js.Dynamic.literal(calendarContainer = calendarContainer.asInstanceOf[js.Any], selectedDates = selectedDates.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarContainer]
  }
  @scala.inline
  implicit class CalendarContainerOps[Self <: CalendarContainer] (val x: Self) extends AnyVal {
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
    def setCalendarContainer(value: js.Any): Self = this.set("calendarContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedDates(value: js.Any): Self = this.set("selectedDates", value.asInstanceOf[js.Any])
  }
  
}

