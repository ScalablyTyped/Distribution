package typings.azureMsalBrowser

import typings.azureMsalCommon.ccsCredentialMod.CcsCredential
import typings.azureMsalCommon.clientConfigurationMod.AzureCloudOptions
import typings.azureMsalCommon.constantsMod.AuthenticationScheme
import typings.azureMsalCommon.msalTypesMod.StringDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authorizationCodeRequestMod {
  
  /* Inlined std.Partial<std.Omit<@azure/msal-common.@azure/msal-common.CommonAuthorizationCodeRequest, 'code' | 'enableSpaAuthorizationCode' | 'requestedClaimsHash'>> & {  code :string | undefined,   nativeAccountId :string | undefined,   cloudGraphHostName :string | undefined,   msGraphHost :string | undefined,   cloudInstanceHostName :string | undefined} */
  trait AuthorizationCodeRequest extends StObject {
    
    var authenticationScheme: js.UndefOr[AuthenticationScheme] = js.undefined
    
    var authority: js.UndefOr[String] = js.undefined
    
    var azureCloudOptions: js.UndefOr[AzureCloudOptions] = js.undefined
    
    var ccsCredential: js.UndefOr[CcsCredential] = js.undefined
    
    var claims: js.UndefOr[String] = js.undefined
    
    var clientInfo: js.UndefOr[String] = js.undefined
    
    var cloudGraphHostName: js.UndefOr[String] = js.undefined
    
    var cloudInstanceHostName: js.UndefOr[String] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var codeVerifier: js.UndefOr[String] = js.undefined
    
    var correlationId: js.UndefOr[String] = js.undefined
    
    var msGraphHost: js.UndefOr[String] = js.undefined
    
    var nativeAccountId: js.UndefOr[String] = js.undefined
    
    var redirectUri: js.UndefOr[String] = js.undefined
    
    var resourceRequestMethod: js.UndefOr[String] = js.undefined
    
    var resourceRequestUri: js.UndefOr[String] = js.undefined
    
    var scopes: js.UndefOr[js.Array[String]] = js.undefined
    
    var shrClaims: js.UndefOr[String] = js.undefined
    
    var shrNonce: js.UndefOr[String] = js.undefined
    
    var sshJwk: js.UndefOr[String] = js.undefined
    
    var sshKid: js.UndefOr[String] = js.undefined
    
    var tokenBodyParameters: js.UndefOr[StringDict] = js.undefined
    
    var tokenQueryParameters: js.UndefOr[StringDict] = js.undefined
  }
  object AuthorizationCodeRequest {
    
    inline def apply(): AuthorizationCodeRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizationCodeRequest]
    }
    
    extension [Self <: AuthorizationCodeRequest](x: Self) {
      
      inline def setAuthenticationScheme(value: AuthenticationScheme): Self = StObject.set(x, "authenticationScheme", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationSchemeUndefined: Self = StObject.set(x, "authenticationScheme", js.undefined)
      
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
      
      inline def setCloudGraphHostName(value: String): Self = StObject.set(x, "cloudGraphHostName", value.asInstanceOf[js.Any])
      
      inline def setCloudGraphHostNameUndefined: Self = StObject.set(x, "cloudGraphHostName", js.undefined)
      
      inline def setCloudInstanceHostName(value: String): Self = StObject.set(x, "cloudInstanceHostName", value.asInstanceOf[js.Any])
      
      inline def setCloudInstanceHostNameUndefined: Self = StObject.set(x, "cloudInstanceHostName", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setCodeVerifier(value: String): Self = StObject.set(x, "codeVerifier", value.asInstanceOf[js.Any])
      
      inline def setCodeVerifierUndefined: Self = StObject.set(x, "codeVerifier", js.undefined)
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
      
      inline def setMsGraphHost(value: String): Self = StObject.set(x, "msGraphHost", value.asInstanceOf[js.Any])
      
      inline def setMsGraphHostUndefined: Self = StObject.set(x, "msGraphHost", js.undefined)
      
      inline def setNativeAccountId(value: String): Self = StObject.set(x, "nativeAccountId", value.asInstanceOf[js.Any])
      
      inline def setNativeAccountIdUndefined: Self = StObject.set(x, "nativeAccountId", js.undefined)
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      inline def setResourceRequestMethod(value: String): Self = StObject.set(x, "resourceRequestMethod", value.asInstanceOf[js.Any])
      
      inline def setResourceRequestMethodUndefined: Self = StObject.set(x, "resourceRequestMethod", js.undefined)
      
      inline def setResourceRequestUri(value: String): Self = StObject.set(x, "resourceRequestUri", value.asInstanceOf[js.Any])
      
      inline def setResourceRequestUriUndefined: Self = StObject.set(x, "resourceRequestUri", js.undefined)
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setShrClaims(value: String): Self = StObject.set(x, "shrClaims", value.asInstanceOf[js.Any])
      
      inline def setShrClaimsUndefined: Self = StObject.set(x, "shrClaims", js.undefined)
      
      inline def setShrNonce(value: String): Self = StObject.set(x, "shrNonce", value.asInstanceOf[js.Any])
      
      inline def setShrNonceUndefined: Self = StObject.set(x, "shrNonce", js.undefined)
      
      inline def setSshJwk(value: String): Self = StObject.set(x, "sshJwk", value.asInstanceOf[js.Any])
      
      inline def setSshJwkUndefined: Self = StObject.set(x, "sshJwk", js.undefined)
      
      inline def setSshKid(value: String): Self = StObject.set(x, "sshKid", value.asInstanceOf[js.Any])
      
      inline def setSshKidUndefined: Self = StObject.set(x, "sshKid", js.undefined)
      
      inline def setTokenBodyParameters(value: StringDict): Self = StObject.set(x, "tokenBodyParameters", value.asInstanceOf[js.Any])
      
      inline def setTokenBodyParametersUndefined: Self = StObject.set(x, "tokenBodyParameters", js.undefined)
      
      inline def setTokenQueryParameters(value: StringDict): Self = StObject.set(x, "tokenQueryParameters", value.asInstanceOf[js.Any])
      
      inline def setTokenQueryParametersUndefined: Self = StObject.set(x, "tokenQueryParameters", js.undefined)
    }
  }
}
