package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AmazonResourceArn = String

type Boolean = scala.Boolean

type BoundedLengthString = String

type Comments = String

type ComponentName = String

type ComponentTimestampDelimiter = String

type DataDelayOffsetInMinutes = Double

type DataIngestionJobSummaries = js.Array[DataIngestionJobSummary]

type DataSizeInBytes = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PT5M
  - typings.awsSdk.awsSdkStrings.PT10M
  - typings.awsSdk.awsSdkStrings.PT15M
  - typings.awsSdk.awsSdkStrings.PT30M
  - typings.awsSdk.awsSdkStrings.PT1H
  - java.lang.String
*/
type DataUploadFrequency = _DataUploadFrequency | String

type DatasetArn = String

type DatasetIdentifier = String

type DatasetName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.INGESTION_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - java.lang.String
*/
type DatasetStatus = _DatasetStatus | String

type DatasetSummaries = js.Array[DatasetSummary]

type Equipment = String

type EventDurationInSeconds = Double

type FaultCode = String

type FaultCodes = js.Array[FaultCode]

type FileNameTimestampFormat = String

type Float = Double

type IamRoleArn = String

type IdempotenceToken = String

type InferenceEventSummaries = js.Array[InferenceEventSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type InferenceExecutionStatus = _InferenceExecutionStatus | String

type InferenceExecutionSummaries = js.Array[InferenceExecutionSummary]

type InferenceSchedulerArn = String

type InferenceSchedulerIdentifier = String

type InferenceSchedulerName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type InferenceSchedulerStatus = _InferenceSchedulerStatus | String

type InferenceSchedulerSummaries = js.Array[InferenceSchedulerSummary]

type IngestionJobId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type IngestionJobStatus = _IngestionJobStatus | String

type InlineDataSchema = String

type Integer = Double

type KeyPattern = String

type KmsKeyArn = String

type LabelGroupArn = String

type LabelGroupName = String

type LabelGroupSummaries = js.Array[LabelGroupSummary]

type LabelId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ANOMALY
  - typings.awsSdk.awsSdkStrings.NO_ANOMALY
  - typings.awsSdk.awsSdkStrings.NEUTRAL
  - java.lang.String
*/
type LabelRating = _LabelRating | String

type LabelSummaries = js.Array[LabelSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ANOMALOUS
  - typings.awsSdk.awsSdkStrings.NORMAL
  - java.lang.String
*/
type LatestInferenceResult = _LatestInferenceResult | String

type ListOfDiscardedFiles = js.Array[S3Object]

type MaxResults = Double

type ModelArn = String

type ModelMetrics = String

type ModelName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ModelStatus = _ModelStatus | String

type ModelSummaries = js.Array[ModelSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DECREASING
  - typings.awsSdk.awsSdkStrings.INCREASING
  - typings.awsSdk.awsSdkStrings.STATIC
  - java.lang.String
*/
type Monotonicity = _Monotonicity | String

type NameOrArn = String

type NextToken = String

type OffCondition = String

type S3Bucket = String

type S3Key = String

type S3Prefix = String

type SensorName = String

type SensorStatisticsSummaries = js.Array[SensorStatisticsSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.POTENTIAL_ISSUE_DETECTED
  - typings.awsSdk.awsSdkStrings.NO_ISSUE_DETECTED
  - java.lang.String
*/
type StatisticalIssueStatus = _StatisticalIssueStatus | String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PT1S
  - typings.awsSdk.awsSdkStrings.PT5S
  - typings.awsSdk.awsSdkStrings.PT10S
  - typings.awsSdk.awsSdkStrings.PT15S
  - typings.awsSdk.awsSdkStrings.PT30S
  - typings.awsSdk.awsSdkStrings.PT1M
  - typings.awsSdk.awsSdkStrings.PT5M
  - typings.awsSdk.awsSdkStrings.PT10M
  - typings.awsSdk.awsSdkStrings.PT15M
  - typings.awsSdk.awsSdkStrings.PT30M
  - typings.awsSdk.awsSdkStrings.PT1H
  - java.lang.String
*/
type TargetSamplingRate = _TargetSamplingRate | String

type TimeZoneOffset = String

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-12-15`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
