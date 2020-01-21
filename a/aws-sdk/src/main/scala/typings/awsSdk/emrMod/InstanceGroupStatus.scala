package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupStatus extends js.Object {
  /**
    * The current state of the instance group.
    */
  var State: js.UndefOr[InstanceGroupState] = js.native
  /**
    * The status change reason details for the instance group.
    */
  var StateChangeReason: js.UndefOr[InstanceGroupStateChangeReason] = js.native
  /**
    * The timeline of the instance group status over time.
    */
  var Timeline: js.UndefOr[InstanceGroupTimeline] = js.native
}

object InstanceGroupStatus {
  @scala.inline
  def apply(
    State: InstanceGroupState = null,
    StateChangeReason: InstanceGroupStateChangeReason = null,
    Timeline: InstanceGroupTimeline = null
  ): InstanceGroupStatus = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateChangeReason != null) __obj.updateDynamic("StateChangeReason")(StateChangeReason.asInstanceOf[js.Any])
    if (Timeline != null) __obj.updateDynamic("Timeline")(Timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupStatus]
  }
}

