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
}

