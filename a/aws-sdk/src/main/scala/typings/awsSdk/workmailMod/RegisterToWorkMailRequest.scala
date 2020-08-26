package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterToWorkMailRequest extends js.Object {
  /**
    * The email for the user, group, or resource to be updated.
    */
  var Email: EmailAddress = js.native
  /**
    * The identifier for the user, group, or resource to be updated.
    */
  var EntityId: WorkMailIdentifier = js.native
  /**
    * The identifier for the organization under which the user, group, or resource exists.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
}

object RegisterToWorkMailRequest {
  @scala.inline
  def apply(Email: EmailAddress, EntityId: WorkMailIdentifier, OrganizationId: OrganizationId): RegisterToWorkMailRequest = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], EntityId = EntityId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterToWorkMailRequest]
  }
  @scala.inline
  implicit class RegisterToWorkMailRequestOps[Self <: RegisterToWorkMailRequest] (val x: Self) extends AnyVal {
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

