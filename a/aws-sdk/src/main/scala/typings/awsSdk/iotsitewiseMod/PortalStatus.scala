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
  def apply(state: PortalState): PortalStatus = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalStatus]
  }
  @scala.inline
  implicit class PortalStatusOps[Self <: PortalStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setState(value: PortalState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: MonitorErrorDetails): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
  
}

