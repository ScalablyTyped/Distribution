package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMaintenanceWindowExecutionRequest extends js.Object {
  /**
    * The ID of the maintenance window execution that includes the task.
    */
  var WindowExecutionId: MaintenanceWindowExecutionId = js.native
}

object GetMaintenanceWindowExecutionRequest {
  @scala.inline
  def apply(WindowExecutionId: MaintenanceWindowExecutionId): GetMaintenanceWindowExecutionRequest = {
    val __obj = js.Dynamic.literal(WindowExecutionId = WindowExecutionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetMaintenanceWindowExecutionRequest]
  }
}

