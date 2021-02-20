package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverRule extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) for the Resolver rule specified by Id.
    */
  var Arn: js.UndefOr[typings.awsSdk.route53resolverMod.Arn] = js.native
  
  /**
    * The date and time that the Resolver rule was created, in Unix time format and Coordinated Universal Time (UTC).
    */
  var CreationTime: js.UndefOr[Rfc3339TimeString] = js.native
  
  /**
    * A unique string that you specified when you created the Resolver rule. CreatorRequestId identifies the request and allows failed requests to be retried without the risk of executing the operation twice. 
    */
  var CreatorRequestId: js.UndefOr[typings.awsSdk.route53resolverMod.CreatorRequestId] = js.native
  
  /**
    * DNS queries for this domain name are forwarded to the IP addresses that are specified in TargetIps. If a query matches multiple Resolver rules (example.com and www.example.com), the query is routed using the Resolver rule that contains the most specific domain name (www.example.com).
    */
  var DomainName: js.UndefOr[typings.awsSdk.route53resolverMod.DomainName] = js.native
  
  /**
    * The ID that Resolver assigned to the Resolver rule when you created it.
    */
  var Id: js.UndefOr[ResourceId] = js.native
  
  /**
    * The date and time that the Resolver rule was last updated, in Unix time format and Coordinated Universal Time (UTC).
    */
  var ModificationTime: js.UndefOr[Rfc3339TimeString] = js.native
  
  /**
    * The name for the Resolver rule, which you specified when you created the Resolver rule.
    */
  var Name: js.UndefOr[typings.awsSdk.route53resolverMod.Name] = js.native
  
  /**
    * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
    */
  var OwnerId: js.UndefOr[AccountId] = js.native
  
  /**
    * The ID of the endpoint that the rule is associated with.
    */
  var ResolverEndpointId: js.UndefOr[ResourceId] = js.native
  
  /**
    * When you want to forward DNS queries for specified domain name to resolvers on your network, specify FORWARD. When you have a forwarding rule to forward DNS queries for a domain to your network and you want Resolver to process queries for a subdomain of that domain, specify SYSTEM. For example, to forward DNS queries for example.com to resolvers on your network, you create a rule and specify FORWARD for RuleType. To then have Resolver process queries for apex.example.com, you create a rule and specify SYSTEM for RuleType. Currently, only Resolver can create rules that have a value of RECURSIVE for RuleType.
    */
  var RuleType: js.UndefOr[RuleTypeOption] = js.native
  
  /**
    * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
    */
  var ShareStatus: js.UndefOr[typings.awsSdk.route53resolverMod.ShareStatus] = js.native
  
  /**
    * A code that specifies the current status of the Resolver rule.
    */
  var Status: js.UndefOr[ResolverRuleStatus] = js.native
  
  /**
    * A detailed description of the status of a Resolver rule.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.route53resolverMod.StatusMessage] = js.native
  
  /**
    * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS queries to. Typically, these are the IP addresses of DNS resolvers on your network. Specify IPv4 addresses. IPv6 is not supported.
    */
  var TargetIps: js.UndefOr[TargetList] = js.native
}
object ResolverRule {
  
  @scala.inline
  def apply(): ResolverRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverRule]
  }
  
  @scala.inline
  implicit class ResolverRuleMutableBuilder[Self <: ResolverRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Rfc3339TimeString): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setCreatorRequestId(value: CreatorRequestId): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    @scala.inline
    def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setModificationTime(value: Rfc3339TimeString): Self = StObject.set(x, "ModificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModificationTimeUndefined: Self = StObject.set(x, "ModificationTime", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOwnerId(value: AccountId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setResolverEndpointId(value: ResourceId): Self = StObject.set(x, "ResolverEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverEndpointIdUndefined: Self = StObject.set(x, "ResolverEndpointId", js.undefined)
    
    @scala.inline
    def setRuleType(value: RuleTypeOption): Self = StObject.set(x, "RuleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleTypeUndefined: Self = StObject.set(x, "RuleType", js.undefined)
    
    @scala.inline
    def setShareStatus(value: ShareStatus): Self = StObject.set(x, "ShareStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareStatusUndefined: Self = StObject.set(x, "ShareStatus", js.undefined)
    
    @scala.inline
    def setStatus(value: ResolverRuleStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTargetIps(value: TargetList): Self = StObject.set(x, "TargetIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIpsUndefined: Self = StObject.set(x, "TargetIps", js.undefined)
    
    @scala.inline
    def setTargetIpsVarargs(value: TargetAddress*): Self = StObject.set(x, "TargetIps", js.Array(value :_*))
  }
}
