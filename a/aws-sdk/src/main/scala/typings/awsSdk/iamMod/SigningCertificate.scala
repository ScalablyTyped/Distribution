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
    UserName: userNameType
  ): SigningCertificate = {
    val __obj = js.Dynamic.literal(CertificateBody = CertificateBody.asInstanceOf[js.Any], CertificateId = CertificateId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningCertificate]
  }
  @scala.inline
  implicit class SigningCertificateOps[Self <: SigningCertificate] (val x: Self) extends AnyVal {
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
    def setCertificateBody(value: certificateBodyType): Self = this.set("CertificateBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateId(value: certificateIdType): Self = this.set("CertificateId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: statusType): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: userNameType): Self = this.set("UserName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadDate(value: dateType): Self = this.set("UploadDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadDate: Self = this.set("UploadDate", js.undefined)
  }
  
}

