package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryEvent extends js.Object {
  /**
    * If the event is of type ActivityTaskcancelRequested then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskCancelRequestedEventAttributes: js.UndefOr[ActivityTaskCancelRequestedEventAttributes] = js.native
  /**
    * If the event is of type ActivityTaskCanceled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskCanceledEventAttributes: js.UndefOr[ActivityTaskCanceledEventAttributes] = js.native
  /**
    * If the event is of type ActivityTaskCompleted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskCompletedEventAttributes: js.UndefOr[ActivityTaskCompletedEventAttributes] = js.native
  /**
    * If the event is of type ActivityTaskFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskFailedEventAttributes: js.UndefOr[ActivityTaskFailedEventAttributes] = js.native
  /**
    * If the event is of type ActivityTaskScheduled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskScheduledEventAttributes: js.UndefOr[ActivityTaskScheduledEventAttributes] = js.native
  /**
    * If the event is of type ActivityTaskStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskStartedEventAttributes: js.UndefOr[ActivityTaskStartedEventAttributes] = js.native
  /**
    * If the event is of type ActivityTaskTimedOut then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskTimedOutEventAttributes: js.UndefOr[ActivityTaskTimedOutEventAttributes] = js.native
  /**
    * If the event is of type CancelTimerFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var cancelTimerFailedEventAttributes: js.UndefOr[CancelTimerFailedEventAttributes] = js.native
  /**
    * If the event is of type CancelWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var cancelWorkflowExecutionFailedEventAttributes: js.UndefOr[CancelWorkflowExecutionFailedEventAttributes] = js.native
  /**
    * If the event is of type ChildWorkflowExecutionCanceled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionCanceledEventAttributes: js.UndefOr[ChildWorkflowExecutionCanceledEventAttributes] = js.native
  /**
    * If the event is of type ChildWorkflowExecutionCompleted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionCompletedEventAttributes: js.UndefOr[ChildWorkflowExecutionCompletedEventAttributes] = js.native
  /**
    * If the event is of type ChildWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionFailedEventAttributes: js.UndefOr[ChildWorkflowExecutionFailedEventAttributes] = js.native
  /**
    * If the event is of type ChildWorkflowExecutionStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionStartedEventAttributes: js.UndefOr[ChildWorkflowExecutionStartedEventAttributes] = js.native
  /**
    * If the event is of type ChildWorkflowExecutionTerminated then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionTerminatedEventAttributes: js.UndefOr[ChildWorkflowExecutionTerminatedEventAttributes] = js.native
  /**
    * If the event is of type ChildWorkflowExecutionTimedOut then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionTimedOutEventAttributes: js.UndefOr[ChildWorkflowExecutionTimedOutEventAttributes] = js.native
  /**
    * If the event is of type CompleteWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var completeWorkflowExecutionFailedEventAttributes: js.UndefOr[CompleteWorkflowExecutionFailedEventAttributes] = js.native
  /**
    * If the event is of type ContinueAsNewWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var continueAsNewWorkflowExecutionFailedEventAttributes: js.UndefOr[ContinueAsNewWorkflowExecutionFailedEventAttributes] = js.native
  /**
    * If the event is of type DecisionTaskCompleted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var decisionTaskCompletedEventAttributes: js.UndefOr[DecisionTaskCompletedEventAttributes] = js.native
  /**
    * If the event is of type DecisionTaskScheduled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var decisionTaskScheduledEventAttributes: js.UndefOr[DecisionTaskScheduledEventAttributes] = js.native
  /**
    * If the event is of type DecisionTaskStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var decisionTaskStartedEventAttributes: js.UndefOr[DecisionTaskStartedEventAttributes] = js.native
  /**
    * If the event is of type DecisionTaskTimedOut then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var decisionTaskTimedOutEventAttributes: js.UndefOr[DecisionTaskTimedOutEventAttributes] = js.native
  /**
    * The system generated ID of the event. This ID uniquely identifies the event with in the workflow execution history.
    */
  var eventId: EventId = js.native
  /**
    * The date and time when the event occurred.
    */
  var eventTimestamp: Timestamp = js.native
  /**
    * The type of the history event.
    */
  var eventType: EventType = js.native
  /**
    * If the event is of type ExternalWorkflowExecutionCancelRequested then this member is set and provides detailed information about the event. It isn't set for other event types. 
    */
  var externalWorkflowExecutionCancelRequestedEventAttributes: js.UndefOr[ExternalWorkflowExecutionCancelRequestedEventAttributes] = js.native
  /**
    * If the event is of type ExternalWorkflowExecutionSignaled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var externalWorkflowExecutionSignaledEventAttributes: js.UndefOr[ExternalWorkflowExecutionSignaledEventAttributes] = js.native
  /**
    * If the event is of type FailWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var failWorkflowExecutionFailedEventAttributes: js.UndefOr[FailWorkflowExecutionFailedEventAttributes] = js.native
  /**
    * Provides the details of the LambdaFunctionCompleted event. It isn't set for other event types.
    */
  var lambdaFunctionCompletedEventAttributes: js.UndefOr[LambdaFunctionCompletedEventAttributes] = js.native
  /**
    * Provides the details of the LambdaFunctionFailed event. It isn't set for other event types.
    */
  var lambdaFunctionFailedEventAttributes: js.UndefOr[LambdaFunctionFailedEventAttributes] = js.native
  /**
    * Provides the details of the LambdaFunctionScheduled event. It isn't set for other event types.
    */
  var lambdaFunctionScheduledEventAttributes: js.UndefOr[LambdaFunctionScheduledEventAttributes] = js.native
  /**
    * Provides the details of the LambdaFunctionStarted event. It isn't set for other event types.
    */
  var lambdaFunctionStartedEventAttributes: js.UndefOr[LambdaFunctionStartedEventAttributes] = js.native
  /**
    * Provides the details of the LambdaFunctionTimedOut event. It isn't set for other event types.
    */
  var lambdaFunctionTimedOutEventAttributes: js.UndefOr[LambdaFunctionTimedOutEventAttributes] = js.native
  /**
    * If the event is of type MarkerRecorded then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var markerRecordedEventAttributes: js.UndefOr[MarkerRecordedEventAttributes] = js.native
  /**
    * If the event is of type DecisionTaskFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var recordMarkerFailedEventAttributes: js.UndefOr[RecordMarkerFailedEventAttributes] = js.native
  /**
    * If the event is of type RequestCancelActivityTaskFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var requestCancelActivityTaskFailedEventAttributes: js.UndefOr[RequestCancelActivityTaskFailedEventAttributes] = js.native
  /**
    * If the event is of type RequestCancelExternalWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var requestCancelExternalWorkflowExecutionFailedEventAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionFailedEventAttributes] = js.native
  /**
    * If the event is of type RequestCancelExternalWorkflowExecutionInitiated then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var requestCancelExternalWorkflowExecutionInitiatedEventAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionInitiatedEventAttributes] = js.native
  /**
    * If the event is of type ScheduleActivityTaskFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var scheduleActivityTaskFailedEventAttributes: js.UndefOr[ScheduleActivityTaskFailedEventAttributes] = js.native
  /**
    * Provides the details of the ScheduleLambdaFunctionFailed event. It isn't set for other event types.
    */
  var scheduleLambdaFunctionFailedEventAttributes: js.UndefOr[ScheduleLambdaFunctionFailedEventAttributes] = js.native
  /**
    * If the event is of type SignalExternalWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var signalExternalWorkflowExecutionFailedEventAttributes: js.UndefOr[SignalExternalWorkflowExecutionFailedEventAttributes] = js.native
  /**
    * If the event is of type SignalExternalWorkflowExecutionInitiated then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var signalExternalWorkflowExecutionInitiatedEventAttributes: js.UndefOr[SignalExternalWorkflowExecutionInitiatedEventAttributes] = js.native
  /**
    * If the event is of type StartChildWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var startChildWorkflowExecutionFailedEventAttributes: js.UndefOr[StartChildWorkflowExecutionFailedEventAttributes] = js.native
  /**
    * If the event is of type StartChildWorkflowExecutionInitiated then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var startChildWorkflowExecutionInitiatedEventAttributes: js.UndefOr[StartChildWorkflowExecutionInitiatedEventAttributes] = js.native
  /**
    * Provides the details of the StartLambdaFunctionFailed event. It isn't set for other event types.
    */
  var startLambdaFunctionFailedEventAttributes: js.UndefOr[StartLambdaFunctionFailedEventAttributes] = js.native
  /**
    * If the event is of type StartTimerFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var startTimerFailedEventAttributes: js.UndefOr[StartTimerFailedEventAttributes] = js.native
  /**
    * If the event is of type TimerCanceled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var timerCanceledEventAttributes: js.UndefOr[TimerCanceledEventAttributes] = js.native
  /**
    * If the event is of type TimerFired then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var timerFiredEventAttributes: js.UndefOr[TimerFiredEventAttributes] = js.native
  /**
    * If the event is of type TimerStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var timerStartedEventAttributes: js.UndefOr[TimerStartedEventAttributes] = js.native
  /**
    * If the event is of type WorkflowExecutionCancelRequested then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionCancelRequestedEventAttributes: js.UndefOr[WorkflowExecutionCancelRequestedEventAttributes] = js.native
  /**
    * If the event is of type WorkflowExecutionCanceled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionCanceledEventAttributes: js.UndefOr[WorkflowExecutionCanceledEventAttributes] = js.native
  /**
    * If the event is of type WorkflowExecutionCompleted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionCompletedEventAttributes: js.UndefOr[WorkflowExecutionCompletedEventAttributes] = js.native
  /**
    * If the event is of type WorkflowExecutionContinuedAsNew then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionContinuedAsNewEventAttributes: js.UndefOr[WorkflowExecutionContinuedAsNewEventAttributes] = js.native
  /**
    * If the event is of type WorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionFailedEventAttributes: js.UndefOr[WorkflowExecutionFailedEventAttributes] = js.native
  /**
    * If the event is of type WorkflowExecutionSignaled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionSignaledEventAttributes: js.UndefOr[WorkflowExecutionSignaledEventAttributes] = js.native
  /**
    * If the event is of type WorkflowExecutionStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionStartedEventAttributes: js.UndefOr[WorkflowExecutionStartedEventAttributes] = js.native
  /**
    * If the event is of type WorkflowExecutionTerminated then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionTerminatedEventAttributes: js.UndefOr[WorkflowExecutionTerminatedEventAttributes] = js.native
  /**
    * If the event is of type WorkflowExecutionTimedOut then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionTimedOutEventAttributes: js.UndefOr[WorkflowExecutionTimedOutEventAttributes] = js.native
}

object HistoryEvent {
  @scala.inline
  def apply(eventId: EventId, eventTimestamp: Timestamp, eventType: EventType): HistoryEvent = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], eventTimestamp = eventTimestamp.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryEvent]
  }
  @scala.inline
  implicit class HistoryEventOps[Self <: HistoryEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEventId(value: EventId): Self = this.set("eventId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventTimestamp(value: Timestamp): Self = this.set("eventTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventType(value: EventType): Self = this.set("eventType", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivityTaskCancelRequestedEventAttributes(value: ActivityTaskCancelRequestedEventAttributes): Self = this.set("activityTaskCancelRequestedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityTaskCancelRequestedEventAttributes: Self = this.set("activityTaskCancelRequestedEventAttributes", js.undefined)
    @scala.inline
    def setActivityTaskCanceledEventAttributes(value: ActivityTaskCanceledEventAttributes): Self = this.set("activityTaskCanceledEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityTaskCanceledEventAttributes: Self = this.set("activityTaskCanceledEventAttributes", js.undefined)
    @scala.inline
    def setActivityTaskCompletedEventAttributes(value: ActivityTaskCompletedEventAttributes): Self = this.set("activityTaskCompletedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityTaskCompletedEventAttributes: Self = this.set("activityTaskCompletedEventAttributes", js.undefined)
    @scala.inline
    def setActivityTaskFailedEventAttributes(value: ActivityTaskFailedEventAttributes): Self = this.set("activityTaskFailedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityTaskFailedEventAttributes: Self = this.set("activityTaskFailedEventAttributes", js.undefined)
    @scala.inline
    def setActivityTaskScheduledEventAttributes(value: ActivityTaskScheduledEventAttributes): Self = this.set("activityTaskScheduledEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityTaskScheduledEventAttributes: Self = this.set("activityTaskScheduledEventAttributes", js.undefined)
    @scala.inline
    def setActivityTaskStartedEventAttributes(value: ActivityTaskStartedEventAttributes): Self = this.set("activityTaskStartedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityTaskStartedEventAttributes: Self = this.set("activityTaskStartedEventAttributes", js.undefined)
    @scala.inline
    def setActivityTaskTimedOutEventAttributes(value: ActivityTaskTimedOutEventAttributes): Self = this.set("activityTaskTimedOutEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityTaskTimedOutEventAttributes: Self = this.set("activityTaskTimedOutEventAttributes", js.undefined)
    @scala.inline
    def setCancelTimerFailedEventAttributes(value: CancelTimerFailedEventAttributes): Self = this.set("cancelTimerFailedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelTimerFailedEventAttributes: Self = this.set("cancelTimerFailedEventAttributes", js.undefined)
    @scala.inline
    def setCancelWorkflowExecutionFailedEventAttributes(value: CancelWorkflowExecutionFailedEventAttributes): Self = this.set("cancelWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelWorkflowExecutionFailedEventAttributes: Self = this.set("cancelWorkflowExecutionFailedEventAttributes", js.undefined)
    @scala.inline
    def setChildWorkflowExecutionCanceledEventAttributes(value: ChildWorkflowExecutionCanceledEventAttributes): Self = this.set("childWorkflowExecutionCanceledEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildWorkflowExecutionCanceledEventAttributes: Self = this.set("childWorkflowExecutionCanceledEventAttributes", js.undefined)
    @scala.inline
    def setChildWorkflowExecutionCompletedEventAttributes(value: ChildWorkflowExecutionCompletedEventAttributes): Self = this.set("childWorkflowExecutionCompletedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildWorkflowExecutionCompletedEventAttributes: Self = this.set("childWorkflowExecutionCompletedEventAttributes", js.undefined)
    @scala.inline
    def setChildWorkflowExecutionFailedEventAttributes(value: ChildWorkflowExecutionFailedEventAttributes): Self = this.set("childWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildWorkflowExecutionFailedEventAttributes: Self = this.set("childWorkflowExecutionFailedEventAttributes", js.undefined)
    @scala.inline
    def setChildWorkflowExecutionStartedEventAttributes(value: ChildWorkflowExecutionStartedEventAttributes): Self = this.set("childWorkflowExecutionStartedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildWorkflowExecutionStartedEventAttributes: Self = this.set("childWorkflowExecutionStartedEventAttributes", js.undefined)
    @scala.inline
    def setChildWorkflowExecutionTerminatedEventAttributes(value: ChildWorkflowExecutionTerminatedEventAttributes): Self = this.set("childWorkflowExecutionTerminatedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildWorkflowExecutionTerminatedEventAttributes: Self = this.set("childWorkflowExecutionTerminatedEventAttributes", js.undefined)
    @scala.inline
    def setChildWorkflowExecutionTimedOutEventAttributes(value: ChildWorkflowExecutionTimedOutEventAttributes): Self = this.set("childWorkflowExecutionTimedOutEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildWorkflowExecutionTimedOutEventAttributes: Self = this.set("childWorkflowExecutionTimedOutEventAttributes", js.undefined)
    @scala.inline
    def setCompleteWorkflowExecutionFailedEventAttributes(value: CompleteWorkflowExecutionFailedEventAttributes): Self = this.set("completeWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompleteWorkflowExecutionFailedEventAttributes: Self = this.set("completeWorkflowExecutionFailedEventAttributes", js.undefined)
    @scala.inline
    def setContinueAsNewWorkflowExecutionFailedEventAttributes(value: ContinueAsNewWorkflowExecutionFailedEventAttributes): Self = this.set("continueAsNewWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinueAsNewWorkflowExecutionFailedEventAttributes: Self = this.set("continueAsNewWorkflowExecutionFailedEventAttributes", js.undefined)
    @scala.inline
    def setDecisionTaskCompletedEventAttributes(value: DecisionTaskCompletedEventAttributes): Self = this.set("decisionTaskCompletedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecisionTaskCompletedEventAttributes: Self = this.set("decisionTaskCompletedEventAttributes", js.undefined)
    @scala.inline
    def setDecisionTaskScheduledEventAttributes(value: DecisionTaskScheduledEventAttributes): Self = this.set("decisionTaskScheduledEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecisionTaskScheduledEventAttributes: Self = this.set("decisionTaskScheduledEventAttributes", js.undefined)
    @scala.inline
    def setDecisionTaskStartedEventAttributes(value: DecisionTaskStartedEventAttributes): Self = this.set("decisionTaskStartedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecisionTaskStartedEventAttributes: Self = this.set("decisionTaskStartedEventAttributes", js.undefined)
    @scala.inline
    def setDecisionTaskTimedOutEventAttributes(value: DecisionTaskTimedOutEventAttributes): Self = this.set("decisionTaskTimedOutEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecisionTaskTimedOutEventAttributes: Self = this.set("decisionTaskTimedOutEventAttributes", js.undefined)
    @scala.inline
    def setExternalWorkflowExecutionCancelRequestedEventAttributes(value: ExternalWorkflowExecutionCancelRequestedEventAttributes): Self = this.set("externalWorkflowExecutionCancelRequestedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalWorkflowExecutionCancelRequestedEventAttributes: Self = this.set("externalWorkflowExecutionCancelRequestedEventAttributes", js.undefined)
    @scala.inline
    def setExternalWorkflowExecutionSignaledEventAttributes(value: ExternalWorkflowExecutionSignaledEventAttributes): Self = this.set("externalWorkflowExecutionSignaledEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalWorkflowExecutionSignaledEventAttributes: Self = this.set("externalWorkflowExecutionSignaledEventAttributes", js.undefined)
    @scala.inline
    def setFailWorkflowExecutionFailedEventAttributes(value: FailWorkflowExecutionFailedEventAttributes): Self = this.set("failWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailWorkflowExecutionFailedEventAttributes: Self = this.set("failWorkflowExecutionFailedEventAttributes", js.undefined)
    @scala.inline
    def setLambdaFunctionCompletedEventAttributes(value: LambdaFunctionCompletedEventAttributes): Self = this.set("lambdaFunctionCompletedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaFunctionCompletedEventAttributes: Self = this.set("lambdaFunctionCompletedEventAttributes", js.undefined)
    @scala.inline
    def setLambdaFunctionFailedEventAttributes(value: LambdaFunctionFailedEventAttributes): Self = this.set("lambdaFunctionFailedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaFunctionFailedEventAttributes: Self = this.set("lambdaFunctionFailedEventAttributes", js.undefined)
    @scala.inline
    def setLambdaFunctionScheduledEventAttributes(value: LambdaFunctionScheduledEventAttributes): Self = this.set("lambdaFunctionScheduledEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaFunctionScheduledEventAttributes: Self = this.set("lambdaFunctionScheduledEventAttributes", js.undefined)
    @scala.inline
    def setLambdaFunctionStartedEventAttributes(value: LambdaFunctionStartedEventAttributes): Self = this.set("lambdaFunctionStartedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaFunctionStartedEventAttributes: Self = this.set("lambdaFunctionStartedEventAttributes", js.undefined)
    @scala.inline
    def setLambdaFunctionTimedOutEventAttributes(value: LambdaFunctionTimedOutEventAttributes): Self = this.set("lambdaFunctionTimedOutEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaFunctionTimedOutEventAttributes: Self = this.set("lambdaFunctionTimedOutEventAttributes", js.undefined)
    @scala.inline
    def setMarkerRecordedEventAttributes(value: MarkerRecordedEventAttributes): Self = this.set("markerRecordedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerRecordedEventAttributes: Self = this.set("markerRecordedEventAttributes", js.undefined)
    @scala.inline
    def setRecordMarkerFailedEventAttributes(value: RecordMarkerFailedEventAttributes): Self = this.set("recordMarkerFailedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordMarkerFailedEventAttributes: Self = this.set("recordMarkerFailedEventAttributes", js.undefined)
    @scala.inline
    def setRequestCancelActivityTaskFailedEventAttributes(value: RequestCancelActivityTaskFailedEventAttributes): Self = this.set("requestCancelActivityTaskFailedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCancelActivityTaskFailedEventAttributes: Self = this.set("requestCancelActivityTaskFailedEventAttributes", js.undefined)
    @scala.inline
    def setRequestCancelExternalWorkflowExecutionFailedEventAttributes(value: RequestCancelExternalWorkflowExecutionFailedEventAttributes): Self = this.set("requestCancelExternalWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCancelExternalWorkflowExecutionFailedEventAttributes: Self = this.set("requestCancelExternalWorkflowExecutionFailedEventAttributes", js.undefined)
    @scala.inline
    def setRequestCancelExternalWorkflowExecutionInitiatedEventAttributes(value: RequestCancelExternalWorkflowExecutionInitiatedEventAttributes): Self = this.set("requestCancelExternalWorkflowExecutionInitiatedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCancelExternalWorkflowExecutionInitiatedEventAttributes: Self = this.set("requestCancelExternalWorkflowExecutionInitiatedEventAttributes", js.undefined)
    @scala.inline
    def setScheduleActivityTaskFailedEventAttributes(value: ScheduleActivityTaskFailedEventAttributes): Self = this.set("scheduleActivityTaskFailedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleActivityTaskFailedEventAttributes: Self = this.set("scheduleActivityTaskFailedEventAttributes", js.undefined)
    @scala.inline
    def setScheduleLambdaFunctionFailedEventAttributes(value: ScheduleLambdaFunctionFailedEventAttributes): Self = this.set("scheduleLambdaFunctionFailedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleLambdaFunctionFailedEventAttributes: Self = this.set("scheduleLambdaFunctionFailedEventAttributes", js.undefined)
    @scala.inline
    def setSignalExternalWorkflowExecutionFailedEventAttributes(value: SignalExternalWorkflowExecutionFailedEventAttributes): Self = this.set("signalExternalWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignalExternalWorkflowExecutionFailedEventAttributes: Self = this.set("signalExternalWorkflowExecutionFailedEventAttributes", js.undefined)
    @scala.inline
    def setSignalExternalWorkflowExecutionInitiatedEventAttributes(value: SignalExternalWorkflowExecutionInitiatedEventAttributes): Self = this.set("signalExternalWorkflowExecutionInitiatedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignalExternalWorkflowExecutionInitiatedEventAttributes: Self = this.set("signalExternalWorkflowExecutionInitiatedEventAttributes", js.undefined)
    @scala.inline
    def setStartChildWorkflowExecutionFailedEventAttributes(value: StartChildWorkflowExecutionFailedEventAttributes): Self = this.set("startChildWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartChildWorkflowExecutionFailedEventAttributes: Self = this.set("startChildWorkflowExecutionFailedEventAttributes", js.undefined)
    @scala.inline
    def setStartChildWorkflowExecutionInitiatedEventAttributes(value: StartChildWorkflowExecutionInitiatedEventAttributes): Self = this.set("startChildWorkflowExecutionInitiatedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartChildWorkflowExecutionInitiatedEventAttributes: Self = this.set("startChildWorkflowExecutionInitiatedEventAttributes", js.undefined)
    @scala.inline
    def setStartLambdaFunctionFailedEventAttributes(value: StartLambdaFunctionFailedEventAttributes): Self = this.set("startLambdaFunctionFailedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartLambdaFunctionFailedEventAttributes: Self = this.set("startLambdaFunctionFailedEventAttributes", js.undefined)
    @scala.inline
    def setStartTimerFailedEventAttributes(value: StartTimerFailedEventAttributes): Self = this.set("startTimerFailedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTimerFailedEventAttributes: Self = this.set("startTimerFailedEventAttributes", js.undefined)
    @scala.inline
    def setTimerCanceledEventAttributes(value: TimerCanceledEventAttributes): Self = this.set("timerCanceledEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimerCanceledEventAttributes: Self = this.set("timerCanceledEventAttributes", js.undefined)
    @scala.inline
    def setTimerFiredEventAttributes(value: TimerFiredEventAttributes): Self = this.set("timerFiredEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimerFiredEventAttributes: Self = this.set("timerFiredEventAttributes", js.undefined)
    @scala.inline
    def setTimerStartedEventAttributes(value: TimerStartedEventAttributes): Self = this.set("timerStartedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimerStartedEventAttributes: Self = this.set("timerStartedEventAttributes", js.undefined)
    @scala.inline
    def setWorkflowExecutionCancelRequestedEventAttributes(value: WorkflowExecutionCancelRequestedEventAttributes): Self = this.set("workflowExecutionCancelRequestedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkflowExecutionCancelRequestedEventAttributes: Self = this.set("workflowExecutionCancelRequestedEventAttributes", js.undefined)
    @scala.inline
    def setWorkflowExecutionCanceledEventAttributes(value: WorkflowExecutionCanceledEventAttributes): Self = this.set("workflowExecutionCanceledEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkflowExecutionCanceledEventAttributes: Self = this.set("workflowExecutionCanceledEventAttributes", js.undefined)
    @scala.inline
    def setWorkflowExecutionCompletedEventAttributes(value: WorkflowExecutionCompletedEventAttributes): Self = this.set("workflowExecutionCompletedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkflowExecutionCompletedEventAttributes: Self = this.set("workflowExecutionCompletedEventAttributes", js.undefined)
    @scala.inline
    def setWorkflowExecutionContinuedAsNewEventAttributes(value: WorkflowExecutionContinuedAsNewEventAttributes): Self = this.set("workflowExecutionContinuedAsNewEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkflowExecutionContinuedAsNewEventAttributes: Self = this.set("workflowExecutionContinuedAsNewEventAttributes", js.undefined)
    @scala.inline
    def setWorkflowExecutionFailedEventAttributes(value: WorkflowExecutionFailedEventAttributes): Self = this.set("workflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkflowExecutionFailedEventAttributes: Self = this.set("workflowExecutionFailedEventAttributes", js.undefined)
    @scala.inline
    def setWorkflowExecutionSignaledEventAttributes(value: WorkflowExecutionSignaledEventAttributes): Self = this.set("workflowExecutionSignaledEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkflowExecutionSignaledEventAttributes: Self = this.set("workflowExecutionSignaledEventAttributes", js.undefined)
    @scala.inline
    def setWorkflowExecutionStartedEventAttributes(value: WorkflowExecutionStartedEventAttributes): Self = this.set("workflowExecutionStartedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkflowExecutionStartedEventAttributes: Self = this.set("workflowExecutionStartedEventAttributes", js.undefined)
    @scala.inline
    def setWorkflowExecutionTerminatedEventAttributes(value: WorkflowExecutionTerminatedEventAttributes): Self = this.set("workflowExecutionTerminatedEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkflowExecutionTerminatedEventAttributes: Self = this.set("workflowExecutionTerminatedEventAttributes", js.undefined)
    @scala.inline
    def setWorkflowExecutionTimedOutEventAttributes(value: WorkflowExecutionTimedOutEventAttributes): Self = this.set("workflowExecutionTimedOutEventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkflowExecutionTimedOutEventAttributes: Self = this.set("workflowExecutionTimedOutEventAttributes", js.undefined)
  }
  
}

