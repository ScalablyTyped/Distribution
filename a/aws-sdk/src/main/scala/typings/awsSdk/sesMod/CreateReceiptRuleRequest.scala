package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReceiptRuleRequest extends StObject {
  
  /**
    * The name of an existing rule after which the new rule will be placed. If this parameter is null, the new rule will be inserted at the beginning of the rule list.
    */
  var After: js.UndefOr[ReceiptRuleName] = js.undefined
  
  /**
    * A data structure that contains the specified rule's name, actions, recipients, domains, enabled status, scan status, and TLS policy.
    */
  var Rule: ReceiptRule
  
  /**
    * The name of the rule set that the receipt rule will be added to.
    */
  var RuleSetName: ReceiptRuleSetName
}
object CreateReceiptRuleRequest {
  
  @scala.inline
  def apply(Rule: ReceiptRule, RuleSetName: ReceiptRuleSetName): CreateReceiptRuleRequest = {
    val __obj = js.Dynamic.literal(Rule = Rule.asInstanceOf[js.Any], RuleSetName = RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReceiptRuleRequest]
  }
  
  @scala.inline
  implicit class CreateReceiptRuleRequestMutableBuilder[Self <: CreateReceiptRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: ReceiptRuleName): Self = StObject.set(x, "After", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterUndefined: Self = StObject.set(x, "After", js.undefined)
    
    @scala.inline
    def setRule(value: ReceiptRule): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleSetName(value: ReceiptRuleSetName): Self = StObject.set(x, "RuleSetName", value.asInstanceOf[js.Any])
  }
}
