package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSigningCertificateRequest extends js.Object {
  /**
    * The ID of the signing certificate you want to update. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
    */
  var CertificateId: certificateIdType = js.native
  /**
    *  The status you want to assign to the certificate. Active means that the certificate can be used for API calls to AWS Inactive means that the certificate cannot be used.
    */
  var Status: statusType = js.native
  /**
    * The name of the IAM user the signing certificate belongs to. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[existingUserNameType] = js.native
}

object UpdateSigningCertificateRequest {
  @scala.inline
  def apply(CertificateId: certificateIdType, Status: statusType, UserName: existingUserNameType = null): UpdateSigningCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateId = CertificateId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSigningCertificateRequest]
  }
}

