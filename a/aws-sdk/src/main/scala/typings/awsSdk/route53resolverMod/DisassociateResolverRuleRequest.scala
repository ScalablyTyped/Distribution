package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateResolverRuleRequest extends js.Object {
  /**
    * The ID of the resolver rule that you want to disassociate from the specified VPC.
    */
  var ResolverRuleId: ResourceId = js.native
  /**
    * The ID of the VPC that you want to disassociate the resolver rule from.
    */
  var VPCId: ResourceId = js.native
}

object DisassociateResolverRuleRequest {
  @scala.inline
  def apply(ResolverRuleId: ResourceId, VPCId: ResourceId): DisassociateResolverRuleRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleId = ResolverRuleId.asInstanceOf[js.Any], VPCId = VPCId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateResolverRuleRequest]
  }
  @scala.inline
  implicit class DisassociateResolverRuleRequestOps[Self <: DisassociateResolverRuleRequest] (val x: Self) extends AnyVal {
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
  }
  
}

