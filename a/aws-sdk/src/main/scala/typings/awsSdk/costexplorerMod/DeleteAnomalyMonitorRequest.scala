package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAnomalyMonitorRequest extends js.Object {
  
  /**
    *  The unique identifier of the cost anomaly monitor that you want to delete. 
    */
  var MonitorArn: GenericString = js.native
}
object DeleteAnomalyMonitorRequest {
  
  @scala.inline
  def apply(MonitorArn: GenericString): DeleteAnomalyMonitorRequest = {
    val __obj = js.Dynamic.literal(MonitorArn = MonitorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnomalyMonitorRequest]
  }
  
  @scala.inline
  implicit class DeleteAnomalyMonitorRequestOps[Self <: DeleteAnomalyMonitorRequest] (val x: Self) extends AnyVal {
    
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
    def setMonitorArn(value: GenericString): Self = this.set("MonitorArn", value.asInstanceOf[js.Any])
  }
}
