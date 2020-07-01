package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFileSystemWindowsConfiguration extends js.Object {
  /**
    * The number of days to retain automatic daily backups. Setting this to zero (0) disables automatic daily backups. You can retain automatic daily backups for a maximum of 35 days. For more information, see Working with Automatic Daily Backups.
    */
  var AutomaticBackupRetentionDays: js.UndefOr[typings.awsSdk.fsxMod.AutomaticBackupRetentionDays] = js.native
  /**
    * The preferred time to start the daily automatic backup, in the UTC time zone, for example, 02:00 
    */
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.native
  /**
    * The configuration Amazon FSx uses to join the Windows File Server instance to the self-managed Microsoft AD directory. You cannot make a self-managed Microsoft AD update request if there is an existing self-managed Microsoft AD update request in progress.
    */
  var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryConfigurationUpdates] = js.native
  /**
    * Sets the target value for a file system's throughput capacity, in MB/s, that you are updating the file system to. Valid values are 8, 16, 32, 64, 128, 256, 512, 1024, 2048. You cannot make a throughput capacity update request if there is an existing throughput capacity update request in progress. For more information, see Managing Throughput Capacity.
    */
  var ThroughputCapacity: js.UndefOr[MegabytesPerSecond] = js.native
  /**
    * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. Where d is the weekday number, from 1 through 7, with 1 = Monday and 7 = Sunday.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.native
}

object UpdateFileSystemWindowsConfiguration {
  @scala.inline
  def apply(
    AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
    DailyAutomaticBackupStartTime: DailyTime = null,
    SelfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryConfigurationUpdates = null,
    ThroughputCapacity: js.UndefOr[MegabytesPerSecond] = js.undefined,
    WeeklyMaintenanceStartTime: WeeklyTime = null
  ): UpdateFileSystemWindowsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutomaticBackupRetentionDays)) __obj.updateDynamic("AutomaticBackupRetentionDays")(AutomaticBackupRetentionDays.get.asInstanceOf[js.Any])
    if (DailyAutomaticBackupStartTime != null) __obj.updateDynamic("DailyAutomaticBackupStartTime")(DailyAutomaticBackupStartTime.asInstanceOf[js.Any])
    if (SelfManagedActiveDirectoryConfiguration != null) __obj.updateDynamic("SelfManagedActiveDirectoryConfiguration")(SelfManagedActiveDirectoryConfiguration.asInstanceOf[js.Any])
    if (!js.isUndefined(ThroughputCapacity)) __obj.updateDynamic("ThroughputCapacity")(ThroughputCapacity.get.asInstanceOf[js.Any])
    if (WeeklyMaintenanceStartTime != null) __obj.updateDynamic("WeeklyMaintenanceStartTime")(WeeklyMaintenanceStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFileSystemWindowsConfiguration]
  }
}

