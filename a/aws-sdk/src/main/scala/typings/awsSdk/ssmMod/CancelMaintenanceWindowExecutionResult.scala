package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelMaintenanceWindowExecutionResult extends StObject {
  
  /**
    * The ID of the maintenance window execution that has been stopped.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
}
object CancelMaintenanceWindowExecutionResult {
  
  @scala.inline
  def apply(): CancelMaintenanceWindowExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelMaintenanceWindowExecutionResult]
  }
  
  @scala.inline
  implicit class CancelMaintenanceWindowExecutionResultMutableBuilder[Self <: CancelMaintenanceWindowExecutionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = StObject.set(x, "WindowExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowExecutionIdUndefined: Self = StObject.set(x, "WindowExecutionId", js.undefined)
  }
}
