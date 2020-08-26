package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReceiptRuleRequest extends js.Object {
  /**
    * The name of the receipt rule to delete.
    */
  var RuleName: ReceiptRuleName = js.native
  /**
    * The name of the receipt rule set that contains the receipt rule to delete.
    */
  var RuleSetName: ReceiptRuleSetName = js.native
}

object DeleteReceiptRuleRequest {
  @scala.inline
  def apply(RuleName: ReceiptRuleName, RuleSetName: ReceiptRuleSetName): DeleteReceiptRuleRequest = {
    val __obj = js.Dynamic.literal(RuleName = RuleName.asInstanceOf[js.Any], RuleSetName = RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReceiptRuleRequest]
  }
  @scala.inline
  implicit class DeleteReceiptRuleRequestOps[Self <: DeleteReceiptRuleRequest] (val x: Self) extends AnyVal {
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
    def setRuleName(value: ReceiptRuleName): Self = this.set("RuleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleSetName(value: ReceiptRuleSetName): Self = this.set("RuleSetName", value.asInstanceOf[js.Any])
  }
  
}

