package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcePendingMaintenanceActions extends js.Object {
  /**
    * A list that provides details about the pending maintenance actions for the resource.
    */
  var PendingMaintenanceActionDetails: js.UndefOr[typings.awsSdk.docdbMod.PendingMaintenanceActionDetails] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource that has pending maintenance actions.
    */
  var ResourceIdentifier: js.UndefOr[String] = js.native
}

object ResourcePendingMaintenanceActions {
  @scala.inline
  def apply(
    PendingMaintenanceActionDetails: PendingMaintenanceActionDetails = null,
    ResourceIdentifier: String = null
  ): ResourcePendingMaintenanceActions = {
    val __obj = js.Dynamic.literal()
    if (PendingMaintenanceActionDetails != null) __obj.updateDynamic("PendingMaintenanceActionDetails")(PendingMaintenanceActionDetails.asInstanceOf[js.Any])
    if (ResourceIdentifier != null) __obj.updateDynamic("ResourceIdentifier")(ResourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcePendingMaintenanceActions]
  }
}

