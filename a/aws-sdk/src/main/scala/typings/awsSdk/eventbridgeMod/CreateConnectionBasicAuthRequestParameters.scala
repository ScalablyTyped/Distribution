package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectionBasicAuthRequestParameters extends StObject {
  
  /**
    * The password associated with the user name to use for Basic authorization.
    */
  var Password: AuthHeaderParameters
  
  /**
    * The user name to use for Basic authorization.
    */
  var Username: AuthHeaderParameters
}
object CreateConnectionBasicAuthRequestParameters {
  
  inline def apply(Password: AuthHeaderParameters, Username: AuthHeaderParameters): CreateConnectionBasicAuthRequestParameters = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionBasicAuthRequestParameters]
  }
  
  extension [Self <: CreateConnectionBasicAuthRequestParameters](x: Self) {
    
    inline def setPassword(value: AuthHeaderParameters): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: AuthHeaderParameters): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
