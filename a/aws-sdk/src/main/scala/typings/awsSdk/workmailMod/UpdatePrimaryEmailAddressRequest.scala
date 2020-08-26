package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePrimaryEmailAddressRequest extends js.Object {
  /**
    * The value of the email to be updated as primary.
    */
  var Email: EmailAddress = js.native
  /**
    * The user, group, or resource to update.
    */
  var EntityId: WorkMailIdentifier = js.native
  /**
    * The organization that contains the user, group, or resource to update.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
}

object UpdatePrimaryEmailAddressRequest {
  @scala.inline
  def apply(Email: EmailAddress, EntityId: WorkMailIdentifier, OrganizationId: OrganizationId): UpdatePrimaryEmailAddressRequest = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], EntityId = EntityId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePrimaryEmailAddressRequest]
  }
  @scala.inline
  implicit class UpdatePrimaryEmailAddressRequestOps[Self <: UpdatePrimaryEmailAddressRequest] (val x: Self) extends AnyVal {
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
    def setEmail(value: EmailAddress): Self = this.set("Email", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntityId(value: WorkMailIdentifier): Self = this.set("EntityId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
  }
  
}

