package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyPendingMaintenanceActionResponse extends js.Object {
  /**
    * The AWS DMS resource that the pending maintenance action will be applied to.
    */
  var ResourcePendingMaintenanceActions: js.UndefOr[typings.awsSdk.dmsMod.ResourcePendingMaintenanceActions] = js.native
}

object ApplyPendingMaintenanceActionResponse {
  @scala.inline
  def apply(): ApplyPendingMaintenanceActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyPendingMaintenanceActionResponse]
  }
  @scala.inline
  implicit class ApplyPendingMaintenanceActionResponseOps[Self <: ApplyPendingMaintenanceActionResponse] (val x: Self) extends AnyVal {
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
    def setResourcePendingMaintenanceActions(value: ResourcePendingMaintenanceActions): Self = this.set("ResourcePendingMaintenanceActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourcePendingMaintenanceActions: Self = this.set("ResourcePendingMaintenanceActions", js.undefined)
  }
  
}

