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
  @scala.inline
  implicit class ResetPasswordRequestOps[Self <: ResetPasswordRequest] (val x: Self) extends AnyVal {
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
    def setPassword(value: Password): Self = this.set("Password", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: WorkMailIdentifier): Self = this.set("UserId", value.asInstanceOf[js.Any])
  }
  
}

