package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAutomationExecutionResult extends js.Object {
  /**
    * Detailed information about the current state of an automation execution.
    */
  var AutomationExecution: js.UndefOr[typings.awsSdk.ssmMod.AutomationExecution] = js.native
}

object GetAutomationExecutionResult {
  @scala.inline
  def apply(): GetAutomationExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAutomationExecutionResult]
  }
  @scala.inline
  implicit class GetAutomationExecutionResultOps[Self <: GetAutomationExecutionResult] (val x: Self) extends AnyVal {
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
    def setAutomationExecution(value: AutomationExecution): Self = this.set("AutomationExecution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomationExecution: Self = this.set("AutomationExecution", js.undefined)
  }
  
}

