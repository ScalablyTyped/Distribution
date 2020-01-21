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
  def apply(FlowArn: string = null, Status: Status = null): StartFlowResponse = {
    val __obj = js.Dynamic.literal()
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFlowResponse]
  }
}

