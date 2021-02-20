package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowTaskInvocationParameters extends StObject {
  
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
  implicit class MaintenanceWindowTaskInvocationParametersMutableBuilder[Self <: MaintenanceWindowTaskInvocationParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomation(value: MaintenanceWindowAutomationParameters): Self = StObject.set(x, "Automation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomationUndefined: Self = StObject.set(x, "Automation", js.undefined)
    
    @scala.inline
    def setLambda(value: MaintenanceWindowLambdaParameters): Self = StObject.set(x, "Lambda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaUndefined: Self = StObject.set(x, "Lambda", js.undefined)
    
    @scala.inline
    def setRunCommand(value: MaintenanceWindowRunCommandParameters): Self = StObject.set(x, "RunCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunCommandUndefined: Self = StObject.set(x, "RunCommand", js.undefined)
    
    @scala.inline
    def setStepFunctions(value: MaintenanceWindowStepFunctionsParameters): Self = StObject.set(x, "StepFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepFunctionsUndefined: Self = StObject.set(x, "StepFunctions", js.undefined)
  }
}
