package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateThirdPartyFirewallRequest extends StObject {
  
  /**
    * The name of the third-party firewall vendor.
    */
  var ThirdPartyFirewall: typings.awsSdk.fmsMod.ThirdPartyFirewall
}
object AssociateThirdPartyFirewallRequest {
  
  inline def apply(ThirdPartyFirewall: ThirdPartyFirewall): AssociateThirdPartyFirewallRequest = {
    val __obj = js.Dynamic.literal(ThirdPartyFirewall = ThirdPartyFirewall.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateThirdPartyFirewallRequest]
  }
  
  extension [Self <: AssociateThirdPartyFirewallRequest](x: Self) {
    
    inline def setThirdPartyFirewall(value: ThirdPartyFirewall): Self = StObject.set(x, "ThirdPartyFirewall", value.asInstanceOf[js.Any])
  }
}
