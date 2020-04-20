package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveFlowSourceRequest extends js.Object {
  /**
    * The flow that you want to remove a source from.
    */
  var FlowArn: string = js.native
  /**
    * The ARN of the source that you want to remove.
    */
  var SourceArn: string = js.native
}

object RemoveFlowSourceRequest {
  @scala.inline
  def apply(FlowArn: string, SourceArn: string): RemoveFlowSourceRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveFlowSourceRequest]
  }
}

