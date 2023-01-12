package typings.coseJs

import typings.coseJs.coseJsStrings.empty
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object encrypt {
    
    @JSImport("cose-js", "encrypt")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(headers: Headers, payload: String, recipient: js.Array[Signer]): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(headers.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], recipient.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def create(headers: Headers, payload: String, recipient: js.Array[Signer], options: CreateOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(headers.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], recipient.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def create(headers: Headers, payload: String, recipient: Signer): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(headers.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], recipient.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def create(headers: Headers, payload: String, recipient: Signer, options: CreateOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(headers.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], recipient.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    
    inline def read(COSEMessage: Buffer, key: Buffer): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(COSEMessage.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    
    trait CreateOptions extends StObject {
      
      var contextIv: js.UndefOr[Buffer] = js.undefined
      
      var encodep: js.UndefOr[empty] = js.undefined
      
      var excludetag: js.UndefOr[Boolean] = js.undefined
      
      var externalAAD: js.UndefOr[Buffer] = js.undefined
      
      var randomSource: js.UndefOr[js.Function1[/* bytes */ Double, Buffer]] = js.undefined
    }
    object CreateOptions {
      
      inline def apply(): CreateOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: CreateOptions] (val x: Self) extends AnyVal {
        
        inline def setContextIv(value: Buffer): Self = StObject.set(x, "contextIv", value.asInstanceOf[js.Any])
        
        inline def setContextIvUndefined: Self = StObject.set(x, "contextIv", js.undefined)
        
        inline def setEncodep(value: empty): Self = StObject.set(x, "encodep", value.asInstanceOf[js.Any])
        
        inline def setEncodepUndefined: Self = StObject.set(x, "encodep", js.undefined)
        
        inline def setExcludetag(value: Boolean): Self = StObject.set(x, "excludetag", value.asInstanceOf[js.Any])
        
        inline def setExcludetagUndefined: Self = StObject.set(x, "excludetag", js.undefined)
        
        inline def setExternalAAD(value: Buffer): Self = StObject.set(x, "externalAAD", value.asInstanceOf[js.Any])
        
        inline def setExternalAADUndefined: Self = StObject.set(x, "externalAAD", js.undefined)
        
        inline def setRandomSource(value: /* bytes */ Double => Buffer): Self = StObject.set(x, "randomSource", js.Any.fromFunction1(value))
        
        inline def setRandomSourceUndefined: Self = StObject.set(x, "randomSource", js.undefined)
      }
    }
    
    trait Signer extends StObject {
      
      var key: Buffer
    }
    object Signer {
      
      inline def apply(key: Buffer): Signer = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
        __obj.asInstanceOf[Signer]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Signer] (val x: Self) extends AnyVal {
        
        inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object mac {
    
    @JSImport("cose-js", "mac")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(headers: Headers, plaintext: String, signer: Signer): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(headers.asInstanceOf[js.Any], plaintext.asInstanceOf[js.Any], signer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    
    inline def read(COSEMessage: Buffer, key: Buffer): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(COSEMessage.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    
    trait Signer extends StObject {
      
      var key: Buffer
    }
    object Signer {
      
      inline def apply(key: Buffer): Signer = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
        __obj.asInstanceOf[Signer]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Signer] (val x: Self) extends AnyVal {
        
        inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object sign {
    
    @JSImport("cose-js", "sign")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(headers: Headers, payload: BufferLike, signers: js.Array[Signer]): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(headers.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], signers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def create(headers: Headers, payload: BufferLike, signers: js.Array[Signer], options: CreateOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(headers.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], signers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def create(headers: Headers, payload: BufferLike, signers: Signer): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(headers.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], signers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def create(headers: Headers, payload: BufferLike, signers: Signer, options: CreateOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(headers.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], signers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    
    /** throws an error if verification fails */
    inline def verify(payload: BufferLike, verifier: Signer): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(payload.asInstanceOf[js.Any], verifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def verify(payload: BufferLike, verifier: Signer, options: VerifyOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(payload.asInstanceOf[js.Any], verifier.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    
    /** throws an error if verification fails */
    inline def verifySync(payload: BufferLike, verifier: Signer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySync")(payload.asInstanceOf[js.Any], verifier.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def verifySync(payload: BufferLike, verifier: Signer, options: VerifyOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySync")(payload.asInstanceOf[js.Any], verifier.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    trait CreateOptions extends StObject {
      
      var encodep: js.UndefOr[empty] = js.undefined
      
      var excludetag: js.UndefOr[Boolean] = js.undefined
    }
    object CreateOptions {
      
      inline def apply(): CreateOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: CreateOptions] (val x: Self) extends AnyVal {
        
        inline def setEncodep(value: empty): Self = StObject.set(x, "encodep", value.asInstanceOf[js.Any])
        
        inline def setEncodepUndefined: Self = StObject.set(x, "encodep", js.undefined)
        
        inline def setExcludetag(value: Boolean): Self = StObject.set(x, "excludetag", value.asInstanceOf[js.Any])
        
        inline def setExcludetagUndefined: Self = StObject.set(x, "excludetag", js.undefined)
      }
    }
    
    trait Signer extends StObject {
      
      var externalAAD: js.UndefOr[Buffer] = js.undefined
      
      var key: Key
    }
    object Signer {
      
      inline def apply(key: Key): Signer = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
        __obj.asInstanceOf[Signer]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Signer] (val x: Self) extends AnyVal {
        
        inline def setExternalAAD(value: Buffer): Self = StObject.set(x, "externalAAD", value.asInstanceOf[js.Any])
        
        inline def setExternalAADUndefined: Self = StObject.set(x, "externalAAD", js.undefined)
        
        inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      }
    }
    
    trait VerifyOptions extends StObject {
      
      var defaultType: js.UndefOr[Double] = js.undefined
    }
    object VerifyOptions {
      
      inline def apply(): VerifyOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VerifyOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: VerifyOptions] (val x: Self) extends AnyVal {
        
        inline def setDefaultType(value: Double): Self = StObject.set(x, "defaultType", value.asInstanceOf[js.Any])
        
        inline def setDefaultTypeUndefined: Self = StObject.set(x, "defaultType", js.undefined)
      }
    }
  }
  
  type BufferLike = String | Buffer | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.DataView | Readable
  
  trait HeaderParameters extends StObject {
    
    var IV: js.UndefOr[BufferLike] = js.undefined
    
    var Partial_IV: js.UndefOr[BufferLike] = js.undefined
    
    var alg: js.UndefOr[BufferLike] = js.undefined
    
    var content_type: js.UndefOr[BufferLike] = js.undefined
    
    var counter_signature: js.UndefOr[BufferLike] = js.undefined
    
    var crit: js.UndefOr[BufferLike] = js.undefined
    
    var ctyp: js.UndefOr[BufferLike] = js.undefined
    
    var ephemeral_key: js.UndefOr[BufferLike] = js.undefined
    
    var kid: js.UndefOr[BufferLike] = js.undefined
    
    var partyUNonce: js.UndefOr[BufferLike] = js.undefined
    
    var static_key: js.UndefOr[BufferLike] = js.undefined
    
    var static_key_id: js.UndefOr[BufferLike] = js.undefined
  }
  object HeaderParameters {
    
    inline def apply(): HeaderParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeaderParameters] (val x: Self) extends AnyVal {
      
      inline def setAlg(value: BufferLike): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
      
      inline def setContent_type(value: BufferLike): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
      
      inline def setCounter_signature(value: BufferLike): Self = StObject.set(x, "counter_signature", value.asInstanceOf[js.Any])
      
      inline def setCounter_signatureUndefined: Self = StObject.set(x, "counter_signature", js.undefined)
      
      inline def setCrit(value: BufferLike): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      inline def setCritUndefined: Self = StObject.set(x, "crit", js.undefined)
      
      inline def setCtyp(value: BufferLike): Self = StObject.set(x, "ctyp", value.asInstanceOf[js.Any])
      
      inline def setCtypUndefined: Self = StObject.set(x, "ctyp", js.undefined)
      
      inline def setEphemeral_key(value: BufferLike): Self = StObject.set(x, "ephemeral_key", value.asInstanceOf[js.Any])
      
      inline def setEphemeral_keyUndefined: Self = StObject.set(x, "ephemeral_key", js.undefined)
      
      inline def setIV(value: BufferLike): Self = StObject.set(x, "IV", value.asInstanceOf[js.Any])
      
      inline def setIVUndefined: Self = StObject.set(x, "IV", js.undefined)
      
      inline def setKid(value: BufferLike): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
      
      inline def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
      
      inline def setPartial_IV(value: BufferLike): Self = StObject.set(x, "Partial_IV", value.asInstanceOf[js.Any])
      
      inline def setPartial_IVUndefined: Self = StObject.set(x, "Partial_IV", js.undefined)
      
      inline def setPartyUNonce(value: BufferLike): Self = StObject.set(x, "partyUNonce", value.asInstanceOf[js.Any])
      
      inline def setPartyUNonceUndefined: Self = StObject.set(x, "partyUNonce", js.undefined)
      
      inline def setStatic_key(value: BufferLike): Self = StObject.set(x, "static_key", value.asInstanceOf[js.Any])
      
      inline def setStatic_keyUndefined: Self = StObject.set(x, "static_key", js.undefined)
      
      inline def setStatic_key_id(value: BufferLike): Self = StObject.set(x, "static_key_id", value.asInstanceOf[js.Any])
      
      inline def setStatic_key_idUndefined: Self = StObject.set(x, "static_key_id", js.undefined)
    }
  }
  
  trait Headers extends StObject {
    
    var p: js.UndefOr[HeaderParameters] = js.undefined
    
    var u: js.UndefOr[HeaderParameters] = js.undefined
  }
  object Headers {
    
    inline def apply(): Headers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      inline def setP(value: HeaderParameters): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setU(value: HeaderParameters): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
      
      inline def setUUndefined: Self = StObject.set(x, "u", js.undefined)
    }
  }
  
  trait Key extends StObject {
    
    var crv: js.UndefOr[String] = js.undefined
    
    var d: js.UndefOr[BufferLike] = js.undefined
    
    var k: js.UndefOr[String] = js.undefined
    
    var kty: js.UndefOr[String] = js.undefined
    
    var x: js.UndefOr[BufferLike] = js.undefined
    
    var y: js.UndefOr[BufferLike] = js.undefined
  }
  object Key {
    
    inline def apply(): Key = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setCrv(value: String): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
      
      inline def setCrvUndefined: Self = StObject.set(x, "crv", js.undefined)
      
      inline def setD(value: BufferLike): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setK(value: String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setKUndefined: Self = StObject.set(x, "k", js.undefined)
      
      inline def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      inline def setKtyUndefined: Self = StObject.set(x, "kty", js.undefined)
      
      inline def setX(value: BufferLike): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: BufferLike): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
