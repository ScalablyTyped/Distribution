package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerConfig extends js.Object {
  /**
    * The event type or types for which notifications are triggered.
    */
  var triggerEvents: js.UndefOr[TriggerEventTypeList] = js.native
  /**
    * The name of the notification trigger.
    */
  var triggerName: js.UndefOr[TriggerName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service topic through which notifications about deployment or instance events are sent.
    */
  var triggerTargetArn: js.UndefOr[TriggerTargetArn] = js.native
}

object TriggerConfig {
  @scala.inline
  def apply(): TriggerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerConfig]
  }
  @scala.inline
  implicit class TriggerConfigOps[Self <: TriggerConfig] (val x: Self) extends AnyVal {
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
    def setTriggerEventsVarargs(value: TriggerEventType*): Self = this.set("triggerEvents", js.Array(value :_*))
    @scala.inline
    def setTriggerEvents(value: TriggerEventTypeList): Self = this.set("triggerEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerEvents: Self = this.set("triggerEvents", js.undefined)
    @scala.inline
    def setTriggerName(value: TriggerName): Self = this.set("triggerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerName: Self = this.set("triggerName", js.undefined)
    @scala.inline
    def setTriggerTargetArn(value: TriggerTargetArn): Self = this.set("triggerTargetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerTargetArn: Self = this.set("triggerTargetArn", js.undefined)
  }
  
}

