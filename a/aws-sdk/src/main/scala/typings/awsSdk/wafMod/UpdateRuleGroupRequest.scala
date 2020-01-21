package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRuleGroupRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafMod.ChangeToken = js.native
  /**
    * The RuleGroupId of the RuleGroup that you want to update. RuleGroupId is returned by CreateRuleGroup and by ListRuleGroups.
    */
  var RuleGroupId: ResourceId = js.native
  /**
    * An array of RuleGroupUpdate objects that you want to insert into or delete from a RuleGroup. You can only insert REGULAR rules into a rule group.  ActivatedRule|OverrideAction applies only when updating or adding a RuleGroup to a WebACL. In this case you do not use ActivatedRule|Action. For all other update requests, ActivatedRule|Action is used instead of ActivatedRule|OverrideAction.
    */
  var Updates: RuleGroupUpdates = js.native
}

object UpdateRuleGroupRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, RuleGroupId: ResourceId, Updates: RuleGroupUpdates): UpdateRuleGroupRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], RuleGroupId = RuleGroupId.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateRuleGroupRequest]
  }
}

