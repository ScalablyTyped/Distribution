package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReceiptRuleSetResponse extends js.Object {
  
  /**
    * The metadata for the receipt rule set, which consists of the rule set name and the timestamp of when the rule set was created.
    */
  var Metadata: js.UndefOr[ReceiptRuleSetMetadata] = js.native
  
  /**
    * A list of the receipt rules that belong to the specified receipt rule set.
    */
  var Rules: js.UndefOr[ReceiptRulesList] = js.native
}
object DescribeReceiptRuleSetResponse {
  
  @scala.inline
  def apply(): DescribeReceiptRuleSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReceiptRuleSetResponse]
  }
  
  @scala.inline
  implicit class DescribeReceiptRuleSetResponseOps[Self <: DescribeReceiptRuleSetResponse] (val x: Self) extends AnyVal {
    
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
    def setMetadata(value: ReceiptRuleSetMetadata): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("Metadata", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: ReceiptRule*): Self = this.set("Rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: ReceiptRulesList): Self = this.set("Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("Rules", js.undefined)
  }
}
