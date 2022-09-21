package typings.azureMsalNode

import typings.azureMsalCommon.icryptoMod.ICrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoProviderMod {
  
  @JSImport("@azure/msal-node/dist/crypto/CryptoProvider", "CryptoProvider")
  @js.native
  open class CryptoProvider ()
    extends StObject
       with ICrypto {
    
    /**
      * Generates a keypair, stores it and returns a thumbprint - not yet implemented for node
      */
    def getPublicKeyThumbprint(): js.Promise[String] = js.native
    
    /* private */ var guidGenerator: Any = js.native
    
    /* private */ var hashUtils: Any = js.native
    
    /* private */ var pkceGenerator: Any = js.native
    
    /**
      * Removes cryptographic keypair from key store matching the keyId passed in
      * @param kid
      */
    def removeTokenBindingKey(): js.Promise[Boolean] = js.native
    
    /**
      * Signs the given object as a jwt payload with private key retrieved by given kid - currently not implemented for node
      */
    def signJwt(): js.Promise[String] = js.native
  }
}
