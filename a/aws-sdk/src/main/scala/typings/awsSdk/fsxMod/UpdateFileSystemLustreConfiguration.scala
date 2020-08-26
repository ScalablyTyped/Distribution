package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFileSystemLustreConfiguration extends js.Object {
  /**
    *  (Optional) Use this property to configure the AutoImport feature on the file system's linked Amazon S3 data repository. You use AutoImport to update the contents of your FSx for Lustre file system automatically with changes that occur in the linked S3 data repository. AutoImportPolicy can have the following values:    NONE - (Default) AutoImport is off. Changes in the linked data repository are not reflected on the FSx file system.    NEW - AutoImport is on. New files in the linked data repository that do not currently exist in the FSx file system are automatically imported. Updates to existing FSx files are not imported to the FSx file system. Files deleted from the linked data repository are not deleted from the FSx file system.    NEW_CHANGED - AutoImport is on. New files in the linked S3 data repository that do not currently exist in the FSx file system are automatically imported. Changes to existing FSx files in the linked repository are also automatically imported to the FSx file system. Files deleted from the linked data repository are not deleted from the FSx file system.    For more information, see Automatically import updates from your S3 bucket.
    */
  var AutoImportPolicy: js.UndefOr[AutoImportPolicyType] = js.native
  var AutomaticBackupRetentionDays: js.UndefOr[typings.awsSdk.fsxMod.AutomaticBackupRetentionDays] = js.native
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.native
  /**
    * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. d is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.native
}

object UpdateFileSystemLustreConfiguration {
  @scala.inline
  def apply(): UpdateFileSystemLustreConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFileSystemLustreConfiguration]
  }
  @scala.inline
  implicit class UpdateFileSystemLustreConfigurationOps[Self <: UpdateFileSystemLustreConfiguration] (val x: Self) extends AnyVal {
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
    def setAutoImportPolicy(value: AutoImportPolicyType): Self = this.set("AutoImportPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoImportPolicy: Self = this.set("AutoImportPolicy", js.undefined)
    @scala.inline
    def setAutomaticBackupRetentionDays(value: AutomaticBackupRetentionDays): Self = this.set("AutomaticBackupRetentionDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomaticBackupRetentionDays: Self = this.set("AutomaticBackupRetentionDays", js.undefined)
    @scala.inline
    def setDailyAutomaticBackupStartTime(value: DailyTime): Self = this.set("DailyAutomaticBackupStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDailyAutomaticBackupStartTime: Self = this.set("DailyAutomaticBackupStartTime", js.undefined)
    @scala.inline
    def setWeeklyMaintenanceStartTime(value: WeeklyTime): Self = this.set("WeeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeeklyMaintenanceStartTime: Self = this.set("WeeklyMaintenanceStartTime", js.undefined)
  }
  
}

