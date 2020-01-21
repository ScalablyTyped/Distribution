package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterTargetWithMaintenanceWindowResult extends js.Object {
  /**
    * The ID of the target definition in this maintenance window.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.native
}

object RegisterTargetWithMaintenanceWindowResult {
  @scala.inline
  def apply(WindowTargetId: MaintenanceWindowTargetId = null): RegisterTargetWithMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    if (WindowTargetId != null) __obj.updateDynamic("WindowTargetId")(WindowTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterTargetWithMaintenanceWindowResult]
  }
}

