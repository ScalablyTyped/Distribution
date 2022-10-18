package typings.azureMsalCommon

import typings.azureMsalCommon.distAccountCcsCredentialMod.CcsCredential
import typings.azureMsalCommon.distRequestBaseAuthRequestMod.BaseAuthRequest
import typings.azureMsalCommon.distUtilsMsalTypesMod.StringDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRequestCommonAuthorizationCodeRequestMod {
  
  trait CommonAuthorizationCodeRequest
    extends StObject
       with BaseAuthRequest {
    
    var ccsCredential: js.UndefOr[CcsCredential] = js.undefined
    
    var clientInfo: js.UndefOr[String] = js.undefined
    
    var code: String
    
    var codeVerifier: js.UndefOr[String] = js.undefined
    
    var enableSpaAuthorizationCode: js.UndefOr[Boolean] = js.undefined
    
    var redirectUri: String
    
    var tokenBodyParameters: js.UndefOr[StringDict] = js.undefined
    
    var tokenQueryParameters: js.UndefOr[StringDict] = js.undefined
  }
  object CommonAuthorizationCodeRequest {
    
    inline def apply(
      authority: String,
      code: String,
      correlationId: String,
      redirectUri: String,
      scopes: js.Array[String]
    ): CommonAuthorizationCodeRequest = {
      val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], correlationId = correlationId.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonAuthorizationCodeRequest]
    }
    
    extension [Self <: CommonAuthorizationCodeRequest](x: Self) {
      
      inline def setCcsCredential(value: CcsCredential): Self = StObject.set(x, "ccsCredential", value.asInstanceOf[js.Any])
      
      inline def setCcsCredentialUndefined: Self = StObject.set(x, "ccsCredential", js.undefined)
      
      inline def setClientInfo(value: String): Self = StObject.set(x, "clientInfo", value.asInstanceOf[js.Any])
      
      inline def setClientInfoUndefined: Self = StObject.set(x, "clientInfo", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeVerifier(value: String): Self = StObject.set(x, "codeVerifier", value.asInstanceOf[js.Any])
      
      inline def setCodeVerifierUndefined: Self = StObject.set(x, "codeVerifier", js.undefined)
      
      inline def setEnableSpaAuthorizationCode(value: Boolean): Self = StObject.set(x, "enableSpaAuthorizationCode", value.asInstanceOf[js.Any])
      
      inline def setEnableSpaAuthorizationCodeUndefined: Self = StObject.set(x, "enableSpaAuthorizationCode", js.undefined)
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setTokenBodyParameters(value: StringDict): Self = StObject.set(x, "tokenBodyParameters", value.asInstanceOf[js.Any])
      
      inline def setTokenBodyParametersUndefined: Self = StObject.set(x, "tokenBodyParameters", js.undefined)
      
      inline def setTokenQueryParameters(value: StringDict): Self = StObject.set(x, "tokenQueryParameters", value.asInstanceOf[js.Any])
      
      inline def setTokenQueryParametersUndefined: Self = StObject.set(x, "tokenQueryParameters", js.undefined)
    }
  }
}
