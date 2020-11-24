package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object xrayMod {
  
  type AliasList = js.Array[typings.awsSdk.xrayMod.Alias]
  
  type AliasNames = js.Array[typings.awsSdk.xrayMod.String]
  
  type AmazonResourceName = java.lang.String
  
  type AnnotationKey = java.lang.String
  
  type Annotations = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.xrayMod.ValuesWithServiceIds]
  
  type AnomalousServiceList = js.Array[typings.awsSdk.xrayMod.AnomalousService]
  
  type AttributeKey = java.lang.String
  
  type AttributeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.xrayMod.AttributeValue]
  
  type AttributeValue = java.lang.String
  
  type Boolean = scala.Boolean
  
  type BorrowCount = scala.Double
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.xrayMod.ClientApiVersions
  
  type ClientID = java.lang.String
  
  type Double = scala.Double
  
  type EC2InstanceId = java.lang.String
  
  type EdgeList = js.Array[typings.awsSdk.xrayMod.Edge]
  
  type EncryptionKeyId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type EncryptionStatus = typings.awsSdk.xrayMod._EncryptionStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.KMS
    - java.lang.String
  */
  type EncryptionType = typings.awsSdk.xrayMod._EncryptionType | java.lang.String
  
  type EntitySelectorExpression = java.lang.String
  
  type ErrorRootCauseEntityPath = js.Array[typings.awsSdk.xrayMod.ErrorRootCauseEntity]
  
  type ErrorRootCauseServices = js.Array[typings.awsSdk.xrayMod.ErrorRootCauseService]
  
  type ErrorRootCauses = js.Array[typings.awsSdk.xrayMod.ErrorRootCause]
  
  type EventSummaryText = java.lang.String
  
  type FaultRootCauseEntityPath = js.Array[typings.awsSdk.xrayMod.FaultRootCauseEntity]
  
  type FaultRootCauseServices = js.Array[typings.awsSdk.xrayMod.FaultRootCauseService]
  
  type FaultRootCauses = js.Array[typings.awsSdk.xrayMod.FaultRootCause]
  
  type FilterExpression = java.lang.String
  
  type FixedRate = scala.Double
  
  type GetGroupsNextToken = java.lang.String
  
  type GetInsightEventsMaxResults = scala.Double
  
  type GetInsightSummariesMaxResults = scala.Double
  
  type GroupARN = java.lang.String
  
  type GroupName = java.lang.String
  
  type GroupSummaryList = js.Array[typings.awsSdk.xrayMod.GroupSummary]
  
  type HTTPMethod = java.lang.String
  
  type Histogram = js.Array[typings.awsSdk.xrayMod.HistogramEntry]
  
  type Host = java.lang.String
  
  type Hostname = java.lang.String
  
  type InsightCategory = typings.awsSdk.awsSdkStrings.FAULT | java.lang.String
  
  type InsightCategoryList = js.Array[typings.awsSdk.xrayMod.InsightCategory]
  
  type InsightEventList = js.Array[typings.awsSdk.xrayMod.InsightEvent]
  
  type InsightId = java.lang.String
  
  type InsightImpactGraphEdgeList = js.Array[typings.awsSdk.xrayMod.InsightImpactGraphEdge]
  
  type InsightImpactGraphServiceList = js.Array[typings.awsSdk.xrayMod.InsightImpactGraphService]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.CLOSED
    - java.lang.String
  */
  type InsightState = typings.awsSdk.xrayMod._InsightState | java.lang.String
  
  type InsightStateList = js.Array[typings.awsSdk.xrayMod.InsightState]
  
  type InsightSummaryList = js.Array[typings.awsSdk.xrayMod.InsightSummary]
  
  type InsightSummaryText = java.lang.String
  
  type Integer = scala.Double
  
  type NullableBoolean = scala.Boolean
  
  type NullableDouble = scala.Double
  
  type NullableInteger = scala.Double
  
  type NullableLong = scala.Double
  
  type Priority = scala.Double
  
  type RequestCount = scala.Double
  
  type ReservoirSize = scala.Double
  
  type ResourceARN = java.lang.String
  
  type ResponseTimeRootCauseEntityPath = js.Array[typings.awsSdk.xrayMod.ResponseTimeRootCauseEntity]
  
  type ResponseTimeRootCauseServices = js.Array[typings.awsSdk.xrayMod.ResponseTimeRootCauseService]
  
  type ResponseTimeRootCauses = js.Array[typings.awsSdk.xrayMod.ResponseTimeRootCause]
  
  type RootCauseExceptions = js.Array[typings.awsSdk.xrayMod.RootCauseException]
  
  type RuleName = java.lang.String
  
  type SampledCount = scala.Double
  
  type SamplingRuleRecordList = js.Array[typings.awsSdk.xrayMod.SamplingRuleRecord]
  
  type SamplingStatisticSummaryList = js.Array[typings.awsSdk.xrayMod.SamplingStatisticSummary]
  
  type SamplingStatisticsDocumentList = js.Array[typings.awsSdk.xrayMod.SamplingStatisticsDocument]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PartialScan
    - typings.awsSdk.awsSdkStrings.FixedRate
    - java.lang.String
  */
  type SamplingStrategyName = typings.awsSdk.xrayMod._SamplingStrategyName | java.lang.String
  
  type SamplingTargetDocumentList = js.Array[typings.awsSdk.xrayMod.SamplingTargetDocument]
  
  type SegmentDocument = java.lang.String
  
  type SegmentId = java.lang.String
  
  type SegmentList = js.Array[typings.awsSdk.xrayMod.Segment]
  
  type ServiceIds = js.Array[typings.awsSdk.xrayMod.ServiceId]
  
  type ServiceList = js.Array[typings.awsSdk.xrayMod.Service]
  
  type ServiceName = java.lang.String
  
  type ServiceNames = js.Array[typings.awsSdk.xrayMod.String]
  
  type ServiceType = java.lang.String
  
  type String = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.xrayMod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.xrayMod.Tag]
  
  type TagValue = java.lang.String
  
  type TelemetryRecordList = js.Array[typings.awsSdk.xrayMod.TelemetryRecord]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TraceId
    - typings.awsSdk.awsSdkStrings.Event_
    - java.lang.String
  */
  type TimeRangeType = typings.awsSdk.xrayMod._TimeRangeType | java.lang.String
  
  type TimeSeriesServiceStatisticsList = js.Array[typings.awsSdk.xrayMod.TimeSeriesServiceStatistics]
  
  type Timestamp = typings.std.Date
  
  type Token = java.lang.String
  
  type TraceAvailabilityZones = js.Array[typings.awsSdk.xrayMod.AvailabilityZoneDetail]
  
  type TraceId = java.lang.String
  
  type TraceIdList = js.Array[typings.awsSdk.xrayMod.TraceId]
  
  type TraceInstanceIds = js.Array[typings.awsSdk.xrayMod.InstanceIdDetail]
  
  type TraceList = js.Array[typings.awsSdk.xrayMod.Trace]
  
  type TraceResourceARNs = js.Array[typings.awsSdk.xrayMod.ResourceARNDetail]
  
  type TraceSegmentDocument = java.lang.String
  
  type TraceSegmentDocumentList = js.Array[typings.awsSdk.xrayMod.TraceSegmentDocument]
  
  type TraceSummaryList = js.Array[typings.awsSdk.xrayMod.TraceSummary]
  
  type TraceUsers = js.Array[typings.awsSdk.xrayMod.TraceUser]
  
  type URLPath = java.lang.String
  
  type UnprocessedStatisticsList = js.Array[typings.awsSdk.xrayMod.UnprocessedStatistics]
  
  type UnprocessedTraceIdList = js.Array[typings.awsSdk.xrayMod.TraceId]
  
  type UnprocessedTraceSegmentList = js.Array[typings.awsSdk.xrayMod.UnprocessedTraceSegment]
  
  type ValuesWithServiceIds = js.Array[typings.awsSdk.xrayMod.ValueWithServiceIds]
  
  type Version = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2016-04-12`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.xrayMod._apiVersion | java.lang.String
}
