package typings.chainsafeLibp2pNoise

import typings.chainsafeLibp2pNoise.distSrcHandshakeMod.Hkdf
import typings.chainsafeLibp2pNoise.distSrcLibp2pMod.KeyPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCryptoMod {
  
  trait ICryptoInterface extends StObject {
    
    def chaCha20Poly1305Decrypt(
      ciphertext: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      ad: js.typedarray.Uint8Array,
      k: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array | Null
    
    def chaCha20Poly1305Encrypt(
      plaintext: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      ad: js.typedarray.Uint8Array,
      k: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array
    
    def generateX25519KeyPair(): KeyPair
    
    def generateX25519KeyPairFromSeed(seed: js.typedarray.Uint8Array): KeyPair
    
    def generateX25519SharedKey(privateKey: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array
    
    def getHKDF(ck: js.typedarray.Uint8Array, ikm: js.typedarray.Uint8Array): Hkdf
    
    def hashSHA256(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array
  }
  object ICryptoInterface {
    
    inline def apply(
      chaCha20Poly1305Decrypt: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array | Null,
      chaCha20Poly1305Encrypt: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array,
      generateX25519KeyPair: () => KeyPair,
      generateX25519KeyPairFromSeed: js.typedarray.Uint8Array => KeyPair,
      generateX25519SharedKey: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array,
      getHKDF: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => Hkdf,
      hashSHA256: js.typedarray.Uint8Array => js.typedarray.Uint8Array
    ): ICryptoInterface = {
      val __obj = js.Dynamic.literal(chaCha20Poly1305Decrypt = js.Any.fromFunction4(chaCha20Poly1305Decrypt), chaCha20Poly1305Encrypt = js.Any.fromFunction4(chaCha20Poly1305Encrypt), generateX25519KeyPair = js.Any.fromFunction0(generateX25519KeyPair), generateX25519KeyPairFromSeed = js.Any.fromFunction1(generateX25519KeyPairFromSeed), generateX25519SharedKey = js.Any.fromFunction2(generateX25519SharedKey), getHKDF = js.Any.fromFunction2(getHKDF), hashSHA256 = js.Any.fromFunction1(hashSHA256))
      __obj.asInstanceOf[ICryptoInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICryptoInterface] (val x: Self) extends AnyVal {
      
      inline def setChaCha20Poly1305Decrypt(
        value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array | Null
      ): Self = StObject.set(x, "chaCha20Poly1305Decrypt", js.Any.fromFunction4(value))
      
      inline def setChaCha20Poly1305Encrypt(
        value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array
      ): Self = StObject.set(x, "chaCha20Poly1305Encrypt", js.Any.fromFunction4(value))
      
      inline def setGenerateX25519KeyPair(value: () => KeyPair): Self = StObject.set(x, "generateX25519KeyPair", js.Any.fromFunction0(value))
      
      inline def setGenerateX25519KeyPairFromSeed(value: js.typedarray.Uint8Array => KeyPair): Self = StObject.set(x, "generateX25519KeyPairFromSeed", js.Any.fromFunction1(value))
      
      inline def setGenerateX25519SharedKey(value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array): Self = StObject.set(x, "generateX25519SharedKey", js.Any.fromFunction2(value))
      
      inline def setGetHKDF(value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => Hkdf): Self = StObject.set(x, "getHKDF", js.Any.fromFunction2(value))
      
      inline def setHashSHA256(value: js.typedarray.Uint8Array => js.typedarray.Uint8Array): Self = StObject.set(x, "hashSHA256", js.Any.fromFunction1(value))
    }
  }
}
