package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFileSystemWindowsConfiguration extends StObject {
  
  /**
    * The number of days to retain automatic daily backups. Setting this to zero (0) disables automatic daily backups. You can retain automatic daily backups for a maximum of 90 days. For more information, see Working with Automatic Daily Backups.
    */
  var AutomaticBackupRetentionDays: js.UndefOr[typings.awsSdk.fsxMod.AutomaticBackupRetentionDays] = js.undefined
  
  /**
    * The preferred time to start the daily automatic backup, in the UTC time zone, for example, 02:00 
    */
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined
  
  /**
    * The configuration Amazon FSx uses to join the Windows File Server instance to the self-managed Microsoft AD directory. You cannot make a self-managed Microsoft AD update request if there is an existing self-managed Microsoft AD update request in progress.
    */
  var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryConfigurationUpdates] = js.undefined
  
  /**
    * Sets the target value for a file system's throughput capacity, in MB/s, that you are updating the file system to. Valid values are 8, 16, 32, 64, 128, 256, 512, 1024, 2048. You cannot make a throughput capacity update request if there is an existing throughput capacity update request in progress. For more information, see Managing Throughput Capacity.
    */
  var ThroughputCapacity: js.UndefOr[MegabytesPerSecond] = js.undefined
  
  /**
    * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. Where d is the weekday number, from 1 through 7, with 1 = Monday and 7 = Sunday.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
}
object UpdateFileSystemWindowsConfiguration {
  
  @scala.inline
  def apply(): UpdateFileSystemWindowsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFileSystemWindowsConfiguration]
  }
  
  @scala.inline
  implicit class UpdateFileSystemWindowsConfigurationMutableBuilder[Self <: UpdateFileSystemWindowsConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomaticBackupRetentionDays(value: AutomaticBackupRetentionDays): Self = StObject.set(x, "AutomaticBackupRetentionDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticBackupRetentionDaysUndefined: Self = StObject.set(x, "AutomaticBackupRetentionDays", js.undefined)
    
    @scala.inline
    def setDailyAutomaticBackupStartTime(value: DailyTime): Self = StObject.set(x, "DailyAutomaticBackupStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyAutomaticBackupStartTimeUndefined: Self = StObject.set(x, "DailyAutomaticBackupStartTime", js.undefined)
    
    @scala.inline
    def setSelfManagedActiveDirectoryConfiguration(value: SelfManagedActiveDirectoryConfigurationUpdates): Self = StObject.set(x, "SelfManagedActiveDirectoryConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfManagedActiveDirectoryConfigurationUndefined: Self = StObject.set(x, "SelfManagedActiveDirectoryConfiguration", js.undefined)
    
    @scala.inline
    def setThroughputCapacity(value: MegabytesPerSecond): Self = StObject.set(x, "ThroughputCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThroughputCapacityUndefined: Self = StObject.set(x, "ThroughputCapacity", js.undefined)
    
    @scala.inline
    def setWeeklyMaintenanceStartTime(value: WeeklyTime): Self = StObject.set(x, "WeeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeeklyMaintenanceStartTimeUndefined: Self = StObject.set(x, "WeeklyMaintenanceStartTime", js.undefined)
  }
}
