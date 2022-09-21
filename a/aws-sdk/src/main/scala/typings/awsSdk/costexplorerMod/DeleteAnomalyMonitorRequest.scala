package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAnomalyMonitorRequest extends StObject {
  
  /**
    * The unique identifier of the cost anomaly monitor that you want to delete. 
    */
  var MonitorArn: GenericString
}
object DeleteAnomalyMonitorRequest {
  
  inline def apply(MonitorArn: GenericString): DeleteAnomalyMonitorRequest = {
    val __obj = js.Dynamic.literal(MonitorArn = MonitorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnomalyMonitorRequest]
  }
  
  extension [Self <: DeleteAnomalyMonitorRequest](x: Self) {
    
    inline def setMonitorArn(value: GenericString): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
  }
}
