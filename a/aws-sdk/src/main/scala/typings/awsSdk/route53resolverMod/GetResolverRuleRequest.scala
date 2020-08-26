package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResolverRuleRequest extends js.Object {
  /**
    * The ID of the resolver rule that you want to get information about.
    */
  var ResolverRuleId: ResourceId = js.native
}

object GetResolverRuleRequest {
  @scala.inline
  def apply(ResolverRuleId: ResourceId): GetResolverRuleRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleId = ResolverRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverRuleRequest]
  }
  @scala.inline
  implicit class GetResolverRuleRequestOps[Self <: GetResolverRuleRequest] (val x: Self) extends AnyVal {
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
  }
  
}

