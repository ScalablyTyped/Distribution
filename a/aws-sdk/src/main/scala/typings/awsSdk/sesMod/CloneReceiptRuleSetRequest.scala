package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloneReceiptRuleSetRequest extends js.Object {
  /**
    * The name of the rule set to clone.
    */
  var OriginalRuleSetName: ReceiptRuleSetName = js.native
  /**
    * The name of the rule set to create. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Start and end with a letter or number.   Contain less than 64 characters.  
    */
  var RuleSetName: ReceiptRuleSetName = js.native
}

object CloneReceiptRuleSetRequest {
  @scala.inline
  def apply(OriginalRuleSetName: ReceiptRuleSetName, RuleSetName: ReceiptRuleSetName): CloneReceiptRuleSetRequest = {
    val __obj = js.Dynamic.literal(OriginalRuleSetName = OriginalRuleSetName.asInstanceOf[js.Any], RuleSetName = RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneReceiptRuleSetRequest]
  }
  @scala.inline
  implicit class CloneReceiptRuleSetRequestOps[Self <: CloneReceiptRuleSetRequest] (val x: Self) extends AnyVal {
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
    def setOriginalRuleSetName(value: ReceiptRuleSetName): Self = this.set("OriginalRuleSetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleSetName(value: ReceiptRuleSetName): Self = this.set("RuleSetName", value.asInstanceOf[js.Any])
  }
  
}

