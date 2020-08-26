package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepTimeline extends js.Object {
  /**
    * The date and time when the cluster step was created.
    */
  var CreationDateTime: js.UndefOr[Date] = js.native
  /**
    * The date and time when the cluster step execution completed or failed.
    */
  var EndDateTime: js.UndefOr[Date] = js.native
  /**
    * The date and time when the cluster step execution started.
    */
  var StartDateTime: js.UndefOr[Date] = js.native
}

object StepTimeline {
  @scala.inline
  def apply(): StepTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepTimeline]
  }
  @scala.inline
  implicit class StepTimelineOps[Self <: StepTimeline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreationDateTime(value: Date): Self = this.set("CreationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDateTime: Self = this.set("CreationDateTime", js.undefined)
    @scala.inline
    def setEndDateTime(value: Date): Self = this.set("EndDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDateTime: Self = this.set("EndDateTime", js.undefined)
    @scala.inline
    def setStartDateTime(value: Date): Self = this.set("StartDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDateTime: Self = this.set("StartDateTime", js.undefined)
  }
  
}

