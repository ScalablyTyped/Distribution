package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReEncryptResponse extends StObject {
  
  /**
    * <p>The reencrypted data. When you use the HTTP API or the Amazon Web Services CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.</p>
    */
  var CiphertextBlob: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * <p>The encryption algorithm that was used to reencrypt the data.</p>
    */
  var DestinationEncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec | String] = js.undefined
  
  /**
    * <p>The Amazon Resource Name (<a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) of the KMS key that was used to reencrypt the data.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The encryption algorithm that was used to decrypt the ciphertext before it was
    *       reencrypted.</p>
    */
  var SourceEncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec | String] = js.undefined
  
  /**
    * <p>Unique identifier of the KMS key used to originally encrypt the data.</p>
    */
  var SourceKeyId: js.UndefOr[String] = js.undefined
}
object ReEncryptResponse {
  
  inline def apply(): ReEncryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReEncryptResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReEncryptResponse] (val x: Self) extends AnyVal {
    
    inline def setCiphertextBlob(value: js.typedarray.Uint8Array): Self = StObject.set(x, "CiphertextBlob", value.asInstanceOf[js.Any])
    
    inline def setCiphertextBlobUndefined: Self = StObject.set(x, "CiphertextBlob", js.undefined)
    
    inline def setDestinationEncryptionAlgorithm(value: EncryptionAlgorithmSpec | String): Self = StObject.set(x, "DestinationEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setDestinationEncryptionAlgorithmUndefined: Self = StObject.set(x, "DestinationEncryptionAlgorithm", js.undefined)
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setSourceEncryptionAlgorithm(value: EncryptionAlgorithmSpec | String): Self = StObject.set(x, "SourceEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSourceEncryptionAlgorithmUndefined: Self = StObject.set(x, "SourceEncryptionAlgorithm", js.undefined)
    
    inline def setSourceKeyId(value: String): Self = StObject.set(x, "SourceKeyId", value.asInstanceOf[js.Any])
    
    inline def setSourceKeyIdUndefined: Self = StObject.set(x, "SourceKeyId", js.undefined)
  }
}
