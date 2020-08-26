package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddFlowOutputsRequest extends js.Object {
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
  implicit class AddFlowOutputsRequestOps[Self <: AddFlowOutputsRequest] (val x: Self) extends AnyVal {
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
    def setOutputsVarargs(value: AddOutputRequest*): Self = this.set("Outputs", js.Array(value :_*))
    @scala.inline
    def setOutputs(value: listOfAddOutputRequest): Self = this.set("Outputs", value.asInstanceOf[js.Any])
  }
  
}

