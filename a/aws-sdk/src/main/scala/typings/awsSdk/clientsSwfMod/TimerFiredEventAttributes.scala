package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimerFiredEventAttributes extends StObject {
  
  /**
    * The ID of the TimerStarted event that was recorded when this timer was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId
  
  /**
    * The unique ID of the timer that fired.
    */
  var timerId: TimerId
}
object TimerFiredEventAttributes {
  
  inline def apply(startedEventId: EventId, timerId: TimerId): TimerFiredEventAttributes = {
    val __obj = js.Dynamic.literal(startedEventId = startedEventId.asInstanceOf[js.Any], timerId = timerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimerFiredEventAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimerFiredEventAttributes] (val x: Self) extends AnyVal {
    
    inline def setStartedEventId(value: EventId): Self = StObject.set(x, "startedEventId", value.asInstanceOf[js.Any])
    
    inline def setTimerId(value: TimerId): Self = StObject.set(x, "timerId", value.asInstanceOf[js.Any])
  }
}
