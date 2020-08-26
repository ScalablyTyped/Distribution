package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartFlowResponse extends js.Object {
  /**
    * The ARN of the flow that you started.
    */
  var FlowArn: js.UndefOr[string] = js.native
  /**
    * The status of the flow when the StartFlow process begins.
    */
  var Status: js.UndefOr[typings.awsSdk.mediaconnectMod.Status] = js.native
}

object StartFlowResponse {
  @scala.inline
  def apply(): StartFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartFlowResponse]
  }
  @scala.inline
  implicit class StartFlowResponseOps[Self <: StartFlowResponse] (val x: Self) extends AnyVal {
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
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

