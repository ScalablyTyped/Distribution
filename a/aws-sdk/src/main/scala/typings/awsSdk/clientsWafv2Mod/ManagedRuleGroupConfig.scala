package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedRuleGroupConfig extends StObject {
  
  /**
    * The path of the login endpoint for your application. For example, for the URL https://example.com/web/login, you would provide the path /web/login.
    */
  var LoginPath: js.UndefOr[LoginPathString] = js.undefined
  
  /**
    * Details about your login page password field. 
    */
  var PasswordField: js.UndefOr[typings.awsSdk.clientsWafv2Mod.PasswordField] = js.undefined
  
  /**
    * The payload type for your login endpoint, either JSON or form encoded.
    */
  var PayloadType: js.UndefOr[typings.awsSdk.clientsWafv2Mod.PayloadType] = js.undefined
  
  /**
    * Details about your login page username field. 
    */
  var UsernameField: js.UndefOr[typings.awsSdk.clientsWafv2Mod.UsernameField] = js.undefined
}
object ManagedRuleGroupConfig {
  
  inline def apply(): ManagedRuleGroupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedRuleGroupConfig]
  }
  
  extension [Self <: ManagedRuleGroupConfig](x: Self) {
    
    inline def setLoginPath(value: LoginPathString): Self = StObject.set(x, "LoginPath", value.asInstanceOf[js.Any])
    
    inline def setLoginPathUndefined: Self = StObject.set(x, "LoginPath", js.undefined)
    
    inline def setPasswordField(value: PasswordField): Self = StObject.set(x, "PasswordField", value.asInstanceOf[js.Any])
    
    inline def setPasswordFieldUndefined: Self = StObject.set(x, "PasswordField", js.undefined)
    
    inline def setPayloadType(value: PayloadType): Self = StObject.set(x, "PayloadType", value.asInstanceOf[js.Any])
    
    inline def setPayloadTypeUndefined: Self = StObject.set(x, "PayloadType", js.undefined)
    
    inline def setUsernameField(value: UsernameField): Self = StObject.set(x, "UsernameField", value.asInstanceOf[js.Any])
    
    inline def setUsernameFieldUndefined: Self = StObject.set(x, "UsernameField", js.undefined)
  }
}
