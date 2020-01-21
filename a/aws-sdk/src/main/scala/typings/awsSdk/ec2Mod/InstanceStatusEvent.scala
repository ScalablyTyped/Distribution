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
  def apply(
    Code: EventCode = null,
    Description: String = null,
    InstanceEventId: InstanceEventId = null,
    NotAfter: DateTime = null,
    NotBefore: DateTime = null,
    NotBeforeDeadline: DateTime = null
  ): InstanceStatusEvent = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (InstanceEventId != null) __obj.updateDynamic("InstanceEventId")(InstanceEventId.asInstanceOf[js.Any])
    if (NotAfter != null) __obj.updateDynamic("NotAfter")(NotAfter.asInstanceOf[js.Any])
    if (NotBefore != null) __obj.updateDynamic("NotBefore")(NotBefore.asInstanceOf[js.Any])
    if (NotBeforeDeadline != null) __obj.updateDynamic("NotBeforeDeadline")(NotBeforeDeadline.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceStatusEvent]
  }
}

