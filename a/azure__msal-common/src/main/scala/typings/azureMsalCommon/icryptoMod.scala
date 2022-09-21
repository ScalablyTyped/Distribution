package typings.azureMsalCommon

import typings.azureMsalCommon.signedHttpRequestMod.SignedHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object icryptoMod {
  
  @JSImport("@azure/msal-common/dist/crypto/ICrypto", "DEFAULT_CRYPTO_IMPLEMENTATION")
  @js.native
  val DEFAULT_CRYPTO_IMPLEMENTATION: ICrypto = js.native
  
  @js.native
  trait ICrypto extends StObject {
    
    /**
      * base64 decode string
      * @param input
      */
    def base64Decode(input: String): String = js.native
    
    /**
      * base64 Encode string
      * @param input
      */
    def base64Encode(input: String): String = js.native
    
    /**
      * Removes all cryptographic keys from IndexedDB storage
      */
    def clearKeystore(): js.Promise[Boolean] = js.native
    
    /**
      * Creates a guid randomly.
      */
    def createNewGuid(): String = js.native
    
    /**
      * Generate PKCE codes for OAuth. See RFC here: https://tools.ietf.org/html/rfc7636
      */
    def generatePkceCodes(): js.Promise[PkceCodes] = js.native
    
    /**
      * Generates an JWK RSA S256 Thumbprint
      * @param request
      */
    def getPublicKeyThumbprint(request: SignedHttpRequestParameters): js.Promise[String] = js.native
    
    /**
      * Returns the SHA-256 hash of an input string
      * @param plainText
      */
    def hashString(plainText: String): js.Promise[String] = js.native
    
    /**
      * Removes cryptographic keypair from key store matching the keyId passed in
      * @param kid
      */
    def removeTokenBindingKey(kid: String): js.Promise[Boolean] = js.native
    
    /**
      * Returns a signed proof-of-possession token with a given acces token that contains a cnf claim with the required kid.
      * @param accessToken
      */
    def signJwt(payload: SignedHttpRequest, kid: String): js.Promise[String] = js.native
    def signJwt(payload: SignedHttpRequest, kid: String, correlationId: String): js.Promise[String] = js.native
  }
  
  trait PkceCodes extends StObject {
    
    var challenge: String
    
    var verifier: String
  }
  object PkceCodes {
    
    inline def apply(challenge: String, verifier: String): PkceCodes = {
      val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], verifier = verifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[PkceCodes]
    }
    
    extension [Self <: PkceCodes](x: Self) {
      
      inline def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
      
      inline def setVerifier(value: String): Self = StObject.set(x, "verifier", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<@azure/msal-common.@azure/msal-common/dist/request/BaseAuthRequest.BaseAuthRequest, 'resourceRequestMethod' | 'resourceRequestUri' | 'shrClaims' | 'shrNonce'> & {  correlationId :string | undefined} */
  trait SignedHttpRequestParameters extends StObject {
    
    var correlationId: js.UndefOr[String] = js.undefined
    
    var resourceRequestMethod: js.UndefOr[String] = js.undefined
    
    var resourceRequestUri: js.UndefOr[String] = js.undefined
    
    var shrClaims: js.UndefOr[String] = js.undefined
    
    var shrNonce: js.UndefOr[String] = js.undefined
  }
  object SignedHttpRequestParameters {
    
    inline def apply(): SignedHttpRequestParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignedHttpRequestParameters]
    }
    
    extension [Self <: SignedHttpRequestParameters](x: Self) {
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
      
      inline def setResourceRequestMethod(value: String): Self = StObject.set(x, "resourceRequestMethod", value.asInstanceOf[js.Any])
      
      inline def setResourceRequestMethodUndefined: Self = StObject.set(x, "resourceRequestMethod", js.undefined)
      
      inline def setResourceRequestUri(value: String): Self = StObject.set(x, "resourceRequestUri", value.asInstanceOf[js.Any])
      
      inline def setResourceRequestUriUndefined: Self = StObject.set(x, "resourceRequestUri", js.undefined)
      
      inline def setShrClaims(value: String): Self = StObject.set(x, "shrClaims", value.asInstanceOf[js.Any])
      
      inline def setShrClaimsUndefined: Self = StObject.set(x, "shrClaims", js.undefined)
      
      inline def setShrNonce(value: String): Self = StObject.set(x, "shrNonce", value.asInstanceOf[js.Any])
      
      inline def setShrNonceUndefined: Self = StObject.set(x, "shrNonce", js.undefined)
    }
  }
}
