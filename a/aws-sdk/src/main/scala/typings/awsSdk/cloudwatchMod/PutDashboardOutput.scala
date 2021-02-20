package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutDashboardOutput extends StObject {
  
  /**
    * If the input for PutDashboard was correct and the dashboard was successfully created or modified, this result is empty. If this result includes only warning messages, then the input was valid enough for the dashboard to be created or modified, but some elements of the dashboard might not render. If this result includes error messages, the input was not valid and the operation failed.
    */
  var DashboardValidationMessages: js.UndefOr[typings.awsSdk.cloudwatchMod.DashboardValidationMessages] = js.native
}
object PutDashboardOutput {
  
  @scala.inline
  def apply(): PutDashboardOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutDashboardOutput]
  }
  
  @scala.inline
  implicit class PutDashboardOutputMutableBuilder[Self <: PutDashboardOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashboardValidationMessages(value: DashboardValidationMessages): Self = StObject.set(x, "DashboardValidationMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardValidationMessagesUndefined: Self = StObject.set(x, "DashboardValidationMessages", js.undefined)
    
    @scala.inline
    def setDashboardValidationMessagesVarargs(value: DashboardValidationMessage*): Self = StObject.set(x, "DashboardValidationMessages", js.Array(value :_*))
  }
}
