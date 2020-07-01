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
  def apply(
    ActiveDirectoryId: DirectoryId = null,
    AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
    CopyTagsToBackups: js.UndefOr[Flag] = js.undefined,
    DailyAutomaticBackupStartTime: DailyTime = null,
    DeploymentType: WindowsDeploymentType = null,
    MaintenanceOperationsInProgress: FileSystemMaintenanceOperations = null,
    PreferredFileServerIp: IpAddress = null,
    PreferredSubnetId: SubnetId = null,
    RemoteAdministrationEndpoint: DNSName = null,
    SelfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryAttributes = null,
    ThroughputCapacity: js.UndefOr[MegabytesPerSecond] = js.undefined,
    WeeklyMaintenanceStartTime: WeeklyTime = null
  ): WindowsFileSystemConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ActiveDirectoryId != null) __obj.updateDynamic("ActiveDirectoryId")(ActiveDirectoryId.asInstanceOf[js.Any])
    if (!js.isUndefined(AutomaticBackupRetentionDays)) __obj.updateDynamic("AutomaticBackupRetentionDays")(AutomaticBackupRetentionDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CopyTagsToBackups)) __obj.updateDynamic("CopyTagsToBackups")(CopyTagsToBackups.get.asInstanceOf[js.Any])
    if (DailyAutomaticBackupStartTime != null) __obj.updateDynamic("DailyAutomaticBackupStartTime")(DailyAutomaticBackupStartTime.asInstanceOf[js.Any])
    if (DeploymentType != null) __obj.updateDynamic("DeploymentType")(DeploymentType.asInstanceOf[js.Any])
    if (MaintenanceOperationsInProgress != null) __obj.updateDynamic("MaintenanceOperationsInProgress")(MaintenanceOperationsInProgress.asInstanceOf[js.Any])
    if (PreferredFileServerIp != null) __obj.updateDynamic("PreferredFileServerIp")(PreferredFileServerIp.asInstanceOf[js.Any])
    if (PreferredSubnetId != null) __obj.updateDynamic("PreferredSubnetId")(PreferredSubnetId.asInstanceOf[js.Any])
    if (RemoteAdministrationEndpoint != null) __obj.updateDynamic("RemoteAdministrationEndpoint")(RemoteAdministrationEndpoint.asInstanceOf[js.Any])
    if (SelfManagedActiveDirectoryConfiguration != null) __obj.updateDynamic("SelfManagedActiveDirectoryConfiguration")(SelfManagedActiveDirectoryConfiguration.asInstanceOf[js.Any])
    if (!js.isUndefined(ThroughputCapacity)) __obj.updateDynamic("ThroughputCapacity")(ThroughputCapacity.get.asInstanceOf[js.Any])
    if (WeeklyMaintenanceStartTime != null) __obj.updateDynamic("WeeklyMaintenanceStartTime")(WeeklyMaintenanceStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsFileSystemConfiguration]
  }
}

