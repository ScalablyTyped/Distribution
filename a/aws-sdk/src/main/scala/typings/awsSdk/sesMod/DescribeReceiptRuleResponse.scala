package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReceiptRuleResponse extends js.Object {
  /**
    * A data structure that contains the specified receipt rule's name, actions, recipients, domains, enabled status, scan status, and Transport Layer Security (TLS) policy.
    */
  var Rule: js.UndefOr[ReceiptRule] = js.native
}

object DescribeReceiptRuleResponse {
  @scala.inline
  def apply(): DescribeReceiptRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReceiptRuleResponse]
  }
  @scala.inline
  implicit class DescribeReceiptRuleResponseOps[Self <: DescribeReceiptRuleResponse] (val x: Self) extends AnyVal {
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
    def setRule(value: ReceiptRule): Self = this.set("Rule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRule: Self = this.set("Rule", js.undefined)
  }
  
}

