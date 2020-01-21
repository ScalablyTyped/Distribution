package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFileSystemWindowsConfiguration extends js.Object {
  /**
    * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 35 days.
    */
  var AutomaticBackupRetentionDays: js.UndefOr[typings.awsSdk.fsxMod.AutomaticBackupRetentionDays] = js.native
  /**
    * The preferred time to take daily automatic backups, in the UTC time zone.
    */
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.native
  /**
    * The configuration Amazon FSx uses to join the Windows File Server instance to the self-managed Microsoft AD directory.
    */
  var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryConfigurationUpdates] = js.native
  /**
    * The preferred time to perform weekly maintenance, in the UTC time zone.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.native
}

object UpdateFileSystemWindowsConfiguration {
  @scala.inline
  def apply(
    AutomaticBackupRetentionDays: Int | Double = null,
    DailyAutomaticBackupStartTime: DailyTime = null,
    SelfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryConfigurationUpdates = null,
    WeeklyMaintenanceStartTime: WeeklyTime = null
  ): UpdateFileSystemWindowsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AutomaticBackupRetentionDays != null) __obj.updateDynamic("AutomaticBackupRetentionDays")(AutomaticBackupRetentionDays.asInstanceOf[js.Any])
    if (DailyAutomaticBackupStartTime != null) __obj.updateDynamic("DailyAutomaticBackupStartTime")(DailyAutomaticBackupStartTime.asInstanceOf[js.Any])
    if (SelfManagedActiveDirectoryConfiguration != null) __obj.updateDynamic("SelfManagedActiveDirectoryConfiguration")(SelfManagedActiveDirectoryConfiguration.asInstanceOf[js.Any])
    if (WeeklyMaintenanceStartTime != null) __obj.updateDynamic("WeeklyMaintenanceStartTime")(WeeklyMaintenanceStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFileSystemWindowsConfiguration]
  }
}

