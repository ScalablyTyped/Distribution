package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFlowOutputResponse extends js.Object {
  
  /**
    * The ARN of the flow that is associated with the updated output.
    */
  var FlowArn: js.UndefOr[string] = js.native
  
  /**
    * The new settings of the output that you updated.
    */
  var Output: js.UndefOr[typings.awsSdk.mediaconnectMod.Output] = js.native
}
object UpdateFlowOutputResponse {
  
  @scala.inline
  def apply(): UpdateFlowOutputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFlowOutputResponse]
  }
  
  @scala.inline
  implicit class UpdateFlowOutputResponseOps[Self <: UpdateFlowOutputResponse] (val x: Self) extends AnyVal {
    
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
    def deleteFlowArn: Self = this.set("FlowArn", js.undefined)
    
    @scala.inline
    def setOutput(value: Output): Self = this.set("Output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("Output", js.undefined)
  }
}
