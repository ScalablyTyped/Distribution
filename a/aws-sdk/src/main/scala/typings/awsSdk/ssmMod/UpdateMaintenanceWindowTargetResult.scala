package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMaintenanceWindowTargetResult extends js.Object {
  /**
    * The updated description.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.native
  /**
    * The updated name.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  /**
    * The updated owner.
    */
  var OwnerInformation: js.UndefOr[typings.awsSdk.ssmMod.OwnerInformation] = js.native
  /**
    * The updated targets.
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.native
  /**
    * The maintenance window ID specified in the update request.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
  /**
    * The target ID specified in the update request.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.native
}

object UpdateMaintenanceWindowTargetResult {
  @scala.inline
  def apply(
    Description: MaintenanceWindowDescription = null,
    Name: MaintenanceWindowName = null,
    OwnerInformation: OwnerInformation = null,
    Targets: Targets = null,
    WindowId: MaintenanceWindowId = null,
    WindowTargetId: MaintenanceWindowTargetId = null
  ): UpdateMaintenanceWindowTargetResult = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OwnerInformation != null) __obj.updateDynamic("OwnerInformation")(OwnerInformation.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets.asInstanceOf[js.Any])
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId.asInstanceOf[js.Any])
    if (WindowTargetId != null) __obj.updateDynamic("WindowTargetId")(WindowTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMaintenanceWindowTargetResult]
  }
}

