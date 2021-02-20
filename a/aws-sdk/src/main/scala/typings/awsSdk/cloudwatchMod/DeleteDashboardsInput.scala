package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDashboardsInput extends StObject {
  
  /**
    * The dashboards to be deleted. This parameter is required.
    */
  var DashboardNames: typings.awsSdk.cloudwatchMod.DashboardNames = js.native
}
object DeleteDashboardsInput {
  
  @scala.inline
  def apply(DashboardNames: DashboardNames): DeleteDashboardsInput = {
    val __obj = js.Dynamic.literal(DashboardNames = DashboardNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDashboardsInput]
  }
  
  @scala.inline
  implicit class DeleteDashboardsInputMutableBuilder[Self <: DeleteDashboardsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashboardNames(value: DashboardNames): Self = StObject.set(x, "DashboardNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardNamesVarargs(value: DashboardName*): Self = StObject.set(x, "DashboardNames", js.Array(value :_*))
  }
}
