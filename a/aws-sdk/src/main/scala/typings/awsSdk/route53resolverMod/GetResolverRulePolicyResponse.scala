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
  def apply(): GetResolverRulePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverRulePolicyResponse]
  }
  @scala.inline
  implicit class GetResolverRulePolicyResponseOps[Self <: GetResolverRulePolicyResponse] (val x: Self) extends AnyVal {
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
    def setResolverRulePolicy(value: ResolverRulePolicy): Self = this.set("ResolverRulePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolverRulePolicy: Self = this.set("ResolverRulePolicy", js.undefined)
  }
  
}

