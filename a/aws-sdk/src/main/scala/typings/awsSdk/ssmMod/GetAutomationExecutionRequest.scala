package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAutomationExecutionRequest extends js.Object {
  /**
    * The unique identifier for an existing automation execution to examine. The execution ID is returned by StartAutomationExecution when the execution of an Automation document is initiated.
    */
  var AutomationExecutionId: typings.awsSdk.ssmMod.AutomationExecutionId = js.native
}

object GetAutomationExecutionRequest {
  @scala.inline
  def apply(AutomationExecutionId: AutomationExecutionId): GetAutomationExecutionRequest = {
    val __obj = js.Dynamic.literal(AutomationExecutionId = AutomationExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAutomationExecutionRequest]
  }
  @scala.inline
  implicit class GetAutomationExecutionRequestOps[Self <: GetAutomationExecutionRequest] (val x: Self) extends AnyVal {
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
    def setAutomationExecutionId(value: AutomationExecutionId): Self = this.set("AutomationExecutionId", value.asInstanceOf[js.Any])
  }
  
}

