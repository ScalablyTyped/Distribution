package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetServiceSpecificCredentialRequest extends js.Object {
  /**
    * The unique identifier of the service-specific credential. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
    */
  var ServiceSpecificCredentialId: serviceSpecificCredentialId = js.native
  /**
    * The name of the IAM user associated with the service-specific credential. If this value is not specified, then the operation assumes the user whose credentials are used to call the operation. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[userNameType] = js.native
}

object ResetServiceSpecificCredentialRequest {
  @scala.inline
  def apply(ServiceSpecificCredentialId: serviceSpecificCredentialId): ResetServiceSpecificCredentialRequest = {
    val __obj = js.Dynamic.literal(ServiceSpecificCredentialId = ServiceSpecificCredentialId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetServiceSpecificCredentialRequest]
  }
  @scala.inline
  implicit class ResetServiceSpecificCredentialRequestOps[Self <: ResetServiceSpecificCredentialRequest] (val x: Self) extends AnyVal {
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
    def setServiceSpecificCredentialId(value: serviceSpecificCredentialId): Self = this.set("ServiceSpecificCredentialId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: userNameType): Self = this.set("UserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("UserName", js.undefined)
  }
  
}

