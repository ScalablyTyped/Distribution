package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyUser extends js.Object {
  /**
    * The stable and unique string identifying the user. For more information about IDs, see IAM Identifiers in the IAM User Guide.
    */
  var UserId: js.UndefOr[idType] = js.native
  /**
    * The name (friendly name, not ARN) identifying the user.
    */
  var UserName: js.UndefOr[userNameType] = js.native
}

object PolicyUser {
  @scala.inline
  def apply(UserId: idType = null, UserName: userNameType = null): PolicyUser = {
    val __obj = js.Dynamic.literal()
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyUser]
  }
}

