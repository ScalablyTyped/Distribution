package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteWorkforceRequest extends js.Object {
  /**
    * The name of the workforce.
    */
  var WorkforceName: typings.awsSdk.sagemakerMod.WorkforceName = js.native
}

object DeleteWorkforceRequest {
  @scala.inline
  def apply(WorkforceName: WorkforceName): DeleteWorkforceRequest = {
    val __obj = js.Dynamic.literal(WorkforceName = WorkforceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkforceRequest]
  }
  @scala.inline
  implicit class DeleteWorkforceRequestOps[Self <: DeleteWorkforceRequest] (val x: Self) extends AnyVal {
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
    def setWorkforceName(value: WorkforceName): Self = this.set("WorkforceName", value.asInstanceOf[js.Any])
  }
  
}

