package typings.chainsafeLibp2pNoise

import typings.chainsafeLibp2pNoise.distSrcProtoPayloadMod.NoiseExtensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@chainsafe/libp2p-noise.@chainsafe/libp2p-noise/dist/src/proto/payload.NoiseExtensions> */
  trait PartialNoiseExtensions extends StObject {
    
    var webtransportCerthashes: js.UndefOr[js.Array[js.typedarray.Uint8Array]] = js.undefined
  }
  object PartialNoiseExtensions {
    
    inline def apply(): PartialNoiseExtensions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialNoiseExtensions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialNoiseExtensions] (val x: Self) extends AnyVal {
      
      inline def setWebtransportCerthashes(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "webtransportCerthashes", value.asInstanceOf[js.Any])
      
      inline def setWebtransportCerthashesUndefined: Self = StObject.set(x, "webtransportCerthashes", js.undefined)
      
      inline def setWebtransportCerthashesVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "webtransportCerthashes", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<@chainsafe/libp2p-noise.@chainsafe/libp2p-noise/dist/src/proto/payload.NoiseHandshakePayload> */
  trait PartialNoiseHandshakePayl extends StObject {
    
    var extensions: js.UndefOr[NoiseExtensions] = js.undefined
    
    var identityKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var identitySig: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object PartialNoiseHandshakePayl {
    
    inline def apply(): PartialNoiseHandshakePayl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialNoiseHandshakePayl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialNoiseHandshakePayl] (val x: Self) extends AnyVal {
      
      inline def setExtensions(value: NoiseExtensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setIdentityKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "identityKey", value.asInstanceOf[js.Any])
      
      inline def setIdentityKeyUndefined: Self = StObject.set(x, "identityKey", js.undefined)
      
      inline def setIdentitySig(value: js.typedarray.Uint8Array): Self = StObject.set(x, "identitySig", value.asInstanceOf[js.Any])
      
      inline def setIdentitySigUndefined: Self = StObject.set(x, "identitySig", js.undefined)
    }
  }
  
  trait Plaintext extends StObject {
    
    var plaintext: js.typedarray.Uint8Array
    
    var valid: Boolean
  }
  object Plaintext {
    
    inline def apply(plaintext: js.typedarray.Uint8Array, valid: Boolean): Plaintext = {
      val __obj = js.Dynamic.literal(plaintext = plaintext.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plaintext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Plaintext] (val x: Self) extends AnyVal {
      
      inline def setPlaintext(value: js.typedarray.Uint8Array): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
}
