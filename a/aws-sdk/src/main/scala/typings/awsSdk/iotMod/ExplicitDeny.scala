package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExplicitDeny extends js.Object {
  /**
    * The policies that denied the authorization.
    */
  var policies: js.UndefOr[Policies] = js.native
}

object ExplicitDeny {
  @scala.inline
  def apply(policies: Policies = null): ExplicitDeny = {
    val __obj = js.Dynamic.literal()
    if (policies != null) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplicitDeny]
  }
}

