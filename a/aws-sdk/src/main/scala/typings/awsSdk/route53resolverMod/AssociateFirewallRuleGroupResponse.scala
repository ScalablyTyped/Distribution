package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateFirewallRuleGroupResponse extends StObject {
  
  /**
    * The association that you just created. The association has an ID that you can use to identify it in other requests, like update and delete.
    */
  var FirewallRuleGroupAssociation: js.UndefOr[typings.awsSdk.route53resolverMod.FirewallRuleGroupAssociation] = js.undefined
}
object AssociateFirewallRuleGroupResponse {
  
  inline def apply(): AssociateFirewallRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateFirewallRuleGroupResponse]
  }
  
  extension [Self <: AssociateFirewallRuleGroupResponse](x: Self) {
    
    inline def setFirewallRuleGroupAssociation(value: FirewallRuleGroupAssociation): Self = StObject.set(x, "FirewallRuleGroupAssociation", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleGroupAssociationUndefined: Self = StObject.set(x, "FirewallRuleGroupAssociation", js.undefined)
  }
}
