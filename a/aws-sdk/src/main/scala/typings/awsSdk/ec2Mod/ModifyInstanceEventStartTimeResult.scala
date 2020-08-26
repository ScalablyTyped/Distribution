package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstanceEventStartTimeResult extends js.Object {
  var Event: js.UndefOr[InstanceStatusEvent] = js.native
}

object ModifyInstanceEventStartTimeResult {
  @scala.inline
  def apply(): ModifyInstanceEventStartTimeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyInstanceEventStartTimeResult]
  }
  @scala.inline
  implicit class ModifyInstanceEventStartTimeResultOps[Self <: ModifyInstanceEventStartTimeResult] (val x: Self) extends AnyVal {
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
    def setEvent(value: InstanceStatusEvent): Self = this.set("Event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("Event", js.undefined)
  }
  
}

