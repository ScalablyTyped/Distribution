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
  def apply(
    triggerEvents: TriggerEventTypeList = null,
    triggerName: TriggerName = null,
    triggerTargetArn: TriggerTargetArn = null
  ): TriggerConfig = {
    val __obj = js.Dynamic.literal()
    if (triggerEvents != null) __obj.updateDynamic("triggerEvents")(triggerEvents.asInstanceOf[js.Any])
    if (triggerName != null) __obj.updateDynamic("triggerName")(triggerName.asInstanceOf[js.Any])
    if (triggerTargetArn != null) __obj.updateDynamic("triggerTargetArn")(triggerTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerConfig]
  }
}

