package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateThirdPartyFirewallRequest extends StObject {
  
  /**
    * The name of the third-party firewall vendor.
    */
  var ThirdPartyFirewall: typings.awsSdk.fmsMod.ThirdPartyFirewall
}
object DisassociateThirdPartyFirewallRequest {
  
  inline def apply(ThirdPartyFirewall: ThirdPartyFirewall): DisassociateThirdPartyFirewallRequest = {
    val __obj = js.Dynamic.literal(ThirdPartyFirewall = ThirdPartyFirewall.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateThirdPartyFirewallRequest]
  }
  
  extension [Self <: DisassociateThirdPartyFirewallRequest](x: Self) {
    
    inline def setThirdPartyFirewall(value: ThirdPartyFirewall): Self = StObject.set(x, "ThirdPartyFirewall", value.asInstanceOf[js.Any])
  }
}
