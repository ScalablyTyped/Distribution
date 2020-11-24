package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRuleResponse extends js.Object {
  
  /**
    * The ChangeToken that you used to submit the CreateRule request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafMod.ChangeToken] = js.native
  
  /**
    * The Rule returned in the CreateRule response.
    */
  var Rule: js.UndefOr[typings.awsSdk.wafMod.Rule] = js.native
}
object CreateRuleResponse {
  
  @scala.inline
  def apply(): CreateRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRuleResponse]
  }
  
  @scala.inline
  implicit class CreateRuleResponseOps[Self <: CreateRuleResponse] (val x: Self) extends AnyVal {
    
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
    def setChangeToken(value: ChangeToken): Self = this.set("ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeToken: Self = this.set("ChangeToken", js.undefined)
    
    @scala.inline
    def setRule(value: Rule): Self = this.set("Rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRule: Self = this.set("Rule", js.undefined)
  }
}
