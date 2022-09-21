package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.AggregatedRelativeTotalTime
import typings.awsSdk.awsSdkStrings.AnomalyDetection
import typings.awsSdk.awsSdkStrings.agentPermissions
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActionGroup = agentPermissions | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SamplingIntervalInMilliseconds
  - typings.awsSdk.awsSdkStrings.ReportingIntervalInMilliseconds
  - typings.awsSdk.awsSdkStrings.MinimumTimeForReportingInMilliseconds
  - typings.awsSdk.awsSdkStrings.MemoryUsageLimitPercent
  - typings.awsSdk.awsSdkStrings.MaxStackDepth
  - java.lang.String
*/
type AgentParameterField = _AgentParameterField | java.lang.String

type AgentParameters = StringDictionary[String]

type AgentProfile = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type AggregatedProfile = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PT5M
  - typings.awsSdk.awsSdkStrings.PT1H
  - typings.awsSdk.awsSdkStrings.P1D
  - java.lang.String
*/
type AggregationPeriod = _AggregationPeriod | java.lang.String

type Anomalies = js.Array[Anomaly]

type AnomalyInstanceId = java.lang.String

type AnomalyInstances = js.Array[AnomalyInstance]

type Boolean = scala.Boolean

type ChannelId = java.lang.String

type ChannelUri = java.lang.String

type Channels = js.Array[Channel]

type ClientToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Default_
  - typings.awsSdk.awsSdkStrings.AWSLambda
  - java.lang.String
*/
type ComputePlatform = _ComputePlatform | java.lang.String

type Double = scala.Double

type EventPublisher = AnomalyDetection | java.lang.String

type EventPublishers = js.Array[EventPublisher]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Positive_
  - typings.awsSdk.awsSdkStrings.Negative_
  - java.lang.String
*/
type FeedbackType = _FeedbackType | java.lang.String

type FindingsReportId = java.lang.String

type FindingsReportSummaries = js.Array[FindingsReportSummary]

type FleetInstanceId = java.lang.String

type FrameMetricData = js.Array[FrameMetricDatum]

type FrameMetricValue = scala.Double

type FrameMetricValues = js.Array[FrameMetricValue]

type FrameMetrics = js.Array[FrameMetric]

type Integer = scala.Double

type ListOfTimestamps = js.Array[TimestampStructure]

type Locale = java.lang.String

type Matches = js.Array[Match]

type MaxDepth = scala.Double

type MaxResults = scala.Double

type Metadata = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ComputePlatform
  - typings.awsSdk.awsSdkStrings.AgentId
  - typings.awsSdk.awsSdkStrings.AwsRequestId
  - typings.awsSdk.awsSdkStrings.ExecutionEnvironment
  - typings.awsSdk.awsSdkStrings.LambdaFunctionArn
  - typings.awsSdk.awsSdkStrings.LambdaMemoryLimitInMB
  - typings.awsSdk.awsSdkStrings.LambdaRemainingTimeInMilliseconds
  - typings.awsSdk.awsSdkStrings.LambdaTimeGapBetweenInvokesInMilliseconds
  - typings.awsSdk.awsSdkStrings.LambdaPreviousExecutionTimeInMilliseconds
  - java.lang.String
*/
type MetadataField = _MetadataField | java.lang.String

type MetricType = AggregatedRelativeTotalTime | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TimestampDescending
  - typings.awsSdk.awsSdkStrings.TimestampAscending
  - java.lang.String
*/
type OrderBy = _OrderBy | java.lang.String

type PaginationToken = java.lang.String

type Percentage = scala.Double

type Period = java.lang.String

type Principal = java.lang.String

type Principals = js.Array[Principal]

type ProfileTimes = js.Array[ProfileTime]

type ProfilingGroupArn = java.lang.String

type ProfilingGroupDescriptions = js.Array[ProfilingGroupDescription]

type ProfilingGroupName = java.lang.String

type ProfilingGroupNames = js.Array[ProfilingGroupName]

type Recommendations = js.Array[Recommendation]

type RevisionId = java.lang.String

type String = java.lang.String

type Strings = js.Array[String]

type TagKeys = js.Array[String]

type TagsMap = StringDictionary[String]

type TargetFrame = js.Array[String]

type TargetFrames = js.Array[TargetFrame]

type ThreadStates = js.Array[String]

type Timestamp = js.Date

type UnprocessedEndTimeMap = StringDictionary[ListOfTimestamps]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2019-07-18`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
