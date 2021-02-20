package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDashboardInput extends StObject {
  
  /**
    * The name of the dashboard to be described.
    */
  var DashboardName: typings.awsSdk.cloudwatchMod.DashboardName = js.native
}
object GetDashboardInput {
  
  @scala.inline
  def apply(DashboardName: DashboardName): GetDashboardInput = {
    val __obj = js.Dynamic.literal(DashboardName = DashboardName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDashboardInput]
  }
  
  @scala.inline
  implicit class GetDashboardInputMutableBuilder[Self <: GetDashboardInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashboardName(value: DashboardName): Self = StObject.set(x, "DashboardName", value.asInstanceOf[js.Any])
  }
}
