package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveFlowOutputResponse extends js.Object {
  
  /**
    * The ARN of the flow that is associated with the output you removed.
    */
  var FlowArn: js.UndefOr[string] = js.native
  
  /**
    * The ARN of the output that was removed.
    */
  var OutputArn: js.UndefOr[string] = js.native
}
object RemoveFlowOutputResponse {
  
  @scala.inline
  def apply(): RemoveFlowOutputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveFlowOutputResponse]
  }
  
  @scala.inline
  implicit class RemoveFlowOutputResponseOps[Self <: RemoveFlowOutputResponse] (val x: Self) extends AnyVal {
    
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
    def setOutputArn(value: string): Self = this.set("OutputArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputArn: Self = this.set("OutputArn", js.undefined)
  }
}
