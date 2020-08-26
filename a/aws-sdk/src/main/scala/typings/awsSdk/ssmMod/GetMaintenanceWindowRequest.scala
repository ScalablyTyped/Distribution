package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMaintenanceWindowRequest extends js.Object {
  /**
    * The ID of the maintenance window for which you want to retrieve information.
    */
  var WindowId: MaintenanceWindowId = js.native
}

object GetMaintenanceWindowRequest {
  @scala.inline
  def apply(WindowId: MaintenanceWindowId): GetMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMaintenanceWindowRequest]
  }
  @scala.inline
  implicit class GetMaintenanceWindowRequestOps[Self <: GetMaintenanceWindowRequest] (val x: Self) extends AnyVal {
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
  }
  
}

