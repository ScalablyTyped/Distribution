package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingMaintenanceActionsMessage extends StObject {
  
  /**
    *  An optional pagination token provided by a previous DescribePendingMaintenanceActions request. If this parameter is specified, the response includes only records beyond the marker, up to a number of records specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * A list of the pending maintenance actions for the resource.
    */
  var PendingMaintenanceActions: js.UndefOr[typings.awsSdk.neptuneMod.PendingMaintenanceActions] = js.undefined
}
object PendingMaintenanceActionsMessage {
  
  @scala.inline
  def apply(): PendingMaintenanceActionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingMaintenanceActionsMessage]
  }
  
  @scala.inline
  implicit class PendingMaintenanceActionsMessageMutableBuilder[Self <: PendingMaintenanceActionsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setPendingMaintenanceActions(value: PendingMaintenanceActions): Self = StObject.set(x, "PendingMaintenanceActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingMaintenanceActionsUndefined: Self = StObject.set(x, "PendingMaintenanceActions", js.undefined)
    
    @scala.inline
    def setPendingMaintenanceActionsVarargs(value: ResourcePendingMaintenanceActions*): Self = StObject.set(x, "PendingMaintenanceActions", js.Array(value :_*))
  }
}
