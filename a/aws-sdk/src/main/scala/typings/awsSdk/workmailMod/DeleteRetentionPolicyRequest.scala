package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRetentionPolicyRequest extends js.Object {
  /**
    * The retention policy ID.
    */
  var Id: ShortString = js.native
  /**
    * The organization ID.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
}

object DeleteRetentionPolicyRequest {
  @scala.inline
  def apply(Id: ShortString, OrganizationId: OrganizationId): DeleteRetentionPolicyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRetentionPolicyRequest]
  }
  @scala.inline
  implicit class DeleteRetentionPolicyRequestOps[Self <: DeleteRetentionPolicyRequest] (val x: Self) extends AnyVal {
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
    def setId(value: ShortString): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
  }
  
}

