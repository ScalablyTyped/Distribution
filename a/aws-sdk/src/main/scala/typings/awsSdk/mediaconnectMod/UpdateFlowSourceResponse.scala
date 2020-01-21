package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFlowSourceResponse extends js.Object {
  /**
    * The ARN of the flow that you want to update.
    */
  var FlowArn: js.UndefOr[string] = js.native
  /**
    * The settings for the source of the flow.
    */
  var Source: js.UndefOr[typings.awsSdk.mediaconnectMod.Source] = js.native
}

object UpdateFlowSourceResponse {
  @scala.inline
  def apply(FlowArn: string = null, Source: Source = null): UpdateFlowSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn.asInstanceOf[js.Any])
    if (Source != null) __obj.updateDynamic("Source")(Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowSourceResponse]
  }
}

