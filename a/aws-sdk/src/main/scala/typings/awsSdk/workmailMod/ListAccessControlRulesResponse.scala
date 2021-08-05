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
  
  inline def apply(): ListAccessControlRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccessControlRulesResponse]
  }
  
  extension [Self <: ListAccessControlRulesResponse](x: Self) {
    
    inline def setRules(value: AccessControlRulesList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: AccessControlRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
