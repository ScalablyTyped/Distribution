package typings.chainsafeLibp2pNoise

import typings.chainsafeLibp2pNoise.distSrcCryptoMod.ICryptoInterface
import typings.chainsafeLibp2pNoise.distSrcHandshakeMod.MessageBuffer
import typings.chainsafeLibp2pNoise.distSrcHandshakeMod.NoiseSession
import typings.chainsafeLibp2pNoise.distSrcHandshakesAbstractHandshakeMod.AbstractHandshake
import typings.chainsafeLibp2pNoise.distSrcHandshakesAbstractHandshakeMod.DecryptedResult
import typings.chainsafeLibp2pNoise.distSrcLibp2pMod.KeyPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHandshakesXxMod {
  
  @JSImport("@chainsafe/libp2p-noise/dist/src/handshakes/xx", "XX")
  @js.native
  open class XX protected () extends AbstractHandshake {
    def this(crypto: ICryptoInterface) = this()
    
    def initSession(initiator: Boolean, prologue: js.typedarray.Uint8Array, s: KeyPair): NoiseSession = js.native
    
    /* private */ var initializeInitiator: Any = js.native
    
    /* private */ var initializeResponder: Any = js.native
    
    /* private */ var readMessageA: Any = js.native
    
    /* private */ var readMessageB: Any = js.native
    
    /* private */ var readMessageC: Any = js.native
    
    def recvMessage(session: NoiseSession, message: MessageBuffer): DecryptedResult = js.native
    
    def sendMessage(session: NoiseSession, message: js.typedarray.Uint8Array): MessageBuffer = js.native
    def sendMessage(session: NoiseSession, message: js.typedarray.Uint8Array, ephemeral: KeyPair): MessageBuffer = js.native
    
    /* private */ var writeMessageA: Any = js.native
    
    /* private */ var writeMessageB: Any = js.native
    
    /* private */ var writeMessageC: Any = js.native
  }
}
