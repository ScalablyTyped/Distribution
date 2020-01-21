package typings.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEnvironmentMembershipResult extends js.Object {
  /**
    * Information about the environment member that was added.
    */
  var membership: js.UndefOr[EnvironmentMember] = js.native
}

object CreateEnvironmentMembershipResult {
  @scala.inline
  def apply(membership: EnvironmentMember = null): CreateEnvironmentMembershipResult = {
    val __obj = js.Dynamic.literal()
    if (membership != null) __obj.updateDynamic("membership")(membership.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentMembershipResult]
  }
}

