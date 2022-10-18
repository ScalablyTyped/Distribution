package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaFunctionFailedEventAttributes extends StObject {
  
  /**
    * The details of the failure.
    */
  var details: js.UndefOr[Data] = js.undefined
  
  /**
    * The reason provided for the failure.
    */
  var reason: js.UndefOr[FailureReason] = js.undefined
  
  /**
    * The ID of the LambdaFunctionScheduled event that was recorded when this activity task was scheduled. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId
  
  /**
    * The ID of the LambdaFunctionStarted event recorded when this activity task started. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var startedEventId: EventId
}
object LambdaFunctionFailedEventAttributes {
  
  inline def apply(scheduledEventId: EventId, startedEventId: EventId): LambdaFunctionFailedEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionFailedEventAttributes]
  }
  
  extension [Self <: LambdaFunctionFailedEventAttributes](x: Self) {
    
    inline def setDetails(value: Data): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setReason(value: FailureReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setScheduledEventId(value: EventId): Self = StObject.set(x, "scheduledEventId", value.asInstanceOf[js.Any])
    
    inline def setStartedEventId(value: EventId): Self = StObject.set(x, "startedEventId", value.asInstanceOf[js.Any])
  }
}
