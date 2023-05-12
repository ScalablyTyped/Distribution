package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateDataKeyPairWithoutPlaintextResponse extends StObject {
  
  /**
    * <p>The Amazon Resource Name (<a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) of the KMS key that encrypted the private key.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The type of data key pair that was generated.</p>
    */
  var KeyPairSpec: js.UndefOr[DataKeyPairSpec | String] = js.undefined
  
  /**
    * <p>The encrypted copy of the private key. When you use the HTTP API or the Amazon Web Services CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.</p>
    */
  var PrivateKeyCiphertextBlob: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * <p>The public key (in plaintext). When you use the HTTP API or the Amazon Web Services CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.</p>
    */
  var PublicKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
}
object GenerateDataKeyPairWithoutPlaintextResponse {
  
  inline def apply(): GenerateDataKeyPairWithoutPlaintextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateDataKeyPairWithoutPlaintextResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateDataKeyPairWithoutPlaintextResponse] (val x: Self) extends AnyVal {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setKeyPairSpec(value: DataKeyPairSpec | String): Self = StObject.set(x, "KeyPairSpec", value.asInstanceOf[js.Any])
    
    inline def setKeyPairSpecUndefined: Self = StObject.set(x, "KeyPairSpec", js.undefined)
    
    inline def setPrivateKeyCiphertextBlob(value: js.typedarray.Uint8Array): Self = StObject.set(x, "PrivateKeyCiphertextBlob", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyCiphertextBlobUndefined: Self = StObject.set(x, "PrivateKeyCiphertextBlob", js.undefined)
    
    inline def setPublicKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "PublicKey", js.undefined)
  }
}
