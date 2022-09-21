package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCapacityProviderRequest extends StObject {
  
  /**
    * An object that represent the parameters to update for the Auto Scaling group capacity provider.
    */
  var autoScalingGroupProvider: AutoScalingGroupProviderUpdate
  
  /**
    * The name of the capacity provider to update.
    */
  var name: String
}
object UpdateCapacityProviderRequest {
  
  inline def apply(autoScalingGroupProvider: AutoScalingGroupProviderUpdate, name: String): UpdateCapacityProviderRequest = {
    val __obj = js.Dynamic.literal(autoScalingGroupProvider = autoScalingGroupProvider.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCapacityProviderRequest]
  }
  
  extension [Self <: UpdateCapacityProviderRequest](x: Self) {
    
    inline def setAutoScalingGroupProvider(value: AutoScalingGroupProviderUpdate): Self = StObject.set(x, "autoScalingGroupProvider", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
