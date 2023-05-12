package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartAutomationExecutionResult extends StObject {
  
  /**
    * The unique ID of a newly scheduled automation execution.
    */
  var AutomationExecutionId: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.AutomationExecutionId] = js.undefined
}
object StartAutomationExecutionResult {
  
  inline def apply(): StartAutomationExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartAutomationExecutionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartAutomationExecutionResult] (val x: Self) extends AnyVal {
    
    inline def setAutomationExecutionId(value: AutomationExecutionId): Self = StObject.set(x, "AutomationExecutionId", value.asInstanceOf[js.Any])
    
    inline def setAutomationExecutionIdUndefined: Self = StObject.set(x, "AutomationExecutionId", js.undefined)
  }
}
