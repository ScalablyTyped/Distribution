package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.NoEncryption
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AWSKMSKeyARN = String

type AmazonopensearchserviceBufferingIntervalInSeconds = Double

type AmazonopensearchserviceBufferingSizeInMBs = Double

type AmazonopensearchserviceClusterEndpoint = String

type AmazonopensearchserviceDomainARN = String

type AmazonopensearchserviceIndexName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NoRotation
  - typings.awsSdk.awsSdkStrings.OneHour
  - typings.awsSdk.awsSdkStrings.OneDay
  - typings.awsSdk.awsSdkStrings.OneWeek
  - typings.awsSdk.awsSdkStrings.OneMonth
  - java.lang.String
*/
type AmazonopensearchserviceIndexRotationPeriod = _AmazonopensearchserviceIndexRotationPeriod | String

type AmazonopensearchserviceRetryDurationInSeconds = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FailedDocumentsOnly
  - typings.awsSdk.awsSdkStrings.AllDocuments
  - java.lang.String
*/
type AmazonopensearchserviceS3BackupMode = _AmazonopensearchserviceS3BackupMode | String

type AmazonopensearchserviceTypeName = String

type BlockSizeBytes = Double

type BooleanObject = Boolean

type BucketARN = String

type ClusterJDBCURL = String

type ColumnToJsonKeyMappings = StringDictionary[NonEmptyString]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNCOMPRESSED
  - typings.awsSdk.awsSdkStrings.GZIP
  - typings.awsSdk.awsSdkStrings.ZIP
  - typings.awsSdk.awsSdkStrings.Snappy_
  - typings.awsSdk.awsSdkStrings.HADOOP_SNAPPY
  - java.lang.String
*/
type CompressionFormat = _CompressionFormat | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.GZIP
  - java.lang.String
*/
type ContentEncoding = _ContentEncoding | String

type CopyOptions = String

type Data = Buffer | js.typedarray.Uint8Array | Blob | String

type DataTableColumns = String

type DataTableName = String

type DeliveryStartTimestamp = js.Date

type DeliveryStreamARN = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.ENABLING
  - typings.awsSdk.awsSdkStrings.ENABLING_FAILED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.DISABLING
  - typings.awsSdk.awsSdkStrings.DISABLING_FAILED
  - java.lang.String
*/
type DeliveryStreamEncryptionStatus = _DeliveryStreamEncryptionStatus | String

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
type DeliveryStreamFailureType = _DeliveryStreamFailureType | String

type DeliveryStreamName = String

type DeliveryStreamNameList = js.Array[DeliveryStreamName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.CREATING_FAILED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETING_FAILED
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - java.lang.String
*/
type DeliveryStreamStatus = _DeliveryStreamStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DirectPut
  - typings.awsSdk.awsSdkStrings.KinesisStreamAsSource
  - java.lang.String
*/
type DeliveryStreamType = _DeliveryStreamType | String

type DeliveryStreamVersionId = String

type DescribeDeliveryStreamInputLimit = Double

type DestinationDescriptionList = js.Array[DestinationDescription]

type DestinationId = String

type ElasticsearchBufferingIntervalInSeconds = Double

type ElasticsearchBufferingSizeInMBs = Double

type ElasticsearchClusterEndpoint = String

type ElasticsearchDomainARN = String

type ElasticsearchIndexName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NoRotation
  - typings.awsSdk.awsSdkStrings.OneHour
  - typings.awsSdk.awsSdkStrings.OneDay
  - typings.awsSdk.awsSdkStrings.OneWeek
  - typings.awsSdk.awsSdkStrings.OneMonth
  - java.lang.String
*/
type ElasticsearchIndexRotationPeriod = _ElasticsearchIndexRotationPeriod | String

type ElasticsearchRetryDurationInSeconds = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FailedDocumentsOnly
  - typings.awsSdk.awsSdkStrings.AllDocuments
  - java.lang.String
*/
type ElasticsearchS3BackupMode = _ElasticsearchS3BackupMode | String

type ElasticsearchTypeName = String

type ErrorCode = String

type ErrorMessage = String

type ErrorOutputPrefix = String

type HECAcknowledgmentTimeoutInSeconds = Double

type HECEndpoint = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Raw_
  - typings.awsSdk.awsSdkStrings.Event_
  - java.lang.String
*/
type HECEndpointType = _HECEndpointType | String

type HECToken = String

type HttpEndpointAccessKey = String

type HttpEndpointAttributeName = String

type HttpEndpointAttributeValue = String

type HttpEndpointBufferingIntervalInSeconds = Double

type HttpEndpointBufferingSizeInMBs = Double

type HttpEndpointCommonAttributesList = js.Array[HttpEndpointCommonAttribute]

type HttpEndpointName = String

type HttpEndpointRetryDurationInSeconds = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FailedDataOnly
  - typings.awsSdk.awsSdkStrings.AllData
  - java.lang.String
*/
type HttpEndpointS3BackupMode = _HttpEndpointS3BackupMode | String

type HttpEndpointUrl = String

type IntervalInSeconds = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS_OWNED_CMK
  - typings.awsSdk.awsSdkStrings.CUSTOMER_MANAGED_CMK
  - java.lang.String
*/
type KeyType = _KeyType | String

type KinesisStreamARN = String

type ListDeliveryStreamsInputLimit = Double

type ListOfNonEmptyStrings = js.Array[NonEmptyString]

type ListOfNonEmptyStringsWithoutWhitespace = js.Array[NonEmptyStringWithoutWhitespace]

type ListTagsForDeliveryStreamInputLimit = Double

type ListTagsForDeliveryStreamOutputTagList = js.Array[Tag]

type LogGroupName = String

type LogStreamName = String

type NoEncryptionConfig = NoEncryption | String

type NonEmptyString = String

type NonEmptyStringWithoutWhitespace = String

type NonNegativeIntegerObject = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.ZLIB
  - typings.awsSdk.awsSdkStrings.SNAPPY
  - java.lang.String
*/
type OrcCompression = _OrcCompression | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.V0_11
  - typings.awsSdk.awsSdkStrings.V0_12
  - java.lang.String
*/
type OrcFormatVersion = _OrcFormatVersion | String

type OrcRowIndexStride = Double

type OrcStripeSizeBytes = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNCOMPRESSED
  - typings.awsSdk.awsSdkStrings.GZIP
  - typings.awsSdk.awsSdkStrings.SNAPPY
  - java.lang.String
*/
type ParquetCompression = _ParquetCompression | String

type ParquetPageSizeBytes = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.V1
  - typings.awsSdk.awsSdkStrings.V2
  - java.lang.String
*/
type ParquetWriterVersion = _ParquetWriterVersion | String

type Password = String

type Prefix = String

type ProcessorList = js.Array[Processor]

type ProcessorParameterList = js.Array[ProcessorParameter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LambdaArn
  - typings.awsSdk.awsSdkStrings.NumberOfRetries
  - typings.awsSdk.awsSdkStrings.MetadataExtractionQuery
  - typings.awsSdk.awsSdkStrings.JsonParsingEngine
  - typings.awsSdk.awsSdkStrings.RoleArn
  - typings.awsSdk.awsSdkStrings.BufferSizeInMBs
  - typings.awsSdk.awsSdkStrings.BufferIntervalInSeconds
  - typings.awsSdk.awsSdkStrings.SubRecordType
  - typings.awsSdk.awsSdkStrings.Delimiter
  - java.lang.String
*/
type ProcessorParameterName = _ProcessorParameterName | String

type ProcessorParameterValue = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RecordDeAggregation
  - typings.awsSdk.awsSdkStrings.Lambda_
  - typings.awsSdk.awsSdkStrings.MetadataExtraction
  - typings.awsSdk.awsSdkStrings.AppendDelimiterToRecord
  - java.lang.String
*/
type ProcessorType = _ProcessorType | String

type Proportion = Double

type PutRecordBatchRequestEntryList = js.Array[Record]

type PutRecordBatchResponseEntryList = js.Array[PutRecordBatchResponseEntry]

type PutResponseRecordId = String

type RedshiftRetryDurationInSeconds = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Disabled_
  - typings.awsSdk.awsSdkStrings.Enabled_
  - java.lang.String
*/
type RedshiftS3BackupMode = _RedshiftS3BackupMode | String

type RetryDurationInSeconds = Double

type RoleARN = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Disabled_
  - typings.awsSdk.awsSdkStrings.Enabled_
  - java.lang.String
*/
type S3BackupMode = _S3BackupMode | String

type SecurityGroupIdList = js.Array[NonEmptyStringWithoutWhitespace]

type SizeInMBs = Double

type SplunkRetryDurationInSeconds = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FailedEventsOnly
  - typings.awsSdk.awsSdkStrings.AllEvents
  - java.lang.String
*/
type SplunkS3BackupMode = _SplunkS3BackupMode | String

type SubnetIdList = js.Array[NonEmptyStringWithoutWhitespace]

type TagDeliveryStreamInputTagList = js.Array[Tag]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagValue = String

type Timestamp = js.Date

type Username = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2015-08-04`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
