package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserResponse extends js.Object {
  /**
    * A system-assigned unique identifier for a file transfer protocol-enabled server instance that the user account is assigned to.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId = js.native
  /**
    * The unique identifier for a user that is assigned to a file transfer protocol-enabled server instance that was specified in the request.
    */
  var UserName: typings.awsSdk.transferMod.UserName = js.native
}

object UpdateUserResponse {
  @scala.inline
  def apply(ServerId: ServerId, UserName: UserName): UpdateUserResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserResponse]
  }
}

