package typings.awsSdk.fsxMod

import typings.awsSdk.awsSdkStrings.DELETE_CHILD_VOLUMES_AND_SNAPSHOTS
import typings.awsSdk.awsSdkStrings.FAILED_FILES_ONLY
import typings.awsSdk.awsSdkStrings.REPORT_CSV_20191124
import typings.awsSdk.awsSdkStrings.SINGLE_AZ_1
import typings.awsSdk.awsSdkStrings.`file-system-id`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AWSAccountId = String

type ActiveDirectoryFullyQualifiedName = String

type AdminPassword = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FILE_SYSTEM_UPDATE
  - typings.awsSdk.awsSdkStrings.STORAGE_OPTIMIZATION
  - typings.awsSdk.awsSdkStrings.FILE_SYSTEM_ALIAS_ASSOCIATION
  - typings.awsSdk.awsSdkStrings.FILE_SYSTEM_ALIAS_DISASSOCIATION
  - typings.awsSdk.awsSdkStrings.VOLUME_UPDATE
  - typings.awsSdk.awsSdkStrings.SNAPSHOT_UPDATE
  - typings.awsSdk.awsSdkStrings.RELEASE_NFS_V3_LOCKS
  - java.lang.String
*/
type AdministrativeActionType = _AdministrativeActionType | String

type AdministrativeActions = js.Array[AdministrativeAction]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type AliasLifecycle = _AliasLifecycle | String

type Aliases = js.Array[Alias]

type AlternateDNSName = String

type AlternateDNSNames = js.Array[AlternateDNSName]

type ArchivePath = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.NEW
  - typings.awsSdk.awsSdkStrings.NEW_CHANGED
  - typings.awsSdk.awsSdkStrings.NEW_CHANGED_DELETED
  - java.lang.String
*/
type AutoImportPolicyType = _AutoImportPolicyType | String

type AutomaticBackupRetentionDays = Double

type BackupId = String

type BackupIds = js.Array[BackupId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.TRANSFERRING
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.COPYING
  - java.lang.String
*/
type BackupLifecycle = _BackupLifecycle | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AUTOMATIC
  - typings.awsSdk.awsSdkStrings.USER_INITIATED
  - typings.awsSdk.awsSdkStrings.AWS_BACKUP
  - java.lang.String
*/
type BackupType = _BackupType | String

type Backups = js.Array[Backup]

type BatchImportMetaDataOnCreate = Boolean

type ClientRequestToken = String

type CoolingPeriod = Double

type CreationTime = js.Date

type DNSName = String

type DailyTime = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.LZ4
  - java.lang.String
*/
type DataCompressionType = _DataCompressionType | String

type DataRepositoryAssociationId = String

type DataRepositoryAssociationIds = js.Array[DataRepositoryAssociationId]

type DataRepositoryAssociations = js.Array[DataRepositoryAssociation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.MISCONFIGURED
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type DataRepositoryLifecycle = _DataRepositoryLifecycle | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`file-system-id`
  - typings.awsSdk.awsSdkStrings.`task-lifecycle`
  - typings.awsSdk.awsSdkStrings.`data-repository-association-id`
  - java.lang.String
*/
type DataRepositoryTaskFilterName = _DataRepositoryTaskFilterName | String

type DataRepositoryTaskFilterValue = String

type DataRepositoryTaskFilterValues = js.Array[DataRepositoryTaskFilterValue]

type DataRepositoryTaskFilters = js.Array[DataRepositoryTaskFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.EXECUTING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.CANCELED
  - typings.awsSdk.awsSdkStrings.CANCELING
  - java.lang.String
*/
type DataRepositoryTaskLifecycle = _DataRepositoryTaskLifecycle | String

type DataRepositoryTaskPath = String

type DataRepositoryTaskPaths = js.Array[DataRepositoryTaskPath]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EXPORT_TO_REPOSITORY
  - typings.awsSdk.awsSdkStrings.IMPORT_METADATA_FROM_REPOSITORY
  - java.lang.String
*/
type DataRepositoryTaskType = _DataRepositoryTaskType | String

type DataRepositoryTasks = js.Array[DataRepositoryTask]

type DeleteDataInFileSystem = Boolean

type DeleteFileSystemOpenZFSOption = DELETE_CHILD_VOLUMES_AND_SNAPSHOTS | String

type DeleteFileSystemOpenZFSOptions = js.Array[DeleteFileSystemOpenZFSOption]

type DeleteOpenZFSVolumeOption = DELETE_CHILD_VOLUMES_AND_SNAPSHOTS | String

type DeleteOpenZFSVolumeOptions = js.Array[DeleteOpenZFSVolumeOption]

type DirectoryId = String

type DirectoryPassword = String

type DirectoryUserName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AUTOMATIC
  - typings.awsSdk.awsSdkStrings.USER_PROVISIONED
  - java.lang.String
*/
type DiskIopsConfigurationMode = _DiskIopsConfigurationMode | String

type DnsIps = js.Array[IpAddress]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.READ
  - java.lang.String
*/
type DriveCacheType = _DriveCacheType | String

type EndTime = js.Date

type ErrorMessage = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NEW
  - typings.awsSdk.awsSdkStrings.CHANGED
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type EventType = _EventType | String

type EventTypes = js.Array[EventType]

type FailedCount = Double

type FileSystemAdministratorsGroupName = String

type FileSystemId = String

type FileSystemIds = js.Array[FileSystemId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.MISCONFIGURED
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.MISCONFIGURED_UNAVAILABLE
  - java.lang.String
*/
type FileSystemLifecycle = _FileSystemLifecycle | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PATCHING
  - typings.awsSdk.awsSdkStrings.BACKING_UP
  - java.lang.String
*/
type FileSystemMaintenanceOperation = _FileSystemMaintenanceOperation | String

type FileSystemMaintenanceOperations = js.Array[FileSystemMaintenanceOperation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WINDOWS
  - typings.awsSdk.awsSdkStrings.LUSTRE
  - typings.awsSdk.awsSdkStrings.ONTAP
  - typings.awsSdk.awsSdkStrings.OPENZFS
  - java.lang.String
*/
type FileSystemType = _FileSystemType | String

type FileSystemTypeVersion = String

type FileSystems = js.Array[FileSystem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`file-system-id`
  - typings.awsSdk.awsSdkStrings.`backup-type`
  - typings.awsSdk.awsSdkStrings.`file-system-type`
  - typings.awsSdk.awsSdkStrings.`volume-id`
  - typings.awsSdk.awsSdkStrings.`data-repository-type`
  - java.lang.String
*/
type FilterName = _FilterName | String

type FilterValue = String

type FilterValues = js.Array[FilterValue]

type Filters = js.Array[Filter]

type Flag = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.ORIGIN
  - typings.awsSdk.awsSdkStrings.CACHE
  - java.lang.String
*/
type FlexCacheEndpointType = _FlexCacheEndpointType | String

type GeneralARN = String

type IntegerNoMax = Double

type IntegerNoMaxFromNegativeOne = Double

type IntegerRecordSizeKiB = Double

type Iops = Double

type IpAddress = String

type IpAddressRange = String

type JunctionPath = String

type KmsKeyId = String

type LastUpdatedTime = js.Date

type LimitedMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.WARN_ONLY
  - typings.awsSdk.awsSdkStrings.ERROR_ONLY
  - typings.awsSdk.awsSdkStrings.WARN_ERROR
  - java.lang.String
*/
type LustreAccessAuditLogLevel = _LustreAccessAuditLogLevel | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SCRATCH_1
  - typings.awsSdk.awsSdkStrings.SCRATCH_2
  - typings.awsSdk.awsSdkStrings.PERSISTENT_1
  - typings.awsSdk.awsSdkStrings.PERSISTENT_2
  - java.lang.String
*/
type LustreDeploymentType = _LustreDeploymentType | String

type LustreFileSystemMountName = String

type LustreNoSquashNid = String

type LustreNoSquashNids = js.Array[LustreNoSquashNid]

type LustreRootSquash = String

type MaxResults = Double

type Megabytes = Double

type MegabytesPerSecond = Double

type Namespace = String

type NetBiosAlias = String

type NetworkInterfaceId = String

type NetworkInterfaceIds = js.Array[NetworkInterfaceId]

type NextToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MULTI_AZ_1
  - typings.awsSdk.awsSdkStrings.SINGLE_AZ_1
  - java.lang.String
*/
type OntapDeploymentType = _OntapDeploymentType | String

type OntapEndpointIpAddresses = js.Array[IpAddress]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RW
  - typings.awsSdk.awsSdkStrings.DP
  - typings.awsSdk.awsSdkStrings.LS
  - java.lang.String
*/
type OntapVolumeType = _OntapVolumeType | String

type OpenZFSClientConfigurations = js.Array[OpenZFSClientConfiguration]

type OpenZFSClients = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CLONE
  - typings.awsSdk.awsSdkStrings.FULL_COPY
  - java.lang.String
*/
type OpenZFSCopyStrategy = _OpenZFSCopyStrategy | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.ZSTD
  - typings.awsSdk.awsSdkStrings.LZ4
  - java.lang.String
*/
type OpenZFSDataCompressionType = _OpenZFSDataCompressionType | String

type OpenZFSDeploymentType = SINGLE_AZ_1 | String

type OpenZFSNfsExportOption = String

type OpenZFSNfsExportOptions = js.Array[OpenZFSNfsExportOption]

type OpenZFSNfsExports = js.Array[OpenZFSNfsExport]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USER
  - typings.awsSdk.awsSdkStrings.GROUP
  - java.lang.String
*/
type OpenZFSQuotaType = _OpenZFSQuotaType | String

type OpenZFSUserAndGroupQuotas = js.Array[OpenZFSUserOrGroupQuota]

type OrganizationalUnitDistinguishedName = String

type PerUnitStorageThroughput = Double

type ProgressPercent = Double

type ReadOnly = Boolean

type Region = String

type ReportFormat = REPORT_CSV_20191124 | String

type ReportScope = FAILED_FILES_ONLY | String

type RequestTime = js.Date

type ResourceARN = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FILE_SYSTEM
  - typings.awsSdk.awsSdkStrings.VOLUME
  - java.lang.String
*/
type ResourceType = _ResourceType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DELETE_INTERMEDIATE_SNAPSHOTS
  - typings.awsSdk.awsSdkStrings.DELETE_CLONED_VOLUMES
  - java.lang.String
*/
type RestoreOpenZFSVolumeOption = _RestoreOpenZFSVolumeOption | String

type RestoreOpenZFSVolumeOptions = js.Array[RestoreOpenZFSVolumeOption]

type RouteTableId = String

type RouteTableIds = js.Array[RouteTableId]

type SecurityGroupId = String

type SecurityGroupIds = js.Array[SecurityGroupId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNIX
  - typings.awsSdk.awsSdkStrings.NTFS
  - typings.awsSdk.awsSdkStrings.MIXED
  - java.lang.String
*/
type SecurityStyle = _SecurityStyle | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`file-system-id`
  - typings.awsSdk.awsSdkStrings.`volume-id`
  - java.lang.String
*/
type SnapshotFilterName = _SnapshotFilterName | String

type SnapshotFilterValue = String

type SnapshotFilterValues = js.Array[SnapshotFilterValue]

type SnapshotFilters = js.Array[SnapshotFilter]

type SnapshotId = String

type SnapshotIds = js.Array[SnapshotId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - java.lang.String
*/
type SnapshotLifecycle = _SnapshotLifecycle | String

type SnapshotName = String

type Snapshots = js.Array[Snapshot]

type SourceBackupId = String

type StartTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.UPDATED_OPTIMIZING
  - java.lang.String
*/
type Status = _Status | String

type StorageCapacity = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SSD
  - typings.awsSdk.awsSdkStrings.HDD
  - java.lang.String
*/
type StorageType = _StorageType | String

type StorageVirtualMachineFilterName = `file-system-id` | String

type StorageVirtualMachineFilterValue = String

type StorageVirtualMachineFilterValues = js.Array[StorageVirtualMachineFilterValue]

type StorageVirtualMachineFilters = js.Array[StorageVirtualMachineFilter]

type StorageVirtualMachineId = String

type StorageVirtualMachineIds = js.Array[StorageVirtualMachineId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.MISCONFIGURED
  - typings.awsSdk.awsSdkStrings.PENDING
  - java.lang.String
*/
type StorageVirtualMachineLifecycle = _StorageVirtualMachineLifecycle | String

type StorageVirtualMachineName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNIX
  - typings.awsSdk.awsSdkStrings.NTFS
  - typings.awsSdk.awsSdkStrings.MIXED
  - java.lang.String
*/
type StorageVirtualMachineRootVolumeSecurityStyle = _StorageVirtualMachineRootVolumeSecurityStyle | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEFAULT
  - typings.awsSdk.awsSdkStrings.DP_DESTINATION
  - typings.awsSdk.awsSdkStrings.SYNC_DESTINATION
  - typings.awsSdk.awsSdkStrings.SYNC_SOURCE
  - java.lang.String
*/
type StorageVirtualMachineSubtype = _StorageVirtualMachineSubtype | String

type StorageVirtualMachines = js.Array[StorageVirtualMachine]

type SubnetId = String

type SubnetIds = js.Array[SubnetId]

type SucceededCount = Double

type TagKey = String

type TagKeys = js.Array[TagKey]

type TagValue = String

type Tags = js.Array[Tag]

type TaskId = String

type TaskIds = js.Array[TaskId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SNAPSHOT_ONLY
  - typings.awsSdk.awsSdkStrings.AUTO
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type TieringPolicyName = _TieringPolicyName | String

type TotalCount = Double

type UUID = String

type VolumeCapacity = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`file-system-id`
  - typings.awsSdk.awsSdkStrings.`storage-virtual-machine-id`
  - java.lang.String
*/
type VolumeFilterName = _VolumeFilterName | String

type VolumeFilterValue = String

type VolumeFilterValues = js.Array[VolumeFilterValue]

type VolumeFilters = js.Array[VolumeFilter]

type VolumeId = String

type VolumeIds = js.Array[VolumeId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.MISCONFIGURED
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - java.lang.String
*/
type VolumeLifecycle = _VolumeLifecycle | String

type VolumeName = String

type VolumePath = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ONTAP
  - typings.awsSdk.awsSdkStrings.OPENZFS
  - java.lang.String
*/
type VolumeType = _VolumeType | String

type Volumes = js.Array[Volume]

type VpcId = String

type WeeklyTime = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.SUCCESS_ONLY
  - typings.awsSdk.awsSdkStrings.FAILURE_ONLY
  - typings.awsSdk.awsSdkStrings.SUCCESS_AND_FAILURE
  - java.lang.String
*/
type WindowsAccessAuditLogLevel = _WindowsAccessAuditLogLevel | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MULTI_AZ_1
  - typings.awsSdk.awsSdkStrings.SINGLE_AZ_1
  - typings.awsSdk.awsSdkStrings.SINGLE_AZ_2
  - java.lang.String
*/
type WindowsDeploymentType = _WindowsDeploymentType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-03-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
