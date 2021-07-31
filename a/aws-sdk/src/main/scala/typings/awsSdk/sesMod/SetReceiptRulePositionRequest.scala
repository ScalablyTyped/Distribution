package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetReceiptRulePositionRequest extends StObject {
  
  /**
    * The name of the receipt rule after which to place the specified receipt rule.
    */
  var After: js.UndefOr[ReceiptRuleName] = js.undefined
  
  /**
    * The name of the receipt rule to reposition.
    */
  var RuleName: ReceiptRuleName
  
  /**
    * The name of the receipt rule set that contains the receipt rule to reposition.
    */
  var RuleSetName: ReceiptRuleSetName
}
object SetReceiptRulePositionRequest {
  
  @scala.inline
  def apply(RuleName: ReceiptRuleName, RuleSetName: ReceiptRuleSetName): SetReceiptRulePositionRequest = {
    val __obj = js.Dynamic.literal(RuleName = RuleName.asInstanceOf[js.Any], RuleSetName = RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetReceiptRulePositionRequest]
  }
  
  @scala.inline
  implicit class SetReceiptRulePositionRequestMutableBuilder[Self <: SetReceiptRulePositionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: ReceiptRuleName): Self = StObject.set(x, "After", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterUndefined: Self = StObject.set(x, "After", js.undefined)
    
    @scala.inline
    def setRuleName(value: ReceiptRuleName): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleSetName(value: ReceiptRuleSetName): Self = StObject.set(x, "RuleSetName", value.asInstanceOf[js.Any])
  }
}
