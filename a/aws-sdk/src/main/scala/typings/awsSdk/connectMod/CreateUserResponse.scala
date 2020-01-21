package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user account.
    */
  var UserArn: js.UndefOr[ARN] = js.native
  /**
    * The identifier of the user account.
    */
  var UserId: js.UndefOr[typings.awsSdk.connectMod.UserId] = js.native
}

object CreateUserResponse {
  @scala.inline
  def apply(UserArn: ARN = null, UserId: UserId = null): CreateUserResponse = {
    val __obj = js.Dynamic.literal()
    if (UserArn != null) __obj.updateDynamic("UserArn")(UserArn.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserResponse]
  }
}

