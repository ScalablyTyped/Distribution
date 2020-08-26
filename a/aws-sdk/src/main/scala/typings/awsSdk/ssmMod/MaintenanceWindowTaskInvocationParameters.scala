package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskInvocationParameters extends js.Object {
  /**
    * The parameters for an AUTOMATION task type.
    */
  var Automation: js.UndefOr[MaintenanceWindowAutomationParameters] = js.native
  /**
    * The parameters for a LAMBDA task type.
    */
  var Lambda: js.UndefOr[MaintenanceWindowLambdaParameters] = js.native
  /**
    * The parameters for a RUN_COMMAND task type.
    */
  var RunCommand: js.UndefOr[MaintenanceWindowRunCommandParameters] = js.native
  /**
    * The parameters for a STEP_FUNCTIONS task type.
    */
  var StepFunctions: js.UndefOr[MaintenanceWindowStepFunctionsParameters] = js.native
}

object MaintenanceWindowTaskInvocationParameters {
  @scala.inline
  def apply(): MaintenanceWindowTaskInvocationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskInvocationParameters]
  }
  @scala.inline
  implicit class MaintenanceWindowTaskInvocationParametersOps[Self <: MaintenanceWindowTaskInvocationParameters] (val x: Self) extends AnyVal {
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
    def setAutomation(value: MaintenanceWindowAutomationParameters): Self = this.set("Automation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomation: Self = this.set("Automation", js.undefined)
    @scala.inline
    def setLambda(value: MaintenanceWindowLambdaParameters): Self = this.set("Lambda", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambda: Self = this.set("Lambda", js.undefined)
    @scala.inline
    def setRunCommand(value: MaintenanceWindowRunCommandParameters): Self = this.set("RunCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunCommand: Self = this.set("RunCommand", js.undefined)
    @scala.inline
    def setStepFunctions(value: MaintenanceWindowStepFunctionsParameters): Self = this.set("StepFunctions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepFunctions: Self = this.set("StepFunctions", js.undefined)
  }
  
}

