package typings.azureMsalBrowser

import typings.azureMsalBrowser.anon.CryptoinitPrngentropyUint
import typings.azureMsalBrowser.distCryptoIsubtlecryptoMod.ISubtleCrypto
import typings.std.AlgorithmIdentifier
import typings.std.CryptoKey
import typings.std.CryptoKeyPair
import typings.std.JsonWebKey
import typings.std.KeyUsage
import typings.std.RsaHashedImportParams
import typings.std.RsaHashedKeyGenParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCryptoMsrBrowserCryptoMod {
  
  @JSImport("@azure/msal-browser/dist/crypto/MsrBrowserCrypto", "MsrBrowserCrypto")
  @js.native
  open class MsrBrowserCrypto ()
    extends StObject
       with ISubtleCrypto {
    
    /* CompleteClass */
    override def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.Uint8Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /* CompleteClass */
    override def exportKey(key: CryptoKey): js.Promise[JsonWebKey] = js.native
    
    /* CompleteClass */
    override def generateKey(algorithm: RsaHashedKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[CryptoKeyPair] = js.native
    
    /* CompleteClass */
    override def getRandomValues(dataBuffer: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    /* CompleteClass */
    override def importKey(
      keyData: JsonWebKey,
      algorithm: RsaHashedImportParams,
      extractable: Boolean,
      keyUsages: js.Array[KeyUsage]
    ): js.Promise[CryptoKey] = js.native
    
    @JSName("initPrng")
    def initPrng_MMsrBrowserCrypto(entropy: js.typedarray.Uint8Array): Unit = js.native
    
    /* CompleteClass */
    override def sign(algorithm: AlgorithmIdentifier, key: CryptoKey, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
  }
  
  object global {
    
    trait Window extends StObject {
      
      var msrCrypto: CryptoinitPrngentropyUint
    }
    object Window {
      
      inline def apply(msrCrypto: CryptoinitPrngentropyUint): Window = {
        val __obj = js.Dynamic.literal(msrCrypto = msrCrypto.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def setMsrCrypto(value: CryptoinitPrngentropyUint): Self = StObject.set(x, "msrCrypto", value.asInstanceOf[js.Any])
      }
    }
  }
}
