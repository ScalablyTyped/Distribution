package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivateUserResponse extends js.Object {
  /**
    * The user information.
    */
  var User: js.UndefOr[typings.awsSdk.workdocsMod.User] = js.native
}

object ActivateUserResponse {
  @scala.inline
  def apply(): ActivateUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivateUserResponse]
  }
  @scala.inline
  implicit class ActivateUserResponseOps[Self <: ActivateUserResponse] (val x: Self) extends AnyVal {
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
    def setUser(value: User): Self = this.set("User", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("User", js.undefined)
  }
  
}

