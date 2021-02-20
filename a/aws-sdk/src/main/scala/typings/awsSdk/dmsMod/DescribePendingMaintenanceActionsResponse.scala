package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePendingMaintenanceActionsResponse extends StObject {
  
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
  def apply(): DescribePendingMaintenanceActionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePendingMaintenanceActionsResponse]
  }
  
  @scala.inline
  implicit class DescribePendingMaintenanceActionsResponseMutableBuilder[Self <: DescribePendingMaintenanceActionsResponse] (val x: Self) extends AnyVal {
    
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
