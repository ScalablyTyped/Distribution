package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRuleGroupResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateRuleGroup request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafregionalMod.ChangeToken] = js.native
  /**
    * An empty RuleGroup.
    */
  var RuleGroup: js.UndefOr[typings.awsSdk.wafregionalMod.RuleGroup] = js.native
}

object CreateRuleGroupResponse {
  @scala.inline
  def apply(): CreateRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRuleGroupResponse]
  }
  @scala.inline
  implicit class CreateRuleGroupResponseOps[Self <: CreateRuleGroupResponse] (val x: Self) extends AnyVal {
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
    def setChangeToken(value: ChangeToken): Self = this.set("ChangeToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeToken: Self = this.set("ChangeToken", js.undefined)
    @scala.inline
    def setRuleGroup(value: RuleGroup): Self = this.set("RuleGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleGroup: Self = this.set("RuleGroup", js.undefined)
  }
  
}

