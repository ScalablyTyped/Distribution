package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReorderReceiptRuleSetRequest extends StObject {
  
  /**
    * A list of the specified receipt rule set's receipt rules in the order that you want to put them.
    */
  var RuleNames: ReceiptRuleNamesList
  
  /**
    * The name of the receipt rule set to reorder.
    */
  var RuleSetName: ReceiptRuleSetName
}
object ReorderReceiptRuleSetRequest {
  
  inline def apply(RuleNames: ReceiptRuleNamesList, RuleSetName: ReceiptRuleSetName): ReorderReceiptRuleSetRequest = {
    val __obj = js.Dynamic.literal(RuleNames = RuleNames.asInstanceOf[js.Any], RuleSetName = RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReorderReceiptRuleSetRequest]
  }
  
  extension [Self <: ReorderReceiptRuleSetRequest](x: Self) {
    
    inline def setRuleNames(value: ReceiptRuleNamesList): Self = StObject.set(x, "RuleNames", value.asInstanceOf[js.Any])
    
    inline def setRuleNamesVarargs(value: ReceiptRuleName*): Self = StObject.set(x, "RuleNames", js.Array(value*))
    
    inline def setRuleSetName(value: ReceiptRuleSetName): Self = StObject.set(x, "RuleSetName", value.asInstanceOf[js.Any])
  }
}
