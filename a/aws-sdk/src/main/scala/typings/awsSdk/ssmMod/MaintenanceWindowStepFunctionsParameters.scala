package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowStepFunctionsParameters extends js.Object {
  /**
    * The inputs for the STEP_FUNCTIONS task.
    */
  var Input: js.UndefOr[MaintenanceWindowStepFunctionsInput] = js.native
  /**
    * The name of the STEP_FUNCTIONS task.
    */
  var Name: js.UndefOr[MaintenanceWindowStepFunctionsName] = js.native
}

object MaintenanceWindowStepFunctionsParameters {
  @scala.inline
  def apply(Input: MaintenanceWindowStepFunctionsInput = null, Name: MaintenanceWindowStepFunctionsName = null): MaintenanceWindowStepFunctionsParameters = {
    val __obj = js.Dynamic.literal()
    if (Input != null) __obj.updateDynamic("Input")(Input.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowStepFunctionsParameters]
  }
}

