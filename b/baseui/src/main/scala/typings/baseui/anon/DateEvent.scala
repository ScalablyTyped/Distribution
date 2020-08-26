package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateEvent extends js.Object {
  var date: typings.std.Date = js.native
  var event: typings.std.Event = js.native
}

object DateEvent {
  @scala.inline
  def apply(date: typings.std.Date, event: typings.std.Event): DateEvent = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateEvent]
  }
  @scala.inline
  implicit class DateEventOps[Self <: DateEvent] (val x: Self) extends AnyVal {
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
    def setDate(value: typings.std.Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: typings.std.Event): Self = this.set("event", value.asInstanceOf[js.Any])
  }
  
}

