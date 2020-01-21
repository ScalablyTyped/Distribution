package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object s3controlMod {
  type AccessPointList = js.Array[typings.awsSdk.s3controlMod.AccessPoint]
  type AccessPointName = java.lang.String
  type AccountId = java.lang.String
  type Boolean = scala.Boolean
  type BucketName = java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.configUseDualstackMod.UseDualstackConfigOptions with typings.awsSdk.s3controlMod.ClientApiVersions
  type ConfirmationRequired = scala.Boolean
  type CreationDate = typings.std.Date
  type IAMRoleArn = java.lang.String
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
  type MaxLength1024String = java.lang.String
  type MaxResults = scala.Double
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
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.LambdaInvoke
    - typings.awsSdk.awsSdkStrings.S3PutObjectCopy
    - typings.awsSdk.awsSdkStrings.S3PutObjectAcl
    - typings.awsSdk.awsSdkStrings.S3PutObjectTagging
    - typings.awsSdk.awsSdkStrings.S3InitiateRestoreObject
    - java.lang.String
  */
  type OperationName = typings.awsSdk.s3controlMod._OperationName | java.lang.String
  type Policy = java.lang.String
  type ReportPrefixString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Cancelled_
    - typings.awsSdk.awsSdkStrings.Ready_
    - java.lang.String
  */
  type RequestedJobStatus = typings.awsSdk.s3controlMod._RequestedJobStatus | java.lang.String
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
  type Setting = scala.Boolean
  type SuspendedCause = java.lang.String
  type SuspendedDate = typings.std.Date
  type TimeStamp = typings.std.Date
  type VpcId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-08-20`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.s3controlMod._apiVersion | java.lang.String
}
