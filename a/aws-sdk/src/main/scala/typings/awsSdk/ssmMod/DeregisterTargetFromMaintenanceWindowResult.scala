package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterTargetFromMaintenanceWindowResult extends js.Object {
  /**
    * The ID of the maintenance window the target was removed from.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
  /**
    * The ID of the removed target definition.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.native
}

object DeregisterTargetFromMaintenanceWindowResult {
  @scala.inline
  def apply(): DeregisterTargetFromMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterTargetFromMaintenanceWindowResult]
  }
  @scala.inline
  implicit class DeregisterTargetFromMaintenanceWindowResultOps[Self <: DeregisterTargetFromMaintenanceWindowResult] (val x: Self) extends AnyVal {
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
    def deleteWindowId: Self = this.set("WindowId", js.undefined)
    @scala.inline
    def setWindowTargetId(value: MaintenanceWindowTargetId): Self = this.set("WindowTargetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowTargetId: Self = this.set("WindowTargetId", js.undefined)
  }
  
}

