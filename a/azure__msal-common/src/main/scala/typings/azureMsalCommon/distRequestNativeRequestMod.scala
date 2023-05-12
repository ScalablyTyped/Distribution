package typings.azureMsalCommon

import typings.azureMsalCommon.distUtilsMsalTypesMod.StringDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRequestNativeRequestMod {
  
  trait NativeRequest extends StObject {
    
    var accountId: js.UndefOr[String] = js.undefined
    
    var authenticationScheme: js.UndefOr[String] = js.undefined
    
    var authority: String
    
    var claims: js.UndefOr[String] = js.undefined
    
    var clientId: String
    
    var correlationId: String
    
    var extraParameters: js.UndefOr[StringDict] = js.undefined
    
    var extraScopesToConsent: js.UndefOr[js.Array[String]] = js.undefined
    
    var forceRefresh: js.UndefOr[Boolean] = js.undefined
    
    var loginHint: js.UndefOr[String] = js.undefined
    
    var prompt: js.UndefOr[String] = js.undefined
    
    var redirectUri: String
    
    var resourceRequestMethod: js.UndefOr[String] = js.undefined
    
    var resourceRequestUri: js.UndefOr[String] = js.undefined
    
    var scopes: js.Array[String]
    
    var shrNonce: js.UndefOr[String] = js.undefined
  }
  object NativeRequest {
    
    inline def apply(
      authority: String,
      clientId: String,
      correlationId: String,
      redirectUri: String,
      scopes: js.Array[String]
    ): NativeRequest = {
      val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], correlationId = correlationId.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeRequest] (val x: Self) extends AnyVal {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      inline def setAuthenticationScheme(value: String): Self = StObject.set(x, "authenticationScheme", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationSchemeUndefined: Self = StObject.set(x, "authenticationScheme", js.undefined)
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setClaims(value: String): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setExtraParameters(value: StringDict): Self = StObject.set(x, "extraParameters", value.asInstanceOf[js.Any])
      
      inline def setExtraParametersUndefined: Self = StObject.set(x, "extraParameters", js.undefined)
      
      inline def setExtraScopesToConsent(value: js.Array[String]): Self = StObject.set(x, "extraScopesToConsent", value.asInstanceOf[js.Any])
      
      inline def setExtraScopesToConsentUndefined: Self = StObject.set(x, "extraScopesToConsent", js.undefined)
      
      inline def setExtraScopesToConsentVarargs(value: String*): Self = StObject.set(x, "extraScopesToConsent", js.Array(value*))
      
      inline def setForceRefresh(value: Boolean): Self = StObject.set(x, "forceRefresh", value.asInstanceOf[js.Any])
      
      inline def setForceRefreshUndefined: Self = StObject.set(x, "forceRefresh", js.undefined)
      
      inline def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
      
      inline def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setResourceRequestMethod(value: String): Self = StObject.set(x, "resourceRequestMethod", value.asInstanceOf[js.Any])
      
      inline def setResourceRequestMethodUndefined: Self = StObject.set(x, "resourceRequestMethod", js.undefined)
      
      inline def setResourceRequestUri(value: String): Self = StObject.set(x, "resourceRequestUri", value.asInstanceOf[js.Any])
      
      inline def setResourceRequestUriUndefined: Self = StObject.set(x, "resourceRequestUri", js.undefined)
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setShrNonce(value: String): Self = StObject.set(x, "shrNonce", value.asInstanceOf[js.Any])
      
      inline def setShrNonceUndefined: Self = StObject.set(x, "shrNonce", js.undefined)
    }
  }
}
