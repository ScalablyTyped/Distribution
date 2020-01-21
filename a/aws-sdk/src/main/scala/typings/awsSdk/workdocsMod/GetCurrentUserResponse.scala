package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCurrentUserResponse extends js.Object {
  /**
    * Metadata of the user.
    */
  var User: js.UndefOr[typings.awsSdk.workdocsMod.User] = js.native
}

object GetCurrentUserResponse {
  @scala.inline
  def apply(User: User = null): GetCurrentUserResponse = {
    val __obj = js.Dynamic.literal()
    if (User != null) __obj.updateDynamic("User")(User.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCurrentUserResponse]
  }
}

