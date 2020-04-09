package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFileSystemWindowsConfiguration extends js.Object {
  /**
    * The ID for an existing AWS Managed Microsoft Active Directory (AD) instance that the file system should join when it's created.
    */
  var ActiveDirectoryId: js.UndefOr[DirectoryId] = js.native
  /**
    * The number of days to retain automatic backups. The default is to retain backups for 7 days. Setting this value to 0 disables the creation of automatic backups. The maximum retention period for backups is 35 days.
    */
  var AutomaticBackupRetentionDays: js.UndefOr[typings.awsSdk.fsxMod.AutomaticBackupRetentionDays] = js.native
  /**
    * A boolean flag indicating whether tags for the file system should be copied to backups. This value defaults to false. If it's set to true, all tags for the file system are copied to all automatic and user-initiated backups where the user doesn't specify tags. If this value is true, and you specify one or more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file system, regardless of this value.
    */
  var CopyTagsToBackups: js.UndefOr[Flag] = js.native
  /**
    * The preferred time to take daily automatic backups, formatted HH:MM in the UTC time zone.
    */
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.native
  /**
    * Specifies the file system deployment type, valid values are the following:    MULTI_AZ_1 - Deploys a high availability file system that is configured for Multi-AZ redundancy to tolerate temporary Availability Zone (AZ) unavailability. You can only deploy a Multi-AZ file system in AWS Regions that have a minimum of three Availability Zones. Also supports HDD storage type    SINGLE_AZ_1 - (Default) Choose to deploy a file system that is configured for single AZ redundancy.    SINGLE_AZ_2 - The latest generation Single AZ file system. Specifies a file system that is configured for single AZ redundancy and supports HDD storage type.   For more information, see  Availability and Durability: Single-AZ and Multi-AZ File Systems.
    */
  var DeploymentType: js.UndefOr[WindowsDeploymentType] = js.native
  /**
    * Required when DeploymentType is set to MULTI_AZ_1. This specifies the subnet in which you want the preferred file server to be located. For in-AWS applications, we recommend that you launch your clients in the same Availability Zone (AZ) as your preferred file server to reduce cross-AZ data transfer costs and minimize latency. 
    */
  var PreferredSubnetId: js.UndefOr[SubnetId] = js.native
  var SelfManagedActiveDirectoryConfiguration: js.UndefOr[typings.awsSdk.fsxMod.SelfManagedActiveDirectoryConfiguration] = js.native
  /**
    * The throughput of an Amazon FSx file system, measured in megabytes per second, in 2 to the nth increments, between 2^3 (8) and 2^11 (2048).
    */
  var ThroughputCapacity: MegabytesPerSecond = js.native
  /**
    * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.native
}

object CreateFileSystemWindowsConfiguration {
  @scala.inline
  def apply(
    ThroughputCapacity: MegabytesPerSecond,
    ActiveDirectoryId: DirectoryId = null,
    AutomaticBackupRetentionDays: Int | Double = null,
    CopyTagsToBackups: js.UndefOr[Boolean] = js.undefined,
    DailyAutomaticBackupStartTime: DailyTime = null,
    DeploymentType: WindowsDeploymentType = null,
    PreferredSubnetId: SubnetId = null,
    SelfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryConfiguration = null,
    WeeklyMaintenanceStartTime: WeeklyTime = null
  ): CreateFileSystemWindowsConfiguration = {
    val __obj = js.Dynamic.literal(ThroughputCapacity = ThroughputCapacity.asInstanceOf[js.Any])
    if (ActiveDirectoryId != null) __obj.updateDynamic("ActiveDirectoryId")(ActiveDirectoryId.asInstanceOf[js.Any])
    if (AutomaticBackupRetentionDays != null) __obj.updateDynamic("AutomaticBackupRetentionDays")(AutomaticBackupRetentionDays.asInstanceOf[js.Any])
    if (!js.isUndefined(CopyTagsToBackups)) __obj.updateDynamic("CopyTagsToBackups")(CopyTagsToBackups.asInstanceOf[js.Any])
    if (DailyAutomaticBackupStartTime != null) __obj.updateDynamic("DailyAutomaticBackupStartTime")(DailyAutomaticBackupStartTime.asInstanceOf[js.Any])
    if (DeploymentType != null) __obj.updateDynamic("DeploymentType")(DeploymentType.asInstanceOf[js.Any])
    if (PreferredSubnetId != null) __obj.updateDynamic("PreferredSubnetId")(PreferredSubnetId.asInstanceOf[js.Any])
    if (SelfManagedActiveDirectoryConfiguration != null) __obj.updateDynamic("SelfManagedActiveDirectoryConfiguration")(SelfManagedActiveDirectoryConfiguration.asInstanceOf[js.Any])
    if (WeeklyMaintenanceStartTime != null) __obj.updateDynamic("WeeklyMaintenanceStartTime")(WeeklyMaintenanceStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFileSystemWindowsConfiguration]
  }
}

