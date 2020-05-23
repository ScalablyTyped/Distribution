package typings.baseui.anon

import typings.react.mod.SyntheticEvent
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventItem extends js.Object {
  var event: js.UndefOr[(SyntheticEvent[HTMLElement, typings.std.Event]) | KeyboardEvent] = js.undefined
  var item: js.Any
}

object EventItem {
  @scala.inline
  def apply(item: js.Any, event: (SyntheticEvent[HTMLElement, typings.std.Event]) | KeyboardEvent = null): EventItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
}

