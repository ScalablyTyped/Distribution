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
  def apply(): FeatureActivations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureActivations]
  }
  @scala.inline
  implicit class FeatureActivationsOps[Self <: FeatureActivations] (val x: Self) extends AnyVal {
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
    def setInputPrepareScheduleActions(value: FeatureActivationsInputPrepareScheduleActions): Self = this.set("InputPrepareScheduleActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputPrepareScheduleActions: Self = this.set("InputPrepareScheduleActions", js.undefined)
  }
  
}

