package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFirewallRuleRequest extends StObject {
  
  /**
    * The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain list:    ALLOW - Permit the request to go through.    ALERT - Permit the request and send metrics and logs to Cloud Watch.    BLOCK - Disallow the request. This option requires additional details in the rule's BlockResponse.   
    */
  var Action: typings.awsSdk.route53resolverMod.Action
  
  /**
    * The DNS record's type. This determines the format of the record value that you provided in BlockOverrideDomain. Used for the rule action BLOCK with a BlockResponse setting of OVERRIDE. This setting is required if the BlockResponse setting is OVERRIDE.
    */
  var BlockOverrideDnsType: js.UndefOr[typings.awsSdk.route53resolverMod.BlockOverrideDnsType] = js.undefined
  
  /**
    * The custom DNS record to send back in response to the query. Used for the rule action BLOCK with a BlockResponse setting of OVERRIDE. This setting is required if the BlockResponse setting is OVERRIDE.
    */
  var BlockOverrideDomain: js.UndefOr[typings.awsSdk.route53resolverMod.BlockOverrideDomain] = js.undefined
  
  /**
    * The recommended amount of time, in seconds, for the DNS resolver or web browser to cache the provided override record. Used for the rule action BLOCK with a BlockResponse setting of OVERRIDE. This setting is required if the BlockResponse setting is OVERRIDE.
    */
  var BlockOverrideTtl: js.UndefOr[typings.awsSdk.route53resolverMod.BlockOverrideTtl] = js.undefined
  
  /**
    * The way that you want DNS Firewall to block the request, used with the rule action setting BLOCK.     NODATA - Respond indicating that the query was successful, but no response is available for it.    NXDOMAIN - Respond indicating that the domain name that's in the query doesn't exist.    OVERRIDE - Provide a custom override in the response. This option requires custom handling details in the rule's BlockOverride* settings.    This setting is required if the rule action setting is BLOCK.
    */
  var BlockResponse: js.UndefOr[typings.awsSdk.route53resolverMod.BlockResponse] = js.undefined
  
  /**
    * A unique string that identifies the request and that allows you to retry failed requests without the risk of running the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp. 
    */
  var CreatorRequestId: typings.awsSdk.route53resolverMod.CreatorRequestId
  
  /**
    * The ID of the domain list that you want to use in the rule. 
    */
  var FirewallDomainListId: ResourceId
  
  /**
    * The unique identifier of the firewall rule group where you want to create the rule. 
    */
  var FirewallRuleGroupId: ResourceId
  
  /**
    * A name that lets you identify the rule in the rule group.
    */
  var Name: typings.awsSdk.route53resolverMod.Name
  
  /**
    * The setting that determines the processing order of the rule in the rule group. DNS Firewall processes the rules in a rule group by order of priority, starting from the lowest setting. You must specify a unique priority for each rule in a rule group. To make it easier to insert rules later, leave space between the numbers, for example, use 100, 200, and so on. You can change the priority setting for the rules in a rule group at any time.
    */
  var Priority: typings.awsSdk.route53resolverMod.Priority
}
object CreateFirewallRuleRequest {
  
  inline def apply(
    Action: Action,
    CreatorRequestId: CreatorRequestId,
    FirewallDomainListId: ResourceId,
    FirewallRuleGroupId: ResourceId,
    Name: Name,
    Priority: Priority
  ): CreateFirewallRuleRequest = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], CreatorRequestId = CreatorRequestId.asInstanceOf[js.Any], FirewallDomainListId = FirewallDomainListId.asInstanceOf[js.Any], FirewallRuleGroupId = FirewallRuleGroupId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFirewallRuleRequest]
  }
  
  extension [Self <: CreateFirewallRuleRequest](x: Self) {
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setBlockOverrideDnsType(value: BlockOverrideDnsType): Self = StObject.set(x, "BlockOverrideDnsType", value.asInstanceOf[js.Any])
    
    inline def setBlockOverrideDnsTypeUndefined: Self = StObject.set(x, "BlockOverrideDnsType", js.undefined)
    
    inline def setBlockOverrideDomain(value: BlockOverrideDomain): Self = StObject.set(x, "BlockOverrideDomain", value.asInstanceOf[js.Any])
    
    inline def setBlockOverrideDomainUndefined: Self = StObject.set(x, "BlockOverrideDomain", js.undefined)
    
    inline def setBlockOverrideTtl(value: BlockOverrideTtl): Self = StObject.set(x, "BlockOverrideTtl", value.asInstanceOf[js.Any])
    
    inline def setBlockOverrideTtlUndefined: Self = StObject.set(x, "BlockOverrideTtl", js.undefined)
    
    inline def setBlockResponse(value: BlockResponse): Self = StObject.set(x, "BlockResponse", value.asInstanceOf[js.Any])
    
    inline def setBlockResponseUndefined: Self = StObject.set(x, "BlockResponse", js.undefined)
    
    inline def setCreatorRequestId(value: CreatorRequestId): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    inline def setFirewallDomainListId(value: ResourceId): Self = StObject.set(x, "FirewallDomainListId", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleGroupId(value: ResourceId): Self = StObject.set(x, "FirewallRuleGroupId", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Priority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
  }
}
