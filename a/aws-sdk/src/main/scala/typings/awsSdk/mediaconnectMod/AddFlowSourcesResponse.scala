package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddFlowSourcesResponse extends js.Object {
  /**
    * The ARN of the flow that these sources were added to.
    */
  var FlowArn: js.UndefOr[string] = js.native
  /**
    * The details of the newly added sources.
    */
  var Sources: js.UndefOr[listOfSource] = js.native
}

object AddFlowSourcesResponse {
  @scala.inline
  def apply(): AddFlowSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddFlowSourcesResponse]
  }
  @scala.inline
  implicit class AddFlowSourcesResponseOps[Self <: AddFlowSourcesResponse] (val x: Self) extends AnyVal {
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
    def setSourcesVarargs(value: Source*): Self = this.set("Sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: listOfSource): Self = this.set("Sources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSources: Self = this.set("Sources", js.undefined)
  }
  
}

