package typings.baseui

import typings.std.Event
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventItemAnyKeyboardEvent extends js.Object {
  var event: Event | KeyboardEvent
  var item: js.Any
}

object Anon_EventItemAnyKeyboardEvent {
  @scala.inline
  def apply(event: Event | KeyboardEvent, item: js.Any): Anon_EventItemAnyKeyboardEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventItemAnyKeyboardEvent]
  }
}

