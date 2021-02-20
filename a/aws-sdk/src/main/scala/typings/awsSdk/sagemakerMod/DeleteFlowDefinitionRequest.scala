package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFlowDefinitionRequest extends StObject {
  
  /**
    * The name of the flow definition you are deleting.
    */
  var FlowDefinitionName: typings.awsSdk.sagemakerMod.FlowDefinitionName = js.native
}
object DeleteFlowDefinitionRequest {
  
  @scala.inline
  def apply(FlowDefinitionName: FlowDefinitionName): DeleteFlowDefinitionRequest = {
    val __obj = js.Dynamic.literal(FlowDefinitionName = FlowDefinitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFlowDefinitionRequest]
  }
  
  @scala.inline
  implicit class DeleteFlowDefinitionRequestMutableBuilder[Self <: DeleteFlowDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowDefinitionName(value: FlowDefinitionName): Self = StObject.set(x, "FlowDefinitionName", value.asInstanceOf[js.Any])
  }
}
