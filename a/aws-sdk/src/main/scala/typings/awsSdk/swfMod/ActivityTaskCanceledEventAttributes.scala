package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityTaskCanceledEventAttributes extends StObject {
  
  /**
    * Details of the cancellation.
    */
  var details: js.UndefOr[Data] = js.undefined
  
  /**
    * If set, contains the ID of the last ActivityTaskCancelRequested event recorded for this activity task. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var latestCancelRequestedEventId: js.UndefOr[EventId] = js.undefined
  
  /**
    * The ID of the ActivityTaskScheduled event that was recorded when this activity task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId
  
  /**
    * The ID of the ActivityTaskStarted event recorded when this activity task was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId
}
object ActivityTaskCanceledEventAttributes {
  
  @scala.inline
  def apply(scheduledEventId: EventId, startedEventId: EventId): ActivityTaskCanceledEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTaskCanceledEventAttributes]
  }
  
  @scala.inline
  implicit class ActivityTaskCanceledEventAttributesMutableBuilder[Self <: ActivityTaskCanceledEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: Data): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setLatestCancelRequestedEventId(value: EventId): Self = StObject.set(x, "latestCancelRequestedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestCancelRequestedEventIdUndefined: Self = StObject.set(x, "latestCancelRequestedEventId", js.undefined)
    
    @scala.inline
    def setScheduledEventId(value: EventId): Self = StObject.set(x, "scheduledEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedEventId(value: EventId): Self = StObject.set(x, "startedEventId", value.asInstanceOf[js.Any])
  }
}
