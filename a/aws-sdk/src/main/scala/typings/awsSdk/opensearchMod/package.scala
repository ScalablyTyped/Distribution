package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.HOURS
import typings.awsSdk.awsSdkStrings.SCHEDULED_ACTION
import typings.awsSdk.awsSdkStrings.`TXT-DICTIONARY`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = java.lang.String

type AdditionalLimitList = js.Array[AdditionalLimit]

type AdvancedOptions = StringDictionary[String]

type AutoTuneDate = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type AutoTuneDesiredState = _AutoTuneDesiredState | java.lang.String

type AutoTuneList = js.Array[AutoTune]

type AutoTuneMaintenanceScheduleList = js.Array[AutoTuneMaintenanceSchedule]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.ENABLE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DISABLE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DISABLED_AND_ROLLBACK_SCHEDULED
  - typings.awsSdk.awsSdkStrings.DISABLED_AND_ROLLBACK_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DISABLED_AND_ROLLBACK_COMPLETE
  - typings.awsSdk.awsSdkStrings.DISABLED_AND_ROLLBACK_ERROR
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type AutoTuneState = _AutoTuneState | java.lang.String

type AutoTuneType = SCHEDULED_ACTION | java.lang.String

type BackendRole = java.lang.String

type Boolean = scala.Boolean

type ChangeProgressStageList = js.Array[ChangeProgressStage]

type ChangeProgressStageName = java.lang.String

type ChangeProgressStageStatus = java.lang.String

type CloudWatchLogsLogGroupArn = java.lang.String

type CommitMessage = java.lang.String

type CompatibleVersionsList = js.Array[CompatibleVersionsMap]

type ConnectionAlias = java.lang.String

type ConnectionId = java.lang.String

type ConnectionStatusMessage = java.lang.String

type CreatedAt = js.Date

type DeploymentCloseDateTimeStamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_UPDATE
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.NOT_ELIGIBLE
  - typings.awsSdk.awsSdkStrings.ELIGIBLE
  - java.lang.String
*/
type DeploymentStatus = _DeploymentStatus | java.lang.String

type DeploymentType = java.lang.String

type DescribePackagesFilterList = js.Array[DescribePackagesFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PackageID
  - typings.awsSdk.awsSdkStrings.PackageName
  - typings.awsSdk.awsSdkStrings.PackageStatus
  - java.lang.String
*/
type DescribePackagesFilterName = _DescribePackagesFilterName | java.lang.String

type DescribePackagesFilterValue = java.lang.String

type DescribePackagesFilterValues = js.Array[DescribePackagesFilterValue]

type Description = java.lang.String

type DisableTimestamp = js.Date

type DomainId = java.lang.String

type DomainInfoList = js.Array[DomainInfo]

type DomainName = java.lang.String

type DomainNameFqdn = java.lang.String

type DomainNameList = js.Array[DomainName]

type DomainPackageDetailsList = js.Array[DomainPackageDetails]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASSOCIATING
  - typings.awsSdk.awsSdkStrings.ASSOCIATION_FAILED
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DISSOCIATING
  - typings.awsSdk.awsSdkStrings.DISSOCIATION_FAILED
  - java.lang.String
*/
type DomainPackageStatus = _DomainPackageStatus | java.lang.String

type DomainStatusList = js.Array[DomainStatus]

type Double = scala.Double

type DryRun = scala.Boolean

type DurationValue = scala.Double

type EndpointsMap = StringDictionary[ServiceUrl]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OpenSearch
  - typings.awsSdk.awsSdkStrings.Elasticsearch
  - java.lang.String
*/
type EngineType = _EngineType | java.lang.String

type ErrorMessage = java.lang.String

type ErrorType = java.lang.String

type FilterList = js.Array[Filter]

type GUID = java.lang.String

type IdentityPoolId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_ACCEPTANCE
  - typings.awsSdk.awsSdkStrings.APPROVED
  - typings.awsSdk.awsSdkStrings.PROVISIONING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.REJECTING
  - typings.awsSdk.awsSdkStrings.REJECTED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type InboundConnectionStatusCode = _InboundConnectionStatusCode | java.lang.String

type InboundConnections = js.Array[InboundConnection]

type InstanceCount = scala.Double

type InstanceRole = java.lang.String

type InstanceRoleList = js.Array[InstanceRole]

type InstanceTypeDetailsList = js.Array[InstanceTypeDetails]

type Integer = scala.Double

type IntegerClass = scala.Double

type Issue = java.lang.String

type Issues = js.Array[Issue]

type KmsKeyId = java.lang.String

type LastUpdated = js.Date

type LimitName = java.lang.String

type LimitValue = java.lang.String

type LimitValueList = js.Array[LimitValue]

type LimitsByRole = StringDictionary[Limits]

type LogPublishingOptions = StringDictionary[LogPublishingOption]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INDEX_SLOW_LOGS
  - typings.awsSdk.awsSdkStrings.SEARCH_SLOW_LOGS
  - typings.awsSdk.awsSdkStrings.ES_APPLICATION_LOGS
  - typings.awsSdk.awsSdkStrings.AUDIT_LOGS
  - java.lang.String
*/
type LogType = _LogType | java.lang.String

type Long = scala.Double

type MaxResults = scala.Double

type MaximumInstanceCount = scala.Double

type Message = java.lang.String

type MinimumInstanceCount = scala.Double

type NextToken = java.lang.String

type NonEmptyString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.m3DotmediumDotsearch
  - typings.awsSdk.awsSdkStrings.m3DotlargeDotsearch
  - typings.awsSdk.awsSdkStrings.m3DotxlargeDotsearch
  - typings.awsSdk.awsSdkStrings.m3Dot2xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.m4DotlargeDotsearch
  - typings.awsSdk.awsSdkStrings.m4DotxlargeDotsearch
  - typings.awsSdk.awsSdkStrings.m4Dot2xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.m4Dot4xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.m4Dot10xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.m5DotlargeDotsearch
  - typings.awsSdk.awsSdkStrings.m5DotxlargeDotsearch
  - typings.awsSdk.awsSdkStrings.m5Dot2xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.m5Dot4xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.m5Dot12xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.m5Dot24xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r5DotlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r5DotxlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r5Dot2xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r5Dot4xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r5Dot12xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r5Dot24xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.c5DotlargeDotsearch
  - typings.awsSdk.awsSdkStrings.c5DotxlargeDotsearch
  - typings.awsSdk.awsSdkStrings.c5Dot2xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.c5Dot4xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.c5Dot9xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.c5Dot18xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.t3DotnanoDotsearch
  - typings.awsSdk.awsSdkStrings.t3DotmicroDotsearch
  - typings.awsSdk.awsSdkStrings.t3DotsmallDotsearch
  - typings.awsSdk.awsSdkStrings.t3DotmediumDotsearch
  - typings.awsSdk.awsSdkStrings.t3DotlargeDotsearch
  - typings.awsSdk.awsSdkStrings.t3DotxlargeDotsearch
  - typings.awsSdk.awsSdkStrings.t3Dot2xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.ultrawarm1DotmediumDotsearch
  - typings.awsSdk.awsSdkStrings.ultrawarm1DotlargeDotsearch
  - typings.awsSdk.awsSdkStrings.ultrawarm1DotxlargeDotsearch
  - typings.awsSdk.awsSdkStrings.t2DotmicroDotsearch
  - typings.awsSdk.awsSdkStrings.t2DotsmallDotsearch
  - typings.awsSdk.awsSdkStrings.t2DotmediumDotsearch
  - typings.awsSdk.awsSdkStrings.r3DotlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r3DotxlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r3Dot2xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r3Dot4xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r3Dot8xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.i2DotxlargeDotsearch
  - typings.awsSdk.awsSdkStrings.i2Dot2xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.d2DotxlargeDotsearch
  - typings.awsSdk.awsSdkStrings.d2Dot2xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.d2Dot4xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.d2Dot8xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.c4DotlargeDotsearch
  - typings.awsSdk.awsSdkStrings.c4DotxlargeDotsearch
  - typings.awsSdk.awsSdkStrings.c4Dot2xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.c4Dot4xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.c4Dot8xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r4DotlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r4DotxlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r4Dot2xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r4Dot4xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r4Dot8xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r4Dot16xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.i3DotlargeDotsearch
  - typings.awsSdk.awsSdkStrings.i3DotxlargeDotsearch
  - typings.awsSdk.awsSdkStrings.i3Dot2xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.i3Dot4xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.i3Dot8xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.i3Dot16xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r6gDotlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r6gDotxlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r6gDot2xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r6gDot4xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r6gDot8xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r6gDot12xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.m6gDotlargeDotsearch
  - typings.awsSdk.awsSdkStrings.m6gDotxlargeDotsearch
  - typings.awsSdk.awsSdkStrings.m6gDot2xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.m6gDot4xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.m6gDot8xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.m6gDot12xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.c6gDotlargeDotsearch
  - typings.awsSdk.awsSdkStrings.c6gDotxlargeDotsearch
  - typings.awsSdk.awsSdkStrings.c6gDot2xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.c6gDot4xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.c6gDot8xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.c6gDot12xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r6gdDotlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r6gdDotxlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r6gdDot2xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r6gdDot4xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r6gdDot8xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r6gdDot12xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.r6gdDot16xlargeDotsearch
  - typings.awsSdk.awsSdkStrings.t4gDotsmallDotsearch
  - typings.awsSdk.awsSdkStrings.t4gDotmediumDotsearch
  - java.lang.String
*/
type OpenSearchPartitionInstanceType = _OpenSearchPartitionInstanceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ultrawarm1DotmediumDotsearch
  - typings.awsSdk.awsSdkStrings.ultrawarm1DotlargeDotsearch
  - typings.awsSdk.awsSdkStrings.ultrawarm1DotxlargeDotsearch
  - java.lang.String
*/
type OpenSearchWarmPartitionInstanceType = _OpenSearchWarmPartitionInstanceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RequiresIndexDocuments
  - typings.awsSdk.awsSdkStrings.Processing_
  - typings.awsSdk.awsSdkStrings.Active_
  - java.lang.String
*/
type OptionState = _OptionState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VALIDATING
  - typings.awsSdk.awsSdkStrings.VALIDATION_FAILED
  - typings.awsSdk.awsSdkStrings.PENDING_ACCEPTANCE
  - typings.awsSdk.awsSdkStrings.APPROVED
  - typings.awsSdk.awsSdkStrings.PROVISIONING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.REJECTING
  - typings.awsSdk.awsSdkStrings.REJECTED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type OutboundConnectionStatusCode = _OutboundConnectionStatusCode | java.lang.String

type OutboundConnections = js.Array[OutboundConnection]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.PROCESSING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type OverallChangeStatus = _OverallChangeStatus | java.lang.String

type OwnerId = java.lang.String

type PackageDescription = java.lang.String

type PackageDetailsList = js.Array[PackageDetails]

type PackageID = java.lang.String

type PackageName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COPYING
  - typings.awsSdk.awsSdkStrings.COPY_FAILED
  - typings.awsSdk.awsSdkStrings.VALIDATING
  - typings.awsSdk.awsSdkStrings.VALIDATION_FAILED
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type PackageStatus = _PackageStatus | java.lang.String

type PackageType = `TXT-DICTIONARY` | java.lang.String

type PackageVersion = java.lang.String

type PackageVersionHistoryList = js.Array[PackageVersionHistory]

type Password = java.lang.String

type PolicyDocument = java.lang.String

type RecurringChargeList = js.Array[RecurringCharge]

type ReferencePath = java.lang.String

type Region = java.lang.String

type ReservationToken = java.lang.String

type ReservedInstanceList = js.Array[ReservedInstance]

type ReservedInstanceOfferingList = js.Array[ReservedInstanceOffering]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL_UPFRONT
  - typings.awsSdk.awsSdkStrings.PARTIAL_UPFRONT
  - typings.awsSdk.awsSdkStrings.NO_UPFRONT
  - java.lang.String
*/
type ReservedInstancePaymentOption = _ReservedInstancePaymentOption | java.lang.String

type RoleArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NO_ROLLBACK
  - typings.awsSdk.awsSdkStrings.DEFAULT_ROLLBACK
  - java.lang.String
*/
type RollbackOnDisable = _RollbackOnDisable | java.lang.String

type S3BucketName = java.lang.String

type S3Key = java.lang.String

type SAMLEntityId = java.lang.String

type SAMLMetadata = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.JVM_HEAP_SIZE_TUNING
  - typings.awsSdk.awsSdkStrings.JVM_YOUNG_GEN_TUNING
  - java.lang.String
*/
type ScheduledAutoTuneActionType = _ScheduledAutoTuneActionType | java.lang.String

type ScheduledAutoTuneDescription = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LOW
  - typings.awsSdk.awsSdkStrings.MEDIUM
  - typings.awsSdk.awsSdkStrings.HIGH
  - java.lang.String
*/
type ScheduledAutoTuneSeverityType = _ScheduledAutoTuneSeverityType | java.lang.String

type ServiceUrl = java.lang.String

type StartAt = js.Date

type StartTimestamp = js.Date

type StorageSubTypeName = java.lang.String

type StorageTypeLimitList = js.Array[StorageTypeLimit]

type StorageTypeList = js.Array[StorageType]

type StorageTypeName = java.lang.String

type String = java.lang.String

type StringList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`Policy-Min-TLS-1-0-2019-07`
  - typings.awsSdk.awsSdkStrings.`Policy-Min-TLS-1-2-2019-07`
  - java.lang.String
*/
type TLSSecurityPolicy = _TLSSecurityPolicy | java.lang.String

type TagKey = java.lang.String

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TimeUnit = HOURS | java.lang.String

type TotalNumberOfStages = scala.Double

type UIntValue = scala.Double

type UpdateTimestamp = js.Date

type UpgradeHistoryList = js.Array[UpgradeHistory]

type UpgradeName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.SUCCEEDED_WITH_ISSUES
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type UpgradeStatus = _UpgradeStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PRE_UPGRADE_CHECK
  - typings.awsSdk.awsSdkStrings.SNAPSHOT
  - typings.awsSdk.awsSdkStrings.UPGRADE
  - java.lang.String
*/
type UpgradeStep = _UpgradeStep | java.lang.String

type UpgradeStepsList = js.Array[UpgradeStepItem]

type UserPoolId = java.lang.String

type Username = java.lang.String

type ValueStringList = js.Array[NonEmptyString]

type VersionList = js.Array[VersionString]

type VersionString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.standard__
  - typings.awsSdk.awsSdkStrings.gp2_
  - typings.awsSdk.awsSdkStrings.io1_
  - typings.awsSdk.awsSdkStrings.gp3_
  - java.lang.String
*/
type VolumeType = _VolumeType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2021-01-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
