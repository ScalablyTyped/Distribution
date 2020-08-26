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
  def apply(): LustreFileSystemConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LustreFileSystemConfiguration]
  }
  @scala.inline
  implicit class LustreFileSystemConfigurationOps[Self <: LustreFileSystemConfiguration] (val x: Self) extends AnyVal {
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
    def setDataRepositoryConfiguration(value: DataRepositoryConfiguration): Self = this.set("DataRepositoryConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataRepositoryConfiguration: Self = this.set("DataRepositoryConfiguration", js.undefined)
    @scala.inline
    def setDeploymentType(value: LustreDeploymentType): Self = this.set("DeploymentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentType: Self = this.set("DeploymentType", js.undefined)
    @scala.inline
    def setMountName(value: LustreFileSystemMountName): Self = this.set("MountName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMountName: Self = this.set("MountName", js.undefined)
    @scala.inline
    def setPerUnitStorageThroughput(value: PerUnitStorageThroughput): Self = this.set("PerUnitStorageThroughput", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerUnitStorageThroughput: Self = this.set("PerUnitStorageThroughput", js.undefined)
    @scala.inline
    def setWeeklyMaintenanceStartTime(value: WeeklyTime): Self = this.set("WeeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeeklyMaintenanceStartTime: Self = this.set("WeeklyMaintenanceStartTime", js.undefined)
  }
  
}

