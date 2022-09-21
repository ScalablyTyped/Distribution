package typings.azureMsalNode

import typings.azureMsalCommon.icryptoMod.PkceCodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pkceGeneratorMod {
  
  @JSImport("@azure/msal-node/dist/crypto/PkceGenerator", "PkceGenerator")
  @js.native
  open class PkceGenerator () extends StObject {
    
    /**
      * generate the challenge from the codeVerfier; reference: https://tools.ietf.org/html/rfc7636#section-4.2
      * @param codeVerifier
      */
    /* private */ var generateCodeChallengeFromVerifier: Any = js.native
    
    /**
      * generates the codeVerfier; reference: https://tools.ietf.org/html/rfc7636#section-4.1
      */
    /* private */ var generateCodeVerifier: Any = js.native
    
    /**
      * generates the codeVerfier and the challenge from the codeVerfier
      * reference: https://tools.ietf.org/html/rfc7636#section-4.1 and https://tools.ietf.org/html/rfc7636#section-4.2
      */
    def generatePkceCodes(): js.Promise[PkceCodes] = js.native
    
    /* private */ var hashUtils: Any = js.native
  }
}
