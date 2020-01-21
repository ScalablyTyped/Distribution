package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRuleGroupResponse extends js.Object {
  /**
    * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of the entity at the time of the request. To make changes to the entity associated with the token, you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made, the update fails with a WAFOptimisticLockException. If this happens, perform another get, and use the new token returned by that operation. 
    */
  var LockToken: js.UndefOr[typings.awsSdk.wafv2Mod.LockToken] = js.native
  /**
    * 
    */
  var RuleGroup: js.UndefOr[typings.awsSdk.wafv2Mod.RuleGroup] = js.native
}

object GetRuleGroupResponse {
  @scala.inline
  def apply(LockToken: LockToken = null, RuleGroup: RuleGroup = null): GetRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (LockToken != null) __obj.updateDynamic("LockToken")(LockToken.asInstanceOf[js.Any])
    if (RuleGroup != null) __obj.updateDynamic("RuleGroup")(RuleGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRuleGroupResponse]
  }
}

