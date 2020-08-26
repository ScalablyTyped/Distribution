package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRuleGroupRequest extends js.Object {
  /**
    * The RuleGroupId of the RuleGroup that you want to get. RuleGroupId is returned by CreateRuleGroup and by ListRuleGroups.
    */
  var RuleGroupId: ResourceId = js.native
}

object GetRuleGroupRequest {
  @scala.inline
  def apply(RuleGroupId: ResourceId): GetRuleGroupRequest = {
    val __obj = js.Dynamic.literal(RuleGroupId = RuleGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRuleGroupRequest]
  }
  @scala.inline
  implicit class GetRuleGroupRequestOps[Self <: GetRuleGroupRequest] (val x: Self) extends AnyVal {
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
    def setRuleGroupId(value: ResourceId): Self = this.set("RuleGroupId", value.asInstanceOf[js.Any])
  }
  
}

