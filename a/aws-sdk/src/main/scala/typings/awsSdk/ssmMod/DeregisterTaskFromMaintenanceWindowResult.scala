package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterTaskFromMaintenanceWindowResult extends js.Object {
  /**
    * The ID of the maintenance window the task was removed from.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
  /**
    * The ID of the task removed from the maintenance window.
    */
  var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.native
}

object DeregisterTaskFromMaintenanceWindowResult {
  @scala.inline
  def apply(): DeregisterTaskFromMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterTaskFromMaintenanceWindowResult]
  }
  @scala.inline
  implicit class DeregisterTaskFromMaintenanceWindowResultOps[Self <: DeregisterTaskFromMaintenanceWindowResult] (val x: Self) extends AnyVal {
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
    def setWindowTaskId(value: MaintenanceWindowTaskId): Self = this.set("WindowTaskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowTaskId: Self = this.set("WindowTaskId", js.undefined)
  }
  
}

