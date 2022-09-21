package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SMSMfaSettingsType extends StObject {
  
  /**
    * Specifies whether SMS text message MFA is activated. If an MFA type is activated for a user, the user will be prompted for MFA during all sign-in attempts, unless device tracking is turned on and the device has been trusted.
    */
  var Enabled: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * Specifies whether SMS is the preferred MFA method.
    */
  var PreferredMfa: js.UndefOr[BooleanType] = js.undefined
}
object SMSMfaSettingsType {
  
  inline def apply(): SMSMfaSettingsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SMSMfaSettingsType]
  }
  
  extension [Self <: SMSMfaSettingsType](x: Self) {
    
    inline def setEnabled(value: BooleanType): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setPreferredMfa(value: BooleanType): Self = StObject.set(x, "PreferredMfa", value.asInstanceOf[js.Any])
    
    inline def setPreferredMfaUndefined: Self = StObject.set(x, "PreferredMfa", js.undefined)
  }
}
