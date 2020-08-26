package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFlowDefinitionRequest extends js.Object {
  /**
    * The name of the flow definition you are deleting.
    */
  var FlowDefinitionName: typings.awsSdk.sagemakerMod.FlowDefinitionName = js.native
}

object DeleteFlowDefinitionRequest {
  @scala.inline
  def apply(FlowDefinitionName: FlowDefinitionName): DeleteFlowDefinitionRequest = {
    val __obj = js.Dynamic.literal(FlowDefinitionName = FlowDefinitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFlowDefinitionRequest]
  }
  @scala.inline
  implicit class DeleteFlowDefinitionRequestOps[Self <: DeleteFlowDefinitionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFlowDefinitionName(value: FlowDefinitionName): Self = this.set("FlowDefinitionName", value.asInstanceOf[js.Any])
  }
  
}

