package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelWorkflowExecutionDecisionAttributes extends StObject {
  
  /**
    *  Details of the cancellation.
    */
  var details: js.UndefOr[Data] = js.undefined
}
object CancelWorkflowExecutionDecisionAttributes {
  
  inline def apply(): CancelWorkflowExecutionDecisionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelWorkflowExecutionDecisionAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelWorkflowExecutionDecisionAttributes] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: Data): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
  }
}
