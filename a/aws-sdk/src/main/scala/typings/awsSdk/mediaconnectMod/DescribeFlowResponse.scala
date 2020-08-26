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
  def apply(): DescribeFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFlowResponse]
  }
  @scala.inline
  implicit class DescribeFlowResponseOps[Self <: DescribeFlowResponse] (val x: Self) extends AnyVal {
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
    def setFlow(value: Flow): Self = this.set("Flow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlow: Self = this.set("Flow", js.undefined)
    @scala.inline
    def setMessages(value: Messages): Self = this.set("Messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("Messages", js.undefined)
  }
  
}

