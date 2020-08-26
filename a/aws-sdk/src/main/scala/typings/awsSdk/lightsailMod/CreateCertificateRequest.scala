package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCertificateRequest extends js.Object {
  /**
    * The name for the certificate.
    */
  var certificateName: CertificateName = js.native
  /**
    * The domain name (e.g., example.com) for the certificate.
    */
  var domainName: DomainName = js.native
  /**
    * An array of strings that specify the alternate domains (e.g., example2.com) and subdomains (e.g., blog.example.com) for the certificate. You can specify a maximum of nine alternate domains (in addition to the primary domain name). Wildcard domain entries (e.g., *.example.com) are not supported.
    */
  var subjectAlternativeNames: js.UndefOr[SubjectAlternativeNameList] = js.native
  /**
    * The tag keys and optional values to add to the certificate during create. Use the TagResource action to tag a resource after it's created.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateCertificateRequest {
  @scala.inline
  def apply(certificateName: CertificateName, domainName: DomainName): CreateCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateName = certificateName.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCertificateRequest]
  }
  @scala.inline
  implicit class CreateCertificateRequestOps[Self <: CreateCertificateRequest] (val x: Self) extends AnyVal {
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
    def setDomainName(value: DomainName): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubjectAlternativeNamesVarargs(value: DomainName*): Self = this.set("subjectAlternativeNames", js.Array(value :_*))
    @scala.inline
    def setSubjectAlternativeNames(value: SubjectAlternativeNameList): Self = this.set("subjectAlternativeNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubjectAlternativeNames: Self = this.set("subjectAlternativeNames", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

