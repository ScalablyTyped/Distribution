package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePendingMaintenanceActionsResponse extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The pending maintenance action.
    */
  var PendingMaintenanceActions: js.UndefOr[typings.awsSdk.dmsMod.PendingMaintenanceActions] = js.native
}

object DescribePendingMaintenanceActionsResponse {
  @scala.inline
  def apply(Marker: String = null, PendingMaintenanceActions: PendingMaintenanceActions = null): DescribePendingMaintenanceActionsResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (PendingMaintenanceActions != null) __obj.updateDynamic("PendingMaintenanceActions")(PendingMaintenanceActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePendingMaintenanceActionsResponse]
  }
}

