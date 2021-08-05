package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResolverRuleRequest extends StObject {
  
  /**
    * A unique string that identifies the request and that allows failed requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp. 
    */
  var CreatorRequestId: typings.awsSdk.route53resolverMod.CreatorRequestId
  
  /**
    * DNS queries for this domain name are forwarded to the IP addresses that you specify in TargetIps. If a query matches multiple Resolver rules (example.com and www.example.com), outbound DNS queries are routed using the Resolver rule that contains the most specific domain name (www.example.com).
    */
  var DomainName: typings.awsSdk.route53resolverMod.DomainName
  
  /**
    * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
    */
  var Name: js.UndefOr[typings.awsSdk.route53resolverMod.Name] = js.undefined
  
  /**
    * The ID of the outbound Resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify in TargetIps.
    */
  var ResolverEndpointId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * When you want to forward DNS queries for specified domain name to resolvers on your network, specify FORWARD. When you have a forwarding rule to forward DNS queries for a domain to your network and you want Resolver to process queries for a subdomain of that domain, specify SYSTEM. For example, to forward DNS queries for example.com to resolvers on your network, you create a rule and specify FORWARD for RuleType. To then have Resolver process queries for apex.example.com, you create a rule and specify SYSTEM for RuleType. Currently, only Resolver can create rules that have a value of RECURSIVE for RuleType.
    */
  var RuleType: RuleTypeOption
  
  /**
    * A list of the tag keys and values that you want to associate with the endpoint.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The IPs that you want Resolver to forward DNS queries to. You can specify only IPv4 addresses. Separate IP addresses with a comma.  TargetIps is available only when the value of Rule type is FORWARD.
    */
  var TargetIps: js.UndefOr[TargetList] = js.undefined
}
object CreateResolverRuleRequest {
  
  inline def apply(CreatorRequestId: CreatorRequestId, DomainName: DomainName, RuleType: RuleTypeOption): CreateResolverRuleRequest = {
    val __obj = js.Dynamic.literal(CreatorRequestId = CreatorRequestId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], RuleType = RuleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResolverRuleRequest]
  }
  
  extension [Self <: CreateResolverRuleRequest](x: Self) {
    
    inline def setCreatorRequestId(value: CreatorRequestId): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResolverEndpointId(value: ResourceId): Self = StObject.set(x, "ResolverEndpointId", value.asInstanceOf[js.Any])
    
    inline def setResolverEndpointIdUndefined: Self = StObject.set(x, "ResolverEndpointId", js.undefined)
    
    inline def setRuleType(value: RuleTypeOption): Self = StObject.set(x, "RuleType", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setTargetIps(value: TargetList): Self = StObject.set(x, "TargetIps", value.asInstanceOf[js.Any])
    
    inline def setTargetIpsUndefined: Self = StObject.set(x, "TargetIps", js.undefined)
    
    inline def setTargetIpsVarargs(value: TargetAddress*): Self = StObject.set(x, "TargetIps", js.Array(value :_*))
  }
}
