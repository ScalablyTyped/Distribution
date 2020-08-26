package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportSshPublicKeyResponse extends js.Object {
  /**
    * A system-assigned unique identifier for a file transfer protocol-enabled server.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId = js.native
  /**
    * The name given to a public key by the system that was imported.
    */
  var SshPublicKeyId: typings.awsSdk.transferMod.SshPublicKeyId = js.native
  /**
    * A user name assigned to the ServerID value that you specified.
    */
  var UserName: typings.awsSdk.transferMod.UserName = js.native
}

object ImportSshPublicKeyResponse {
  @scala.inline
  def apply(ServerId: ServerId, SshPublicKeyId: SshPublicKeyId, UserName: UserName): ImportSshPublicKeyResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], SshPublicKeyId = SshPublicKeyId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSshPublicKeyResponse]
  }
  @scala.inline
  implicit class ImportSshPublicKeyResponseOps[Self <: ImportSshPublicKeyResponse] (val x: Self) extends AnyVal {
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
    def setServerId(value: ServerId): Self = this.set("ServerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSshPublicKeyId(value: SshPublicKeyId): Self = this.set("SshPublicKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: UserName): Self = this.set("UserName", value.asInstanceOf[js.Any])
  }
  
}

