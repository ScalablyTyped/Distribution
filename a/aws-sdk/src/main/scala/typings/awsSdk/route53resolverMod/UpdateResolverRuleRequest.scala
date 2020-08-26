package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResolverRuleRequest extends js.Object {
  /**
    * The new settings for the resolver rule.
    */
  var Config: ResolverRuleConfig = js.native
  /**
    * The ID of the resolver rule that you want to update.
    */
  var ResolverRuleId: ResourceId = js.native
}

object UpdateResolverRuleRequest {
  @scala.inline
  def apply(Config: ResolverRuleConfig, ResolverRuleId: ResourceId): UpdateResolverRuleRequest = {
    val __obj = js.Dynamic.literal(Config = Config.asInstanceOf[js.Any], ResolverRuleId = ResolverRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResolverRuleRequest]
  }
  @scala.inline
  implicit class UpdateResolverRuleRequestOps[Self <: UpdateResolverRuleRequest] (val x: Self) extends AnyVal {
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
    def setConfig(value: ResolverRuleConfig): Self = this.set("Config", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolverRuleId(value: ResourceId): Self = this.set("ResolverRuleId", value.asInstanceOf[js.Any])
  }
  
}

