package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateThirdPartyFirewallResponse extends StObject {
  
  /**
    * The current status for the disassociation of a Firewall Manager administrators account with a third-party firewall.
    */
  var ThirdPartyFirewallStatus: js.UndefOr[ThirdPartyFirewallAssociationStatus] = js.undefined
}
object DisassociateThirdPartyFirewallResponse {
  
  inline def apply(): DisassociateThirdPartyFirewallResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateThirdPartyFirewallResponse]
  }
  
  extension [Self <: DisassociateThirdPartyFirewallResponse](x: Self) {
    
    inline def setThirdPartyFirewallStatus(value: ThirdPartyFirewallAssociationStatus): Self = StObject.set(x, "ThirdPartyFirewallStatus", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyFirewallStatusUndefined: Self = StObject.set(x, "ThirdPartyFirewallStatus", js.undefined)
  }
}
