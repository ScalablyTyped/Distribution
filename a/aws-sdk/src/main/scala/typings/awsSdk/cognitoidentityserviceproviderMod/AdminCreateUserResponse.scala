package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminCreateUserResponse extends js.Object {
  /**
    * The newly created user.
    */
  var User: js.UndefOr[UserType] = js.native
}

object AdminCreateUserResponse {
  @scala.inline
  def apply(User: UserType = null): AdminCreateUserResponse = {
    val __obj = js.Dynamic.literal()
    if (User != null) __obj.updateDynamic("User")(User.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminCreateUserResponse]
  }
}

