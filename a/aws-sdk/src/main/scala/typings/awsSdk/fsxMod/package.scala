package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fsxMod {
  
  type AWSAccountId = java.lang.String
  
  type ActiveDirectoryFullyQualifiedName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FILE_SYSTEM_UPDATE
    - typings.awsSdk.awsSdkStrings.STORAGE_OPTIMIZATION
    - typings.awsSdk.awsSdkStrings.FILE_SYSTEM_ALIAS_ASSOCIATION
    - typings.awsSdk.awsSdkStrings.FILE_SYSTEM_ALIAS_DISASSOCIATION
    - java.lang.String
  */
  type AdministrativeActionType = typings.awsSdk.fsxMod._AdministrativeActionType | java.lang.String
  
  type AdministrativeActions = js.Array[typings.awsSdk.fsxMod.AdministrativeAction]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.CREATE_FAILED
    - typings.awsSdk.awsSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type AliasLifecycle = typings.awsSdk.fsxMod._AliasLifecycle | java.lang.String
  
  type Aliases = js.Array[typings.awsSdk.fsxMod.Alias]
  
  type AlternateDNSName = java.lang.String
  
  type AlternateDNSNames = js.Array[typings.awsSdk.fsxMod.AlternateDNSName]
  
  type ArchivePath = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.NEW
    - typings.awsSdk.awsSdkStrings.NEW_CHANGED
    - java.lang.String
  */
  type AutoImportPolicyType = typings.awsSdk.fsxMod._AutoImportPolicyType | java.lang.String
  
  type AutomaticBackupRetentionDays = scala.Double
  
  type BackupId = java.lang.String
  
  type BackupIds = js.Array[typings.awsSdk.fsxMod.BackupId]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.TRANSFERRING
    - typings.awsSdk.awsSdkStrings.DELETED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type BackupLifecycle = typings.awsSdk.fsxMod._BackupLifecycle | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AUTOMATIC
    - typings.awsSdk.awsSdkStrings.USER_INITIATED
    - typings.awsSdk.awsSdkStrings.AWS_BACKUP
    - java.lang.String
  */
  type BackupType = typings.awsSdk.fsxMod._BackupType | java.lang.String
  
  type Backups = js.Array[typings.awsSdk.fsxMod.Backup]
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.fsxMod.ClientApiVersions
  
  type ClientRequestToken = java.lang.String
  
  type CreationTime = typings.std.Date
  
  type DNSName = java.lang.String
  
  type DailyTime = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.MISCONFIGURED
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type DataRepositoryLifecycle = typings.awsSdk.fsxMod._DataRepositoryLifecycle | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`file-system-id`
    - typings.awsSdk.awsSdkStrings.`task-lifecycle`
    - java.lang.String
  */
  type DataRepositoryTaskFilterName = typings.awsSdk.fsxMod._DataRepositoryTaskFilterName | java.lang.String
  
  type DataRepositoryTaskFilterValue = java.lang.String
  
  type DataRepositoryTaskFilterValues = js.Array[typings.awsSdk.fsxMod.DataRepositoryTaskFilterValue]
  
  type DataRepositoryTaskFilters = js.Array[typings.awsSdk.fsxMod.DataRepositoryTaskFilter]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.EXECUTING
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.CANCELED
    - typings.awsSdk.awsSdkStrings.CANCELING
    - java.lang.String
  */
  type DataRepositoryTaskLifecycle = typings.awsSdk.fsxMod._DataRepositoryTaskLifecycle | java.lang.String
  
  type DataRepositoryTaskPath = java.lang.String
  
  type DataRepositoryTaskPaths = js.Array[typings.awsSdk.fsxMod.DataRepositoryTaskPath]
  
  type DataRepositoryTaskType = typings.awsSdk.awsSdkStrings.EXPORT_TO_REPOSITORY | java.lang.String
  
  type DataRepositoryTasks = js.Array[typings.awsSdk.fsxMod.DataRepositoryTask]
  
  type DirectoryId = java.lang.String
  
  type DirectoryPassword = java.lang.String
  
  type DirectoryUserName = java.lang.String
  
  type DnsIps = js.Array[typings.awsSdk.fsxMod.IpAddress]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.READ
    - java.lang.String
  */
  type DriveCacheType = typings.awsSdk.fsxMod._DriveCacheType | java.lang.String
  
  type EndTime = typings.std.Date
  
  type ErrorMessage = java.lang.String
  
  type FailedCount = scala.Double
  
  type FileSystemAdministratorsGroupName = java.lang.String
  
  type FileSystemId = java.lang.String
  
  type FileSystemIds = js.Array[typings.awsSdk.fsxMod.FileSystemId]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.MISCONFIGURED
    - typings.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type FileSystemLifecycle = typings.awsSdk.fsxMod._FileSystemLifecycle | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PATCHING
    - typings.awsSdk.awsSdkStrings.BACKING_UP
    - java.lang.String
  */
  type FileSystemMaintenanceOperation = typings.awsSdk.fsxMod._FileSystemMaintenanceOperation | java.lang.String
  
  type FileSystemMaintenanceOperations = js.Array[typings.awsSdk.fsxMod.FileSystemMaintenanceOperation]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.WINDOWS
    - typings.awsSdk.awsSdkStrings.LUSTRE
    - java.lang.String
  */
  type FileSystemType = typings.awsSdk.fsxMod._FileSystemType | java.lang.String
  
  type FileSystems = js.Array[typings.awsSdk.fsxMod.FileSystem]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`file-system-id`
    - typings.awsSdk.awsSdkStrings.`backup-type`
    - typings.awsSdk.awsSdkStrings.`file-system-type`
    - java.lang.String
  */
  type FilterName = typings.awsSdk.fsxMod._FilterName | java.lang.String
  
  type FilterValue = java.lang.String
  
  type FilterValues = js.Array[typings.awsSdk.fsxMod.FilterValue]
  
  type Filters = js.Array[typings.awsSdk.fsxMod.Filter]
  
  type Flag = scala.Boolean
  
  type IpAddress = java.lang.String
  
  type KmsKeyId = java.lang.String
  
  type LastUpdatedTime = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SCRATCH_1
    - typings.awsSdk.awsSdkStrings.SCRATCH_2
    - typings.awsSdk.awsSdkStrings.PERSISTENT_1
    - java.lang.String
  */
  type LustreDeploymentType = typings.awsSdk.fsxMod._LustreDeploymentType | java.lang.String
  
  type LustreFileSystemMountName = java.lang.String
  
  type MaxResults = scala.Double
  
  type Megabytes = scala.Double
  
  type MegabytesPerSecond = scala.Double
  
  type NetworkInterfaceId = java.lang.String
  
  type NetworkInterfaceIds = js.Array[typings.awsSdk.fsxMod.NetworkInterfaceId]
  
  type NextToken = java.lang.String
  
  type OrganizationalUnitDistinguishedName = java.lang.String
  
  type PerUnitStorageThroughput = scala.Double
  
  type ProgressPercent = scala.Double
  
  type ReportFormat = typings.awsSdk.awsSdkStrings.REPORT_CSV_20191124 | java.lang.String
  
  type ReportScope = typings.awsSdk.awsSdkStrings.FAILED_FILES_ONLY | java.lang.String
  
  type RequestTime = typings.std.Date
  
  type ResourceARN = java.lang.String
  
  type SecurityGroupId = java.lang.String
  
  type SecurityGroupIds = js.Array[typings.awsSdk.fsxMod.SecurityGroupId]
  
  type StartTime = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.UPDATED_OPTIMIZING
    - java.lang.String
  */
  type Status = typings.awsSdk.fsxMod._Status | java.lang.String
  
  type StorageCapacity = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SSD
    - typings.awsSdk.awsSdkStrings.HDD
    - java.lang.String
  */
  type StorageType = typings.awsSdk.fsxMod._StorageType | java.lang.String
  
  type SubnetId = java.lang.String
  
  type SubnetIds = js.Array[typings.awsSdk.fsxMod.SubnetId]
  
  type SucceededCount = scala.Double
  
  type TagKey = java.lang.String
  
  type TagKeys = js.Array[typings.awsSdk.fsxMod.TagKey]
  
  type TagValue = java.lang.String
  
  type Tags = js.Array[typings.awsSdk.fsxMod.Tag]
  
  type TaskId = java.lang.String
  
  type TaskIds = js.Array[typings.awsSdk.fsxMod.TaskId]
  
  type TotalCount = scala.Double
  
  type VpcId = java.lang.String
  
  type WeeklyTime = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.MULTI_AZ_1
    - typings.awsSdk.awsSdkStrings.SINGLE_AZ_1
    - typings.awsSdk.awsSdkStrings.SINGLE_AZ_2
    - java.lang.String
  */
  type WindowsDeploymentType = typings.awsSdk.fsxMod._WindowsDeploymentType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-03-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.fsxMod._apiVersion | java.lang.String
}
