package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutDashboardOutput extends StObject {
  
  /**
    * If the input for PutDashboard was correct and the dashboard was successfully created or modified, this result is empty. If this result includes only warning messages, then the input was valid enough for the dashboard to be created or modified, but some elements of the dashboard might not render. If this result includes error messages, the input was not valid and the operation failed.
    */
  var DashboardValidationMessages: js.UndefOr[typings.awsSdk.cloudwatchMod.DashboardValidationMessages] = js.undefined
}
object PutDashboardOutput {
  
  inline def apply(): PutDashboardOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutDashboardOutput]
  }
  
  extension [Self <: PutDashboardOutput](x: Self) {
    
    inline def setDashboardValidationMessages(value: DashboardValidationMessages): Self = StObject.set(x, "DashboardValidationMessages", value.asInstanceOf[js.Any])
    
    inline def setDashboardValidationMessagesUndefined: Self = StObject.set(x, "DashboardValidationMessages", js.undefined)
    
    inline def setDashboardValidationMessagesVarargs(value: DashboardValidationMessage*): Self = StObject.set(x, "DashboardValidationMessages", js.Array(value*))
  }
}
