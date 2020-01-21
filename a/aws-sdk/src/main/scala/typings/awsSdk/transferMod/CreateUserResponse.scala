package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserResponse extends js.Object {
  /**
    * The ID of the SFTP server that the user is attached to.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId = js.native
  /**
    * A unique string that identifies a user account associated with an SFTP server.
    */
  var UserName: typings.awsSdk.transferMod.UserName = js.native
}

object CreateUserResponse {
  @scala.inline
  def apply(ServerId: ServerId, UserName: UserName): CreateUserResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateUserResponse]
  }
}

