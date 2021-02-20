package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAnomalyMonitorResponse extends StObject {
  
  /**
    *  The unique identifier of your newly created cost anomaly detection monitor.
    */
  var MonitorArn: GenericString = js.native
}
object CreateAnomalyMonitorResponse {
  
  @scala.inline
  def apply(MonitorArn: GenericString): CreateAnomalyMonitorResponse = {
    val __obj = js.Dynamic.literal(MonitorArn = MonitorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnomalyMonitorResponse]
  }
  
  @scala.inline
  implicit class CreateAnomalyMonitorResponseMutableBuilder[Self <: CreateAnomalyMonitorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMonitorArn(value: GenericString): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
  }
}
