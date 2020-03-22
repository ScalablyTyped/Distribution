package typings.baseui

import typings.std.Date
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventEvent extends js.Object {
  var date: Date
  var event: Event_
}

object AnonEventEvent {
  @scala.inline
  def apply(date: Date, event: Event_): AnonEventEvent = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventEvent]
  }
}

