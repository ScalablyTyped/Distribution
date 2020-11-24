package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAnomalyMonitorRequest extends js.Object {
  
  /**
    *  Cost anomaly monitor Amazon Resource Names (ARNs). 
    */
  var MonitorArn: GenericString = js.native
  
  /**
    *  The new name for the cost anomaly monitor. 
    */
  var MonitorName: js.UndefOr[GenericString] = js.native
}
object UpdateAnomalyMonitorRequest {
  
  @scala.inline
  def apply(MonitorArn: GenericString): UpdateAnomalyMonitorRequest = {
    val __obj = js.Dynamic.literal(MonitorArn = MonitorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAnomalyMonitorRequest]
  }
  
  @scala.inline
  implicit class UpdateAnomalyMonitorRequestOps[Self <: UpdateAnomalyMonitorRequest] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setMonitorName(value: GenericString): Self = this.set("MonitorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitorName: Self = this.set("MonitorName", js.undefined)
  }
}
