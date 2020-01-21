package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginProfile extends js.Object {
  /**
    * The date when the password for the user was created.
    */
  var CreateDate: dateType = js.native
  /**
    * Specifies whether the user is required to set a new password on next sign-in.
    */
  var PasswordResetRequired: js.UndefOr[booleanType] = js.native
  /**
    * The name of the user, which can be used for signing in to the AWS Management Console.
    */
  var UserName: userNameType = js.native
}

object LoginProfile {
  @scala.inline
  def apply(
    CreateDate: dateType,
    UserName: userNameType,
    PasswordResetRequired: js.UndefOr[Boolean] = js.undefined
  ): LoginProfile = {
    val __obj = js.Dynamic.literal(CreateDate = CreateDate.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    if (!js.isUndefined(PasswordResetRequired)) __obj.updateDynamic("PasswordResetRequired")(PasswordResetRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginProfile]
  }
}

