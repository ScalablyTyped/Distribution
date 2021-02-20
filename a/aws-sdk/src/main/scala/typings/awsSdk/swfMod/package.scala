package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object swfMod {
  
  type ActivityId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.START_TO_CLOSE
    - typings.awsSdk.awsSdkStrings.SCHEDULE_TO_START
    - typings.awsSdk.awsSdkStrings.SCHEDULE_TO_CLOSE
    - typings.awsSdk.awsSdkStrings.HEARTBEAT
    - java.lang.String
  */
  type ActivityTaskTimeoutType = typings.awsSdk.swfMod._ActivityTaskTimeoutType | java.lang.String
  
  type ActivityTypeInfoList = js.Array[typings.awsSdk.swfMod.ActivityTypeInfo]
  
  type Arn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TIMER_ID_UNKNOWN
    - typings.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type CancelTimerFailedCause = typings.awsSdk.swfMod._CancelTimerFailedCause | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.UNHANDLED_DECISION
    - typings.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type CancelWorkflowExecutionFailedCause = typings.awsSdk.swfMod._CancelWorkflowExecutionFailedCause | java.lang.String
  
  type Canceled = scala.Boolean
  
  type CauseMessage = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TERMINATE
    - typings.awsSdk.awsSdkStrings.REQUEST_CANCEL
    - typings.awsSdk.awsSdkStrings.ABANDON
    - java.lang.String
  */
  type ChildPolicy = typings.awsSdk.swfMod._ChildPolicy | java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.swfMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.CANCELED
    - typings.awsSdk.awsSdkStrings.TERMINATED
    - typings.awsSdk.awsSdkStrings.CONTINUED_AS_NEW
    - typings.awsSdk.awsSdkStrings.TIMED_OUT
    - java.lang.String
  */
  type CloseStatus = typings.awsSdk.swfMod._CloseStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.UNHANDLED_DECISION
    - typings.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type CompleteWorkflowExecutionFailedCause = typings.awsSdk.swfMod._CompleteWorkflowExecutionFailedCause | java.lang.String
  
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
  type ContinueAsNewWorkflowExecutionFailedCause = typings.awsSdk.swfMod._ContinueAsNewWorkflowExecutionFailedCause | java.lang.String
  
  type Count = scala.Double
  
  type Data = java.lang.String
  
  type DecisionList = js.Array[typings.awsSdk.swfMod.Decision]
  
  type DecisionTaskTimeoutType = typings.awsSdk.awsSdkStrings.START_TO_CLOSE | java.lang.String
  
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
  type DecisionType = typings.awsSdk.swfMod._DecisionType | java.lang.String
  
  type Description = java.lang.String
  
  type DomainInfoList = js.Array[typings.awsSdk.swfMod.DomainInfo]
  
  type DomainName = java.lang.String
  
  type DurationInDays = java.lang.String
  
  type DurationInSeconds = java.lang.String
  
  type DurationInSecondsOptional = java.lang.String
  
  type EventId = scala.Double
  
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
  type EventType = typings.awsSdk.swfMod._EventType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OPEN
    - typings.awsSdk.awsSdkStrings.CLOSED
    - java.lang.String
  */
  type ExecutionStatus = typings.awsSdk.swfMod._ExecutionStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.UNHANDLED_DECISION
    - typings.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type FailWorkflowExecutionFailedCause = typings.awsSdk.swfMod._FailWorkflowExecutionFailedCause | java.lang.String
  
  type FailureReason = java.lang.String
  
  type FunctionId = java.lang.String
  
  type FunctionInput = java.lang.String
  
  type FunctionName = java.lang.String
  
  type HistoryEventList = js.Array[typings.awsSdk.swfMod.HistoryEvent]
  
  type Identity = java.lang.String
  
  type LambdaFunctionTimeoutType = typings.awsSdk.awsSdkStrings.START_TO_CLOSE | java.lang.String
  
  type LimitedData = java.lang.String
  
  type MarkerName = java.lang.String
  
  type Name = java.lang.String
  
  type OpenDecisionTasksCount = scala.Double
  
  type PageSize = scala.Double
  
  type PageToken = java.lang.String
  
  type RecordMarkerFailedCause = typings.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.REGISTERED
    - typings.awsSdk.awsSdkStrings.DEPRECATED
    - java.lang.String
  */
  type RegistrationStatus = typings.awsSdk.swfMod._RegistrationStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVITY_ID_UNKNOWN
    - typings.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type RequestCancelActivityTaskFailedCause = typings.awsSdk.swfMod._RequestCancelActivityTaskFailedCause | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION
    - typings.awsSdk.awsSdkStrings.REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED
    - typings.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type RequestCancelExternalWorkflowExecutionFailedCause = typings.awsSdk.swfMod._RequestCancelExternalWorkflowExecutionFailedCause | java.lang.String
  
  type ResourceTagKey = java.lang.String
  
  type ResourceTagKeyList = js.Array[typings.awsSdk.swfMod.ResourceTagKey]
  
  type ResourceTagList = js.Array[typings.awsSdk.swfMod.ResourceTag]
  
  type ResourceTagValue = java.lang.String
  
  type ReverseOrder = scala.Boolean
  
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
  type ScheduleActivityTaskFailedCause = typings.awsSdk.swfMod._ScheduleActivityTaskFailedCause | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ID_ALREADY_IN_USE
    - typings.awsSdk.awsSdkStrings.OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED
    - typings.awsSdk.awsSdkStrings.LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED
    - typings.awsSdk.awsSdkStrings.LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION
    - java.lang.String
  */
  type ScheduleLambdaFunctionFailedCause = typings.awsSdk.swfMod._ScheduleLambdaFunctionFailedCause | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION
    - typings.awsSdk.awsSdkStrings.SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED
    - typings.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type SignalExternalWorkflowExecutionFailedCause = typings.awsSdk.swfMod._SignalExternalWorkflowExecutionFailedCause | java.lang.String
  
  type SignalName = java.lang.String
  
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
  type StartChildWorkflowExecutionFailedCause = typings.awsSdk.swfMod._StartChildWorkflowExecutionFailedCause | java.lang.String
  
  type StartLambdaFunctionFailedCause = typings.awsSdk.awsSdkStrings.ASSUME_ROLE_FAILED | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TIMER_ID_ALREADY_IN_USE
    - typings.awsSdk.awsSdkStrings.OPEN_TIMERS_LIMIT_EXCEEDED
    - typings.awsSdk.awsSdkStrings.TIMER_CREATION_RATE_EXCEEDED
    - typings.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type StartTimerFailedCause = typings.awsSdk.swfMod._StartTimerFailedCause | java.lang.String
  
  type Tag = java.lang.String
  
  type TagList = js.Array[typings.awsSdk.swfMod.Tag]
  
  type TaskPriority = java.lang.String
  
  type TaskToken = java.lang.String
  
  type TerminateReason = java.lang.String
  
  type TimerId = java.lang.String
  
  type Timestamp = typings.std.Date
  
  type Truncated = scala.Boolean
  
  type Version = java.lang.String
  
  type VersionOptional = java.lang.String
  
  type WorkflowExecutionCancelRequestedCause = typings.awsSdk.awsSdkStrings.CHILD_POLICY_APPLIED | java.lang.String
  
  type WorkflowExecutionInfoList = js.Array[typings.awsSdk.swfMod.WorkflowExecutionInfo]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CHILD_POLICY_APPLIED
    - typings.awsSdk.awsSdkStrings.EVENT_LIMIT_EXCEEDED
    - typings.awsSdk.awsSdkStrings.OPERATOR_INITIATED
    - java.lang.String
  */
  type WorkflowExecutionTerminatedCause = typings.awsSdk.swfMod._WorkflowExecutionTerminatedCause | java.lang.String
  
  type WorkflowExecutionTimeoutType = typings.awsSdk.awsSdkStrings.START_TO_CLOSE | java.lang.String
  
  type WorkflowId = java.lang.String
  
  type WorkflowRunId = java.lang.String
  
  type WorkflowRunIdOptional = java.lang.String
  
  type WorkflowTypeInfoList = js.Array[typings.awsSdk.swfMod.WorkflowTypeInfo]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2012-01-25`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.swfMod._apiVersion | java.lang.String
}
