package typings.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEnvironmentMembershipResult extends js.Object {
  /**
    * Information about the environment member whose settings were changed.
    */
  var membership: js.UndefOr[EnvironmentMember] = js.native
}

object UpdateEnvironmentMembershipResult {
  @scala.inline
  def apply(membership: EnvironmentMember = null): UpdateEnvironmentMembershipResult = {
    val __obj = js.Dynamic.literal()
    if (membership != null) __obj.updateDynamic("membership")(membership.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentMembershipResult]
  }
}

