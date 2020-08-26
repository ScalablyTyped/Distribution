package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResolverRulePolicyRequest extends js.Object {
  /**
    * The ID of the resolver rule policy that you want to get information about.
    */
  var Arn: typings.awsSdk.route53resolverMod.Arn = js.native
}

object GetResolverRulePolicyRequest {
  @scala.inline
  def apply(Arn: Arn): GetResolverRulePolicyRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverRulePolicyRequest]
  }
  @scala.inline
  implicit class GetResolverRulePolicyRequestOps[Self <: GetResolverRulePolicyRequest] (val x: Self) extends AnyVal {
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
  }
  
}

