package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMailboxDetailsRequest extends js.Object {
  /**
    * The identifier for the organization that contains the user whose mailbox details are being requested.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
  /**
    * The identifier for the user whose mailbox details are being requested.
    */
  var UserId: WorkMailIdentifier = js.native
}

object GetMailboxDetailsRequest {
  @scala.inline
  def apply(OrganizationId: OrganizationId, UserId: WorkMailIdentifier): GetMailboxDetailsRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMailboxDetailsRequest]
  }
  @scala.inline
  implicit class GetMailboxDetailsRequestOps[Self <: GetMailboxDetailsRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setUserId(value: WorkMailIdentifier): Self = this.set("UserId", value.asInstanceOf[js.Any])
  }
  
}

