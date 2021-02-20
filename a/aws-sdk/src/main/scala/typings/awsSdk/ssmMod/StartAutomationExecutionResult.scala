package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartAutomationExecutionResult extends StObject {
  
  /**
    * The unique ID of a newly scheduled automation execution.
    */
  var AutomationExecutionId: js.UndefOr[typings.awsSdk.ssmMod.AutomationExecutionId] = js.native
}
object StartAutomationExecutionResult {
  
  @scala.inline
  def apply(): StartAutomationExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartAutomationExecutionResult]
  }
  
  @scala.inline
  implicit class StartAutomationExecutionResultMutableBuilder[Self <: StartAutomationExecutionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomationExecutionId(value: AutomationExecutionId): Self = StObject.set(x, "AutomationExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomationExecutionIdUndefined: Self = StObject.set(x, "AutomationExecutionId", js.undefined)
  }
}
