package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object storagegatewayMod {
  
  type ActivationKey = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
    - typings.awsSdk.awsSdkStrings.DETACHED
    - typings.awsSdk.awsSdkStrings.JOINED
    - typings.awsSdk.awsSdkStrings.JOINING
    - typings.awsSdk.awsSdkStrings.NETWORK_ERROR
    - typings.awsSdk.awsSdkStrings.TIMEOUT
    - typings.awsSdk.awsSdkStrings.UNKNOWN_ERROR
    - java.lang.String
  */
  type ActiveDirectoryStatus = typings.awsSdk.storagegatewayMod._ActiveDirectoryStatus | java.lang.String
  
  type AuditDestinationARN = java.lang.String
  
  type Authentication = java.lang.String
  
  type AutomaticTapeCreationPolicyInfos = js.Array[typings.awsSdk.storagegatewayMod.AutomaticTapeCreationPolicyInfo]
  
  type AutomaticTapeCreationRules = js.Array[typings.awsSdk.storagegatewayMod.AutomaticTapeCreationRule]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.COMPLETE
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type AvailabilityMonitorTestStatus = typings.awsSdk.storagegatewayMod._AvailabilityMonitorTestStatus | java.lang.String
  
  type BandwidthDownloadRateLimit = scala.Double
  
  type BandwidthRateLimitIntervals = js.Array[typings.awsSdk.storagegatewayMod.BandwidthRateLimitInterval]
  
  type BandwidthType = java.lang.String
  
  type BandwidthUploadRateLimit = scala.Double
  
  type Boolean = scala.Boolean
  
  type CacheStaleTimeoutInSeconds = scala.Double
  
  type CachediSCSIVolumes = js.Array[typings.awsSdk.storagegatewayMod.CachediSCSIVolume]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ClientSpecified
    - typings.awsSdk.awsSdkStrings.CaseSensitive
    - java.lang.String
  */
  type CaseSensitivity = typings.awsSdk.storagegatewayMod._CaseSensitivity | java.lang.String
  
  type ChapCredentials = js.Array[typings.awsSdk.storagegatewayMod.ChapInfo]
  
  type ChapSecret = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.storagegatewayMod.ClientApiVersions
  
  type ClientToken = java.lang.String
  
  type CloudWatchLogGroupARN = java.lang.String
  
  type CreatedDate = typings.std.Date
  
  type DayOfMonth = scala.Double
  
  type DayOfWeek = scala.Double
  
  type DaysOfWeek = js.Array[typings.awsSdk.storagegatewayMod.DayOfWeek]
  
  type DeprecationDate = java.lang.String
  
  type Description = java.lang.String
  
  type DeviceType = java.lang.String
  
  type DiskAllocationType = java.lang.String
  
  type DiskAttribute = java.lang.String
  
  type DiskAttributeList = js.Array[typings.awsSdk.storagegatewayMod.DiskAttribute]
  
  type DiskId = java.lang.String
  
  type DiskIds = js.Array[typings.awsSdk.storagegatewayMod.DiskId]
  
  type Disks = js.Array[typings.awsSdk.storagegatewayMod.Disk]
  
  type DomainName = java.lang.String
  
  type DomainUserName = java.lang.String
  
  type DomainUserPassword = java.lang.String
  
  type DoubleObject = scala.Double
  
  type Ec2InstanceId = java.lang.String
  
  type Ec2InstanceRegion = java.lang.String
  
  type EndpointType = java.lang.String
  
  type FileShareARN = java.lang.String
  
  type FileShareARNList = js.Array[typings.awsSdk.storagegatewayMod.FileShareARN]
  
  type FileShareClientList = js.Array[typings.awsSdk.storagegatewayMod.IPV4AddressCIDR]
  
  type FileShareId = java.lang.String
  
  type FileShareInfoList = js.Array[typings.awsSdk.storagegatewayMod.FileShareInfo]
  
  type FileShareName = java.lang.String
  
  type FileShareStatus = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NFS
    - typings.awsSdk.awsSdkStrings.SMB
    - java.lang.String
  */
  type FileShareType = typings.awsSdk.storagegatewayMod._FileShareType | java.lang.String
  
  type FileShareUser = java.lang.String
  
  type FileShareUserList = js.Array[typings.awsSdk.storagegatewayMod.FileShareUser]
  
  type Folder = java.lang.String
  
  type FolderList = js.Array[typings.awsSdk.storagegatewayMod.Folder]
  
  type GatewayARN = java.lang.String
  
  type GatewayId = java.lang.String
  
  type GatewayName = java.lang.String
  
  type GatewayNetworkInterfaces = js.Array[typings.awsSdk.storagegatewayMod.NetworkInterface]
  
  type GatewayOperationalState = java.lang.String
  
  type GatewayState = java.lang.String
  
  type GatewayTimezone = java.lang.String
  
  type GatewayType = java.lang.String
  
  type Gateways = js.Array[typings.awsSdk.storagegatewayMod.GatewayInfo]
  
  type Host = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.VMWARE
    - typings.awsSdk.awsSdkStrings.`HYPER-V`
    - typings.awsSdk.awsSdkStrings.EC2
    - typings.awsSdk.awsSdkStrings.KVM
    - typings.awsSdk.awsSdkStrings.OTHER
    - java.lang.String
  */
  type HostEnvironment = typings.awsSdk.storagegatewayMod._HostEnvironment | java.lang.String
  
  type Hosts = js.Array[typings.awsSdk.storagegatewayMod.Host]
  
  type HourOfDay = scala.Double
  
  type IPV4AddressCIDR = java.lang.String
  
  type Initiator = java.lang.String
  
  type Initiators = js.Array[typings.awsSdk.storagegatewayMod.Initiator]
  
  type IqnName = java.lang.String
  
  type KMSKey = java.lang.String
  
  type LastSoftwareUpdate = java.lang.String
  
  type LocalConsolePassword = java.lang.String
  
  type LocationARN = java.lang.String
  
  type Marker = java.lang.String
  
  type MediumChangerType = java.lang.String
  
  type MinimumNumTapes = scala.Double
  
  type MinuteOfHour = scala.Double
  
  type NFSFileShareInfoList = js.Array[typings.awsSdk.storagegatewayMod.NFSFileShareInfo]
  
  type NetworkInterfaceId = java.lang.String
  
  type NextUpdateAvailabilityDate = java.lang.String
  
  type NotificationId = java.lang.String
  
  type NotificationPolicy = java.lang.String
  
  type NumTapesToCreate = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.private__
    - typings.awsSdk.awsSdkStrings.`public-read`
    - typings.awsSdk.awsSdkStrings.`public-read-write`
    - typings.awsSdk.awsSdkStrings.`authenticated-read`
    - typings.awsSdk.awsSdkStrings.`bucket-owner-read`
    - typings.awsSdk.awsSdkStrings.`bucket-owner-full-control`
    - typings.awsSdk.awsSdkStrings.`aws-exec-read`
    - java.lang.String
  */
  type ObjectACL = typings.awsSdk.storagegatewayMod._ObjectACL | java.lang.String
  
  type OrganizationalUnit = java.lang.String
  
  type Path = java.lang.String
  
  type PermissionId = scala.Double
  
  type PermissionMode = java.lang.String
  
  type PoolARN = java.lang.String
  
  type PoolARNs = js.Array[typings.awsSdk.storagegatewayMod.PoolARN]
  
  type PoolId = java.lang.String
  
  type PoolInfos = js.Array[typings.awsSdk.storagegatewayMod.PoolInfo]
  
  type PoolName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type PoolStatus = typings.awsSdk.storagegatewayMod._PoolStatus | java.lang.String
  
  type PositiveIntObject = scala.Double
  
  type RecurrenceInHours = scala.Double
  
  type RegionId = java.lang.String
  
  type ResourceARN = java.lang.String
  
  type RetentionLockTimeInDays = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.COMPLIANCE
    - typings.awsSdk.awsSdkStrings.GOVERNANCE
    - typings.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type RetentionLockType = typings.awsSdk.storagegatewayMod._RetentionLockType | java.lang.String
  
  type Role = java.lang.String
  
  type SMBFileShareInfoList = js.Array[typings.awsSdk.storagegatewayMod.SMBFileShareInfo]
  
  type SMBGuestPassword = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ClientSpecified
    - typings.awsSdk.awsSdkStrings.MandatorySigning
    - typings.awsSdk.awsSdkStrings.MandatoryEncryption
    - java.lang.String
  */
  type SMBSecurityStrategy = typings.awsSdk.storagegatewayMod._SMBSecurityStrategy | java.lang.String
  
  type SnapshotDescription = java.lang.String
  
  type SnapshotId = java.lang.String
  
  type SoftwareUpdatesEndDate = java.lang.String
  
  type Squash = java.lang.String
  
  type StorageClass = java.lang.String
  
  type StorediSCSIVolumes = js.Array[typings.awsSdk.storagegatewayMod.StorediSCSIVolume]
  
  type TagKey = java.lang.String
  
  type TagKeys = js.Array[typings.awsSdk.storagegatewayMod.TagKey]
  
  type TagValue = java.lang.String
  
  type Tags = js.Array[typings.awsSdk.storagegatewayMod.Tag]
  
  type TapeARN = java.lang.String
  
  type TapeARNs = js.Array[typings.awsSdk.storagegatewayMod.TapeARN]
  
  type TapeArchiveStatus = java.lang.String
  
  type TapeArchives = js.Array[typings.awsSdk.storagegatewayMod.TapeArchive]
  
  type TapeBarcode = java.lang.String
  
  type TapeBarcodePrefix = java.lang.String
  
  type TapeDriveType = java.lang.String
  
  type TapeInfos = js.Array[typings.awsSdk.storagegatewayMod.TapeInfo]
  
  type TapeRecoveryPointInfos = js.Array[typings.awsSdk.storagegatewayMod.TapeRecoveryPointInfo]
  
  type TapeRecoveryPointStatus = java.lang.String
  
  type TapeSize = scala.Double
  
  type TapeStatus = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DEEP_ARCHIVE
    - typings.awsSdk.awsSdkStrings.GLACIER
    - java.lang.String
  */
  type TapeStorageClass = typings.awsSdk.storagegatewayMod._TapeStorageClass | java.lang.String
  
  type TapeUsage = scala.Double
  
  type Tapes = js.Array[typings.awsSdk.storagegatewayMod.Tape]
  
  type TargetARN = java.lang.String
  
  type TargetName = java.lang.String
  
  type Time = typings.std.Date
  
  type TimeoutInSeconds = scala.Double
  
  type VTLDeviceARN = java.lang.String
  
  type VTLDeviceARNs = js.Array[typings.awsSdk.storagegatewayMod.VTLDeviceARN]
  
  type VTLDeviceProductIdentifier = java.lang.String
  
  type VTLDeviceType = java.lang.String
  
  type VTLDeviceVendor = java.lang.String
  
  type VTLDevices = js.Array[typings.awsSdk.storagegatewayMod.VTLDevice]
  
  type VolumeARN = java.lang.String
  
  type VolumeARNs = js.Array[typings.awsSdk.storagegatewayMod.VolumeARN]
  
  type VolumeAttachmentStatus = java.lang.String
  
  type VolumeId = java.lang.String
  
  type VolumeInfos = js.Array[typings.awsSdk.storagegatewayMod.VolumeInfo]
  
  type VolumeRecoveryPointInfos = js.Array[typings.awsSdk.storagegatewayMod.VolumeRecoveryPointInfo]
  
  type VolumeStatus = java.lang.String
  
  type VolumeType = java.lang.String
  
  type VolumeUsedInBytes = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2013-06-30`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.storagegatewayMod._apiVersion | java.lang.String
  
  type double = scala.Double
  
  type integer = scala.Double
  
  type long = scala.Double
}
