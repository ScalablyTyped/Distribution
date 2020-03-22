package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveFlowSourceResponse extends js.Object {
  /**
    * The ARN of the flow that is associated with the source you removed.
    */
  var FlowArn: js.UndefOr[string] = js.native
  /**
    * The ARN of the source that was removed.
    */
  var SourceArn: js.UndefOr[string] = js.native
}

object RemoveFlowSourceResponse {
  @scala.inline
  def apply(FlowArn: string = null, SourceArn: string = null): RemoveFlowSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn.asInstanceOf[js.Any])
    if (SourceArn != null) __obj.updateDynamic("SourceArn")(SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveFlowSourceResponse]
  }
}

