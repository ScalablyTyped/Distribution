package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFlowRequest extends js.Object {
  /**
    * The flow that you want to update.
    */
  var FlowArn: string = js.native
  var SourceFailoverConfig: js.UndefOr[UpdateFailoverConfig] = js.native
}

object UpdateFlowRequest {
  @scala.inline
  def apply(FlowArn: string, SourceFailoverConfig: UpdateFailoverConfig = null): UpdateFlowRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any])
    if (SourceFailoverConfig != null) __obj.updateDynamic("SourceFailoverConfig")(SourceFailoverConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowRequest]
  }
}

