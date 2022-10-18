package typings.chainsafeLibp2pNoise

import typings.chainsafeLibp2pNoise.distSrcCryptoMod.ICryptoInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@chainsafe/libp2p-noise", "Noise")
  @js.native
  /**
    * @param {bytes} staticNoiseKey - x25519 private key, reuse for faster handshakes
    * @param {bytes} earlyData
    */
  open class Noise ()
    extends typings.chainsafeLibp2pNoise.distSrcNoiseMod.Noise {
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
  }
  
  @JSImport("@chainsafe/libp2p-noise", "stablelib")
  @js.native
  val stablelib: ICryptoInterface = js.native
}
