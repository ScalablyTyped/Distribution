package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfilerSessionEvents extends js.Object {
  var events: js.Array[ProfilerEvent]
  var eventsLost: Boolean
  var sessionId: String
}

object ProfilerSessionEvents {
  @scala.inline
  def apply(events: js.Array[ProfilerEvent], eventsLost: Boolean, sessionId: String): ProfilerSessionEvents = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], eventsLost = eventsLost.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerSessionEvents]
  }
}

