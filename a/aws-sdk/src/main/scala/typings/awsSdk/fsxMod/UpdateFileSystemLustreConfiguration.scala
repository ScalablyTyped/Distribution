package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFileSystemLustreConfiguration extends StObject {
  
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
  implicit class UpdateFileSystemLustreConfigurationMutableBuilder[Self <: UpdateFileSystemLustreConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoImportPolicy(value: AutoImportPolicyType): Self = StObject.set(x, "AutoImportPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoImportPolicyUndefined: Self = StObject.set(x, "AutoImportPolicy", js.undefined)
    
    @scala.inline
    def setAutomaticBackupRetentionDays(value: AutomaticBackupRetentionDays): Self = StObject.set(x, "AutomaticBackupRetentionDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticBackupRetentionDaysUndefined: Self = StObject.set(x, "AutomaticBackupRetentionDays", js.undefined)
    
    @scala.inline
    def setDailyAutomaticBackupStartTime(value: DailyTime): Self = StObject.set(x, "DailyAutomaticBackupStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyAutomaticBackupStartTimeUndefined: Self = StObject.set(x, "DailyAutomaticBackupStartTime", js.undefined)
    
    @scala.inline
    def setWeeklyMaintenanceStartTime(value: WeeklyTime): Self = StObject.set(x, "WeeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeeklyMaintenanceStartTimeUndefined: Self = StObject.set(x, "WeeklyMaintenanceStartTime", js.undefined)
  }
}
