package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfilerSessionEvents extends StObject {
  
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
  implicit class ProfilerSessionEventsMutableBuilder[Self <: ProfilerSessionEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: js.Array[ProfilerEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsLost(value: Boolean): Self = StObject.set(x, "eventsLost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: ProfilerEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
