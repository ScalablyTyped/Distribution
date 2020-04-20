package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFlowRequest extends js.Object {
  /**
    * The ARN of the flow that you want to describe.
    */
  var FlowArn: string = js.native
}

object DescribeFlowRequest {
  @scala.inline
  def apply(FlowArn: string): DescribeFlowRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFlowRequest]
  }
}

