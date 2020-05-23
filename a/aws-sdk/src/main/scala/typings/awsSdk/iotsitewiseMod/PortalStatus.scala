package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalStatus extends js.Object {
  /**
    * Contains associated error information, if any.
    */
  var error: js.UndefOr[MonitorErrorDetails] = js.native
  /**
    * The current state of the portal.
    */
  var state: PortalState = js.native
}

object PortalStatus {
  @scala.inline
  def apply(state: PortalState, error: MonitorErrorDetails = null): PortalStatus = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalStatus]
  }
}

