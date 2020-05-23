package typings.baseui.anon

import typings.react.mod.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSyntheticEvent extends js.Object {
  var event: SyntheticEvent[_, typings.std.Event]
  var item: js.Any
}

object EventSyntheticEvent {
  @scala.inline
  def apply(event: SyntheticEvent[_, typings.std.Event], item: js.Any): EventSyntheticEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSyntheticEvent]
  }
}

