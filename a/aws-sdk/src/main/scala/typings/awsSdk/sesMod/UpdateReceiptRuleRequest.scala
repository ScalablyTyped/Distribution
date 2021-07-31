package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateReceiptRuleRequest extends StObject {
  
  /**
    * A data structure that contains the updated receipt rule information.
    */
  var Rule: ReceiptRule
  
  /**
    * The name of the receipt rule set that the receipt rule belongs to.
    */
  var RuleSetName: ReceiptRuleSetName
}
object UpdateReceiptRuleRequest {
  
  @scala.inline
  def apply(Rule: ReceiptRule, RuleSetName: ReceiptRuleSetName): UpdateReceiptRuleRequest = {
    val __obj = js.Dynamic.literal(Rule = Rule.asInstanceOf[js.Any], RuleSetName = RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateReceiptRuleRequest]
  }
  
  @scala.inline
  implicit class UpdateReceiptRuleRequestMutableBuilder[Self <: UpdateReceiptRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRule(value: ReceiptRule): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleSetName(value: ReceiptRuleSetName): Self = StObject.set(x, "RuleSetName", value.asInstanceOf[js.Any])
  }
}
