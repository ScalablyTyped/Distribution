package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserRequest extends js.Object {
  /**
    * The access token from a request to delete a user.
    */
  var AccessToken: TokenModelType = js.native
}

object DeleteUserRequest {
  @scala.inline
  def apply(AccessToken: TokenModelType): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserRequest]
  }
  @scala.inline
  implicit class DeleteUserRequestOps[Self <: DeleteUserRequest] (val x: Self) extends AnyVal {
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
    def setAccessToken(value: TokenModelType): Self = this.set("AccessToken", value.asInstanceOf[js.Any])
  }
  
}

