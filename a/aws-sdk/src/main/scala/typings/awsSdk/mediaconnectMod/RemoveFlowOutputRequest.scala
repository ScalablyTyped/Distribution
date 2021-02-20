package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveFlowOutputRequest extends StObject {
  
  /**
    * The flow that you want to remove an output from.
    */
  var FlowArn: string = js.native
  
  /**
    * The ARN of the output that you want to remove.
    */
  var OutputArn: string = js.native
}
object RemoveFlowOutputRequest {
  
  @scala.inline
  def apply(FlowArn: string, OutputArn: string): RemoveFlowOutputRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], OutputArn = OutputArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveFlowOutputRequest]
  }
  
  @scala.inline
  implicit class RemoveFlowOutputRequestMutableBuilder[Self <: RemoveFlowOutputRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputArn(value: string): Self = StObject.set(x, "OutputArn", value.asInstanceOf[js.Any])
  }
}
