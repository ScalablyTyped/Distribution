package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserResponse extends js.Object {
  /**
    * The ID of the file transfer protocol-enabled server that the user is attached to.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId = js.native
  /**
    * A unique string that identifies a user account associated with a file transfer protocol-enabled server.
    */
  var UserName: typings.awsSdk.transferMod.UserName = js.native
}

object CreateUserResponse {
  @scala.inline
  def apply(ServerId: ServerId, UserName: UserName): CreateUserResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserResponse]
  }
  @scala.inline
  implicit class CreateUserResponseOps[Self <: CreateUserResponse] (val x: Self) extends AnyVal {
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
    def setUserName(value: UserName): Self = this.set("UserName", value.asInstanceOf[js.Any])
  }
  
}

