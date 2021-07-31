package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecryptResponse extends StObject {
  
  /**
    * The encryption algorithm that was used to decrypt the ciphertext.
    */
  var EncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec] = js.undefined
  
  /**
    * The Amazon Resource Name (key ARN) of the CMK that was used to decrypt the ciphertext.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
  
  /**
    * Decrypted plaintext data. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var Plaintext: js.UndefOr[PlaintextType] = js.undefined
}
object DecryptResponse {
  
  @scala.inline
  def apply(): DecryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecryptResponse]
  }
  
  @scala.inline
  implicit class DecryptResponseMutableBuilder[Self <: DecryptResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionAlgorithm(value: EncryptionAlgorithmSpec): Self = StObject.set(x, "EncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionAlgorithmUndefined: Self = StObject.set(x, "EncryptionAlgorithm", js.undefined)
    
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
