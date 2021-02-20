package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAnomalyMonitorResponse extends StObject {
  
  /**
    *  A cost anomaly monitor ARN. 
    */
  var MonitorArn: GenericString = js.native
}
object UpdateAnomalyMonitorResponse {
  
  @scala.inline
  def apply(MonitorArn: GenericString): UpdateAnomalyMonitorResponse = {
    val __obj = js.Dynamic.literal(MonitorArn = MonitorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAnomalyMonitorResponse]
  }
  
  @scala.inline
  implicit class UpdateAnomalyMonitorResponseMutableBuilder[Self <: UpdateAnomalyMonitorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMonitorArn(value: GenericString): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
  }
}
