package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFlowResponse extends js.Object {
  var Flow: js.UndefOr[typings.awsSdk.mediaconnectMod.Flow] = js.native
  var Messages: js.UndefOr[typings.awsSdk.mediaconnectMod.Messages] = js.native
}

object DescribeFlowResponse {
  @scala.inline
  def apply(Flow: Flow = null, Messages: Messages = null): DescribeFlowResponse = {
    val __obj = js.Dynamic.literal()
    if (Flow != null) __obj.updateDynamic("Flow")(Flow.asInstanceOf[js.Any])
    if (Messages != null) __obj.updateDynamic("Messages")(Messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFlowResponse]
  }
}

