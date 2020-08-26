package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecryptResponse extends js.Object {
  /**
    * The encryption algorithm that was used to decrypt the ciphertext.
    */
  var EncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec] = js.native
  /**
    * The Amazon Resource Name (key ARN) of the CMK that was used to decrypt the ciphertext.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  /**
    * Decrypted plaintext data. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var Plaintext: js.UndefOr[PlaintextType] = js.native
}

object DecryptResponse {
  @scala.inline
  def apply(): DecryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecryptResponse]
  }
  @scala.inline
  implicit class DecryptResponseOps[Self <: DecryptResponse] (val x: Self) extends AnyVal {
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
    def setEncryptionAlgorithm(value: EncryptionAlgorithmSpec): Self = this.set("EncryptionAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionAlgorithm: Self = this.set("EncryptionAlgorithm", js.undefined)
    @scala.inline
    def setKeyId(value: KeyIdType): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyId: Self = this.set("KeyId", js.undefined)
    @scala.inline
    def setPlaintext(value: PlaintextType): Self = this.set("Plaintext", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaintext: Self = this.set("Plaintext", js.undefined)
  }
  
}

