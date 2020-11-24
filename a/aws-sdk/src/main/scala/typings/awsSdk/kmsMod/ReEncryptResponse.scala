package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReEncryptResponse extends js.Object {
  
  /**
    * The reencrypted data. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var CiphertextBlob: js.UndefOr[CiphertextType] = js.native
  
  /**
    * The encryption algorithm that was used to reencrypt the data.
    */
  var DestinationEncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec] = js.native
  
  /**
    * The Amazon Resource Name (key ARN) of the CMK that was used to reencrypt the data.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  
  /**
    * The encryption algorithm that was used to decrypt the ciphertext before it was reencrypted.
    */
  var SourceEncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec] = js.native
  
  /**
    * Unique identifier of the CMK used to originally encrypt the data.
    */
  var SourceKeyId: js.UndefOr[KeyIdType] = js.native
}
object ReEncryptResponse {
  
  @scala.inline
  def apply(): ReEncryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReEncryptResponse]
  }
  
  @scala.inline
  implicit class ReEncryptResponseOps[Self <: ReEncryptResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCiphertextBlob(value: CiphertextType): Self = this.set("CiphertextBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCiphertextBlob: Self = this.set("CiphertextBlob", js.undefined)
    
    @scala.inline
    def setDestinationEncryptionAlgorithm(value: EncryptionAlgorithmSpec): Self = this.set("DestinationEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationEncryptionAlgorithm: Self = this.set("DestinationEncryptionAlgorithm", js.undefined)
    
    @scala.inline
    def setKeyId(value: KeyIdType): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyId: Self = this.set("KeyId", js.undefined)
    
    @scala.inline
    def setSourceEncryptionAlgorithm(value: EncryptionAlgorithmSpec): Self = this.set("SourceEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceEncryptionAlgorithm: Self = this.set("SourceEncryptionAlgorithm", js.undefined)
    
    @scala.inline
    def setSourceKeyId(value: KeyIdType): Self = this.set("SourceKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceKeyId: Self = this.set("SourceKeyId", js.undefined)
  }
}
