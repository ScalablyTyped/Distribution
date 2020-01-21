package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserPoolResponse extends js.Object {
  /**
    * A container for the user pool details.
    */
  var UserPool: js.UndefOr[UserPoolType] = js.native
}

object CreateUserPoolResponse {
  @scala.inline
  def apply(UserPool: UserPoolType = null): CreateUserPoolResponse = {
    val __obj = js.Dynamic.literal()
    if (UserPool != null) __obj.updateDynamic("UserPool")(UserPool.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserPoolResponse]
  }
}

