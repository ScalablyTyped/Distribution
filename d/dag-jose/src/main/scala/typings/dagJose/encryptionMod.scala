package typings.dagJose

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encryptionMod {
  
  @JSImport("dag-jose/lib/encryption", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(encoded: EncodedJWE): DagJWE = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(encoded.asInstanceOf[js.Any]).asInstanceOf[DagJWE]
  
  inline def encode(jwe: DagJWE): EncodedJWE = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(jwe.asInstanceOf[js.Any]).asInstanceOf[EncodedJWE]
  
  inline def fromSplit(split: js.Array[String]): DagJWE = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSplit")(split.asInstanceOf[js.Any]).asInstanceOf[DagJWE]
  
  trait DagJWE extends StObject {
    
    var aad: js.UndefOr[String] = js.undefined
    
    var ciphertext: String
    
    var iv: String
    
    var `protected`: String
    
    var recipients: js.UndefOr[js.Array[JWERecipient]] = js.undefined
    
    var tag: String
    
    var unprotected: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object DagJWE {
    
    inline def apply(ciphertext: String, iv: String, `protected`: String, tag: String): DagJWE = {
      val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DagJWE]
    }
    
    extension [Self <: DagJWE](x: Self) {
      
      inline def setAad(value: String): Self = StObject.set(x, "aad", value.asInstanceOf[js.Any])
      
      inline def setAadUndefined: Self = StObject.set(x, "aad", js.undefined)
      
      inline def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setProtected(value: String): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
      
      inline def setRecipients(value: js.Array[JWERecipient]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
      
      inline def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
      
      inline def setRecipientsVarargs(value: JWERecipient*): Self = StObject.set(x, "recipients", js.Array(value*))
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setUnprotected(value: Record[String, Any]): Self = StObject.set(x, "unprotected", value.asInstanceOf[js.Any])
      
      inline def setUnprotectedUndefined: Self = StObject.set(x, "unprotected", js.undefined)
    }
  }
  
  trait EncodedJWE extends StObject {
    
    var aad: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var ciphertext: js.typedarray.Uint8Array
    
    var iv: js.typedarray.Uint8Array
    
    var `protected`: js.typedarray.Uint8Array
    
    var recipients: js.UndefOr[js.Array[EncodedRecipient]] = js.undefined
    
    var tag: js.typedarray.Uint8Array
    
    var unprotected: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object EncodedJWE {
    
    inline def apply(
      ciphertext: js.typedarray.Uint8Array,
      iv: js.typedarray.Uint8Array,
      `protected`: js.typedarray.Uint8Array,
      tag: js.typedarray.Uint8Array
    ): EncodedJWE = {
      val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodedJWE]
    }
    
    extension [Self <: EncodedJWE](x: Self) {
      
      inline def setAad(value: js.typedarray.Uint8Array): Self = StObject.set(x, "aad", value.asInstanceOf[js.Any])
      
      inline def setAadUndefined: Self = StObject.set(x, "aad", js.undefined)
      
      inline def setCiphertext(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      inline def setIv(value: js.typedarray.Uint8Array): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setProtected(value: js.typedarray.Uint8Array): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
      
      inline def setRecipients(value: js.Array[EncodedRecipient]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
      
      inline def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
      
      inline def setRecipientsVarargs(value: EncodedRecipient*): Self = StObject.set(x, "recipients", js.Array(value*))
      
      inline def setTag(value: js.typedarray.Uint8Array): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setUnprotected(value: Record[String, Any]): Self = StObject.set(x, "unprotected", value.asInstanceOf[js.Any])
      
      inline def setUnprotectedUndefined: Self = StObject.set(x, "unprotected", js.undefined)
    }
  }
  
  trait EncodedRecipient extends StObject {
    
    var encrypted_key: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var header: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object EncodedRecipient {
    
    inline def apply(): EncodedRecipient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodedRecipient]
    }
    
    extension [Self <: EncodedRecipient](x: Self) {
      
      inline def setEncrypted_key(value: js.typedarray.Uint8Array): Self = StObject.set(x, "encrypted_key", value.asInstanceOf[js.Any])
      
      inline def setEncrypted_keyUndefined: Self = StObject.set(x, "encrypted_key", js.undefined)
      
      inline def setHeader(value: Record[String, Any]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
  
  trait JWERecipient extends StObject {
    
    var encrypted_key: js.UndefOr[String] = js.undefined
    
    var header: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object JWERecipient {
    
    inline def apply(): JWERecipient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JWERecipient]
    }
    
    extension [Self <: JWERecipient](x: Self) {
      
      inline def setEncrypted_key(value: String): Self = StObject.set(x, "encrypted_key", value.asInstanceOf[js.Any])
      
      inline def setEncrypted_keyUndefined: Self = StObject.set(x, "encrypted_key", js.undefined)
      
      inline def setHeader(value: Record[String, Any]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
}
