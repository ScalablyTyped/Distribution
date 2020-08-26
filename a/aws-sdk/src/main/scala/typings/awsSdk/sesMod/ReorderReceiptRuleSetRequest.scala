package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReorderReceiptRuleSetRequest extends js.Object {
  /**
    * A list of the specified receipt rule set's receipt rules in the order that you want to put them.
    */
  var RuleNames: ReceiptRuleNamesList = js.native
  /**
    * The name of the receipt rule set to reorder.
    */
  var RuleSetName: ReceiptRuleSetName = js.native
}

object ReorderReceiptRuleSetRequest {
  @scala.inline
  def apply(RuleNames: ReceiptRuleNamesList, RuleSetName: ReceiptRuleSetName): ReorderReceiptRuleSetRequest = {
    val __obj = js.Dynamic.literal(RuleNames = RuleNames.asInstanceOf[js.Any], RuleSetName = RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReorderReceiptRuleSetRequest]
  }
  @scala.inline
  implicit class ReorderReceiptRuleSetRequestOps[Self <: ReorderReceiptRuleSetRequest] (val x: Self) extends AnyVal {
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
    def setRuleNamesVarargs(value: ReceiptRuleName*): Self = this.set("RuleNames", js.Array(value :_*))
    @scala.inline
    def setRuleNames(value: ReceiptRuleNamesList): Self = this.set("RuleNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleSetName(value: ReceiptRuleSetName): Self = this.set("RuleSetName", value.asInstanceOf[js.Any])
  }
  
}

