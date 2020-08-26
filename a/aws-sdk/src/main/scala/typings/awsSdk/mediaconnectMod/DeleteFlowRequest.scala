package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFlowRequest extends js.Object {
  /**
    * The ARN of the flow that you want to delete.
    */
  var FlowArn: string = js.native
}

object DeleteFlowRequest {
  @scala.inline
  def apply(FlowArn: string): DeleteFlowRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFlowRequest]
  }
  @scala.inline
  implicit class DeleteFlowRequestOps[Self <: DeleteFlowRequest] (val x: Self) extends AnyVal {
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
  }
  
}

