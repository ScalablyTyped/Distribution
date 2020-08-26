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
  def apply(WindowId: MaintenanceWindowId, WindowTargetId: MaintenanceWindowTargetId): UpdateMaintenanceWindowTargetRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any], WindowTargetId = WindowTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMaintenanceWindowTargetRequest]
  }
  @scala.inline
  implicit class UpdateMaintenanceWindowTargetRequestOps[Self <: UpdateMaintenanceWindowTargetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = this.set("WindowId", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowTargetId(value: MaintenanceWindowTargetId): Self = this.set("WindowTargetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: MaintenanceWindowDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setName(value: MaintenanceWindowName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setOwnerInformation(value: OwnerInformation): Self = this.set("OwnerInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerInformation: Self = this.set("OwnerInformation", js.undefined)
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("Replace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplace: Self = this.set("Replace", js.undefined)
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = this.set("Targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: Targets): Self = this.set("Targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("Targets", js.undefined)
  }
  
}

