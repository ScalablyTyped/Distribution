package typings.baseui.anon

import typings.react.mod.SyntheticEvent
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventItem extends js.Object {
  var event: js.UndefOr[(SyntheticEvent[HTMLElement, typings.std.Event]) | KeyboardEvent] = js.native
  var item: js.Any = js.native
}

object EventItem {
  @scala.inline
  def apply(item: js.Any): EventItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  @scala.inline
  implicit class EventItemOps[Self <: EventItem] (val x: Self) extends AnyVal {
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
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: (SyntheticEvent[HTMLElement, typings.std.Event]) | KeyboardEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
  }
  
}

