package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventEvent extends js.Object {
  var date: typings.std.Date
  var event: typings.std.Event
}

object EventEvent {
  @scala.inline
  def apply(date: typings.std.Date, event: typings.std.Event): EventEvent = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEvent]
  }
}

