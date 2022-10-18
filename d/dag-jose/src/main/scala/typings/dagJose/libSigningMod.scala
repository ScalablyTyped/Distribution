package typings.dagJose

import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSigningMod {
  
  @JSImport("dag-jose/lib/signing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(encoded: EncodedJWS): DagJWS = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(encoded.asInstanceOf[js.Any]).asInstanceOf[DagJWS]
  
  inline def encode(jws: DagJWS): EncodedJWS = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(jws.asInstanceOf[js.Any]).asInstanceOf[EncodedJWS]
  
  inline def fromSplit(split: js.Array[String]): DagJWS = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSplit")(split.asInstanceOf[js.Any]).asInstanceOf[DagJWS]
  
  trait DagJWS extends StObject {
    
    var link: js.UndefOr[CID[Any, Double, Double, Version]] = js.undefined
    
    var payload: String
    
    var signatures: js.Array[JWSSignature]
  }
  object DagJWS {
    
    inline def apply(payload: String, signatures: js.Array[JWSSignature]): DagJWS = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
      __obj.asInstanceOf[DagJWS]
    }
    
    extension [Self <: DagJWS](x: Self) {
      
      inline def setLink(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setSignatures(value: js.Array[JWSSignature]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
      
      inline def setSignaturesVarargs(value: JWSSignature*): Self = StObject.set(x, "signatures", js.Array(value*))
    }
  }
  
  trait EncodedJWS extends StObject {
    
    var payload: js.typedarray.Uint8Array
    
    var signatures: js.Array[EncodedSignature]
  }
  object EncodedJWS {
    
    inline def apply(payload: js.typedarray.Uint8Array, signatures: js.Array[EncodedSignature]): EncodedJWS = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodedJWS]
    }
    
    extension [Self <: EncodedJWS](x: Self) {
      
      inline def setPayload(value: js.typedarray.Uint8Array): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setSignatures(value: js.Array[EncodedSignature]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
      
      inline def setSignaturesVarargs(value: EncodedSignature*): Self = StObject.set(x, "signatures", js.Array(value*))
    }
  }
  
  trait EncodedSignature extends StObject {
    
    var header: js.UndefOr[Record[String, Any]] = js.undefined
    
    var `protected`: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var signature: js.typedarray.Uint8Array
  }
  object EncodedSignature {
    
    inline def apply(signature: js.typedarray.Uint8Array): EncodedSignature = {
      val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodedSignature]
    }
    
    extension [Self <: EncodedSignature](x: Self) {
      
      inline def setHeader(value: Record[String, Any]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setProtected(value: js.typedarray.Uint8Array): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
      
      inline def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
      
      inline def setSignature(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  trait JWSSignature extends StObject {
    
    var header: js.UndefOr[Record[String, Any]] = js.undefined
    
    var `protected`: js.UndefOr[String] = js.undefined
    
    var signature: String
  }
  object JWSSignature {
    
    inline def apply(signature: String): JWSSignature = {
      val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWSSignature]
    }
    
    extension [Self <: JWSSignature](x: Self) {
      
      inline def setHeader(value: Record[String, Any]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setProtected(value: String): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
      
      inline def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  trait PublicKey extends StObject {
    
    var controller: String
    
    var id: String
    
    var publicKeyBase64: js.UndefOr[String] = js.undefined
    
    var publicKeyHex: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object PublicKey {
    
    inline def apply(controller: String, id: String, `type`: String): PublicKey = {
      val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublicKey]
    }
    
    extension [Self <: PublicKey](x: Self) {
      
      inline def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyBase64(value: String): Self = StObject.set(x, "publicKeyBase64", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyBase64Undefined: Self = StObject.set(x, "publicKeyBase64", js.undefined)
      
      inline def setPublicKeyHex(value: String): Self = StObject.set(x, "publicKeyHex", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyHexUndefined: Self = StObject.set(x, "publicKeyHex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
