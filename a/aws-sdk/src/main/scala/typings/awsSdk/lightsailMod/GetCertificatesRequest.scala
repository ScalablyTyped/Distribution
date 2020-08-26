package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificatesRequest extends js.Object {
  /**
    * The name for the certificate for which to return information. When omitted, the response includes all of your certificates in the AWS region where the request is made.
    */
  var certificateName: js.UndefOr[CertificateName] = js.native
  /**
    * The status of the certificates for which to return information. For example, specify ISSUED to return only certificates with an ISSUED status. When omitted, the response includes all of your certificates in the AWS region where the request is made, regardless of their current status.
    */
  var certificateStatuses: js.UndefOr[CertificateStatusList] = js.native
  /**
    * Indicates whether to include detailed information about the certificates in the response. When omitted, the response includes only the certificate names, Amazon Resource Names (ARNs), domain names, and tags.
    */
  var includeCertificateDetails: js.UndefOr[IncludeCertificateDetails] = js.native
}

object GetCertificatesRequest {
  @scala.inline
  def apply(): GetCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCertificatesRequest]
  }
  @scala.inline
  implicit class GetCertificatesRequestOps[Self <: GetCertificatesRequest] (val x: Self) extends AnyVal {
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
    def setCertificateName(value: CertificateName): Self = this.set("certificateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateName: Self = this.set("certificateName", js.undefined)
    @scala.inline
    def setCertificateStatusesVarargs(value: CertificateStatus*): Self = this.set("certificateStatuses", js.Array(value :_*))
    @scala.inline
    def setCertificateStatuses(value: CertificateStatusList): Self = this.set("certificateStatuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateStatuses: Self = this.set("certificateStatuses", js.undefined)
    @scala.inline
    def setIncludeCertificateDetails(value: IncludeCertificateDetails): Self = this.set("includeCertificateDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeCertificateDetails: Self = this.set("includeCertificateDetails", js.undefined)
  }
  
}

