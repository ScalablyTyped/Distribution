package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserResponse extends js.Object {
  /**
    * A structure with details about the new IAM user.
    */
  var User: js.UndefOr[typings.awsSdk.iamMod.User] = js.native
}

object CreateUserResponse {
  @scala.inline
  def apply(User: User = null): CreateUserResponse = {
    val __obj = js.Dynamic.literal()
    if (User != null) __obj.updateDynamic("User")(User.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserResponse]
  }
}

