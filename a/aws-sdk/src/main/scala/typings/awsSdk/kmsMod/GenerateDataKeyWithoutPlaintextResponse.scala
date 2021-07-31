package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateDataKeyWithoutPlaintextResponse extends StObject {
  
  /**
    * The encrypted data key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined
  
  /**
    * The Amazon Resource Name (key ARN) of the CMK that encrypted the data key.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
}
object GenerateDataKeyWithoutPlaintextResponse {
  
  @scala.inline
  def apply(): GenerateDataKeyWithoutPlaintextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateDataKeyWithoutPlaintextResponse]
  }
  
  @scala.inline
  implicit class GenerateDataKeyWithoutPlaintextResponseMutableBuilder[Self <: GenerateDataKeyWithoutPlaintextResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCiphertextBlob(value: CiphertextType): Self = StObject.set(x, "CiphertextBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiphertextBlobUndefined: Self = StObject.set(x, "CiphertextBlob", js.undefined)
    
    @scala.inline
    def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
  }
}
