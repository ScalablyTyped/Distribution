package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFirewallRuleGroupAssociationRequest extends StObject {
  
  /**
    * The identifier of the FirewallRuleGroupAssociation. 
    */
  var FirewallRuleGroupAssociationId: ResourceId
  
  /**
    * If enabled, this setting disallows modification or removal of the association, to help prevent against accidentally altering DNS firewall protections. 
    */
  var MutationProtection: js.UndefOr[MutationProtectionStatus] = js.undefined
  
  /**
    * The name of the rule group association.
    */
  var Name: js.UndefOr[typings.awsSdk.route53resolverMod.Name] = js.undefined
  
  /**
    * The setting that determines the processing order of the rule group among the rule groups that you associate with the specified VPC. DNS Firewall filters VPC traffic starting from the rule group with the lowest numeric priority setting.  You must specify a unique priority for each rule group that you associate with a single VPC. To make it easier to insert rule groups later, leave space between the numbers, for example, use 100, 200, and so on. You can change the priority setting for a rule group association after you create it.
    */
  var Priority: js.UndefOr[typings.awsSdk.route53resolverMod.Priority] = js.undefined
}
object UpdateFirewallRuleGroupAssociationRequest {
  
  inline def apply(FirewallRuleGroupAssociationId: ResourceId): UpdateFirewallRuleGroupAssociationRequest = {
    val __obj = js.Dynamic.literal(FirewallRuleGroupAssociationId = FirewallRuleGroupAssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFirewallRuleGroupAssociationRequest]
  }
  
  extension [Self <: UpdateFirewallRuleGroupAssociationRequest](x: Self) {
    
    inline def setFirewallRuleGroupAssociationId(value: ResourceId): Self = StObject.set(x, "FirewallRuleGroupAssociationId", value.asInstanceOf[js.Any])
    
    inline def setMutationProtection(value: MutationProtectionStatus): Self = StObject.set(x, "MutationProtection", value.asInstanceOf[js.Any])
    
    inline def setMutationProtectionUndefined: Self = StObject.set(x, "MutationProtection", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPriority(value: Priority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
  }
}
