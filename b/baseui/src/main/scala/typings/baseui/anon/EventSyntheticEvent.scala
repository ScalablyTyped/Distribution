package typings.baseui.anon

import typings.react.mod.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSyntheticEvent extends js.Object {
  var event: SyntheticEvent[_, typings.std.Event] = js.native
  var item: js.Any = js.native
}

object EventSyntheticEvent {
  @scala.inline
  def apply(event: SyntheticEvent[_, typings.std.Event], item: js.Any): EventSyntheticEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSyntheticEvent]
  }
  @scala.inline
  implicit class EventSyntheticEventOps[Self <: EventSyntheticEvent] (val x: Self) extends AnyVal {
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
    def setEvent(value: SyntheticEvent[_, typings.std.Event]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
  }
  
}

