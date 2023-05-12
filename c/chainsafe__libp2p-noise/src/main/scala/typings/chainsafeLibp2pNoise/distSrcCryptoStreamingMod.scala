package typings.chainsafeLibp2pNoise

import typings.chainsafeLibp2pNoise.distSrcHandshakeInterfaceMod.IHandshake
import typings.chainsafeLibp2pNoise.distSrcMetricsMod.MetricsRegistry
import typings.itStreamTypes.mod.Transform
import typings.std.AsyncIterable
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCryptoStreamingMod {
  
  @JSImport("@chainsafe/libp2p-noise/dist/src/crypto/streaming", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decryptStream(handshake: IHandshake): Transform[AsyncIterable[Uint8ArrayList], AsyncIterable[js.typedarray.Uint8Array]] = ^.asInstanceOf[js.Dynamic].applyDynamic("decryptStream")(handshake.asInstanceOf[js.Any]).asInstanceOf[Transform[AsyncIterable[Uint8ArrayList], AsyncIterable[js.typedarray.Uint8Array]]]
  inline def decryptStream(handshake: IHandshake, metrics: MetricsRegistry): Transform[AsyncIterable[Uint8ArrayList], AsyncIterable[js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptStream")(handshake.asInstanceOf[js.Any], metrics.asInstanceOf[js.Any])).asInstanceOf[Transform[AsyncIterable[Uint8ArrayList], AsyncIterable[js.typedarray.Uint8Array]]]
  
  inline def encryptStream(handshake: IHandshake): Transform[AsyncIterable[js.typedarray.Uint8Array], AsyncIterable[js.typedarray.Uint8Array]] = ^.asInstanceOf[js.Dynamic].applyDynamic("encryptStream")(handshake.asInstanceOf[js.Any]).asInstanceOf[Transform[AsyncIterable[js.typedarray.Uint8Array], AsyncIterable[js.typedarray.Uint8Array]]]
  inline def encryptStream(handshake: IHandshake, metrics: MetricsRegistry): Transform[AsyncIterable[js.typedarray.Uint8Array], AsyncIterable[js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptStream")(handshake.asInstanceOf[js.Any], metrics.asInstanceOf[js.Any])).asInstanceOf[Transform[AsyncIterable[js.typedarray.Uint8Array], AsyncIterable[js.typedarray.Uint8Array]]]
}
