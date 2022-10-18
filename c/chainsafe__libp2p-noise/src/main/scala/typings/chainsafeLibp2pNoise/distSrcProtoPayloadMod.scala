package typings.chainsafeLibp2pNoise

import typings.protonsRuntime.distSrcCodecMod.Codec
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcProtoPayloadMod {
  
  object pb {
    
    trait NoiseHandshakePayload extends StObject {
      
      var data: js.typedarray.Uint8Array
      
      var identityKey: js.typedarray.Uint8Array
      
      var identitySig: js.typedarray.Uint8Array
    }
    object NoiseHandshakePayload {
      
      inline def apply(
        data: js.typedarray.Uint8Array,
        identityKey: js.typedarray.Uint8Array,
        identitySig: js.typedarray.Uint8Array
      ): NoiseHandshakePayload = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], identityKey = identityKey.asInstanceOf[js.Any], identitySig = identitySig.asInstanceOf[js.Any])
        __obj.asInstanceOf[NoiseHandshakePayload]
      }
      
      @JSImport("@chainsafe/libp2p-noise/dist/src/proto/payload", "pb.NoiseHandshakePayload")
      @js.native
      val ^ : js.Any = js.native
      
      inline def codec(): Codec[NoiseHandshakePayload] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[NoiseHandshakePayload]]
      
      inline def decode(buf: js.typedarray.Uint8Array): NoiseHandshakePayload = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[NoiseHandshakePayload]
      inline def decode(buf: Uint8ArrayList): NoiseHandshakePayload = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[NoiseHandshakePayload]
      
      inline def encode(obj: NoiseHandshakePayload): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
      
      extension [Self <: NoiseHandshakePayload](x: Self) {
        
        inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setIdentityKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "identityKey", value.asInstanceOf[js.Any])
        
        inline def setIdentitySig(value: js.typedarray.Uint8Array): Self = StObject.set(x, "identitySig", value.asInstanceOf[js.Any])
      }
    }
  }
}
