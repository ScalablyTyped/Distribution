package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowStepFunctionsParameters extends StObject {
  
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
  implicit class MaintenanceWindowStepFunctionsParametersMutableBuilder[Self <: MaintenanceWindowStepFunctionsParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: MaintenanceWindowStepFunctionsInput): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
    
    @scala.inline
    def setName(value: MaintenanceWindowStepFunctionsName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
