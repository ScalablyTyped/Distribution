package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingMaintenanceActionsMessage extends js.Object {
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maintenance actions to be applied.
    */
  var PendingMaintenanceActions: js.UndefOr[typings.awsSdk.docdbMod.PendingMaintenanceActions] = js.native
}

object PendingMaintenanceActionsMessage {
  @scala.inline
  def apply(Marker: String = null, PendingMaintenanceActions: PendingMaintenanceActions = null): PendingMaintenanceActionsMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (PendingMaintenanceActions != null) __obj.updateDynamic("PendingMaintenanceActions")(PendingMaintenanceActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingMaintenanceActionsMessage]
  }
}

