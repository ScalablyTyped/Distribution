package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartChangeRequestExecutionResult extends StObject {
  
  /**
    * The unique ID of a runbook workflow operation. (A runbook workflow is a type of Automation operation.) 
    */
  var AutomationExecutionId: js.UndefOr[typings.awsSdk.ssmMod.AutomationExecutionId] = js.undefined
}
object StartChangeRequestExecutionResult {
  
  inline def apply(): StartChangeRequestExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartChangeRequestExecutionResult]
  }
  
  extension [Self <: StartChangeRequestExecutionResult](x: Self) {
    
    inline def setAutomationExecutionId(value: AutomationExecutionId): Self = StObject.set(x, "AutomationExecutionId", value.asInstanceOf[js.Any])
    
    inline def setAutomationExecutionIdUndefined: Self = StObject.set(x, "AutomationExecutionId", js.undefined)
  }
}
