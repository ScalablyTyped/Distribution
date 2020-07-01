package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LustreFileSystemConfiguration extends js.Object {
  var AutomaticBackupRetentionDays: js.UndefOr[typings.awsSdk.fsxMod.AutomaticBackupRetentionDays] = js.native
  /**
    * A boolean flag indicating whether tags on the file system should be copied to backups. If it's set to true, all tags on the file system are copied to all automatic backups and any user-initiated backups where the user doesn't specify any tags. If this value is true, and you specify one or more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file system, regardless of this value. (Default = false)
    */
  var CopyTagsToBackups: js.UndefOr[Flag] = js.native
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.native
  var DataRepositoryConfiguration: js.UndefOr[typings.awsSdk.fsxMod.DataRepositoryConfiguration] = js.native
  /**
    * The deployment type of the FSX for Lustre file system. Scratch deployment type is designed for temporary storage and shorter-term processing of data.  SCRATCH_1 and SCRATCH_2 deployment types are best suited for when you need temporary storage and shorter-term processing of data. The SCRATCH_2 deployment type provides in-transit encryption of data and higher burst throughput capacity than SCRATCH_1. The PERSISTENT_1 deployment type is used for longer-term storage and workloads and encryption of data in transit. To learn more about deployment types, see  FSx for Lustre Deployment Options. (Default = SCRATCH_1)
    */
  var DeploymentType: js.UndefOr[LustreDeploymentType] = js.native
  /**
    * You use the MountName value when mounting the file system. For the SCRATCH_1 deployment type, this value is always "fsx". For SCRATCH_2 and PERSISTENT_1 deployment types, this value is a string that is unique within an AWS Region. 
    */
  var MountName: js.UndefOr[LustreFileSystemMountName] = js.native
  /**
    *  Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte of storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for PERSISTENT_1 deployment types. Valid values are 50, 100, 200. 
    */
  var PerUnitStorageThroughput: js.UndefOr[typings.awsSdk.fsxMod.PerUnitStorageThroughput] = js.native
  /**
    * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. d is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.native
}

object LustreFileSystemConfiguration {
  @scala.inline
  def apply(
    AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
    CopyTagsToBackups: js.UndefOr[Flag] = js.undefined,
    DailyAutomaticBackupStartTime: DailyTime = null,
    DataRepositoryConfiguration: DataRepositoryConfiguration = null,
    DeploymentType: LustreDeploymentType = null,
    MountName: LustreFileSystemMountName = null,
    PerUnitStorageThroughput: js.UndefOr[PerUnitStorageThroughput] = js.undefined,
    WeeklyMaintenanceStartTime: WeeklyTime = null
  ): LustreFileSystemConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutomaticBackupRetentionDays)) __obj.updateDynamic("AutomaticBackupRetentionDays")(AutomaticBackupRetentionDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CopyTagsToBackups)) __obj.updateDynamic("CopyTagsToBackups")(CopyTagsToBackups.get.asInstanceOf[js.Any])
    if (DailyAutomaticBackupStartTime != null) __obj.updateDynamic("DailyAutomaticBackupStartTime")(DailyAutomaticBackupStartTime.asInstanceOf[js.Any])
    if (DataRepositoryConfiguration != null) __obj.updateDynamic("DataRepositoryConfiguration")(DataRepositoryConfiguration.asInstanceOf[js.Any])
    if (DeploymentType != null) __obj.updateDynamic("DeploymentType")(DeploymentType.asInstanceOf[js.Any])
    if (MountName != null) __obj.updateDynamic("MountName")(MountName.asInstanceOf[js.Any])
    if (!js.isUndefined(PerUnitStorageThroughput)) __obj.updateDynamic("PerUnitStorageThroughput")(PerUnitStorageThroughput.get.asInstanceOf[js.Any])
    if (WeeklyMaintenanceStartTime != null) __obj.updateDynamic("WeeklyMaintenanceStartTime")(WeeklyMaintenanceStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[LustreFileSystemConfiguration]
  }
}

