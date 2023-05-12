package typings.azureMsalBrowser

import typings.azureMsalCommon.distAccountAccountInfoMod.AccountInfo
import typings.azureMsalCommon.distConfigClientConfigurationMod.AzureCloudOptions
import typings.azureMsalCommon.distUtilsConstantsMod.AuthenticationScheme
import typings.azureMsalCommon.distUtilsConstantsMod.ResponseMode
import typings.azureMsalCommon.distUtilsMsalTypesMod.StringDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRequestAuthorizationUrlRequestMod {
  
  /* Inlined std.Omit<@azure/msal-common.@azure/msal-common.CommonAuthorizationUrlRequest, 'state' | 'nonce' | 'requestedClaimsHash' | 'nativeBroker'> & {  state :string,   nonce :string} */
  trait AuthorizationUrlRequest extends StObject {
    
    var account: js.UndefOr[AccountInfo] = js.undefined
    
    var authenticationScheme: js.UndefOr[AuthenticationScheme] = js.undefined
    
    var authority: String
    
    var azureCloudOptions: js.UndefOr[AzureCloudOptions] = js.undefined
    
    var claims: js.UndefOr[String] = js.undefined
    
    var codeChallenge: js.UndefOr[String] = js.undefined
    
    var codeChallengeMethod: js.UndefOr[String] = js.undefined
    
    var correlationId: String
    
    var domainHint: js.UndefOr[String] = js.undefined
    
    var extraQueryParameters: js.UndefOr[StringDict] = js.undefined
    
    var extraScopesToConsent: js.UndefOr[js.Array[String]] = js.undefined
    
    var loginHint: js.UndefOr[String] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var nonce: String
    
    var prompt: js.UndefOr[String] = js.undefined
    
    var redirectUri: String
    
    var resourceRequestMethod: js.UndefOr[String] = js.undefined
    
    var resourceRequestUri: js.UndefOr[String] = js.undefined
    
    var responseMode: ResponseMode
    
    var scopes: js.Array[String]
    
    var shrClaims: js.UndefOr[String] = js.undefined
    
    var shrNonce: js.UndefOr[String] = js.undefined
    
    var sid: js.UndefOr[String] = js.undefined
    
    var sshJwk: js.UndefOr[String] = js.undefined
    
    var sshKid: js.UndefOr[String] = js.undefined
    
    var state: String
    
    var tokenQueryParameters: js.UndefOr[StringDict] = js.undefined
  }
  object AuthorizationUrlRequest {
    
    inline def apply(
      authority: String,
      correlationId: String,
      nonce: String,
      redirectUri: String,
      responseMode: ResponseMode,
      scopes: js.Array[String],
      state: String
    ): AuthorizationUrlRequest = {
      val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], correlationId = correlationId.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any], responseMode = responseMode.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationUrlRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthorizationUrlRequest] (val x: Self) extends AnyVal {
      
      inline def setAccount(value: AccountInfo): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
      
      inline def setAuthenticationScheme(value: AuthenticationScheme): Self = StObject.set(x, "authenticationScheme", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationSchemeUndefined: Self = StObject.set(x, "authenticationScheme", js.undefined)
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setAzureCloudOptions(value: AzureCloudOptions): Self = StObject.set(x, "azureCloudOptions", value.asInstanceOf[js.Any])
      
      inline def setAzureCloudOptionsUndefined: Self = StObject.set(x, "azureCloudOptions", js.undefined)
      
      inline def setClaims(value: String): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setCodeChallenge(value: String): Self = StObject.set(x, "codeChallenge", value.asInstanceOf[js.Any])
      
      inline def setCodeChallengeMethod(value: String): Self = StObject.set(x, "codeChallengeMethod", value.asInstanceOf[js.Any])
      
      inline def setCodeChallengeMethodUndefined: Self = StObject.set(x, "codeChallengeMethod", js.undefined)
      
      inline def setCodeChallengeUndefined: Self = StObject.set(x, "codeChallenge", js.undefined)
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setDomainHint(value: String): Self = StObject.set(x, "domainHint", value.asInstanceOf[js.Any])
      
      inline def setDomainHintUndefined: Self = StObject.set(x, "domainHint", js.undefined)
      
      inline def setExtraQueryParameters(value: StringDict): Self = StObject.set(x, "extraQueryParameters", value.asInstanceOf[js.Any])
      
      inline def setExtraQueryParametersUndefined: Self = StObject.set(x, "extraQueryParameters", js.undefined)
      
      inline def setExtraScopesToConsent(value: js.Array[String]): Self = StObject.set(x, "extraScopesToConsent", value.asInstanceOf[js.Any])
      
      inline def setExtraScopesToConsentUndefined: Self = StObject.set(x, "extraScopesToConsent", js.undefined)
      
      inline def setExtraScopesToConsentVarargs(value: String*): Self = StObject.set(x, "extraScopesToConsent", js.Array(value*))
      
      inline def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
      
      inline def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setResourceRequestMethod(value: String): Self = StObject.set(x, "resourceRequestMethod", value.asInstanceOf[js.Any])
      
      inline def setResourceRequestMethodUndefined: Self = StObject.set(x, "resourceRequestMethod", js.undefined)
      
      inline def setResourceRequestUri(value: String): Self = StObject.set(x, "resourceRequestUri", value.asInstanceOf[js.Any])
      
      inline def setResourceRequestUriUndefined: Self = StObject.set(x, "resourceRequestUri", js.undefined)
      
      inline def setResponseMode(value: ResponseMode): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setShrClaims(value: String): Self = StObject.set(x, "shrClaims", value.asInstanceOf[js.Any])
      
      inline def setShrClaimsUndefined: Self = StObject.set(x, "shrClaims", js.undefined)
      
      inline def setShrNonce(value: String): Self = StObject.set(x, "shrNonce", value.asInstanceOf[js.Any])
      
      inline def setShrNonceUndefined: Self = StObject.set(x, "shrNonce", js.undefined)
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
      
      inline def setSshJwk(value: String): Self = StObject.set(x, "sshJwk", value.asInstanceOf[js.Any])
      
      inline def setSshJwkUndefined: Self = StObject.set(x, "sshJwk", js.undefined)
      
      inline def setSshKid(value: String): Self = StObject.set(x, "sshKid", value.asInstanceOf[js.Any])
      
      inline def setSshKidUndefined: Self = StObject.set(x, "sshKid", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTokenQueryParameters(value: StringDict): Self = StObject.set(x, "tokenQueryParameters", value.asInstanceOf[js.Any])
      
      inline def setTokenQueryParametersUndefined: Self = StObject.set(x, "tokenQueryParameters", js.undefined)
    }
  }
}
