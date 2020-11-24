package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAccessControlRulesResponse extends js.Object {
  
  /**
    * The access control rules.
    */
  var Rules: js.UndefOr[AccessControlRulesList] = js.native
}
object ListAccessControlRulesResponse {
  
  @scala.inline
  def apply(): ListAccessControlRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccessControlRulesResponse]
  }
  
  @scala.inline
  implicit class ListAccessControlRulesResponseOps[Self <: ListAccessControlRulesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRulesVarargs(value: AccessControlRule*): Self = this.set("Rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: AccessControlRulesList): Self = this.set("Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("Rules", js.undefined)
  }
}
