package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReceiptRuleRequest extends StObject {
  
  /**
    * The name of the receipt rule to delete.
    */
  var RuleName: ReceiptRuleName
  
  /**
    * The name of the receipt rule set that contains the receipt rule to delete.
    */
  var RuleSetName: ReceiptRuleSetName
}
object DeleteReceiptRuleRequest {
  
  @scala.inline
  def apply(RuleName: ReceiptRuleName, RuleSetName: ReceiptRuleSetName): DeleteReceiptRuleRequest = {
    val __obj = js.Dynamic.literal(RuleName = RuleName.asInstanceOf[js.Any], RuleSetName = RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReceiptRuleRequest]
  }
  
  @scala.inline
  implicit class DeleteReceiptRuleRequestMutableBuilder[Self <: DeleteReceiptRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleName(value: ReceiptRuleName): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleSetName(value: ReceiptRuleSetName): Self = StObject.set(x, "RuleSetName", value.asInstanceOf[js.Any])
  }
}
