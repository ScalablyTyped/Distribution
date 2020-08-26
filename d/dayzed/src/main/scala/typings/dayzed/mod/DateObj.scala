package typings.dayzed.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateObj extends js.Object {
  var date: Date = js.native
  var nextMonth: Boolean = js.native
  var prevMonth: Boolean = js.native
  var selectable: Boolean = js.native
  var selected: Boolean = js.native
  var today: Boolean = js.native
}

object DateObj {
  @scala.inline
  def apply(
    date: Date,
    nextMonth: Boolean,
    prevMonth: Boolean,
    selectable: Boolean,
    selected: Boolean,
    today: Boolean
  ): DateObj = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], nextMonth = nextMonth.asInstanceOf[js.Any], prevMonth = prevMonth.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateObj]
  }
  @scala.inline
  implicit class DateObjOps[Self <: DateObj] (val x: Self) extends AnyVal {
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
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextMonth(value: Boolean): Self = this.set("nextMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevMonth(value: Boolean): Self = this.set("prevMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setToday(value: Boolean): Self = this.set("today", value.asInstanceOf[js.Any])
  }
  
}

