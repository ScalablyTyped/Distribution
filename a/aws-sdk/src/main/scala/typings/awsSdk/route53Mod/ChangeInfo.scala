package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeInfo extends js.Object {
  /**
    * A complex type that describes change information about changes made to your hosted zone. This element contains an ID that you use when performing a GetChange action to get detailed information about the change.
    */
  var Comment: js.UndefOr[ResourceDescription] = js.native
  /**
    * The ID of the request.
    */
  var Id: ResourceId = js.native
  /**
    * The current state of the request. PENDING indicates that this request has not yet been applied to all Amazon Route 53 DNS servers.
    */
  var Status: ChangeStatus = js.native
  /**
    * The date and time that the change request was submitted in ISO 8601 format and Coordinated Universal Time (UTC). For example, the value 2017-03-27T17:48:16.751Z represents March 27, 2017 at 17:48:16.751 UTC.
    */
  var SubmittedAt: TimeStamp = js.native
}

object ChangeInfo {
  @scala.inline
  def apply(Id: ResourceId, Status: ChangeStatus, SubmittedAt: TimeStamp): ChangeInfo = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], SubmittedAt = SubmittedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeInfo]
  }
  @scala.inline
  implicit class ChangeInfoOps[Self <: ChangeInfo] (val x: Self) extends AnyVal {
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
    def setId(value: ResourceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: ChangeStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubmittedAt(value: TimeStamp): Self = this.set("SubmittedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: ResourceDescription): Self = this.set("Comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
  }
  
}

