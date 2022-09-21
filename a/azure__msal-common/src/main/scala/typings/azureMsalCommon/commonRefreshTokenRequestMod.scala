package typings.azureMsalCommon

import typings.azureMsalCommon.baseAuthRequestMod.BaseAuthRequest
import typings.azureMsalCommon.ccsCredentialMod.CcsCredential
import typings.azureMsalCommon.msalTypesMod.StringDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonRefreshTokenRequestMod {
  
  trait CommonRefreshTokenRequest
    extends StObject
       with BaseAuthRequest {
    
    var ccsCredential: js.UndefOr[CcsCredential] = js.undefined
    
    var forceCache: js.UndefOr[Boolean] = js.undefined
    
    var refreshToken: String
    
    var tokenQueryParameters: js.UndefOr[StringDict] = js.undefined
  }
  object CommonRefreshTokenRequest {
    
    inline def apply(authority: String, correlationId: String, refreshToken: String, scopes: js.Array[String]): CommonRefreshTokenRequest = {
      val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], correlationId = correlationId.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonRefreshTokenRequest]
    }
    
    extension [Self <: CommonRefreshTokenRequest](x: Self) {
      
      inline def setCcsCredential(value: CcsCredential): Self = StObject.set(x, "ccsCredential", value.asInstanceOf[js.Any])
      
      inline def setCcsCredentialUndefined: Self = StObject.set(x, "ccsCredential", js.undefined)
      
      inline def setForceCache(value: Boolean): Self = StObject.set(x, "forceCache", value.asInstanceOf[js.Any])
      
      inline def setForceCacheUndefined: Self = StObject.set(x, "forceCache", js.undefined)
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      inline def setTokenQueryParameters(value: StringDict): Self = StObject.set(x, "tokenQueryParameters", value.asInstanceOf[js.Any])
      
      inline def setTokenQueryParametersUndefined: Self = StObject.set(x, "tokenQueryParameters", js.undefined)
    }
  }
}
