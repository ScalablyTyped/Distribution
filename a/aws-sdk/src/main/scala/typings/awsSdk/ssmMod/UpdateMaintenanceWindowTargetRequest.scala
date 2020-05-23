package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMaintenanceWindowTargetRequest extends js.Object {
  /**
    * An optional description for the update.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.native
  /**
    * A name for the update.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  /**
    * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this maintenance window.
    */
  var OwnerInformation: js.UndefOr[typings.awsSdk.ssmMod.OwnerInformation] = js.native
  /**
    * If True, then all fields that are required by the RegisterTargetWithMaintenanceWindow action are also required for this API request. Optional fields that are not specified are set to null.
    */
  var Replace: js.UndefOr[Boolean] = js.native
  /**
    * The targets to add or replace.
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.native
  /**
    * The maintenance window ID with which to modify the target.
    */
  var WindowId: MaintenanceWindowId = js.native
  /**
    * The target ID to modify.
    */
  var WindowTargetId: MaintenanceWindowTargetId = js.native
}

object UpdateMaintenanceWindowTargetRequest {
  @scala.inline
  def apply(
    WindowId: MaintenanceWindowId,
    WindowTargetId: MaintenanceWindowTargetId,
    Description: MaintenanceWindowDescription = null,
    Name: MaintenanceWindowName = null,
    OwnerInformation: OwnerInformation = null,
    Replace: js.UndefOr[Boolean] = js.undefined,
    Targets: Targets = null
  ): UpdateMaintenanceWindowTargetRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any], WindowTargetId = WindowTargetId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OwnerInformation != null) __obj.updateDynamic("OwnerInformation")(OwnerInformation.asInstanceOf[js.Any])
    if (!js.isUndefined(Replace)) __obj.updateDynamic("Replace")(Replace.get.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMaintenanceWindowTargetRequest]
  }
}

