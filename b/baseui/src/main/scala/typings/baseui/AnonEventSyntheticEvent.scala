package typings.baseui

import typings.react.mod.SyntheticEvent
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventSyntheticEvent extends js.Object {
  var event: SyntheticEvent[_, Event_]
  var item: js.Any
}

object AnonEventSyntheticEvent {
  @scala.inline
  def apply(event: SyntheticEvent[_, Event_], item: js.Any): AnonEventSyntheticEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEventSyntheticEvent]
  }
}

