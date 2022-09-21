package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnmonitorInstancesResult extends StObject {
  
  /**
    * The monitoring information.
    */
  var InstanceMonitorings: js.UndefOr[InstanceMonitoringList] = js.undefined
}
object UnmonitorInstancesResult {
  
  inline def apply(): UnmonitorInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmonitorInstancesResult]
  }
  
  extension [Self <: UnmonitorInstancesResult](x: Self) {
    
    inline def setInstanceMonitorings(value: InstanceMonitoringList): Self = StObject.set(x, "InstanceMonitorings", value.asInstanceOf[js.Any])
    
    inline def setInstanceMonitoringsUndefined: Self = StObject.set(x, "InstanceMonitorings", js.undefined)
    
    inline def setInstanceMonitoringsVarargs(value: InstanceMonitoring*): Self = StObject.set(x, "InstanceMonitorings", js.Array(value*))
  }
}
