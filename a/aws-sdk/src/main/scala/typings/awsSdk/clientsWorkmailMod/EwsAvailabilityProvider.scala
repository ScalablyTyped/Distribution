package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EwsAvailabilityProvider extends StObject {
  
  /**
    * The endpoint of the remote EWS server.
    */
  var EwsEndpoint: Url
  
  /**
    * The password used to authenticate the remote EWS server.
    */
  var EwsPassword: Password
  
  /**
    * The username used to authenticate the remote EWS server.
    */
  var EwsUsername: ExternalUserName
}
object EwsAvailabilityProvider {
  
  inline def apply(EwsEndpoint: Url, EwsPassword: Password, EwsUsername: ExternalUserName): EwsAvailabilityProvider = {
    val __obj = js.Dynamic.literal(EwsEndpoint = EwsEndpoint.asInstanceOf[js.Any], EwsPassword = EwsPassword.asInstanceOf[js.Any], EwsUsername = EwsUsername.asInstanceOf[js.Any])
    __obj.asInstanceOf[EwsAvailabilityProvider]
  }
  
  extension [Self <: EwsAvailabilityProvider](x: Self) {
    
    inline def setEwsEndpoint(value: Url): Self = StObject.set(x, "EwsEndpoint", value.asInstanceOf[js.Any])
    
    inline def setEwsPassword(value: Password): Self = StObject.set(x, "EwsPassword", value.asInstanceOf[js.Any])
    
    inline def setEwsUsername(value: ExternalUserName): Self = StObject.set(x, "EwsUsername", value.asInstanceOf[js.Any])
  }
}
