package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReceiptRuleSetRequest extends js.Object {
  /**
    * The name of the receipt rule set to delete.
    */
  var RuleSetName: ReceiptRuleSetName = js.native
}

object DeleteReceiptRuleSetRequest {
  @scala.inline
  def apply(RuleSetName: ReceiptRuleSetName): DeleteReceiptRuleSetRequest = {
    val __obj = js.Dynamic.literal(RuleSetName = RuleSetName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteReceiptRuleSetRequest]
  }
}

