package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureActivations extends js.Object {
  /**
    * Enables the Input Prepare feature. You can create Input Prepare actions in the schedule only if this feature is enabled.
  If you disable the feature on an existing schedule, make sure that you first delete all input prepare actions from the schedule.
    */
  var InputPrepareScheduleActions: js.UndefOr[FeatureActivationsInputPrepareScheduleActions] = js.native
}

object FeatureActivations {
  @scala.inline
  def apply(InputPrepareScheduleActions: FeatureActivationsInputPrepareScheduleActions = null): FeatureActivations = {
    val __obj = js.Dynamic.literal()
    if (InputPrepareScheduleActions != null) __obj.updateDynamic("InputPrepareScheduleActions")(InputPrepareScheduleActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureActivations]
  }
}

