package typings.chainsafeLibp2pNoise

import typings.chainsafeLibp2pNoise.distSrcHandshakeMod.Hkdf
import typings.chainsafeLibp2pNoise.distSrcLibp2pMod.KeyPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCryptoMod {
  
  @js.native
  trait ICryptoInterface extends StObject {
    
    def chaCha20Poly1305Decrypt(
      ciphertext: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      ad: js.typedarray.Uint8Array,
      k: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array | Null = js.native
    def chaCha20Poly1305Decrypt(
      ciphertext: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      ad: js.typedarray.Uint8Array,
      k: js.typedarray.Uint8Array,
      dst: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array | Null = js.native
    
    def chaCha20Poly1305Encrypt(
      plaintext: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      ad: js.typedarray.Uint8Array,
      k: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    
    def generateX25519KeyPair(): KeyPair = js.native
    
    def generateX25519KeyPairFromSeed(seed: js.typedarray.Uint8Array): KeyPair = js.native
    
    def generateX25519SharedKey(privateKey: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def getHKDF(ck: js.typedarray.Uint8Array, ikm: js.typedarray.Uint8Array): Hkdf = js.native
    
    def hashSHA256(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  }
}
