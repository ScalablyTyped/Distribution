package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterTargetFromMaintenanceWindowRequest extends js.Object {
  /**
    * The system checks if the target is being referenced by a task. If the target is being referenced, the system returns an error and does not deregister the target from the maintenance window.
    */
  var Safe: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the maintenance window the target should be removed from.
    */
  var WindowId: MaintenanceWindowId = js.native
  /**
    * The ID of the target definition to remove.
    */
  var WindowTargetId: MaintenanceWindowTargetId = js.native
}

object DeregisterTargetFromMaintenanceWindowRequest {
  @scala.inline
  def apply(
    WindowId: MaintenanceWindowId,
    WindowTargetId: MaintenanceWindowTargetId,
    Safe: js.UndefOr[scala.Boolean] = js.undefined
  ): DeregisterTargetFromMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any], WindowTargetId = WindowTargetId.asInstanceOf[js.Any])
    if (!js.isUndefined(Safe)) __obj.updateDynamic("Safe")(Safe.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterTargetFromMaintenanceWindowRequest]
  }
}

