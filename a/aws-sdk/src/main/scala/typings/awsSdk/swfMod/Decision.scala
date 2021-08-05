package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decision extends StObject {
  
  /**
    * Provides the details of the CancelTimer decision. It isn't set for other decision types.
    */
  var cancelTimerDecisionAttributes: js.UndefOr[CancelTimerDecisionAttributes] = js.undefined
  
  /**
    * Provides the details of the CancelWorkflowExecution decision. It isn't set for other decision types.
    */
  var cancelWorkflowExecutionDecisionAttributes: js.UndefOr[CancelWorkflowExecutionDecisionAttributes] = js.undefined
  
  /**
    * Provides the details of the CompleteWorkflowExecution decision. It isn't set for other decision types.
    */
  var completeWorkflowExecutionDecisionAttributes: js.UndefOr[CompleteWorkflowExecutionDecisionAttributes] = js.undefined
  
  /**
    * Provides the details of the ContinueAsNewWorkflowExecution decision. It isn't set for other decision types.
    */
  var continueAsNewWorkflowExecutionDecisionAttributes: js.UndefOr[ContinueAsNewWorkflowExecutionDecisionAttributes] = js.undefined
  
  /**
    * Specifies the type of the decision.
    */
  var decisionType: DecisionType
  
  /**
    * Provides the details of the FailWorkflowExecution decision. It isn't set for other decision types.
    */
  var failWorkflowExecutionDecisionAttributes: js.UndefOr[FailWorkflowExecutionDecisionAttributes] = js.undefined
  
  /**
    * Provides the details of the RecordMarker decision. It isn't set for other decision types.
    */
  var recordMarkerDecisionAttributes: js.UndefOr[RecordMarkerDecisionAttributes] = js.undefined
  
  /**
    * Provides the details of the RequestCancelActivityTask decision. It isn't set for other decision types.
    */
  var requestCancelActivityTaskDecisionAttributes: js.UndefOr[RequestCancelActivityTaskDecisionAttributes] = js.undefined
  
  /**
    * Provides the details of the RequestCancelExternalWorkflowExecution decision. It isn't set for other decision types.
    */
  var requestCancelExternalWorkflowExecutionDecisionAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionDecisionAttributes] = js.undefined
  
  /**
    * Provides the details of the ScheduleActivityTask decision. It isn't set for other decision types.
    */
  var scheduleActivityTaskDecisionAttributes: js.UndefOr[ScheduleActivityTaskDecisionAttributes] = js.undefined
  
  /**
    * Provides the details of the ScheduleLambdaFunction decision. It isn't set for other decision types.
    */
  var scheduleLambdaFunctionDecisionAttributes: js.UndefOr[ScheduleLambdaFunctionDecisionAttributes] = js.undefined
  
  /**
    * Provides the details of the SignalExternalWorkflowExecution decision. It isn't set for other decision types.
    */
  var signalExternalWorkflowExecutionDecisionAttributes: js.UndefOr[SignalExternalWorkflowExecutionDecisionAttributes] = js.undefined
  
  /**
    * Provides the details of the StartChildWorkflowExecution decision. It isn't set for other decision types.
    */
  var startChildWorkflowExecutionDecisionAttributes: js.UndefOr[StartChildWorkflowExecutionDecisionAttributes] = js.undefined
  
  /**
    * Provides the details of the StartTimer decision. It isn't set for other decision types.
    */
  var startTimerDecisionAttributes: js.UndefOr[StartTimerDecisionAttributes] = js.undefined
}
object Decision {
  
  inline def apply(decisionType: DecisionType): Decision = {
    val __obj = js.Dynamic.literal(decisionType = decisionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decision]
  }
  
  extension [Self <: Decision](x: Self) {
    
    inline def setCancelTimerDecisionAttributes(value: CancelTimerDecisionAttributes): Self = StObject.set(x, "cancelTimerDecisionAttributes", value.asInstanceOf[js.Any])
    
    inline def setCancelTimerDecisionAttributesUndefined: Self = StObject.set(x, "cancelTimerDecisionAttributes", js.undefined)
    
    inline def setCancelWorkflowExecutionDecisionAttributes(value: CancelWorkflowExecutionDecisionAttributes): Self = StObject.set(x, "cancelWorkflowExecutionDecisionAttributes", value.asInstanceOf[js.Any])
    
    inline def setCancelWorkflowExecutionDecisionAttributesUndefined: Self = StObject.set(x, "cancelWorkflowExecutionDecisionAttributes", js.undefined)
    
    inline def setCompleteWorkflowExecutionDecisionAttributes(value: CompleteWorkflowExecutionDecisionAttributes): Self = StObject.set(x, "completeWorkflowExecutionDecisionAttributes", value.asInstanceOf[js.Any])
    
    inline def setCompleteWorkflowExecutionDecisionAttributesUndefined: Self = StObject.set(x, "completeWorkflowExecutionDecisionAttributes", js.undefined)
    
    inline def setContinueAsNewWorkflowExecutionDecisionAttributes(value: ContinueAsNewWorkflowExecutionDecisionAttributes): Self = StObject.set(x, "continueAsNewWorkflowExecutionDecisionAttributes", value.asInstanceOf[js.Any])
    
    inline def setContinueAsNewWorkflowExecutionDecisionAttributesUndefined: Self = StObject.set(x, "continueAsNewWorkflowExecutionDecisionAttributes", js.undefined)
    
    inline def setDecisionType(value: DecisionType): Self = StObject.set(x, "decisionType", value.asInstanceOf[js.Any])
    
    inline def setFailWorkflowExecutionDecisionAttributes(value: FailWorkflowExecutionDecisionAttributes): Self = StObject.set(x, "failWorkflowExecutionDecisionAttributes", value.asInstanceOf[js.Any])
    
    inline def setFailWorkflowExecutionDecisionAttributesUndefined: Self = StObject.set(x, "failWorkflowExecutionDecisionAttributes", js.undefined)
    
    inline def setRecordMarkerDecisionAttributes(value: RecordMarkerDecisionAttributes): Self = StObject.set(x, "recordMarkerDecisionAttributes", value.asInstanceOf[js.Any])
    
    inline def setRecordMarkerDecisionAttributesUndefined: Self = StObject.set(x, "recordMarkerDecisionAttributes", js.undefined)
    
    inline def setRequestCancelActivityTaskDecisionAttributes(value: RequestCancelActivityTaskDecisionAttributes): Self = StObject.set(x, "requestCancelActivityTaskDecisionAttributes", value.asInstanceOf[js.Any])
    
    inline def setRequestCancelActivityTaskDecisionAttributesUndefined: Self = StObject.set(x, "requestCancelActivityTaskDecisionAttributes", js.undefined)
    
    inline def setRequestCancelExternalWorkflowExecutionDecisionAttributes(value: RequestCancelExternalWorkflowExecutionDecisionAttributes): Self = StObject.set(x, "requestCancelExternalWorkflowExecutionDecisionAttributes", value.asInstanceOf[js.Any])
    
    inline def setRequestCancelExternalWorkflowExecutionDecisionAttributesUndefined: Self = StObject.set(x, "requestCancelExternalWorkflowExecutionDecisionAttributes", js.undefined)
    
    inline def setScheduleActivityTaskDecisionAttributes(value: ScheduleActivityTaskDecisionAttributes): Self = StObject.set(x, "scheduleActivityTaskDecisionAttributes", value.asInstanceOf[js.Any])
    
    inline def setScheduleActivityTaskDecisionAttributesUndefined: Self = StObject.set(x, "scheduleActivityTaskDecisionAttributes", js.undefined)
    
    inline def setScheduleLambdaFunctionDecisionAttributes(value: ScheduleLambdaFunctionDecisionAttributes): Self = StObject.set(x, "scheduleLambdaFunctionDecisionAttributes", value.asInstanceOf[js.Any])
    
    inline def setScheduleLambdaFunctionDecisionAttributesUndefined: Self = StObject.set(x, "scheduleLambdaFunctionDecisionAttributes", js.undefined)
    
    inline def setSignalExternalWorkflowExecutionDecisionAttributes(value: SignalExternalWorkflowExecutionDecisionAttributes): Self = StObject.set(x, "signalExternalWorkflowExecutionDecisionAttributes", value.asInstanceOf[js.Any])
    
    inline def setSignalExternalWorkflowExecutionDecisionAttributesUndefined: Self = StObject.set(x, "signalExternalWorkflowExecutionDecisionAttributes", js.undefined)
    
    inline def setStartChildWorkflowExecutionDecisionAttributes(value: StartChildWorkflowExecutionDecisionAttributes): Self = StObject.set(x, "startChildWorkflowExecutionDecisionAttributes", value.asInstanceOf[js.Any])
    
    inline def setStartChildWorkflowExecutionDecisionAttributesUndefined: Self = StObject.set(x, "startChildWorkflowExecutionDecisionAttributes", js.undefined)
    
    inline def setStartTimerDecisionAttributes(value: StartTimerDecisionAttributes): Self = StObject.set(x, "startTimerDecisionAttributes", value.asInstanceOf[js.Any])
    
    inline def setStartTimerDecisionAttributesUndefined: Self = StObject.set(x, "startTimerDecisionAttributes", js.undefined)
  }
}
