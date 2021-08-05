package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleLambdaFunctionFailedEventAttributes extends StObject {
  
  /**
    * The cause of the failure. To help diagnose issues, use this information to trace back the chain of events leading up to this event.  If cause is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient permissions. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide. 
    */
  var cause: ScheduleLambdaFunctionFailedCause
  
  /**
    * The ID of the LambdaFunctionCompleted event corresponding to the decision that resulted in scheduling this Lambda task. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId
  
  /**
    * The ID provided in the ScheduleLambdaFunction decision that failed. 
    */
  var id: FunctionId
  
  /**
    * The name of the Lambda function.
    */
  var name: FunctionName
}
object ScheduleLambdaFunctionFailedEventAttributes {
  
  inline def apply(
    cause: ScheduleLambdaFunctionFailedCause,
    decisionTaskCompletedEventId: EventId,
    id: FunctionId,
    name: FunctionName
  ): ScheduleLambdaFunctionFailedEventAttributes = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleLambdaFunctionFailedEventAttributes]
  }
  
  extension [Self <: ScheduleLambdaFunctionFailedEventAttributes](x: Self) {
    
    inline def setCause(value: ScheduleLambdaFunctionFailedCause): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setDecisionTaskCompletedEventId(value: EventId): Self = StObject.set(x, "decisionTaskCompletedEventId", value.asInstanceOf[js.Any])
    
    inline def setId(value: FunctionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: FunctionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
