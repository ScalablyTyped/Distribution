package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LustreFileSystemConfiguration extends js.Object {
  var DataRepositoryConfiguration: js.UndefOr[typings.awsSdk.fsxMod.DataRepositoryConfiguration] = js.native
  /**
    * The UTC time that you want to begin your weekly maintenance window.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.native
}

object LustreFileSystemConfiguration {
  @scala.inline
  def apply(
    DataRepositoryConfiguration: DataRepositoryConfiguration = null,
    WeeklyMaintenanceStartTime: WeeklyTime = null
  ): LustreFileSystemConfiguration = {
    val __obj = js.Dynamic.literal()
    if (DataRepositoryConfiguration != null) __obj.updateDynamic("DataRepositoryConfiguration")(DataRepositoryConfiguration.asInstanceOf[js.Any])
    if (WeeklyMaintenanceStartTime != null) __obj.updateDynamic("WeeklyMaintenanceStartTime")(WeeklyMaintenanceStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[LustreFileSystemConfiguration]
  }
}

