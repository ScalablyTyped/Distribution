package typings.baseui

import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventItem extends js.Object {
  var event: js.UndefOr[(SyntheticEvent[HTMLElement, Event]) | KeyboardEvent] = js.undefined
  var item: js.Any
}

object Anon_EventItem {
  @scala.inline
  def apply(item: js.Any, event: (SyntheticEvent[HTMLElement, Event]) | KeyboardEvent = null): Anon_EventItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EventItem]
  }
}

