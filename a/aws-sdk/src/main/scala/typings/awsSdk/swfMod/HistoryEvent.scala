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
  def apply(
    eventId: EventId,
    eventTimestamp: Timestamp,
    eventType: EventType,
    activityTaskCancelRequestedEventAttributes: ActivityTaskCancelRequestedEventAttributes = null,
    activityTaskCanceledEventAttributes: ActivityTaskCanceledEventAttributes = null,
    activityTaskCompletedEventAttributes: ActivityTaskCompletedEventAttributes = null,
    activityTaskFailedEventAttributes: ActivityTaskFailedEventAttributes = null,
    activityTaskScheduledEventAttributes: ActivityTaskScheduledEventAttributes = null,
    activityTaskStartedEventAttributes: ActivityTaskStartedEventAttributes = null,
    activityTaskTimedOutEventAttributes: ActivityTaskTimedOutEventAttributes = null,
    cancelTimerFailedEventAttributes: CancelTimerFailedEventAttributes = null,
    cancelWorkflowExecutionFailedEventAttributes: CancelWorkflowExecutionFailedEventAttributes = null,
    childWorkflowExecutionCanceledEventAttributes: ChildWorkflowExecutionCanceledEventAttributes = null,
    childWorkflowExecutionCompletedEventAttributes: ChildWorkflowExecutionCompletedEventAttributes = null,
    childWorkflowExecutionFailedEventAttributes: ChildWorkflowExecutionFailedEventAttributes = null,
    childWorkflowExecutionStartedEventAttributes: ChildWorkflowExecutionStartedEventAttributes = null,
    childWorkflowExecutionTerminatedEventAttributes: ChildWorkflowExecutionTerminatedEventAttributes = null,
    childWorkflowExecutionTimedOutEventAttributes: ChildWorkflowExecutionTimedOutEventAttributes = null,
    completeWorkflowExecutionFailedEventAttributes: CompleteWorkflowExecutionFailedEventAttributes = null,
    continueAsNewWorkflowExecutionFailedEventAttributes: ContinueAsNewWorkflowExecutionFailedEventAttributes = null,
    decisionTaskCompletedEventAttributes: DecisionTaskCompletedEventAttributes = null,
    decisionTaskScheduledEventAttributes: DecisionTaskScheduledEventAttributes = null,
    decisionTaskStartedEventAttributes: DecisionTaskStartedEventAttributes = null,
    decisionTaskTimedOutEventAttributes: DecisionTaskTimedOutEventAttributes = null,
    externalWorkflowExecutionCancelRequestedEventAttributes: ExternalWorkflowExecutionCancelRequestedEventAttributes = null,
    externalWorkflowExecutionSignaledEventAttributes: ExternalWorkflowExecutionSignaledEventAttributes = null,
    failWorkflowExecutionFailedEventAttributes: FailWorkflowExecutionFailedEventAttributes = null,
    lambdaFunctionCompletedEventAttributes: LambdaFunctionCompletedEventAttributes = null,
    lambdaFunctionFailedEventAttributes: LambdaFunctionFailedEventAttributes = null,
    lambdaFunctionScheduledEventAttributes: LambdaFunctionScheduledEventAttributes = null,
    lambdaFunctionStartedEventAttributes: LambdaFunctionStartedEventAttributes = null,
    lambdaFunctionTimedOutEventAttributes: LambdaFunctionTimedOutEventAttributes = null,
    markerRecordedEventAttributes: MarkerRecordedEventAttributes = null,
    recordMarkerFailedEventAttributes: RecordMarkerFailedEventAttributes = null,
    requestCancelActivityTaskFailedEventAttributes: RequestCancelActivityTaskFailedEventAttributes = null,
    requestCancelExternalWorkflowExecutionFailedEventAttributes: RequestCancelExternalWorkflowExecutionFailedEventAttributes = null,
    requestCancelExternalWorkflowExecutionInitiatedEventAttributes: RequestCancelExternalWorkflowExecutionInitiatedEventAttributes = null,
    scheduleActivityTaskFailedEventAttributes: ScheduleActivityTaskFailedEventAttributes = null,
    scheduleLambdaFunctionFailedEventAttributes: ScheduleLambdaFunctionFailedEventAttributes = null,
    signalExternalWorkflowExecutionFailedEventAttributes: SignalExternalWorkflowExecutionFailedEventAttributes = null,
    signalExternalWorkflowExecutionInitiatedEventAttributes: SignalExternalWorkflowExecutionInitiatedEventAttributes = null,
    startChildWorkflowExecutionFailedEventAttributes: StartChildWorkflowExecutionFailedEventAttributes = null,
    startChildWorkflowExecutionInitiatedEventAttributes: StartChildWorkflowExecutionInitiatedEventAttributes = null,
    startLambdaFunctionFailedEventAttributes: StartLambdaFunctionFailedEventAttributes = null,
    startTimerFailedEventAttributes: StartTimerFailedEventAttributes = null,
    timerCanceledEventAttributes: TimerCanceledEventAttributes = null,
    timerFiredEventAttributes: TimerFiredEventAttributes = null,
    timerStartedEventAttributes: TimerStartedEventAttributes = null,
    workflowExecutionCancelRequestedEventAttributes: WorkflowExecutionCancelRequestedEventAttributes = null,
    workflowExecutionCanceledEventAttributes: WorkflowExecutionCanceledEventAttributes = null,
    workflowExecutionCompletedEventAttributes: WorkflowExecutionCompletedEventAttributes = null,
    workflowExecutionContinuedAsNewEventAttributes: WorkflowExecutionContinuedAsNewEventAttributes = null,
    workflowExecutionFailedEventAttributes: WorkflowExecutionFailedEventAttributes = null,
    workflowExecutionSignaledEventAttributes: WorkflowExecutionSignaledEventAttributes = null,
    workflowExecutionStartedEventAttributes: WorkflowExecutionStartedEventAttributes = null,
    workflowExecutionTerminatedEventAttributes: WorkflowExecutionTerminatedEventAttributes = null,
    workflowExecutionTimedOutEventAttributes: WorkflowExecutionTimedOutEventAttributes = null
  ): HistoryEvent = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], eventTimestamp = eventTimestamp.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any])
    if (activityTaskCancelRequestedEventAttributes != null) __obj.updateDynamic("activityTaskCancelRequestedEventAttributes")(activityTaskCancelRequestedEventAttributes.asInstanceOf[js.Any])
    if (activityTaskCanceledEventAttributes != null) __obj.updateDynamic("activityTaskCanceledEventAttributes")(activityTaskCanceledEventAttributes.asInstanceOf[js.Any])
    if (activityTaskCompletedEventAttributes != null) __obj.updateDynamic("activityTaskCompletedEventAttributes")(activityTaskCompletedEventAttributes.asInstanceOf[js.Any])
    if (activityTaskFailedEventAttributes != null) __obj.updateDynamic("activityTaskFailedEventAttributes")(activityTaskFailedEventAttributes.asInstanceOf[js.Any])
    if (activityTaskScheduledEventAttributes != null) __obj.updateDynamic("activityTaskScheduledEventAttributes")(activityTaskScheduledEventAttributes.asInstanceOf[js.Any])
    if (activityTaskStartedEventAttributes != null) __obj.updateDynamic("activityTaskStartedEventAttributes")(activityTaskStartedEventAttributes.asInstanceOf[js.Any])
    if (activityTaskTimedOutEventAttributes != null) __obj.updateDynamic("activityTaskTimedOutEventAttributes")(activityTaskTimedOutEventAttributes.asInstanceOf[js.Any])
    if (cancelTimerFailedEventAttributes != null) __obj.updateDynamic("cancelTimerFailedEventAttributes")(cancelTimerFailedEventAttributes.asInstanceOf[js.Any])
    if (cancelWorkflowExecutionFailedEventAttributes != null) __obj.updateDynamic("cancelWorkflowExecutionFailedEventAttributes")(cancelWorkflowExecutionFailedEventAttributes.asInstanceOf[js.Any])
    if (childWorkflowExecutionCanceledEventAttributes != null) __obj.updateDynamic("childWorkflowExecutionCanceledEventAttributes")(childWorkflowExecutionCanceledEventAttributes.asInstanceOf[js.Any])
    if (childWorkflowExecutionCompletedEventAttributes != null) __obj.updateDynamic("childWorkflowExecutionCompletedEventAttributes")(childWorkflowExecutionCompletedEventAttributes.asInstanceOf[js.Any])
    if (childWorkflowExecutionFailedEventAttributes != null) __obj.updateDynamic("childWorkflowExecutionFailedEventAttributes")(childWorkflowExecutionFailedEventAttributes.asInstanceOf[js.Any])
    if (childWorkflowExecutionStartedEventAttributes != null) __obj.updateDynamic("childWorkflowExecutionStartedEventAttributes")(childWorkflowExecutionStartedEventAttributes.asInstanceOf[js.Any])
    if (childWorkflowExecutionTerminatedEventAttributes != null) __obj.updateDynamic("childWorkflowExecutionTerminatedEventAttributes")(childWorkflowExecutionTerminatedEventAttributes.asInstanceOf[js.Any])
    if (childWorkflowExecutionTimedOutEventAttributes != null) __obj.updateDynamic("childWorkflowExecutionTimedOutEventAttributes")(childWorkflowExecutionTimedOutEventAttributes.asInstanceOf[js.Any])
    if (completeWorkflowExecutionFailedEventAttributes != null) __obj.updateDynamic("completeWorkflowExecutionFailedEventAttributes")(completeWorkflowExecutionFailedEventAttributes.asInstanceOf[js.Any])
    if (continueAsNewWorkflowExecutionFailedEventAttributes != null) __obj.updateDynamic("continueAsNewWorkflowExecutionFailedEventAttributes")(continueAsNewWorkflowExecutionFailedEventAttributes.asInstanceOf[js.Any])
    if (decisionTaskCompletedEventAttributes != null) __obj.updateDynamic("decisionTaskCompletedEventAttributes")(decisionTaskCompletedEventAttributes.asInstanceOf[js.Any])
    if (decisionTaskScheduledEventAttributes != null) __obj.updateDynamic("decisionTaskScheduledEventAttributes")(decisionTaskScheduledEventAttributes.asInstanceOf[js.Any])
    if (decisionTaskStartedEventAttributes != null) __obj.updateDynamic("decisionTaskStartedEventAttributes")(decisionTaskStartedEventAttributes.asInstanceOf[js.Any])
    if (decisionTaskTimedOutEventAttributes != null) __obj.updateDynamic("decisionTaskTimedOutEventAttributes")(decisionTaskTimedOutEventAttributes.asInstanceOf[js.Any])
    if (externalWorkflowExecutionCancelRequestedEventAttributes != null) __obj.updateDynamic("externalWorkflowExecutionCancelRequestedEventAttributes")(externalWorkflowExecutionCancelRequestedEventAttributes.asInstanceOf[js.Any])
    if (externalWorkflowExecutionSignaledEventAttributes != null) __obj.updateDynamic("externalWorkflowExecutionSignaledEventAttributes")(externalWorkflowExecutionSignaledEventAttributes.asInstanceOf[js.Any])
    if (failWorkflowExecutionFailedEventAttributes != null) __obj.updateDynamic("failWorkflowExecutionFailedEventAttributes")(failWorkflowExecutionFailedEventAttributes.asInstanceOf[js.Any])
    if (lambdaFunctionCompletedEventAttributes != null) __obj.updateDynamic("lambdaFunctionCompletedEventAttributes")(lambdaFunctionCompletedEventAttributes.asInstanceOf[js.Any])
    if (lambdaFunctionFailedEventAttributes != null) __obj.updateDynamic("lambdaFunctionFailedEventAttributes")(lambdaFunctionFailedEventAttributes.asInstanceOf[js.Any])
    if (lambdaFunctionScheduledEventAttributes != null) __obj.updateDynamic("lambdaFunctionScheduledEventAttributes")(lambdaFunctionScheduledEventAttributes.asInstanceOf[js.Any])
    if (lambdaFunctionStartedEventAttributes != null) __obj.updateDynamic("lambdaFunctionStartedEventAttributes")(lambdaFunctionStartedEventAttributes.asInstanceOf[js.Any])
    if (lambdaFunctionTimedOutEventAttributes != null) __obj.updateDynamic("lambdaFunctionTimedOutEventAttributes")(lambdaFunctionTimedOutEventAttributes.asInstanceOf[js.Any])
    if (markerRecordedEventAttributes != null) __obj.updateDynamic("markerRecordedEventAttributes")(markerRecordedEventAttributes.asInstanceOf[js.Any])
    if (recordMarkerFailedEventAttributes != null) __obj.updateDynamic("recordMarkerFailedEventAttributes")(recordMarkerFailedEventAttributes.asInstanceOf[js.Any])
    if (requestCancelActivityTaskFailedEventAttributes != null) __obj.updateDynamic("requestCancelActivityTaskFailedEventAttributes")(requestCancelActivityTaskFailedEventAttributes.asInstanceOf[js.Any])
    if (requestCancelExternalWorkflowExecutionFailedEventAttributes != null) __obj.updateDynamic("requestCancelExternalWorkflowExecutionFailedEventAttributes")(requestCancelExternalWorkflowExecutionFailedEventAttributes.asInstanceOf[js.Any])
    if (requestCancelExternalWorkflowExecutionInitiatedEventAttributes != null) __obj.updateDynamic("requestCancelExternalWorkflowExecutionInitiatedEventAttributes")(requestCancelExternalWorkflowExecutionInitiatedEventAttributes.asInstanceOf[js.Any])
    if (scheduleActivityTaskFailedEventAttributes != null) __obj.updateDynamic("scheduleActivityTaskFailedEventAttributes")(scheduleActivityTaskFailedEventAttributes.asInstanceOf[js.Any])
    if (scheduleLambdaFunctionFailedEventAttributes != null) __obj.updateDynamic("scheduleLambdaFunctionFailedEventAttributes")(scheduleLambdaFunctionFailedEventAttributes.asInstanceOf[js.Any])
    if (signalExternalWorkflowExecutionFailedEventAttributes != null) __obj.updateDynamic("signalExternalWorkflowExecutionFailedEventAttributes")(signalExternalWorkflowExecutionFailedEventAttributes.asInstanceOf[js.Any])
    if (signalExternalWorkflowExecutionInitiatedEventAttributes != null) __obj.updateDynamic("signalExternalWorkflowExecutionInitiatedEventAttributes")(signalExternalWorkflowExecutionInitiatedEventAttributes.asInstanceOf[js.Any])
    if (startChildWorkflowExecutionFailedEventAttributes != null) __obj.updateDynamic("startChildWorkflowExecutionFailedEventAttributes")(startChildWorkflowExecutionFailedEventAttributes.asInstanceOf[js.Any])
    if (startChildWorkflowExecutionInitiatedEventAttributes != null) __obj.updateDynamic("startChildWorkflowExecutionInitiatedEventAttributes")(startChildWorkflowExecutionInitiatedEventAttributes.asInstanceOf[js.Any])
    if (startLambdaFunctionFailedEventAttributes != null) __obj.updateDynamic("startLambdaFunctionFailedEventAttributes")(startLambdaFunctionFailedEventAttributes.asInstanceOf[js.Any])
    if (startTimerFailedEventAttributes != null) __obj.updateDynamic("startTimerFailedEventAttributes")(startTimerFailedEventAttributes.asInstanceOf[js.Any])
    if (timerCanceledEventAttributes != null) __obj.updateDynamic("timerCanceledEventAttributes")(timerCanceledEventAttributes.asInstanceOf[js.Any])
    if (timerFiredEventAttributes != null) __obj.updateDynamic("timerFiredEventAttributes")(timerFiredEventAttributes.asInstanceOf[js.Any])
    if (timerStartedEventAttributes != null) __obj.updateDynamic("timerStartedEventAttributes")(timerStartedEventAttributes.asInstanceOf[js.Any])
    if (workflowExecutionCancelRequestedEventAttributes != null) __obj.updateDynamic("workflowExecutionCancelRequestedEventAttributes")(workflowExecutionCancelRequestedEventAttributes.asInstanceOf[js.Any])
    if (workflowExecutionCanceledEventAttributes != null) __obj.updateDynamic("workflowExecutionCanceledEventAttributes")(workflowExecutionCanceledEventAttributes.asInstanceOf[js.Any])
    if (workflowExecutionCompletedEventAttributes != null) __obj.updateDynamic("workflowExecutionCompletedEventAttributes")(workflowExecutionCompletedEventAttributes.asInstanceOf[js.Any])
    if (workflowExecutionContinuedAsNewEventAttributes != null) __obj.updateDynamic("workflowExecutionContinuedAsNewEventAttributes")(workflowExecutionContinuedAsNewEventAttributes.asInstanceOf[js.Any])
    if (workflowExecutionFailedEventAttributes != null) __obj.updateDynamic("workflowExecutionFailedEventAttributes")(workflowExecutionFailedEventAttributes.asInstanceOf[js.Any])
    if (workflowExecutionSignaledEventAttributes != null) __obj.updateDynamic("workflowExecutionSignaledEventAttributes")(workflowExecutionSignaledEventAttributes.asInstanceOf[js.Any])
    if (workflowExecutionStartedEventAttributes != null) __obj.updateDynamic("workflowExecutionStartedEventAttributes")(workflowExecutionStartedEventAttributes.asInstanceOf[js.Any])
    if (workflowExecutionTerminatedEventAttributes != null) __obj.updateDynamic("workflowExecutionTerminatedEventAttributes")(workflowExecutionTerminatedEventAttributes.asInstanceOf[js.Any])
    if (workflowExecutionTimedOutEventAttributes != null) __obj.updateDynamic("workflowExecutionTimedOutEventAttributes")(workflowExecutionTimedOutEventAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryEvent]
  }
}

