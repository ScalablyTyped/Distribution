package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivateUserRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The ID of the user.
    */
  var UserId: IdType = js.native
}

object ActivateUserRequest {
  @scala.inline
  def apply(UserId: IdType, AuthenticationToken: AuthenticationHeaderType = null): ActivateUserRequest = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivateUserRequest]
  }
}

