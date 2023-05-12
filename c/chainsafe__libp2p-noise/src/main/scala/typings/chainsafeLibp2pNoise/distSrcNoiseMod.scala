package typings.chainsafeLibp2pNoise

import typings.chainsafeLibp2pNoise.distSrcCryptoMod.ICryptoInterface
import typings.chainsafeLibp2pNoise.distSrcProtoPayloadMod.NoiseExtensions
import typings.libp2pInterfaceConnectionEncrypter.mod.ConnectionEncrypter
import typings.libp2pInterfaceMetrics.mod.Metrics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNoiseMod {
  
  @JSImport("@chainsafe/libp2p-noise/dist/src/noise", "Noise")
  @js.native
  open class Noise ()
    extends StObject
       with ConnectionEncrypter[NoiseExtensions] {
    def this(init: NoiseInit) = this()
    
    /* private */ var createSecureConnection: Any = js.native
    
    var crypto: ICryptoInterface = js.native
    
    /* private */ val extensions: Any = js.native
    
    /* private */ val metrics: Any = js.native
    
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
  
  trait NoiseInit extends StObject {
    
    var crypto: js.UndefOr[ICryptoInterface] = js.undefined
    
    var extensions: js.UndefOr[NoiseExtensions] = js.undefined
    
    var metrics: js.UndefOr[Metrics] = js.undefined
    
    var prologueBytes: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    /**
      * x25519 private key, reuse for faster handshakes
      */
    var staticNoiseKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object NoiseInit {
    
    inline def apply(): NoiseInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoiseInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NoiseInit] (val x: Self) extends AnyVal {
      
      inline def setCrypto(value: ICryptoInterface): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
      
      inline def setCryptoUndefined: Self = StObject.set(x, "crypto", js.undefined)
      
      inline def setExtensions(value: NoiseExtensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setMetrics(value: Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setPrologueBytes(value: js.typedarray.Uint8Array): Self = StObject.set(x, "prologueBytes", value.asInstanceOf[js.Any])
      
      inline def setPrologueBytesUndefined: Self = StObject.set(x, "prologueBytes", js.undefined)
      
      inline def setStaticNoiseKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "staticNoiseKey", value.asInstanceOf[js.Any])
      
      inline def setStaticNoiseKeyUndefined: Self = StObject.set(x, "staticNoiseKey", js.undefined)
    }
  }
}
