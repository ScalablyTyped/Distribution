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
}

