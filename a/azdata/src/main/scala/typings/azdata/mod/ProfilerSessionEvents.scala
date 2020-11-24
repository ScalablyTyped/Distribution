package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfilerSessionEvents extends js.Object {
  
  var events: js.Array[ProfilerEvent] = js.native
  
  var eventsLost: Boolean = js.native
  
  var sessionId: String = js.native
}
object ProfilerSessionEvents {
  
  @scala.inline
  def apply(events: js.Array[ProfilerEvent], eventsLost: Boolean, sessionId: String): ProfilerSessionEvents = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], eventsLost = eventsLost.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerSessionEvents]
  }
  
  @scala.inline
  implicit class ProfilerSessionEventsOps[Self <: ProfilerSessionEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventsVarargs(value: ProfilerEvent*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[ProfilerEvent]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsLost(value: Boolean): Self = this.set("eventsLost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
  }
}
