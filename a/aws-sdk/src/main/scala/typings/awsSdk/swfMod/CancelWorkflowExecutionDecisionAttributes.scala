package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelWorkflowExecutionDecisionAttributes extends StObject {
  
  /**
    *  Details of the cancellation.
    */
  var details: js.UndefOr[Data] = js.native
}
object CancelWorkflowExecutionDecisionAttributes {
  
  @scala.inline
  def apply(): CancelWorkflowExecutionDecisionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelWorkflowExecutionDecisionAttributes]
  }
  
  @scala.inline
  implicit class CancelWorkflowExecutionDecisionAttributesMutableBuilder[Self <: CancelWorkflowExecutionDecisionAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: Data): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
  }
}
