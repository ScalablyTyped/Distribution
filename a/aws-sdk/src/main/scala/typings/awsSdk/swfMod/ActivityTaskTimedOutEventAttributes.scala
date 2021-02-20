package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityTaskTimedOutEventAttributes extends StObject {
  
  /**
    * Contains the content of the details parameter for the last call made by the activity to RecordActivityTaskHeartbeat.
    */
  var details: js.UndefOr[LimitedData] = js.native
  
  /**
    * The ID of the ActivityTaskScheduled event that was recorded when this activity task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId = js.native
  
  /**
    * The ID of the ActivityTaskStarted event recorded when this activity task was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId = js.native
  
  /**
    * The type of the timeout that caused this event.
    */
  var timeoutType: ActivityTaskTimeoutType = js.native
}
object ActivityTaskTimedOutEventAttributes {
  
  @scala.inline
  def apply(scheduledEventId: EventId, startedEventId: EventId, timeoutType: ActivityTaskTimeoutType): ActivityTaskTimedOutEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any], timeoutType = timeoutType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTaskTimedOutEventAttributes]
  }
  
  @scala.inline
  implicit class ActivityTaskTimedOutEventAttributesMutableBuilder[Self <: ActivityTaskTimedOutEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: LimitedData): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setScheduledEventId(value: EventId): Self = StObject.set(x, "scheduledEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedEventId(value: EventId): Self = StObject.set(x, "startedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutType(value: ActivityTaskTimeoutType): Self = StObject.set(x, "timeoutType", value.asInstanceOf[js.Any])
  }
}
