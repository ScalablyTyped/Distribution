package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDefaultRetentionPolicyRequest extends js.Object {
  /**
    * The organization ID.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
}

object GetDefaultRetentionPolicyRequest {
  @scala.inline
  def apply(OrganizationId: OrganizationId): GetDefaultRetentionPolicyRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDefaultRetentionPolicyRequest]
  }
  @scala.inline
  implicit class GetDefaultRetentionPolicyRequestOps[Self <: GetDefaultRetentionPolicyRequest] (val x: Self) extends AnyVal {
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
    def setOrganizationId(value: OrganizationId): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
  }
  
}

