package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateThirdPartyFirewallResponse extends StObject {
  
  /**
    * The current status for setting a Firewall Manager policy administrator's account as an administrator of the third-party firewall tenant.    ONBOARDING - The Firewall Manager policy administrator is being designated as a tenant administrator.    ONBOARD_COMPLETE - The Firewall Manager policy administrator is designated as a tenant administrator.    OFFBOARDING - The Firewall Manager policy administrator is being removed as a tenant administrator.    OFFBOARD_COMPLETE - The Firewall Manager policy administrator has been removed as a tenant administrator.    NOT_EXIST - The Firewall Manager policy administrator doesn't exist as a tenant administrator.  
    */
  var ThirdPartyFirewallStatus: js.UndefOr[ThirdPartyFirewallAssociationStatus] = js.undefined
}
object AssociateThirdPartyFirewallResponse {
  
  inline def apply(): AssociateThirdPartyFirewallResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateThirdPartyFirewallResponse]
  }
  
  extension [Self <: AssociateThirdPartyFirewallResponse](x: Self) {
    
    inline def setThirdPartyFirewallStatus(value: ThirdPartyFirewallAssociationStatus): Self = StObject.set(x, "ThirdPartyFirewallStatus", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyFirewallStatusUndefined: Self = StObject.set(x, "ThirdPartyFirewallStatus", js.undefined)
  }
}
