package typings.azureMsalCommon

import typings.azureMsalCommon.constantsMod.AuthenticationScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object externalTokenResponseMod {
  
  /* Inlined std.Pick<@azure/msal-common.@azure/msal-common/dist/response/ServerAuthorizationTokenResponse.ServerAuthorizationTokenResponse, 'token_type' | 'scope' | 'expires_in' | 'id_token'> & {  access_token :string | undefined,   client_info :string | undefined} */
  trait ExternalTokenResponse extends StObject {
    
    var access_token: js.UndefOr[String] = js.undefined
    
    var client_info: js.UndefOr[String] = js.undefined
    
    var expires_in: js.UndefOr[Double] = js.undefined
    
    var id_token: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
    
    var token_type: js.UndefOr[AuthenticationScheme] = js.undefined
  }
  object ExternalTokenResponse {
    
    inline def apply(): ExternalTokenResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExternalTokenResponse]
    }
    
    extension [Self <: ExternalTokenResponse](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      inline def setClient_info(value: String): Self = StObject.set(x, "client_info", value.asInstanceOf[js.Any])
      
      inline def setClient_infoUndefined: Self = StObject.set(x, "client_info", js.undefined)
      
      inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      inline def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
      
      inline def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
      
      inline def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setToken_type(value: AuthenticationScheme): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
      
      inline def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
    }
  }
}
