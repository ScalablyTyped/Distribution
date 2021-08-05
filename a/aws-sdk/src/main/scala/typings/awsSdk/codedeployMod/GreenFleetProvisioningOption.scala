package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GreenFleetProvisioningOption extends StObject {
  
  /**
    * The method used to add instances to a replacement environment.    DISCOVER_EXISTING: Use instances that already exist or will be created manually.    COPY_AUTO_SCALING_GROUP: Use settings from a specified Auto Scaling group to define and create instances in a new Auto Scaling group.  
    */
  var action: js.UndefOr[GreenFleetProvisioningAction] = js.undefined
}
object GreenFleetProvisioningOption {
  
  inline def apply(): GreenFleetProvisioningOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GreenFleetProvisioningOption]
  }
  
  extension [Self <: GreenFleetProvisioningOption](x: Self) {
    
    inline def setAction(value: GreenFleetProvisioningAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
  }
}
