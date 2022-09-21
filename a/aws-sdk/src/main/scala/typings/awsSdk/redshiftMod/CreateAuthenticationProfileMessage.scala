package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAuthenticationProfileMessage extends StObject {
  
  /**
    * The content of the authentication profile in JSON format. The maximum length of the JSON string is determined by a quota for your account.
    */
  var AuthenticationProfileContent: String
  
  /**
    * The name of the authentication profile to be created.
    */
  var AuthenticationProfileName: AuthenticationProfileNameString
}
object CreateAuthenticationProfileMessage {
  
  inline def apply(AuthenticationProfileContent: String, AuthenticationProfileName: AuthenticationProfileNameString): CreateAuthenticationProfileMessage = {
    val __obj = js.Dynamic.literal(AuthenticationProfileContent = AuthenticationProfileContent.asInstanceOf[js.Any], AuthenticationProfileName = AuthenticationProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAuthenticationProfileMessage]
  }
  
  extension [Self <: CreateAuthenticationProfileMessage](x: Self) {
    
    inline def setAuthenticationProfileContent(value: String): Self = StObject.set(x, "AuthenticationProfileContent", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationProfileName(value: AuthenticationProfileNameString): Self = StObject.set(x, "AuthenticationProfileName", value.asInstanceOf[js.Any])
  }
}
