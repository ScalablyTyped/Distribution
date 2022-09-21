package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyInstanceFleetInput extends StObject {
  
  /**
    * The unique identifier of the cluster.
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId
  
  /**
    * The configuration parameters of the instance fleet.
    */
  var InstanceFleet: InstanceFleetModifyConfig
}
object ModifyInstanceFleetInput {
  
  inline def apply(ClusterId: ClusterId, InstanceFleet: InstanceFleetModifyConfig): ModifyInstanceFleetInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any], InstanceFleet = InstanceFleet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceFleetInput]
  }
  
  extension [Self <: ModifyInstanceFleetInput](x: Self) {
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setInstanceFleet(value: InstanceFleetModifyConfig): Self = StObject.set(x, "InstanceFleet", value.asInstanceOf[js.Any])
  }
}
