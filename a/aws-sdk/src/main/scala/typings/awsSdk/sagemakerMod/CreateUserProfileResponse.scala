package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserProfileResponse extends js.Object {
  /**
    * The user profile Amazon Resource Name (ARN).
    */
  var UserProfileArn: js.UndefOr[typings.awsSdk.sagemakerMod.UserProfileArn] = js.native
}

object CreateUserProfileResponse {
  @scala.inline
  def apply(UserProfileArn: UserProfileArn = null): CreateUserProfileResponse = {
    val __obj = js.Dynamic.literal()
    if (UserProfileArn != null) __obj.updateDynamic("UserProfileArn")(UserProfileArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserProfileResponse]
  }
}

