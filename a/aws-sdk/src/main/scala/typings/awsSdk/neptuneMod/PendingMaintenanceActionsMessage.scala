package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingMaintenanceActionsMessage extends js.Object {
  
  /**
    *  An optional pagination token provided by a previous DescribePendingMaintenanceActions request. If this parameter is specified, the response includes only records beyond the marker, up to a number of records specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * A list of the pending maintenance actions for the resource.
    */
  var PendingMaintenanceActions: js.UndefOr[typings.awsSdk.neptuneMod.PendingMaintenanceActions] = js.native
}
object PendingMaintenanceActionsMessage {
  
  @scala.inline
  def apply(): PendingMaintenanceActionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingMaintenanceActionsMessage]
  }
  
  @scala.inline
  implicit class PendingMaintenanceActionsMessageOps[Self <: PendingMaintenanceActionsMessage] (val x: Self) extends AnyVal {
    
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
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setPendingMaintenanceActionsVarargs(value: ResourcePendingMaintenanceActions*): Self = this.set("PendingMaintenanceActions", js.Array(value :_*))
    
    @scala.inline
    def setPendingMaintenanceActions(value: PendingMaintenanceActions): Self = this.set("PendingMaintenanceActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingMaintenanceActions: Self = this.set("PendingMaintenanceActions", js.undefined)
  }
}
