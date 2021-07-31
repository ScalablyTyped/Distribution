package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptResponse extends StObject {
  
  /**
    * The encrypted plaintext. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined
  
  /**
    * The encryption algorithm that was used to encrypt the plaintext.
    */
  var EncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec] = js.undefined
  
  /**
    * The Amazon Resource Name (key ARN) of the CMK that was used to encrypt the plaintext.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
}
object EncryptResponse {
  
  @scala.inline
  def apply(): EncryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptResponse]
  }
  
  @scala.inline
  implicit class EncryptResponseMutableBuilder[Self <: EncryptResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCiphertextBlob(value: CiphertextType): Self = StObject.set(x, "CiphertextBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiphertextBlobUndefined: Self = StObject.set(x, "CiphertextBlob", js.undefined)
    
    @scala.inline
    def setEncryptionAlgorithm(value: EncryptionAlgorithmSpec): Self = StObject.set(x, "EncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionAlgorithmUndefined: Self = StObject.set(x, "EncryptionAlgorithm", js.undefined)
    
    @scala.inline
    def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
  }
}
