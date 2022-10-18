package typings.azureMsalCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAuthorityOpenIdConfigResponseMod {
  
  @JSImport("@azure/msal-common/dist/authority/OpenIdConfigResponse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isOpenIdConfigResponse(response: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOpenIdConfigResponse")(response.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait OpenIdConfigResponse extends StObject {
    
    var authorization_endpoint: String
    
    var end_session_endpoint: js.UndefOr[String] = js.undefined
    
    var issuer: String
    
    var jwks_uri: String
    
    var token_endpoint: String
  }
  object OpenIdConfigResponse {
    
    inline def apply(authorization_endpoint: String, issuer: String, jwks_uri: String, token_endpoint: String): OpenIdConfigResponse = {
      val __obj = js.Dynamic.literal(authorization_endpoint = authorization_endpoint.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], jwks_uri = jwks_uri.asInstanceOf[js.Any], token_endpoint = token_endpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenIdConfigResponse]
    }
    
    extension [Self <: OpenIdConfigResponse](x: Self) {
      
      inline def setAuthorization_endpoint(value: String): Self = StObject.set(x, "authorization_endpoint", value.asInstanceOf[js.Any])
      
      inline def setEnd_session_endpoint(value: String): Self = StObject.set(x, "end_session_endpoint", value.asInstanceOf[js.Any])
      
      inline def setEnd_session_endpointUndefined: Self = StObject.set(x, "end_session_endpoint", js.undefined)
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setJwks_uri(value: String): Self = StObject.set(x, "jwks_uri", value.asInstanceOf[js.Any])
      
      inline def setToken_endpoint(value: String): Self = StObject.set(x, "token_endpoint", value.asInstanceOf[js.Any])
    }
  }
}
