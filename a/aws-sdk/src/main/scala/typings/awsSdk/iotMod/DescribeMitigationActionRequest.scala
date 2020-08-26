package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMitigationActionRequest extends js.Object {
  /**
    * The friendly name that uniquely identifies the mitigation action.
    */
  var actionName: MitigationActionName = js.native
}

object DescribeMitigationActionRequest {
  @scala.inline
  def apply(actionName: MitigationActionName): DescribeMitigationActionRequest = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMitigationActionRequest]
  }
  @scala.inline
  implicit class DescribeMitigationActionRequestOps[Self <: DescribeMitigationActionRequest] (val x: Self) extends AnyVal {
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

