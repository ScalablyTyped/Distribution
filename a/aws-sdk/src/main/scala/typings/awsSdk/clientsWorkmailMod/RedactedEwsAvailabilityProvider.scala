package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedactedEwsAvailabilityProvider extends StObject {
  
  /**
    * The endpoint of the remote EWS server.
    */
  var EwsEndpoint: js.UndefOr[Url] = js.undefined
  
  /**
    * The username used to authenticate the remote EWS server.
    */
  var EwsUsername: js.UndefOr[ExternalUserName] = js.undefined
}
object RedactedEwsAvailabilityProvider {
  
  inline def apply(): RedactedEwsAvailabilityProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedactedEwsAvailabilityProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RedactedEwsAvailabilityProvider] (val x: Self) extends AnyVal {
    
    inline def setEwsEndpoint(value: Url): Self = StObject.set(x, "EwsEndpoint", value.asInstanceOf[js.Any])
    
    inline def setEwsEndpointUndefined: Self = StObject.set(x, "EwsEndpoint", js.undefined)
    
    inline def setEwsUsername(value: ExternalUserName): Self = StObject.set(x, "EwsUsername", value.asInstanceOf[js.Any])
    
    inline def setEwsUsernameUndefined: Self = StObject.set(x, "EwsUsername", js.undefined)
  }
}
