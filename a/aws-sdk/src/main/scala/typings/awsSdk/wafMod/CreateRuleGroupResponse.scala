package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRuleGroupResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateRuleGroup request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafMod.ChangeToken] = js.native
  /**
    * An empty RuleGroup.
    */
  var RuleGroup: js.UndefOr[typings.awsSdk.wafMod.RuleGroup] = js.native
}

object CreateRuleGroupResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null, RuleGroup: RuleGroup = null): CreateRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken.asInstanceOf[js.Any])
    if (RuleGroup != null) __obj.updateDynamic("RuleGroup")(RuleGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRuleGroupResponse]
  }
}

