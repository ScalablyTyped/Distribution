package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReceiptRuleSetRequest extends StObject {
  
  /**
    * The name of the receipt rule set to delete.
    */
  var RuleSetName: ReceiptRuleSetName
}
object DeleteReceiptRuleSetRequest {
  
  @scala.inline
  def apply(RuleSetName: ReceiptRuleSetName): DeleteReceiptRuleSetRequest = {
    val __obj = js.Dynamic.literal(RuleSetName = RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReceiptRuleSetRequest]
  }
  
  @scala.inline
  implicit class DeleteReceiptRuleSetRequestMutableBuilder[Self <: DeleteReceiptRuleSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleSetName(value: ReceiptRuleSetName): Self = StObject.set(x, "RuleSetName", value.asInstanceOf[js.Any])
  }
}
