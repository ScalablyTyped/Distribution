package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportSshPublicKeyResponse extends js.Object {
  /**
    * A system-assigned unique identifier for an SFTP server.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId = js.native
  /**
    * This identifier is the name given to a public key by the system that was imported.
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
}

