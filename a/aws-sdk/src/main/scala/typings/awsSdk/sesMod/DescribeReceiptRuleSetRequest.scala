package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReceiptRuleSetRequest extends js.Object {
  /**
    * The name of the receipt rule set to describe.
    */
  var RuleSetName: ReceiptRuleSetName = js.native
}

object DescribeReceiptRuleSetRequest {
  @scala.inline
  def apply(RuleSetName: ReceiptRuleSetName): DescribeReceiptRuleSetRequest = {
    val __obj = js.Dynamic.literal(RuleSetName = RuleSetName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeReceiptRuleSetRequest]
  }
}

