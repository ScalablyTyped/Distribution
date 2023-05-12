package typings.chainsafeLibp2pNoise

import typings.chainsafeLibp2pNoise.distSrcCryptoMod.ICryptoInterface
import typings.chainsafeLibp2pNoise.distSrcHandshakeInterfaceMod.IHandshake
import typings.chainsafeLibp2pNoise.distSrcHandshakesXxMod.XX
import typings.chainsafeLibp2pNoise.distSrcLibp2pMod.KeyPair
import typings.chainsafeLibp2pNoise.distSrcProtoPayloadMod.NoiseExtensions
import typings.itPbStream.mod.ProtobufStream
import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHandshakeXxMod {
  
  @JSImport("@chainsafe/libp2p-noise/dist/src/handshake-xx", "XXHandshake")
  @js.native
  open class XXHandshake protected ()
    extends StObject
       with IHandshake {
    def this(
      isInitiator: Boolean,
      payload: js.typedarray.Uint8Array,
      prologue: js.typedarray.Uint8Array,
      crypto: ICryptoInterface,
      staticKeypair: KeyPair,
      connection: ProtobufStream[Any]
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: js.typedarray.Uint8Array,
      prologue: js.typedarray.Uint8Array,
      crypto: ICryptoInterface,
      staticKeypair: KeyPair,
      connection: ProtobufStream[Any],
      remotePeer: PeerId
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: js.typedarray.Uint8Array,
      prologue: js.typedarray.Uint8Array,
      crypto: ICryptoInterface,
      staticKeypair: KeyPair,
      connection: ProtobufStream[Any],
      remotePeer: Unit,
      handshake: XX
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: js.typedarray.Uint8Array,
      prologue: js.typedarray.Uint8Array,
      crypto: ICryptoInterface,
      staticKeypair: KeyPair,
      connection: ProtobufStream[Any],
      remotePeer: PeerId,
      handshake: XX
    ) = this()
    
    /* protected */ var connection: ProtobufStream[Any] = js.native
    
    def exchange(): js.Promise[Unit] = js.native
    
    def finish(): js.Promise[Unit] = js.native
    
    /* private */ var getCS: Any = js.native
    
    def getRemoteStaticKey(): js.typedarray.Uint8Array = js.native
    
    var isInitiator: Boolean = js.native
    
    /* protected */ var payload: js.typedarray.Uint8Array = js.native
    
    /* private */ val prologue: Any = js.native
    
    def propose(): js.Promise[Unit] = js.native
    
    /* protected */ def setRemoteNoiseExtension(): Unit = js.native
    /* protected */ def setRemoteNoiseExtension(e: NoiseExtensions): Unit = js.native
    
    /* protected */ var staticKeypair: KeyPair = js.native
    
    /* protected */ var xx: XX = js.native
  }
}
