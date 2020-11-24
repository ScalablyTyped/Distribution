package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFileSystemLustreConfiguration extends js.Object {
  
  /**
    *  (Optional) When you create your file system, your existing S3 objects appear as file and directory listings. Use this property to choose how Amazon FSx keeps your file and directory listing up to date as you add or modify objects in your linked S3 bucket. AutoImportPolicy can have the following values:    NONE - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from the linked S3 bucket when the file system is created. FSx does not update the file and directory listing for any new or changed objects after choosing this option.    NEW - AutoImport is on. Amazon FSx automatically imports directory listings of any new objects added to the linked S3 bucket that do not currently exist in the FSx file system.     NEW_CHANGED - AutoImport is on. Amazon FSx automatically imports file and directory listings of any new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket after you choose this option.    For more information, see Automatically import updates from your S3 bucket.
    */
  var AutoImportPolicy: js.UndefOr[AutoImportPolicyType] = js.native
  
  var AutomaticBackupRetentionDays: js.UndefOr[typings.awsSdk.fsxMod.AutomaticBackupRetentionDays] = js.native
  
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.native
  
  /**
    * (Optional) The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. d is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
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
