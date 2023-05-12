package typings.azureMsalBrowser

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

object distCryptoMsBrowserCryptoMod {
  
  @JSImport("@azure/msal-browser/dist/crypto/MsBrowserCrypto", "MsBrowserCrypto")
  @js.native
  open class MsBrowserCrypto ()
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
    
    /* CompleteClass */
    override def sign(algorithm: AlgorithmIdentifier, key: CryptoKey, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
  }
}
