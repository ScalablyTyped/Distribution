package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDashboardInput extends js.Object {
  
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
  implicit class GetDashboardInputOps[Self <: GetDashboardInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDashboardName(value: DashboardName): Self = this.set("DashboardName", value.asInstanceOf[js.Any])
  }
}
