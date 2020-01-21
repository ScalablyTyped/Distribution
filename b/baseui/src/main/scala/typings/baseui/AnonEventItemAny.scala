package typings.baseui

import typings.react.mod.SyntheticEvent
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventItemAny extends js.Object {
  var event: SyntheticEvent[_, Event_]
  var item: js.Any
}

object AnonEventItemAny {
  @scala.inline
  def apply(event: SyntheticEvent[_, Event_], item: js.Any): AnonEventItemAny = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventItemAny]
  }
}

