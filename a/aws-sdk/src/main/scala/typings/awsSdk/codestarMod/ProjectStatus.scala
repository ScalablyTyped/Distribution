package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectStatus extends js.Object {
  /**
    * In the case of a project creation or deletion failure, a reason for the failure.
    */
  var reason: js.UndefOr[Reason] = js.native
  /**
    * The phase of completion for a project creation or deletion.
    */
  var state: State = js.native
}

object ProjectStatus {
  @scala.inline
  def apply(state: State, reason: Reason = null): ProjectStatus = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectStatus]
  }
}

