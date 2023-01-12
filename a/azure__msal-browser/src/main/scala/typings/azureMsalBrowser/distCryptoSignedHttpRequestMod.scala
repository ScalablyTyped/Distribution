package typings.azureMsalBrowser

import typings.azureMsalCommon.distConfigClientConfigurationMod.LoggerOptions
import typings.azureMsalCommon.distCryptoIcryptoMod.SignedHttpRequestParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCryptoSignedHttpRequestMod {
  
  @JSImport("@azure/msal-browser/dist/crypto/SignedHttpRequest", "SignedHttpRequest")
  @js.native
  open class SignedHttpRequest protected () extends StObject {
    def this(shrParameters: SignedHttpRequestParameters) = this()
    def this(shrParameters: SignedHttpRequestParameters, shrOptions: SignedHttpRequestOptions) = this()
    
    /* private */ var cryptoOps: Any = js.native
    
    /**
      * Generates and caches a keypair for the given request options.
      * @returns Public key digest, which should be sent to the token issuer.
      */
    def generatePublicKeyThumbprint(): js.Promise[String] = js.native
    
    /* private */ var logger: Any = js.native
    
    /* private */ var popTokenGenerator: Any = js.native
    
    /**
      * Removes cached keys from browser for given public key thumbprint
      * @param publicKeyThumbprint Public key digest (from generatePublicKeyThumbprint API)
      * @returns If keys are properly deleted
      */
    def removeKeys(publicKeyThumbprint: String): js.Promise[Boolean] = js.native
    
    /* private */ var shrParameters: Any = js.native
    
    /**
      * Generates a signed http request for the given payload with the given key.
      * @param payload Payload to sign (e.g. access token)
      * @param publicKeyThumbprint Public key digest (from generatePublicKeyThumbprint API)
      * @param claims Additional claims to include/override in the signed JWT
      * @returns Pop token signed with the corresponding private key
      */
    def signRequest(payload: String, publicKeyThumbprint: String): js.Promise[String] = js.native
    def signRequest(payload: String, publicKeyThumbprint: String, claims: js.Object): js.Promise[String] = js.native
  }
  
  trait SignedHttpRequestOptions extends StObject {
    
    var loggerOptions: LoggerOptions
  }
  object SignedHttpRequestOptions {
    
    inline def apply(loggerOptions: LoggerOptions): SignedHttpRequestOptions = {
      val __obj = js.Dynamic.literal(loggerOptions = loggerOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignedHttpRequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignedHttpRequestOptions] (val x: Self) extends AnyVal {
      
      inline def setLoggerOptions(value: LoggerOptions): Self = StObject.set(x, "loggerOptions", value.asInstanceOf[js.Any])
    }
  }
}
