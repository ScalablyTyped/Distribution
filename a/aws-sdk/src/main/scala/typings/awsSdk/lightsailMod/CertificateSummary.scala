package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the certificate.
    */
  var certificateArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * An object that describes a certificate in detail.
    */
  var certificateDetail: js.UndefOr[Certificate] = js.native
  /**
    * The name of the certificate.
    */
  var certificateName: js.UndefOr[CertificateName] = js.native
  /**
    * The domain name of the certificate.
    */
  var domainName: js.UndefOr[DomainName] = js.native
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CertificateSummary {
  @scala.inline
  def apply(): CertificateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateSummary]
  }
  @scala.inline
  implicit class CertificateSummaryOps[Self <: CertificateSummary] (val x: Self) extends AnyVal {
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
    def setCertificateArn(value: NonEmptyString): Self = this.set("certificateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateArn: Self = this.set("certificateArn", js.undefined)
    @scala.inline
    def setCertificateDetail(value: Certificate): Self = this.set("certificateDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateDetail: Self = this.set("certificateDetail", js.undefined)
    @scala.inline
    def setCertificateName(value: CertificateName): Self = this.set("certificateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateName: Self = this.set("certificateName", js.undefined)
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

