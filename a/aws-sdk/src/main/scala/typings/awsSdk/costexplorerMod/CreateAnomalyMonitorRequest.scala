package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAnomalyMonitorRequest extends StObject {
  
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
  implicit class CreateAnomalyMonitorRequestMutableBuilder[Self <: CreateAnomalyMonitorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnomalyMonitor(value: AnomalyMonitor): Self = StObject.set(x, "AnomalyMonitor", value.asInstanceOf[js.Any])
  }
}
