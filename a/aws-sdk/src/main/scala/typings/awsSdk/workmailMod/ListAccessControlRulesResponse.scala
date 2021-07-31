package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccessControlRulesResponse extends StObject {
  
  /**
    * The access control rules.
    */
  var Rules: js.UndefOr[AccessControlRulesList] = js.undefined
}
object ListAccessControlRulesResponse {
  
  @scala.inline
  def apply(): ListAccessControlRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccessControlRulesResponse]
  }
  
  @scala.inline
  implicit class ListAccessControlRulesResponseMutableBuilder[Self <: ListAccessControlRulesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: AccessControlRulesList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: AccessControlRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
