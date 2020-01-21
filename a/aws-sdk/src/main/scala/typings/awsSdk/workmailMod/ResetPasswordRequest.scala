package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetPasswordRequest extends js.Object {
  /**
    * The identifier of the organization that contains the user for which the password is reset.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
  /**
    * The new password for the user.
    */
  var Password: typings.awsSdk.workmailMod.Password = js.native
  /**
    * The identifier of the user for whom the password is reset.
    */
  var UserId: WorkMailIdentifier = js.native
}

object ResetPasswordRequest {
  @scala.inline
  def apply(OrganizationId: OrganizationId, Password: Password, UserId: WorkMailIdentifier): ResetPasswordRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResetPasswordRequest]
  }
}

