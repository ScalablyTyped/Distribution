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
  def apply(FlowArn: string = null, Outputs: listOfOutput = null): AddFlowOutputsResponse = {
    val __obj = js.Dynamic.literal()
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn.asInstanceOf[js.Any])
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFlowOutputsResponse]
  }
}

