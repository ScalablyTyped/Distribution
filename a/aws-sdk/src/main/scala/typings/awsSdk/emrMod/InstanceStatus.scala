package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceStatus extends js.Object {
  /**
    * The current state of the instance.
    */
  var State: js.UndefOr[InstanceState] = js.native
  /**
    * The details of the status change reason for the instance.
    */
  var StateChangeReason: js.UndefOr[InstanceStateChangeReason] = js.native
  /**
    * The timeline of the instance status over time.
    */
  var Timeline: js.UndefOr[InstanceTimeline] = js.native
}

object InstanceStatus {
  @scala.inline
  def apply(
    State: InstanceState = null,
    StateChangeReason: InstanceStateChangeReason = null,
    Timeline: InstanceTimeline = null
  ): InstanceStatus = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateChangeReason != null) __obj.updateDynamic("StateChangeReason")(StateChangeReason.asInstanceOf[js.Any])
    if (Timeline != null) __obj.updateDynamic("Timeline")(Timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceStatus]
  }
}

