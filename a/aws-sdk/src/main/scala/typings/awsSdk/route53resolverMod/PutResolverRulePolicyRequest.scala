package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutResolverRulePolicyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the account that you want to grant permissions to.
    */
  var Arn: typings.awsSdk.route53resolverMod.Arn = js.native
  /**
    * An AWS Identity and Access Management policy statement that lists the permissions that you want to grant to another AWS account.
    */
  var ResolverRulePolicy: typings.awsSdk.route53resolverMod.ResolverRulePolicy = js.native
}

object PutResolverRulePolicyRequest {
  @scala.inline
  def apply(Arn: Arn, ResolverRulePolicy: ResolverRulePolicy): PutResolverRulePolicyRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], ResolverRulePolicy = ResolverRulePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResolverRulePolicyRequest]
  }
  @scala.inline
  implicit class PutResolverRulePolicyRequestOps[Self <: PutResolverRulePolicyRequest] (val x: Self) extends AnyVal {
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolverRulePolicy(value: ResolverRulePolicy): Self = this.set("ResolverRulePolicy", value.asInstanceOf[js.Any])
  }
  
}

