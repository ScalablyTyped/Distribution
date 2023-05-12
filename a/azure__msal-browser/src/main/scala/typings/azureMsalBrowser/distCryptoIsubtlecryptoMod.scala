package typings.azureMsalBrowser

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

object distCryptoIsubtlecryptoMod {
  
  trait ISubtleCrypto extends StObject {
    
    def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.Uint8Array): js.Promise[js.typedarray.ArrayBuffer]
    
    def exportKey(key: CryptoKey): js.Promise[JsonWebKey]
    
    def generateKey(algorithm: RsaHashedKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[CryptoKeyPair]
    
    def getRandomValues(dataBuffer: js.typedarray.Uint8Array): js.typedarray.Uint8Array
    
    def importKey(
      keyData: JsonWebKey,
      algorithm: RsaHashedImportParams,
      extractable: Boolean,
      keyUsages: js.Array[KeyUsage]
    ): js.Promise[CryptoKey]
    
    var initPrng: js.UndefOr[js.Function1[/* entropy */ js.typedarray.Uint8Array, Unit]] = js.undefined
    
    def sign(algorithm: AlgorithmIdentifier, key: CryptoKey, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer]
  }
  object ISubtleCrypto {
    
    inline def apply(
      digest: (AlgorithmIdentifier, js.typedarray.Uint8Array) => js.Promise[js.typedarray.ArrayBuffer],
      exportKey: CryptoKey => js.Promise[JsonWebKey],
      generateKey: (RsaHashedKeyGenParams, Boolean, js.Array[KeyUsage]) => js.Promise[CryptoKeyPair],
      getRandomValues: js.typedarray.Uint8Array => js.typedarray.Uint8Array,
      importKey: (JsonWebKey, RsaHashedImportParams, Boolean, js.Array[KeyUsage]) => js.Promise[CryptoKey],
      sign: (AlgorithmIdentifier, CryptoKey, js.typedarray.ArrayBuffer) => js.Promise[js.typedarray.ArrayBuffer]
    ): ISubtleCrypto = {
      val __obj = js.Dynamic.literal(digest = js.Any.fromFunction2(digest), exportKey = js.Any.fromFunction1(exportKey), generateKey = js.Any.fromFunction3(generateKey), getRandomValues = js.Any.fromFunction1(getRandomValues), importKey = js.Any.fromFunction4(importKey), sign = js.Any.fromFunction3(sign))
      __obj.asInstanceOf[ISubtleCrypto]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISubtleCrypto] (val x: Self) extends AnyVal {
      
      inline def setDigest(value: (AlgorithmIdentifier, js.typedarray.Uint8Array) => js.Promise[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "digest", js.Any.fromFunction2(value))
      
      inline def setExportKey(value: CryptoKey => js.Promise[JsonWebKey]): Self = StObject.set(x, "exportKey", js.Any.fromFunction1(value))
      
      inline def setGenerateKey(value: (RsaHashedKeyGenParams, Boolean, js.Array[KeyUsage]) => js.Promise[CryptoKeyPair]): Self = StObject.set(x, "generateKey", js.Any.fromFunction3(value))
      
      inline def setGetRandomValues(value: js.typedarray.Uint8Array => js.typedarray.Uint8Array): Self = StObject.set(x, "getRandomValues", js.Any.fromFunction1(value))
      
      inline def setImportKey(value: (JsonWebKey, RsaHashedImportParams, Boolean, js.Array[KeyUsage]) => js.Promise[CryptoKey]): Self = StObject.set(x, "importKey", js.Any.fromFunction4(value))
      
      inline def setInitPrng(value: /* entropy */ js.typedarray.Uint8Array => Unit): Self = StObject.set(x, "initPrng", js.Any.fromFunction1(value))
      
      inline def setInitPrngUndefined: Self = StObject.set(x, "initPrng", js.undefined)
      
      inline def setSign(
        value: (AlgorithmIdentifier, CryptoKey, js.typedarray.ArrayBuffer) => js.Promise[js.typedarray.ArrayBuffer]
      ): Self = StObject.set(x, "sign", js.Any.fromFunction3(value))
    }
  }
}
