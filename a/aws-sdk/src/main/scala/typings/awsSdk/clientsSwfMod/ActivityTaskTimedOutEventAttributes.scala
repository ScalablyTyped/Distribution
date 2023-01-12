package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityTaskTimedOutEventAttributes extends StObject {
  
  /**
    * Contains the content of the details parameter for the last call made by the activity to RecordActivityTaskHeartbeat.
    */
  var details: js.UndefOr[LimitedData] = js.undefined
  
  /**
    * The ID of the ActivityTaskScheduled event that was recorded when this activity task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId
  
  /**
    * The ID of the ActivityTaskStarted event recorded when this activity task was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId
  
  /**
    * The type of the timeout that caused this event.
    */
  var timeoutType: ActivityTaskTimeoutType
}
object ActivityTaskTimedOutEventAttributes {
  
  inline def apply(scheduledEventId: EventId, startedEventId: EventId, timeoutType: ActivityTaskTimeoutType): ActivityTaskTimedOutEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any], timeoutType = timeoutType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTaskTimedOutEventAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActivityTaskTimedOutEventAttributes] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: LimitedData): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setScheduledEventId(value: EventId): Self = StObject.set(x, "scheduledEventId", value.asInstanceOf[js.Any])
    
    inline def setStartedEventId(value: EventId): Self = StObject.set(x, "startedEventId", value.asInstanceOf[js.Any])
    
    inline def setTimeoutType(value: ActivityTaskTimeoutType): Self = StObject.set(x, "timeoutType", value.asInstanceOf[js.Any])
  }
}
