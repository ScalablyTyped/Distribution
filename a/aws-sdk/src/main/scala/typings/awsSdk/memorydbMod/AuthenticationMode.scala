package typings.awsSdk.memorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationMode extends StObject {
  
  /**
    * The password(s) used for authentication
    */
  var Passwords: js.UndefOr[PasswordListInput] = js.undefined
  
  /**
    * Indicates whether the user requires a password to authenticate. All newly-created users require a password.
    */
  var Type: js.UndefOr[InputAuthenticationType] = js.undefined
}
object AuthenticationMode {
  
  inline def apply(): AuthenticationMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationMode]
  }
  
  extension [Self <: AuthenticationMode](x: Self) {
    
    inline def setPasswords(value: PasswordListInput): Self = StObject.set(x, "Passwords", value.asInstanceOf[js.Any])
    
    inline def setPasswordsUndefined: Self = StObject.set(x, "Passwords", js.undefined)
    
    inline def setPasswordsVarargs(value: String*): Self = StObject.set(x, "Passwords", js.Array(value*))
    
    inline def setType(value: InputAuthenticationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
