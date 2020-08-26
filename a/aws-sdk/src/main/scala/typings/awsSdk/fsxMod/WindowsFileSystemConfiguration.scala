package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsFileSystemConfiguration extends js.Object {
  /**
    * The ID for an existing Microsoft Active Directory instance that the file system should join when it's created.
    */
  var ActiveDirectoryId: js.UndefOr[DirectoryId] = js.native
  /**
    * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 35 days.
    */
  var AutomaticBackupRetentionDays: js.UndefOr[typings.awsSdk.fsxMod.AutomaticBackupRetentionDays] = js.native
  /**
    * A boolean flag indicating whether tags on the file system should be copied to backups. This value defaults to false. If it's set to true, all tags on the file system are copied to all automatic backups and any user-initiated backups where the user doesn't specify any tags. If this value is true, and you specify one or more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file system, regardless of this value.
    */
  var CopyTagsToBackups: js.UndefOr[Flag] = js.native
  /**
    * The preferred time to take daily automatic backups, in the UTC time zone.
    */
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.native
  /**
    * Specifies the file system deployment type, valid values are the following:    MULTI_AZ_1 - Specifies a high availability file system that is configured for Multi-AZ redundancy to tolerate temporary Availability Zone (AZ) unavailability, and supports SSD and HDD storage.    SINGLE_AZ_1 - (Default) Specifies a file system that is configured for single AZ redundancy, only supports SSD storage.    SINGLE_AZ_2 - Latest generation Single AZ file system. Specifies a file system that is configured for single AZ redundancy and supports SSD and HDD storage.   For more information, see Single-AZ and Multi-AZ File Systems.
    */
  var DeploymentType: js.UndefOr[WindowsDeploymentType] = js.native
  /**
    * The list of maintenance operations in progress for this file system.
    */
  var MaintenanceOperationsInProgress: js.UndefOr[FileSystemMaintenanceOperations] = js.native
  /**
    * For MULTI_AZ_1 deployment types, the IP address of the primary, or preferred, file server. Use this IP address when mounting the file system on Linux SMB clients or Windows SMB clients that are not joined to a Microsoft Active Directory. Applicable for all Windows file system deployment types. This IP address is temporarily unavailable when the file system is undergoing maintenance. For Linux and Windows SMB clients that are joined to an Active Directory, use the file system's DNSName instead. For more information on mapping and mounting file shares, see Accessing File Shares.
    */
  var PreferredFileServerIp: js.UndefOr[IpAddress] = js.native
  /**
    * For MULTI_AZ_1 deployment types, it specifies the ID of the subnet where the preferred file server is located. Must be one of the two subnet IDs specified in SubnetIds property. Amazon FSx serves traffic from this subnet except in the event of a failover to the secondary file server. For SINGLE_AZ_1 and SINGLE_AZ_2 deployment types, this value is the same as that for SubnetIDs. For more information, see Availability and Durability: Single-AZ and Multi-AZ File Systems 
    */
  var PreferredSubnetId: js.UndefOr[SubnetId] = js.native
  /**
    * For MULTI_AZ_1 deployment types, use this endpoint when performing administrative tasks on the file system using Amazon FSx Remote PowerShell. For SINGLE_AZ_1 and SINGLE_AZ_2 deployment types, this is the DNS name of the file system. This endpoint is temporarily unavailable when the file system is undergoing maintenance.
    */
  var RemoteAdministrationEndpoint: js.UndefOr[DNSName] = js.native
  var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryAttributes] = js.native
  /**
    * The throughput of an Amazon FSx file system, measured in megabytes per second.
    */
  var ThroughputCapacity: js.UndefOr[MegabytesPerSecond] = js.native
  /**
    * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. d is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.native
}

object WindowsFileSystemConfiguration {
  @scala.inline
  def apply(): WindowsFileSystemConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsFileSystemConfiguration]
  }
  @scala.inline
  implicit class WindowsFileSystemConfigurationOps[Self <: WindowsFileSystemConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveDirectoryId(value: DirectoryId): Self = this.set("ActiveDirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveDirectoryId: Self = this.set("ActiveDirectoryId", js.undefined)
    @scala.inline
    def setAutomaticBackupRetentionDays(value: AutomaticBackupRetentionDays): Self = this.set("AutomaticBackupRetentionDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomaticBackupRetentionDays: Self = this.set("AutomaticBackupRetentionDays", js.undefined)
    @scala.inline
    def setCopyTagsToBackups(value: Flag): Self = this.set("CopyTagsToBackups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyTagsToBackups: Self = this.set("CopyTagsToBackups", js.undefined)
    @scala.inline
    def setDailyAutomaticBackupStartTime(value: DailyTime): Self = this.set("DailyAutomaticBackupStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDailyAutomaticBackupStartTime: Self = this.set("DailyAutomaticBackupStartTime", js.undefined)
    @scala.inline
    def setDeploymentType(value: WindowsDeploymentType): Self = this.set("DeploymentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentType: Self = this.set("DeploymentType", js.undefined)
    @scala.inline
    def setMaintenanceOperationsInProgressVarargs(value: FileSystemMaintenanceOperation*): Self = this.set("MaintenanceOperationsInProgress", js.Array(value :_*))
    @scala.inline
    def setMaintenanceOperationsInProgress(value: FileSystemMaintenanceOperations): Self = this.set("MaintenanceOperationsInProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintenanceOperationsInProgress: Self = this.set("MaintenanceOperationsInProgress", js.undefined)
    @scala.inline
    def setPreferredFileServerIp(value: IpAddress): Self = this.set("PreferredFileServerIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredFileServerIp: Self = this.set("PreferredFileServerIp", js.undefined)
    @scala.inline
    def setPreferredSubnetId(value: SubnetId): Self = this.set("PreferredSubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredSubnetId: Self = this.set("PreferredSubnetId", js.undefined)
    @scala.inline
    def setRemoteAdministrationEndpoint(value: DNSName): Self = this.set("RemoteAdministrationEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteAdministrationEndpoint: Self = this.set("RemoteAdministrationEndpoint", js.undefined)
    @scala.inline
    def setSelfManagedActiveDirectoryConfiguration(value: SelfManagedActiveDirectoryAttributes): Self = this.set("SelfManagedActiveDirectoryConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfManagedActiveDirectoryConfiguration: Self = this.set("SelfManagedActiveDirectoryConfiguration", js.undefined)
    @scala.inline
    def setThroughputCapacity(value: MegabytesPerSecond): Self = this.set("ThroughputCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThroughputCapacity: Self = this.set("ThroughputCapacity", js.undefined)
    @scala.inline
    def setWeeklyMaintenanceStartTime(value: WeeklyTime): Self = this.set("WeeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeeklyMaintenanceStartTime: Self = this.set("WeeklyMaintenanceStartTime", js.undefined)
  }
  
}

