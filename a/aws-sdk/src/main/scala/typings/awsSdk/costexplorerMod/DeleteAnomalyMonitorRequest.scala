package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAnomalyMonitorRequest extends StObject {
  
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
  implicit class DeleteAnomalyMonitorRequestMutableBuilder[Self <: DeleteAnomalyMonitorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMonitorArn(value: GenericString): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
  }
}
