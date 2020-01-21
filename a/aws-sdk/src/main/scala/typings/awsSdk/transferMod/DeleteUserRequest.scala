package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserRequest extends js.Object {
  /**
    * A system-assigned unique identifier for an SFTP server instance that has the user assigned to it.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId = js.native
  /**
    * A unique string that identifies a user that is being deleted from the server.
    */
  var UserName: typings.awsSdk.transferMod.UserName = js.native
}

object DeleteUserRequest {
  @scala.inline
  def apply(ServerId: ServerId, UserName: UserName): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteUserRequest]
  }
}

