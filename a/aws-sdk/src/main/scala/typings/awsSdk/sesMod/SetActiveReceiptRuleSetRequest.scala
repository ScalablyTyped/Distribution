package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetActiveReceiptRuleSetRequest extends StObject {
  
  /**
    * The name of the receipt rule set to make active. Setting this value to null disables all email receiving.
    */
  var RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.native
}
object SetActiveReceiptRuleSetRequest {
  
  @scala.inline
  def apply(): SetActiveReceiptRuleSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetActiveReceiptRuleSetRequest]
  }
  
  @scala.inline
  implicit class SetActiveReceiptRuleSetRequestMutableBuilder[Self <: SetActiveReceiptRuleSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleSetName(value: ReceiptRuleSetName): Self = StObject.set(x, "RuleSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleSetNameUndefined: Self = StObject.set(x, "RuleSetName", js.undefined)
  }
}
