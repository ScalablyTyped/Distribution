package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  /**
    * The active status of user. When you create an Amazon QuickSight user that’s not an IAM user or an Active Directory user, that user is inactive until they sign in and provide a password.
    */
  var Active: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) for the user.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The custom permissions profile associated with this user.
    */
  var CustomPermissionsName: js.UndefOr[RoleName] = js.native
  /**
    * The user's email address.
    */
  var Email: js.UndefOr[String] = js.native
  /**
    * The type of identity authentication used by the user.
    */
  var IdentityType: js.UndefOr[typings.awsSdk.quicksightMod.IdentityType] = js.native
  /**
    * The principal ID of the user.
    */
  var PrincipalId: js.UndefOr[String] = js.native
  /**
    * The Amazon QuickSight role for the user. The user role can be one of the following:.    READER: A user who has read-only access to dashboards.    AUTHOR: A user who can create data sources, datasets, analyses, and dashboards.    ADMIN: A user who is an author, who can also manage Amazon QuickSight settings.    RESTRICTED_READER: This role isn't currently available for use.    RESTRICTED_AUTHOR: This role isn't currently available for use.  
    */
  var Role: js.UndefOr[UserRole] = js.native
  /**
    * The user's user name.
    */
  var UserName: js.UndefOr[UserName_] = js.native
}

object User {
  @scala.inline
  def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("Active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("Active", js.undefined)
    @scala.inline
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setCustomPermissionsName(value: RoleName): Self = this.set("CustomPermissionsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomPermissionsName: Self = this.set("CustomPermissionsName", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("Email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("Email", js.undefined)
    @scala.inline
    def setIdentityType(value: IdentityType): Self = this.set("IdentityType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityType: Self = this.set("IdentityType", js.undefined)
    @scala.inline
    def setPrincipalId(value: String): Self = this.set("PrincipalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipalId: Self = this.set("PrincipalId", js.undefined)
    @scala.inline
    def setRole(value: UserRole): Self = this.set("Role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("Role", js.undefined)
    @scala.inline
    def setUserName(value: UserName_): Self = this.set("UserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("UserName", js.undefined)
  }
  
}

