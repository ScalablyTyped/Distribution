package typings.azureMsalBrowser

import typings.azureMsalBrowser.browserConstantsMod.NativeExtensionMethod
import typings.azureMsalCommon.msalTypesMod.StringDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeRequestMod {
  
  trait NativeExtensionRequest extends StObject {
    
    var body: NativeExtensionRequestBody
    
    var channel: String
    
    var extensionId: js.UndefOr[String] = js.undefined
    
    var responseId: Double
  }
  object NativeExtensionRequest {
    
    inline def apply(body: NativeExtensionRequestBody, channel: String, responseId: Double): NativeExtensionRequest = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], responseId = responseId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeExtensionRequest]
    }
    
    extension [Self <: NativeExtensionRequest](x: Self) {
      
      inline def setBody(value: NativeExtensionRequestBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setExtensionId(value: String): Self = StObject.set(x, "extensionId", value.asInstanceOf[js.Any])
      
      inline def setExtensionIdUndefined: Self = StObject.set(x, "extensionId", js.undefined)
      
      inline def setResponseId(value: Double): Self = StObject.set(x, "responseId", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeExtensionRequestBody extends StObject {
    
    var method: NativeExtensionMethod
    
    var request: js.UndefOr[NativeTokenRequest] = js.undefined
  }
  object NativeExtensionRequestBody {
    
    inline def apply(method: NativeExtensionMethod): NativeExtensionRequestBody = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeExtensionRequestBody]
    }
    
    extension [Self <: NativeExtensionRequestBody](x: Self) {
      
      inline def setMethod(value: NativeExtensionMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: NativeTokenRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    }
  }
  
  trait NativeTokenRequest extends StObject {
    
    var accountId: String
    
    var authority: String
    
    var claims: js.UndefOr[String] = js.undefined
    
    var clientId: String
    
    var correlationId: String
    
    var extendedExpiryToken: js.UndefOr[Boolean] = js.undefined
    
    var extraParameters: js.UndefOr[StringDict] = js.undefined
    
    var keyId: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var prompt: js.UndefOr[String] = js.undefined
    
    var redirectUri: String
    
    var reqCnf: js.UndefOr[String] = js.undefined
    
    var resourceRequestMethod: js.UndefOr[String] = js.undefined
    
    var resourceRequestUri: js.UndefOr[String] = js.undefined
    
    var scope: String
    
    var shrClaims: js.UndefOr[String] = js.undefined
    
    var shrNonce: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var tokenType: js.UndefOr[String] = js.undefined
    
    var windowTitleSubstring: String
  }
  object NativeTokenRequest {
    
    inline def apply(
      accountId: String,
      authority: String,
      clientId: String,
      correlationId: String,
      redirectUri: String,
      scope: String,
      windowTitleSubstring: String
    ): NativeTokenRequest = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], authority = authority.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], correlationId = correlationId.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], windowTitleSubstring = windowTitleSubstring.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeTokenRequest]
    }
    
    extension [Self <: NativeTokenRequest](x: Self) {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setClaims(value: String): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setExtendedExpiryToken(value: Boolean): Self = StObject.set(x, "extendedExpiryToken", value.asInstanceOf[js.Any])
      
      inline def setExtendedExpiryTokenUndefined: Self = StObject.set(x, "extendedExpiryToken", js.undefined)
      
      inline def setExtraParameters(value: StringDict): Self = StObject.set(x, "extraParameters", value.asInstanceOf[js.Any])
      
      inline def setExtraParametersUndefined: Self = StObject.set(x, "extraParameters", js.undefined)
      
      inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setReqCnf(value: String): Self = StObject.set(x, "reqCnf", value.asInstanceOf[js.Any])
      
      inline def setReqCnfUndefined: Self = StObject.set(x, "reqCnf", js.undefined)
      
      inline def setResourceRequestMethod(value: String): Self = StObject.set(x, "resourceRequestMethod", value.asInstanceOf[js.Any])
      
      inline def setResourceRequestMethodUndefined: Self = StObject.set(x, "resourceRequestMethod", js.undefined)
      
      inline def setResourceRequestUri(value: String): Self = StObject.set(x, "resourceRequestUri", value.asInstanceOf[js.Any])
      
      inline def setResourceRequestUriUndefined: Self = StObject.set(x, "resourceRequestUri", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setShrClaims(value: String): Self = StObject.set(x, "shrClaims", value.asInstanceOf[js.Any])
      
      inline def setShrClaimsUndefined: Self = StObject.set(x, "shrClaims", js.undefined)
      
      inline def setShrNonce(value: String): Self = StObject.set(x, "shrNonce", value.asInstanceOf[js.Any])
      
      inline def setShrNonceUndefined: Self = StObject.set(x, "shrNonce", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
      
      inline def setWindowTitleSubstring(value: String): Self = StObject.set(x, "windowTitleSubstring", value.asInstanceOf[js.Any])
    }
  }
}
