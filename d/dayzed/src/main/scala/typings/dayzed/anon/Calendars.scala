package typings.dayzed.anon

import typings.dayzed.mod.Calendar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calendars extends js.Object {
  var calendars: js.Array[Calendar] = js.native
  var offset: js.UndefOr[Double] = js.native
}

object Calendars {
  @scala.inline
  def apply(calendars: js.Array[Calendar]): Calendars = {
    val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendars]
  }
  @scala.inline
  implicit class CalendarsOps[Self <: Calendars] (val x: Self) extends AnyVal {
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
    def setCalendarsVarargs(value: Calendar*): Self = this.set("calendars", js.Array(value :_*))
    @scala.inline
    def setCalendars(value: js.Array[Calendar]): Self = this.set("calendars", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
  
}

