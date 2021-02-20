package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMaintenanceWindowResult extends StObject {
  
  /**
    * The ID of the deleted maintenance window.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
}
object DeleteMaintenanceWindowResult {
  
  @scala.inline
  def apply(): DeleteMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMaintenanceWindowResult]
  }
  
  @scala.inline
  implicit class DeleteMaintenanceWindowResultMutableBuilder[Self <: DeleteMaintenanceWindowResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowIdUndefined: Self = StObject.set(x, "WindowId", js.undefined)
  }
}
