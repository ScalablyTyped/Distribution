package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDashboardOutput extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the dashboard.
    */
  var DashboardArn: js.UndefOr[typings.awsSdk.cloudwatchMod.DashboardArn] = js.native
  
  /**
    * The detailed information about the dashboard, including what widgets are included and their location on the dashboard. For more information about the DashboardBody syntax, see Dashboard Body Structure and Syntax. 
    */
  var DashboardBody: js.UndefOr[typings.awsSdk.cloudwatchMod.DashboardBody] = js.native
  
  /**
    * The name of the dashboard.
    */
  var DashboardName: js.UndefOr[typings.awsSdk.cloudwatchMod.DashboardName] = js.native
}
object GetDashboardOutput {
  
  @scala.inline
  def apply(): GetDashboardOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDashboardOutput]
  }
  
  @scala.inline
  implicit class GetDashboardOutputOps[Self <: GetDashboardOutput] (val x: Self) extends AnyVal {
    
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
    def setDashboardArn(value: DashboardArn): Self = this.set("DashboardArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashboardArn: Self = this.set("DashboardArn", js.undefined)
    
    @scala.inline
    def setDashboardBody(value: DashboardBody): Self = this.set("DashboardBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashboardBody: Self = this.set("DashboardBody", js.undefined)
    
    @scala.inline
    def setDashboardName(value: DashboardName): Self = this.set("DashboardName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashboardName: Self = this.set("DashboardName", js.undefined)
  }
}
