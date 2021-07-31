package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAnomalyMonitorRequest extends StObject {
  
  /**
    *  Cost anomaly monitor Amazon Resource Names (ARNs). 
    */
  var MonitorArn: GenericString
  
  /**
    *  The new name for the cost anomaly monitor. 
    */
  var MonitorName: js.UndefOr[GenericString] = js.undefined
}
object UpdateAnomalyMonitorRequest {
  
  @scala.inline
  def apply(MonitorArn: GenericString): UpdateAnomalyMonitorRequest = {
    val __obj = js.Dynamic.literal(MonitorArn = MonitorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAnomalyMonitorRequest]
  }
  
  @scala.inline
  implicit class UpdateAnomalyMonitorRequestMutableBuilder[Self <: UpdateAnomalyMonitorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMonitorArn(value: GenericString): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorName(value: GenericString): Self = StObject.set(x, "MonitorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorNameUndefined: Self = StObject.set(x, "MonitorName", js.undefined)
  }
}
