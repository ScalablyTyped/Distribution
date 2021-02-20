package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReorderReceiptRuleSetRequest extends StObject {
  
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
  
  @scala.inline
  implicit class ReorderReceiptRuleSetRequestMutableBuilder[Self <: ReorderReceiptRuleSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleNames(value: ReceiptRuleNamesList): Self = StObject.set(x, "RuleNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleNamesVarargs(value: ReceiptRuleName*): Self = StObject.set(x, "RuleNames", js.Array(value :_*))
    
    @scala.inline
    def setRuleSetName(value: ReceiptRuleSetName): Self = StObject.set(x, "RuleSetName", value.asInstanceOf[js.Any])
  }
}
