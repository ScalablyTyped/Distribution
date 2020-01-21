package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFlowOutputResponse extends js.Object {
  /**
    * The ARN of the flow that is associated with the updated output.
    */
  var FlowArn: js.UndefOr[string] = js.native
  var Output: js.UndefOr[typings.awsSdk.mediaconnectMod.Output] = js.native
}

object UpdateFlowOutputResponse {
  @scala.inline
  def apply(FlowArn: string = null, Output: Output = null): UpdateFlowOutputResponse = {
    val __obj = js.Dynamic.literal()
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn.asInstanceOf[js.Any])
    if (Output != null) __obj.updateDynamic("Output")(Output.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowOutputResponse]
  }
}

