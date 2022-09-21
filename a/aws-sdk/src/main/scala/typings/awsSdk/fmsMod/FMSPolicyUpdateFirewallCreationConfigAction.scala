package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FMSPolicyUpdateFirewallCreationConfigAction extends StObject {
  
  /**
    * Describes the remedial action.
    */
  var Description: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * A FirewallCreationConfig that you can copy into your current policy's SecurityServiceData in order to remedy scope violations.
    */
  var FirewallCreationConfig: js.UndefOr[ManagedServiceData] = js.undefined
}
object FMSPolicyUpdateFirewallCreationConfigAction {
  
  inline def apply(): FMSPolicyUpdateFirewallCreationConfigAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FMSPolicyUpdateFirewallCreationConfigAction]
  }
  
  extension [Self <: FMSPolicyUpdateFirewallCreationConfigAction](x: Self) {
    
    inline def setDescription(value: LengthBoundedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFirewallCreationConfig(value: ManagedServiceData): Self = StObject.set(x, "FirewallCreationConfig", value.asInstanceOf[js.Any])
    
    inline def setFirewallCreationConfigUndefined: Self = StObject.set(x, "FirewallCreationConfig", js.undefined)
  }
}
