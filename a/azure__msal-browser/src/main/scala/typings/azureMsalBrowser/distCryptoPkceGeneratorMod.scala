package typings.azureMsalBrowser

import typings.azureMsalBrowser.distCryptoBrowserCryptoMod.BrowserCrypto
import typings.azureMsalCommon.distCryptoIcryptoMod.PkceCodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCryptoPkceGeneratorMod {
  
  @JSImport("@azure/msal-browser/dist/crypto/PkceGenerator", "PkceGenerator")
  @js.native
  open class PkceGenerator protected () extends StObject {
    def this(cryptoObj: BrowserCrypto) = this()
    
    /* private */ var base64Encode: Any = js.native
    
    /* private */ var cryptoObj: Any = js.native
    
    /**
      * Creates a base64 encoded PKCE Code Challenge string from the
      * hash created from the PKCE Code Verifier supplied
      */
    /* private */ var generateCodeChallengeFromVerifier: Any = js.native
    
    /**
      * Generates a random 32 byte buffer and returns the base64
      * encoded string to be used as a PKCE Code Verifier
      */
    /* private */ var generateCodeVerifier: Any = js.native
    
    /**
      * Generates PKCE Codes. See the RFC for more information: https://tools.ietf.org/html/rfc7636
      */
    def generateCodes(): js.Promise[PkceCodes] = js.native
  }
}
