package typings.baseui.anon

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemAny extends js.Object {
  var event: typings.std.Event | KeyboardEvent = js.native
  var item: js.Any = js.native
}

object ItemAny {
  @scala.inline
  def apply(event: typings.std.Event | KeyboardEvent, item: js.Any): ItemAny = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemAny]
  }
  @scala.inline
  implicit class ItemAnyOps[Self <: ItemAny] (val x: Self) extends AnyVal {
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
    def setEvent(value: typings.std.Event | KeyboardEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
  }
  
}

