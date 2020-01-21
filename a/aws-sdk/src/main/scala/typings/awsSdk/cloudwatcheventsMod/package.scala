package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudwatcheventsMod {
  type AccountId = java.lang.String
  type Action = java.lang.String
  type Arn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type AssignPublicIp = typings.awsSdk.cloudwatcheventsMod._AssignPublicIp | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.cloudwatcheventsMod.ClientApiVersions
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type EventBusList = js.Array[typings.awsSdk.cloudwatcheventsMod.EventBus]
  type EventBusName = java.lang.String
  type EventId = java.lang.String
  type EventPattern = java.lang.String
  type EventResource = java.lang.String
  type EventResourceList = js.Array[typings.awsSdk.cloudwatcheventsMod.EventResource]
  type EventSourceList = js.Array[typings.awsSdk.cloudwatcheventsMod.EventSource]
  type EventSourceName = java.lang.String
  type EventSourceNamePrefix = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type EventSourceState = typings.awsSdk.cloudwatcheventsMod._EventSourceState | java.lang.String
  type EventTime = typings.std.Date
  type InputTransformerPathKey = java.lang.String
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EC2
    - typings.awsSdk.awsSdkStrings.FARGATE
    - java.lang.String
  */
  type LaunchType = typings.awsSdk.cloudwatcheventsMod._LaunchType | java.lang.String
  type LimitMax100 = scala.Double
  type LimitMin1 = scala.Double
  type ManagedBy = java.lang.String
  type MessageGroupId = java.lang.String
  type NextToken = java.lang.String
  type NonPartnerEventBusName = java.lang.String
  type PartnerEventSourceAccountList = js.Array[typings.awsSdk.cloudwatcheventsMod.PartnerEventSourceAccount]
  type PartnerEventSourceList = js.Array[typings.awsSdk.cloudwatcheventsMod.PartnerEventSource]
  type PartnerEventSourceNamePrefix = java.lang.String
  type Principal = java.lang.String
  type PutEventsRequestEntryList = js.Array[typings.awsSdk.cloudwatcheventsMod.PutEventsRequestEntry]
  type PutEventsResultEntryList = js.Array[typings.awsSdk.cloudwatcheventsMod.PutEventsResultEntry]
  type PutPartnerEventsRequestEntryList = js.Array[typings.awsSdk.cloudwatcheventsMod.PutPartnerEventsRequestEntry]
  type PutPartnerEventsResultEntryList = js.Array[typings.awsSdk.cloudwatcheventsMod.PutPartnerEventsResultEntry]
  type PutTargetsResultEntryList = js.Array[typings.awsSdk.cloudwatcheventsMod.PutTargetsResultEntry]
  type RemoveTargetsResultEntryList = js.Array[typings.awsSdk.cloudwatcheventsMod.RemoveTargetsResultEntry]
  type RoleArn = java.lang.String
  type RuleArn = java.lang.String
  type RuleDescription = java.lang.String
  type RuleName = java.lang.String
  type RuleNameList = js.Array[typings.awsSdk.cloudwatcheventsMod.RuleName]
  type RuleResponseList = js.Array[typings.awsSdk.cloudwatcheventsMod.Rule]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type RuleState = typings.awsSdk.cloudwatcheventsMod._RuleState | java.lang.String
  type RunCommandTargetKey = java.lang.String
  type RunCommandTargetValue = java.lang.String
  type RunCommandTargetValues = js.Array[typings.awsSdk.cloudwatcheventsMod.RunCommandTargetValue]
  type RunCommandTargets = js.Array[typings.awsSdk.cloudwatcheventsMod.RunCommandTarget]
  type ScheduleExpression = java.lang.String
  type StatementId = java.lang.String
  type String = java.lang.String
  type StringList = js.Array[typings.awsSdk.cloudwatcheventsMod.String]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.cloudwatcheventsMod.TagKey]
  type TagList = js.Array[typings.awsSdk.cloudwatcheventsMod.Tag]
  type TagValue = java.lang.String
  type TargetArn = java.lang.String
  type TargetId = java.lang.String
  type TargetIdList = js.Array[typings.awsSdk.cloudwatcheventsMod.TargetId]
  type TargetInput = java.lang.String
  type TargetInputPath = java.lang.String
  type TargetList = js.Array[typings.awsSdk.cloudwatcheventsMod.Target]
  type TargetPartitionKeyPath = java.lang.String
  type Timestamp = typings.std.Date
  type TransformerInput = java.lang.String
  type TransformerPaths = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cloudwatcheventsMod.TargetInputPath]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2014-02-03`
    - typings.awsSdk.awsSdkStrings.`2015-10-07`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.cloudwatcheventsMod._apiVersion | java.lang.String
}
