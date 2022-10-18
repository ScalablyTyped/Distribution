package typings.azureMsalNode

import typings.azureMsalNode.distCryptoCryptoProviderMod.CryptoProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientClientAssertionMod {
  
  @JSImport("@azure/msal-node/dist/client/ClientAssertion", "ClientAssertion")
  @js.native
  open class ClientAssertion () extends StObject {
    
    /**
      * JWT format and required claims specified: https://tools.ietf.org/html/rfc7523#section-3
      */
    /* private */ var createJwt: Any = js.native
    
    /* private */ var expirationTime: Any = js.native
    
    /**
      * Update JWT for certificate based clientAssertion, if passed by the user, uses it as is
      * @param cryptoProvider - library's crypto helper
      * @param issuer - iss claim
      * @param jwtAudience - aud claim
      */
    def getJwt(cryptoProvider: CryptoProvider, issuer: String, jwtAudience: String): String = js.native
    
    /**
      * Utility API to check expiration
      */
    /* private */ var isExpired: Any = js.native
    
    /* private */ var issuer: Any = js.native
    
    /* private */ var jwt: Any = js.native
    
    /* private */ var jwtAudience: Any = js.native
    
    /* private */ var privateKey: Any = js.native
    
    /* private */ var publicCertificate: Any = js.native
    
    /* private */ var thumbprint: Any = js.native
  }
  /* static members */
  object ClientAssertion {
    
    @JSImport("@azure/msal-node/dist/client/ClientAssertion", "ClientAssertion")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Initialize the ClientAssertion class from the clientAssertion passed by the user
      * @param assertion - refer https://tools.ietf.org/html/rfc7521
      */
    inline def fromAssertion(assertion: String): ClientAssertion = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAssertion")(assertion.asInstanceOf[js.Any]).asInstanceOf[ClientAssertion]
    
    /**
      * Initialize the ClientAssertion class from the certificate passed by the user
      * @param thumbprint - identifier of a certificate
      * @param privateKey - secret key
      * @param publicCertificate - electronic document provided to prove the ownership of the public key
      */
    inline def fromCertificate(thumbprint: String, privateKey: String): ClientAssertion = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCertificate")(thumbprint.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[ClientAssertion]
    inline def fromCertificate(thumbprint: String, privateKey: String, publicCertificate: String): ClientAssertion = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCertificate")(thumbprint.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], publicCertificate.asInstanceOf[js.Any])).asInstanceOf[ClientAssertion]
    
    /**
      * Extracts the raw certs from a given certificate string and returns them in an array.
      * @param publicCertificate - electronic document provided to prove the ownership of the public key
      */
    inline def parseCertificate(publicCertificate: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCertificate")(publicCertificate.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
}
