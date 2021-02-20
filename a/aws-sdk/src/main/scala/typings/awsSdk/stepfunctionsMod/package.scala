package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object stepfunctionsMod {
  
  type ActivityList = js.Array[typings.awsSdk.stepfunctionsMod.ActivityListItem]
  
  type Arn = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.stepfunctionsMod.ClientApiVersions
  
  type ConnectorParameters = java.lang.String
  
  type Definition = java.lang.String
  
  type Enabled = scala.Boolean
  
  type EventId = scala.Double
  
  type ExecutionList = js.Array[typings.awsSdk.stepfunctionsMod.ExecutionListItem]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.TIMED_OUT
    - typings.awsSdk.awsSdkStrings.ABORTED
    - java.lang.String
  */
  type ExecutionStatus = typings.awsSdk.stepfunctionsMod._ExecutionStatus | java.lang.String
  
  type HistoryEventList = js.Array[typings.awsSdk.stepfunctionsMod.HistoryEvent]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ActivityFailed
    - typings.awsSdk.awsSdkStrings.ActivityScheduled
    - typings.awsSdk.awsSdkStrings.ActivityScheduleFailed
    - typings.awsSdk.awsSdkStrings.ActivityStarted
    - typings.awsSdk.awsSdkStrings.ActivitySucceeded
    - typings.awsSdk.awsSdkStrings.ActivityTimedOut
    - typings.awsSdk.awsSdkStrings.ChoiceStateEntered
    - typings.awsSdk.awsSdkStrings.ChoiceStateExited
    - typings.awsSdk.awsSdkStrings.ExecutionAborted
    - typings.awsSdk.awsSdkStrings.ExecutionFailed
    - typings.awsSdk.awsSdkStrings.ExecutionStarted
    - typings.awsSdk.awsSdkStrings.ExecutionSucceeded
    - typings.awsSdk.awsSdkStrings.ExecutionTimedOut
    - typings.awsSdk.awsSdkStrings.FailStateEntered
    - typings.awsSdk.awsSdkStrings.LambdaFunctionFailed
    - typings.awsSdk.awsSdkStrings.LambdaFunctionScheduled
    - typings.awsSdk.awsSdkStrings.LambdaFunctionScheduleFailed
    - typings.awsSdk.awsSdkStrings.LambdaFunctionStarted
    - typings.awsSdk.awsSdkStrings.LambdaFunctionStartFailed
    - typings.awsSdk.awsSdkStrings.LambdaFunctionSucceeded
    - typings.awsSdk.awsSdkStrings.LambdaFunctionTimedOut
    - typings.awsSdk.awsSdkStrings.MapIterationAborted
    - typings.awsSdk.awsSdkStrings.MapIterationFailed
    - typings.awsSdk.awsSdkStrings.MapIterationStarted
    - typings.awsSdk.awsSdkStrings.MapIterationSucceeded
    - typings.awsSdk.awsSdkStrings.MapStateAborted
    - typings.awsSdk.awsSdkStrings.MapStateEntered
    - typings.awsSdk.awsSdkStrings.MapStateExited
    - typings.awsSdk.awsSdkStrings.MapStateFailed
    - typings.awsSdk.awsSdkStrings.MapStateStarted
    - typings.awsSdk.awsSdkStrings.MapStateSucceeded
    - typings.awsSdk.awsSdkStrings.ParallelStateAborted
    - typings.awsSdk.awsSdkStrings.ParallelStateEntered
    - typings.awsSdk.awsSdkStrings.ParallelStateExited
    - typings.awsSdk.awsSdkStrings.ParallelStateFailed
    - typings.awsSdk.awsSdkStrings.ParallelStateStarted
    - typings.awsSdk.awsSdkStrings.ParallelStateSucceeded
    - typings.awsSdk.awsSdkStrings.PassStateEntered
    - typings.awsSdk.awsSdkStrings.PassStateExited
    - typings.awsSdk.awsSdkStrings.SucceedStateEntered
    - typings.awsSdk.awsSdkStrings.SucceedStateExited
    - typings.awsSdk.awsSdkStrings.TaskFailed
    - typings.awsSdk.awsSdkStrings.TaskScheduled
    - typings.awsSdk.awsSdkStrings.TaskStarted
    - typings.awsSdk.awsSdkStrings.TaskStartFailed
    - typings.awsSdk.awsSdkStrings.TaskStateAborted
    - typings.awsSdk.awsSdkStrings.TaskStateEntered
    - typings.awsSdk.awsSdkStrings.TaskStateExited
    - typings.awsSdk.awsSdkStrings.TaskSubmitFailed
    - typings.awsSdk.awsSdkStrings.TaskSubmitted
    - typings.awsSdk.awsSdkStrings.TaskSucceeded
    - typings.awsSdk.awsSdkStrings.TaskTimedOut
    - typings.awsSdk.awsSdkStrings.WaitStateAborted
    - typings.awsSdk.awsSdkStrings.WaitStateEntered
    - typings.awsSdk.awsSdkStrings.WaitStateExited
    - java.lang.String
  */
  type HistoryEventType = typings.awsSdk.stepfunctionsMod._HistoryEventType | java.lang.String
  
  type Identity = java.lang.String
  
  type IncludeExecutionData = scala.Boolean
  
  type IncludeExecutionDataGetExecutionHistory = scala.Boolean
  
  type ListExecutionsPageToken = java.lang.String
  
  type LogDestinationList = js.Array[typings.awsSdk.stepfunctionsMod.LogDestination]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALL
    - typings.awsSdk.awsSdkStrings.ERROR
    - typings.awsSdk.awsSdkStrings.FATAL
    - typings.awsSdk.awsSdkStrings.OFF
    - java.lang.String
  */
  type LogLevel = typings.awsSdk.stepfunctionsMod._LogLevel | java.lang.String
  
  type Name = java.lang.String
  
  type PageSize = scala.Double
  
  type PageToken = java.lang.String
  
  type ReverseOrder = scala.Boolean
  
  type SensitiveCause = java.lang.String
  
  type SensitiveData = java.lang.String
  
  type SensitiveDataJobInput = java.lang.String
  
  type SensitiveError = java.lang.String
  
  type StateMachineList = js.Array[typings.awsSdk.stepfunctionsMod.StateMachineListItem]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type StateMachineStatus = typings.awsSdk.stepfunctionsMod._StateMachineStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STANDARD
    - typings.awsSdk.awsSdkStrings.EXPRESS
    - java.lang.String
  */
  type StateMachineType = typings.awsSdk.stepfunctionsMod._StateMachineType | java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.stepfunctionsMod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.stepfunctionsMod.Tag]
  
  type TagValue = java.lang.String
  
  type TaskToken = java.lang.String
  
  type TimeoutInSeconds = scala.Double
  
  type Timestamp = typings.std.Date
  
  type TraceHeader = java.lang.String
  
  type UnsignedInteger = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2016-11-23`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.stepfunctionsMod._apiVersion | java.lang.String
  
  type included = scala.Boolean
  
  type truncated = scala.Boolean
}
