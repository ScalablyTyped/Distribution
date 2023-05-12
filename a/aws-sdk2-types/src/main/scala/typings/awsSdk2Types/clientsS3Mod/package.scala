package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk2Types.anon.Cont
import typings.awsSdk2Types.awsSdk2TypesStrings.CSV
import typings.awsSdk2Types.awsSdk2TypesStrings.ENABLED
import typings.awsSdk2Types.awsSdk2TypesStrings.Enabled_
import typings.awsSdk2Types.awsSdk2TypesStrings.SELECT
import typings.awsSdk2Types.awsSdk2TypesStrings.SQL
import typings.awsSdk2Types.awsSdk2TypesStrings.STANDARD
import typings.awsSdk2Types.awsSdk2TypesStrings.V_1
import typings.awsSdk2Types.awsSdk2TypesStrings.requester_
import typings.awsSdk2Types.awsSdk2TypesStrings.url
import typings.awsSdk2Types.libEventStreamEventStreamMod.EventStream
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AbortDate = js.Date

type AbortRuleId = String

type AcceptRanges = String

type AccessPointArn = String

type AccountId = String

type AllowQuotedRecordDelimiter = Boolean

type AllowedHeader = String

type AllowedHeaders = js.Array[AllowedHeader]

type AllowedMethod = String

type AllowedMethods = js.Array[AllowedMethod]

type AllowedOrigin = String

type AllowedOrigins = js.Array[AllowedOrigin]

type AnalyticsConfigurationList = js.Array[AnalyticsConfiguration]

type AnalyticsId = String

type AnalyticsS3ExportFileFormat = CSV | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ARCHIVE_ACCESS
  - typings.awsSdk2Types.awsSdk2TypesStrings.DEEP_ARCHIVE_ACCESS
  - java.lang.String
*/
type ArchiveStatus = _ArchiveStatus | String

type Body = Buffer | js.typedarray.Uint8Array | Blob | String | Readable

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Enabled_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Suspended
  - java.lang.String
*/
type BucketAccelerateStatus = _BucketAccelerateStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.`private`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`public-read`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`public-read-write`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`authenticated-read`
  - java.lang.String
*/
type BucketCannedACL = _BucketCannedACL | String

type BucketKeyEnabled = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.`af-south-1`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`ap-east-1`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`ap-northeast-1`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`ap-northeast-2`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`ap-northeast-3`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`ap-south-1`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`ap-southeast-1`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`ap-southeast-2`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`ap-southeast-3`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`ca-central-1`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`cn-north-1`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`cn-northwest-1`
  - typings.awsSdk2Types.awsSdk2TypesStrings.EU
  - typings.awsSdk2Types.awsSdk2TypesStrings.`eu-central-1`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`eu-north-1`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`eu-south-1`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`eu-west-1`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`eu-west-2`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`eu-west-3`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`me-south-1`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`sa-east-1`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`us-east-2`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`us-gov-east-1`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`us-gov-west-1`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`us-west-1`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`us-west-2`
  - java.lang.String
*/
type BucketLocationConstraint = _BucketLocationConstraint | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.FULL_CONTROL
  - typings.awsSdk2Types.awsSdk2TypesStrings.READ
  - typings.awsSdk2Types.awsSdk2TypesStrings.WRITE
  - java.lang.String
*/
type BucketLogsPermission = _BucketLogsPermission | String

type BucketName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Enabled_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Suspended
  - java.lang.String
*/
type BucketVersioningStatus = _BucketVersioningStatus | String

type Buckets = js.Array[Bucket]

type BypassGovernanceRetention = Boolean

type BytesProcessed = Double

type BytesReturned = Double

type BytesScanned = Double

type CORSRules = js.Array[CORSRule]

type CacheControl = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.CRC32
  - typings.awsSdk2Types.awsSdk2TypesStrings.CRC32C
  - typings.awsSdk2Types.awsSdk2TypesStrings.SHA1
  - typings.awsSdk2Types.awsSdk2TypesStrings.SHA256
  - java.lang.String
*/
type ChecksumAlgorithm = _ChecksumAlgorithm | String

type ChecksumAlgorithmList = js.Array[ChecksumAlgorithm]

type ChecksumCRC32 = String

type ChecksumCRC32C = String

type ChecksumMode = ENABLED | String

type ChecksumSHA1 = String

type ChecksumSHA256 = String

type CloudFunction = String

type CloudFunctionInvocationRole = String

type Code = String

type Comments = String

type CommonPrefixList = js.Array[CommonPrefix]

type CompletedPartList = js.Array[CompletedPart]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.NONE
  - typings.awsSdk2Types.awsSdk2TypesStrings.GZIP
  - typings.awsSdk2Types.awsSdk2TypesStrings.BZIP2
  - java.lang.String
*/
type CompressionType = _CompressionType | String

type ConfirmRemoveSelfBucketAccess = Boolean

type ContentDisposition = String

type ContentEncoding = String

type ContentLanguage = String

type ContentLength = Double

type ContentMD5 = String

type ContentRange = String

type ContentType = String

type CopySource = String

type CopySourceIfMatch = String

type CopySourceIfModifiedSince = js.Date

type CopySourceIfNoneMatch = String

type CopySourceIfUnmodifiedSince = js.Date

type CopySourceRange = String

type CopySourceSSECustomerAlgorithm = String

type CopySourceSSECustomerKey = Buffer | js.typedarray.Uint8Array | Blob | String

type CopySourceSSECustomerKeyMD5 = String

type CopySourceVersionId = String

type CreationDate = js.Date

type Date = js.Date

type Days = Double

type DaysAfterInitiation = Double

type DeleteMarker = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Enabled_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Disabled_
  - java.lang.String
*/
type DeleteMarkerReplicationStatus = _DeleteMarkerReplicationStatus | String

type DeleteMarkerVersionId = String

type DeleteMarkers = js.Array[DeleteMarkerEntry]

type DeletedObjects = js.Array[DeletedObject]

type Delimiter = String

type Description = String

type DisplayName = String

type ETag = String

type EmailAddress = String

type EnableRequestProgress = Boolean

type EncodingType = url | String

type End = Double

type ErrorCode = String

type ErrorMessage = String

type Errors = js.Array[Error]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonReducedRedundancyLostObject
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonObjectCreatedColonAsterisk
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonObjectCreatedColonPut
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonObjectCreatedColonPost
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonObjectCreatedColonCopy
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonObjectCreatedColonCompleteMultipartUpload
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonObjectRemovedColonAsterisk
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonObjectRemovedColonDelete
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonObjectRemovedColonDeleteMarkerCreated
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonObjectRestoreColonAsterisk
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonObjectRestoreColonPost
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonObjectRestoreColonCompleted
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonReplicationColonAsterisk
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonReplicationColonOperationFailedReplication
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonReplicationColonOperationNotTracked
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonReplicationColonOperationMissedThreshold
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonReplicationColonOperationReplicatedAfterThreshold
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonObjectRestoreColonDelete
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonLifecycleTransition
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonIntelligentTiering
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonObjectAclColonPut
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonLifecycleExpirationColonAsterisk
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonLifecycleExpirationColonDelete
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonLifecycleExpirationColonDeleteMarkerCreated
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonObjectTaggingColonAsterisk
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonObjectTaggingColonPut
  - typings.awsSdk2Types.awsSdk2TypesStrings.s3ColonObjectTaggingColonDelete
  - java.lang.String
*/
type Event = _Event | String

type EventList = js.Array[Event]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Enabled_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Disabled_
  - java.lang.String
*/
type ExistingObjectReplicationStatus = _ExistingObjectReplicationStatus | String

type Expiration = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Enabled_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Disabled_
  - java.lang.String
*/
type ExpirationStatus = _ExpirationStatus | String

type ExpiredObjectDeleteMarker = Boolean

type Expires = js.Date

type ExposeHeader = String

type ExposeHeaders = js.Array[ExposeHeader]

type Expression = String

type ExpressionType = SQL | String

type FetchOwner = Boolean

type FieldDelimiter = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.USE
  - typings.awsSdk2Types.awsSdk2TypesStrings.IGNORE
  - typings.awsSdk2Types.awsSdk2TypesStrings.NONE
  - java.lang.String
*/
type FileHeaderInfo = _FileHeaderInfo | String

type FilterRuleList = js.Array[FilterRule]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.prefix
  - typings.awsSdk2Types.awsSdk2TypesStrings.suffix
  - java.lang.String
*/
type FilterRuleName = _FilterRuleName | String

type FilterRuleValue = String

type GetObjectResponseStatusCode = Double

type GrantFullControl = String

type GrantRead = String

type GrantReadACP = String

type GrantWrite = String

type GrantWriteACP = String

type Grants = js.Array[Grant]

type HostName = String

type HttpErrorCodeReturnedEquals = String

type HttpRedirectCode = String

type ID = String

type IfMatch = String

type IfModifiedSince = js.Date

type IfNoneMatch = String

type IfUnmodifiedSince = js.Date

type Initiated = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ARCHIVE_ACCESS
  - typings.awsSdk2Types.awsSdk2TypesStrings.DEEP_ARCHIVE_ACCESS
  - java.lang.String
*/
type IntelligentTieringAccessTier = _IntelligentTieringAccessTier | String

type IntelligentTieringConfigurationList = js.Array[IntelligentTieringConfiguration]

type IntelligentTieringDays = Double

type IntelligentTieringId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Enabled_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Disabled_
  - java.lang.String
*/
type IntelligentTieringStatus = _IntelligentTieringStatus | String

type InventoryConfigurationList = js.Array[InventoryConfiguration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.CSV
  - typings.awsSdk2Types.awsSdk2TypesStrings.ORC
  - typings.awsSdk2Types.awsSdk2TypesStrings.Parquet
  - java.lang.String
*/
type InventoryFormat = _InventoryFormat | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Daily
  - typings.awsSdk2Types.awsSdk2TypesStrings.Weekly
  - java.lang.String
*/
type InventoryFrequency = _InventoryFrequency | String

type InventoryId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.All_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Current
  - java.lang.String
*/
type InventoryIncludedObjectVersions = _InventoryIncludedObjectVersions | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Size_
  - typings.awsSdk2Types.awsSdk2TypesStrings.LastModifiedDate
  - typings.awsSdk2Types.awsSdk2TypesStrings.StorageClass
  - typings.awsSdk2Types.awsSdk2TypesStrings.ETag
  - typings.awsSdk2Types.awsSdk2TypesStrings.IsMultipartUploaded
  - typings.awsSdk2Types.awsSdk2TypesStrings.ReplicationStatus
  - typings.awsSdk2Types.awsSdk2TypesStrings.EncryptionStatus
  - typings.awsSdk2Types.awsSdk2TypesStrings.ObjectLockRetainUntilDate
  - typings.awsSdk2Types.awsSdk2TypesStrings.ObjectLockMode
  - typings.awsSdk2Types.awsSdk2TypesStrings.ObjectLockLegalHoldStatus
  - typings.awsSdk2Types.awsSdk2TypesStrings.IntelligentTieringAccessTier
  - typings.awsSdk2Types.awsSdk2TypesStrings.BucketKeyStatus
  - typings.awsSdk2Types.awsSdk2TypesStrings.ChecksumAlgorithm
  - java.lang.String
*/
type InventoryOptionalField = _InventoryOptionalField | String

type InventoryOptionalFields = js.Array[InventoryOptionalField]

type IsEnabled = Boolean

type IsLatest = Boolean

type IsPublic = Boolean

type IsTruncated = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.DOCUMENT
  - typings.awsSdk2Types.awsSdk2TypesStrings.LINES
  - java.lang.String
*/
type JSONType = _JSONType | String

type KMSContext = String

type KeyCount = Double

type KeyMarker = String

type KeyPrefixEquals = String

type LambdaFunctionArn = String

type LambdaFunctionConfigurationList = js.Array[LambdaFunctionConfiguration]

type LastModified = js.Date

type LifecycleRules = js.Array[LifecycleRule]

type Location = String

type LocationPrefix = String

type MFA = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Enabled_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Disabled_
  - java.lang.String
*/
type MFADelete = _MFADelete | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Enabled_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Disabled_
  - java.lang.String
*/
type MFADeleteStatus = _MFADeleteStatus | String

type Marker = String

type MaxAgeSeconds = Double

type MaxKeys = Double

type MaxParts = Double

type MaxUploads = Double

type Message = String

type Metadata = StringDictionary[MetadataValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.COPY
  - typings.awsSdk2Types.awsSdk2TypesStrings.REPLACE
  - java.lang.String
*/
type MetadataDirective = _MetadataDirective | String

type MetadataKey = String

type MetadataValue = String

type MetricsConfigurationList = js.Array[MetricsConfiguration]

type MetricsId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Enabled_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Disabled_
  - java.lang.String
*/
type MetricsStatus = _MetricsStatus | String

type Minutes = Double

type MissingMeta = Double

type MultipartUploadId = String

type MultipartUploadList = js.Array[MultipartUpload]

type NextKeyMarker = String

type NextMarker = String

type NextPartNumberMarker = Double

type NextToken = String

type NextUploadIdMarker = String

type NextVersionIdMarker = String

type NoncurrentVersionTransitionList = js.Array[NoncurrentVersionTransition]

type NotificationId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ETag
  - typings.awsSdk2Types.awsSdk2TypesStrings.Checksum
  - typings.awsSdk2Types.awsSdk2TypesStrings.ObjectParts
  - typings.awsSdk2Types.awsSdk2TypesStrings.StorageClass
  - typings.awsSdk2Types.awsSdk2TypesStrings.ObjectSize
  - java.lang.String
*/
type ObjectAttributes = _ObjectAttributes | String

type ObjectAttributesList = js.Array[ObjectAttributes]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.`private`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`public-read`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`public-read-write`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`authenticated-read`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`aws-exec-read`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`bucket-owner-read`
  - typings.awsSdk2Types.awsSdk2TypesStrings.`bucket-owner-full-control`
  - java.lang.String
*/
type ObjectCannedACL = _ObjectCannedACL | String

type ObjectIdentifierList = js.Array[ObjectIdentifier]

type ObjectKey = String

type ObjectList = js.Array[Object]

type ObjectLockEnabled = Enabled_ | String

type ObjectLockEnabledForBucket = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ON
  - typings.awsSdk2Types.awsSdk2TypesStrings.OFF
  - java.lang.String
*/
type ObjectLockLegalHoldStatus = _ObjectLockLegalHoldStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.GOVERNANCE
  - typings.awsSdk2Types.awsSdk2TypesStrings.COMPLIANCE
  - java.lang.String
*/
type ObjectLockMode = _ObjectLockMode | String

type ObjectLockRetainUntilDate = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.GOVERNANCE
  - typings.awsSdk2Types.awsSdk2TypesStrings.COMPLIANCE
  - java.lang.String
*/
type ObjectLockRetentionMode = _ObjectLockRetentionMode | String

type ObjectLockToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.BucketOwnerPreferred
  - typings.awsSdk2Types.awsSdk2TypesStrings.ObjectWriter
  - typings.awsSdk2Types.awsSdk2TypesStrings.BucketOwnerEnforced
  - java.lang.String
*/
type ObjectOwnership = _ObjectOwnership | String

type ObjectSize = Double

type ObjectSizeGreaterThanBytes = Double

type ObjectSizeLessThanBytes = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.STANDARD
  - typings.awsSdk2Types.awsSdk2TypesStrings.REDUCED_REDUNDANCY
  - typings.awsSdk2Types.awsSdk2TypesStrings.GLACIER
  - typings.awsSdk2Types.awsSdk2TypesStrings.STANDARD_IA
  - typings.awsSdk2Types.awsSdk2TypesStrings.ONEZONE_IA
  - typings.awsSdk2Types.awsSdk2TypesStrings.INTELLIGENT_TIERING
  - typings.awsSdk2Types.awsSdk2TypesStrings.DEEP_ARCHIVE
  - typings.awsSdk2Types.awsSdk2TypesStrings.OUTPOSTS
  - typings.awsSdk2Types.awsSdk2TypesStrings.GLACIER_IR
  - java.lang.String
*/
type ObjectStorageClass = _ObjectStorageClass | String

type ObjectVersionId = String

type ObjectVersionList = js.Array[ObjectVersion]

type ObjectVersionStorageClass = STANDARD | String

type OwnerOverride = typings.awsSdk2Types.awsSdk2TypesStrings.Destination | String

type OwnershipControlsRules = js.Array[OwnershipControlsRule]

type PartNumber = Double

type PartNumberMarker = Double

type Parts = js.Array[Part]

type PartsCount = Double

type PartsList = js.Array[ObjectPart]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Requester
  - typings.awsSdk2Types.awsSdk2TypesStrings.BucketOwner
  - java.lang.String
*/
type Payer = _Payer | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.FULL_CONTROL
  - typings.awsSdk2Types.awsSdk2TypesStrings.WRITE
  - typings.awsSdk2Types.awsSdk2TypesStrings.WRITE_ACP
  - typings.awsSdk2Types.awsSdk2TypesStrings.READ
  - typings.awsSdk2Types.awsSdk2TypesStrings.READ_ACP
  - java.lang.String
*/
type Permission = _Permission | String

type Policy = String

type Prefix = String

type Priority = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.http
  - typings.awsSdk2Types.awsSdk2TypesStrings.https
  - java.lang.String
*/
type Protocol = _Protocol | String

type QueueArn = String

type QueueConfigurationList = js.Array[QueueConfiguration]

type Quiet = Boolean

type QuoteCharacter = String

type QuoteEscapeCharacter = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ALWAYS
  - typings.awsSdk2Types.awsSdk2TypesStrings.ASNEEDED
  - java.lang.String
*/
type QuoteFields = _QuoteFields | String

type Range = String

type RecordDelimiter = String

type ReplaceKeyPrefixWith = String

type ReplaceKeyWith = String

type ReplicaKmsKeyID = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Enabled_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Disabled_
  - java.lang.String
*/
type ReplicaModificationsStatus = _ReplicaModificationsStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Enabled_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Disabled_
  - java.lang.String
*/
type ReplicationRuleStatus = _ReplicationRuleStatus | String

type ReplicationRules = js.Array[ReplicationRule]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.COMPLETE
  - typings.awsSdk2Types.awsSdk2TypesStrings.PENDING
  - typings.awsSdk2Types.awsSdk2TypesStrings.FAILED
  - typings.awsSdk2Types.awsSdk2TypesStrings.REPLICA
  - java.lang.String
*/
type ReplicationStatus = _ReplicationStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Enabled_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Disabled_
  - java.lang.String
*/
type ReplicationTimeStatus = _ReplicationTimeStatus | String

type RequestCharged = requester_ | String

type RequestPayer = requester_ | String

type RequestRoute = String

type RequestToken = String

type ResponseCacheControl = String

type ResponseContentDisposition = String

type ResponseContentEncoding = String

type ResponseContentLanguage = String

type ResponseContentType = String

type ResponseExpires = js.Date

type Restore = String

type RestoreOutputPath = String

type RestoreRequestType = SELECT | String

type Role = String

type RoutingRules = js.Array[RoutingRule]

type Rules = js.Array[Rule]

type SSECustomerAlgorithm = String

type SSECustomerKey = Buffer | js.typedarray.Uint8Array | Blob | String

type SSECustomerKeyMD5 = String

type SSEKMSEncryptionContext = String

type SSEKMSKeyId = String

type SelectObjectContentEventStream = EventStream[Cont]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.AES256
  - typings.awsSdk2Types.awsSdk2TypesStrings.awsColonkms
  - java.lang.String
*/
type ServerSideEncryption = _ServerSideEncryption | String

type ServerSideEncryptionRules = js.Array[ServerSideEncryptionRule]

type Setting = Boolean

type Size = Double

type SkipValidation = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Enabled_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Disabled_
  - java.lang.String
*/
type SseKmsEncryptedObjectsStatus = _SseKmsEncryptedObjectsStatus | String

type Start = Double

type StartAfter = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.STANDARD
  - typings.awsSdk2Types.awsSdk2TypesStrings.REDUCED_REDUNDANCY
  - typings.awsSdk2Types.awsSdk2TypesStrings.STANDARD_IA
  - typings.awsSdk2Types.awsSdk2TypesStrings.ONEZONE_IA
  - typings.awsSdk2Types.awsSdk2TypesStrings.INTELLIGENT_TIERING
  - typings.awsSdk2Types.awsSdk2TypesStrings.GLACIER
  - typings.awsSdk2Types.awsSdk2TypesStrings.DEEP_ARCHIVE
  - typings.awsSdk2Types.awsSdk2TypesStrings.OUTPOSTS
  - typings.awsSdk2Types.awsSdk2TypesStrings.GLACIER_IR
  - java.lang.String
*/
type StorageClass = _StorageClass | String

type StorageClassAnalysisSchemaVersion = V_1 | String

type Suffix = String

type TagCount = Double

type TagSet = js.Array[Tag]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.COPY
  - typings.awsSdk2Types.awsSdk2TypesStrings.REPLACE
  - java.lang.String
*/
type TaggingDirective = _TaggingDirective | String

type TaggingHeader = String

type TargetBucket = String

type TargetGrants = js.Array[TargetGrant]

type TargetPrefix = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Standard_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Bulk
  - typings.awsSdk2Types.awsSdk2TypesStrings.Expedited
  - java.lang.String
*/
type Tier = _Tier | String

type TieringList = js.Array[Tiering]

type Token = String

type TopicArn = String

type TopicConfigurationList = js.Array[TopicConfiguration]

type TransitionList = js.Array[Transition]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.GLACIER
  - typings.awsSdk2Types.awsSdk2TypesStrings.STANDARD_IA
  - typings.awsSdk2Types.awsSdk2TypesStrings.ONEZONE_IA
  - typings.awsSdk2Types.awsSdk2TypesStrings.INTELLIGENT_TIERING
  - typings.awsSdk2Types.awsSdk2TypesStrings.DEEP_ARCHIVE
  - typings.awsSdk2Types.awsSdk2TypesStrings.GLACIER_IR
  - java.lang.String
*/
type TransitionStorageClass = _TransitionStorageClass | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.CanonicalUser
  - typings.awsSdk2Types.awsSdk2TypesStrings.AmazonCustomerByEmail
  - typings.awsSdk2Types.awsSdk2TypesStrings.Group
  - java.lang.String
*/
type Type = _Type | String

type URI = String

type UploadIdMarker = String

type UserMetadata = js.Array[MetadataEntry]

type Value = String

type VersionCount = Double

type VersionIdMarker = String

type WebsiteRedirectLocation = String

type Years = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.`2006-03-01`
  - typings.awsSdk2Types.awsSdk2TypesStrings.latest
  - java.lang.String
*/
type apiVersion = _apiVersion | String
