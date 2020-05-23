package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortProbeAction extends js.Object {
  /**
    * Indicates whether EC2 blocked the port probe to the instance, such as with an ACL.
    */
  var Blocked: js.UndefOr[Boolean] = js.native
  /**
    * A list of objects related to port probe details.
    */
  var PortProbeDetails: js.UndefOr[typings.awsSdk.guarddutyMod.PortProbeDetails] = js.native
}

object PortProbeAction {
  @scala.inline
  def apply(Blocked: js.UndefOr[Boolean] = js.undefined, PortProbeDetails: PortProbeDetails = null): PortProbeAction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Blocked)) __obj.updateDynamic("Blocked")(Blocked.get.asInstanceOf[js.Any])
    if (PortProbeDetails != null) __obj.updateDynamic("PortProbeDetails")(PortProbeDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortProbeAction]
  }
}

