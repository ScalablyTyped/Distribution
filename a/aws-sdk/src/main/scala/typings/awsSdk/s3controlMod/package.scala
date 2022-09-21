package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.GetObject
import typings.awsSdk.awsSdkStrings.Report_CSV_20180820
import typings.awsSdk.awsSdkStrings.S3InventoryReport_CSV_20211130
import typings.awsSdk.awsSdkStrings.V_1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessPointList = js.Array[AccessPoint]

type AccessPointName = String

type AccountId = String

type Alias = String

type AsyncCreationTimestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CreateMultiRegionAccessPoint
  - typings.awsSdk.awsSdkStrings.DeleteMultiRegionAccessPoint
  - typings.awsSdk.awsSdkStrings.PutMultiRegionAccessPointPolicy
  - java.lang.String
*/
type AsyncOperationName = _AsyncOperationName | String

type AsyncRequestStatus = String

type AsyncRequestTokenARN = String

type AwsLambdaTransformationPayload = String

type AwsOrgArn = String

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.private__
  - typings.awsSdk.awsSdkStrings.`public-read`
  - typings.awsSdk.awsSdkStrings.`public-read-write`
  - typings.awsSdk.awsSdkStrings.`authenticated-read`
  - java.lang.String
*/
type BucketCannedACL = _BucketCannedACL | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EU
  - typings.awsSdk.awsSdkStrings.`eu-west-1`
  - typings.awsSdk.awsSdkStrings.`us-west-1`
  - typings.awsSdk.awsSdkStrings.`us-west-2`
  - typings.awsSdk.awsSdkStrings.`ap-south-1`
  - typings.awsSdk.awsSdkStrings.`ap-southeast-1`
  - typings.awsSdk.awsSdkStrings.`ap-southeast-2`
  - typings.awsSdk.awsSdkStrings.`ap-northeast-1`
  - typings.awsSdk.awsSdkStrings.`sa-east-1`
  - typings.awsSdk.awsSdkStrings.`cn-north-1`
  - typings.awsSdk.awsSdkStrings.`eu-central-1`
  - java.lang.String
*/
type BucketLocationConstraint = _BucketLocationConstraint | String

type BucketName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Suspended_
  - java.lang.String
*/
type BucketVersioningStatus = _BucketVersioningStatus | String

type Buckets = js.Array[S3BucketArnString]

type ConfigId = String

type ConfirmRemoveSelfBucketAccess = scala.Boolean

type ConfirmationRequired = scala.Boolean

type ContinuationToken = String

type CreationDate = js.Date

type CreationTimestamp = js.Date

type Date = js.Date

type Days = Double

type DaysAfterInitiation = Double

type Endpoints = StringDictionary[NonEmptyMaxLength1024String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ExpirationStatus = _ExpirationStatus | String

type ExpiredObjectDeleteMarker = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CSV
  - typings.awsSdk.awsSdkStrings.Parquet_
  - java.lang.String
*/
type Format = _Format | String

type FunctionArnString = String

type GeneratedManifestFormat = S3InventoryReport_CSV_20211130 | String

type GrantFullControl = String

type GrantRead = String

type GrantReadACP = String

type GrantWrite = String

type GrantWriteACP = String

type IAMRoleArn = String

type ID = String

type IsEnabled = scala.Boolean

type IsPublic = scala.Boolean

type JobArn = String

type JobCreationTime = js.Date

type JobFailureCode = String

type JobFailureList = js.Array[JobFailure]

type JobFailureReason = String

type JobId = String

type JobListDescriptorList = js.Array[JobListDescriptor]

type JobManifestFieldList = js.Array[JobManifestFieldName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Ignore_
  - typings.awsSdk.awsSdkStrings.Bucket
  - typings.awsSdk.awsSdkStrings.Key_
  - typings.awsSdk.awsSdkStrings.VersionId
  - java.lang.String
*/
type JobManifestFieldName = _JobManifestFieldName | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.S3BatchOperations_CSV_20180820
  - typings.awsSdk.awsSdkStrings.S3InventoryReport_CSV_20161130
  - java.lang.String
*/
type JobManifestFormat = _JobManifestFormat | String

type JobNumberOfTasksFailed = Double

type JobNumberOfTasksSucceeded = Double

type JobPriority = Double

type JobReportFormat = Report_CSV_20180820 | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AllTasks
  - typings.awsSdk.awsSdkStrings.FailedTasksOnly
  - java.lang.String
*/
type JobReportScope = _JobReportScope | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Active_
  - typings.awsSdk.awsSdkStrings.Cancelled_
  - typings.awsSdk.awsSdkStrings.Cancelling_
  - typings.awsSdk.awsSdkStrings.Complete_
  - typings.awsSdk.awsSdkStrings.Completing_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Failing_
  - typings.awsSdk.awsSdkStrings.New_
  - typings.awsSdk.awsSdkStrings.Paused_
  - typings.awsSdk.awsSdkStrings.Pausing
  - typings.awsSdk.awsSdkStrings.Preparing_
  - typings.awsSdk.awsSdkStrings.Ready_
  - typings.awsSdk.awsSdkStrings.Suspended_
  - java.lang.String
*/
type JobStatus = _JobStatus | String

type JobStatusList = js.Array[JobStatus]

type JobStatusUpdateReason = String

type JobTerminationDate = js.Date

type JobTimeInStateSeconds = Double

type JobTotalNumberOfTasks = Double

type KmsKeyArnString = String

type LifecycleRules = js.Array[LifecycleRule]

type Location = String

type MFA = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type MFADelete = _MFADelete | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type MFADeleteStatus = _MFADeleteStatus | String

type ManifestPrefixString = String

type MaxLength1024String = String

type MaxResults = Double

type MinStorageBytesPercentage = Double

type MultiRegionAccessPointAlias = String

type MultiRegionAccessPointClientToken = String

type MultiRegionAccessPointName = String

type MultiRegionAccessPointRegionalResponseList = js.Array[MultiRegionAccessPointRegionalResponse]

type MultiRegionAccessPointReportList = js.Array[MultiRegionAccessPointReport]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.INCONSISTENT_ACROSS_REGIONS
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.PARTIALLY_CREATED
  - typings.awsSdk.awsSdkStrings.PARTIALLY_DELETED
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type MultiRegionAccessPointStatus = _MultiRegionAccessPointStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Internet_
  - typings.awsSdk.awsSdkStrings.VPC
  - java.lang.String
*/
type NetworkOrigin = _NetworkOrigin | String

type NonEmptyMaxLength1024String = String

type NonEmptyMaxLength2048String = String

type NonEmptyMaxLength256String = String

type NonEmptyMaxLength64String = String

type NoncurrentVersionTransitionList = js.Array[NoncurrentVersionTransition]

type ObjectCreationTime = js.Date

type ObjectLambdaAccessPointArn = String

type ObjectLambdaAccessPointList = js.Array[ObjectLambdaAccessPoint]

type ObjectLambdaAccessPointName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`GetObject-Range`
  - typings.awsSdk.awsSdkStrings.`GetObject-PartNumber`
  - java.lang.String
*/
type ObjectLambdaAllowedFeature = _ObjectLambdaAllowedFeature | String

type ObjectLambdaAllowedFeaturesList = js.Array[ObjectLambdaAllowedFeature]

type ObjectLambdaPolicy = String

type ObjectLambdaSupportingAccessPointArn = String

type ObjectLambdaTransformationConfigurationAction = GetObject | String

type ObjectLambdaTransformationConfigurationActionsList = js.Array[ObjectLambdaTransformationConfigurationAction]

type ObjectLambdaTransformationConfigurationsList = js.Array[ObjectLambdaTransformationConfiguration]

type ObjectLockEnabledForBucket = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LambdaInvoke
  - typings.awsSdk.awsSdkStrings.S3PutObjectCopy
  - typings.awsSdk.awsSdkStrings.S3PutObjectAcl
  - typings.awsSdk.awsSdkStrings.S3PutObjectTagging
  - typings.awsSdk.awsSdkStrings.S3DeleteObjectTagging
  - typings.awsSdk.awsSdkStrings.S3InitiateRestoreObject
  - typings.awsSdk.awsSdkStrings.S3PutObjectLegalHold
  - typings.awsSdk.awsSdkStrings.S3PutObjectRetention
  - typings.awsSdk.awsSdkStrings.S3ReplicateObject
  - java.lang.String
*/
type OperationName = _OperationName | String

type OutputSchemaVersion = V_1 | String

type Policy = String

type Prefix = String

type PublicAccessBlockEnabled = scala.Boolean

type RegionCreationList = js.Array[Region]

type RegionName = String

type RegionReportList = js.Array[RegionReport]

type RegionalBucketList = js.Array[RegionalBucket]

type Regions = js.Array[S3AWSRegion]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.REPLICA
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type ReplicationStatus = _ReplicationStatus | String

type ReplicationStatusFilterList = js.Array[ReplicationStatus]

type ReportPrefixString = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Cancelled_
  - typings.awsSdk.awsSdkStrings.Ready_
  - java.lang.String
*/
type RequestedJobStatus = _RequestedJobStatus | String

type S3AWSRegion = String

type S3AccessPointArn = String

type S3BucketArnString = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.private__
  - typings.awsSdk.awsSdkStrings.`public-read`
  - typings.awsSdk.awsSdkStrings.`public-read-write`
  - typings.awsSdk.awsSdkStrings.`aws-exec-read`
  - typings.awsSdk.awsSdkStrings.`authenticated-read`
  - typings.awsSdk.awsSdkStrings.`bucket-owner-read`
  - typings.awsSdk.awsSdkStrings.`bucket-owner-full-control`
  - java.lang.String
*/
type S3CannedAccessControlList = _S3CannedAccessControlList | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CRC32
  - typings.awsSdk.awsSdkStrings.CRC32C
  - typings.awsSdk.awsSdkStrings.SHA1
  - typings.awsSdk.awsSdkStrings.SHA256
  - java.lang.String
*/
type S3ChecksumAlgorithm = _S3ChecksumAlgorithm | String

type S3ContentLength = Double

type S3ExpirationInDays = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BULK
  - typings.awsSdk.awsSdkStrings.STANDARD
  - java.lang.String
*/
type S3GlacierJobTier = _S3GlacierJobTier | String

type S3GrantList = js.Array[S3Grant]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.id__
  - typings.awsSdk.awsSdkStrings.emailAddress_
  - typings.awsSdk.awsSdkStrings.uri_
  - java.lang.String
*/
type S3GranteeTypeIdentifier = _S3GranteeTypeIdentifier | String

type S3KeyArnString = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COPY
  - typings.awsSdk.awsSdkStrings.REPLACE
  - java.lang.String
*/
type S3MetadataDirective = _S3MetadataDirective | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OFF
  - typings.awsSdk.awsSdkStrings.ON
  - java.lang.String
*/
type S3ObjectLockLegalHoldStatus = _S3ObjectLockLegalHoldStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPLIANCE
  - typings.awsSdk.awsSdkStrings.GOVERNANCE
  - java.lang.String
*/
type S3ObjectLockMode = _S3ObjectLockMode | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPLIANCE
  - typings.awsSdk.awsSdkStrings.GOVERNANCE
  - java.lang.String
*/
type S3ObjectLockRetentionMode = _S3ObjectLockRetentionMode | String

type S3ObjectVersionId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FULL_CONTROL
  - typings.awsSdk.awsSdkStrings.READ
  - typings.awsSdk.awsSdkStrings.WRITE
  - typings.awsSdk.awsSdkStrings.READ_ACP
  - typings.awsSdk.awsSdkStrings.WRITE_ACP
  - java.lang.String
*/
type S3Permission = _S3Permission | String

type S3RegionalBucketArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AES256
  - typings.awsSdk.awsSdkStrings.KMS
  - java.lang.String
*/
type S3SSEAlgorithm = _S3SSEAlgorithm | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STANDARD
  - typings.awsSdk.awsSdkStrings.STANDARD_IA
  - typings.awsSdk.awsSdkStrings.ONEZONE_IA
  - typings.awsSdk.awsSdkStrings.GLACIER
  - typings.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
  - typings.awsSdk.awsSdkStrings.DEEP_ARCHIVE
  - typings.awsSdk.awsSdkStrings.GLACIER_IR
  - java.lang.String
*/
type S3StorageClass = _S3StorageClass | String

type S3TagSet = js.Array[S3Tag]

type S3UserMetadata = StringDictionary[MaxLength1024String]

type SSEKMSKeyId = String

type Setting = scala.Boolean

type StorageLensArn = String

type StorageLensConfigurationList = js.Array[ListStorageLensConfigurationEntry]

type StorageLensPrefixLevelDelimiter = String

type StorageLensPrefixLevelMaxDepth = Double

type StorageLensTags = js.Array[StorageLensTag]

type StringForNextToken = String

type SuspendedCause = String

type SuspendedDate = js.Date

type TagKeyString = String

type TagValueString = String

type TimeStamp = js.Date

type TransitionList = js.Array[Transition]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GLACIER
  - typings.awsSdk.awsSdkStrings.STANDARD_IA
  - typings.awsSdk.awsSdkStrings.ONEZONE_IA
  - typings.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
  - typings.awsSdk.awsSdkStrings.DEEP_ARCHIVE
  - java.lang.String
*/
type TransitionStorageClass = _TransitionStorageClass | String

type VpcId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-08-20`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
