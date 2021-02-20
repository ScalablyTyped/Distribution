package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateDataKeyPairResponse extends StObject {
  
  /**
    * The Amazon Resource Name (key ARN) of the CMK that encrypted the private key.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  
  /**
    * The type of data key pair that was generated.
    */
  var KeyPairSpec: js.UndefOr[DataKeyPairSpec] = js.native
  
  /**
    * The encrypted copy of the private key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var PrivateKeyCiphertextBlob: js.UndefOr[CiphertextType] = js.native
  
  /**
    * The plaintext copy of the private key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var PrivateKeyPlaintext: js.UndefOr[PlaintextType] = js.native
  
  /**
    * The public key (in plaintext).
    */
  var PublicKey: js.UndefOr[PublicKeyType] = js.native
}
object GenerateDataKeyPairResponse {
  
  @scala.inline
  def apply(): GenerateDataKeyPairResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateDataKeyPairResponse]
  }
  
  @scala.inline
  implicit class GenerateDataKeyPairResponseMutableBuilder[Self <: GenerateDataKeyPairResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    @scala.inline
    def setKeyPairSpec(value: DataKeyPairSpec): Self = StObject.set(x, "KeyPairSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPairSpecUndefined: Self = StObject.set(x, "KeyPairSpec", js.undefined)
    
    @scala.inline
    def setPrivateKeyCiphertextBlob(value: CiphertextType): Self = StObject.set(x, "PrivateKeyCiphertextBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyCiphertextBlobUndefined: Self = StObject.set(x, "PrivateKeyCiphertextBlob", js.undefined)
    
    @scala.inline
    def setPrivateKeyPlaintext(value: PlaintextType): Self = StObject.set(x, "PrivateKeyPlaintext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyPlaintextUndefined: Self = StObject.set(x, "PrivateKeyPlaintext", js.undefined)
    
    @scala.inline
    def setPublicKey(value: PublicKeyType): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyUndefined: Self = StObject.set(x, "PublicKey", js.undefined)
  }
}
