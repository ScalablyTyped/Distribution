package typings.baseui

import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventItemAny extends js.Object {
  var event: SyntheticEvent[_, Event]
  var item: js.Any
}

object Anon_EventItemAny {
  @scala.inline
  def apply(event: SyntheticEvent[_, Event], item: js.Any): Anon_EventItemAny = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventItemAny]
  }
}

