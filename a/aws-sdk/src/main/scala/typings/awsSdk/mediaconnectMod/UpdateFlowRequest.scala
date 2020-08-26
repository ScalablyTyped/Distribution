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
  def apply(FlowArn: string): UpdateFlowRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowRequest]
  }
  @scala.inline
  implicit class UpdateFlowRequestOps[Self <: UpdateFlowRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFlowArn(value: string): Self = this.set("FlowArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceFailoverConfig(value: UpdateFailoverConfig): Self = this.set("SourceFailoverConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceFailoverConfig: Self = this.set("SourceFailoverConfig", js.undefined)
  }
  
}

