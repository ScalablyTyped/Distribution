package typings.awsSdk.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRoleCredentialsResponse extends js.Object {
  /**
    * The credentials for the role that is assigned to the user.
    */
  var roleCredentials: js.UndefOr[RoleCredentials] = js.native
}

object GetRoleCredentialsResponse {
  @scala.inline
  def apply(): GetRoleCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRoleCredentialsResponse]
  }
  @scala.inline
  implicit class GetRoleCredentialsResponseOps[Self <: GetRoleCredentialsResponse] (val x: Self) extends AnyVal {
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
    def setRoleCredentials(value: RoleCredentials): Self = this.set("roleCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleCredentials: Self = this.set("roleCredentials", js.undefined)
  }
  
}

