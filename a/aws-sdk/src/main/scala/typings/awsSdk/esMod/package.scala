package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = java.lang.String

type AdditionalLimitList = js.Array[typings.awsSdk.esMod.AdditionalLimit]

type AdvancedOptions = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.esMod.String]

type BackendRole = java.lang.String

type Boolean = scala.Boolean

type CloudWatchLogsLogGroupArn = java.lang.String

type CommitMessage = java.lang.String

type CompatibleElasticsearchVersionsList = js.Array[typings.awsSdk.esMod.CompatibleVersionsMap]

type ConnectionAlias = java.lang.String

type CreatedAt = typings.std.Date

type CrossClusterSearchConnectionId = java.lang.String

type CrossClusterSearchConnectionStatusMessage = java.lang.String

type DeploymentCloseDateTimeStamp = typings.std.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_UPDATE
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.NOT_ELIGIBLE
  - typings.awsSdk.awsSdkStrings.ELIGIBLE
  - java.lang.String
*/
type DeploymentStatus = typings.awsSdk.esMod._DeploymentStatus | java.lang.String

type DescribePackagesFilterList = js.Array[typings.awsSdk.esMod.DescribePackagesFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PackageID
  - typings.awsSdk.awsSdkStrings.PackageName
  - typings.awsSdk.awsSdkStrings.PackageStatus
  - java.lang.String
*/
type DescribePackagesFilterName = typings.awsSdk.esMod._DescribePackagesFilterName | java.lang.String

type DescribePackagesFilterValue = java.lang.String

type DescribePackagesFilterValues = js.Array[typings.awsSdk.esMod.DescribePackagesFilterValue]

type DomainId = java.lang.String

type DomainInfoList = js.Array[typings.awsSdk.esMod.DomainInfo]

type DomainName = java.lang.String

type DomainNameFqdn = java.lang.String

type DomainNameList = js.Array[typings.awsSdk.esMod.DomainName]

type DomainPackageDetailsList = js.Array[typings.awsSdk.esMod.DomainPackageDetails]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASSOCIATING
  - typings.awsSdk.awsSdkStrings.ASSOCIATION_FAILED
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DISSOCIATING
  - typings.awsSdk.awsSdkStrings.DISSOCIATION_FAILED
  - java.lang.String
*/
type DomainPackageStatus = typings.awsSdk.esMod._DomainPackageStatus | java.lang.String

type Double = scala.Double

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
type ESPartitionInstanceType = typings.awsSdk.esMod._ESPartitionInstanceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ultrawarm1DotmediumDotelasticsearch
  - typings.awsSdk.awsSdkStrings.ultrawarm1DotlargeDotelasticsearch
  - java.lang.String
*/
type ESWarmPartitionInstanceType = typings.awsSdk.esMod._ESWarmPartitionInstanceType | java.lang.String

type ElasticsearchDomainStatusList = js.Array[typings.awsSdk.esMod.ElasticsearchDomainStatus]

type ElasticsearchInstanceTypeList = js.Array[typings.awsSdk.esMod.ESPartitionInstanceType]

type ElasticsearchVersionList = js.Array[typings.awsSdk.esMod.ElasticsearchVersionString]

type ElasticsearchVersionString = java.lang.String

type EndpointsMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.esMod.ServiceUrl]

type ErrorMessage = java.lang.String

type ErrorType = java.lang.String

type FilterList = js.Array[typings.awsSdk.esMod.Filter]

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
type InboundCrossClusterSearchConnectionStatusCode = typings.awsSdk.esMod._InboundCrossClusterSearchConnectionStatusCode | java.lang.String

type InboundCrossClusterSearchConnections = js.Array[typings.awsSdk.esMod.InboundCrossClusterSearchConnection]

type InstanceCount = scala.Double

type InstanceRole = java.lang.String

type Integer = scala.Double

type IntegerClass = scala.Double

type Issue = java.lang.String

type Issues = js.Array[typings.awsSdk.esMod.Issue]

type KmsKeyId = java.lang.String

type LastUpdated = typings.std.Date

type LimitName = java.lang.String

type LimitValue = java.lang.String

type LimitValueList = js.Array[typings.awsSdk.esMod.LimitValue]

type LimitsByRole = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.esMod.Limits]

type LogPublishingOptions = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.esMod.LogPublishingOption]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INDEX_SLOW_LOGS
  - typings.awsSdk.awsSdkStrings.SEARCH_SLOW_LOGS
  - typings.awsSdk.awsSdkStrings.ES_APPLICATION_LOGS
  - typings.awsSdk.awsSdkStrings.AUDIT_LOGS
  - java.lang.String
*/
type LogType = typings.awsSdk.esMod._LogType | java.lang.String

type MaxResults = scala.Double

type MaximumInstanceCount = scala.Double

type MinimumInstanceCount = scala.Double

type NextToken = java.lang.String

type NonEmptyString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RequiresIndexDocuments
  - typings.awsSdk.awsSdkStrings.Processing_
  - typings.awsSdk.awsSdkStrings.Active_
  - java.lang.String
*/
type OptionState = typings.awsSdk.esMod._OptionState | java.lang.String

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
type OutboundCrossClusterSearchConnectionStatusCode = typings.awsSdk.esMod._OutboundCrossClusterSearchConnectionStatusCode | java.lang.String

type OutboundCrossClusterSearchConnections = js.Array[typings.awsSdk.esMod.OutboundCrossClusterSearchConnection]

type OwnerId = java.lang.String

type PackageDescription = java.lang.String

type PackageDetailsList = js.Array[typings.awsSdk.esMod.PackageDetails]

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
type PackageStatus = typings.awsSdk.esMod._PackageStatus | java.lang.String

type PackageType = typings.awsSdk.awsSdkStrings.`TXT-DICTIONARY` | java.lang.String

type PackageVersion = java.lang.String

type PackageVersionHistoryList = js.Array[typings.awsSdk.esMod.PackageVersionHistory]

type Password = java.lang.String

type PolicyDocument = java.lang.String

type RecurringChargeList = js.Array[typings.awsSdk.esMod.RecurringCharge]

type ReferencePath = java.lang.String

type Region = java.lang.String

type ReservationToken = java.lang.String

type ReservedElasticsearchInstanceList = js.Array[typings.awsSdk.esMod.ReservedElasticsearchInstance]

type ReservedElasticsearchInstanceOfferingList = js.Array[typings.awsSdk.esMod.ReservedElasticsearchInstanceOffering]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL_UPFRONT
  - typings.awsSdk.awsSdkStrings.PARTIAL_UPFRONT
  - typings.awsSdk.awsSdkStrings.NO_UPFRONT
  - java.lang.String
*/
type ReservedElasticsearchInstancePaymentOption = typings.awsSdk.esMod._ReservedElasticsearchInstancePaymentOption | java.lang.String

type RoleArn = java.lang.String

type S3BucketName = java.lang.String

type S3Key = java.lang.String

type SAMLEntityId = java.lang.String

type SAMLMetadata = java.lang.String

type ServiceUrl = java.lang.String

type StartTimestamp = typings.std.Date

type StorageSubTypeName = java.lang.String

type StorageTypeLimitList = js.Array[typings.awsSdk.esMod.StorageTypeLimit]

type StorageTypeList = js.Array[typings.awsSdk.esMod.StorageType]

type StorageTypeName = java.lang.String

type String = java.lang.String

type StringList = js.Array[typings.awsSdk.esMod.String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`Policy-Min-TLS-1-0-2019-07`
  - typings.awsSdk.awsSdkStrings.`Policy-Min-TLS-1-2-2019-07`
  - java.lang.String
*/
type TLSSecurityPolicy = typings.awsSdk.esMod._TLSSecurityPolicy | java.lang.String

type TagKey = java.lang.String

type TagList = js.Array[typings.awsSdk.esMod.Tag]

type TagValue = java.lang.String

type UIntValue = scala.Double

type UpdateTimestamp = typings.std.Date

type UpgradeHistoryList = js.Array[typings.awsSdk.esMod.UpgradeHistory]

type UpgradeName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.SUCCEEDED_WITH_ISSUES
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type UpgradeStatus = typings.awsSdk.esMod._UpgradeStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PRE_UPGRADE_CHECK
  - typings.awsSdk.awsSdkStrings.SNAPSHOT
  - typings.awsSdk.awsSdkStrings.UPGRADE
  - java.lang.String
*/
type UpgradeStep = typings.awsSdk.esMod._UpgradeStep | java.lang.String

type UpgradeStepsList = js.Array[typings.awsSdk.esMod.UpgradeStepItem]

type UserPoolId = java.lang.String

type Username = java.lang.String

type ValueStringList = js.Array[typings.awsSdk.esMod.NonEmptyString]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.standard__
  - typings.awsSdk.awsSdkStrings.gp2
  - typings.awsSdk.awsSdkStrings.io1
  - java.lang.String
*/
type VolumeType = typings.awsSdk.esMod._VolumeType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2015-01-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.esMod._apiVersion | java.lang.String
