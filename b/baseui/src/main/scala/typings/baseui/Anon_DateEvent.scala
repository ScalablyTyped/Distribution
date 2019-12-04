package typings.baseui

import typings.std.Date
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateEvent extends js.Object {
  var date: Date
  var event: Event
}

object Anon_DateEvent {
  @scala.inline
  def apply(date: Date, event: Event): Anon_DateEvent = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DateEvent]
  }
}

