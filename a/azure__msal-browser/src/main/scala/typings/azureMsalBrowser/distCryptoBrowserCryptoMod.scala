package typings.azureMsalBrowser

import typings.azureMsalBrowser.mod.Logger
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
    
    /* private */ var _keygenAlgorithmOptions: Any = js.native
    
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
      * IE Helper function for SHA digest.
      * @param algorithm
      * @param data
      */
    /* private */ var getMSCryptoDigest: Any = js.native
    
    /**
      * Populates buffer with cryptographically random values.
      * @param dataBuffer
      */
    def getRandomValues(dataBuffer: js.typedarray.Uint8Array): Unit = js.native
    
    /**
      * Helper function for SHA digest.
      * @param algorithm
      * @param data
      */
    /* private */ var getSubtleCryptoDigest: Any = js.native
    
    /**
      * Check whether browser crypto is available.
      */
    /* private */ var hasBrowserCrypto: Any = js.native
    
    /**
      * Check whether IE crypto or other browser cryptography is available.
      */
    /* private */ var hasCryptoAPI: Any = js.native
    
    /**
      * Checks whether IE crypto (AKA msCrypto) is available.
      */
    /* private */ var hasIECrypto: Any = js.native
    
    /**
      * Imports key as Json Web Key (JWK), can set extractable and usages.
      * @param key
      * @param format
      * @param extractable
      * @param usages
      */
    def importJwk(key: JsonWebKey, extractable: Boolean, usages: js.Array[KeyUsage]): js.Promise[CryptoKey] = js.native
    
    /* private */ var logger: Any = js.native
    
    /**
      * IE Helper function for exportKey
      * @param key
      * @param format
      */
    /* private */ var msCryptoExportJwk: Any = js.native
    
    /**
      * IE Helper function for generating a keypair
      * @param extractable
      * @param usages
      */
    /* private */ var msCryptoGenerateKey: Any = js.native
    
    /**
      * IE Helper function for importKey
      * @param key
      * @param format
      * @param extractable
      * @param usages
      */
    /* private */ var msCryptoImportKey: Any = js.native
    
    /**
      * IE Helper function for sign JWT
      * @param key
      * @param data
      */
    /* private */ var msCryptoSign: Any = js.native
    
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
  }
  /* static members */
  object BrowserCrypto {
    
    @JSImport("@azure/msal-browser/dist/crypto/BrowserCrypto", "BrowserCrypto")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns stringified jwk.
      * @param jwk
      */
    inline def getJwkString(jwk: JsonWebKey): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getJwkString")(jwk.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
