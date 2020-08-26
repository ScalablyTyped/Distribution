package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateResolverRuleRequest extends js.Object {
  /**
    * A name for the association that you're creating between a resolver rule and a VPC.
    */
  var Name: js.UndefOr[typings.awsSdk.route53resolverMod.Name] = js.native
  /**
    * The ID of the resolver rule that you want to associate with the VPC. To list the existing resolver rules, use ListResolverRules.
    */
  var ResolverRuleId: ResourceId = js.native
  /**
    * The ID of the VPC that you want to associate the resolver rule with.
    */
  var VPCId: ResourceId = js.native
}

object AssociateResolverRuleRequest {
  @scala.inline
  def apply(ResolverRuleId: ResourceId, VPCId: ResourceId): AssociateResolverRuleRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleId = ResolverRuleId.asInstanceOf[js.Any], VPCId = VPCId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateResolverRuleRequest]
  }
  @scala.inline
  implicit class AssociateResolverRuleRequestOps[Self <: AssociateResolverRuleRequest] (val x: Self) extends AnyVal {
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
    def setResolverRuleId(value: ResourceId): Self = this.set("ResolverRuleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVPCId(value: ResourceId): Self = this.set("VPCId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

