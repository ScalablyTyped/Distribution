package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object macie2Mod {
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLING_IN_PROGRESS
    - java.lang.String
  */
  type AdminStatus = typings.awsSdk.macie2Mod._AdminStatus | java.lang.String
  type BucketCriteria = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.macie2Mod.BucketCriteriaAdditionalProperties]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.macie2Mod.ClientApiVersions
  type Criterion = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.macie2Mod.CriterionAdditionalProperties]
  type Currency = typings.awsSdk.awsSdkStrings.USD | java.lang.String
  type CustomDetections = js.Array[typings.awsSdk.macie2Mod.CustomDetection]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUNDAY
    - typings.awsSdk.awsSdkStrings.MONDAY
    - typings.awsSdk.awsSdkStrings.TUESDAY
    - typings.awsSdk.awsSdkStrings.WEDNESDAY
    - typings.awsSdk.awsSdkStrings.THURSDAY
    - typings.awsSdk.awsSdkStrings.FRIDAY
    - typings.awsSdk.awsSdkStrings.SATURDAY
    - java.lang.String
  */
  type DayOfWeek = typings.awsSdk.macie2Mod._DayOfWeek | java.lang.String
  type DefaultDetections = js.Array[typings.awsSdk.macie2Mod.DefaultDetection]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PUBLIC
    - typings.awsSdk.awsSdkStrings.NOT_PUBLIC
    - java.lang.String
  */
  type EffectivePermission = typings.awsSdk.macie2Mod._EffectivePermission | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.AES256
    - typings.awsSdk.awsSdkStrings.awsColonkms
    - typings.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type EncryptionType = typings.awsSdk.macie2Mod._EncryptionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ClientError
    - typings.awsSdk.awsSdkStrings.InternalError
    - java.lang.String
  */
  type ErrorCode = typings.awsSdk.macie2Mod._ErrorCode | java.lang.String
  type FindingActionType = typings.awsSdk.awsSdkStrings.AWS_API_CALL | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CLASSIFICATION
    - typings.awsSdk.awsSdkStrings.POLICY
    - java.lang.String
  */
  type FindingCategory = typings.awsSdk.macie2Mod._FindingCategory | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FIFTEEN_MINUTES
    - typings.awsSdk.awsSdkStrings.ONE_HOUR
    - typings.awsSdk.awsSdkStrings.SIX_HOURS
    - java.lang.String
  */
  type FindingPublishingFrequency = typings.awsSdk.macie2Mod._FindingPublishingFrequency | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.groupKey
    - typings.awsSdk.awsSdkStrings.count__
    - java.lang.String
  */
  type FindingStatisticsSortAttributeName = typings.awsSdk.macie2Mod._FindingStatisticsSortAttributeName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SensitiveDataColonS3ObjectSlashMultiple
    - typings.awsSdk.awsSdkStrings.SensitiveDataColonS3ObjectSlashFinancial
    - typings.awsSdk.awsSdkStrings.SensitiveDataColonS3ObjectSlashPersonal
    - typings.awsSdk.awsSdkStrings.SensitiveDataColonS3ObjectSlashCredentials
    - typings.awsSdk.awsSdkStrings.SensitiveDataColonS3ObjectSlashCustomIdentifier
    - typings.awsSdk.awsSdkStrings.PolicyColonIAMUserSlashS3BucketPublic
    - typings.awsSdk.awsSdkStrings.PolicyColonIAMUserSlashS3BucketSharedExternally
    - typings.awsSdk.awsSdkStrings.PolicyColonIAMUserSlashS3BucketReplicatedExternally
    - typings.awsSdk.awsSdkStrings.PolicyColonIAMUserSlashS3BucketEncryptionDisabled
    - typings.awsSdk.awsSdkStrings.PolicyColonIAMUserSlashS3BlockPublicAccessDisabled
    - java.lang.String
  */
  type FindingType = typings.awsSdk.macie2Mod._FindingType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ARCHIVE
    - typings.awsSdk.awsSdkStrings.NOOP
    - java.lang.String
  */
  type FindingsFilterAction = typings.awsSdk.macie2Mod._FindingsFilterAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.resourcesAffectedDots3BucketDotname
    - typings.awsSdk.awsSdkStrings.type__
    - typings.awsSdk.awsSdkStrings.classificationDetailsDotjobId
    - typings.awsSdk.awsSdkStrings.severityDotdescription
    - java.lang.String
  */
  type GroupBy = typings.awsSdk.macie2Mod._GroupBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EQ
    - typings.awsSdk.awsSdkStrings.GT
    - typings.awsSdk.awsSdkStrings.GTE
    - typings.awsSdk.awsSdkStrings.LT
    - typings.awsSdk.awsSdkStrings.LTE
    - typings.awsSdk.awsSdkStrings.NE
    - typings.awsSdk.awsSdkStrings.CONTAINS
    - java.lang.String
  */
  type JobComparator = typings.awsSdk.macie2Mod._JobComparator | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.PAUSED
    - typings.awsSdk.awsSdkStrings.CANCELLED
    - typings.awsSdk.awsSdkStrings.COMPLETE
    - typings.awsSdk.awsSdkStrings.IDLE
    - java.lang.String
  */
  type JobStatus = typings.awsSdk.macie2Mod._JobStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ONE_TIME
    - typings.awsSdk.awsSdkStrings.SCHEDULED
    - java.lang.String
  */
  type JobType = typings.awsSdk.macie2Mod._JobType | java.lang.String
  type KeyValuePairList = js.Array[typings.awsSdk.macie2Mod.KeyValuePair]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.jobType
    - typings.awsSdk.awsSdkStrings.jobStatus_
    - typings.awsSdk.awsSdkStrings.createdAt_
    - typings.awsSdk.awsSdkStrings.name__
    - java.lang.String
  */
  type ListJobsFilterKey = typings.awsSdk.macie2Mod._ListJobsFilterKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.createdAt_
    - typings.awsSdk.awsSdkStrings.jobStatus_
    - typings.awsSdk.awsSdkStrings.name__
    - typings.awsSdk.awsSdkStrings.jobType
    - java.lang.String
  */
  type ListJobsSortAttributeName = typings.awsSdk.macie2Mod._ListJobsSortAttributeName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PAUSED
    - typings.awsSdk.awsSdkStrings.ENABLED
    - java.lang.String
  */
  type MacieStatus = typings.awsSdk.macie2Mod._MacieStatus | java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ASC
    - typings.awsSdk.awsSdkStrings.DESC
    - java.lang.String
  */
  type OrderBy = typings.awsSdk.macie2Mod._OrderBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Enabled_
    - typings.awsSdk.awsSdkStrings.Paused_
    - typings.awsSdk.awsSdkStrings.Invited_
    - typings.awsSdk.awsSdkStrings.Created_
    - typings.awsSdk.awsSdkStrings.Removed_
    - typings.awsSdk.awsSdkStrings.Resigned
    - typings.awsSdk.awsSdkStrings.EmailVerificationInProgress
    - typings.awsSdk.awsSdkStrings.EmailVerificationFailed
    - java.lang.String
  */
  type RelationshipStatus = typings.awsSdk.macie2Mod._RelationshipStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.BUCKET_CREATION_DATE
    - typings.awsSdk.awsSdkStrings.OBJECT_EXTENSION
    - typings.awsSdk.awsSdkStrings.OBJECT_LAST_MODIFIED_DATE
    - typings.awsSdk.awsSdkStrings.OBJECT_SIZE
    - typings.awsSdk.awsSdkStrings.TAG
    - java.lang.String
  */
  type ScopeFilterKey = typings.awsSdk.macie2Mod._ScopeFilterKey | java.lang.String
  type SensitiveData = js.Array[typings.awsSdk.macie2Mod.SensitiveDataItem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FINANCIAL_INFORMATION
    - typings.awsSdk.awsSdkStrings.PERSONAL_INFORMATION
    - typings.awsSdk.awsSdkStrings.CREDENTIALS
    - typings.awsSdk.awsSdkStrings.CUSTOM_IDENTIFIER
    - java.lang.String
  */
  type SensitiveDataItemCategory = typings.awsSdk.macie2Mod._SensitiveDataItemCategory | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Low_
    - typings.awsSdk.awsSdkStrings.Medium_
    - typings.awsSdk.awsSdkStrings.High_
    - java.lang.String
  */
  type SeverityDescription = typings.awsSdk.macie2Mod._SeverityDescription | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EXTERNAL
    - typings.awsSdk.awsSdkStrings.INTERNAL
    - typings.awsSdk.awsSdkStrings.NOT_SHARED
    - java.lang.String
  */
  type SharedAccess = typings.awsSdk.macie2Mod._SharedAccess | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STANDARD
    - typings.awsSdk.awsSdkStrings.REDUCED_REDUNDANCY
    - typings.awsSdk.awsSdkStrings.STANDARD_IA
    - typings.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
    - typings.awsSdk.awsSdkStrings.DEEP_ARCHIVE
    - typings.awsSdk.awsSdkStrings.ONEZONE_IA
    - typings.awsSdk.awsSdkStrings.GLACIER
    - java.lang.String
  */
  type StorageClass = typings.awsSdk.macie2Mod._StorageClass | java.lang.String
  type TagMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.macie2Mod.string]
  type TagTarget = typings.awsSdk.awsSdkStrings.S3_OBJECT | java.lang.String
  type Unit = typings.awsSdk.awsSdkStrings.TERABYTES | java.lang.String
  type UsageStatisticsFilterKey = typings.awsSdk.awsSdkStrings.accountId_ | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.accountId_
    - typings.awsSdk.awsSdkStrings.total_
    - java.lang.String
  */
  type UsageStatisticsSortKey = typings.awsSdk.macie2Mod._UsageStatisticsSortKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DATA_INVENTORY_EVALUATION
    - typings.awsSdk.awsSdkStrings.SENSITIVE_DATA_DISCOVERY
    - java.lang.String
  */
  type UsageType = typings.awsSdk.macie2Mod._UsageType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AssumedRole
    - typings.awsSdk.awsSdkStrings.IAMUser
    - typings.awsSdk.awsSdkStrings.FederatedUser
    - typings.awsSdk.awsSdkStrings.Root_
    - typings.awsSdk.awsSdkStrings.AWSAccount
    - typings.awsSdk.awsSdkStrings.AWSService
    - java.lang.String
  */
  type UserIdentityType = typings.awsSdk.macie2Mod._UserIdentityType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2020-01-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.macie2Mod._apiVersion | java.lang.String
  type boolean = scala.Boolean
  type double = scala.Double
  type integer = scala.Double
  type listOfAdminAccount = js.Array[typings.awsSdk.macie2Mod.AdminAccount]
  type listOfBatchGetCustomDataIdentifierSummary = js.Array[typings.awsSdk.macie2Mod.BatchGetCustomDataIdentifierSummary]
  type listOfBucketMetadata = js.Array[typings.awsSdk.macie2Mod.BucketMetadata]
  type listOfCustomDataIdentifierSummary = js.Array[typings.awsSdk.macie2Mod.CustomDataIdentifierSummary]
  type listOfFinding = js.Array[typings.awsSdk.macie2Mod.Finding]
  type listOfFindingType = js.Array[typings.awsSdk.macie2Mod.FindingType]
  type listOfFindingsFilterListItem = js.Array[typings.awsSdk.macie2Mod.FindingsFilterListItem]
  type listOfGroupCount = js.Array[typings.awsSdk.macie2Mod.GroupCount]
  type listOfInvitation = js.Array[typings.awsSdk.macie2Mod.Invitation]
  type listOfJobScopeTerm = js.Array[typings.awsSdk.macie2Mod.JobScopeTerm]
  type listOfJobSummary = js.Array[typings.awsSdk.macie2Mod.JobSummary]
  type listOfKeyValuePair = js.Array[typings.awsSdk.macie2Mod.KeyValuePair]
  type listOfListJobsFilterTerm = js.Array[typings.awsSdk.macie2Mod.ListJobsFilterTerm]
  type listOfMember = js.Array[typings.awsSdk.macie2Mod.Member]
  type listOfS3BucketDefinitionForJob = js.Array[typings.awsSdk.macie2Mod.S3BucketDefinitionForJob]
  type listOfString = js.Array[typings.awsSdk.macie2Mod.string]
  type listOfTagValuePair = js.Array[typings.awsSdk.macie2Mod.TagValuePair]
  type listOfUnprocessedAccount = js.Array[typings.awsSdk.macie2Mod.UnprocessedAccount]
  type listOfUsageByAccount = js.Array[typings.awsSdk.macie2Mod.UsageByAccount]
  type listOfUsageRecord = js.Array[typings.awsSdk.macie2Mod.UsageRecord]
  type listOfUsageStatisticsFilter = js.Array[typings.awsSdk.macie2Mod.UsageStatisticsFilter]
  type listOfUsageTotal = js.Array[typings.awsSdk.macie2Mod.UsageTotal]
  type long = scala.Double
  type string = java.lang.String
  type timestampIso8601 = typings.std.Date
}
