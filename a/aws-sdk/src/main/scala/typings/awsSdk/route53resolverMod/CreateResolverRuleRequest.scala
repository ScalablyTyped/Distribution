package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResolverRuleRequest extends js.Object {
  /**
    * A unique string that identifies the request and that allows failed requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp. 
    */
  var CreatorRequestId: typings.awsSdk.route53resolverMod.CreatorRequestId = js.native
  /**
    * DNS queries for this domain name are forwarded to the IP addresses that you specify in TargetIps. If a query matches multiple resolver rules (example.com and www.example.com), outbound DNS queries are routed using the resolver rule that contains the most specific domain name (www.example.com).
    */
  var DomainName: typings.awsSdk.route53resolverMod.DomainName = js.native
  /**
    * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
    */
  var Name: js.UndefOr[typings.awsSdk.route53resolverMod.Name] = js.native
  /**
    * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify in TargetIps.
    */
  var ResolverEndpointId: js.UndefOr[ResourceId] = js.native
  /**
    * Specify FORWARD. Other resolver rule types aren't supported.
    */
  var RuleType: RuleTypeOption = js.native
  /**
    * A list of the tag keys and values that you want to associate with the endpoint.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The IPs that you want Resolver to forward DNS queries to. You can specify only IPv4 addresses. Separate IP addresses with a comma.
    */
  var TargetIps: js.UndefOr[TargetList] = js.native
}

object CreateResolverRuleRequest {
  @scala.inline
  def apply(CreatorRequestId: CreatorRequestId, DomainName: DomainName, RuleType: RuleTypeOption): CreateResolverRuleRequest = {
    val __obj = js.Dynamic.literal(CreatorRequestId = CreatorRequestId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], RuleType = RuleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResolverRuleRequest]
  }
  @scala.inline
  implicit class CreateResolverRuleRequestOps[Self <: CreateResolverRuleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreatorRequestId(value: CreatorRequestId): Self = this.set("CreatorRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleType(value: RuleTypeOption): Self = this.set("RuleType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setResolverEndpointId(value: ResourceId): Self = this.set("ResolverEndpointId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolverEndpointId: Self = this.set("ResolverEndpointId", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setTargetIpsVarargs(value: TargetAddress*): Self = this.set("TargetIps", js.Array(value :_*))
    @scala.inline
    def setTargetIps(value: TargetList): Self = this.set("TargetIps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetIps: Self = this.set("TargetIps", js.undefined)
  }
  
}

