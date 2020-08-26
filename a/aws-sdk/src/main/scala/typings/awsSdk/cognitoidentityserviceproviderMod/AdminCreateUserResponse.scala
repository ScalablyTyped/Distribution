package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminCreateUserResponse extends js.Object {
  /**
    * The newly created user.
    */
  var User: js.UndefOr[UserType] = js.native
}

object AdminCreateUserResponse {
  @scala.inline
  def apply(): AdminCreateUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminCreateUserResponse]
  }
  @scala.inline
  implicit class AdminCreateUserResponseOps[Self <: AdminCreateUserResponse] (val x: Self) extends AnyVal {
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
    def setUser(value: UserType): Self = this.set("User", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("User", js.undefined)
  }
  
}

