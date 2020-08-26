package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadSSHPublicKeyResponse extends js.Object {
  /**
    * Contains information about the SSH public key.
    */
  var SSHPublicKey: js.UndefOr[typings.awsSdk.iamMod.SSHPublicKey] = js.native
}

object UploadSSHPublicKeyResponse {
  @scala.inline
  def apply(): UploadSSHPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadSSHPublicKeyResponse]
  }
  @scala.inline
  implicit class UploadSSHPublicKeyResponseOps[Self <: UploadSSHPublicKeyResponse] (val x: Self) extends AnyVal {
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
    def setSSHPublicKey(value: SSHPublicKey): Self = this.set("SSHPublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSHPublicKey: Self = this.set("SSHPublicKey", js.undefined)
  }
  
}

