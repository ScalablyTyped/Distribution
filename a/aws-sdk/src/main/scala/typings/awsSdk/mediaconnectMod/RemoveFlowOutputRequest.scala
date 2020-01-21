package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveFlowOutputRequest extends js.Object {
  /**
    * The flow that you want to remove an output from.
    */
  var FlowArn: string = js.native
  /**
    * The ARN of the output that you want to remove.
    */
  var OutputArn: string = js.native
}

object RemoveFlowOutputRequest {
  @scala.inline
  def apply(FlowArn: string, OutputArn: string): RemoveFlowOutputRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], OutputArn = OutputArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveFlowOutputRequest]
  }
}

