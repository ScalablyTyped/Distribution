package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceStatusEvent extends js.Object {
  /**
    * The event code.
    */
  var Code: js.UndefOr[EventCode] = js.native
  /**
    * A description of the event. After a scheduled event is completed, it can still be described for up to a week. If the event has been completed, this description starts with the following text: [Completed].
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the event.
    */
  var InstanceEventId: js.UndefOr[typings.awsSdk.ec2Mod.InstanceEventId] = js.native
  /**
    * The latest scheduled end time for the event.
    */
  var NotAfter: js.UndefOr[DateTime] = js.native
  /**
    * The earliest scheduled start time for the event.
    */
  var NotBefore: js.UndefOr[DateTime] = js.native
  /**
    * The deadline for starting the event.
    */
  var NotBeforeDeadline: js.UndefOr[DateTime] = js.native
}

object InstanceStatusEvent {
  @scala.inline
  def apply(): InstanceStatusEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStatusEvent]
  }
  @scala.inline
  implicit class InstanceStatusEventOps[Self <: InstanceStatusEvent] (val x: Self) extends AnyVal {
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
    def setCode(value: EventCode): Self = this.set("Code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setInstanceEventId(value: InstanceEventId): Self = this.set("InstanceEventId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceEventId: Self = this.set("InstanceEventId", js.undefined)
    @scala.inline
    def setNotAfter(value: DateTime): Self = this.set("NotAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotAfter: Self = this.set("NotAfter", js.undefined)
    @scala.inline
    def setNotBefore(value: DateTime): Self = this.set("NotBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotBefore: Self = this.set("NotBefore", js.undefined)
    @scala.inline
    def setNotBeforeDeadline(value: DateTime): Self = this.set("NotBeforeDeadline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotBeforeDeadline: Self = this.set("NotBeforeDeadline", js.undefined)
  }
  
}

