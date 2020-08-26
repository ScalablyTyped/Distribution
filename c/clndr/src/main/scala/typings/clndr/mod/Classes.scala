package typings.clndr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Classes extends js.Object {
  var adjacentMonth: js.UndefOr[String] = js.native
  var event: js.UndefOr[String] = js.native
  var inactive: js.UndefOr[String] = js.native
  var lastMonth: js.UndefOr[String] = js.native
  var nextMonth: js.UndefOr[String] = js.native
  var past: js.UndefOr[String] = js.native
  var selected: js.UndefOr[String] = js.native
  var today: js.UndefOr[String] = js.native
}

object Classes {
  @scala.inline
  def apply(): Classes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Classes]
  }
  @scala.inline
  implicit class ClassesOps[Self <: Classes] (val x: Self) extends AnyVal {
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
    def setAdjacentMonth(value: String): Self = this.set("adjacentMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjacentMonth: Self = this.set("adjacentMonth", js.undefined)
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setInactive(value: String): Self = this.set("inactive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInactive: Self = this.set("inactive", js.undefined)
    @scala.inline
    def setLastMonth(value: String): Self = this.set("lastMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastMonth: Self = this.set("lastMonth", js.undefined)
    @scala.inline
    def setNextMonth(value: String): Self = this.set("nextMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMonth: Self = this.set("nextMonth", js.undefined)
    @scala.inline
    def setPast(value: String): Self = this.set("past", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePast: Self = this.set("past", js.undefined)
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setToday(value: String): Self = this.set("today", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToday: Self = this.set("today", js.undefined)
  }
  
}

