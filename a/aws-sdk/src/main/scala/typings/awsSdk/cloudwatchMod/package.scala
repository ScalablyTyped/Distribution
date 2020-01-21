package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudwatchMod {
  type ActionPrefix = java.lang.String
  type ActionsEnabled = scala.Boolean
  type AlarmArn = java.lang.String
  type AlarmDescription = java.lang.String
  type AlarmHistoryItems = js.Array[typings.awsSdk.cloudwatchMod.AlarmHistoryItem]
  type AlarmName = java.lang.String
  type AlarmNamePrefix = java.lang.String
  type AlarmNames = js.Array[typings.awsSdk.cloudwatchMod.AlarmName]
  type AmazonResourceName = java.lang.String
  type AnomalyDetectorExcludedTimeRanges = js.Array[typings.awsSdk.cloudwatchMod.Range]
  type AnomalyDetectorMetricTimezone = java.lang.String
  type AnomalyDetectors = js.Array[typings.awsSdk.cloudwatchMod.AnomalyDetector]
  type BatchFailures = js.Array[typings.awsSdk.cloudwatchMod.PartialFailure]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.cloudwatchMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GreaterThanOrEqualToThreshold
    - typings.awsSdk.awsSdkStrings.GreaterThanThreshold
    - typings.awsSdk.awsSdkStrings.LessThanThreshold
    - typings.awsSdk.awsSdkStrings.LessThanOrEqualToThreshold
    - typings.awsSdk.awsSdkStrings.LessThanLowerOrGreaterThanUpperThreshold
    - typings.awsSdk.awsSdkStrings.LessThanLowerThreshold
    - typings.awsSdk.awsSdkStrings.GreaterThanUpperThreshold
    - java.lang.String
  */
  type ComparisonOperator = typings.awsSdk.cloudwatchMod._ComparisonOperator | java.lang.String
  type Counts = js.Array[typings.awsSdk.cloudwatchMod.DatapointValue]
  type DashboardArn = java.lang.String
  type DashboardBody = java.lang.String
  type DashboardEntries = js.Array[typings.awsSdk.cloudwatchMod.DashboardEntry]
  type DashboardName = java.lang.String
  type DashboardNamePrefix = java.lang.String
  type DashboardNames = js.Array[typings.awsSdk.cloudwatchMod.DashboardName]
  type DashboardValidationMessages = js.Array[typings.awsSdk.cloudwatchMod.DashboardValidationMessage]
  type DataPath = java.lang.String
  type DatapointValue = scala.Double
  type DatapointValueMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cloudwatchMod.DatapointValue]
  type DatapointValues = js.Array[typings.awsSdk.cloudwatchMod.DatapointValue]
  type Datapoints = js.Array[typings.awsSdk.cloudwatchMod.Datapoint]
  type DatapointsToAlarm = scala.Double
  type DimensionFilters = js.Array[typings.awsSdk.cloudwatchMod.DimensionFilter]
  type DimensionName = java.lang.String
  type DimensionValue = java.lang.String
  type Dimensions = js.Array[typings.awsSdk.cloudwatchMod.Dimension]
  type EvaluateLowSampleCountPercentile = java.lang.String
  type EvaluationPeriods = scala.Double
  type ExceptionType = java.lang.String
  type ExtendedStatistic = java.lang.String
  type ExtendedStatistics = js.Array[typings.awsSdk.cloudwatchMod.ExtendedStatistic]
  type FailureCode = java.lang.String
  type FailureDescription = java.lang.String
  type FailureResource = java.lang.String
  type GetMetricDataMaxDatapoints = scala.Double
  type HistoryData = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ConfigurationUpdate
    - typings.awsSdk.awsSdkStrings.StateUpdate
    - typings.awsSdk.awsSdkStrings.Action_
    - java.lang.String
  */
  type HistoryItemType = typings.awsSdk.cloudwatchMod._HistoryItemType | java.lang.String
  type HistorySummary = java.lang.String
  type InsightRuleAggregationStatistic = java.lang.String
  type InsightRuleContributorDatapoints = js.Array[typings.awsSdk.cloudwatchMod.InsightRuleContributorDatapoint]
  type InsightRuleContributorKey = java.lang.String
  type InsightRuleContributorKeyLabel = java.lang.String
  type InsightRuleContributorKeyLabels = js.Array[typings.awsSdk.cloudwatchMod.InsightRuleContributorKeyLabel]
  type InsightRuleContributorKeys = js.Array[typings.awsSdk.cloudwatchMod.InsightRuleContributorKey]
  type InsightRuleContributors = js.Array[typings.awsSdk.cloudwatchMod.InsightRuleContributor]
  type InsightRuleDefinition = java.lang.String
  type InsightRuleMaxResults = scala.Double
  type InsightRuleMetricDatapoints = js.Array[typings.awsSdk.cloudwatchMod.InsightRuleMetricDatapoint]
  type InsightRuleMetricList = js.Array[typings.awsSdk.cloudwatchMod.InsightRuleMetricName]
  type InsightRuleMetricName = java.lang.String
  type InsightRuleName = java.lang.String
  type InsightRuleNames = js.Array[typings.awsSdk.cloudwatchMod.InsightRuleName]
  type InsightRuleOrderBy = java.lang.String
  type InsightRuleSchema = java.lang.String
  type InsightRuleState = java.lang.String
  type InsightRuleUnboundDouble = scala.Double
  type InsightRuleUnboundInteger = scala.Double
  type InsightRuleUnboundLong = scala.Double
  type InsightRules = js.Array[typings.awsSdk.cloudwatchMod.InsightRule]
  type LastModified = typings.std.Date
  type MaxRecords = scala.Double
  type MaxReturnedResultsCount = scala.Double
  type Message = java.lang.String
  type MessageDataCode = java.lang.String
  type MessageDataValue = java.lang.String
  type MetricAlarms = js.Array[typings.awsSdk.cloudwatchMod.MetricAlarm]
  type MetricData = js.Array[typings.awsSdk.cloudwatchMod.MetricDatum]
  type MetricDataQueries = js.Array[typings.awsSdk.cloudwatchMod.MetricDataQuery]
  type MetricDataResultMessages = js.Array[typings.awsSdk.cloudwatchMod.MessageData]
  type MetricDataResults = js.Array[typings.awsSdk.cloudwatchMod.MetricDataResult]
  type MetricExpression = java.lang.String
  type MetricId = java.lang.String
  type MetricLabel = java.lang.String
  type MetricName = java.lang.String
  type MetricWidget = java.lang.String
  type MetricWidgetImage = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.cloudwatchMod.Blob | java.lang.String
  type Metrics = js.Array[typings.awsSdk.cloudwatchMod.Metric]
  type Namespace = java.lang.String
  type NextToken = java.lang.String
  type OutputFormat = java.lang.String
  type Period = scala.Double
  type ResourceList = js.Array[typings.awsSdk.cloudwatchMod.ResourceName]
  type ResourceName = java.lang.String
  type ReturnData = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TimestampDescending
    - typings.awsSdk.awsSdkStrings.TimestampAscending
    - java.lang.String
  */
  type ScanBy = typings.awsSdk.cloudwatchMod._ScanBy | java.lang.String
  type Size = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Seconds_
    - typings.awsSdk.awsSdkStrings.Microseconds
    - typings.awsSdk.awsSdkStrings.Milliseconds_
    - typings.awsSdk.awsSdkStrings.Bytes_
    - typings.awsSdk.awsSdkStrings.Kilobytes
    - typings.awsSdk.awsSdkStrings.Megabytes
    - typings.awsSdk.awsSdkStrings.Gigabytes
    - typings.awsSdk.awsSdkStrings.Terabytes
    - typings.awsSdk.awsSdkStrings.Bits_
    - typings.awsSdk.awsSdkStrings.Kilobits
    - typings.awsSdk.awsSdkStrings.Megabits
    - typings.awsSdk.awsSdkStrings.Gigabits
    - typings.awsSdk.awsSdkStrings.Terabits
    - typings.awsSdk.awsSdkStrings.Percent_
    - typings.awsSdk.awsSdkStrings.Count_
    - typings.awsSdk.awsSdkStrings.BytesSlashSecond
    - typings.awsSdk.awsSdkStrings.KilobytesSlashSecond
    - typings.awsSdk.awsSdkStrings.MegabytesSlashSecond
    - typings.awsSdk.awsSdkStrings.GigabytesSlashSecond
    - typings.awsSdk.awsSdkStrings.TerabytesSlashSecond
    - typings.awsSdk.awsSdkStrings.BitsSlashSecond
    - typings.awsSdk.awsSdkStrings.KilobitsSlashSecond
    - typings.awsSdk.awsSdkStrings.MegabitsSlashSecond
    - typings.awsSdk.awsSdkStrings.GigabitsSlashSecond
    - typings.awsSdk.awsSdkStrings.TerabitsSlashSecond
    - typings.awsSdk.awsSdkStrings.CountSlashSecond
    - typings.awsSdk.awsSdkStrings.None_
    - java.lang.String
  */
  type StandardUnit = typings.awsSdk.cloudwatchMod._StandardUnit | java.lang.String
  type Stat = java.lang.String
  type StateReason = java.lang.String
  type StateReasonData = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OK
    - typings.awsSdk.awsSdkStrings.ALARM
    - typings.awsSdk.awsSdkStrings.INSUFFICIENT_DATA
    - java.lang.String
  */
  type StateValue = typings.awsSdk.cloudwatchMod._StateValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SampleCount
    - typings.awsSdk.awsSdkStrings.Average_
    - typings.awsSdk.awsSdkStrings.Sum_
    - typings.awsSdk.awsSdkStrings.Minimum_
    - typings.awsSdk.awsSdkStrings.Maximum_
    - java.lang.String
  */
  type Statistic = typings.awsSdk.cloudwatchMod._Statistic | java.lang.String
  type Statistics = js.Array[typings.awsSdk.cloudwatchMod.Statistic]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Complete_
    - typings.awsSdk.awsSdkStrings.InternalError
    - typings.awsSdk.awsSdkStrings.PartialData
    - java.lang.String
  */
  type StatusCode = typings.awsSdk.cloudwatchMod._StatusCode | java.lang.String
  type StorageResolution = scala.Double
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.cloudwatchMod.TagKey]
  type TagList = js.Array[typings.awsSdk.cloudwatchMod.Tag]
  type TagValue = java.lang.String
  type Threshold = scala.Double
  type Timestamp = typings.std.Date
  type Timestamps = js.Array[typings.awsSdk.cloudwatchMod.Timestamp]
  type TreatMissingData = java.lang.String
  type Values = js.Array[typings.awsSdk.cloudwatchMod.DatapointValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2010-08-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.cloudwatchMod._apiVersion | java.lang.String
}
