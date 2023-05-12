package typings.awsSdk.clientsSwfMod

import typings.awsSdk.awsSdkStrings.ASSUME_ROLE_FAILED
import typings.awsSdk.awsSdkStrings.CHILD_POLICY_APPLIED
import typings.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
import typings.awsSdk.awsSdkStrings.START_TO_CLOSE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActivityId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.START_TO_CLOSE
  - typings.awsSdk.awsSdkStrings.SCHEDULE_TO_START
  - typings.awsSdk.awsSdkStrings.SCHEDULE_TO_CLOSE
  - typings.awsSdk.awsSdkStrings.HEARTBEAT
  - java.lang.String
*/
type ActivityTaskTimeoutType = _ActivityTaskTimeoutType | String

type ActivityTypeInfoList = js.Array[ActivityTypeInfo]

type Arn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TIMER_ID_UNKNOWN
  - typings.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
  - java.lang.String
*/
type CancelTimerFailedCause = _CancelTimerFailedCause | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNHANDLED_DECISION
  - typings.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
  - java.lang.String
*/
type CancelWorkflowExecutionFailedCause = _CancelWorkflowExecutionFailedCause | String

type Canceled = Boolean

type CauseMessage = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TERMINATE
  - typings.awsSdk.awsSdkStrings.REQUEST_CANCEL
  - typings.awsSdk.awsSdkStrings.ABANDON
  - java.lang.String
*/
type ChildPolicy = _ChildPolicy | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.CANCELED
  - typings.awsSdk.awsSdkStrings.TERMINATED
  - typings.awsSdk.awsSdkStrings.CONTINUED_AS_NEW
  - typings.awsSdk.awsSdkStrings.TIMED_OUT
  - java.lang.String
*/
type CloseStatus = _CloseStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNHANDLED_DECISION
  - typings.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
  - java.lang.String
*/
type CompleteWorkflowExecutionFailedCause = _CompleteWorkflowExecutionFailedCause | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNHANDLED_DECISION
  - typings.awsSdk.awsSdkStrings.WORKFLOW_TYPE_DEPRECATED
  - typings.awsSdk.awsSdkStrings.WORKFLOW_TYPE_DOES_NOT_EXIST
  - typings.awsSdk.awsSdkStrings.DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED
  - typings.awsSdk.awsSdkStrings.DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED
  - typings.awsSdk.awsSdkStrings.DEFAULT_TASK_LIST_UNDEFINED
  - typings.awsSdk.awsSdkStrings.DEFAULT_CHILD_POLICY_UNDEFINED
  - typings.awsSdk.awsSdkStrings.CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED
  - typings.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
  - java.lang.String
*/
type ContinueAsNewWorkflowExecutionFailedCause = _ContinueAsNewWorkflowExecutionFailedCause | String

type Count = Double

type Data = String

type DecisionList = js.Array[Decision]

type DecisionTaskTimeoutType = START_TO_CLOSE | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ScheduleActivityTask
  - typings.awsSdk.awsSdkStrings.RequestCancelActivityTask
  - typings.awsSdk.awsSdkStrings.CompleteWorkflowExecution
  - typings.awsSdk.awsSdkStrings.FailWorkflowExecution
  - typings.awsSdk.awsSdkStrings.CancelWorkflowExecution
  - typings.awsSdk.awsSdkStrings.ContinueAsNewWorkflowExecution
  - typings.awsSdk.awsSdkStrings.RecordMarker
  - typings.awsSdk.awsSdkStrings.StartTimer
  - typings.awsSdk.awsSdkStrings.CancelTimer
  - typings.awsSdk.awsSdkStrings.SignalExternalWorkflowExecution
  - typings.awsSdk.awsSdkStrings.RequestCancelExternalWorkflowExecution
  - typings.awsSdk.awsSdkStrings.StartChildWorkflowExecution
  - typings.awsSdk.awsSdkStrings.ScheduleLambdaFunction
  - java.lang.String
*/
type DecisionType = _DecisionType | String

type Description = String

type DomainInfoList = js.Array[DomainInfo]

type DomainName = String

type DurationInDays = String

type DurationInSeconds = String

type DurationInSecondsOptional = String

type EventId = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WorkflowExecutionStarted
  - typings.awsSdk.awsSdkStrings.WorkflowExecutionCancelRequested
  - typings.awsSdk.awsSdkStrings.WorkflowExecutionCompleted
  - typings.awsSdk.awsSdkStrings.CompleteWorkflowExecutionFailed
  - typings.awsSdk.awsSdkStrings.WorkflowExecutionFailed
  - typings.awsSdk.awsSdkStrings.FailWorkflowExecutionFailed
  - typings.awsSdk.awsSdkStrings.WorkflowExecutionTimedOut
  - typings.awsSdk.awsSdkStrings.WorkflowExecutionCanceled
  - typings.awsSdk.awsSdkStrings.CancelWorkflowExecutionFailed
  - typings.awsSdk.awsSdkStrings.WorkflowExecutionContinuedAsNew
  - typings.awsSdk.awsSdkStrings.ContinueAsNewWorkflowExecutionFailed
  - typings.awsSdk.awsSdkStrings.WorkflowExecutionTerminated
  - typings.awsSdk.awsSdkStrings.DecisionTaskScheduled
  - typings.awsSdk.awsSdkStrings.DecisionTaskStarted
  - typings.awsSdk.awsSdkStrings.DecisionTaskCompleted
  - typings.awsSdk.awsSdkStrings.DecisionTaskTimedOut
  - typings.awsSdk.awsSdkStrings.ActivityTaskScheduled
  - typings.awsSdk.awsSdkStrings.ScheduleActivityTaskFailed
  - typings.awsSdk.awsSdkStrings.ActivityTaskStarted
  - typings.awsSdk.awsSdkStrings.ActivityTaskCompleted
  - typings.awsSdk.awsSdkStrings.ActivityTaskFailed
  - typings.awsSdk.awsSdkStrings.ActivityTaskTimedOut
  - typings.awsSdk.awsSdkStrings.ActivityTaskCanceled
  - typings.awsSdk.awsSdkStrings.ActivityTaskCancelRequested
  - typings.awsSdk.awsSdkStrings.RequestCancelActivityTaskFailed
  - typings.awsSdk.awsSdkStrings.WorkflowExecutionSignaled
  - typings.awsSdk.awsSdkStrings.MarkerRecorded
  - typings.awsSdk.awsSdkStrings.RecordMarkerFailed
  - typings.awsSdk.awsSdkStrings.TimerStarted
  - typings.awsSdk.awsSdkStrings.StartTimerFailed
  - typings.awsSdk.awsSdkStrings.TimerFired
  - typings.awsSdk.awsSdkStrings.TimerCanceled
  - typings.awsSdk.awsSdkStrings.CancelTimerFailed
  - typings.awsSdk.awsSdkStrings.StartChildWorkflowExecutionInitiated
  - typings.awsSdk.awsSdkStrings.StartChildWorkflowExecutionFailed
  - typings.awsSdk.awsSdkStrings.ChildWorkflowExecutionStarted
  - typings.awsSdk.awsSdkStrings.ChildWorkflowExecutionCompleted
  - typings.awsSdk.awsSdkStrings.ChildWorkflowExecutionFailed
  - typings.awsSdk.awsSdkStrings.ChildWorkflowExecutionTimedOut
  - typings.awsSdk.awsSdkStrings.ChildWorkflowExecutionCanceled
  - typings.awsSdk.awsSdkStrings.ChildWorkflowExecutionTerminated
  - typings.awsSdk.awsSdkStrings.SignalExternalWorkflowExecutionInitiated
  - typings.awsSdk.awsSdkStrings.SignalExternalWorkflowExecutionFailed
  - typings.awsSdk.awsSdkStrings.ExternalWorkflowExecutionSignaled
  - typings.awsSdk.awsSdkStrings.RequestCancelExternalWorkflowExecutionInitiated
  - typings.awsSdk.awsSdkStrings.RequestCancelExternalWorkflowExecutionFailed
  - typings.awsSdk.awsSdkStrings.ExternalWorkflowExecutionCancelRequested
  - typings.awsSdk.awsSdkStrings.LambdaFunctionScheduled
  - typings.awsSdk.awsSdkStrings.LambdaFunctionStarted
  - typings.awsSdk.awsSdkStrings.LambdaFunctionCompleted
  - typings.awsSdk.awsSdkStrings.LambdaFunctionFailed
  - typings.awsSdk.awsSdkStrings.LambdaFunctionTimedOut
  - typings.awsSdk.awsSdkStrings.ScheduleLambdaFunctionFailed
  - typings.awsSdk.awsSdkStrings.StartLambdaFunctionFailed
  - java.lang.String
*/
type EventType = _EventType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OPEN
  - typings.awsSdk.awsSdkStrings.CLOSED
  - java.lang.String
*/
type ExecutionStatus = _ExecutionStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNHANDLED_DECISION
  - typings.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
  - java.lang.String
*/
type FailWorkflowExecutionFailedCause = _FailWorkflowExecutionFailedCause | String

type FailureReason = String

type FunctionId = String

type FunctionInput = String

type FunctionName = String

type HistoryEventList = js.Array[HistoryEvent]

type Identity = String

type LambdaFunctionTimeoutType = START_TO_CLOSE | String

type LimitedData = String

type MarkerName = String

type Name = String

type OpenDecisionTasksCount = Double

type PageSize = Double

type PageToken = String

type RecordMarkerFailedCause = OPERATION_NOT_PERMITTED | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REGISTERED
  - typings.awsSdk.awsSdkStrings.DEPRECATED
  - java.lang.String
*/
type RegistrationStatus = _RegistrationStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVITY_ID_UNKNOWN
  - typings.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
  - java.lang.String
*/
type RequestCancelActivityTaskFailedCause = _RequestCancelActivityTaskFailedCause | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION
  - typings.awsSdk.awsSdkStrings.REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED
  - typings.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
  - java.lang.String
*/
type RequestCancelExternalWorkflowExecutionFailedCause = _RequestCancelExternalWorkflowExecutionFailedCause | String

type ResourceTagKey = String

type ResourceTagKeyList = js.Array[ResourceTagKey]

type ResourceTagList = js.Array[ResourceTag]

type ResourceTagValue = String

type ReverseOrder = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVITY_TYPE_DEPRECATED
  - typings.awsSdk.awsSdkStrings.ACTIVITY_TYPE_DOES_NOT_EXIST
  - typings.awsSdk.awsSdkStrings.ACTIVITY_ID_ALREADY_IN_USE
  - typings.awsSdk.awsSdkStrings.OPEN_ACTIVITIES_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.ACTIVITY_CREATION_RATE_EXCEEDED
  - typings.awsSdk.awsSdkStrings.DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED
  - typings.awsSdk.awsSdkStrings.DEFAULT_TASK_LIST_UNDEFINED
  - typings.awsSdk.awsSdkStrings.DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED
  - typings.awsSdk.awsSdkStrings.DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED
  - typings.awsSdk.awsSdkStrings.DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED
  - typings.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
  - java.lang.String
*/
type ScheduleActivityTaskFailedCause = _ScheduleActivityTaskFailedCause | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ID_ALREADY_IN_USE
  - typings.awsSdk.awsSdkStrings.OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED
  - typings.awsSdk.awsSdkStrings.LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION
  - java.lang.String
*/
type ScheduleLambdaFunctionFailedCause = _ScheduleLambdaFunctionFailedCause | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION
  - typings.awsSdk.awsSdkStrings.SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED
  - typings.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
  - java.lang.String
*/
type SignalExternalWorkflowExecutionFailedCause = _SignalExternalWorkflowExecutionFailedCause | String

type SignalName = String

type StartAtPreviousStartedEvent = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WORKFLOW_TYPE_DOES_NOT_EXIST
  - typings.awsSdk.awsSdkStrings.WORKFLOW_TYPE_DEPRECATED
  - typings.awsSdk.awsSdkStrings.OPEN_CHILDREN_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.OPEN_WORKFLOWS_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.CHILD_CREATION_RATE_EXCEEDED
  - typings.awsSdk.awsSdkStrings.WORKFLOW_ALREADY_RUNNING
  - typings.awsSdk.awsSdkStrings.DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED
  - typings.awsSdk.awsSdkStrings.DEFAULT_TASK_LIST_UNDEFINED
  - typings.awsSdk.awsSdkStrings.DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED
  - typings.awsSdk.awsSdkStrings.DEFAULT_CHILD_POLICY_UNDEFINED
  - typings.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
  - java.lang.String
*/
type StartChildWorkflowExecutionFailedCause = _StartChildWorkflowExecutionFailedCause | String

type StartLambdaFunctionFailedCause = ASSUME_ROLE_FAILED | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TIMER_ID_ALREADY_IN_USE
  - typings.awsSdk.awsSdkStrings.OPEN_TIMERS_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.TIMER_CREATION_RATE_EXCEEDED
  - typings.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
  - java.lang.String
*/
type StartTimerFailedCause = _StartTimerFailedCause | String

type Tag = String

type TagList = js.Array[Tag]

type TaskPriority = String

type TaskToken = String

type TerminateReason = String

type TimerId = String

type Timestamp = js.Date

type Truncated = Boolean

type Version = String

type VersionOptional = String

type WorkflowExecutionCancelRequestedCause = CHILD_POLICY_APPLIED | String

type WorkflowExecutionInfoList = js.Array[WorkflowExecutionInfo]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CHILD_POLICY_APPLIED
  - typings.awsSdk.awsSdkStrings.EVENT_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.OPERATOR_INITIATED
  - java.lang.String
*/
type WorkflowExecutionTerminatedCause = _WorkflowExecutionTerminatedCause | String

type WorkflowExecutionTimeoutType = START_TO_CLOSE | String

type WorkflowId = String

type WorkflowRunId = String

type WorkflowRunIdOptional = String

type WorkflowTypeInfoList = js.Array[WorkflowTypeInfo]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2012-01-25`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
