package typings.baseui

import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventItem extends js.Object {
  var event: js.UndefOr[(SyntheticEvent[HTMLElement, Event_]) | KeyboardEvent] = js.undefined
  var item: js.Any
}

object AnonEventItem {
  @scala.inline
  def apply(item: js.Any, event: (SyntheticEvent[HTMLElement, Event_]) | KeyboardEvent = null): AnonEventItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEventItem]
  }
}

