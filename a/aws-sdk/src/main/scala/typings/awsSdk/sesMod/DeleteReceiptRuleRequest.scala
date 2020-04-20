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
}

