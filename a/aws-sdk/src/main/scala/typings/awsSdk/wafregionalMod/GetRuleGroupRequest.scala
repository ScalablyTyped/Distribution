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
}

