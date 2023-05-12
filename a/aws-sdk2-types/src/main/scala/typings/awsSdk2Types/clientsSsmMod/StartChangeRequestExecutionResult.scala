package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartChangeRequestExecutionResult extends StObject {
  
  /**
    * The unique ID of a runbook workflow operation. (A runbook workflow is a type of Automation operation.) 
    */
  var AutomationExecutionId: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.AutomationExecutionId] = js.undefined
}
object StartChangeRequestExecutionResult {
  
  inline def apply(): StartChangeRequestExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartChangeRequestExecutionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartChangeRequestExecutionResult] (val x: Self) extends AnyVal {
    
    inline def setAutomationExecutionId(value: AutomationExecutionId): Self = StObject.set(x, "AutomationExecutionId", value.asInstanceOf[js.Any])
    
    inline def setAutomationExecutionIdUndefined: Self = StObject.set(x, "AutomationExecutionId", js.undefined)
  }
}
