package typings.baseui

import typings.std.Event_
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventItemAnyKeyboardEvent extends js.Object {
  var event: Event_ | KeyboardEvent
  var item: js.Any
}

object AnonEventItemAnyKeyboardEvent {
  @scala.inline
  def apply(event: Event_ | KeyboardEvent, item: js.Any): AnonEventItemAnyKeyboardEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventItemAnyKeyboardEvent]
  }
}

