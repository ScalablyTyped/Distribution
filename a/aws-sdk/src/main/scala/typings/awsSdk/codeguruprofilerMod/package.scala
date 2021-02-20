package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object codeguruprofilerMod {
  
  type ActionGroup = typings.awsSdk.awsSdkStrings.agentPermissions | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.MaxStackDepth
    - typings.awsSdk.awsSdkStrings.MemoryUsageLimitPercent
    - typings.awsSdk.awsSdkStrings.MinimumTimeForReportingInMilliseconds
    - typings.awsSdk.awsSdkStrings.ReportingIntervalInMilliseconds
    - typings.awsSdk.awsSdkStrings.SamplingIntervalInMilliseconds
    - java.lang.String
  */
  type AgentParameterField = typings.awsSdk.codeguruprofilerMod._AgentParameterField | java.lang.String
  
  type AgentParameters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.codeguruprofilerMod.String]
  
  type AgentProfile = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.codeguruprofilerMod.Blob | java.lang.String
  
  type AggregatedProfile = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.codeguruprofilerMod.Blob | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.P1D
    - typings.awsSdk.awsSdkStrings.PT1H
    - typings.awsSdk.awsSdkStrings.PT5M
    - java.lang.String
  */
  type AggregationPeriod = typings.awsSdk.codeguruprofilerMod._AggregationPeriod | java.lang.String
  
  type Anomalies = js.Array[typings.awsSdk.codeguruprofilerMod.Anomaly]
  
  type AnomalyInstanceId = java.lang.String
  
  type AnomalyInstances = js.Array[typings.awsSdk.codeguruprofilerMod.AnomalyInstance]
  
  type Boolean = scala.Boolean
  
  type ChannelId = java.lang.String
  
  type ChannelUri = java.lang.String
  
  type Channels = js.Array[typings.awsSdk.codeguruprofilerMod.Channel]
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.codeguruprofilerMod.ClientApiVersions
  
  type ClientToken = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AWSLambda
    - typings.awsSdk.awsSdkStrings.Default_
    - java.lang.String
  */
  type ComputePlatform = typings.awsSdk.codeguruprofilerMod._ComputePlatform | java.lang.String
  
  type Double = scala.Double
  
  type EventPublisher = typings.awsSdk.awsSdkStrings.AnomalyDetection | java.lang.String
  
  type EventPublishers = js.Array[typings.awsSdk.codeguruprofilerMod.EventPublisher]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Negative_
    - typings.awsSdk.awsSdkStrings.Positive_
    - java.lang.String
  */
  type FeedbackType = typings.awsSdk.codeguruprofilerMod._FeedbackType | java.lang.String
  
  type FindingsReportId = java.lang.String
  
  type FindingsReportSummaries = js.Array[typings.awsSdk.codeguruprofilerMod.FindingsReportSummary]
  
  type FleetInstanceId = java.lang.String
  
  type FrameMetricData = js.Array[typings.awsSdk.codeguruprofilerMod.FrameMetricDatum]
  
  type FrameMetricValues = js.Array[typings.awsSdk.codeguruprofilerMod.Double]
  
  type FrameMetrics = js.Array[typings.awsSdk.codeguruprofilerMod.FrameMetric]
  
  type Integer = scala.Double
  
  type ListOfTimestamps = js.Array[typings.awsSdk.codeguruprofilerMod.TimestampStructure]
  
  type Locale = java.lang.String
  
  type Matches = js.Array[typings.awsSdk.codeguruprofilerMod.Match]
  
  type MaxDepth = scala.Double
  
  type MaxResults = scala.Double
  
  type Metadata = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.codeguruprofilerMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AgentId
    - typings.awsSdk.awsSdkStrings.AwsRequestId
    - typings.awsSdk.awsSdkStrings.ComputePlatform
    - typings.awsSdk.awsSdkStrings.ExecutionEnvironment
    - typings.awsSdk.awsSdkStrings.LambdaFunctionArn
    - typings.awsSdk.awsSdkStrings.LambdaMemoryLimitInMB
    - typings.awsSdk.awsSdkStrings.LambdaPreviousExecutionTimeInMilliseconds
    - typings.awsSdk.awsSdkStrings.LambdaRemainingTimeInMilliseconds
    - typings.awsSdk.awsSdkStrings.LambdaTimeGapBetweenInvokesInMilliseconds
    - java.lang.String
  */
  type MetadataField = typings.awsSdk.codeguruprofilerMod._MetadataField | java.lang.String
  
  type MetricType = typings.awsSdk.awsSdkStrings.AggregatedRelativeTotalTime | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TimestampAscending
    - typings.awsSdk.awsSdkStrings.TimestampDescending
    - java.lang.String
  */
  type OrderBy = typings.awsSdk.codeguruprofilerMod._OrderBy | java.lang.String
  
  type PaginationToken = java.lang.String
  
  type Percentage = scala.Double
  
  type Period = java.lang.String
  
  type Principal = java.lang.String
  
  type Principals = js.Array[typings.awsSdk.codeguruprofilerMod.Principal]
  
  type ProfileTimes = js.Array[typings.awsSdk.codeguruprofilerMod.ProfileTime]
  
  type ProfilingGroupArn = java.lang.String
  
  type ProfilingGroupDescriptions = js.Array[typings.awsSdk.codeguruprofilerMod.ProfilingGroupDescription]
  
  type ProfilingGroupName = java.lang.String
  
  type ProfilingGroupNames = js.Array[typings.awsSdk.codeguruprofilerMod.ProfilingGroupName]
  
  type Recommendations = js.Array[typings.awsSdk.codeguruprofilerMod.Recommendation]
  
  type RevisionId = java.lang.String
  
  type String = java.lang.String
  
  type Strings = js.Array[typings.awsSdk.codeguruprofilerMod.String]
  
  type TagKeys = js.Array[typings.awsSdk.codeguruprofilerMod.String]
  
  type TagsMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.codeguruprofilerMod.String]
  
  type TargetFrame = js.Array[typings.awsSdk.codeguruprofilerMod.String]
  
  type TargetFrames = js.Array[typings.awsSdk.codeguruprofilerMod.TargetFrame]
  
  type ThreadStates = js.Array[typings.awsSdk.codeguruprofilerMod.String]
  
  type Timestamp = typings.std.Date
  
  type UnprocessedEndTimeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.codeguruprofilerMod.ListOfTimestamps]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-07-18`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.codeguruprofilerMod._apiVersion | java.lang.String
}
