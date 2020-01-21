package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestIdentityProviderRequest extends js.Object {
  /**
    * A system-assigned identifier for a specific server. That server's user authentication method is tested with a user name and password.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId = js.native
  /**
    * This request parameter is the name of the user account to be tested.
    */
  var UserName: typings.awsSdk.transferMod.UserName = js.native
  /**
    * The password of the user account to be tested.
    */
  var UserPassword: js.UndefOr[typings.awsSdk.transferMod.UserPassword] = js.native
}

object TestIdentityProviderRequest {
  @scala.inline
  def apply(ServerId: ServerId, UserName: UserName, UserPassword: UserPassword = null): TestIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    if (UserPassword != null) __obj.updateDynamic("UserPassword")(UserPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestIdentityProviderRequest]
  }
}

