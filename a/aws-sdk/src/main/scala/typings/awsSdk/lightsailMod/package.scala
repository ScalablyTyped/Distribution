package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.AutoSnapshot
import typings.awsSdk.awsSdkStrings.Email_
import typings.awsSdk.awsSdkStrings.mysql__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.inbound__
  - typings.awsSdk.awsSdkStrings.outbound__
  - java.lang.String
*/
type AccessDirection = _AccessDirection | String

type AccessKeyList = js.Array[AccessKey]

type AccessReceiverList = js.Array[ResourceReceivingAccess]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.public__
  - typings.awsSdk.awsSdkStrings.private__
  - java.lang.String
*/
type AccessType = _AccessType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InSync_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.NeverSynced
  - typings.awsSdk.awsSdkStrings.Defaulted
  - java.lang.String
*/
type AccountLevelBpaSyncStatus = _AccountLevelBpaSyncStatus | String

type AddOnList = js.Array[AddOn]

type AddOnRequestList = js.Array[AddOnRequest]

type AddOnType = AutoSnapshot | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OK
  - typings.awsSdk.awsSdkStrings.ALARM
  - typings.awsSdk.awsSdkStrings.INSUFFICIENT_DATA
  - java.lang.String
*/
type AlarmState = _AlarmState | String

type AlarmsList = js.Array[Alarm]

type AttachedDiskList = js.Array[AttachedDisk]

type AttachedDiskMap = StringDictionary[DiskMapList]

type AutoSnapshotDate = String

type AutoSnapshotDetailsList = js.Array[AutoSnapshotDetails]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Success_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.NotFound
  - java.lang.String
*/
type AutoSnapshotStatus = _AutoSnapshotStatus | String

type AvailabilityZoneList = js.Array[AvailabilityZone]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEFAULTED_FOR_SLR_MISSING
  - typings.awsSdk.awsSdkStrings.SYNC_ON_HOLD
  - typings.awsSdk.awsSdkStrings.DEFAULTED_FOR_SLR_MISSING_ON_HOLD
  - typings.awsSdk.awsSdkStrings.Unknown_
  - java.lang.String
*/
type BPAStatusMessage = _BPAStatusMessage | String

type Base64 = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`dont-cache`
  - typings.awsSdk.awsSdkStrings.cache_
  - java.lang.String
*/
type BehaviorEnum = _BehaviorEnum | String

type BlueprintList = js.Array[Blueprint]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.os_
  - typings.awsSdk.awsSdkStrings.app_
  - java.lang.String
*/
type BlueprintType = _BlueprintType | String

type BucketAccessLogPrefix = String

type BucketBundleList = js.Array[BucketBundle]

type BucketList = js.Array[Bucket]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BucketSizeBytes
  - typings.awsSdk.awsSdkStrings.NumberOfObjects
  - java.lang.String
*/
type BucketMetricName = _BucketMetricName | String

type BucketName = String

type BundleList = js.Array[Bundle]

type CacheBehaviorList = js.Array[CacheBehaviorPerPath]

type CertificateName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_VALIDATION
  - typings.awsSdk.awsSdkStrings.ISSUED
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - typings.awsSdk.awsSdkStrings.EXPIRED
  - typings.awsSdk.awsSdkStrings.VALIDATION_TIMED_OUT
  - typings.awsSdk.awsSdkStrings.REVOKED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type CertificateStatus = _CertificateStatus | String

type CertificateStatusList = js.Array[CertificateStatus]

type CertificateSummaryList = js.Array[CertificateSummary]

type CloudFormationStackRecordList = js.Array[CloudFormationStackRecord]

type CloudFormationStackRecordSourceInfoList = js.Array[CloudFormationStackRecordSourceInfo]

type CloudFormationStackRecordSourceType = typings.awsSdk.awsSdkStrings.ExportSnapshotRecord | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GreaterThanOrEqualToThreshold
  - typings.awsSdk.awsSdkStrings.GreaterThanThreshold
  - typings.awsSdk.awsSdkStrings.LessThanThreshold
  - typings.awsSdk.awsSdkStrings.LessThanOrEqualToThreshold
  - java.lang.String
*/
type ComparisonOperator = _ComparisonOperator | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PendingVerification
  - typings.awsSdk.awsSdkStrings.Valid_
  - typings.awsSdk.awsSdkStrings.Invalid_
  - java.lang.String
*/
type ContactMethodStatus = _ContactMethodStatus | String

type ContactMethodVerificationProtocol = Email_ | String

type ContactMethodsList = js.Array[ContactMethod]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Email_
  - typings.awsSdk.awsSdkStrings.SMS
  - java.lang.String
*/
type ContactProtocol = _ContactProtocol | String

type ContactProtocolsList = js.Array[ContactProtocol]

type ContainerImageList = js.Array[ContainerImage]

type ContainerLabel = String

type ContainerMap = StringDictionary[Container]

type ContainerName = String

type ContainerServiceDeploymentList = js.Array[ContainerServiceDeployment]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ContainerServiceDeploymentState = _ContainerServiceDeploymentState | String

type ContainerServiceList = js.Array[ContainerService]

type ContainerServiceLogEventList = js.Array[ContainerServiceLogEvent]

type ContainerServiceMetadataEntry = StringDictionary[String]

type ContainerServiceMetadataEntryList = js.Array[ContainerServiceMetadataEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CPUUtilization
  - typings.awsSdk.awsSdkStrings.MemoryUtilization
  - java.lang.String
*/
type ContainerServiceMetricName = _ContainerServiceMetricName | String

type ContainerServiceName = String

type ContainerServicePowerList = js.Array[ContainerServicePower]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.nano
  - typings.awsSdk.awsSdkStrings.micro
  - typings.awsSdk.awsSdkStrings.small__
  - typings.awsSdk.awsSdkStrings.medium__
  - typings.awsSdk.awsSdkStrings.large__
  - typings.awsSdk.awsSdkStrings.xlarge_
  - java.lang.String
*/
type ContainerServicePowerName = _ContainerServicePowerName | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HTTP
  - typings.awsSdk.awsSdkStrings.HTTPS
  - typings.awsSdk.awsSdkStrings.TCP
  - typings.awsSdk.awsSdkStrings.UDP
  - java.lang.String
*/
type ContainerServiceProtocol = _ContainerServiceProtocol | String

type ContainerServicePublicDomains = StringDictionary[ContainerServicePublicDomainsList]

type ContainerServicePublicDomainsList = js.Array[String]

type ContainerServiceScale = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.DEPLOYING
  - java.lang.String
*/
type ContainerServiceState = _ContainerServiceState | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING_SYSTEM_RESOURCES
  - typings.awsSdk.awsSdkStrings.CREATING_NETWORK_INFRASTRUCTURE
  - typings.awsSdk.awsSdkStrings.PROVISIONING_CERTIFICATE
  - typings.awsSdk.awsSdkStrings.PROVISIONING_SERVICE
  - typings.awsSdk.awsSdkStrings.CREATING_DEPLOYMENT
  - typings.awsSdk.awsSdkStrings.EVALUATING_HEALTH_CHECK
  - typings.awsSdk.awsSdkStrings.ACTIVATING_DEPLOYMENT
  - typings.awsSdk.awsSdkStrings.CERTIFICATE_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.UNKNOWN_ERROR
  - java.lang.String
*/
type ContainerServiceStateDetailCode = _ContainerServiceStateDetailCode | String

type DiskInfoList = js.Array[DiskInfo]

type DiskList = js.Array[Disk]

type DiskMapList = js.Array[DiskMap]

type DiskSnapshotList = js.Array[DiskSnapshot]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.completed__
  - typings.awsSdk.awsSdkStrings.error__
  - typings.awsSdk.awsSdkStrings.unknown__
  - java.lang.String
*/
type DiskSnapshotState = _DiskSnapshotState | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.error__
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.`in-use`
  - typings.awsSdk.awsSdkStrings.unknown__
  - java.lang.String
*/
type DiskState = _DiskState | String

type DistributionBundleList = js.Array[DistributionBundle]

type DistributionList = js.Array[LightsailDistribution]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Requests_
  - typings.awsSdk.awsSdkStrings.BytesDownloaded
  - typings.awsSdk.awsSdkStrings.BytesUploaded
  - typings.awsSdk.awsSdkStrings.TotalErrorRate
  - typings.awsSdk.awsSdkStrings.Http4xxErrorRate
  - typings.awsSdk.awsSdkStrings.Http5xxErrorRate
  - java.lang.String
*/
type DistributionMetricName = _DistributionMetricName | String

type DomainEntryList = js.Array[DomainEntry]

type DomainEntryOptions = StringDictionary[String]

type DomainEntryOptionsKeys = String

type DomainEntryType = String

type DomainList = js.Array[Domain]

type DomainName = String

type DomainNameList = js.Array[DomainName]

type DomainValidationRecordList = js.Array[DomainValidationRecord]

type EligibleToRenew = String

type Environment = StringDictionary[String]

type ExportSnapshotRecordList = js.Array[ExportSnapshotRecord]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InstanceSnapshot
  - typings.awsSdk.awsSdkStrings.DiskSnapshot
  - java.lang.String
*/
type ExportSnapshotRecordSourceType = _ExportSnapshotRecordSourceType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.none__
  - typings.awsSdk.awsSdkStrings.`allow-list`
  - typings.awsSdk.awsSdkStrings.all__
  - java.lang.String
*/
type ForwardValues = _ForwardValues | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Accept_
  - typings.awsSdk.awsSdkStrings.`Accept-Charset`
  - typings.awsSdk.awsSdkStrings.`Accept-Datetime`
  - typings.awsSdk.awsSdkStrings.`Accept-Encoding`
  - typings.awsSdk.awsSdkStrings.`Accept-Language`
  - typings.awsSdk.awsSdkStrings.Authorization
  - typings.awsSdk.awsSdkStrings.`CloudFront-Forwarded-Proto`
  - typings.awsSdk.awsSdkStrings.`CloudFront-Is-Desktop-Viewer`
  - typings.awsSdk.awsSdkStrings.`CloudFront-Is-Mobile-Viewer`
  - typings.awsSdk.awsSdkStrings.`CloudFront-Is-SmartTV-Viewer`
  - typings.awsSdk.awsSdkStrings.`CloudFront-Is-Tablet-Viewer`
  - typings.awsSdk.awsSdkStrings.`CloudFront-Viewer-Country`
  - typings.awsSdk.awsSdkStrings.Host_
  - typings.awsSdk.awsSdkStrings.Origin_
  - typings.awsSdk.awsSdkStrings.Referer
  - java.lang.String
*/
type HeaderEnum = _HeaderEnum | String

type HeaderForwardList = js.Array[HeaderEnum]

type HostKeysList = js.Array[HostKeyAttributes]

type IAMAccessKeyId = String

type InUseResourceCount = Double

type IncludeCertificateDetails = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ssh_
  - typings.awsSdk.awsSdkStrings.rdp
  - java.lang.String
*/
type InstanceAccessProtocol = _InstanceAccessProtocol | String

type InstanceEntryList = js.Array[InstanceEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LbDotRegistrationInProgress
  - typings.awsSdk.awsSdkStrings.LbDotInitialHealthChecking
  - typings.awsSdk.awsSdkStrings.LbDotInternalError
  - typings.awsSdk.awsSdkStrings.InstanceDotResponseCodeMismatch
  - typings.awsSdk.awsSdkStrings.InstanceDotTimeout
  - typings.awsSdk.awsSdkStrings.InstanceDotFailedHealthChecks
  - typings.awsSdk.awsSdkStrings.InstanceDotNotRegistered
  - typings.awsSdk.awsSdkStrings.InstanceDotNotInUse
  - typings.awsSdk.awsSdkStrings.InstanceDotDeregistrationInProgress
  - typings.awsSdk.awsSdkStrings.InstanceDotInvalidState
  - typings.awsSdk.awsSdkStrings.InstanceDotIpUnusable
  - java.lang.String
*/
type InstanceHealthReason = _InstanceHealthReason | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.initial__
  - typings.awsSdk.awsSdkStrings.healthy__
  - typings.awsSdk.awsSdkStrings.unhealthy__
  - typings.awsSdk.awsSdkStrings.unused
  - typings.awsSdk.awsSdkStrings.draining_
  - typings.awsSdk.awsSdkStrings.unavailable__
  - java.lang.String
*/
type InstanceHealthState = _InstanceHealthState | String

type InstanceHealthSummaryList = js.Array[InstanceHealthSummary]

type InstanceList = js.Array[Instance]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CPUUtilization
  - typings.awsSdk.awsSdkStrings.NetworkIn
  - typings.awsSdk.awsSdkStrings.NetworkOut
  - typings.awsSdk.awsSdkStrings.StatusCheckFailed
  - typings.awsSdk.awsSdkStrings.StatusCheckFailed_Instance
  - typings.awsSdk.awsSdkStrings.StatusCheckFailed_System
  - typings.awsSdk.awsSdkStrings.BurstCapacityTime
  - typings.awsSdk.awsSdkStrings.BurstCapacityPercentage
  - java.lang.String
*/
type InstanceMetricName = _InstanceMetricName | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LINUX_UNIX
  - typings.awsSdk.awsSdkStrings.WINDOWS
  - java.lang.String
*/
type InstancePlatform = _InstancePlatform | String

type InstancePlatformList = js.Array[InstancePlatform]

type InstancePortInfoList = js.Array[InstancePortInfo]

type InstancePortStateList = js.Array[InstancePortState]

type InstanceSnapshotList = js.Array[InstanceSnapshot]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.error__
  - typings.awsSdk.awsSdkStrings.available__
  - java.lang.String
*/
type InstanceSnapshotState = _InstanceSnapshotState | String

type IpAddress = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.dualstack
  - typings.awsSdk.awsSdkStrings.ipv4__
  - java.lang.String
*/
type IpAddressType = _IpAddressType | String

type Ipv6Address = String

type Ipv6AddressList = js.Array[Ipv6Address]

type IsoDate = js.Date

type IssuerCA = String

type KeyAlgorithm = String

type KeyPairList = js.Array[KeyPair]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HealthCheckPath
  - typings.awsSdk.awsSdkStrings.SessionStickinessEnabled
  - typings.awsSdk.awsSdkStrings.SessionStickiness_LB_CookieDurationSeconds
  - typings.awsSdk.awsSdkStrings.HttpsRedirectionEnabled
  - typings.awsSdk.awsSdkStrings.TlsPolicyName
  - java.lang.String
*/
type LoadBalancerAttributeName = _LoadBalancerAttributeName | String

type LoadBalancerConfigurationOptions = StringDictionary[String]

type LoadBalancerList = js.Array[LoadBalancer]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ClientTLSNegotiationErrorCount
  - typings.awsSdk.awsSdkStrings.HealthyHostCount
  - typings.awsSdk.awsSdkStrings.UnhealthyHostCount
  - typings.awsSdk.awsSdkStrings.HTTPCode_LB_4XX_Count
  - typings.awsSdk.awsSdkStrings.HTTPCode_LB_5XX_Count
  - typings.awsSdk.awsSdkStrings.HTTPCode_Instance_2XX_Count
  - typings.awsSdk.awsSdkStrings.HTTPCode_Instance_3XX_Count
  - typings.awsSdk.awsSdkStrings.HTTPCode_Instance_4XX_Count
  - typings.awsSdk.awsSdkStrings.HTTPCode_Instance_5XX_Count
  - typings.awsSdk.awsSdkStrings.InstanceResponseTime
  - typings.awsSdk.awsSdkStrings.RejectedConnectionCount
  - typings.awsSdk.awsSdkStrings.RequestCount
  - java.lang.String
*/
type LoadBalancerMetricName = _LoadBalancerMetricName | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HTTP_HTTPS
  - typings.awsSdk.awsSdkStrings.HTTP
  - java.lang.String
*/
type LoadBalancerProtocol = _LoadBalancerProtocol | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.provisioning_
  - typings.awsSdk.awsSdkStrings.active_impaired
  - typings.awsSdk.awsSdkStrings.failed__
  - typings.awsSdk.awsSdkStrings.unknown__
  - java.lang.String
*/
type LoadBalancerState = _LoadBalancerState | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_VALIDATION
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - java.lang.String
*/
type LoadBalancerTlsCertificateDomainStatus = _LoadBalancerTlsCertificateDomainStatus | String

type LoadBalancerTlsCertificateDomainValidationOptionList = js.Array[LoadBalancerTlsCertificateDomainValidationOption]

type LoadBalancerTlsCertificateDomainValidationRecordList = js.Array[LoadBalancerTlsCertificateDomainValidationRecord]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NO_AVAILABLE_CONTACTS
  - typings.awsSdk.awsSdkStrings.ADDITIONAL_VERIFICATION_REQUIRED
  - typings.awsSdk.awsSdkStrings.DOMAIN_NOT_ALLOWED
  - typings.awsSdk.awsSdkStrings.INVALID_PUBLIC_DOMAIN
  - typings.awsSdk.awsSdkStrings.OTHER
  - java.lang.String
*/
type LoadBalancerTlsCertificateFailureReason = _LoadBalancerTlsCertificateFailureReason | String

type LoadBalancerTlsCertificateList = js.Array[LoadBalancerTlsCertificate]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_AUTO_RENEWAL
  - typings.awsSdk.awsSdkStrings.PENDING_VALIDATION
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type LoadBalancerTlsCertificateRenewalStatus = _LoadBalancerTlsCertificateRenewalStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNSPECIFIED
  - typings.awsSdk.awsSdkStrings.KEY_COMPROMISE
  - typings.awsSdk.awsSdkStrings.CA_COMPROMISE
  - typings.awsSdk.awsSdkStrings.AFFILIATION_CHANGED
  - typings.awsSdk.awsSdkStrings.SUPERCEDED
  - typings.awsSdk.awsSdkStrings.CESSATION_OF_OPERATION
  - typings.awsSdk.awsSdkStrings.CERTIFICATE_HOLD
  - typings.awsSdk.awsSdkStrings.REMOVE_FROM_CRL
  - typings.awsSdk.awsSdkStrings.PRIVILEGE_WITHDRAWN
  - typings.awsSdk.awsSdkStrings.A_A_COMPROMISE
  - java.lang.String
*/
type LoadBalancerTlsCertificateRevocationReason = _LoadBalancerTlsCertificateRevocationReason | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_VALIDATION
  - typings.awsSdk.awsSdkStrings.ISSUED
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - typings.awsSdk.awsSdkStrings.EXPIRED
  - typings.awsSdk.awsSdkStrings.VALIDATION_TIMED_OUT
  - typings.awsSdk.awsSdkStrings.REVOKED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type LoadBalancerTlsCertificateStatus = _LoadBalancerTlsCertificateStatus | String

type LoadBalancerTlsCertificateSummaryList = js.Array[LoadBalancerTlsCertificateSummary]

type LoadBalancerTlsPolicyList = js.Array[LoadBalancerTlsPolicy]

type LogEventList = js.Array[LogEvent]

type MetricDatapointList = js.Array[MetricDatapoint]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CPUUtilization
  - typings.awsSdk.awsSdkStrings.NetworkIn
  - typings.awsSdk.awsSdkStrings.NetworkOut
  - typings.awsSdk.awsSdkStrings.StatusCheckFailed
  - typings.awsSdk.awsSdkStrings.StatusCheckFailed_Instance
  - typings.awsSdk.awsSdkStrings.StatusCheckFailed_System
  - typings.awsSdk.awsSdkStrings.ClientTLSNegotiationErrorCount
  - typings.awsSdk.awsSdkStrings.HealthyHostCount
  - typings.awsSdk.awsSdkStrings.UnhealthyHostCount
  - typings.awsSdk.awsSdkStrings.HTTPCode_LB_4XX_Count
  - typings.awsSdk.awsSdkStrings.HTTPCode_LB_5XX_Count
  - typings.awsSdk.awsSdkStrings.HTTPCode_Instance_2XX_Count
  - typings.awsSdk.awsSdkStrings.HTTPCode_Instance_3XX_Count
  - typings.awsSdk.awsSdkStrings.HTTPCode_Instance_4XX_Count
  - typings.awsSdk.awsSdkStrings.HTTPCode_Instance_5XX_Count
  - typings.awsSdk.awsSdkStrings.InstanceResponseTime
  - typings.awsSdk.awsSdkStrings.RejectedConnectionCount
  - typings.awsSdk.awsSdkStrings.RequestCount
  - typings.awsSdk.awsSdkStrings.DatabaseConnections
  - typings.awsSdk.awsSdkStrings.DiskQueueDepth
  - typings.awsSdk.awsSdkStrings.FreeStorageSpace
  - typings.awsSdk.awsSdkStrings.NetworkReceiveThroughput
  - typings.awsSdk.awsSdkStrings.NetworkTransmitThroughput
  - typings.awsSdk.awsSdkStrings.BurstCapacityTime
  - typings.awsSdk.awsSdkStrings.BurstCapacityPercentage
  - java.lang.String
*/
type MetricName = _MetricName | String

type MetricPeriod = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Minimum_
  - typings.awsSdk.awsSdkStrings.Maximum_
  - typings.awsSdk.awsSdkStrings.Sum_
  - typings.awsSdk.awsSdkStrings.Average_
  - typings.awsSdk.awsSdkStrings.SampleCount
  - java.lang.String
*/
type MetricStatistic = _MetricStatistic | String

type MetricStatisticList = js.Array[MetricStatistic]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Seconds_
  - typings.awsSdk.awsSdkStrings.Microseconds_
  - typings.awsSdk.awsSdkStrings.Milliseconds_
  - typings.awsSdk.awsSdkStrings.Bytes_
  - typings.awsSdk.awsSdkStrings.Kilobytes
  - typings.awsSdk.awsSdkStrings.Megabytes
  - typings.awsSdk.awsSdkStrings.Gigabytes
  - typings.awsSdk.awsSdkStrings.Terabytes_
  - typings.awsSdk.awsSdkStrings.Bits_
  - typings.awsSdk.awsSdkStrings.Kilobits
  - typings.awsSdk.awsSdkStrings.Megabits
  - typings.awsSdk.awsSdkStrings.Gigabits
  - typings.awsSdk.awsSdkStrings.Terabits
  - typings.awsSdk.awsSdkStrings.Percent_
  - typings.awsSdk.awsSdkStrings.Count_
  - typings.awsSdk.awsSdkStrings.BytesSlashSecond
  - typings.awsSdk.awsSdkStrings.KilobytesSlashSecond
  - typings.awsSdk.awsSdkStrings.MegabytesSlashSecond
  - typings.awsSdk.awsSdkStrings.GigabytesSlashSecond
  - typings.awsSdk.awsSdkStrings.TerabytesSlashSecond
  - typings.awsSdk.awsSdkStrings.BitsSlashSecond
  - typings.awsSdk.awsSdkStrings.KilobitsSlashSecond
  - typings.awsSdk.awsSdkStrings.MegabitsSlashSecond
  - typings.awsSdk.awsSdkStrings.GigabitsSlashSecond
  - typings.awsSdk.awsSdkStrings.TerabitsSlashSecond
  - typings.awsSdk.awsSdkStrings.CountSlashSecond
  - typings.awsSdk.awsSdkStrings.None_
  - java.lang.String
*/
type MetricUnit = _MetricUnit | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.tcp_
  - typings.awsSdk.awsSdkStrings.all__
  - typings.awsSdk.awsSdkStrings.udp_
  - typings.awsSdk.awsSdkStrings.icmp_
  - java.lang.String
*/
type NetworkProtocol = _NetworkProtocol | String

type NonEmptyString = String

type NotificationTriggerList = js.Array[AlarmState]

type OperationList = js.Array[Operation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NotStarted
  - typings.awsSdk.awsSdkStrings.Started_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Completed_
  - typings.awsSdk.awsSdkStrings.Succeeded_
  - java.lang.String
*/
type OperationStatus = _OperationStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DeleteKnownHostKeys
  - typings.awsSdk.awsSdkStrings.DeleteInstance
  - typings.awsSdk.awsSdkStrings.CreateInstance
  - typings.awsSdk.awsSdkStrings.StopInstance
  - typings.awsSdk.awsSdkStrings.StartInstance
  - typings.awsSdk.awsSdkStrings.RebootInstance
  - typings.awsSdk.awsSdkStrings.OpenInstancePublicPorts
  - typings.awsSdk.awsSdkStrings.PutInstancePublicPorts
  - typings.awsSdk.awsSdkStrings.CloseInstancePublicPorts
  - typings.awsSdk.awsSdkStrings.AllocateStaticIp
  - typings.awsSdk.awsSdkStrings.ReleaseStaticIp
  - typings.awsSdk.awsSdkStrings.AttachStaticIp
  - typings.awsSdk.awsSdkStrings.DetachStaticIp
  - typings.awsSdk.awsSdkStrings.UpdateDomainEntry
  - typings.awsSdk.awsSdkStrings.DeleteDomainEntry
  - typings.awsSdk.awsSdkStrings.CreateDomain
  - typings.awsSdk.awsSdkStrings.DeleteDomain
  - typings.awsSdk.awsSdkStrings.CreateInstanceSnapshot
  - typings.awsSdk.awsSdkStrings.DeleteInstanceSnapshot
  - typings.awsSdk.awsSdkStrings.CreateInstancesFromSnapshot
  - typings.awsSdk.awsSdkStrings.CreateLoadBalancer
  - typings.awsSdk.awsSdkStrings.DeleteLoadBalancer
  - typings.awsSdk.awsSdkStrings.AttachInstancesToLoadBalancer
  - typings.awsSdk.awsSdkStrings.DetachInstancesFromLoadBalancer
  - typings.awsSdk.awsSdkStrings.UpdateLoadBalancerAttribute
  - typings.awsSdk.awsSdkStrings.CreateLoadBalancerTlsCertificate
  - typings.awsSdk.awsSdkStrings.DeleteLoadBalancerTlsCertificate
  - typings.awsSdk.awsSdkStrings.AttachLoadBalancerTlsCertificate
  - typings.awsSdk.awsSdkStrings.CreateDisk
  - typings.awsSdk.awsSdkStrings.DeleteDisk
  - typings.awsSdk.awsSdkStrings.AttachDisk
  - typings.awsSdk.awsSdkStrings.DetachDisk
  - typings.awsSdk.awsSdkStrings.CreateDiskSnapshot
  - typings.awsSdk.awsSdkStrings.DeleteDiskSnapshot
  - typings.awsSdk.awsSdkStrings.CreateDiskFromSnapshot
  - typings.awsSdk.awsSdkStrings.CreateRelationalDatabase
  - typings.awsSdk.awsSdkStrings.UpdateRelationalDatabase
  - typings.awsSdk.awsSdkStrings.DeleteRelationalDatabase
  - typings.awsSdk.awsSdkStrings.CreateRelationalDatabaseFromSnapshot
  - typings.awsSdk.awsSdkStrings.CreateRelationalDatabaseSnapshot
  - typings.awsSdk.awsSdkStrings.DeleteRelationalDatabaseSnapshot
  - typings.awsSdk.awsSdkStrings.UpdateRelationalDatabaseParameters
  - typings.awsSdk.awsSdkStrings.StartRelationalDatabase
  - typings.awsSdk.awsSdkStrings.RebootRelationalDatabase
  - typings.awsSdk.awsSdkStrings.StopRelationalDatabase
  - typings.awsSdk.awsSdkStrings.EnableAddOn
  - typings.awsSdk.awsSdkStrings.DisableAddOn
  - typings.awsSdk.awsSdkStrings.PutAlarm
  - typings.awsSdk.awsSdkStrings.GetAlarms
  - typings.awsSdk.awsSdkStrings.DeleteAlarm
  - typings.awsSdk.awsSdkStrings.TestAlarm
  - typings.awsSdk.awsSdkStrings.CreateContactMethod
  - typings.awsSdk.awsSdkStrings.GetContactMethods
  - typings.awsSdk.awsSdkStrings.SendContactMethodVerification
  - typings.awsSdk.awsSdkStrings.DeleteContactMethod
  - typings.awsSdk.awsSdkStrings.CreateDistribution
  - typings.awsSdk.awsSdkStrings.UpdateDistribution
  - typings.awsSdk.awsSdkStrings.DeleteDistribution
  - typings.awsSdk.awsSdkStrings.ResetDistributionCache
  - typings.awsSdk.awsSdkStrings.AttachCertificateToDistribution
  - typings.awsSdk.awsSdkStrings.DetachCertificateFromDistribution
  - typings.awsSdk.awsSdkStrings.UpdateDistributionBundle
  - typings.awsSdk.awsSdkStrings.SetIpAddressType
  - typings.awsSdk.awsSdkStrings.CreateCertificate
  - typings.awsSdk.awsSdkStrings.DeleteCertificate
  - typings.awsSdk.awsSdkStrings.CreateContainerService
  - typings.awsSdk.awsSdkStrings.UpdateContainerService
  - typings.awsSdk.awsSdkStrings.DeleteContainerService
  - typings.awsSdk.awsSdkStrings.CreateContainerServiceDeployment
  - typings.awsSdk.awsSdkStrings.CreateContainerServiceRegistryLogin
  - typings.awsSdk.awsSdkStrings.RegisterContainerImage
  - typings.awsSdk.awsSdkStrings.DeleteContainerImage
  - typings.awsSdk.awsSdkStrings.CreateBucket
  - typings.awsSdk.awsSdkStrings.DeleteBucket
  - typings.awsSdk.awsSdkStrings.CreateBucketAccessKey
  - typings.awsSdk.awsSdkStrings.DeleteBucketAccessKey
  - typings.awsSdk.awsSdkStrings.UpdateBucketBundle
  - typings.awsSdk.awsSdkStrings.UpdateBucket
  - typings.awsSdk.awsSdkStrings.SetResourceAccessForBucket
  - java.lang.String
*/
type OperationType = _OperationType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`http-only`
  - typings.awsSdk.awsSdkStrings.`https-only`
  - java.lang.String
*/
type OriginProtocolPolicyEnum = _OriginProtocolPolicyEnum | String

type PartnerIdList = js.Array[NonEmptyString]

type PendingMaintenanceActionList = js.Array[PendingMaintenanceAction]

type Port = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Public_
  - typings.awsSdk.awsSdkStrings.Private_
  - java.lang.String
*/
type PortAccessType = _PortAccessType | String

type PortInfoList = js.Array[PortInfo]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEFAULT
  - typings.awsSdk.awsSdkStrings.INSTANCE
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.CLOSED
  - java.lang.String
*/
type PortInfoSourceType = _PortInfoSourceType | String

type PortList = js.Array[Port]

type PortMap = StringDictionary[ContainerServiceProtocol]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.open__
  - typings.awsSdk.awsSdkStrings.closed__
  - java.lang.String
*/
type PortState = _PortState | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Started_
  - typings.awsSdk.awsSdkStrings.Succeeded_
  - typings.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type RecordState = _RecordState | String

type RegionList = js.Array[Region]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`us-east-1`
  - typings.awsSdk.awsSdkStrings.`us-east-2`
  - typings.awsSdk.awsSdkStrings.`us-west-1`
  - typings.awsSdk.awsSdkStrings.`us-west-2`
  - typings.awsSdk.awsSdkStrings.`eu-west-1`
  - typings.awsSdk.awsSdkStrings.`eu-west-2`
  - typings.awsSdk.awsSdkStrings.`eu-west-3`
  - typings.awsSdk.awsSdkStrings.`eu-central-1`
  - typings.awsSdk.awsSdkStrings.`ca-central-1`
  - typings.awsSdk.awsSdkStrings.`ap-south-1`
  - typings.awsSdk.awsSdkStrings.`ap-southeast-1`
  - typings.awsSdk.awsSdkStrings.`ap-southeast-2`
  - typings.awsSdk.awsSdkStrings.`ap-northeast-1`
  - typings.awsSdk.awsSdkStrings.`ap-northeast-2`
  - typings.awsSdk.awsSdkStrings.`eu-north-1`
  - java.lang.String
*/
type RegionName = _RegionName | String

type RelationalDatabaseBlueprintList = js.Array[RelationalDatabaseBlueprint]

type RelationalDatabaseBundleList = js.Array[RelationalDatabaseBundle]

type RelationalDatabaseEngine = mysql__ | String

type RelationalDatabaseEventList = js.Array[RelationalDatabaseEvent]

type RelationalDatabaseList = js.Array[RelationalDatabase]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CPUUtilization
  - typings.awsSdk.awsSdkStrings.DatabaseConnections
  - typings.awsSdk.awsSdkStrings.DiskQueueDepth
  - typings.awsSdk.awsSdkStrings.FreeStorageSpace
  - typings.awsSdk.awsSdkStrings.NetworkReceiveThroughput
  - typings.awsSdk.awsSdkStrings.NetworkTransmitThroughput
  - java.lang.String
*/
type RelationalDatabaseMetricName = _RelationalDatabaseMetricName | String

type RelationalDatabaseParameterList = js.Array[RelationalDatabaseParameter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CURRENT
  - typings.awsSdk.awsSdkStrings.PREVIOUS
  - typings.awsSdk.awsSdkStrings.PENDING
  - java.lang.String
*/
type RelationalDatabasePasswordVersion = _RelationalDatabasePasswordVersion | String

type RelationalDatabaseSnapshotList = js.Array[RelationalDatabaseSnapshot]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PendingAutoRenewal
  - typings.awsSdk.awsSdkStrings.PendingValidation
  - typings.awsSdk.awsSdkStrings.Success_
  - typings.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type RenewalStatus = _RenewalStatus | String

type RenewalStatusReason = String

type RequestFailureReason = String

type ResourceArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.allow__
  - typings.awsSdk.awsSdkStrings.deny__
  - java.lang.String
*/
type ResourceBucketAccess = _ResourceBucketAccess | String

type ResourceName = String

type ResourceNameList = js.Array[ResourceName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ContainerService
  - typings.awsSdk.awsSdkStrings.Instance_
  - typings.awsSdk.awsSdkStrings.StaticIp
  - typings.awsSdk.awsSdkStrings.KeyPair
  - typings.awsSdk.awsSdkStrings.InstanceSnapshot
  - typings.awsSdk.awsSdkStrings.Domain_
  - typings.awsSdk.awsSdkStrings.PeeredVpc
  - typings.awsSdk.awsSdkStrings.LoadBalancer_
  - typings.awsSdk.awsSdkStrings.LoadBalancerTlsCertificate
  - typings.awsSdk.awsSdkStrings.Disk
  - typings.awsSdk.awsSdkStrings.DiskSnapshot
  - typings.awsSdk.awsSdkStrings.RelationalDatabase
  - typings.awsSdk.awsSdkStrings.RelationalDatabaseSnapshot
  - typings.awsSdk.awsSdkStrings.ExportSnapshotRecord
  - typings.awsSdk.awsSdkStrings.CloudFormationStackRecord
  - typings.awsSdk.awsSdkStrings.Alarm_
  - typings.awsSdk.awsSdkStrings.ContactMethod
  - typings.awsSdk.awsSdkStrings.Distribution
  - typings.awsSdk.awsSdkStrings.Certificate_
  - typings.awsSdk.awsSdkStrings.Bucket
  - java.lang.String
*/
type ResourceType = _ResourceType | String

type RevocationReason = String

type SensitiveString = String

type SerialNumber = String

type StaticIpList = js.Array[StaticIp]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Active_
  - typings.awsSdk.awsSdkStrings.Inactive_
  - java.lang.String
*/
type StatusType = _StatusType | String

type StringList = js.Array[String]

type StringMax256 = String

type SubjectAlternativeNameList = js.Array[DomainName]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TimeOfDay = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.breaching
  - typings.awsSdk.awsSdkStrings.notBreaching
  - typings.awsSdk.awsSdkStrings.ignore__
  - typings.awsSdk.awsSdkStrings.missing_
  - java.lang.String
*/
type TreatMissingData = _TreatMissingData | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2016-11-28`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type double = Double

type float = Double

type integer = Double

type long = Double

type timestamp = js.Date
