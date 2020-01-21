package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResolverRulePolicyResponse extends js.Object {
  /**
    * Information about the resolver rule policy that you specified in a GetResolverRulePolicy request.
    */
  var ResolverRulePolicy: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverRulePolicy] = js.native
}

object GetResolverRulePolicyResponse {
  @scala.inline
  def apply(ResolverRulePolicy: ResolverRulePolicy = null): GetResolverRulePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (ResolverRulePolicy != null) __obj.updateDynamic("ResolverRulePolicy")(ResolverRulePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverRulePolicyResponse]
  }
}

