package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMaintenanceWindowTaskRequest extends js.Object {
  /**
    * The maintenance window ID that includes the task to retrieve.
    */
  var WindowId: MaintenanceWindowId = js.native
  /**
    * The maintenance window task ID to retrieve.
    */
  var WindowTaskId: MaintenanceWindowTaskId = js.native
}

object GetMaintenanceWindowTaskRequest {
  @scala.inline
  def apply(WindowId: MaintenanceWindowId, WindowTaskId: MaintenanceWindowTaskId): GetMaintenanceWindowTaskRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any], WindowTaskId = WindowTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMaintenanceWindowTaskRequest]
  }
}

