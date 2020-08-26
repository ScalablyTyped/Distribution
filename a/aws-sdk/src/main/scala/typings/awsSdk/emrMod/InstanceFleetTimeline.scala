package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceFleetTimeline extends js.Object {
  /**
    * The time and date the instance fleet was created.
    */
  var CreationDateTime: js.UndefOr[Date] = js.native
  /**
    * The time and date the instance fleet terminated.
    */
  var EndDateTime: js.UndefOr[Date] = js.native
  /**
    * The time and date the instance fleet was ready to run jobs.
    */
  var ReadyDateTime: js.UndefOr[Date] = js.native
}

object InstanceFleetTimeline {
  @scala.inline
  def apply(): InstanceFleetTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFleetTimeline]
  }
  @scala.inline
  implicit class InstanceFleetTimelineOps[Self <: InstanceFleetTimeline] (val x: Self) extends AnyVal {
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
    def setReadyDateTime(value: Date): Self = this.set("ReadyDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadyDateTime: Self = this.set("ReadyDateTime", js.undefined)
  }
  
}

