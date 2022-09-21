package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMobileDeviceAccessRulesResponse extends StObject {
  
  /**
    * The list of mobile device access rules that exist under the specified Amazon WorkMail organization.
    */
  var Rules: js.UndefOr[MobileDeviceAccessRulesList] = js.undefined
}
object ListMobileDeviceAccessRulesResponse {
  
  inline def apply(): ListMobileDeviceAccessRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMobileDeviceAccessRulesResponse]
  }
  
  extension [Self <: ListMobileDeviceAccessRulesResponse](x: Self) {
    
    inline def setRules(value: MobileDeviceAccessRulesList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: MobileDeviceAccessRule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
