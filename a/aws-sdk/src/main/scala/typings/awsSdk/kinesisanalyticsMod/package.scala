package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kinesisanalyticsMod {
  type ApplicationCode = java.lang.String
  type ApplicationDescription = java.lang.String
  type ApplicationName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.STARTING
    - typings.awsSdk.awsSdkStrings.STOPPING
    - typings.awsSdk.awsSdkStrings.READY
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type ApplicationStatus = typings.awsSdk.kinesisanalyticsMod._ApplicationStatus | java.lang.String
  type ApplicationSummaries = js.Array[typings.awsSdk.kinesisanalyticsMod.ApplicationSummary]
  type ApplicationVersionId = scala.Double
  type BooleanObject = scala.Boolean
  type BucketARN = java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.kinesisanalyticsMod.ClientApiVersions
  type CloudWatchLoggingOptionDescriptions = js.Array[typings.awsSdk.kinesisanalyticsMod.CloudWatchLoggingOptionDescription]
  type CloudWatchLoggingOptionUpdates = js.Array[typings.awsSdk.kinesisanalyticsMod.CloudWatchLoggingOptionUpdate]
  type CloudWatchLoggingOptions = js.Array[typings.awsSdk.kinesisanalyticsMod.CloudWatchLoggingOption]
  type FileKey = java.lang.String
  type Id = java.lang.String
  type InAppStreamName = java.lang.String
  type InAppStreamNames = js.Array[typings.awsSdk.kinesisanalyticsMod.InAppStreamName]
  type InAppTableName = java.lang.String
  type InputConfigurations = js.Array[typings.awsSdk.kinesisanalyticsMod.InputConfiguration]
  type InputDescriptions = js.Array[typings.awsSdk.kinesisanalyticsMod.InputDescription]
  type InputParallelismCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NOW
    - typings.awsSdk.awsSdkStrings.TRIM_HORIZON
    - typings.awsSdk.awsSdkStrings.LAST_STOPPED_POINT
    - java.lang.String
  */
  type InputStartingPosition = typings.awsSdk.kinesisanalyticsMod._InputStartingPosition | java.lang.String
  type InputUpdates = js.Array[typings.awsSdk.kinesisanalyticsMod.InputUpdate]
  type Inputs = js.Array[typings.awsSdk.kinesisanalyticsMod.Input]
  type KinesisAnalyticsARN = java.lang.String
  type ListApplicationsInputLimit = scala.Double
  type LogStreamARN = java.lang.String
  type OutputDescriptions = js.Array[typings.awsSdk.kinesisanalyticsMod.OutputDescription]
  type OutputUpdates = js.Array[typings.awsSdk.kinesisanalyticsMod.OutputUpdate]
  type Outputs = js.Array[typings.awsSdk.kinesisanalyticsMod.Output]
  type ParsedInputRecord = js.Array[typings.awsSdk.kinesisanalyticsMod.ParsedInputRecordField]
  type ParsedInputRecordField = java.lang.String
  type ParsedInputRecords = js.Array[typings.awsSdk.kinesisanalyticsMod.ParsedInputRecord]
  type ProcessedInputRecord = java.lang.String
  type ProcessedInputRecords = js.Array[typings.awsSdk.kinesisanalyticsMod.ProcessedInputRecord]
  type RawInputRecord = java.lang.String
  type RawInputRecords = js.Array[typings.awsSdk.kinesisanalyticsMod.RawInputRecord]
  type RecordColumnDelimiter = java.lang.String
  type RecordColumnMapping = java.lang.String
  type RecordColumnName = java.lang.String
  type RecordColumnSqlType = java.lang.String
  type RecordColumns = js.Array[typings.awsSdk.kinesisanalyticsMod.RecordColumn]
  type RecordEncoding = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.JSON
    - typings.awsSdk.awsSdkStrings.CSV
    - java.lang.String
  */
  type RecordFormatType = typings.awsSdk.kinesisanalyticsMod._RecordFormatType | java.lang.String
  type RecordRowDelimiter = java.lang.String
  type RecordRowPath = java.lang.String
  type ReferenceDataSourceDescriptions = js.Array[typings.awsSdk.kinesisanalyticsMod.ReferenceDataSourceDescription]
  type ReferenceDataSourceUpdates = js.Array[typings.awsSdk.kinesisanalyticsMod.ReferenceDataSourceUpdate]
  type ResourceARN = java.lang.String
  type RoleARN = java.lang.String
  type TagKey = java.lang.String
  type TagKeys = js.Array[typings.awsSdk.kinesisanalyticsMod.TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[typings.awsSdk.kinesisanalyticsMod.Tag]
  type Timestamp = typings.std.Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2015-08-14`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.kinesisanalyticsMod._apiVersion | java.lang.String
}
