package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveFlowOutputRequest extends js.Object {
  
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
  implicit class RemoveFlowOutputRequestOps[Self <: RemoveFlowOutputRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFlowArn(value: string): Self = this.set("FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputArn(value: string): Self = this.set("OutputArn", value.asInstanceOf[js.Any])
  }
}
