package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryEvent extends StObject {
  
  /**
    * If the event is of type ActivityTaskcancelRequested then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskCancelRequestedEventAttributes: js.UndefOr[ActivityTaskCancelRequestedEventAttributes] = js.undefined
  
  /**
    * If the event is of type ActivityTaskCanceled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskCanceledEventAttributes: js.UndefOr[ActivityTaskCanceledEventAttributes] = js.undefined
  
  /**
    * If the event is of type ActivityTaskCompleted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskCompletedEventAttributes: js.UndefOr[ActivityTaskCompletedEventAttributes] = js.undefined
  
  /**
    * If the event is of type ActivityTaskFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskFailedEventAttributes: js.UndefOr[ActivityTaskFailedEventAttributes] = js.undefined
  
  /**
    * If the event is of type ActivityTaskScheduled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskScheduledEventAttributes: js.UndefOr[ActivityTaskScheduledEventAttributes] = js.undefined
  
  /**
    * If the event is of type ActivityTaskStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskStartedEventAttributes: js.UndefOr[ActivityTaskStartedEventAttributes] = js.undefined
  
  /**
    * If the event is of type ActivityTaskTimedOut then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskTimedOutEventAttributes: js.UndefOr[ActivityTaskTimedOutEventAttributes] = js.undefined
  
  /**
    * If the event is of type CancelTimerFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var cancelTimerFailedEventAttributes: js.UndefOr[CancelTimerFailedEventAttributes] = js.undefined
  
  /**
    * If the event is of type CancelWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var cancelWorkflowExecutionFailedEventAttributes: js.UndefOr[CancelWorkflowExecutionFailedEventAttributes] = js.undefined
  
  /**
    * If the event is of type ChildWorkflowExecutionCanceled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionCanceledEventAttributes: js.UndefOr[ChildWorkflowExecutionCanceledEventAttributes] = js.undefined
  
  /**
    * If the event is of type ChildWorkflowExecutionCompleted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionCompletedEventAttributes: js.UndefOr[ChildWorkflowExecutionCompletedEventAttributes] = js.undefined
  
  /**
    * If the event is of type ChildWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionFailedEventAttributes: js.UndefOr[ChildWorkflowExecutionFailedEventAttributes] = js.undefined
  
  /**
    * If the event is of type ChildWorkflowExecutionStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionStartedEventAttributes: js.UndefOr[ChildWorkflowExecutionStartedEventAttributes] = js.undefined
  
  /**
    * If the event is of type ChildWorkflowExecutionTerminated then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionTerminatedEventAttributes: js.UndefOr[ChildWorkflowExecutionTerminatedEventAttributes] = js.undefined
  
  /**
    * If the event is of type ChildWorkflowExecutionTimedOut then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionTimedOutEventAttributes: js.UndefOr[ChildWorkflowExecutionTimedOutEventAttributes] = js.undefined
  
  /**
    * If the event is of type CompleteWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var completeWorkflowExecutionFailedEventAttributes: js.UndefOr[CompleteWorkflowExecutionFailedEventAttributes] = js.undefined
  
  /**
    * If the event is of type ContinueAsNewWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var continueAsNewWorkflowExecutionFailedEventAttributes: js.UndefOr[ContinueAsNewWorkflowExecutionFailedEventAttributes] = js.undefined
  
  /**
    * If the event is of type DecisionTaskCompleted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var decisionTaskCompletedEventAttributes: js.UndefOr[DecisionTaskCompletedEventAttributes] = js.undefined
  
  /**
    * If the event is of type DecisionTaskScheduled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var decisionTaskScheduledEventAttributes: js.UndefOr[DecisionTaskScheduledEventAttributes] = js.undefined
  
  /**
    * If the event is of type DecisionTaskStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var decisionTaskStartedEventAttributes: js.UndefOr[DecisionTaskStartedEventAttributes] = js.undefined
  
  /**
    * If the event is of type DecisionTaskTimedOut then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var decisionTaskTimedOutEventAttributes: js.UndefOr[DecisionTaskTimedOutEventAttributes] = js.undefined
  
  /**
    * The system generated ID of the event. This ID uniquely identifies the event with in the workflow execution history.
    */
  var eventId: EventId
  
  /**
    * The date and time when the event occurred.
    */
  var eventTimestamp: Timestamp
  
  /**
    * The type of the history event.
    */
  var eventType: EventType
  
  /**
    * If the event is of type ExternalWorkflowExecutionCancelRequested then this member is set and provides detailed information about the event. It isn't set for other event types. 
    */
  var externalWorkflowExecutionCancelRequestedEventAttributes: js.UndefOr[ExternalWorkflowExecutionCancelRequestedEventAttributes] = js.undefined
  
  /**
    * If the event is of type ExternalWorkflowExecutionSignaled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var externalWorkflowExecutionSignaledEventAttributes: js.UndefOr[ExternalWorkflowExecutionSignaledEventAttributes] = js.undefined
  
  /**
    * If the event is of type FailWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var failWorkflowExecutionFailedEventAttributes: js.UndefOr[FailWorkflowExecutionFailedEventAttributes] = js.undefined
  
  /**
    * Provides the details of the LambdaFunctionCompleted event. It isn't set for other event types.
    */
  var lambdaFunctionCompletedEventAttributes: js.UndefOr[LambdaFunctionCompletedEventAttributes] = js.undefined
  
  /**
    * Provides the details of the LambdaFunctionFailed event. It isn't set for other event types.
    */
  var lambdaFunctionFailedEventAttributes: js.UndefOr[LambdaFunctionFailedEventAttributes] = js.undefined
  
  /**
    * Provides the details of the LambdaFunctionScheduled event. It isn't set for other event types.
    */
  var lambdaFunctionScheduledEventAttributes: js.UndefOr[LambdaFunctionScheduledEventAttributes] = js.undefined
  
  /**
    * Provides the details of the LambdaFunctionStarted event. It isn't set for other event types.
    */
  var lambdaFunctionStartedEventAttributes: js.UndefOr[LambdaFunctionStartedEventAttributes] = js.undefined
  
  /**
    * Provides the details of the LambdaFunctionTimedOut event. It isn't set for other event types.
    */
  var lambdaFunctionTimedOutEventAttributes: js.UndefOr[LambdaFunctionTimedOutEventAttributes] = js.undefined
  
  /**
    * If the event is of type MarkerRecorded then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var markerRecordedEventAttributes: js.UndefOr[MarkerRecordedEventAttributes] = js.undefined
  
  /**
    * If the event is of type DecisionTaskFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var recordMarkerFailedEventAttributes: js.UndefOr[RecordMarkerFailedEventAttributes] = js.undefined
  
  /**
    * If the event is of type RequestCancelActivityTaskFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var requestCancelActivityTaskFailedEventAttributes: js.UndefOr[RequestCancelActivityTaskFailedEventAttributes] = js.undefined
  
  /**
    * If the event is of type RequestCancelExternalWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var requestCancelExternalWorkflowExecutionFailedEventAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionFailedEventAttributes] = js.undefined
  
  /**
    * If the event is of type RequestCancelExternalWorkflowExecutionInitiated then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var requestCancelExternalWorkflowExecutionInitiatedEventAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionInitiatedEventAttributes] = js.undefined
  
  /**
    * If the event is of type ScheduleActivityTaskFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var scheduleActivityTaskFailedEventAttributes: js.UndefOr[ScheduleActivityTaskFailedEventAttributes] = js.undefined
  
  /**
    * Provides the details of the ScheduleLambdaFunctionFailed event. It isn't set for other event types.
    */
  var scheduleLambdaFunctionFailedEventAttributes: js.UndefOr[ScheduleLambdaFunctionFailedEventAttributes] = js.undefined
  
  /**
    * If the event is of type SignalExternalWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var signalExternalWorkflowExecutionFailedEventAttributes: js.UndefOr[SignalExternalWorkflowExecutionFailedEventAttributes] = js.undefined
  
  /**
    * If the event is of type SignalExternalWorkflowExecutionInitiated then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var signalExternalWorkflowExecutionInitiatedEventAttributes: js.UndefOr[SignalExternalWorkflowExecutionInitiatedEventAttributes] = js.undefined
  
  /**
    * If the event is of type StartChildWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var startChildWorkflowExecutionFailedEventAttributes: js.UndefOr[StartChildWorkflowExecutionFailedEventAttributes] = js.undefined
  
  /**
    * If the event is of type StartChildWorkflowExecutionInitiated then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var startChildWorkflowExecutionInitiatedEventAttributes: js.UndefOr[StartChildWorkflowExecutionInitiatedEventAttributes] = js.undefined
  
  /**
    * Provides the details of the StartLambdaFunctionFailed event. It isn't set for other event types.
    */
  var startLambdaFunctionFailedEventAttributes: js.UndefOr[StartLambdaFunctionFailedEventAttributes] = js.undefined
  
  /**
    * If the event is of type StartTimerFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var startTimerFailedEventAttributes: js.UndefOr[StartTimerFailedEventAttributes] = js.undefined
  
  /**
    * If the event is of type TimerCanceled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var timerCanceledEventAttributes: js.UndefOr[TimerCanceledEventAttributes] = js.undefined
  
  /**
    * If the event is of type TimerFired then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var timerFiredEventAttributes: js.UndefOr[TimerFiredEventAttributes] = js.undefined
  
  /**
    * If the event is of type TimerStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var timerStartedEventAttributes: js.UndefOr[TimerStartedEventAttributes] = js.undefined
  
  /**
    * If the event is of type WorkflowExecutionCancelRequested then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionCancelRequestedEventAttributes: js.UndefOr[WorkflowExecutionCancelRequestedEventAttributes] = js.undefined
  
  /**
    * If the event is of type WorkflowExecutionCanceled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionCanceledEventAttributes: js.UndefOr[WorkflowExecutionCanceledEventAttributes] = js.undefined
  
  /**
    * If the event is of type WorkflowExecutionCompleted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionCompletedEventAttributes: js.UndefOr[WorkflowExecutionCompletedEventAttributes] = js.undefined
  
  /**
    * If the event is of type WorkflowExecutionContinuedAsNew then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionContinuedAsNewEventAttributes: js.UndefOr[WorkflowExecutionContinuedAsNewEventAttributes] = js.undefined
  
  /**
    * If the event is of type WorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionFailedEventAttributes: js.UndefOr[WorkflowExecutionFailedEventAttributes] = js.undefined
  
  /**
    * If the event is of type WorkflowExecutionSignaled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionSignaledEventAttributes: js.UndefOr[WorkflowExecutionSignaledEventAttributes] = js.undefined
  
  /**
    * If the event is of type WorkflowExecutionStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionStartedEventAttributes: js.UndefOr[WorkflowExecutionStartedEventAttributes] = js.undefined
  
  /**
    * If the event is of type WorkflowExecutionTerminated then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionTerminatedEventAttributes: js.UndefOr[WorkflowExecutionTerminatedEventAttributes] = js.undefined
  
  /**
    * If the event is of type WorkflowExecutionTimedOut then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionTimedOutEventAttributes: js.UndefOr[WorkflowExecutionTimedOutEventAttributes] = js.undefined
}
object HistoryEvent {
  
  inline def apply(eventId: EventId, eventTimestamp: Timestamp, eventType: EventType): HistoryEvent = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], eventTimestamp = eventTimestamp.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryEvent]
  }
  
  extension [Self <: HistoryEvent](x: Self) {
    
    inline def setActivityTaskCancelRequestedEventAttributes(value: ActivityTaskCancelRequestedEventAttributes): Self = StObject.set(x, "activityTaskCancelRequestedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setActivityTaskCancelRequestedEventAttributesUndefined: Self = StObject.set(x, "activityTaskCancelRequestedEventAttributes", js.undefined)
    
    inline def setActivityTaskCanceledEventAttributes(value: ActivityTaskCanceledEventAttributes): Self = StObject.set(x, "activityTaskCanceledEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setActivityTaskCanceledEventAttributesUndefined: Self = StObject.set(x, "activityTaskCanceledEventAttributes", js.undefined)
    
    inline def setActivityTaskCompletedEventAttributes(value: ActivityTaskCompletedEventAttributes): Self = StObject.set(x, "activityTaskCompletedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setActivityTaskCompletedEventAttributesUndefined: Self = StObject.set(x, "activityTaskCompletedEventAttributes", js.undefined)
    
    inline def setActivityTaskFailedEventAttributes(value: ActivityTaskFailedEventAttributes): Self = StObject.set(x, "activityTaskFailedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setActivityTaskFailedEventAttributesUndefined: Self = StObject.set(x, "activityTaskFailedEventAttributes", js.undefined)
    
    inline def setActivityTaskScheduledEventAttributes(value: ActivityTaskScheduledEventAttributes): Self = StObject.set(x, "activityTaskScheduledEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setActivityTaskScheduledEventAttributesUndefined: Self = StObject.set(x, "activityTaskScheduledEventAttributes", js.undefined)
    
    inline def setActivityTaskStartedEventAttributes(value: ActivityTaskStartedEventAttributes): Self = StObject.set(x, "activityTaskStartedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setActivityTaskStartedEventAttributesUndefined: Self = StObject.set(x, "activityTaskStartedEventAttributes", js.undefined)
    
    inline def setActivityTaskTimedOutEventAttributes(value: ActivityTaskTimedOutEventAttributes): Self = StObject.set(x, "activityTaskTimedOutEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setActivityTaskTimedOutEventAttributesUndefined: Self = StObject.set(x, "activityTaskTimedOutEventAttributes", js.undefined)
    
    inline def setCancelTimerFailedEventAttributes(value: CancelTimerFailedEventAttributes): Self = StObject.set(x, "cancelTimerFailedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setCancelTimerFailedEventAttributesUndefined: Self = StObject.set(x, "cancelTimerFailedEventAttributes", js.undefined)
    
    inline def setCancelWorkflowExecutionFailedEventAttributes(value: CancelWorkflowExecutionFailedEventAttributes): Self = StObject.set(x, "cancelWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setCancelWorkflowExecutionFailedEventAttributesUndefined: Self = StObject.set(x, "cancelWorkflowExecutionFailedEventAttributes", js.undefined)
    
    inline def setChildWorkflowExecutionCanceledEventAttributes(value: ChildWorkflowExecutionCanceledEventAttributes): Self = StObject.set(x, "childWorkflowExecutionCanceledEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setChildWorkflowExecutionCanceledEventAttributesUndefined: Self = StObject.set(x, "childWorkflowExecutionCanceledEventAttributes", js.undefined)
    
    inline def setChildWorkflowExecutionCompletedEventAttributes(value: ChildWorkflowExecutionCompletedEventAttributes): Self = StObject.set(x, "childWorkflowExecutionCompletedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setChildWorkflowExecutionCompletedEventAttributesUndefined: Self = StObject.set(x, "childWorkflowExecutionCompletedEventAttributes", js.undefined)
    
    inline def setChildWorkflowExecutionFailedEventAttributes(value: ChildWorkflowExecutionFailedEventAttributes): Self = StObject.set(x, "childWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setChildWorkflowExecutionFailedEventAttributesUndefined: Self = StObject.set(x, "childWorkflowExecutionFailedEventAttributes", js.undefined)
    
    inline def setChildWorkflowExecutionStartedEventAttributes(value: ChildWorkflowExecutionStartedEventAttributes): Self = StObject.set(x, "childWorkflowExecutionStartedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setChildWorkflowExecutionStartedEventAttributesUndefined: Self = StObject.set(x, "childWorkflowExecutionStartedEventAttributes", js.undefined)
    
    inline def setChildWorkflowExecutionTerminatedEventAttributes(value: ChildWorkflowExecutionTerminatedEventAttributes): Self = StObject.set(x, "childWorkflowExecutionTerminatedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setChildWorkflowExecutionTerminatedEventAttributesUndefined: Self = StObject.set(x, "childWorkflowExecutionTerminatedEventAttributes", js.undefined)
    
    inline def setChildWorkflowExecutionTimedOutEventAttributes(value: ChildWorkflowExecutionTimedOutEventAttributes): Self = StObject.set(x, "childWorkflowExecutionTimedOutEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setChildWorkflowExecutionTimedOutEventAttributesUndefined: Self = StObject.set(x, "childWorkflowExecutionTimedOutEventAttributes", js.undefined)
    
    inline def setCompleteWorkflowExecutionFailedEventAttributes(value: CompleteWorkflowExecutionFailedEventAttributes): Self = StObject.set(x, "completeWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setCompleteWorkflowExecutionFailedEventAttributesUndefined: Self = StObject.set(x, "completeWorkflowExecutionFailedEventAttributes", js.undefined)
    
    inline def setContinueAsNewWorkflowExecutionFailedEventAttributes(value: ContinueAsNewWorkflowExecutionFailedEventAttributes): Self = StObject.set(x, "continueAsNewWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setContinueAsNewWorkflowExecutionFailedEventAttributesUndefined: Self = StObject.set(x, "continueAsNewWorkflowExecutionFailedEventAttributes", js.undefined)
    
    inline def setDecisionTaskCompletedEventAttributes(value: DecisionTaskCompletedEventAttributes): Self = StObject.set(x, "decisionTaskCompletedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setDecisionTaskCompletedEventAttributesUndefined: Self = StObject.set(x, "decisionTaskCompletedEventAttributes", js.undefined)
    
    inline def setDecisionTaskScheduledEventAttributes(value: DecisionTaskScheduledEventAttributes): Self = StObject.set(x, "decisionTaskScheduledEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setDecisionTaskScheduledEventAttributesUndefined: Self = StObject.set(x, "decisionTaskScheduledEventAttributes", js.undefined)
    
    inline def setDecisionTaskStartedEventAttributes(value: DecisionTaskStartedEventAttributes): Self = StObject.set(x, "decisionTaskStartedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setDecisionTaskStartedEventAttributesUndefined: Self = StObject.set(x, "decisionTaskStartedEventAttributes", js.undefined)
    
    inline def setDecisionTaskTimedOutEventAttributes(value: DecisionTaskTimedOutEventAttributes): Self = StObject.set(x, "decisionTaskTimedOutEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setDecisionTaskTimedOutEventAttributesUndefined: Self = StObject.set(x, "decisionTaskTimedOutEventAttributes", js.undefined)
    
    inline def setEventId(value: EventId): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventTimestamp(value: Timestamp): Self = StObject.set(x, "eventTimestamp", value.asInstanceOf[js.Any])
    
    inline def setEventType(value: EventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setExternalWorkflowExecutionCancelRequestedEventAttributes(value: ExternalWorkflowExecutionCancelRequestedEventAttributes): Self = StObject.set(x, "externalWorkflowExecutionCancelRequestedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setExternalWorkflowExecutionCancelRequestedEventAttributesUndefined: Self = StObject.set(x, "externalWorkflowExecutionCancelRequestedEventAttributes", js.undefined)
    
    inline def setExternalWorkflowExecutionSignaledEventAttributes(value: ExternalWorkflowExecutionSignaledEventAttributes): Self = StObject.set(x, "externalWorkflowExecutionSignaledEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setExternalWorkflowExecutionSignaledEventAttributesUndefined: Self = StObject.set(x, "externalWorkflowExecutionSignaledEventAttributes", js.undefined)
    
    inline def setFailWorkflowExecutionFailedEventAttributes(value: FailWorkflowExecutionFailedEventAttributes): Self = StObject.set(x, "failWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setFailWorkflowExecutionFailedEventAttributesUndefined: Self = StObject.set(x, "failWorkflowExecutionFailedEventAttributes", js.undefined)
    
    inline def setLambdaFunctionCompletedEventAttributes(value: LambdaFunctionCompletedEventAttributes): Self = StObject.set(x, "lambdaFunctionCompletedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionCompletedEventAttributesUndefined: Self = StObject.set(x, "lambdaFunctionCompletedEventAttributes", js.undefined)
    
    inline def setLambdaFunctionFailedEventAttributes(value: LambdaFunctionFailedEventAttributes): Self = StObject.set(x, "lambdaFunctionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionFailedEventAttributesUndefined: Self = StObject.set(x, "lambdaFunctionFailedEventAttributes", js.undefined)
    
    inline def setLambdaFunctionScheduledEventAttributes(value: LambdaFunctionScheduledEventAttributes): Self = StObject.set(x, "lambdaFunctionScheduledEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionScheduledEventAttributesUndefined: Self = StObject.set(x, "lambdaFunctionScheduledEventAttributes", js.undefined)
    
    inline def setLambdaFunctionStartedEventAttributes(value: LambdaFunctionStartedEventAttributes): Self = StObject.set(x, "lambdaFunctionStartedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionStartedEventAttributesUndefined: Self = StObject.set(x, "lambdaFunctionStartedEventAttributes", js.undefined)
    
    inline def setLambdaFunctionTimedOutEventAttributes(value: LambdaFunctionTimedOutEventAttributes): Self = StObject.set(x, "lambdaFunctionTimedOutEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionTimedOutEventAttributesUndefined: Self = StObject.set(x, "lambdaFunctionTimedOutEventAttributes", js.undefined)
    
    inline def setMarkerRecordedEventAttributes(value: MarkerRecordedEventAttributes): Self = StObject.set(x, "markerRecordedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setMarkerRecordedEventAttributesUndefined: Self = StObject.set(x, "markerRecordedEventAttributes", js.undefined)
    
    inline def setRecordMarkerFailedEventAttributes(value: RecordMarkerFailedEventAttributes): Self = StObject.set(x, "recordMarkerFailedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setRecordMarkerFailedEventAttributesUndefined: Self = StObject.set(x, "recordMarkerFailedEventAttributes", js.undefined)
    
    inline def setRequestCancelActivityTaskFailedEventAttributes(value: RequestCancelActivityTaskFailedEventAttributes): Self = StObject.set(x, "requestCancelActivityTaskFailedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setRequestCancelActivityTaskFailedEventAttributesUndefined: Self = StObject.set(x, "requestCancelActivityTaskFailedEventAttributes", js.undefined)
    
    inline def setRequestCancelExternalWorkflowExecutionFailedEventAttributes(value: RequestCancelExternalWorkflowExecutionFailedEventAttributes): Self = StObject.set(x, "requestCancelExternalWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setRequestCancelExternalWorkflowExecutionFailedEventAttributesUndefined: Self = StObject.set(x, "requestCancelExternalWorkflowExecutionFailedEventAttributes", js.undefined)
    
    inline def setRequestCancelExternalWorkflowExecutionInitiatedEventAttributes(value: RequestCancelExternalWorkflowExecutionInitiatedEventAttributes): Self = StObject.set(x, "requestCancelExternalWorkflowExecutionInitiatedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setRequestCancelExternalWorkflowExecutionInitiatedEventAttributesUndefined: Self = StObject.set(x, "requestCancelExternalWorkflowExecutionInitiatedEventAttributes", js.undefined)
    
    inline def setScheduleActivityTaskFailedEventAttributes(value: ScheduleActivityTaskFailedEventAttributes): Self = StObject.set(x, "scheduleActivityTaskFailedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setScheduleActivityTaskFailedEventAttributesUndefined: Self = StObject.set(x, "scheduleActivityTaskFailedEventAttributes", js.undefined)
    
    inline def setScheduleLambdaFunctionFailedEventAttributes(value: ScheduleLambdaFunctionFailedEventAttributes): Self = StObject.set(x, "scheduleLambdaFunctionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setScheduleLambdaFunctionFailedEventAttributesUndefined: Self = StObject.set(x, "scheduleLambdaFunctionFailedEventAttributes", js.undefined)
    
    inline def setSignalExternalWorkflowExecutionFailedEventAttributes(value: SignalExternalWorkflowExecutionFailedEventAttributes): Self = StObject.set(x, "signalExternalWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setSignalExternalWorkflowExecutionFailedEventAttributesUndefined: Self = StObject.set(x, "signalExternalWorkflowExecutionFailedEventAttributes", js.undefined)
    
    inline def setSignalExternalWorkflowExecutionInitiatedEventAttributes(value: SignalExternalWorkflowExecutionInitiatedEventAttributes): Self = StObject.set(x, "signalExternalWorkflowExecutionInitiatedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setSignalExternalWorkflowExecutionInitiatedEventAttributesUndefined: Self = StObject.set(x, "signalExternalWorkflowExecutionInitiatedEventAttributes", js.undefined)
    
    inline def setStartChildWorkflowExecutionFailedEventAttributes(value: StartChildWorkflowExecutionFailedEventAttributes): Self = StObject.set(x, "startChildWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setStartChildWorkflowExecutionFailedEventAttributesUndefined: Self = StObject.set(x, "startChildWorkflowExecutionFailedEventAttributes", js.undefined)
    
    inline def setStartChildWorkflowExecutionInitiatedEventAttributes(value: StartChildWorkflowExecutionInitiatedEventAttributes): Self = StObject.set(x, "startChildWorkflowExecutionInitiatedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setStartChildWorkflowExecutionInitiatedEventAttributesUndefined: Self = StObject.set(x, "startChildWorkflowExecutionInitiatedEventAttributes", js.undefined)
    
    inline def setStartLambdaFunctionFailedEventAttributes(value: StartLambdaFunctionFailedEventAttributes): Self = StObject.set(x, "startLambdaFunctionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setStartLambdaFunctionFailedEventAttributesUndefined: Self = StObject.set(x, "startLambdaFunctionFailedEventAttributes", js.undefined)
    
    inline def setStartTimerFailedEventAttributes(value: StartTimerFailedEventAttributes): Self = StObject.set(x, "startTimerFailedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setStartTimerFailedEventAttributesUndefined: Self = StObject.set(x, "startTimerFailedEventAttributes", js.undefined)
    
    inline def setTimerCanceledEventAttributes(value: TimerCanceledEventAttributes): Self = StObject.set(x, "timerCanceledEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setTimerCanceledEventAttributesUndefined: Self = StObject.set(x, "timerCanceledEventAttributes", js.undefined)
    
    inline def setTimerFiredEventAttributes(value: TimerFiredEventAttributes): Self = StObject.set(x, "timerFiredEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setTimerFiredEventAttributesUndefined: Self = StObject.set(x, "timerFiredEventAttributes", js.undefined)
    
    inline def setTimerStartedEventAttributes(value: TimerStartedEventAttributes): Self = StObject.set(x, "timerStartedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setTimerStartedEventAttributesUndefined: Self = StObject.set(x, "timerStartedEventAttributes", js.undefined)
    
    inline def setWorkflowExecutionCancelRequestedEventAttributes(value: WorkflowExecutionCancelRequestedEventAttributes): Self = StObject.set(x, "workflowExecutionCancelRequestedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setWorkflowExecutionCancelRequestedEventAttributesUndefined: Self = StObject.set(x, "workflowExecutionCancelRequestedEventAttributes", js.undefined)
    
    inline def setWorkflowExecutionCanceledEventAttributes(value: WorkflowExecutionCanceledEventAttributes): Self = StObject.set(x, "workflowExecutionCanceledEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setWorkflowExecutionCanceledEventAttributesUndefined: Self = StObject.set(x, "workflowExecutionCanceledEventAttributes", js.undefined)
    
    inline def setWorkflowExecutionCompletedEventAttributes(value: WorkflowExecutionCompletedEventAttributes): Self = StObject.set(x, "workflowExecutionCompletedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setWorkflowExecutionCompletedEventAttributesUndefined: Self = StObject.set(x, "workflowExecutionCompletedEventAttributes", js.undefined)
    
    inline def setWorkflowExecutionContinuedAsNewEventAttributes(value: WorkflowExecutionContinuedAsNewEventAttributes): Self = StObject.set(x, "workflowExecutionContinuedAsNewEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setWorkflowExecutionContinuedAsNewEventAttributesUndefined: Self = StObject.set(x, "workflowExecutionContinuedAsNewEventAttributes", js.undefined)
    
    inline def setWorkflowExecutionFailedEventAttributes(value: WorkflowExecutionFailedEventAttributes): Self = StObject.set(x, "workflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setWorkflowExecutionFailedEventAttributesUndefined: Self = StObject.set(x, "workflowExecutionFailedEventAttributes", js.undefined)
    
    inline def setWorkflowExecutionSignaledEventAttributes(value: WorkflowExecutionSignaledEventAttributes): Self = StObject.set(x, "workflowExecutionSignaledEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setWorkflowExecutionSignaledEventAttributesUndefined: Self = StObject.set(x, "workflowExecutionSignaledEventAttributes", js.undefined)
    
    inline def setWorkflowExecutionStartedEventAttributes(value: WorkflowExecutionStartedEventAttributes): Self = StObject.set(x, "workflowExecutionStartedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setWorkflowExecutionStartedEventAttributesUndefined: Self = StObject.set(x, "workflowExecutionStartedEventAttributes", js.undefined)
    
    inline def setWorkflowExecutionTerminatedEventAttributes(value: WorkflowExecutionTerminatedEventAttributes): Self = StObject.set(x, "workflowExecutionTerminatedEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setWorkflowExecutionTerminatedEventAttributesUndefined: Self = StObject.set(x, "workflowExecutionTerminatedEventAttributes", js.undefined)
    
    inline def setWorkflowExecutionTimedOutEventAttributes(value: WorkflowExecutionTimedOutEventAttributes): Self = StObject.set(x, "workflowExecutionTimedOutEventAttributes", value.asInstanceOf[js.Any])
    
    inline def setWorkflowExecutionTimedOutEventAttributesUndefined: Self = StObject.set(x, "workflowExecutionTimedOutEventAttributes", js.undefined)
  }
}
