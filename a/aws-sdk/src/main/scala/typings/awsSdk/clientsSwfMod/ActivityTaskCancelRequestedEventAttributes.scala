package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityTaskCancelRequestedEventAttributes extends StObject {
  
  /**
    * The unique ID of the task.
    */
  var activityId: ActivityId
  
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the RequestCancelActivityTask decision for this cancellation request. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId
}
object ActivityTaskCancelRequestedEventAttributes {
  
  inline def apply(activityId: ActivityId, decisionTaskCompletedEventId: EventId): ActivityTaskCancelRequestedEventAttributes = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTaskCancelRequestedEventAttributes]
  }
  
  extension [Self <: ActivityTaskCancelRequestedEventAttributes](x: Self) {
    
    inline def setActivityId(value: ActivityId): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
    
    inline def setDecisionTaskCompletedEventId(value: EventId): Self = StObject.set(x, "decisionTaskCompletedEventId", value.asInstanceOf[js.Any])
  }
}
