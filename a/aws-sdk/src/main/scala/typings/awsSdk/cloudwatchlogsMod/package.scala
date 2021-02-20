package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cloudwatchlogsMod {
  
  type AccessPolicy = java.lang.String
  
  type Arn = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.cloudwatchlogsMod.ClientApiVersions
  
  type Days = scala.Double
  
  type DefaultValue = scala.Double
  
  type Descending = scala.Boolean
  
  type DescribeLimit = scala.Double
  
  type DescribeQueriesMaxResults = scala.Double
  
  type DestinationArn = java.lang.String
  
  type DestinationName = java.lang.String
  
  type Destinations = js.Array[typings.awsSdk.cloudwatchlogsMod.Destination]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Random_
    - typings.awsSdk.awsSdkStrings.ByLogStream
    - java.lang.String
  */
  type Distribution = typings.awsSdk.cloudwatchlogsMod._Distribution | java.lang.String
  
  type EventId = java.lang.String
  
  type EventMessage = java.lang.String
  
  type EventNumber = scala.Double
  
  type EventsLimit = scala.Double
  
  type ExportDestinationBucket = java.lang.String
  
  type ExportDestinationPrefix = java.lang.String
  
  type ExportTaskId = java.lang.String
  
  type ExportTaskName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CANCELLED
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.PENDING_CANCEL
    - typings.awsSdk.awsSdkStrings.RUNNING
    - java.lang.String
  */
  type ExportTaskStatusCode = typings.awsSdk.cloudwatchlogsMod._ExportTaskStatusCode | java.lang.String
  
  type ExportTaskStatusMessage = java.lang.String
  
  type ExportTasks = js.Array[typings.awsSdk.cloudwatchlogsMod.ExportTask]
  
  type ExtractedValues = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cloudwatchlogsMod.Value]
  
  type Field = java.lang.String
  
  type FilterCount = scala.Double
  
  type FilterName = java.lang.String
  
  type FilterPattern = java.lang.String
  
  type FilteredLogEvents = js.Array[typings.awsSdk.cloudwatchlogsMod.FilteredLogEvent]
  
  type InputLogEvents = js.Array[typings.awsSdk.cloudwatchlogsMod.InputLogEvent]
  
  type InputLogStreamNames = js.Array[typings.awsSdk.cloudwatchlogsMod.LogStreamName]
  
  type Interleaved = scala.Boolean
  
  type KmsKeyId = java.lang.String
  
  type LogEventIndex = scala.Double
  
  type LogGroupFieldList = js.Array[typings.awsSdk.cloudwatchlogsMod.LogGroupField]
  
  type LogGroupName = java.lang.String
  
  type LogGroupNames = js.Array[typings.awsSdk.cloudwatchlogsMod.LogGroupName]
  
  type LogGroups = js.Array[typings.awsSdk.cloudwatchlogsMod.LogGroup]
  
  type LogRecord = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cloudwatchlogsMod.Value]
  
  type LogRecordPointer = java.lang.String
  
  type LogStreamName = java.lang.String
  
  type LogStreamSearchedCompletely = scala.Boolean
  
  type LogStreams = js.Array[typings.awsSdk.cloudwatchlogsMod.LogStream]
  
  type MetricFilterMatches = js.Array[typings.awsSdk.cloudwatchlogsMod.MetricFilterMatchRecord]
  
  type MetricFilters = js.Array[typings.awsSdk.cloudwatchlogsMod.MetricFilter]
  
  type MetricName = java.lang.String
  
  type MetricNamespace = java.lang.String
  
  type MetricTransformations = js.Array[typings.awsSdk.cloudwatchlogsMod.MetricTransformation]
  
  type MetricValue = java.lang.String
  
  type NextToken = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.LogStreamName
    - typings.awsSdk.awsSdkStrings.LastEventTime
    - java.lang.String
  */
  type OrderBy = typings.awsSdk.cloudwatchlogsMod._OrderBy | java.lang.String
  
  type OutputLogEvents = js.Array[typings.awsSdk.cloudwatchlogsMod.OutputLogEvent]
  
  type Percentage = scala.Double
  
  type PolicyDocument = java.lang.String
  
  type PolicyName = java.lang.String
  
  type QueryDefinitionList = js.Array[typings.awsSdk.cloudwatchlogsMod.QueryDefinition]
  
  type QueryDefinitionName = java.lang.String
  
  type QueryDefinitionString = java.lang.String
  
  type QueryId = java.lang.String
  
  type QueryInfoList = js.Array[typings.awsSdk.cloudwatchlogsMod.QueryInfo]
  
  type QueryListMaxResults = scala.Double
  
  type QueryResults = js.Array[typings.awsSdk.cloudwatchlogsMod.ResultRows]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Scheduled_
    - typings.awsSdk.awsSdkStrings.Running_
    - typings.awsSdk.awsSdkStrings.Complete_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Cancelled_
    - java.lang.String
  */
  type QueryStatus = typings.awsSdk.cloudwatchlogsMod._QueryStatus | java.lang.String
  
  type QueryString = java.lang.String
  
  type ResourcePolicies = js.Array[typings.awsSdk.cloudwatchlogsMod.ResourcePolicy]
  
  type ResultRows = js.Array[typings.awsSdk.cloudwatchlogsMod.ResultField]
  
  type RoleArn = java.lang.String
  
  type SearchedLogStreams = js.Array[typings.awsSdk.cloudwatchlogsMod.SearchedLogStream]
  
  type SequenceToken = java.lang.String
  
  type StartFromHead = scala.Boolean
  
  type StatsValue = scala.Double
  
  type StoredBytes = scala.Double
  
  type SubscriptionFilters = js.Array[typings.awsSdk.cloudwatchlogsMod.SubscriptionFilter]
  
  type Success = scala.Boolean
  
  type TagKey = java.lang.String
  
  type TagList = js.Array[typings.awsSdk.cloudwatchlogsMod.TagKey]
  
  type TagValue = java.lang.String
  
  type Tags = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cloudwatchlogsMod.TagValue]
  
  type TargetArn = java.lang.String
  
  type TestEventMessages = js.Array[typings.awsSdk.cloudwatchlogsMod.EventMessage]
  
  type Timestamp = scala.Double
  
  type Token = java.lang.String
  
  type Value = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2014-03-28`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.cloudwatchlogsMod._apiVersion | java.lang.String
}
