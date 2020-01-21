package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopAutomationExecutionRequest extends js.Object {
  /**
    * The execution ID of the Automation to stop.
    */
  var AutomationExecutionId: typings.awsSdk.ssmMod.AutomationExecutionId = js.native
  /**
    * The stop request type. Valid types include the following: Cancel and Complete. The default type is Cancel.
    */
  var Type: js.UndefOr[StopType] = js.native
}

object StopAutomationExecutionRequest {
  @scala.inline
  def apply(AutomationExecutionId: AutomationExecutionId, Type: StopType = null): StopAutomationExecutionRequest = {
    val __obj = js.Dynamic.literal(AutomationExecutionId = AutomationExecutionId.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopAutomationExecutionRequest]
  }
}

