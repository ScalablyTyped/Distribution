package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteWorkflowExecutionDecisionAttributes extends StObject {
  
  /**
    * The result of the workflow execution. The form of the result is implementation defined.
    */
  var result: js.UndefOr[Data] = js.undefined
}
object CompleteWorkflowExecutionDecisionAttributes {
  
  inline def apply(): CompleteWorkflowExecutionDecisionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompleteWorkflowExecutionDecisionAttributes]
  }
  
  extension [Self <: CompleteWorkflowExecutionDecisionAttributes](x: Self) {
    
    inline def setResult(value: Data): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
