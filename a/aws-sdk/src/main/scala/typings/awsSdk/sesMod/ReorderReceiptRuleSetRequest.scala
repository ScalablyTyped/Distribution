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
}

