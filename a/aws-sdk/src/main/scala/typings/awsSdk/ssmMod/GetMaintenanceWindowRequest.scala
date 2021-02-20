package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMaintenanceWindowRequest extends StObject {
  
  /**
    * The ID of the maintenance window for which you want to retrieve information.
    */
  var WindowId: MaintenanceWindowId = js.native
}
object GetMaintenanceWindowRequest {
  
  @scala.inline
  def apply(WindowId: MaintenanceWindowId): GetMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMaintenanceWindowRequest]
  }
  
  @scala.inline
  implicit class GetMaintenanceWindowRequestMutableBuilder[Self <: GetMaintenanceWindowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
  }
}
