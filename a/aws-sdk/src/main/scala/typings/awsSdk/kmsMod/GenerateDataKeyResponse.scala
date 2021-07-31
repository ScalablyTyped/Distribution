package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateDataKeyResponse extends StObject {
  
  /**
    * The encrypted copy of the data key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined
  
  /**
    * The Amazon Resource Name (key ARN) of the CMK that encrypted the data key.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
  
  /**
    * The plaintext data key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded. Use this data key to encrypt your data outside of KMS. Then, remove it from memory as soon as possible.
    */
  var Plaintext: js.UndefOr[PlaintextType] = js.undefined
}
object GenerateDataKeyResponse {
  
  @scala.inline
  def apply(): GenerateDataKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateDataKeyResponse]
  }
  
  @scala.inline
  implicit class GenerateDataKeyResponseMutableBuilder[Self <: GenerateDataKeyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCiphertextBlob(value: CiphertextType): Self = StObject.set(x, "CiphertextBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiphertextBlobUndefined: Self = StObject.set(x, "CiphertextBlob", js.undefined)
    
    @scala.inline
    def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    @scala.inline
    def setPlaintext(value: PlaintextType): Self = StObject.set(x, "Plaintext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaintextUndefined: Self = StObject.set(x, "Plaintext", js.undefined)
  }
}
