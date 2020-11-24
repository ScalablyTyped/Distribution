package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetActiveReceiptRuleSetRequest extends js.Object {
  
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
  implicit class SetActiveReceiptRuleSetRequestOps[Self <: SetActiveReceiptRuleSetRequest] (val x: Self) extends AnyVal {
    
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
    def setRuleSetName(value: ReceiptRuleSetName): Self = this.set("RuleSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleSetName: Self = this.set("RuleSetName", js.undefined)
  }
}
