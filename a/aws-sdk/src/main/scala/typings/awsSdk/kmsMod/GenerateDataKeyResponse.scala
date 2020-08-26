package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateDataKeyResponse extends js.Object {
  /**
    * The encrypted copy of the data key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var CiphertextBlob: js.UndefOr[CiphertextType] = js.native
  /**
    * The Amazon Resource Name (key ARN) of the CMK that encrypted the data key.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  /**
    * The plaintext data key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded. Use this data key to encrypt your data outside of KMS. Then, remove it from memory as soon as possible.
    */
  var Plaintext: js.UndefOr[PlaintextType] = js.native
}

object GenerateDataKeyResponse {
  @scala.inline
  def apply(): GenerateDataKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateDataKeyResponse]
  }
  @scala.inline
  implicit class GenerateDataKeyResponseOps[Self <: GenerateDataKeyResponse] (val x: Self) extends AnyVal {
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
    def setKeyId(value: KeyIdType): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyId: Self = this.set("KeyId", js.undefined)
    @scala.inline
    def setPlaintext(value: PlaintextType): Self = this.set("Plaintext", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaintext: Self = this.set("Plaintext", js.undefined)
  }
  
}

