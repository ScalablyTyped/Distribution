package typings.chainsafeLibp2pNoise

import typings.chainsafeLibp2pNoise.handshakeMod.NoiseSession
import typings.chainsafeLibp2pNoise.libp2pMod.KeyPair
import typings.libp2pLogger.mod.Logger_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("@chainsafe/libp2p-noise/dist/src/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def logCipherState(session: NoiseSession): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logCipherState")(session.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logLocalEphemeralKeys(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logLocalEphemeralKeys")().asInstanceOf[Unit]
  inline def logLocalEphemeralKeys(e: KeyPair): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logLocalEphemeralKeys")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logLocalStaticKeys(s: KeyPair): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logLocalStaticKeys")(s.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logRemoteEphemeralKey(re: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logRemoteEphemeralKey")(re.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logRemoteStaticKey(rs: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logRemoteStaticKey")(rs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@chainsafe/libp2p-noise/dist/src/logger", "logger")
  @js.native
  val logger: Logger_ = js.native
}
