package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecisionTaskCompletedEventAttributes extends StObject {
  
  /**
    * User defined context for the workflow execution.
    */
  var executionContext: js.UndefOr[Data] = js.undefined
  
  /**
    * The ID of the DecisionTaskScheduled event that was recorded when this decision task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId
  
  /**
    * The ID of the DecisionTaskStarted event recorded when this decision task was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId
}
object DecisionTaskCompletedEventAttributes {
  
  inline def apply(scheduledEventId: EventId, startedEventId: EventId): DecisionTaskCompletedEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecisionTaskCompletedEventAttributes]
  }
  
  extension [Self <: DecisionTaskCompletedEventAttributes](x: Self) {
    
    inline def setExecutionContext(value: Data): Self = StObject.set(x, "executionContext", value.asInstanceOf[js.Any])
    
    inline def setExecutionContextUndefined: Self = StObject.set(x, "executionContext", js.undefined)
    
    inline def setScheduledEventId(value: EventId): Self = StObject.set(x, "scheduledEventId", value.asInstanceOf[js.Any])
    
    inline def setStartedEventId(value: EventId): Self = StObject.set(x, "startedEventId", value.asInstanceOf[js.Any])
  }
}
