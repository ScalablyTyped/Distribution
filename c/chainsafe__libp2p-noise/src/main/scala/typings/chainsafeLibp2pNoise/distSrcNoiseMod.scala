package typings.chainsafeLibp2pNoise

import typings.chainsafeLibp2pNoise.distSrcCryptoMod.ICryptoInterface
import typings.chainsafeLibp2pNoise.distSrcLibp2pMod.INoiseConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNoiseMod {
  
  @JSImport("@chainsafe/libp2p-noise/dist/src/noise", "Noise")
  @js.native
  /**
    * @param {bytes} staticNoiseKey - x25519 private key, reuse for faster handshakes
    * @param {bytes} earlyData
    */
  open class Noise ()
    extends StObject
       with INoiseConnection {
    def this(staticNoiseKey: js.typedarray.Uint8Array) = this()
    def this(staticNoiseKey: js.typedarray.Uint8Array, earlyData: js.typedarray.Uint8Array) = this()
    def this(staticNoiseKey: Unit, earlyData: js.typedarray.Uint8Array) = this()
    def this(
      staticNoiseKey: js.typedarray.Uint8Array,
      earlyData: js.typedarray.Uint8Array,
      crypto: ICryptoInterface
    ) = this()
    def this(staticNoiseKey: js.typedarray.Uint8Array, earlyData: Unit, crypto: ICryptoInterface) = this()
    def this(staticNoiseKey: Unit, earlyData: js.typedarray.Uint8Array, crypto: ICryptoInterface) = this()
    def this(staticNoiseKey: Unit, earlyData: Unit, crypto: ICryptoInterface) = this()
    def this(
      staticNoiseKey: js.typedarray.Uint8Array,
      earlyData: js.typedarray.Uint8Array,
      crypto: Unit,
      prologueBytes: js.typedarray.Uint8Array
    ) = this()
    def this(
      staticNoiseKey: js.typedarray.Uint8Array,
      earlyData: js.typedarray.Uint8Array,
      crypto: ICryptoInterface,
      prologueBytes: js.typedarray.Uint8Array
    ) = this()
    def this(
      staticNoiseKey: js.typedarray.Uint8Array,
      earlyData: Unit,
      crypto: Unit,
      prologueBytes: js.typedarray.Uint8Array
    ) = this()
    def this(
      staticNoiseKey: js.typedarray.Uint8Array,
      earlyData: Unit,
      crypto: ICryptoInterface,
      prologueBytes: js.typedarray.Uint8Array
    ) = this()
    def this(
      staticNoiseKey: Unit,
      earlyData: js.typedarray.Uint8Array,
      crypto: Unit,
      prologueBytes: js.typedarray.Uint8Array
    ) = this()
    def this(
      staticNoiseKey: Unit,
      earlyData: js.typedarray.Uint8Array,
      crypto: ICryptoInterface,
      prologueBytes: js.typedarray.Uint8Array
    ) = this()
    def this(staticNoiseKey: Unit, earlyData: Unit, crypto: Unit, prologueBytes: js.typedarray.Uint8Array) = this()
    def this(
      staticNoiseKey: Unit,
      earlyData: Unit,
      crypto: ICryptoInterface,
      prologueBytes: js.typedarray.Uint8Array
    ) = this()
    
    /* private */ var createSecureConnection: Any = js.native
    
    var crypto: ICryptoInterface = js.native
    
    /* private */ val earlyData: Any = js.native
    
    /**
      * If Noise pipes supported, tries IK handshake first with XX as fallback if it fails.
      * If noise pipes disabled or remote peer static key is unknown, use XX.
      *
      * @param {HandshakeParams} params
      */
    /* private */ var performHandshake: Any = js.native
    
    /* private */ var performXXHandshake: Any = js.native
    
    /* private */ val prologue: Any = js.native
    
    /* private */ val staticKeys: Any = js.native
  }
}
