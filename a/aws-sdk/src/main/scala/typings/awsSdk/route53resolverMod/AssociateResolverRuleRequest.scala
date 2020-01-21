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
  def apply(ResolverRuleId: ResourceId, VPCId: ResourceId, Name: Name = null): AssociateResolverRuleRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleId = ResolverRuleId.asInstanceOf[js.Any], VPCId = VPCId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateResolverRuleRequest]
  }
}

