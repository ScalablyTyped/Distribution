package typings.chainsafeLibp2pNoise

import typings.protonsRuntime.distSrcCodecMod.Codec
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcProtoPayloadMod {
  
  trait NoiseExtensions extends StObject {
    
    var webtransportCerthashes: js.Array[js.typedarray.Uint8Array]
  }
  object NoiseExtensions {
    
    inline def apply(webtransportCerthashes: js.Array[js.typedarray.Uint8Array]): NoiseExtensions = {
      val __obj = js.Dynamic.literal(webtransportCerthashes = webtransportCerthashes.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoiseExtensions]
    }
    
    @JSImport("@chainsafe/libp2p-noise/dist/src/proto/payload", "NoiseExtensions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[NoiseExtensions] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[NoiseExtensions]]
    
    inline def decode(buf: js.typedarray.Uint8Array): NoiseExtensions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[NoiseExtensions]
    inline def decode(buf: Uint8ArrayList): NoiseExtensions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[NoiseExtensions]
    
    inline def encode(obj: NoiseExtensions): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NoiseExtensions] (val x: Self) extends AnyVal {
      
      inline def setWebtransportCerthashes(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "webtransportCerthashes", value.asInstanceOf[js.Any])
      
      inline def setWebtransportCerthashesVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "webtransportCerthashes", js.Array(value*))
    }
  }
  
  trait NoiseHandshakePayload extends StObject {
    
    var extensions: js.UndefOr[NoiseExtensions] = js.undefined
    
    var identityKey: js.typedarray.Uint8Array
    
    var identitySig: js.typedarray.Uint8Array
  }
  object NoiseHandshakePayload {
    
    inline def apply(identityKey: js.typedarray.Uint8Array, identitySig: js.typedarray.Uint8Array): NoiseHandshakePayload = {
      val __obj = js.Dynamic.literal(identityKey = identityKey.asInstanceOf[js.Any], identitySig = identitySig.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoiseHandshakePayload]
    }
    
    @JSImport("@chainsafe/libp2p-noise/dist/src/proto/payload", "NoiseHandshakePayload")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[NoiseHandshakePayload] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[NoiseHandshakePayload]]
    
    inline def decode(buf: js.typedarray.Uint8Array): NoiseHandshakePayload = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[NoiseHandshakePayload]
    inline def decode(buf: Uint8ArrayList): NoiseHandshakePayload = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[NoiseHandshakePayload]
    
    inline def encode(obj: NoiseHandshakePayload): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NoiseHandshakePayload] (val x: Self) extends AnyVal {
      
      inline def setExtensions(value: NoiseExtensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setIdentityKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "identityKey", value.asInstanceOf[js.Any])
      
      inline def setIdentitySig(value: js.typedarray.Uint8Array): Self = StObject.set(x, "identitySig", value.asInstanceOf[js.Any])
    }
  }
}
