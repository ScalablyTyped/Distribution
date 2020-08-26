package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFlowResponse extends js.Object {
  var Flow: js.UndefOr[typings.awsSdk.mediaconnectMod.Flow] = js.native
}

object CreateFlowResponse {
  @scala.inline
  def apply(): CreateFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFlowResponse]
  }
  @scala.inline
  implicit class CreateFlowResponseOps[Self <: CreateFlowResponse] (val x: Self) extends AnyVal {
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
  }
  
}

