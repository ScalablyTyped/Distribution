package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopAutomationExecutionRequest extends StObject {
  
  /**
    * The execution ID of the Automation to stop.
    */
  var AutomationExecutionId: typings.awsSdk2Types.clientsSsmMod.AutomationExecutionId
  
  /**
    * The stop request type. Valid types include the following: Cancel and Complete. The default type is Cancel.
    */
  var Type: js.UndefOr[StopType] = js.undefined
}
object StopAutomationExecutionRequest {
  
  inline def apply(AutomationExecutionId: AutomationExecutionId): StopAutomationExecutionRequest = {
    val __obj = js.Dynamic.literal(AutomationExecutionId = AutomationExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopAutomationExecutionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopAutomationExecutionRequest] (val x: Self) extends AnyVal {
    
    inline def setAutomationExecutionId(value: AutomationExecutionId): Self = StObject.set(x, "AutomationExecutionId", value.asInstanceOf[js.Any])
    
    inline def setType(value: StopType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
