package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailWorkflowExecutionDecisionAttributes extends StObject {
  
  /**
    *  Details of the failure.
    */
  var details: js.UndefOr[Data] = js.undefined
  
  /**
    * A descriptive reason for the failure that may help in diagnostics.
    */
  var reason: js.UndefOr[FailureReason] = js.undefined
}
object FailWorkflowExecutionDecisionAttributes {
  
  inline def apply(): FailWorkflowExecutionDecisionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailWorkflowExecutionDecisionAttributes]
  }
  
  extension [Self <: FailWorkflowExecutionDecisionAttributes](x: Self) {
    
    inline def setDetails(value: Data): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setReason(value: FailureReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
