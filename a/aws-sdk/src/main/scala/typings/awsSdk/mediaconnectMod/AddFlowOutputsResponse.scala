package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddFlowOutputsResponse extends js.Object {
  /**
    * The ARN of the flow that these outputs were added to.
    */
  var FlowArn: js.UndefOr[string] = js.native
  /**
    * The details of the newly added outputs.
    */
  var Outputs: js.UndefOr[listOfOutput] = js.native
}

object AddFlowOutputsResponse {
  @scala.inline
  def apply(): AddFlowOutputsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddFlowOutputsResponse]
  }
  @scala.inline
  implicit class AddFlowOutputsResponseOps[Self <: AddFlowOutputsResponse] (val x: Self) extends AnyVal {
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
    def setOutputsVarargs(value: Output*): Self = this.set("Outputs", js.Array(value :_*))
    @scala.inline
    def setOutputs(value: listOfOutput): Self = this.set("Outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputs: Self = this.set("Outputs", js.undefined)
  }
  
}

