package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserRequest extends js.Object {
  /**
    * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The name of the custom permissions profile that you want to assign to this user. Currently, custom permissions profile names are assigned to permissions profiles in the QuickSight console. You use this API to assign the named set of permissions to a QuickSight user. 
    */
  var CustomPermissionsName: js.UndefOr[RoleName] = js.native
  /**
    * The email address of the user that you want to update.
    */
  var Email: String = js.native
  /**
    * The namespace. Currently, you should set this to default.
    */
  var Namespace: typings.awsSdk.quicksightMod.Namespace = js.native
  /**
    * The Amazon QuickSight role of the user. The user role can be one of the following:    READER: A user who has read-only access to dashboards.    AUTHOR: A user who can create data sources, datasets, analyses, and dashboards.    ADMIN: A user who is an author, who can also manage Amazon QuickSight settings.  
    */
  var Role: UserRole = js.native
  /**
    * A flag that you use to indicate that you want to remove all custom permissions from this user. Using this parameter resets the user to the state it was in before a custom permissions profile was applied. This parameter defaults to NULL and it doesn't accept any other value.
    */
  var UnapplyCustomPermissions: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon QuickSight user name that you want to update.
    */
  var UserName: UserName_ = js.native
}

object UpdateUserRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    Email: String,
    Namespace: Namespace,
    Role: UserRole,
    UserName: UserName_
  ): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequest]
  }
  @scala.inline
  implicit class UpdateUserRequestOps[Self <: UpdateUserRequest] (val x: Self) extends AnyVal {
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
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("Email", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: Namespace): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: UserRole): Self = this.set("Role", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: UserName_): Self = this.set("UserName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomPermissionsName(value: RoleName): Self = this.set("CustomPermissionsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomPermissionsName: Self = this.set("CustomPermissionsName", js.undefined)
    @scala.inline
    def setUnapplyCustomPermissions(value: Boolean): Self = this.set("UnapplyCustomPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnapplyCustomPermissions: Self = this.set("UnapplyCustomPermissions", js.undefined)
  }
  
}

