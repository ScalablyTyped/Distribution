package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetActiveReceiptRuleSetRequest extends StObject {
  
  /**
    * The name of the receipt rule set to make active. Setting this value to null disables all email receiving.
    */
  var RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined
}
object SetActiveReceiptRuleSetRequest {
  
  inline def apply(): SetActiveReceiptRuleSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetActiveReceiptRuleSetRequest]
  }
  
  extension [Self <: SetActiveReceiptRuleSetRequest](x: Self) {
    
    inline def setRuleSetName(value: ReceiptRuleSetName): Self = StObject.set(x, "RuleSetName", value.asInstanceOf[js.Any])
    
    inline def setRuleSetNameUndefined: Self = StObject.set(x, "RuleSetName", js.undefined)
  }
}
