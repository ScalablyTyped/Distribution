package typings.awsSdk.esMod

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

type CompatibleElasticsearchVersionsList = js.Array[CompatibleVersionsMap]

type ConnectionAlias = java.lang.String

type CreatedAt = js.Date

type CrossClusterSearchConnectionId = java.lang.String

type CrossClusterSearchConnectionStatusMessage = java.lang.String

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

type Double = scala.Double

type DryRun = scala.Boolean

type DurationValue = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.m3DotmediumDotelasticsearch
  - typings.awsSdk.awsSdkStrings.m3DotlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.m3DotxlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.m3Dot2xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.m4DotlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.m4DotxlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.m4Dot2xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.m4Dot4xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.m4Dot10xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.m5DotlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.m5DotxlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.m5Dot2xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.m5Dot4xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.m5Dot12xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.r5DotlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.r5DotxlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.r5Dot2xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.r5Dot4xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.r5Dot12xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.c5DotlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.c5DotxlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.c5Dot2xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.c5Dot4xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.c5Dot9xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.c5Dot18xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.ultrawarm1DotmediumDotelasticsearch
  - typings.awsSdk.awsSdkStrings.ultrawarm1DotlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.t2DotmicroDotelasticsearch
  - typings.awsSdk.awsSdkStrings.t2DotsmallDotelasticsearch
  - typings.awsSdk.awsSdkStrings.t2DotmediumDotelasticsearch
  - typings.awsSdk.awsSdkStrings.r3DotlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.r3DotxlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.r3Dot2xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.r3Dot4xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.r3Dot8xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.i2DotxlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.i2Dot2xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.d2DotxlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.d2Dot2xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.d2Dot4xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.d2Dot8xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.c4DotlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.c4DotxlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.c4Dot2xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.c4Dot4xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.c4Dot8xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.r4DotlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.r4DotxlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.r4Dot2xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.r4Dot4xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.r4Dot8xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.r4Dot16xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.i3DotlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.i3DotxlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.i3Dot2xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.i3Dot4xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.i3Dot8xlargeDotelasticsearch
  - typings.awsSdk.awsSdkStrings.i3Dot16xlargeDotelasticsearch
  - java.lang.String
*/
type ESPartitionInstanceType = _ESPartitionInstanceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ultrawarm1DotmediumDotelasticsearch
  - typings.awsSdk.awsSdkStrings.ultrawarm1DotlargeDotelasticsearch
  - java.lang.String
*/
type ESWarmPartitionInstanceType = _ESWarmPartitionInstanceType | java.lang.String

type ElasticsearchDomainStatusList = js.Array[ElasticsearchDomainStatus]

type ElasticsearchInstanceTypeList = js.Array[ESPartitionInstanceType]

type ElasticsearchVersionList = js.Array[ElasticsearchVersionString]

type ElasticsearchVersionString = java.lang.String

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
  - typings.awsSdk.awsSdkStrings.REJECTING
  - typings.awsSdk.awsSdkStrings.REJECTED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type InboundCrossClusterSearchConnectionStatusCode = _InboundCrossClusterSearchConnectionStatusCode | java.lang.String

type InboundCrossClusterSearchConnections = js.Array[InboundCrossClusterSearchConnection]

type InstanceCount = scala.Double

type InstanceRole = java.lang.String

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

type MaxResults = scala.Double

type MaximumInstanceCount = scala.Double

type Message = java.lang.String

type MinimumInstanceCount = scala.Double

type NextToken = java.lang.String

type NonEmptyString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RequiresIndexDocuments
  - typings.awsSdk.awsSdkStrings.Processing_
  - typings.awsSdk.awsSdkStrings.Active_
  - java.lang.String
*/
type OptionState = _OptionState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_ACCEPTANCE
  - typings.awsSdk.awsSdkStrings.VALIDATING
  - typings.awsSdk.awsSdkStrings.VALIDATION_FAILED
  - typings.awsSdk.awsSdkStrings.PROVISIONING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.REJECTED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type OutboundCrossClusterSearchConnectionStatusCode = _OutboundCrossClusterSearchConnectionStatusCode | java.lang.String

type OutboundCrossClusterSearchConnections = js.Array[OutboundCrossClusterSearchConnection]

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

type ReservedElasticsearchInstanceList = js.Array[ReservedElasticsearchInstance]

type ReservedElasticsearchInstanceOfferingList = js.Array[ReservedElasticsearchInstanceOffering]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL_UPFRONT
  - typings.awsSdk.awsSdkStrings.PARTIAL_UPFRONT
  - typings.awsSdk.awsSdkStrings.NO_UPFRONT
  - java.lang.String
*/
type ReservedElasticsearchInstancePaymentOption = _ReservedElasticsearchInstancePaymentOption | java.lang.String

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

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.standard__
  - typings.awsSdk.awsSdkStrings.gp2_
  - typings.awsSdk.awsSdkStrings.io1_
  - typings.awsSdk.awsSdkStrings.gp3_
  - java.lang.String
*/
type VolumeType = _VolumeType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2015-01-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
