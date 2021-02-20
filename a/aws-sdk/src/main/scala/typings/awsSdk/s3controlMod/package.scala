package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object s3controlMod {
  
  type AccessPointList = js.Array[typings.awsSdk.s3controlMod.AccessPoint]
  
  type AccessPointName = java.lang.String
  
  type AccountId = java.lang.String
  
  type AwsOrgArn = java.lang.String
  
  type Boolean = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.private__
    - typings.awsSdk.awsSdkStrings.`public-read`
    - typings.awsSdk.awsSdkStrings.`public-read-write`
    - typings.awsSdk.awsSdkStrings.`authenticated-read`
    - java.lang.String
  */
  type BucketCannedACL = typings.awsSdk.s3controlMod._BucketCannedACL | java.lang.String
  
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
  type BucketLocationConstraint = typings.awsSdk.s3controlMod._BucketLocationConstraint | java.lang.String
  
  type BucketName = java.lang.String
  
  type Buckets = js.Array[typings.awsSdk.s3controlMod.S3BucketArnString]
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.configUseDualstackMod.UseDualstackConfigOptions with typings.awsSdk.s3controlMod.ClientApiVersions
  
  type ConfigId = java.lang.String
  
  type ConfirmRemoveSelfBucketAccess = scala.Boolean
  
  type ConfirmationRequired = scala.Boolean
  
  type ContinuationToken = java.lang.String
  
  type CreationDate = typings.std.Date
  
  type Date = typings.std.Date
  
  type Days = scala.Double
  
  type DaysAfterInitiation = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Enabled_
    - typings.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type ExpirationStatus = typings.awsSdk.s3controlMod._ExpirationStatus | java.lang.String
  
  type ExpiredObjectDeleteMarker = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CSV
    - typings.awsSdk.awsSdkStrings.Parquet_
    - java.lang.String
  */
  type Format = typings.awsSdk.s3controlMod._Format | java.lang.String
  
  type FunctionArnString = java.lang.String
  
  type GrantFullControl = java.lang.String
  
  type GrantRead = java.lang.String
  
  type GrantReadACP = java.lang.String
  
  type GrantWrite = java.lang.String
  
  type GrantWriteACP = java.lang.String
  
  type IAMRoleArn = java.lang.String
  
  type ID = java.lang.String
  
  type IsEnabled = scala.Boolean
  
  type IsPublic = scala.Boolean
  
  type JobArn = java.lang.String
  
  type JobCreationTime = typings.std.Date
  
  type JobFailureCode = java.lang.String
  
  type JobFailureList = js.Array[typings.awsSdk.s3controlMod.JobFailure]
  
  type JobFailureReason = java.lang.String
  
  type JobId = java.lang.String
  
  type JobListDescriptorList = js.Array[typings.awsSdk.s3controlMod.JobListDescriptor]
  
  type JobManifestFieldList = js.Array[typings.awsSdk.s3controlMod.JobManifestFieldName]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Ignore_
    - typings.awsSdk.awsSdkStrings.Bucket
    - typings.awsSdk.awsSdkStrings.Key_
    - typings.awsSdk.awsSdkStrings.VersionId
    - java.lang.String
  */
  type JobManifestFieldName = typings.awsSdk.s3controlMod._JobManifestFieldName | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.S3BatchOperations_CSV_20180820
    - typings.awsSdk.awsSdkStrings.S3InventoryReport_CSV_20161130
    - java.lang.String
  */
  type JobManifestFormat = typings.awsSdk.s3controlMod._JobManifestFormat | java.lang.String
  
  type JobNumberOfTasksFailed = scala.Double
  
  type JobNumberOfTasksSucceeded = scala.Double
  
  type JobPriority = scala.Double
  
  type JobReportFormat = typings.awsSdk.awsSdkStrings.Report_CSV_20180820 | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AllTasks
    - typings.awsSdk.awsSdkStrings.FailedTasksOnly
    - java.lang.String
  */
  type JobReportScope = typings.awsSdk.s3controlMod._JobReportScope | java.lang.String
  
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
  type JobStatus = typings.awsSdk.s3controlMod._JobStatus | java.lang.String
  
  type JobStatusList = js.Array[typings.awsSdk.s3controlMod.JobStatus]
  
  type JobStatusUpdateReason = java.lang.String
  
  type JobTerminationDate = typings.std.Date
  
  type JobTotalNumberOfTasks = scala.Double
  
  type KmsKeyArnString = java.lang.String
  
  type LifecycleRules = js.Array[typings.awsSdk.s3controlMod.LifecycleRule]
  
  type Location = java.lang.String
  
  type MaxLength1024String = java.lang.String
  
  type MaxResults = scala.Double
  
  type MinStorageBytesPercentage = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Internet_
    - typings.awsSdk.awsSdkStrings.VPC
    - java.lang.String
  */
  type NetworkOrigin = typings.awsSdk.s3controlMod._NetworkOrigin | java.lang.String
  
  type NonEmptyMaxLength1024String = java.lang.String
  
  type NonEmptyMaxLength2048String = java.lang.String
  
  type NonEmptyMaxLength256String = java.lang.String
  
  type NonEmptyMaxLength64String = java.lang.String
  
  type NoncurrentVersionTransitionList = js.Array[typings.awsSdk.s3controlMod.NoncurrentVersionTransition]
  
  type ObjectLockEnabledForBucket = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.LambdaInvoke
    - typings.awsSdk.awsSdkStrings.S3PutObjectCopy
    - typings.awsSdk.awsSdkStrings.S3PutObjectAcl
    - typings.awsSdk.awsSdkStrings.S3PutObjectTagging
    - typings.awsSdk.awsSdkStrings.S3InitiateRestoreObject
    - typings.awsSdk.awsSdkStrings.S3PutObjectLegalHold
    - typings.awsSdk.awsSdkStrings.S3PutObjectRetention
    - java.lang.String
  */
  type OperationName = typings.awsSdk.s3controlMod._OperationName | java.lang.String
  
  type OutputSchemaVersion = typings.awsSdk.awsSdkStrings.V_1 | java.lang.String
  
  type Policy = java.lang.String
  
  type Prefix = java.lang.String
  
  type PublicAccessBlockEnabled = scala.Boolean
  
  type RegionalBucketList = js.Array[typings.awsSdk.s3controlMod.RegionalBucket]
  
  type Regions = js.Array[typings.awsSdk.s3controlMod.S3AWSRegion]
  
  type ReportPrefixString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Cancelled_
    - typings.awsSdk.awsSdkStrings.Ready_
    - java.lang.String
  */
  type RequestedJobStatus = typings.awsSdk.s3controlMod._RequestedJobStatus | java.lang.String
  
  type S3AWSRegion = java.lang.String
  
  type S3AccessPointArn = java.lang.String
  
  type S3BucketArnString = java.lang.String
  
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
  type S3CannedAccessControlList = typings.awsSdk.s3controlMod._S3CannedAccessControlList | java.lang.String
  
  type S3ContentLength = scala.Double
  
  type S3ExpirationInDays = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.BULK
    - typings.awsSdk.awsSdkStrings.STANDARD
    - java.lang.String
  */
  type S3GlacierJobTier = typings.awsSdk.s3controlMod._S3GlacierJobTier | java.lang.String
  
  type S3GrantList = js.Array[typings.awsSdk.s3controlMod.S3Grant]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.id__
    - typings.awsSdk.awsSdkStrings.emailAddress_
    - typings.awsSdk.awsSdkStrings.uri_
    - java.lang.String
  */
  type S3GranteeTypeIdentifier = typings.awsSdk.s3controlMod._S3GranteeTypeIdentifier | java.lang.String
  
  type S3KeyArnString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.COPY
    - typings.awsSdk.awsSdkStrings.REPLACE
    - java.lang.String
  */
  type S3MetadataDirective = typings.awsSdk.s3controlMod._S3MetadataDirective | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OFF
    - typings.awsSdk.awsSdkStrings.ON
    - java.lang.String
  */
  type S3ObjectLockLegalHoldStatus = typings.awsSdk.s3controlMod._S3ObjectLockLegalHoldStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.COMPLIANCE
    - typings.awsSdk.awsSdkStrings.GOVERNANCE
    - java.lang.String
  */
  type S3ObjectLockMode = typings.awsSdk.s3controlMod._S3ObjectLockMode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.COMPLIANCE
    - typings.awsSdk.awsSdkStrings.GOVERNANCE
    - java.lang.String
  */
  type S3ObjectLockRetentionMode = typings.awsSdk.s3controlMod._S3ObjectLockRetentionMode | java.lang.String
  
  type S3ObjectVersionId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FULL_CONTROL
    - typings.awsSdk.awsSdkStrings.READ
    - typings.awsSdk.awsSdkStrings.WRITE
    - typings.awsSdk.awsSdkStrings.READ_ACP
    - typings.awsSdk.awsSdkStrings.WRITE_ACP
    - java.lang.String
  */
  type S3Permission = typings.awsSdk.s3controlMod._S3Permission | java.lang.String
  
  type S3RegionalBucketArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AES256
    - typings.awsSdk.awsSdkStrings.KMS
    - java.lang.String
  */
  type S3SSEAlgorithm = typings.awsSdk.s3controlMod._S3SSEAlgorithm | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STANDARD
    - typings.awsSdk.awsSdkStrings.STANDARD_IA
    - typings.awsSdk.awsSdkStrings.ONEZONE_IA
    - typings.awsSdk.awsSdkStrings.GLACIER
    - typings.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
    - typings.awsSdk.awsSdkStrings.DEEP_ARCHIVE
    - java.lang.String
  */
  type S3StorageClass = typings.awsSdk.s3controlMod._S3StorageClass | java.lang.String
  
  type S3TagSet = js.Array[typings.awsSdk.s3controlMod.S3Tag]
  
  type S3UserMetadata = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.s3controlMod.MaxLength1024String]
  
  type SSEKMSKeyId = java.lang.String
  
  type Setting = scala.Boolean
  
  type StorageLensArn = java.lang.String
  
  type StorageLensConfigurationList = js.Array[typings.awsSdk.s3controlMod.ListStorageLensConfigurationEntry]
  
  type StorageLensPrefixLevelDelimiter = java.lang.String
  
  type StorageLensPrefixLevelMaxDepth = scala.Double
  
  type StorageLensTags = js.Array[typings.awsSdk.s3controlMod.StorageLensTag]
  
  type StringForNextToken = java.lang.String
  
  type SuspendedCause = java.lang.String
  
  type SuspendedDate = typings.std.Date
  
  type TagKeyString = java.lang.String
  
  type TagValueString = java.lang.String
  
  type TimeStamp = typings.std.Date
  
  type TransitionList = js.Array[typings.awsSdk.s3controlMod.Transition]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GLACIER
    - typings.awsSdk.awsSdkStrings.STANDARD_IA
    - typings.awsSdk.awsSdkStrings.ONEZONE_IA
    - typings.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
    - typings.awsSdk.awsSdkStrings.DEEP_ARCHIVE
    - java.lang.String
  */
  type TransitionStorageClass = typings.awsSdk.s3controlMod._TransitionStorageClass | java.lang.String
  
  type VpcId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-08-20`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.s3controlMod._apiVersion | java.lang.String
}
