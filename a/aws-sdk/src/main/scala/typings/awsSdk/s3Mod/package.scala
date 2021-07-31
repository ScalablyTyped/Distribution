package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AbortDate = typings.std.Date

type AbortRuleId = java.lang.String

type AcceptRanges = java.lang.String

type AccountId = java.lang.String

type AllowQuotedRecordDelimiter = scala.Boolean

type AllowedHeader = java.lang.String

type AllowedHeaders = js.Array[typings.awsSdk.s3Mod.AllowedHeader]

type AllowedMethod = java.lang.String

type AllowedMethods = js.Array[typings.awsSdk.s3Mod.AllowedMethod]

type AllowedOrigin = java.lang.String

type AllowedOrigins = js.Array[typings.awsSdk.s3Mod.AllowedOrigin]

type AnalyticsConfigurationList = js.Array[typings.awsSdk.s3Mod.AnalyticsConfiguration]

type AnalyticsId = java.lang.String

type AnalyticsS3ExportFileFormat = typings.awsSdk.awsSdkStrings.CSV | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ARCHIVE_ACCESS
  - typings.awsSdk.awsSdkStrings.DEEP_ARCHIVE_ACCESS
  - java.lang.String
*/
type ArchiveStatus = typings.awsSdk.s3Mod._ArchiveStatus | java.lang.String

type Body = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.s3Mod.Blob | java.lang.String | typings.node.streamMod.Readable

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Suspended_
  - java.lang.String
*/
type BucketAccelerateStatus = typings.awsSdk.s3Mod._BucketAccelerateStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.private__
  - typings.awsSdk.awsSdkStrings.`public-read`
  - typings.awsSdk.awsSdkStrings.`public-read-write`
  - typings.awsSdk.awsSdkStrings.`authenticated-read`
  - java.lang.String
*/
type BucketCannedACL = typings.awsSdk.s3Mod._BucketCannedACL | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`af-south-1`
  - typings.awsSdk.awsSdkStrings.`ap-east-1`
  - typings.awsSdk.awsSdkStrings.`ap-northeast-1`
  - typings.awsSdk.awsSdkStrings.`ap-northeast-2`
  - typings.awsSdk.awsSdkStrings.`ap-northeast-3`
  - typings.awsSdk.awsSdkStrings.`ap-south-1`
  - typings.awsSdk.awsSdkStrings.`ap-southeast-1`
  - typings.awsSdk.awsSdkStrings.`ap-southeast-2`
  - typings.awsSdk.awsSdkStrings.`ca-central-1`
  - typings.awsSdk.awsSdkStrings.`cn-north-1`
  - typings.awsSdk.awsSdkStrings.`cn-northwest-1`
  - typings.awsSdk.awsSdkStrings.EU
  - typings.awsSdk.awsSdkStrings.`eu-central-1`
  - typings.awsSdk.awsSdkStrings.`eu-north-1`
  - typings.awsSdk.awsSdkStrings.`eu-south-1`
  - typings.awsSdk.awsSdkStrings.`eu-west-1`
  - typings.awsSdk.awsSdkStrings.`eu-west-2`
  - typings.awsSdk.awsSdkStrings.`eu-west-3`
  - typings.awsSdk.awsSdkStrings.`me-south-1`
  - typings.awsSdk.awsSdkStrings.`sa-east-1`
  - typings.awsSdk.awsSdkStrings.`us-east-2`
  - typings.awsSdk.awsSdkStrings.`us-gov-east-1`
  - typings.awsSdk.awsSdkStrings.`us-gov-west-1`
  - typings.awsSdk.awsSdkStrings.`us-west-1`
  - typings.awsSdk.awsSdkStrings.`us-west-2`
  - java.lang.String
*/
type BucketLocationConstraint = typings.awsSdk.s3Mod._BucketLocationConstraint | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FULL_CONTROL
  - typings.awsSdk.awsSdkStrings.READ
  - typings.awsSdk.awsSdkStrings.WRITE
  - java.lang.String
*/
type BucketLogsPermission = typings.awsSdk.s3Mod._BucketLogsPermission | java.lang.String

type BucketName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Suspended_
  - java.lang.String
*/
type BucketVersioningStatus = typings.awsSdk.s3Mod._BucketVersioningStatus | java.lang.String

type Buckets = js.Array[typings.awsSdk.s3Mod.Bucket]

type BypassGovernanceRetention = scala.Boolean

type BytesProcessed = scala.Double

type BytesReturned = scala.Double

type BytesScanned = scala.Double

type CORSRules = js.Array[typings.awsSdk.s3Mod.CORSRule]

type CacheControl = java.lang.String

type CloudFunction = java.lang.String

type CloudFunctionInvocationRole = java.lang.String

type Code = java.lang.String

type Comments = java.lang.String

type CommonPrefixList = js.Array[typings.awsSdk.s3Mod.CommonPrefix]

type CompletedPartList = js.Array[typings.awsSdk.s3Mod.CompletedPart]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.GZIP
  - typings.awsSdk.awsSdkStrings.BZIP2
  - java.lang.String
*/
type CompressionType = typings.awsSdk.s3Mod._CompressionType | java.lang.String

type ConfirmRemoveSelfBucketAccess = scala.Boolean

type ContentDisposition = java.lang.String

type ContentEncoding = java.lang.String

type ContentLanguage = java.lang.String

type ContentLength = scala.Double

type ContentMD5 = java.lang.String

type ContentRange = java.lang.String

type ContentType = java.lang.String

type CopySource = java.lang.String

type CopySourceIfMatch = java.lang.String

type CopySourceIfModifiedSince = typings.std.Date

type CopySourceIfNoneMatch = java.lang.String

type CopySourceIfUnmodifiedSince = typings.std.Date

type CopySourceRange = java.lang.String

type CopySourceSSECustomerAlgorithm = java.lang.String

type CopySourceSSECustomerKey = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.s3Mod.Blob | java.lang.String

type CopySourceSSECustomerKeyMD5 = java.lang.String

type CopySourceVersionId = java.lang.String

type CreationDate = typings.std.Date

type Date = typings.std.Date

type Days = scala.Double

type DaysAfterInitiation = scala.Double

type DeleteMarker = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type DeleteMarkerReplicationStatus = typings.awsSdk.s3Mod._DeleteMarkerReplicationStatus | java.lang.String

type DeleteMarkerVersionId = java.lang.String

type DeleteMarkers = js.Array[typings.awsSdk.s3Mod.DeleteMarkerEntry]

type DeletedObjects = js.Array[typings.awsSdk.s3Mod.DeletedObject]

type Delimiter = java.lang.String

type Description = java.lang.String

type DisplayName = java.lang.String

type ETag = java.lang.String

type EmailAddress = java.lang.String

type EnableRequestProgress = scala.Boolean

type EncodingType = typings.awsSdk.awsSdkStrings.url_ | java.lang.String

type End = scala.Double

type Errors = js.Array[typings.awsSdk.s3Mod.Error]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.s3ColonReducedRedundancyLostObject
  - typings.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonAsterisk
  - typings.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonPut
  - typings.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonPost
  - typings.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonCopy
  - typings.awsSdk.awsSdkStrings.s3ColonObjectCreatedColonCompleteMultipartUpload
  - typings.awsSdk.awsSdkStrings.s3ColonObjectRemovedColonAsterisk
  - typings.awsSdk.awsSdkStrings.s3ColonObjectRemovedColonDelete
  - typings.awsSdk.awsSdkStrings.s3ColonObjectRemovedColonDeleteMarkerCreated
  - typings.awsSdk.awsSdkStrings.s3ColonObjectRestoreColonAsterisk
  - typings.awsSdk.awsSdkStrings.s3ColonObjectRestoreColonPost
  - typings.awsSdk.awsSdkStrings.s3ColonObjectRestoreColonCompleted
  - typings.awsSdk.awsSdkStrings.s3ColonReplicationColonAsterisk
  - typings.awsSdk.awsSdkStrings.s3ColonReplicationColonOperationFailedReplication
  - typings.awsSdk.awsSdkStrings.s3ColonReplicationColonOperationNotTracked
  - typings.awsSdk.awsSdkStrings.s3ColonReplicationColonOperationMissedThreshold
  - typings.awsSdk.awsSdkStrings.s3ColonReplicationColonOperationReplicatedAfterThreshold
  - java.lang.String
*/
type Event = typings.awsSdk.s3Mod._Event | java.lang.String

type EventList = js.Array[typings.awsSdk.s3Mod.Event]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ExistingObjectReplicationStatus = typings.awsSdk.s3Mod._ExistingObjectReplicationStatus | java.lang.String

type Expiration = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ExpirationStatus = typings.awsSdk.s3Mod._ExpirationStatus | java.lang.String

type ExpiredObjectDeleteMarker = scala.Boolean

type Expires = typings.std.Date

type ExposeHeader = java.lang.String

type ExposeHeaders = js.Array[typings.awsSdk.s3Mod.ExposeHeader]

type Expression = java.lang.String

type ExpressionType = typings.awsSdk.awsSdkStrings.SQL | java.lang.String

type FetchOwner = scala.Boolean

type FieldDelimiter = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USE
  - typings.awsSdk.awsSdkStrings.IGNORE
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type FileHeaderInfo = typings.awsSdk.s3Mod._FileHeaderInfo | java.lang.String

type FilterRuleList = js.Array[typings.awsSdk.s3Mod.FilterRule]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.prefix_
  - typings.awsSdk.awsSdkStrings.suffix
  - java.lang.String
*/
type FilterRuleName = typings.awsSdk.s3Mod._FilterRuleName | java.lang.String

type FilterRuleValue = java.lang.String

type GrantFullControl = java.lang.String

type GrantRead = java.lang.String

type GrantReadACP = java.lang.String

type GrantWrite = java.lang.String

type GrantWriteACP = java.lang.String

type Grants = js.Array[typings.awsSdk.s3Mod.Grant]

type HostName = java.lang.String

type HttpErrorCodeReturnedEquals = java.lang.String

type HttpRedirectCode = java.lang.String

type ID = java.lang.String

type IfMatch = java.lang.String

type IfModifiedSince = typings.std.Date

type IfNoneMatch = java.lang.String

type IfUnmodifiedSince = typings.std.Date

type Initiated = typings.std.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ARCHIVE_ACCESS
  - typings.awsSdk.awsSdkStrings.DEEP_ARCHIVE_ACCESS
  - java.lang.String
*/
type IntelligentTieringAccessTier = typings.awsSdk.s3Mod._IntelligentTieringAccessTier | java.lang.String

type IntelligentTieringConfigurationList = js.Array[typings.awsSdk.s3Mod.IntelligentTieringConfiguration]

type IntelligentTieringDays = scala.Double

type IntelligentTieringId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type IntelligentTieringStatus = typings.awsSdk.s3Mod._IntelligentTieringStatus | java.lang.String

type InventoryConfigurationList = js.Array[typings.awsSdk.s3Mod.InventoryConfiguration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CSV
  - typings.awsSdk.awsSdkStrings.ORC
  - typings.awsSdk.awsSdkStrings.Parquet_
  - java.lang.String
*/
type InventoryFormat = typings.awsSdk.s3Mod._InventoryFormat | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Daily_
  - typings.awsSdk.awsSdkStrings.Weekly_
  - java.lang.String
*/
type InventoryFrequency = typings.awsSdk.s3Mod._InventoryFrequency | java.lang.String

type InventoryId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.All_
  - typings.awsSdk.awsSdkStrings.Current_
  - java.lang.String
*/
type InventoryIncludedObjectVersions = typings.awsSdk.s3Mod._InventoryIncludedObjectVersions | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Size_
  - typings.awsSdk.awsSdkStrings.LastModifiedDate
  - typings.awsSdk.awsSdkStrings.StorageClass
  - typings.awsSdk.awsSdkStrings.ETag
  - typings.awsSdk.awsSdkStrings.IsMultipartUploaded
  - typings.awsSdk.awsSdkStrings.ReplicationStatus
  - typings.awsSdk.awsSdkStrings.EncryptionStatus
  - typings.awsSdk.awsSdkStrings.ObjectLockRetainUntilDate
  - typings.awsSdk.awsSdkStrings.ObjectLockMode
  - typings.awsSdk.awsSdkStrings.ObjectLockLegalHoldStatus
  - typings.awsSdk.awsSdkStrings.IntelligentTieringAccessTier
  - java.lang.String
*/
type InventoryOptionalField = typings.awsSdk.s3Mod._InventoryOptionalField | java.lang.String

type InventoryOptionalFields = js.Array[typings.awsSdk.s3Mod.InventoryOptionalField]

type IsEnabled = scala.Boolean

type IsLatest = scala.Boolean

type IsPublic = scala.Boolean

type IsTruncated = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DOCUMENT
  - typings.awsSdk.awsSdkStrings.LINES
  - java.lang.String
*/
type JSONType = typings.awsSdk.s3Mod._JSONType | java.lang.String

type KMSContext = java.lang.String

type KeyCount = scala.Double

type KeyMarker = java.lang.String

type KeyPrefixEquals = java.lang.String

type LambdaFunctionArn = java.lang.String

type LambdaFunctionConfigurationList = js.Array[typings.awsSdk.s3Mod.LambdaFunctionConfiguration]

type LastModified = typings.std.Date

type LifecycleRules = js.Array[typings.awsSdk.s3Mod.LifecycleRule]

type Location = java.lang.String

type LocationPrefix = java.lang.String

type MFA = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type MFADelete = typings.awsSdk.s3Mod._MFADelete | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type MFADeleteStatus = typings.awsSdk.s3Mod._MFADeleteStatus | java.lang.String

type Marker = java.lang.String

type MaxAgeSeconds = scala.Double

type MaxKeys = scala.Double

type MaxParts = scala.Double

type MaxUploads = scala.Double

type Message = java.lang.String

type Metadata = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.s3Mod.MetadataValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COPY
  - typings.awsSdk.awsSdkStrings.REPLACE
  - java.lang.String
*/
type MetadataDirective = typings.awsSdk.s3Mod._MetadataDirective | java.lang.String

type MetadataKey = java.lang.String

type MetadataValue = java.lang.String

type MetricsConfigurationList = js.Array[typings.awsSdk.s3Mod.MetricsConfiguration]

type MetricsId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type MetricsStatus = typings.awsSdk.s3Mod._MetricsStatus | java.lang.String

type Minutes = scala.Double

type MissingMeta = scala.Double

type MultipartUploadId = java.lang.String

type MultipartUploadList = js.Array[typings.awsSdk.s3Mod.MultipartUpload]

type NextKeyMarker = java.lang.String

type NextMarker = java.lang.String

type NextPartNumberMarker = scala.Double

type NextToken = java.lang.String

type NextUploadIdMarker = java.lang.String

type NextVersionIdMarker = java.lang.String

type NoncurrentVersionTransitionList = js.Array[typings.awsSdk.s3Mod.NoncurrentVersionTransition]

type NotificationId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.private__
  - typings.awsSdk.awsSdkStrings.`public-read`
  - typings.awsSdk.awsSdkStrings.`public-read-write`
  - typings.awsSdk.awsSdkStrings.`authenticated-read`
  - typings.awsSdk.awsSdkStrings.`aws-exec-read`
  - typings.awsSdk.awsSdkStrings.`bucket-owner-read`
  - typings.awsSdk.awsSdkStrings.`bucket-owner-full-control`
  - java.lang.String
*/
type ObjectCannedACL = typings.awsSdk.s3Mod._ObjectCannedACL | java.lang.String

type ObjectIdentifierList = js.Array[typings.awsSdk.s3Mod.ObjectIdentifier]

type ObjectKey = java.lang.String

type ObjectList = js.Array[typings.awsSdk.s3Mod.Object]

type ObjectLockEnabled = typings.awsSdk.awsSdkStrings.Enabled_ | java.lang.String

type ObjectLockEnabledForBucket = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ON
  - typings.awsSdk.awsSdkStrings.OFF
  - java.lang.String
*/
type ObjectLockLegalHoldStatus = typings.awsSdk.s3Mod._ObjectLockLegalHoldStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GOVERNANCE
  - typings.awsSdk.awsSdkStrings.COMPLIANCE
  - java.lang.String
*/
type ObjectLockMode = typings.awsSdk.s3Mod._ObjectLockMode | java.lang.String

type ObjectLockRetainUntilDate = typings.std.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GOVERNANCE
  - typings.awsSdk.awsSdkStrings.COMPLIANCE
  - java.lang.String
*/
type ObjectLockRetentionMode = typings.awsSdk.s3Mod._ObjectLockRetentionMode | java.lang.String

type ObjectLockToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BucketOwnerPreferred
  - typings.awsSdk.awsSdkStrings.ObjectWriter
  - java.lang.String
*/
type ObjectOwnership = typings.awsSdk.s3Mod._ObjectOwnership | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STANDARD
  - typings.awsSdk.awsSdkStrings.REDUCED_REDUNDANCY
  - typings.awsSdk.awsSdkStrings.GLACIER
  - typings.awsSdk.awsSdkStrings.STANDARD_IA
  - typings.awsSdk.awsSdkStrings.ONEZONE_IA
  - typings.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
  - typings.awsSdk.awsSdkStrings.DEEP_ARCHIVE
  - typings.awsSdk.awsSdkStrings.OUTPOSTS
  - java.lang.String
*/
type ObjectStorageClass = typings.awsSdk.s3Mod._ObjectStorageClass | java.lang.String

type ObjectVersionId = java.lang.String

type ObjectVersionList = js.Array[typings.awsSdk.s3Mod.ObjectVersion]

type ObjectVersionStorageClass = typings.awsSdk.awsSdkStrings.STANDARD | java.lang.String

type OwnerOverride = typings.awsSdk.awsSdkStrings.Destination | java.lang.String

type OwnershipControlsRules = js.Array[typings.awsSdk.s3Mod.OwnershipControlsRule]

type PartNumber = scala.Double

type PartNumberMarker = scala.Double

type Parts = js.Array[typings.awsSdk.s3Mod.Part]

type PartsCount = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Requester
  - typings.awsSdk.awsSdkStrings.BucketOwner
  - java.lang.String
*/
type Payer = typings.awsSdk.s3Mod._Payer | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FULL_CONTROL
  - typings.awsSdk.awsSdkStrings.WRITE
  - typings.awsSdk.awsSdkStrings.WRITE_ACP
  - typings.awsSdk.awsSdkStrings.READ
  - typings.awsSdk.awsSdkStrings.READ_ACP
  - java.lang.String
*/
type Permission = typings.awsSdk.s3Mod._Permission | java.lang.String

type Policy = java.lang.String

type Prefix = java.lang.String

type Priority = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.http_
  - typings.awsSdk.awsSdkStrings.https_
  - java.lang.String
*/
type Protocol = typings.awsSdk.s3Mod._Protocol | java.lang.String

type QueueArn = java.lang.String

type QueueConfigurationList = js.Array[typings.awsSdk.s3Mod.QueueConfiguration]

type Quiet = scala.Boolean

type QuoteCharacter = java.lang.String

type QuoteEscapeCharacter = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALWAYS
  - typings.awsSdk.awsSdkStrings.ASNEEDED
  - java.lang.String
*/
type QuoteFields = typings.awsSdk.s3Mod._QuoteFields | java.lang.String

type Range = java.lang.String

type RecordDelimiter = java.lang.String

type ReplaceKeyPrefixWith = java.lang.String

type ReplaceKeyWith = java.lang.String

type ReplicaKmsKeyID = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ReplicationRuleStatus = typings.awsSdk.s3Mod._ReplicationRuleStatus | java.lang.String

type ReplicationRules = js.Array[typings.awsSdk.s3Mod.ReplicationRule]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPLETE
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.REPLICA
  - java.lang.String
*/
type ReplicationStatus = typings.awsSdk.s3Mod._ReplicationStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ReplicationTimeStatus = typings.awsSdk.s3Mod._ReplicationTimeStatus | java.lang.String

type RequestCharged = typings.awsSdk.awsSdkStrings.requester_ | java.lang.String

type RequestPayer = typings.awsSdk.awsSdkStrings.requester_ | java.lang.String

type ResponseCacheControl = java.lang.String

type ResponseContentDisposition = java.lang.String

type ResponseContentEncoding = java.lang.String

type ResponseContentLanguage = java.lang.String

type ResponseContentType = java.lang.String

type ResponseExpires = typings.std.Date

type Restore = java.lang.String

type RestoreOutputPath = java.lang.String

type RestoreRequestType = typings.awsSdk.awsSdkStrings.SELECT | java.lang.String

type Role = java.lang.String

type RoutingRules = js.Array[typings.awsSdk.s3Mod.RoutingRule]

type Rules = js.Array[typings.awsSdk.s3Mod.Rule]

type SSECustomerAlgorithm = java.lang.String

type SSECustomerKey = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.s3Mod.Blob | java.lang.String

type SSECustomerKeyMD5 = java.lang.String

type SSEKMSEncryptionContext = java.lang.String

type SSEKMSKeyId = java.lang.String

type SelectObjectContentEventStream = typings.awsSdk.eventStreamMod.EventStream[typings.awsSdk.anon.Cont]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AES256
  - typings.awsSdk.awsSdkStrings.awsColonkms
  - java.lang.String
*/
type ServerSideEncryption = typings.awsSdk.s3Mod._ServerSideEncryption | java.lang.String

type ServerSideEncryptionRules = js.Array[typings.awsSdk.s3Mod.ServerSideEncryptionRule]

type Setting = scala.Boolean

type Size = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type SseKmsEncryptedObjectsStatus = typings.awsSdk.s3Mod._SseKmsEncryptedObjectsStatus | java.lang.String

type Start = scala.Double

type StartAfter = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STANDARD
  - typings.awsSdk.awsSdkStrings.REDUCED_REDUNDANCY
  - typings.awsSdk.awsSdkStrings.STANDARD_IA
  - typings.awsSdk.awsSdkStrings.ONEZONE_IA
  - typings.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
  - typings.awsSdk.awsSdkStrings.GLACIER
  - typings.awsSdk.awsSdkStrings.DEEP_ARCHIVE
  - typings.awsSdk.awsSdkStrings.OUTPOSTS
  - java.lang.String
*/
type StorageClass = typings.awsSdk.s3Mod._StorageClass | java.lang.String

type StorageClassAnalysisSchemaVersion = typings.awsSdk.awsSdkStrings.V_1 | java.lang.String

type Suffix = java.lang.String

type TagCount = scala.Double

type TagSet = js.Array[typings.awsSdk.s3Mod.Tag]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COPY
  - typings.awsSdk.awsSdkStrings.REPLACE
  - java.lang.String
*/
type TaggingDirective = typings.awsSdk.s3Mod._TaggingDirective | java.lang.String

type TaggingHeader = java.lang.String

type TargetBucket = java.lang.String

type TargetGrants = js.Array[typings.awsSdk.s3Mod.TargetGrant]

type TargetPrefix = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Standard_
  - typings.awsSdk.awsSdkStrings.Bulk_
  - typings.awsSdk.awsSdkStrings.Expedited
  - java.lang.String
*/
type Tier = typings.awsSdk.s3Mod._Tier | java.lang.String

type TieringList = js.Array[typings.awsSdk.s3Mod.Tiering]

type Token = java.lang.String

type TopicArn = java.lang.String

type TopicConfigurationList = js.Array[typings.awsSdk.s3Mod.TopicConfiguration]

type TransitionList = js.Array[typings.awsSdk.s3Mod.Transition]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GLACIER
  - typings.awsSdk.awsSdkStrings.STANDARD_IA
  - typings.awsSdk.awsSdkStrings.ONEZONE_IA
  - typings.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
  - typings.awsSdk.awsSdkStrings.DEEP_ARCHIVE
  - java.lang.String
*/
type TransitionStorageClass = typings.awsSdk.s3Mod._TransitionStorageClass | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CanonicalUser
  - typings.awsSdk.awsSdkStrings.AmazonCustomerByEmail
  - typings.awsSdk.awsSdkStrings.Group_
  - java.lang.String
*/
type Type = typings.awsSdk.s3Mod._Type | java.lang.String

type URI = java.lang.String

type UploadIdMarker = java.lang.String

type UserMetadata = js.Array[typings.awsSdk.s3Mod.MetadataEntry]

type Value = java.lang.String

type VersionIdMarker = java.lang.String

type WebsiteRedirectLocation = java.lang.String

type Years = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2006-03-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.s3Mod._apiVersion | java.lang.String
