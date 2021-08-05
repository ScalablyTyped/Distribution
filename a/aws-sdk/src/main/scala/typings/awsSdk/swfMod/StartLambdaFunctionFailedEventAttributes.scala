package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartLambdaFunctionFailedEventAttributes extends StObject {
  
  /**
    * The cause of the failure. To help diagnose issues, use this information to trace back the chain of events leading up to this event.  If cause is set to OPERATION_NOT_PERMITTED, the decision failed because the IAM role attached to the execution lacked sufficient permissions. For details and example IAM policies, see Lambda Tasks in the Amazon SWF Developer Guide. 
    */
  var cause: js.UndefOr[StartLambdaFunctionFailedCause] = js.undefined
  
  /**
    * A description that can help diagnose the cause of the fault.
    */
  var message: js.UndefOr[CauseMessage] = js.undefined
  
  /**
    * The ID of the ActivityTaskScheduled event that was recorded when this activity task was scheduled. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var scheduledEventId: js.UndefOr[EventId] = js.undefined
}
object StartLambdaFunctionFailedEventAttributes {
  
  inline def apply(): StartLambdaFunctionFailedEventAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartLambdaFunctionFailedEventAttributes]
  }
  
  extension [Self <: StartLambdaFunctionFailedEventAttributes](x: Self) {
    
    inline def setCause(value: StartLambdaFunctionFailedCause): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setMessage(value: CauseMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setScheduledEventId(value: EventId): Self = StObject.set(x, "scheduledEventId", value.asInstanceOf[js.Any])
    
    inline def setScheduledEventIdUndefined: Self = StObject.set(x, "scheduledEventId", js.undefined)
  }
}
