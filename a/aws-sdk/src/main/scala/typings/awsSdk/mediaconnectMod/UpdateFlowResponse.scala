package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFlowResponse extends js.Object {
  var Flow: js.UndefOr[typings.awsSdk.mediaconnectMod.Flow] = js.native
}

object UpdateFlowResponse {
  @scala.inline
  def apply(Flow: Flow = null): UpdateFlowResponse = {
    val __obj = js.Dynamic.literal()
    if (Flow != null) __obj.updateDynamic("Flow")(Flow.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowResponse]
  }
}

