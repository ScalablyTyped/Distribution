package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeferredMaintenanceWindow extends js.Object {
  /**
    *  A timestamp for the end of the time period when we defer maintenance.
    */
  var DeferMaintenanceEndTime: js.UndefOr[TStamp] = js.native
  /**
    * A unique identifier for the maintenance window.
    */
  var DeferMaintenanceIdentifier: js.UndefOr[String] = js.native
  /**
    *  A timestamp for the beginning of the time period when we defer maintenance.
    */
  var DeferMaintenanceStartTime: js.UndefOr[TStamp] = js.native
}

object DeferredMaintenanceWindow {
  @scala.inline
  def apply(
    DeferMaintenanceEndTime: TStamp = null,
    DeferMaintenanceIdentifier: String = null,
    DeferMaintenanceStartTime: TStamp = null
  ): DeferredMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    if (DeferMaintenanceEndTime != null) __obj.updateDynamic("DeferMaintenanceEndTime")(DeferMaintenanceEndTime.asInstanceOf[js.Any])
    if (DeferMaintenanceIdentifier != null) __obj.updateDynamic("DeferMaintenanceIdentifier")(DeferMaintenanceIdentifier.asInstanceOf[js.Any])
    if (DeferMaintenanceStartTime != null) __obj.updateDynamic("DeferMaintenanceStartTime")(DeferMaintenanceStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeferredMaintenanceWindow]
  }
}

