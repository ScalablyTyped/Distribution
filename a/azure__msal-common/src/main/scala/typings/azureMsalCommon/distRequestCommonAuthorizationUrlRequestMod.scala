package typings.azureMsalCommon

import typings.azureMsalCommon.distAccountAccountInfoMod.AccountInfo
import typings.azureMsalCommon.distRequestBaseAuthRequestMod.BaseAuthRequest
import typings.azureMsalCommon.distUtilsConstantsMod.ResponseMode
import typings.azureMsalCommon.distUtilsMsalTypesMod.StringDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRequestCommonAuthorizationUrlRequestMod {
  
  trait CommonAuthorizationUrlRequest
    extends StObject
       with BaseAuthRequest {
    
    var account: js.UndefOr[AccountInfo] = js.undefined
    
    var codeChallenge: js.UndefOr[String] = js.undefined
    
    var codeChallengeMethod: js.UndefOr[String] = js.undefined
    
    var domainHint: js.UndefOr[String] = js.undefined
    
    var extraQueryParameters: js.UndefOr[StringDict] = js.undefined
    
    var extraScopesToConsent: js.UndefOr[js.Array[String]] = js.undefined
    
    var loginHint: js.UndefOr[String] = js.undefined
    
    var nativeBroker: js.UndefOr[Boolean] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var prompt: js.UndefOr[String] = js.undefined
    
    var redirectUri: String
    
    var responseMode: ResponseMode
    
    var sid: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
  }
  object CommonAuthorizationUrlRequest {
    
    inline def apply(
      authority: String,
      correlationId: String,
      redirectUri: String,
      responseMode: ResponseMode,
      scopes: js.Array[String]
    ): CommonAuthorizationUrlRequest = {
      val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], correlationId = correlationId.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any], responseMode = responseMode.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonAuthorizationUrlRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonAuthorizationUrlRequest] (val x: Self) extends AnyVal {
      
      inline def setAccount(value: AccountInfo): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
      
      inline def setCodeChallenge(value: String): Self = StObject.set(x, "codeChallenge", value.asInstanceOf[js.Any])
      
      inline def setCodeChallengeMethod(value: String): Self = StObject.set(x, "codeChallengeMethod", value.asInstanceOf[js.Any])
      
      inline def setCodeChallengeMethodUndefined: Self = StObject.set(x, "codeChallengeMethod", js.undefined)
      
      inline def setCodeChallengeUndefined: Self = StObject.set(x, "codeChallenge", js.undefined)
      
      inline def setDomainHint(value: String): Self = StObject.set(x, "domainHint", value.asInstanceOf[js.Any])
      
      inline def setDomainHintUndefined: Self = StObject.set(x, "domainHint", js.undefined)
      
      inline def setExtraQueryParameters(value: StringDict): Self = StObject.set(x, "extraQueryParameters", value.asInstanceOf[js.Any])
      
      inline def setExtraQueryParametersUndefined: Self = StObject.set(x, "extraQueryParameters", js.undefined)
      
      inline def setExtraScopesToConsent(value: js.Array[String]): Self = StObject.set(x, "extraScopesToConsent", value.asInstanceOf[js.Any])
      
      inline def setExtraScopesToConsentUndefined: Self = StObject.set(x, "extraScopesToConsent", js.undefined)
      
      inline def setExtraScopesToConsentVarargs(value: String*): Self = StObject.set(x, "extraScopesToConsent", js.Array(value*))
      
      inline def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
      
      inline def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
      
      inline def setNativeBroker(value: Boolean): Self = StObject.set(x, "nativeBroker", value.asInstanceOf[js.Any])
      
      inline def setNativeBrokerUndefined: Self = StObject.set(x, "nativeBroker", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setResponseMode(value: ResponseMode): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
