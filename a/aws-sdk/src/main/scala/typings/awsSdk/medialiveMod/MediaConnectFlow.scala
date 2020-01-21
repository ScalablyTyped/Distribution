package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaConnectFlow extends js.Object {
  /**
    * The unique ARN of the MediaConnect Flow being used as a source.
    */
  var FlowArn: js.UndefOr[string] = js.native
}

object MediaConnectFlow {
  @scala.inline
  def apply(FlowArn: string = null): MediaConnectFlow = {
    val __obj = js.Dynamic.literal()
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConnectFlow]
  }
}

