package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lightsailMod {
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.inbound__
    - typings.awsSdk.awsSdkStrings.outbound__
    - java.lang.String
  */
  type AccessDirection = typings.awsSdk.lightsailMod._AccessDirection | java.lang.String
  type AddOnList = js.Array[typings.awsSdk.lightsailMod.AddOn]
  type AddOnRequestList = js.Array[typings.awsSdk.lightsailMod.AddOnRequest]
  type AddOnType = typings.awsSdk.awsSdkStrings.AutoSnapshot | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OK
    - typings.awsSdk.awsSdkStrings.ALARM
    - typings.awsSdk.awsSdkStrings.INSUFFICIENT_DATA
    - java.lang.String
  */
  type AlarmState = typings.awsSdk.lightsailMod._AlarmState | java.lang.String
  type AlarmsList = js.Array[typings.awsSdk.lightsailMod.Alarm]
  type AttachedDiskList = js.Array[typings.awsSdk.lightsailMod.AttachedDisk]
  type AttachedDiskMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.lightsailMod.DiskMapList]
  type AutoSnapshotDate = java.lang.String
  type AutoSnapshotDetailsList = js.Array[typings.awsSdk.lightsailMod.AutoSnapshotDetails]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Success_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.NotFound
    - java.lang.String
  */
  type AutoSnapshotStatus = typings.awsSdk.lightsailMod._AutoSnapshotStatus | java.lang.String
  type AvailabilityZoneList = js.Array[typings.awsSdk.lightsailMod.AvailabilityZone]
  type Base64 = java.lang.String
  type BlueprintList = js.Array[typings.awsSdk.lightsailMod.Blueprint]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.os_
    - typings.awsSdk.awsSdkStrings.app
    - java.lang.String
  */
  type BlueprintType = typings.awsSdk.lightsailMod._BlueprintType | java.lang.String
  type BundleList = js.Array[typings.awsSdk.lightsailMod.Bundle]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.lightsailMod.ClientApiVersions
  type CloudFormationStackRecordList = js.Array[typings.awsSdk.lightsailMod.CloudFormationStackRecord]
  type CloudFormationStackRecordSourceInfoList = js.Array[typings.awsSdk.lightsailMod.CloudFormationStackRecordSourceInfo]
  type CloudFormationStackRecordSourceType = typings.awsSdk.awsSdkStrings.ExportSnapshotRecord | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GreaterThanOrEqualToThreshold
    - typings.awsSdk.awsSdkStrings.GreaterThanThreshold
    - typings.awsSdk.awsSdkStrings.LessThanThreshold
    - typings.awsSdk.awsSdkStrings.LessThanOrEqualToThreshold
    - java.lang.String
  */
  type ComparisonOperator = typings.awsSdk.lightsailMod._ComparisonOperator | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PendingVerification
    - typings.awsSdk.awsSdkStrings.Valid_
    - typings.awsSdk.awsSdkStrings.Invalid_
    - java.lang.String
  */
  type ContactMethodStatus = typings.awsSdk.lightsailMod._ContactMethodStatus | java.lang.String
  type ContactMethodVerificationProtocol = typings.awsSdk.awsSdkStrings.Email_ | java.lang.String
  type ContactMethodsList = js.Array[typings.awsSdk.lightsailMod.ContactMethod]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Email_
    - typings.awsSdk.awsSdkStrings.SMS
    - java.lang.String
  */
  type ContactProtocol = typings.awsSdk.lightsailMod._ContactProtocol | java.lang.String
  type ContactProtocolsList = js.Array[typings.awsSdk.lightsailMod.ContactProtocol]
  type DiskInfoList = js.Array[typings.awsSdk.lightsailMod.DiskInfo]
  type DiskList = js.Array[typings.awsSdk.lightsailMod.Disk]
  type DiskMapList = js.Array[typings.awsSdk.lightsailMod.DiskMap]
  type DiskSnapshotList = js.Array[typings.awsSdk.lightsailMod.DiskSnapshot]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.completed__
    - typings.awsSdk.awsSdkStrings.error__
    - typings.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type DiskSnapshotState = typings.awsSdk.lightsailMod._DiskSnapshotState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.error__
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.`in-use`
    - typings.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type DiskState = typings.awsSdk.lightsailMod._DiskState | java.lang.String
  type DomainEntryList = js.Array[typings.awsSdk.lightsailMod.DomainEntry]
  type DomainEntryOptions = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type DomainEntryOptionsKeys = java.lang.String
  type DomainEntryType = java.lang.String
  type DomainList = js.Array[typings.awsSdk.lightsailMod.Domain]
  type DomainName = java.lang.String
  type DomainNameList = js.Array[typings.awsSdk.lightsailMod.DomainName]
  type ExportSnapshotRecordList = js.Array[typings.awsSdk.lightsailMod.ExportSnapshotRecord]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InstanceSnapshot
    - typings.awsSdk.awsSdkStrings.DiskSnapshot
    - java.lang.String
  */
  type ExportSnapshotRecordSourceType = typings.awsSdk.lightsailMod._ExportSnapshotRecordSourceType | java.lang.String
  type HostKeysList = js.Array[typings.awsSdk.lightsailMod.HostKeyAttributes]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ssh_
    - typings.awsSdk.awsSdkStrings.rdp
    - java.lang.String
  */
  type InstanceAccessProtocol = typings.awsSdk.lightsailMod._InstanceAccessProtocol | java.lang.String
  type InstanceEntryList = js.Array[typings.awsSdk.lightsailMod.InstanceEntry]
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
  type InstanceHealthReason = typings.awsSdk.lightsailMod._InstanceHealthReason | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.initial_
    - typings.awsSdk.awsSdkStrings.healthy__
    - typings.awsSdk.awsSdkStrings.unhealthy__
    - typings.awsSdk.awsSdkStrings.unused
    - typings.awsSdk.awsSdkStrings.draining_
    - typings.awsSdk.awsSdkStrings.unavailable__
    - java.lang.String
  */
  type InstanceHealthState = typings.awsSdk.lightsailMod._InstanceHealthState | java.lang.String
  type InstanceHealthSummaryList = js.Array[typings.awsSdk.lightsailMod.InstanceHealthSummary]
  type InstanceList = js.Array[typings.awsSdk.lightsailMod.Instance]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CPUUtilization
    - typings.awsSdk.awsSdkStrings.NetworkIn
    - typings.awsSdk.awsSdkStrings.NetworkOut
    - typings.awsSdk.awsSdkStrings.StatusCheckFailed
    - typings.awsSdk.awsSdkStrings.StatusCheckFailed_Instance
    - typings.awsSdk.awsSdkStrings.StatusCheckFailed_System
    - java.lang.String
  */
  type InstanceMetricName = typings.awsSdk.lightsailMod._InstanceMetricName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.LINUX_UNIX
    - typings.awsSdk.awsSdkStrings.WINDOWS
    - java.lang.String
  */
  type InstancePlatform = typings.awsSdk.lightsailMod._InstancePlatform | java.lang.String
  type InstancePlatformList = js.Array[typings.awsSdk.lightsailMod.InstancePlatform]
  type InstancePortInfoList = js.Array[typings.awsSdk.lightsailMod.InstancePortInfo]
  type InstancePortStateList = js.Array[typings.awsSdk.lightsailMod.InstancePortState]
  type InstanceSnapshotList = js.Array[typings.awsSdk.lightsailMod.InstanceSnapshot]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.pending__
    - typings.awsSdk.awsSdkStrings.error__
    - typings.awsSdk.awsSdkStrings.available__
    - java.lang.String
  */
  type InstanceSnapshotState = typings.awsSdk.lightsailMod._InstanceSnapshotState | java.lang.String
  type IpAddress = java.lang.String
  type IpV6Address = java.lang.String
  type IsoDate = typings.std.Date
  type KeyPairList = js.Array[typings.awsSdk.lightsailMod.KeyPair]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.HealthCheckPath
    - typings.awsSdk.awsSdkStrings.SessionStickinessEnabled
    - typings.awsSdk.awsSdkStrings.SessionStickiness_LB_CookieDurationSeconds
    - java.lang.String
  */
  type LoadBalancerAttributeName = typings.awsSdk.lightsailMod._LoadBalancerAttributeName | java.lang.String
  type LoadBalancerConfigurationOptions = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type LoadBalancerList = js.Array[typings.awsSdk.lightsailMod.LoadBalancer]
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
  type LoadBalancerMetricName = typings.awsSdk.lightsailMod._LoadBalancerMetricName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.HTTP_HTTPS
    - typings.awsSdk.awsSdkStrings.HTTP
    - java.lang.String
  */
  type LoadBalancerProtocol = typings.awsSdk.lightsailMod._LoadBalancerProtocol | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.active__
    - typings.awsSdk.awsSdkStrings.provisioning_
    - typings.awsSdk.awsSdkStrings.active_impaired
    - typings.awsSdk.awsSdkStrings.failed__
    - typings.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type LoadBalancerState = typings.awsSdk.lightsailMod._LoadBalancerState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING_VALIDATION
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.SUCCESS
    - java.lang.String
  */
  type LoadBalancerTlsCertificateDomainStatus = typings.awsSdk.lightsailMod._LoadBalancerTlsCertificateDomainStatus | java.lang.String
  type LoadBalancerTlsCertificateDomainValidationOptionList = js.Array[typings.awsSdk.lightsailMod.LoadBalancerTlsCertificateDomainValidationOption]
  type LoadBalancerTlsCertificateDomainValidationRecordList = js.Array[typings.awsSdk.lightsailMod.LoadBalancerTlsCertificateDomainValidationRecord]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NO_AVAILABLE_CONTACTS
    - typings.awsSdk.awsSdkStrings.ADDITIONAL_VERIFICATION_REQUIRED
    - typings.awsSdk.awsSdkStrings.DOMAIN_NOT_ALLOWED
    - typings.awsSdk.awsSdkStrings.INVALID_PUBLIC_DOMAIN
    - typings.awsSdk.awsSdkStrings.OTHER
    - java.lang.String
  */
  type LoadBalancerTlsCertificateFailureReason = typings.awsSdk.lightsailMod._LoadBalancerTlsCertificateFailureReason | java.lang.String
  type LoadBalancerTlsCertificateList = js.Array[typings.awsSdk.lightsailMod.LoadBalancerTlsCertificate]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING_AUTO_RENEWAL
    - typings.awsSdk.awsSdkStrings.PENDING_VALIDATION
    - typings.awsSdk.awsSdkStrings.SUCCESS
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type LoadBalancerTlsCertificateRenewalStatus = typings.awsSdk.lightsailMod._LoadBalancerTlsCertificateRenewalStatus | java.lang.String
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
  type LoadBalancerTlsCertificateRevocationReason = typings.awsSdk.lightsailMod._LoadBalancerTlsCertificateRevocationReason | java.lang.String
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
  type LoadBalancerTlsCertificateStatus = typings.awsSdk.lightsailMod._LoadBalancerTlsCertificateStatus | java.lang.String
  type LoadBalancerTlsCertificateSummaryList = js.Array[typings.awsSdk.lightsailMod.LoadBalancerTlsCertificateSummary]
  type LogEventList = js.Array[typings.awsSdk.lightsailMod.LogEvent]
  type MetricDatapointList = js.Array[typings.awsSdk.lightsailMod.MetricDatapoint]
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
    - java.lang.String
  */
  type MetricName = typings.awsSdk.lightsailMod._MetricName | java.lang.String
  type MetricPeriod = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Minimum_
    - typings.awsSdk.awsSdkStrings.Maximum_
    - typings.awsSdk.awsSdkStrings.Sum_
    - typings.awsSdk.awsSdkStrings.Average_
    - typings.awsSdk.awsSdkStrings.SampleCount
    - java.lang.String
  */
  type MetricStatistic = typings.awsSdk.lightsailMod._MetricStatistic | java.lang.String
  type MetricStatisticList = js.Array[typings.awsSdk.lightsailMod.MetricStatistic]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Seconds_
    - typings.awsSdk.awsSdkStrings.Microseconds
    - typings.awsSdk.awsSdkStrings.Milliseconds_
    - typings.awsSdk.awsSdkStrings.Bytes_
    - typings.awsSdk.awsSdkStrings.Kilobytes
    - typings.awsSdk.awsSdkStrings.Megabytes
    - typings.awsSdk.awsSdkStrings.Gigabytes
    - typings.awsSdk.awsSdkStrings.Terabytes
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
  type MetricUnit = typings.awsSdk.lightsailMod._MetricUnit | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.tcp_
    - typings.awsSdk.awsSdkStrings.all__
    - typings.awsSdk.awsSdkStrings.udp_
    - java.lang.String
  */
  type NetworkProtocol = typings.awsSdk.lightsailMod._NetworkProtocol | java.lang.String
  type NonEmptyString = java.lang.String
  type NotificationTriggerList = js.Array[typings.awsSdk.lightsailMod.AlarmState]
  type OperationList = js.Array[typings.awsSdk.lightsailMod.Operation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NotStarted
    - typings.awsSdk.awsSdkStrings.Started_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.Succeeded_
    - java.lang.String
  */
  type OperationStatus = typings.awsSdk.lightsailMod._OperationStatus | java.lang.String
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
    - java.lang.String
  */
  type OperationType = typings.awsSdk.lightsailMod._OperationType | java.lang.String
  type PendingMaintenanceActionList = js.Array[typings.awsSdk.lightsailMod.PendingMaintenanceAction]
  type Port = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Public_
    - typings.awsSdk.awsSdkStrings.Private_
    - java.lang.String
  */
  type PortAccessType = typings.awsSdk.lightsailMod._PortAccessType | java.lang.String
  type PortInfoList = js.Array[typings.awsSdk.lightsailMod.PortInfo]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DEFAULT
    - typings.awsSdk.awsSdkStrings.INSTANCE
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.CLOSED
    - java.lang.String
  */
  type PortInfoSourceType = typings.awsSdk.lightsailMod._PortInfoSourceType | java.lang.String
  type PortList = js.Array[typings.awsSdk.lightsailMod.Port]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.open__
    - typings.awsSdk.awsSdkStrings.closed__
    - java.lang.String
  */
  type PortState = typings.awsSdk.lightsailMod._PortState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Started_
    - typings.awsSdk.awsSdkStrings.Succeeded_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type RecordState = typings.awsSdk.lightsailMod._RecordState | java.lang.String
  type RegionList = js.Array[typings.awsSdk.lightsailMod.Region]
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
    - java.lang.String
  */
  type RegionName = typings.awsSdk.lightsailMod._RegionName | java.lang.String
  type RelationalDatabaseBlueprintList = js.Array[typings.awsSdk.lightsailMod.RelationalDatabaseBlueprint]
  type RelationalDatabaseBundleList = js.Array[typings.awsSdk.lightsailMod.RelationalDatabaseBundle]
  type RelationalDatabaseEngine = typings.awsSdk.awsSdkStrings.mysql_ | java.lang.String
  type RelationalDatabaseEventList = js.Array[typings.awsSdk.lightsailMod.RelationalDatabaseEvent]
  type RelationalDatabaseList = js.Array[typings.awsSdk.lightsailMod.RelationalDatabase]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CPUUtilization
    - typings.awsSdk.awsSdkStrings.DatabaseConnections
    - typings.awsSdk.awsSdkStrings.DiskQueueDepth
    - typings.awsSdk.awsSdkStrings.FreeStorageSpace
    - typings.awsSdk.awsSdkStrings.NetworkReceiveThroughput
    - typings.awsSdk.awsSdkStrings.NetworkTransmitThroughput
    - java.lang.String
  */
  type RelationalDatabaseMetricName = typings.awsSdk.lightsailMod._RelationalDatabaseMetricName | java.lang.String
  type RelationalDatabaseParameterList = js.Array[typings.awsSdk.lightsailMod.RelationalDatabaseParameter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CURRENT
    - typings.awsSdk.awsSdkStrings.PREVIOUS
    - typings.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type RelationalDatabasePasswordVersion = typings.awsSdk.lightsailMod._RelationalDatabasePasswordVersion | java.lang.String
  type RelationalDatabaseSnapshotList = js.Array[typings.awsSdk.lightsailMod.RelationalDatabaseSnapshot]
  type ResourceArn = java.lang.String
  type ResourceName = java.lang.String
  type ResourceNameList = js.Array[typings.awsSdk.lightsailMod.ResourceName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Instance_
    - typings.awsSdk.awsSdkStrings.StaticIp
    - typings.awsSdk.awsSdkStrings.KeyPair
    - typings.awsSdk.awsSdkStrings.InstanceSnapshot
    - typings.awsSdk.awsSdkStrings.Domain_
    - typings.awsSdk.awsSdkStrings.PeeredVpc
    - typings.awsSdk.awsSdkStrings.LoadBalancer
    - typings.awsSdk.awsSdkStrings.LoadBalancerTlsCertificate
    - typings.awsSdk.awsSdkStrings.Disk
    - typings.awsSdk.awsSdkStrings.DiskSnapshot
    - typings.awsSdk.awsSdkStrings.RelationalDatabase
    - typings.awsSdk.awsSdkStrings.RelationalDatabaseSnapshot
    - typings.awsSdk.awsSdkStrings.ExportSnapshotRecord
    - typings.awsSdk.awsSdkStrings.CloudFormationStackRecord
    - typings.awsSdk.awsSdkStrings.Alarm_
    - typings.awsSdk.awsSdkStrings.ContactMethod
    - java.lang.String
  */
  type ResourceType = typings.awsSdk.lightsailMod._ResourceType | java.lang.String
  type SensitiveString = java.lang.String
  type StaticIpList = js.Array[typings.awsSdk.lightsailMod.StaticIp]
  type StringList = js.Array[java.lang.String]
  type StringMax256 = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.lightsailMod.TagKey]
  type TagList = js.Array[typings.awsSdk.lightsailMod.Tag]
  type TagValue = java.lang.String
  type TimeOfDay = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.breaching
    - typings.awsSdk.awsSdkStrings.notBreaching
    - typings.awsSdk.awsSdkStrings.ignore__
    - typings.awsSdk.awsSdkStrings.missing_
    - java.lang.String
  */
  type TreatMissingData = typings.awsSdk.lightsailMod._TreatMissingData | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2016-11-28`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.lightsailMod._apiVersion | java.lang.String
  type double = scala.Double
  type float = scala.Double
  type integer = scala.Double
  type timestamp = typings.std.Date
}
