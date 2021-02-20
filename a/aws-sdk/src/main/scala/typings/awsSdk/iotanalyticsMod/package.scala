package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object iotanalyticsMod {
  
  type ActivityBatchSize = scala.Double
  
  type ActivityName = java.lang.String
  
  type AttributeName = java.lang.String
  
  type AttributeNameMapping = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iotanalyticsMod.AttributeName]
  
  type AttributeNames = js.Array[typings.awsSdk.iotanalyticsMod.AttributeName]
  
  type BatchPutMessageErrorEntries = js.Array[typings.awsSdk.iotanalyticsMod.BatchPutMessageErrorEntry]
  
  type BucketKeyExpression = java.lang.String
  
  type BucketName = java.lang.String
  
  type ChannelArn = java.lang.String
  
  type ChannelName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type ChannelStatus = typings.awsSdk.iotanalyticsMod._ChannelStatus | java.lang.String
  
  type ChannelSummaries = js.Array[typings.awsSdk.iotanalyticsMod.ChannelSummary]
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.iotanalyticsMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACU_1
    - typings.awsSdk.awsSdkStrings.ACU_2
    - java.lang.String
  */
  type ComputeType = typings.awsSdk.iotanalyticsMod._ComputeType | java.lang.String
  
  type DatasetActionName = java.lang.String
  
  type DatasetActionSummaries = js.Array[typings.awsSdk.iotanalyticsMod.DatasetActionSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.QUERY
    - typings.awsSdk.awsSdkStrings.CONTAINER
    - java.lang.String
  */
  type DatasetActionType = typings.awsSdk.iotanalyticsMod._DatasetActionType | java.lang.String
  
  type DatasetActions = js.Array[typings.awsSdk.iotanalyticsMod.DatasetAction]
  
  type DatasetArn = java.lang.String
  
  type DatasetContentDeliveryRules = js.Array[typings.awsSdk.iotanalyticsMod.DatasetContentDeliveryRule]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type DatasetContentState = typings.awsSdk.iotanalyticsMod._DatasetContentState | java.lang.String
  
  type DatasetContentSummaries = js.Array[typings.awsSdk.iotanalyticsMod.DatasetContentSummary]
  
  type DatasetContentVersion = java.lang.String
  
  type DatasetEntries = js.Array[typings.awsSdk.iotanalyticsMod.DatasetEntry]
  
  type DatasetName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type DatasetStatus = typings.awsSdk.iotanalyticsMod._DatasetStatus | java.lang.String
  
  type DatasetSummaries = js.Array[typings.awsSdk.iotanalyticsMod.DatasetSummary]
  
  type DatasetTriggers = js.Array[typings.awsSdk.iotanalyticsMod.DatasetTrigger]
  
  type DatastoreArn = java.lang.String
  
  type DatastoreName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type DatastoreStatus = typings.awsSdk.iotanalyticsMod._DatastoreStatus | java.lang.String
  
  type DatastoreSummaries = js.Array[typings.awsSdk.iotanalyticsMod.DatastoreSummary]
  
  type DoubleValue = scala.Double
  
  type EndTime = typings.std.Date
  
  type EntryName = java.lang.String
  
  type ErrorCode = java.lang.String
  
  type ErrorMessage = java.lang.String
  
  type FilterExpression = java.lang.String
  
  type GlueDatabaseName = java.lang.String
  
  type GlueTableName = java.lang.String
  
  type Image = java.lang.String
  
  type IncludeStatisticsFlag = scala.Boolean
  
  type IotEventsInputName = java.lang.String
  
  type LambdaName = java.lang.String
  
  type LateDataRuleName = java.lang.String
  
  type LateDataRules = js.Array[typings.awsSdk.iotanalyticsMod.LateDataRule]
  
  type LogResult = java.lang.String
  
  type LoggingEnabled = scala.Boolean
  
  type LoggingLevel = typings.awsSdk.awsSdkStrings.ERROR | java.lang.String
  
  type MathExpression = java.lang.String
  
  type MaxMessages = scala.Double
  
  type MaxResults = scala.Double
  
  type MaxVersions = scala.Double
  
  type MessageId = java.lang.String
  
  type MessagePayload = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.iotanalyticsMod.Blob | java.lang.String
  
  type MessagePayloads = js.Array[typings.awsSdk.iotanalyticsMod.MessagePayload]
  
  type Messages = js.Array[typings.awsSdk.iotanalyticsMod.Message]
  
  type NextToken = java.lang.String
  
  type OffsetSeconds = scala.Double
  
  type OutputFileName = java.lang.String
  
  type PipelineActivities = js.Array[typings.awsSdk.iotanalyticsMod.PipelineActivity]
  
  type PipelineArn = java.lang.String
  
  type PipelineName = java.lang.String
  
  type PipelineSummaries = js.Array[typings.awsSdk.iotanalyticsMod.PipelineSummary]
  
  type PresignedURI = java.lang.String
  
  type QueryFilters = js.Array[typings.awsSdk.iotanalyticsMod.QueryFilter]
  
  type Reason = java.lang.String
  
  type ReprocessingId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.CANCELLED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ReprocessingStatus = typings.awsSdk.iotanalyticsMod._ReprocessingStatus | java.lang.String
  
  type ReprocessingSummaries = js.Array[typings.awsSdk.iotanalyticsMod.ReprocessingSummary]
  
  type ResourceArn = java.lang.String
  
  type RetentionPeriodInDays = scala.Double
  
  type RoleArn = java.lang.String
  
  type S3KeyPrefix = java.lang.String
  
  type ScheduleExpression = java.lang.String
  
  type SessionTimeoutInMinutes = scala.Double
  
  type SizeInBytes = scala.Double
  
  type SqlQuery = java.lang.String
  
  type StartTime = typings.std.Date
  
  type StringValue = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.iotanalyticsMod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.iotanalyticsMod.Tag]
  
  type TagValue = java.lang.String
  
  type TimeExpression = java.lang.String
  
  type Timestamp = typings.std.Date
  
  type UnlimitedRetentionPeriod = scala.Boolean
  
  type UnlimitedVersioning = scala.Boolean
  
  type VariableName = java.lang.String
  
  type Variables = js.Array[typings.awsSdk.iotanalyticsMod.Variable]
  
  type VolumeSizeInGB = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-11-27`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.iotanalyticsMod._apiVersion | java.lang.String
}
