package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user account.
    */
  var Arn: js.UndefOr[ARN] = js.native
  /**
    * The identifier of the user account.
    */
  var Id: js.UndefOr[UserId] = js.native
  /**
    * The Amazon Connect user name of the user account.
    */
  var Username: js.UndefOr[AgentUsername] = js.native
}

object UserSummary {
  @scala.inline
  def apply(Arn: ARN = null, Id: UserId = null, Username: AgentUsername = null): UserSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserSummary]
  }
}

