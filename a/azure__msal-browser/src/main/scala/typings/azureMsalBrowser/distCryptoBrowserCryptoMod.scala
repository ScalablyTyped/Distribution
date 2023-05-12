package typings.azureMsalBrowser

import typings.azureMsalBrowser.distConfigConfigurationMod.CryptoOptions
import typings.azureMsalCommon.mod.Logger
import typings.std.CryptoKey
import typings.std.CryptoKeyPair
import typings.std.JsonWebKey
import typings.std.KeyUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCryptoBrowserCryptoMod {
  
  @JSImport("@azure/msal-browser/dist/crypto/BrowserCrypto", "BrowserCrypto")
  @js.native
  open class BrowserCrypto protected () extends StObject {
    def this(logger: Logger) = this()
    def this(logger: Logger, cryptoOptions: CryptoOptions) = this()
    
    /* private */ var cryptoOptions: Any = js.native
    
    /**
      * Export key as Json Web Key (JWK)
      * @param key
      * @param format
      */
    def exportJwk(key: CryptoKey): js.Promise[JsonWebKey] = js.native
    
    /**
      * Generates a keypair based on current keygen algorithm config.
      * @param extractable
      * @param usages
      */
    def generateKeyPair(extractable: Boolean, usages: js.Array[KeyUsage]): js.Promise[CryptoKeyPair] = js.native
    
    /**
      * Populates buffer with cryptographically random values.
      * @param dataBuffer
      */
    def getRandomValues(dataBuffer: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    /**
      * Check whether browser crypto is available.
      */
    /* private */ var hasBrowserCrypto: Any = js.native
    
    /**
      * Check whether IE crypto or other browser cryptography is available.
      */
    /* private */ var hasIECrypto: Any = js.native
    
    /**
      * Check whether MSR crypto polyfill is available
      */
    /* private */ var hasMsrCrypto: Any = js.native
    
    /**
      * Imports key as Json Web Key (JWK), can set extractable and usages.
      * @param key
      * @param format
      * @param extractable
      * @param usages
      */
    def importJwk(key: JsonWebKey, extractable: Boolean, usages: js.Array[KeyUsage]): js.Promise[CryptoKey] = js.native
    
    /* private */ var keygenAlgorithmOptions: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /**
      * Returns a sha-256 hash of the given dataString as an ArrayBuffer.
      * @param dataString
      */
    def sha256Digest(dataString: String): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /**
      * Signs given data with given key
      * @param key
      * @param data
      */
    def sign(key: CryptoKey, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /* private */ var subtleCrypto: Any = js.native
  }
}
