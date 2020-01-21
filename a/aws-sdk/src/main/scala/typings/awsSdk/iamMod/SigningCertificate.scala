package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigningCertificate extends js.Object {
  /**
    * The contents of the signing certificate.
    */
  var CertificateBody: certificateBodyType = js.native
  /**
    * The ID for the signing certificate.
    */
  var CertificateId: certificateIdType = js.native
  /**
    * The status of the signing certificate. Active means that the key is valid for API calls, while Inactive means it is not.
    */
  var Status: statusType = js.native
  /**
    * The date when the signing certificate was uploaded.
    */
  var UploadDate: js.UndefOr[dateType] = js.native
  /**
    * The name of the user the signing certificate is associated with.
    */
  var UserName: userNameType = js.native
}

object SigningCertificate {
  @scala.inline
  def apply(
    CertificateBody: certificateBodyType,
    CertificateId: certificateIdType,
    Status: statusType,
    UserName: userNameType,
    UploadDate: dateType = null
  ): SigningCertificate = {
    val __obj = js.Dynamic.literal(CertificateBody = CertificateBody.asInstanceOf[js.Any], CertificateId = CertificateId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    if (UploadDate != null) __obj.updateDynamic("UploadDate")(UploadDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningCertificate]
  }
}

