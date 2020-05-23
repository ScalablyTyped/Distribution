package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Identity extends js.Object {
  /**
    * A group identity.
    */
  var group: js.UndefOr[GroupIdentity] = js.native
  /**
    * A user identity.
    */
  var user: js.UndefOr[UserIdentity] = js.native
}

object Identity {
  @scala.inline
  def apply(group: GroupIdentity = null, user: UserIdentity = null): Identity = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
}

