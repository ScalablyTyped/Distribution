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
  def apply(ResourcePendingMaintenanceActions: ResourcePendingMaintenanceActions = null): ApplyPendingMaintenanceActionResponse = {
    val __obj = js.Dynamic.literal()
    if (ResourcePendingMaintenanceActions != null) __obj.updateDynamic("ResourcePendingMaintenanceActions")(ResourcePendingMaintenanceActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyPendingMaintenanceActionResponse]
  }
}

