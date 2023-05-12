package typings.chainsafeLibp2pNoise

import typings.chainsafeLibp2pNoise.distSrcCryptoMod.ICryptoInterface
import typings.chainsafeLibp2pNoise.distSrcHandshakeMod.CipherState
import typings.chainsafeLibp2pNoise.distSrcHandshakeMod.MessageBuffer
import typings.chainsafeLibp2pNoise.distSrcHandshakeMod.SymmetricState
import typings.chainsafeLibp2pNoise.distSrcNonceMod.Nonce
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHandshakesAbstractHandshakeMod {
  
  /* note: abstract class */ @JSImport("@chainsafe/libp2p-noise/dist/src/handshakes/abstract-handshake", "AbstractHandshake")
  @js.native
  open class AbstractHandshake protected () extends StObject {
    def this(crypto: ICryptoInterface) = this()
    
    /* protected */ def createEmptyKey(): js.typedarray.Uint8Array = js.native
    
    var crypto: ICryptoInterface = js.native
    
    /* protected */ def decrypt(
      k: js.typedarray.Uint8Array,
      n: Nonce,
      ad: js.typedarray.Uint8Array,
      ciphertext: js.typedarray.Uint8Array
    ): DecryptedResult = js.native
    /* protected */ def decrypt(
      k: js.typedarray.Uint8Array,
      n: Nonce,
      ad: js.typedarray.Uint8Array,
      ciphertext: js.typedarray.Uint8Array,
      dst: js.typedarray.Uint8Array
    ): DecryptedResult = js.native
    
    /* protected */ def decryptAndHash(ss: SymmetricState, ciphertext: js.typedarray.Uint8Array): DecryptedResult = js.native
    
    def decryptWithAd(cs: CipherState, ad: js.typedarray.Uint8Array, ciphertext: js.typedarray.Uint8Array): DecryptedResult = js.native
    def decryptWithAd(
      cs: CipherState,
      ad: js.typedarray.Uint8Array,
      ciphertext: js.typedarray.Uint8Array,
      dst: js.typedarray.Uint8Array
    ): DecryptedResult = js.native
    
    /* protected */ def dh(privateKey: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    /* protected */ def encrypt(
      k: js.typedarray.Uint8Array,
      n: Nonce,
      ad: js.typedarray.Uint8Array,
      plaintext: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    
    /* protected */ def encryptAndHash(ss: SymmetricState, plaintext: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def encryptWithAd(cs: CipherState, ad: js.typedarray.Uint8Array, plaintext: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    /* protected */ def getHash(a: js.typedarray.Uint8Array, b: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    /* protected */ def hasKey(cs: CipherState): Boolean = js.native
    
    /* protected */ def hashProtocolName(protocolName: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    /* protected */ def initializeKey(k: js.typedarray.Uint8Array): CipherState = js.native
    
    /* protected */ def initializeSymmetric(protocolName: String): SymmetricState = js.native
    
    /* protected */ def isEmptyKey(k: js.typedarray.Uint8Array): Boolean = js.native
    
    /* protected */ def mixHash(ss: SymmetricState, data: js.typedarray.Uint8Array): Unit = js.native
    
    /* protected */ def mixKey(ss: SymmetricState, ikm: js.typedarray.Uint8Array): Unit = js.native
    
    /* protected */ def readMessageRegular(cs: CipherState, message: MessageBuffer): DecryptedResult = js.native
    
    /* protected */ def split(ss: SymmetricState): SplitState = js.native
    
    /* protected */ def writeMessageRegular(cs: CipherState, payload: js.typedarray.Uint8Array): MessageBuffer = js.native
  }
  
  trait DecryptedResult extends StObject {
    
    var plaintext: js.typedarray.Uint8Array
    
    var valid: Boolean
  }
  object DecryptedResult {
    
    inline def apply(plaintext: js.typedarray.Uint8Array, valid: Boolean): DecryptedResult = {
      val __obj = js.Dynamic.literal(plaintext = plaintext.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecryptedResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecryptedResult] (val x: Self) extends AnyVal {
      
      inline def setPlaintext(value: js.typedarray.Uint8Array): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  trait SplitState extends StObject {
    
    var cs1: CipherState
    
    var cs2: CipherState
  }
  object SplitState {
    
    inline def apply(cs1: CipherState, cs2: CipherState): SplitState = {
      val __obj = js.Dynamic.literal(cs1 = cs1.asInstanceOf[js.Any], cs2 = cs2.asInstanceOf[js.Any])
      __obj.asInstanceOf[SplitState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SplitState] (val x: Self) extends AnyVal {
      
      inline def setCs1(value: CipherState): Self = StObject.set(x, "cs1", value.asInstanceOf[js.Any])
      
      inline def setCs2(value: CipherState): Self = StObject.set(x, "cs2", value.asInstanceOf[js.Any])
    }
  }
}
