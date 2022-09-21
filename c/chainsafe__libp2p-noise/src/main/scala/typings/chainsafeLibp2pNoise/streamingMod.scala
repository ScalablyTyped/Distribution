package typings.chainsafeLibp2pNoise

import typings.chainsafeLibp2pNoise.handshakeInterfaceMod.IHandshake
import typings.itStreamTypes.mod.Transform
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamingMod {
  
  @JSImport("@chainsafe/libp2p-noise/dist/src/crypto/streaming", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decryptStream(handshake: IHandshake): Transform[Uint8ArrayList, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("decryptStream")(handshake.asInstanceOf[js.Any]).asInstanceOf[Transform[Uint8ArrayList, js.typedarray.Uint8Array]]
  
  inline def encryptStream(handshake: IHandshake): Transform[js.typedarray.Uint8Array, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("encryptStream")(handshake.asInstanceOf[js.Any]).asInstanceOf[Transform[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
}
