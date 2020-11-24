package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): MaintenanceWindowStepFunctionsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowStepFunctionsParameters]
  }
  
  @scala.inline
  implicit class MaintenanceWindowStepFunctionsParametersOps[Self <: MaintenanceWindowStepFunctionsParameters] (val x: Self) extends AnyVal {
    
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
    def setInput(value: MaintenanceWindowStepFunctionsInput): Self = this.set("Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("Input", js.undefined)
    
    @scala.inline
    def setName(value: MaintenanceWindowStepFunctionsName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
