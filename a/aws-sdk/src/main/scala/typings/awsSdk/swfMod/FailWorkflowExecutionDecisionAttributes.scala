package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailWorkflowExecutionDecisionAttributes extends StObject {
  
  /**
    *  Details of the failure.
    */
  var details: js.UndefOr[Data] = js.native
  
  /**
    * A descriptive reason for the failure that may help in diagnostics.
    */
  var reason: js.UndefOr[FailureReason] = js.native
}
object FailWorkflowExecutionDecisionAttributes {
  
  @scala.inline
  def apply(): FailWorkflowExecutionDecisionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailWorkflowExecutionDecisionAttributes]
  }
  
  @scala.inline
  implicit class FailWorkflowExecutionDecisionAttributesMutableBuilder[Self <: FailWorkflowExecutionDecisionAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: Data): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setReason(value: FailureReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
