package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAnomalyMonitorRequest extends js.Object {
  
  /**
    *  The cost anomaly detection monitor object that you want to create.
    */
  var AnomalyMonitor: typings.awsSdk.costexplorerMod.AnomalyMonitor = js.native
}
object CreateAnomalyMonitorRequest {
  
  @scala.inline
  def apply(AnomalyMonitor: AnomalyMonitor): CreateAnomalyMonitorRequest = {
    val __obj = js.Dynamic.literal(AnomalyMonitor = AnomalyMonitor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnomalyMonitorRequest]
  }
  
  @scala.inline
  implicit class CreateAnomalyMonitorRequestOps[Self <: CreateAnomalyMonitorRequest] (val x: Self) extends AnyVal {
    
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
    def setAnomalyMonitor(value: AnomalyMonitor): Self = this.set("AnomalyMonitor", value.asInstanceOf[js.Any])
  }
}
