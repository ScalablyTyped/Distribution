package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMitigationActionRequest extends js.Object {
  /**
    * The name of the mitigation action that you want to delete.
    */
  var actionName: MitigationActionName = js.native
}

object DeleteMitigationActionRequest {
  @scala.inline
  def apply(actionName: MitigationActionName): DeleteMitigationActionRequest = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMitigationActionRequest]
  }
  @scala.inline
  implicit class DeleteMitigationActionRequestOps[Self <: DeleteMitigationActionRequest] (val x: Self) extends AnyVal {
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
    def setActionName(value: MitigationActionName): Self = this.set("actionName", value.asInstanceOf[js.Any])
  }
  
}

