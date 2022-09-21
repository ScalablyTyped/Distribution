package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.EQUALS
import typings.awsSdk.awsSdkStrings.USD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = java.lang.String

type AccountIdSet = js.Array[AccountId]

type AccountList = js.Array[Account]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CRITICAL
  - typings.awsSdk.awsSdkStrings.HIGH
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type AccountSortBy = _AccountSortBy | java.lang.String

type AccountStateList = js.Array[AccountState]

type AggCounts = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NETWORK_REACHABILITY
  - typings.awsSdk.awsSdkStrings.PACKAGE_VULNERABILITY
  - java.lang.String
*/
type AggregationFindingType = _AggregationFindingType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS_EC2_INSTANCE
  - typings.awsSdk.awsSdkStrings.AWS_ECR_CONTAINER_IMAGE
  - java.lang.String
*/
type AggregationResourceType = _AggregationResourceType | java.lang.String

type AggregationResponseList = js.Array[AggregationResponse]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FINDING_TYPE
  - typings.awsSdk.awsSdkStrings.PACKAGE
  - typings.awsSdk.awsSdkStrings.TITLE
  - typings.awsSdk.awsSdkStrings.REPOSITORY
  - typings.awsSdk.awsSdkStrings.AMI
  - typings.awsSdk.awsSdkStrings.AWS_EC2_INSTANCE
  - typings.awsSdk.awsSdkStrings.AWS_ECR_CONTAINER
  - typings.awsSdk.awsSdkStrings.IMAGE_LAYER
  - typings.awsSdk.awsSdkStrings.ACCOUNT
  - java.lang.String
*/
type AggregationType = _AggregationType | java.lang.String

type AmiId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CRITICAL
  - typings.awsSdk.awsSdkStrings.HIGH
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.AFFECTED_INSTANCES
  - java.lang.String
*/
type AmiSortBy = _AmiSortBy | java.lang.String

type Arn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CRITICAL
  - typings.awsSdk.awsSdkStrings.HIGH
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type AwsEcrContainerSortBy = _AwsEcrContainerSortBy | java.lang.String

type BatchGetFreeTrialInfoRequestAccountIdsList = js.Array[MeteringAccountId]

type Boolean = scala.Boolean

type ClientToken = java.lang.String

type Component = java.lang.String

type ComponentType = java.lang.String

type CountsList = js.Array[Counts]

type CoverageMapComparison = EQUALS | java.lang.String

type CoverageMapFilterList = js.Array[CoverageMapFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS_EC2_INSTANCE
  - typings.awsSdk.awsSdkStrings.AWS_ECR_CONTAINER_IMAGE
  - typings.awsSdk.awsSdkStrings.AWS_ECR_REPOSITORY
  - java.lang.String
*/
type CoverageResourceType = _CoverageResourceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EQUALS
  - typings.awsSdk.awsSdkStrings.NOT_EQUALS
  - java.lang.String
*/
type CoverageStringComparison = _CoverageStringComparison | java.lang.String

type CoverageStringFilterList = js.Array[CoverageStringFilter]

type CoverageStringInput = java.lang.String

type CoveredResources = js.Array[CoveredResource]

type Currency = USD | java.lang.String

type CvssScoreAdjustmentList = js.Array[CvssScoreAdjustment]

type CvssScoreList = js.Array[CvssScore]

type DateFilterList = js.Array[DateFilter]

type DateTimeTimestamp = js.Date

type DelegatedAdminAccountList = js.Array[DelegatedAdminAccount]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLE_IN_PROGRESS
  - java.lang.String
*/
type DelegatedAdminStatus = _DelegatedAdminStatus | java.lang.String

type DisableResourceTypeList = js.Array[ResourceScanType]

type Double = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NETWORK_FINDINGS
  - typings.awsSdk.awsSdkStrings.CRITICAL
  - typings.awsSdk.awsSdkStrings.HIGH
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type Ec2InstanceSortBy = _Ec2InstanceSortBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WINDOWS
  - typings.awsSdk.awsSdkStrings.LINUX
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type Ec2Platform = _Ec2Platform | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LIFETIME
  - typings.awsSdk.awsSdkStrings.DAYS_30
  - typings.awsSdk.awsSdkStrings.DAYS_180
  - java.lang.String
*/
type EcrRescanDuration = _EcrRescanDuration | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type EcrRescanDurationStatus = _EcrRescanDurationStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MANUAL
  - typings.awsSdk.awsSdkStrings.SCAN_ON_PUSH
  - typings.awsSdk.awsSdkStrings.CONTINUOUS_SCAN
  - java.lang.String
*/
type EcrScanFrequency = _EcrScanFrequency | java.lang.String

type EnableResourceTypeList = js.Array[ResourceScanType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALREADY_ENABLED
  - typings.awsSdk.awsSdkStrings.ENABLE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DISABLE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUSPEND_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.RESOURCE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typings.awsSdk.awsSdkStrings.SSM_UNAVAILABLE
  - typings.awsSdk.awsSdkStrings.SSM_THROTTLED
  - typings.awsSdk.awsSdkStrings.EVENTBRIDGE_UNAVAILABLE
  - typings.awsSdk.awsSdkStrings.EVENTBRIDGE_THROTTLED
  - typings.awsSdk.awsSdkStrings.RESOURCE_SCAN_NOT_DISABLED
  - typings.awsSdk.awsSdkStrings.DISASSOCIATE_ALL_MEMBERS
  - typings.awsSdk.awsSdkStrings.ACCOUNT_IS_ISOLATED
  - java.lang.String
*/
type ErrorCode = _ErrorCode | java.lang.String

type ErrorMessage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ExternalReportStatus = _ExternalReportStatus | java.lang.String

type FailedAccountList = js.Array[FailedAccount]

type FilePath = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.SUPPRESS
  - java.lang.String
*/
type FilterAction = _FilterAction | java.lang.String

type FilterArn = java.lang.String

type FilterArnList = js.Array[FilterArn]

type FilterDescription = java.lang.String

type FilterList = js.Array[Filter]

type FilterName = java.lang.String

type FilterReason = java.lang.String

type FindingArn = java.lang.String

type FindingDescription = java.lang.String

type FindingList = js.Array[Finding]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.SUPPRESSED
  - typings.awsSdk.awsSdkStrings.CLOSED
  - java.lang.String
*/
type FindingStatus = _FindingStatus | java.lang.String

type FindingTitle = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NETWORK_REACHABILITY
  - typings.awsSdk.awsSdkStrings.PACKAGE_VULNERABILITY
  - java.lang.String
*/
type FindingType = _FindingType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CRITICAL
  - typings.awsSdk.awsSdkStrings.HIGH
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type FindingTypeSortBy = _FindingTypeSortBy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.YES
  - typings.awsSdk.awsSdkStrings.NO
  - typings.awsSdk.awsSdkStrings.PARTIAL
  - java.lang.String
*/
type FixAvailable = _FixAvailable | java.lang.String

type FreeTrialAccountInfoList = js.Array[FreeTrialAccountInfo]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - java.lang.String
*/
type FreeTrialInfoErrorCode = _FreeTrialInfoErrorCode | java.lang.String

type FreeTrialInfoErrorList = js.Array[FreeTrialInfoError]

type FreeTrialInfoList = js.Array[FreeTrialInfo]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type FreeTrialStatus = _FreeTrialStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EC2
  - typings.awsSdk.awsSdkStrings.ECR
  - java.lang.String
*/
type FreeTrialType = _FreeTrialType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SCAN_STATUS_CODE
  - typings.awsSdk.awsSdkStrings.SCAN_STATUS_REASON
  - typings.awsSdk.awsSdkStrings.ACCOUNT_ID
  - typings.awsSdk.awsSdkStrings.RESOURCE_TYPE
  - typings.awsSdk.awsSdkStrings.ECR_REPOSITORY_NAME
  - java.lang.String
*/
type GroupKey = _GroupKey | java.lang.String

type ImageHash = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CRITICAL
  - typings.awsSdk.awsSdkStrings.HIGH
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type ImageLayerSortBy = _ImageLayerSortBy | java.lang.String

type ImageTagList = js.Array[NonEmptyString]

type IpV4Address = java.lang.String

type IpV4AddressList = js.Array[IpV4Address]

type IpV6Address = java.lang.String

type IpV6AddressList = js.Array[IpV6Address]

type ListAccountPermissionsMaxResults = scala.Double

type ListCoverageMaxResults = scala.Double

type ListDelegatedAdminMaxResults = scala.Double

type ListFilterMaxResults = scala.Double

type ListFindingAggregationsMaxResults = scala.Double

type ListFindingsMaxResults = scala.Double

type ListMembersMaxResults = scala.Double

type ListUsageTotalsMaxResults = scala.Double

type ListUsageTotalsNextToken = java.lang.String

type Long = scala.Double

type MapComparison = EQUALS | java.lang.String

type MapFilterList = js.Array[MapFilter]

type MapKey = java.lang.String

type MapValue = java.lang.String

type MemberList = js.Array[Member]

type MeteringAccountId = java.lang.String

type MonthlyCostEstimate = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TCP
  - typings.awsSdk.awsSdkStrings.UDP
  - java.lang.String
*/
type NetworkProtocol = _NetworkProtocol | java.lang.String

type NextToken = java.lang.String

type NonEmptyString = java.lang.String

type NonEmptyStringList = js.Array[NonEmptyString]

type NumberFilterList = js.Array[NumberFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLE_SCANNING
  - typings.awsSdk.awsSdkStrings.DISABLE_SCANNING
  - typings.awsSdk.awsSdkStrings.ENABLE_REPOSITORY
  - typings.awsSdk.awsSdkStrings.DISABLE_REPOSITORY
  - java.lang.String
*/
type Operation = _Operation | java.lang.String

type OwnerId = java.lang.String

type PackageArchitecture = java.lang.String

type PackageEpoch = scala.Double

type PackageFilterList = js.Array[PackageFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BUNDLER
  - typings.awsSdk.awsSdkStrings.CARGO
  - typings.awsSdk.awsSdkStrings.COMPOSER
  - typings.awsSdk.awsSdkStrings.NPM
  - typings.awsSdk.awsSdkStrings.NUGET
  - typings.awsSdk.awsSdkStrings.PIPENV
  - typings.awsSdk.awsSdkStrings.POETRY
  - typings.awsSdk.awsSdkStrings.YARN
  - typings.awsSdk.awsSdkStrings.GOBINARY
  - typings.awsSdk.awsSdkStrings.GOMOD
  - typings.awsSdk.awsSdkStrings.JAR
  - typings.awsSdk.awsSdkStrings.OS
  - typings.awsSdk.awsSdkStrings.PIP
  - typings.awsSdk.awsSdkStrings.PYTHONPKG
  - typings.awsSdk.awsSdkStrings.NODEPKG
  - typings.awsSdk.awsSdkStrings.POM
  - java.lang.String
*/
type PackageManager = _PackageManager | java.lang.String

type PackageName = java.lang.String

type PackageRelease = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CRITICAL
  - typings.awsSdk.awsSdkStrings.HIGH
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type PackageSortBy = _PackageSortBy | java.lang.String

type PackageVersion = java.lang.String

type Permissions = js.Array[Permission]

type Platform = java.lang.String

type Port = scala.Double

type PortRangeFilterList = js.Array[PortRangeFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.INVITED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.REMOVED
  - typings.awsSdk.awsSdkStrings.RESIGNED
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.EMAIL_VERIFICATION_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.EMAIL_VERIFICATION_FAILED
  - typings.awsSdk.awsSdkStrings.REGION_DISABLED
  - typings.awsSdk.awsSdkStrings.ACCOUNT_SUSPENDED
  - typings.awsSdk.awsSdkStrings.CANNOT_CREATE_DETECTOR_IN_ORG_MASTER
  - java.lang.String
*/
type RelationshipStatus = _RelationshipStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CSV
  - typings.awsSdk.awsSdkStrings.JSON
  - java.lang.String
*/
type ReportFormat = _ReportFormat | java.lang.String

type ReportId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typings.awsSdk.awsSdkStrings.INVALID_PERMISSIONS
  - typings.awsSdk.awsSdkStrings.NO_FINDINGS_FOUND
  - typings.awsSdk.awsSdkStrings.BUCKET_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.INCOMPATIBLE_BUCKET_REGION
  - typings.awsSdk.awsSdkStrings.MALFORMED_KMS_KEY
  - java.lang.String
*/
type ReportingErrorCode = _ReportingErrorCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CRITICAL
  - typings.awsSdk.awsSdkStrings.HIGH
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.AFFECTED_IMAGES
  - java.lang.String
*/
type RepositorySortBy = _RepositorySortBy | java.lang.String

type ResourceId = java.lang.String

type ResourceList = js.Array[Resource]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EC2
  - typings.awsSdk.awsSdkStrings.ECR
  - java.lang.String
*/
type ResourceScanType = _ResourceScanType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS_EC2_INSTANCE
  - typings.awsSdk.awsSdkStrings.AWS_ECR_CONTAINER_IMAGE
  - typings.awsSdk.awsSdkStrings.AWS_ECR_REPOSITORY
  - java.lang.String
*/
type ResourceType = _ResourceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type ScanStatusCode = _ScanStatusCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_INITIAL_SCAN
  - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typings.awsSdk.awsSdkStrings.UNMANAGED_EC2_INSTANCE
  - typings.awsSdk.awsSdkStrings.UNSUPPORTED_OS
  - typings.awsSdk.awsSdkStrings.SCAN_ELIGIBILITY_EXPIRED
  - typings.awsSdk.awsSdkStrings.RESOURCE_TERMINATED
  - typings.awsSdk.awsSdkStrings.SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.NO_RESOURCES_FOUND
  - typings.awsSdk.awsSdkStrings.IMAGE_SIZE_EXCEEDED
  - typings.awsSdk.awsSdkStrings.SCAN_FREQUENCY_MANUAL
  - typings.awsSdk.awsSdkStrings.SCAN_FREQUENCY_SCAN_ON_PUSH
  - typings.awsSdk.awsSdkStrings.EC2_INSTANCE_STOPPED
  - typings.awsSdk.awsSdkStrings.PENDING_DISABLE
  - typings.awsSdk.awsSdkStrings.NO_INVENTORY
  - typings.awsSdk.awsSdkStrings.STALE_INVENTORY
  - java.lang.String
*/
type ScanStatusReason = _ScanStatusReason | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NETWORK
  - typings.awsSdk.awsSdkStrings.PACKAGE
  - java.lang.String
*/
type ScanType = _ScanType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EC2
  - typings.awsSdk.awsSdkStrings.ECR
  - java.lang.String
*/
type Service = _Service | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INFORMATIONAL
  - typings.awsSdk.awsSdkStrings.LOW
  - typings.awsSdk.awsSdkStrings.MEDIUM
  - typings.awsSdk.awsSdkStrings.HIGH
  - typings.awsSdk.awsSdkStrings.CRITICAL
  - typings.awsSdk.awsSdkStrings.UNTRIAGED
  - java.lang.String
*/
type Severity = _Severity | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS_ACCOUNT_ID
  - typings.awsSdk.awsSdkStrings.FINDING_TYPE
  - typings.awsSdk.awsSdkStrings.SEVERITY
  - typings.awsSdk.awsSdkStrings.FIRST_OBSERVED_AT
  - typings.awsSdk.awsSdkStrings.LAST_OBSERVED_AT
  - typings.awsSdk.awsSdkStrings.FINDING_STATUS
  - typings.awsSdk.awsSdkStrings.RESOURCE_TYPE
  - typings.awsSdk.awsSdkStrings.ECR_IMAGE_PUSHED_AT
  - typings.awsSdk.awsSdkStrings.ECR_IMAGE_REPOSITORY_NAME
  - typings.awsSdk.awsSdkStrings.ECR_IMAGE_REGISTRY
  - typings.awsSdk.awsSdkStrings.NETWORK_PROTOCOL
  - typings.awsSdk.awsSdkStrings.COMPONENT_TYPE
  - typings.awsSdk.awsSdkStrings.VULNERABILITY_ID
  - typings.awsSdk.awsSdkStrings.VULNERABILITY_SOURCE
  - typings.awsSdk.awsSdkStrings.INSPECTOR_SCORE
  - typings.awsSdk.awsSdkStrings.VENDOR_SEVERITY
  - java.lang.String
*/
type SortField = _SortField | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASC
  - typings.awsSdk.awsSdkStrings.DESC
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

type SourceLayerHash = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLING
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLING
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.SUSPENDING
  - typings.awsSdk.awsSdkStrings.SUSPENDED
  - java.lang.String
*/
type Status = _Status | java.lang.String

type StepList = js.Array[Step]

type String = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EQUALS
  - typings.awsSdk.awsSdkStrings.PREFIX
  - typings.awsSdk.awsSdkStrings.NOT_EQUALS
  - java.lang.String
*/
type StringComparison = _StringComparison | java.lang.String

type StringFilterList = js.Array[StringFilter]

type StringInput = java.lang.String

type StringList = js.Array[NonEmptyString]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[String]

type TagMap = StringDictionary[MapValue]

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CRITICAL
  - typings.awsSdk.awsSdkStrings.HIGH
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type TitleSortBy = _TitleSortBy | java.lang.String

type UsageAccountId = java.lang.String

type UsageAccountIdList = js.Array[UsageAccountId]

type UsageList = js.Array[Usage]

type UsageTotalList = js.Array[UsageTotal]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EC2_INSTANCE_HOURS
  - typings.awsSdk.awsSdkStrings.ECR_INITIAL_SCAN
  - typings.awsSdk.awsSdkStrings.ECR_RESCAN
  - java.lang.String
*/
type UsageType = _UsageType | java.lang.String

type UsageValue = scala.Double

type VulnerabilityId = java.lang.String

type VulnerabilityIdList = js.Array[VulnerabilityId]

type VulnerablePackageList = js.Array[VulnerablePackage]

type VulnerablePackageRemediation = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-06-08`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
