package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServiceSpecificCredentialRequest extends js.Object {
  /**
    * The unique identifier of the service-specific credential. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
    */
  var ServiceSpecificCredentialId: serviceSpecificCredentialId = js.native
  /**
    * The status to be assigned to the service-specific credential.
    */
  var Status: statusType = js.native
  /**
    * The name of the IAM user associated with the service-specific credential. If you do not specify this value, then the operation assumes the user whose credentials are used to call the operation. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[userNameType] = js.native
}

object UpdateServiceSpecificCredentialRequest {
  @scala.inline
  def apply(
    ServiceSpecificCredentialId: serviceSpecificCredentialId,
    Status: statusType,
    UserName: userNameType = null
  ): UpdateServiceSpecificCredentialRequest = {
    val __obj = js.Dynamic.literal(ServiceSpecificCredentialId = ServiceSpecificCredentialId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceSpecificCredentialRequest]
  }
}

