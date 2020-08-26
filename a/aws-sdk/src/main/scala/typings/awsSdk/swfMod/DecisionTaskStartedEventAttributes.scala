package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecisionTaskStartedEventAttributes extends js.Object {
  /**
    * Identity of the decider making the request. This enables diagnostic tracing when problems arise. The form of this identity is user defined.
    */
  var identity: js.UndefOr[Identity] = js.native
  /**
    * The ID of the DecisionTaskScheduled event that was recorded when this decision task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId = js.native
}

object DecisionTaskStartedEventAttributes {
  @scala.inline
  def apply(scheduledEventId: EventId): DecisionTaskStartedEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecisionTaskStartedEventAttributes]
  }
  @scala.inline
  implicit class DecisionTaskStartedEventAttributesOps[Self <: DecisionTaskStartedEventAttributes] (val x: Self) extends AnyVal {
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
    def setScheduledEventId(value: EventId): Self = this.set("scheduledEventId", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentity(value: Identity): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentity: Self = this.set("identity", js.undefined)
  }
  
}

