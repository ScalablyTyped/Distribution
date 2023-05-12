package typings.chainsafeLibp2pNoise

import typings.chainsafeLibp2pNoise.distSrcCryptoMod.ICryptoInterface
import typings.chainsafeLibp2pNoise.distSrcNoiseMod.NoiseInit
import typings.chainsafeLibp2pNoise.distSrcProtoPayloadMod.NoiseExtensions
import typings.libp2pInterfaceConnectionEncrypter.mod.ConnectionEncrypter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@chainsafe/libp2p-noise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def noise(): js.Function0[ConnectionEncrypter[NoiseExtensions]] = ^.asInstanceOf[js.Dynamic].applyDynamic("noise")().asInstanceOf[js.Function0[ConnectionEncrypter[NoiseExtensions]]]
  inline def noise(init: NoiseInit): js.Function0[ConnectionEncrypter[NoiseExtensions]] = ^.asInstanceOf[js.Dynamic].applyDynamic("noise")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function0[ConnectionEncrypter[NoiseExtensions]]]
  
  @JSImport("@chainsafe/libp2p-noise", "pureJsCrypto")
  @js.native
  val pureJsCrypto: ICryptoInterface = js.native
}
