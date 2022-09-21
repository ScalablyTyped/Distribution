package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityUpdate extends StObject {
  
  /**
    * The target auto scaling setting.
    */
  var autoScaling: js.UndefOr[AutoScalingUpdate] = js.undefined
  
  /**
    * The target settings for provisioned capacity.
    */
  var provisionedCapacity: js.UndefOr[ProvisionedCapacityUpdate] = js.undefined
}
object CapacityUpdate {
  
  inline def apply(): CapacityUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityUpdate]
  }
  
  extension [Self <: CapacityUpdate](x: Self) {
    
    inline def setAutoScaling(value: AutoScalingUpdate): Self = StObject.set(x, "autoScaling", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingUndefined: Self = StObject.set(x, "autoScaling", js.undefined)
    
    inline def setProvisionedCapacity(value: ProvisionedCapacityUpdate): Self = StObject.set(x, "provisionedCapacity", value.asInstanceOf[js.Any])
    
    inline def setProvisionedCapacityUndefined: Self = StObject.set(x, "provisionedCapacity", js.undefined)
  }
}
