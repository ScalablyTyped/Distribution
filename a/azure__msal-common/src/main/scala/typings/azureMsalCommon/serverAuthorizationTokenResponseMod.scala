package typings.azureMsalCommon

import typings.azureMsalCommon.constantsMod.AuthenticationScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverAuthorizationTokenResponseMod {
  
  trait ServerAuthorizationTokenResponse extends StObject {
    
    var access_token: js.UndefOr[String] = js.undefined
    
    var client_info: js.UndefOr[String] = js.undefined
    
    var correlation_id: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var error_codes: js.UndefOr[js.Array[String]] = js.undefined
    
    var error_description: js.UndefOr[String] = js.undefined
    
    var expires_in: js.UndefOr[Double] = js.undefined
    
    var ext_expires_in: js.UndefOr[Double] = js.undefined
    
    var foci: js.UndefOr[String] = js.undefined
    
    var id_token: js.UndefOr[String] = js.undefined
    
    var key_id: js.UndefOr[String] = js.undefined
    
    var refresh_in: js.UndefOr[Double] = js.undefined
    
    var refresh_token: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
    
    var spa_code: js.UndefOr[String] = js.undefined
    
    var suberror: js.UndefOr[String] = js.undefined
    
    var timestamp: js.UndefOr[String] = js.undefined
    
    var token_type: js.UndefOr[AuthenticationScheme] = js.undefined
    
    var trace_id: js.UndefOr[String] = js.undefined
  }
  object ServerAuthorizationTokenResponse {
    
    inline def apply(): ServerAuthorizationTokenResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerAuthorizationTokenResponse]
    }
    
    extension [Self <: ServerAuthorizationTokenResponse](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      inline def setClient_info(value: String): Self = StObject.set(x, "client_info", value.asInstanceOf[js.Any])
      
      inline def setClient_infoUndefined: Self = StObject.set(x, "client_info", js.undefined)
      
      inline def setCorrelation_id(value: String): Self = StObject.set(x, "correlation_id", value.asInstanceOf[js.Any])
      
      inline def setCorrelation_idUndefined: Self = StObject.set(x, "correlation_id", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setError_codes(value: js.Array[String]): Self = StObject.set(x, "error_codes", value.asInstanceOf[js.Any])
      
      inline def setError_codesUndefined: Self = StObject.set(x, "error_codes", js.undefined)
      
      inline def setError_codesVarargs(value: String*): Self = StObject.set(x, "error_codes", js.Array(value*))
      
      inline def setError_description(value: String): Self = StObject.set(x, "error_description", value.asInstanceOf[js.Any])
      
      inline def setError_descriptionUndefined: Self = StObject.set(x, "error_description", js.undefined)
      
      inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      inline def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
      
      inline def setExt_expires_in(value: Double): Self = StObject.set(x, "ext_expires_in", value.asInstanceOf[js.Any])
      
      inline def setExt_expires_inUndefined: Self = StObject.set(x, "ext_expires_in", js.undefined)
      
      inline def setFoci(value: String): Self = StObject.set(x, "foci", value.asInstanceOf[js.Any])
      
      inline def setFociUndefined: Self = StObject.set(x, "foci", js.undefined)
      
      inline def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
      
      inline def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
      
      inline def setKey_id(value: String): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
      
      inline def setKey_idUndefined: Self = StObject.set(x, "key_id", js.undefined)
      
      inline def setRefresh_in(value: Double): Self = StObject.set(x, "refresh_in", value.asInstanceOf[js.Any])
      
      inline def setRefresh_inUndefined: Self = StObject.set(x, "refresh_in", js.undefined)
      
      inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      inline def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSpa_code(value: String): Self = StObject.set(x, "spa_code", value.asInstanceOf[js.Any])
      
      inline def setSpa_codeUndefined: Self = StObject.set(x, "spa_code", js.undefined)
      
      inline def setSuberror(value: String): Self = StObject.set(x, "suberror", value.asInstanceOf[js.Any])
      
      inline def setSuberrorUndefined: Self = StObject.set(x, "suberror", js.undefined)
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setToken_type(value: AuthenticationScheme): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
      
      inline def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
      
      inline def setTrace_id(value: String): Self = StObject.set(x, "trace_id", value.asInstanceOf[js.Any])
      
      inline def setTrace_idUndefined: Self = StObject.set(x, "trace_id", js.undefined)
    }
  }
}
