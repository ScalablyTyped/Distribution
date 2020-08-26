package typings.clipboard.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  var action: String = js.native
  var text: String = js.native
  var trigger: Element = js.native
  def clearSelection(): Unit = js.native
}

object Event {
  @scala.inline
  def apply(action: String, clearSelection: () => Unit, text: String, trigger: Element): Event = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], clearSelection = js.Any.fromFunction0(clearSelection), text = text.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearSelection(value: () => Unit): Self = this.set("clearSelection", js.Any.fromFunction0(value))
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrigger(value: Element): Self = this.set("trigger", value.asInstanceOf[js.Any])
  }
  
}

