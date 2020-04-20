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
}

