package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReceiptRuleRequest extends js.Object {
  
  /**
    * The name of an existing rule after which the new rule will be placed. If this parameter is null, the new rule will be inserted at the beginning of the rule list.
    */
  var After: js.UndefOr[ReceiptRuleName] = js.native
  
  /**
    * A data structure that contains the specified rule's name, actions, recipients, domains, enabled status, scan status, and TLS policy.
    */
  var Rule: ReceiptRule = js.native
  
  /**
    * The name of the rule set that the receipt rule will be added to.
    */
  var RuleSetName: ReceiptRuleSetName = js.native
}
object CreateReceiptRuleRequest {
  
  @scala.inline
  def apply(Rule: ReceiptRule, RuleSetName: ReceiptRuleSetName): CreateReceiptRuleRequest = {
    val __obj = js.Dynamic.literal(Rule = Rule.asInstanceOf[js.Any], RuleSetName = RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReceiptRuleRequest]
  }
  
  @scala.inline
  implicit class CreateReceiptRuleRequestOps[Self <: CreateReceiptRuleRequest] (val x: Self) extends AnyVal {
    
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
    def setRuleSetName(value: ReceiptRuleSetName): Self = this.set("RuleSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfter(value: ReceiptRuleName): Self = this.set("After", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("After", js.undefined)
  }
}
