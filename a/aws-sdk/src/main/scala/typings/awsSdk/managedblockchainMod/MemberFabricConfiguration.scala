package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberFabricConfiguration extends js.Object {
  /**
    * The password for the member's initial administrative user. The AdminPassword must be at least eight characters long and no more than 32 characters. It must contain at least one uppercase letter, one lowercase letter, and one digit. It cannot have a single quote(‘), double quote(“), forward slash(/), backward slash(\), @, or a space.
    */
  var AdminPassword: PasswordString = js.native
  /**
    * The user name for the member's initial administrative user.
    */
  var AdminUsername: UsernameString = js.native
}

object MemberFabricConfiguration {
  @scala.inline
  def apply(AdminPassword: PasswordString, AdminUsername: UsernameString): MemberFabricConfiguration = {
    val __obj = js.Dynamic.literal(AdminPassword = AdminPassword.asInstanceOf[js.Any], AdminUsername = AdminUsername.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberFabricConfiguration]
  }
  @scala.inline
  implicit class MemberFabricConfigurationOps[Self <: MemberFabricConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdminPassword(value: PasswordString): Self = this.set("AdminPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdminUsername(value: UsernameString): Self = this.set("AdminUsername", value.asInstanceOf[js.Any])
  }
  
}

