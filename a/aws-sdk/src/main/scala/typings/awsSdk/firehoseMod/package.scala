package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AWSKMSKeyARN = java.lang.String

type BlockSizeBytes = scala.Double

type BooleanObject = scala.Boolean

type BucketARN = java.lang.String

type ClusterJDBCURL = java.lang.String

type ColumnToJsonKeyMappings = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.firehoseMod.NonEmptyString]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNCOMPRESSED
  - typings.awsSdk.awsSdkStrings.GZIP
  - typings.awsSdk.awsSdkStrings.ZIP
  - typings.awsSdk.awsSdkStrings.Snappy_
  - typings.awsSdk.awsSdkStrings.HADOOP_SNAPPY
  - java.lang.String
*/
type CompressionFormat = typings.awsSdk.firehoseMod._CompressionFormat | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.GZIP
  - java.lang.String
*/
type ContentEncoding = typings.awsSdk.firehoseMod._ContentEncoding | java.lang.String

type CopyOptions = java.lang.String

type Data = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.firehoseMod.Blob | java.lang.String

type DataTableColumns = java.lang.String

type DataTableName = java.lang.String

type DeliveryStartTimestamp = typings.std.Date

type DeliveryStreamARN = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.ENABLING
  - typings.awsSdk.awsSdkStrings.ENABLING_FAILED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.DISABLING
  - typings.awsSdk.awsSdkStrings.DISABLING_FAILED
  - java.lang.String
*/
type DeliveryStreamEncryptionStatus = typings.awsSdk.firehoseMod._DeliveryStreamEncryptionStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RETIRE_KMS_GRANT_FAILED
  - typings.awsSdk.awsSdkStrings.CREATE_KMS_GRANT_FAILED
  - typings.awsSdk.awsSdkStrings.KMS_ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.DISABLED_KMS_KEY
  - typings.awsSdk.awsSdkStrings.INVALID_KMS_KEY
  - typings.awsSdk.awsSdkStrings.KMS_KEY_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.KMS_OPT_IN_REQUIRED
  - typings.awsSdk.awsSdkStrings.CREATE_ENI_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_ENI_FAILED
  - typings.awsSdk.awsSdkStrings.SUBNET_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.SECURITY_GROUP_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.ENI_ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.SUBNET_ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.SECURITY_GROUP_ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.UNKNOWN_ERROR
  - java.lang.String
*/
type DeliveryStreamFailureType = typings.awsSdk.firehoseMod._DeliveryStreamFailureType | java.lang.String

type DeliveryStreamName = java.lang.String

type DeliveryStreamNameList = js.Array[typings.awsSdk.firehoseMod.DeliveryStreamName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.CREATING_FAILED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETING_FAILED
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - java.lang.String
*/
type DeliveryStreamStatus = typings.awsSdk.firehoseMod._DeliveryStreamStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DirectPut
  - typings.awsSdk.awsSdkStrings.KinesisStreamAsSource
  - java.lang.String
*/
type DeliveryStreamType = typings.awsSdk.firehoseMod._DeliveryStreamType | java.lang.String

type DeliveryStreamVersionId = java.lang.String

type DescribeDeliveryStreamInputLimit = scala.Double

type DestinationDescriptionList = js.Array[typings.awsSdk.firehoseMod.DestinationDescription]

type DestinationId = java.lang.String

type ElasticsearchBufferingIntervalInSeconds = scala.Double

type ElasticsearchBufferingSizeInMBs = scala.Double

type ElasticsearchClusterEndpoint = java.lang.String

type ElasticsearchDomainARN = java.lang.String

type ElasticsearchIndexName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NoRotation
  - typings.awsSdk.awsSdkStrings.OneHour
  - typings.awsSdk.awsSdkStrings.OneDay
  - typings.awsSdk.awsSdkStrings.OneWeek
  - typings.awsSdk.awsSdkStrings.OneMonth
  - java.lang.String
*/
type ElasticsearchIndexRotationPeriod = typings.awsSdk.firehoseMod._ElasticsearchIndexRotationPeriod | java.lang.String

type ElasticsearchRetryDurationInSeconds = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FailedDocumentsOnly
  - typings.awsSdk.awsSdkStrings.AllDocuments
  - java.lang.String
*/
type ElasticsearchS3BackupMode = typings.awsSdk.firehoseMod._ElasticsearchS3BackupMode | java.lang.String

type ElasticsearchTypeName = java.lang.String

type ErrorCode = java.lang.String

type ErrorMessage = java.lang.String

type ErrorOutputPrefix = java.lang.String

type HECAcknowledgmentTimeoutInSeconds = scala.Double

type HECEndpoint = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Raw_
  - typings.awsSdk.awsSdkStrings.Event_
  - java.lang.String
*/
type HECEndpointType = typings.awsSdk.firehoseMod._HECEndpointType | java.lang.String

type HECToken = java.lang.String

type HttpEndpointAccessKey = java.lang.String

type HttpEndpointAttributeName = java.lang.String

type HttpEndpointAttributeValue = java.lang.String

type HttpEndpointBufferingIntervalInSeconds = scala.Double

type HttpEndpointBufferingSizeInMBs = scala.Double

type HttpEndpointCommonAttributesList = js.Array[typings.awsSdk.firehoseMod.HttpEndpointCommonAttribute]

type HttpEndpointName = java.lang.String

type HttpEndpointRetryDurationInSeconds = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FailedDataOnly
  - typings.awsSdk.awsSdkStrings.AllData
  - java.lang.String
*/
type HttpEndpointS3BackupMode = typings.awsSdk.firehoseMod._HttpEndpointS3BackupMode | java.lang.String

type HttpEndpointUrl = java.lang.String

type IntervalInSeconds = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS_OWNED_CMK
  - typings.awsSdk.awsSdkStrings.CUSTOMER_MANAGED_CMK
  - java.lang.String
*/
type KeyType = typings.awsSdk.firehoseMod._KeyType | java.lang.String

type KinesisStreamARN = java.lang.String

type ListDeliveryStreamsInputLimit = scala.Double

type ListOfNonEmptyStrings = js.Array[typings.awsSdk.firehoseMod.NonEmptyString]

type ListOfNonEmptyStringsWithoutWhitespace = js.Array[typings.awsSdk.firehoseMod.NonEmptyStringWithoutWhitespace]

type ListTagsForDeliveryStreamInputLimit = scala.Double

type ListTagsForDeliveryStreamOutputTagList = js.Array[typings.awsSdk.firehoseMod.Tag]

type LogGroupName = java.lang.String

type LogStreamName = java.lang.String

type NoEncryptionConfig = typings.awsSdk.awsSdkStrings.NoEncryption | java.lang.String

type NonEmptyString = java.lang.String

type NonEmptyStringWithoutWhitespace = java.lang.String

type NonNegativeIntegerObject = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.ZLIB
  - typings.awsSdk.awsSdkStrings.SNAPPY
  - java.lang.String
*/
type OrcCompression = typings.awsSdk.firehoseMod._OrcCompression | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.V0_11
  - typings.awsSdk.awsSdkStrings.V0_12
  - java.lang.String
*/
type OrcFormatVersion = typings.awsSdk.firehoseMod._OrcFormatVersion | java.lang.String

type OrcRowIndexStride = scala.Double

type OrcStripeSizeBytes = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNCOMPRESSED
  - typings.awsSdk.awsSdkStrings.GZIP
  - typings.awsSdk.awsSdkStrings.SNAPPY
  - java.lang.String
*/
type ParquetCompression = typings.awsSdk.firehoseMod._ParquetCompression | java.lang.String

type ParquetPageSizeBytes = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.V1
  - typings.awsSdk.awsSdkStrings.V2
  - java.lang.String
*/
type ParquetWriterVersion = typings.awsSdk.firehoseMod._ParquetWriterVersion | java.lang.String

type Password = java.lang.String

type Prefix = java.lang.String

type ProcessorList = js.Array[typings.awsSdk.firehoseMod.Processor]

type ProcessorParameterList = js.Array[typings.awsSdk.firehoseMod.ProcessorParameter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LambdaArn
  - typings.awsSdk.awsSdkStrings.NumberOfRetries
  - typings.awsSdk.awsSdkStrings.RoleArn
  - typings.awsSdk.awsSdkStrings.BufferSizeInMBs
  - typings.awsSdk.awsSdkStrings.BufferIntervalInSeconds
  - java.lang.String
*/
type ProcessorParameterName = typings.awsSdk.firehoseMod._ProcessorParameterName | java.lang.String

type ProcessorParameterValue = java.lang.String

type ProcessorType = typings.awsSdk.awsSdkStrings.Lambda_ | java.lang.String

type Proportion = scala.Double

type PutRecordBatchRequestEntryList = js.Array[typings.awsSdk.firehoseMod.Record]

type PutRecordBatchResponseEntryList = js.Array[typings.awsSdk.firehoseMod.PutRecordBatchResponseEntry]

type PutResponseRecordId = java.lang.String

type RedshiftRetryDurationInSeconds = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Disabled_
  - typings.awsSdk.awsSdkStrings.Enabled_
  - java.lang.String
*/
type RedshiftS3BackupMode = typings.awsSdk.firehoseMod._RedshiftS3BackupMode | java.lang.String

type RoleARN = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Disabled_
  - typings.awsSdk.awsSdkStrings.Enabled_
  - java.lang.String
*/
type S3BackupMode = typings.awsSdk.firehoseMod._S3BackupMode | java.lang.String

type SecurityGroupIdList = js.Array[typings.awsSdk.firehoseMod.NonEmptyStringWithoutWhitespace]

type SizeInMBs = scala.Double

type SplunkRetryDurationInSeconds = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FailedEventsOnly
  - typings.awsSdk.awsSdkStrings.AllEvents
  - java.lang.String
*/
type SplunkS3BackupMode = typings.awsSdk.firehoseMod._SplunkS3BackupMode | java.lang.String

type SubnetIdList = js.Array[typings.awsSdk.firehoseMod.NonEmptyStringWithoutWhitespace]

type TagDeliveryStreamInputTagList = js.Array[typings.awsSdk.firehoseMod.Tag]

type TagKey = java.lang.String

type TagKeyList = js.Array[typings.awsSdk.firehoseMod.TagKey]

type TagValue = java.lang.String

type Timestamp = typings.std.Date

type Username = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2015-08-04`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.firehoseMod._apiVersion | java.lang.String
