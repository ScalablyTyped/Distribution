package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelMaintenanceWindowExecutionResult extends js.Object {
  /**
    * The ID of the maintenance window execution that has been stopped.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.native
}

object CancelMaintenanceWindowExecutionResult {
  @scala.inline
  def apply(): CancelMaintenanceWindowExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelMaintenanceWindowExecutionResult]
  }
  @scala.inline
  implicit class CancelMaintenanceWindowExecutionResultOps[Self <: CancelMaintenanceWindowExecutionResult] (val x: Self) extends AnyVal {
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
    def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = this.set("WindowExecutionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowExecutionId: Self = this.set("WindowExecutionId", js.undefined)
  }
  
}

