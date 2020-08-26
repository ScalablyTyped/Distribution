package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutKMSEncryptionKeyRequest extends js.Object {
  /**
    * The KMS encryption key ARN.
    */
  var kmsEncryptionKeyArn: KmsEncryptionKeyArn = js.native
}

object PutKMSEncryptionKeyRequest {
  @scala.inline
  def apply(kmsEncryptionKeyArn: KmsEncryptionKeyArn): PutKMSEncryptionKeyRequest = {
    val __obj = js.Dynamic.literal(kmsEncryptionKeyArn = kmsEncryptionKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutKMSEncryptionKeyRequest]
  }
  @scala.inline
  implicit class PutKMSEncryptionKeyRequestOps[Self <: PutKMSEncryptionKeyRequest] (val x: Self) extends AnyVal {
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
    def setKmsEncryptionKeyArn(value: KmsEncryptionKeyArn): Self = this.set("kmsEncryptionKeyArn", value.asInstanceOf[js.Any])
  }
  
}

