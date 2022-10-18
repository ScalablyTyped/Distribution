package typings.azureMsalNode

import typings.azureMsalCommon.distAccountCcsCredentialMod.CcsCredential
import typings.azureMsalCommon.distConfigClientConfigurationMod.AzureCloudOptions
import typings.azureMsalCommon.distUtilsMsalTypesMod.StringDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRequestAuthorizationCodeRequestMod {
  
  /* Inlined std.Partial<std.Omit<@azure/msal-common.@azure/msal-common.CommonAuthorizationCodeRequest, 'scopes' | 'redirectUri' | 'code' | 'authenticationScheme' | 'resourceRequestMethod' | 'resourceRequestUri' | 'requestedClaimsHash'>> & {  scopes :std.Array<string>,   redirectUri :string,   code :string,   state :string | undefined} */
  trait AuthorizationCodeRequest extends StObject {
    
    var authority: js.UndefOr[String] = js.undefined
    
    var azureCloudOptions: js.UndefOr[AzureCloudOptions] = js.undefined
    
    var ccsCredential: js.UndefOr[CcsCredential] = js.undefined
    
    var claims: js.UndefOr[String] = js.undefined
    
    var clientInfo: js.UndefOr[String] = js.undefined
    
    var code: String
    
    var codeVerifier: js.UndefOr[String] = js.undefined
    
    var correlationId: js.UndefOr[String] = js.undefined
    
    var enableSpaAuthorizationCode: js.UndefOr[Boolean] = js.undefined
    
    var redirectUri: String
    
    var scopes: js.Array[String]
    
    var shrClaims: js.UndefOr[String] = js.undefined
    
    var shrNonce: js.UndefOr[String] = js.undefined
    
    var sshJwk: js.UndefOr[String] = js.undefined
    
    var sshKid: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var tokenBodyParameters: js.UndefOr[StringDict] = js.undefined
    
    var tokenQueryParameters: js.UndefOr[StringDict] = js.undefined
  }
  object AuthorizationCodeRequest {
    
    inline def apply(code: String, redirectUri: String, scopes: js.Array[String]): AuthorizationCodeRequest = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationCodeRequest]
    }
    
    extension [Self <: AuthorizationCodeRequest](x: Self) {
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
      
      inline def setAzureCloudOptions(value: AzureCloudOptions): Self = StObject.set(x, "azureCloudOptions", value.asInstanceOf[js.Any])
      
      inline def setAzureCloudOptionsUndefined: Self = StObject.set(x, "azureCloudOptions", js.undefined)
      
      inline def setCcsCredential(value: CcsCredential): Self = StObject.set(x, "ccsCredential", value.asInstanceOf[js.Any])
      
      inline def setCcsCredentialUndefined: Self = StObject.set(x, "ccsCredential", js.undefined)
      
      inline def setClaims(value: String): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setClientInfo(value: String): Self = StObject.set(x, "clientInfo", value.asInstanceOf[js.Any])
      
      inline def setClientInfoUndefined: Self = StObject.set(x, "clientInfo", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeVerifier(value: String): Self = StObject.set(x, "codeVerifier", value.asInstanceOf[js.Any])
      
      inline def setCodeVerifierUndefined: Self = StObject.set(x, "codeVerifier", js.undefined)
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
      
      inline def setEnableSpaAuthorizationCode(value: Boolean): Self = StObject.set(x, "enableSpaAuthorizationCode", value.asInstanceOf[js.Any])
      
      inline def setEnableSpaAuthorizationCodeUndefined: Self = StObject.set(x, "enableSpaAuthorizationCode", js.undefined)
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setShrClaims(value: String): Self = StObject.set(x, "shrClaims", value.asInstanceOf[js.Any])
      
      inline def setShrClaimsUndefined: Self = StObject.set(x, "shrClaims", js.undefined)
      
      inline def setShrNonce(value: String): Self = StObject.set(x, "shrNonce", value.asInstanceOf[js.Any])
      
      inline def setShrNonceUndefined: Self = StObject.set(x, "shrNonce", js.undefined)
      
      inline def setSshJwk(value: String): Self = StObject.set(x, "sshJwk", value.asInstanceOf[js.Any])
      
      inline def setSshJwkUndefined: Self = StObject.set(x, "sshJwk", js.undefined)
      
      inline def setSshKid(value: String): Self = StObject.set(x, "sshKid", value.asInstanceOf[js.Any])
      
      inline def setSshKidUndefined: Self = StObject.set(x, "sshKid", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTokenBodyParameters(value: StringDict): Self = StObject.set(x, "tokenBodyParameters", value.asInstanceOf[js.Any])
      
      inline def setTokenBodyParametersUndefined: Self = StObject.set(x, "tokenBodyParameters", js.undefined)
      
      inline def setTokenQueryParameters(value: StringDict): Self = StObject.set(x, "tokenQueryParameters", value.asInstanceOf[js.Any])
      
      inline def setTokenQueryParametersUndefined: Self = StObject.set(x, "tokenQueryParameters", js.undefined)
    }
  }
}
