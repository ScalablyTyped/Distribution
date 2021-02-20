package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddFlowOutputsRequest extends StObject {
  
  /**
    * The flow that you want to add outputs to.
    */
  var FlowArn: string = js.native
  
  /**
    * A list of outputs that you want to add.
    */
  var Outputs: listOfAddOutputRequest = js.native
}
object AddFlowOutputsRequest {
  
  @scala.inline
  def apply(FlowArn: string, Outputs: listOfAddOutputRequest): AddFlowOutputsRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], Outputs = Outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFlowOutputsRequest]
  }
  
  @scala.inline
  implicit class AddFlowOutputsRequestMutableBuilder[Self <: AddFlowOutputsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputs(value: listOfAddOutputRequest): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsVarargs(value: AddOutputRequest*): Self = StObject.set(x, "Outputs", js.Array(value :_*))
  }
}
