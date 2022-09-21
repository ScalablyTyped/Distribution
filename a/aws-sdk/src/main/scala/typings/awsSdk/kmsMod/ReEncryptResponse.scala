package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReEncryptResponse extends StObject {
  
  /**
    * The reencrypted data. When you use the HTTP API or the Amazon Web Services CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined
  
  /**
    * The encryption algorithm that was used to reencrypt the data.
    */
  var DestinationEncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec] = js.undefined
  
  /**
    * The Amazon Resource Name (key ARN) of the KMS key that was used to reencrypt the data.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
  
  /**
    * The encryption algorithm that was used to decrypt the ciphertext before it was reencrypted.
    */
  var SourceEncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec] = js.undefined
  
  /**
    * Unique identifier of the KMS key used to originally encrypt the data.
    */
  var SourceKeyId: js.UndefOr[KeyIdType] = js.undefined
}
object ReEncryptResponse {
  
  inline def apply(): ReEncryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReEncryptResponse]
  }
  
  extension [Self <: ReEncryptResponse](x: Self) {
    
    inline def setCiphertextBlob(value: CiphertextType): Self = StObject.set(x, "CiphertextBlob", value.asInstanceOf[js.Any])
    
    inline def setCiphertextBlobUndefined: Self = StObject.set(x, "CiphertextBlob", js.undefined)
    
    inline def setDestinationEncryptionAlgorithm(value: EncryptionAlgorithmSpec): Self = StObject.set(x, "DestinationEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setDestinationEncryptionAlgorithmUndefined: Self = StObject.set(x, "DestinationEncryptionAlgorithm", js.undefined)
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setSourceEncryptionAlgorithm(value: EncryptionAlgorithmSpec): Self = StObject.set(x, "SourceEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSourceEncryptionAlgorithmUndefined: Self = StObject.set(x, "SourceEncryptionAlgorithm", js.undefined)
    
    inline def setSourceKeyId(value: KeyIdType): Self = StObject.set(x, "SourceKeyId", value.asInstanceOf[js.Any])
    
    inline def setSourceKeyIdUndefined: Self = StObject.set(x, "SourceKeyId", js.undefined)
  }
}
