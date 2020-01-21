package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kinesisanalyticsv2Mod {
  type ApplicationDescription = java.lang.String
  type ApplicationName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SKIP_RESTORE_FROM_SNAPSHOT
    - typings.awsSdk.awsSdkStrings.RESTORE_FROM_LATEST_SNAPSHOT
    - typings.awsSdk.awsSdkStrings.RESTORE_FROM_CUSTOM_SNAPSHOT
    - java.lang.String
  */
  type ApplicationRestoreType = typings.awsSdk.kinesisanalyticsv2Mod._ApplicationRestoreType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.STARTING
    - typings.awsSdk.awsSdkStrings.STOPPING
    - typings.awsSdk.awsSdkStrings.READY
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type ApplicationStatus = typings.awsSdk.kinesisanalyticsv2Mod._ApplicationStatus | java.lang.String
  type ApplicationSummaries = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationSummary]
  type ApplicationVersionId = scala.Double
  type BooleanObject = scala.Boolean
  type BucketARN = java.lang.String
  type CheckpointInterval = scala.Double
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.kinesisanalyticsv2Mod.ClientApiVersions
  type CloudWatchLoggingOptionDescriptions = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOptionDescription]
  type CloudWatchLoggingOptionUpdates = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOptionUpdate]
  type CloudWatchLoggingOptions = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOption]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PLAINTEXT
    - typings.awsSdk.awsSdkStrings.ZIPFILE
    - java.lang.String
  */
  type CodeContentType = typings.awsSdk.kinesisanalyticsv2Mod._CodeContentType | java.lang.String
  type CodeMD5 = java.lang.String
  type CodeSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DEFAULT
    - typings.awsSdk.awsSdkStrings.CUSTOM
    - java.lang.String
  */
  type ConfigurationType = typings.awsSdk.kinesisanalyticsv2Mod._ConfigurationType | java.lang.String
  type FileKey = java.lang.String
  type Id = java.lang.String
  type InAppStreamName = java.lang.String
  type InAppStreamNames = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.InAppStreamName]
  type InAppTableName = java.lang.String
  type InputDescriptions = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.InputDescription]
  type InputParallelismCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NOW
    - typings.awsSdk.awsSdkStrings.TRIM_HORIZON
    - typings.awsSdk.awsSdkStrings.LAST_STOPPED_POINT
    - java.lang.String
  */
  type InputStartingPosition = typings.awsSdk.kinesisanalyticsv2Mod._InputStartingPosition | java.lang.String
  type InputUpdates = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.InputUpdate]
  type Inputs = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.Input]
  type JobPlanDescription = java.lang.String
  type KinesisAnalyticsARN = java.lang.String
  type ListApplicationsInputLimit = scala.Double
  type ListSnapshotsInputLimit = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INFO
    - typings.awsSdk.awsSdkStrings.WARN
    - typings.awsSdk.awsSdkStrings.ERROR
    - typings.awsSdk.awsSdkStrings.DEBUG
    - java.lang.String
  */
  type LogLevel = typings.awsSdk.kinesisanalyticsv2Mod._LogLevel | java.lang.String
  type LogStreamARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.APPLICATION
    - typings.awsSdk.awsSdkStrings.TASK
    - typings.awsSdk.awsSdkStrings.OPERATOR
    - typings.awsSdk.awsSdkStrings.PARALLELISM
    - java.lang.String
  */
  type MetricsLevel = typings.awsSdk.kinesisanalyticsv2Mod._MetricsLevel | java.lang.String
  type MinPauseBetweenCheckpoints = scala.Double
  type NextToken = java.lang.String
  type ObjectVersion = java.lang.String
  type OutputDescriptions = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.OutputDescription]
  type OutputUpdates = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.OutputUpdate]
  type Outputs = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.Output]
  type Parallelism = scala.Double
  type ParallelismPerKPU = scala.Double
  type ParsedInputRecord = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.ParsedInputRecordField]
  type ParsedInputRecordField = java.lang.String
  type ParsedInputRecords = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.ParsedInputRecord]
  type ProcessedInputRecord = java.lang.String
  type ProcessedInputRecords = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.ProcessedInputRecord]
  type PropertyGroups = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.PropertyGroup]
  type PropertyKey = java.lang.String
  type PropertyMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.kinesisanalyticsv2Mod.PropertyValue]
  type PropertyValue = java.lang.String
  type RawInputRecord = java.lang.String
  type RawInputRecords = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.RawInputRecord]
  type RecordColumnDelimiter = java.lang.String
  type RecordColumnMapping = java.lang.String
  type RecordColumnName = java.lang.String
  type RecordColumnSqlType = java.lang.String
  type RecordColumns = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.RecordColumn]
  type RecordEncoding = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.JSON
    - typings.awsSdk.awsSdkStrings.CSV
    - java.lang.String
  */
  type RecordFormatType = typings.awsSdk.kinesisanalyticsv2Mod._RecordFormatType | java.lang.String
  type RecordRowDelimiter = java.lang.String
  type RecordRowPath = java.lang.String
  type ReferenceDataSourceDescriptions = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSourceDescription]
  type ReferenceDataSourceUpdates = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSourceUpdate]
  type ReferenceDataSources = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSource]
  type ResourceARN = java.lang.String
  type RoleARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`SQL-1_0`
    - typings.awsSdk.awsSdkStrings.`FLINK-1_6`
    - typings.awsSdk.awsSdkStrings.`FLINK-1_8`
    - java.lang.String
  */
  type RuntimeEnvironment = typings.awsSdk.kinesisanalyticsv2Mod._RuntimeEnvironment | java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.SecurityGroupId]
  type SnapshotName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.READY
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type SnapshotStatus = typings.awsSdk.kinesisanalyticsv2Mod._SnapshotStatus | java.lang.String
  type SnapshotSummaries = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.SnapshotDetails]
  type SqlRunConfigurations = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.SqlRunConfiguration]
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.SubnetId]
  type TagKey = java.lang.String
  type TagKeys = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.Tag]
  type TextContent = java.lang.String
  type Timestamp = typings.std.Date
  type VpcConfigurationDescriptions = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.VpcConfigurationDescription]
  type VpcConfigurationUpdates = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.VpcConfigurationUpdate]
  type VpcConfigurations = js.Array[typings.awsSdk.kinesisanalyticsv2Mod.VpcConfiguration]
  type VpcId = java.lang.String
  type ZipFileContent = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.kinesisanalyticsv2Mod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-05-23`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.kinesisanalyticsv2Mod._apiVersion | java.lang.String
}
