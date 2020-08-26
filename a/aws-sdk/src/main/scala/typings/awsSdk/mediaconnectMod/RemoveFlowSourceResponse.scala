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
  def apply(): RemoveFlowSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveFlowSourceResponse]
  }
  @scala.inline
  implicit class RemoveFlowSourceResponseOps[Self <: RemoveFlowSourceResponse] (val x: Self) extends AnyVal {
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
    def deleteFlowArn: Self = this.set("FlowArn", js.undefined)
    @scala.inline
    def setSourceArn(value: string): Self = this.set("SourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceArn: Self = this.set("SourceArn", js.undefined)
  }
  
}

