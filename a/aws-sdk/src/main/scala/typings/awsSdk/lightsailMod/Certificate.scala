package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certificate extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the certificate.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The timestamp when the certificate was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * The domain name of the certificate.
    */
  var domainName: js.UndefOr[DomainName] = js.native
  
  /**
    * An array of objects that describe the domain validation records of the certificate.
    */
  var domainValidationRecords: js.UndefOr[DomainValidationRecordList] = js.native
  
  /**
    * The renewal eligibility of the certificate.
    */
  var eligibleToRenew: js.UndefOr[EligibleToRenew] = js.native
  
  /**
    * The number of Lightsail resources that the certificate is attached to.
    */
  var inUseResourceCount: js.UndefOr[InUseResourceCount] = js.native
  
  /**
    * The timestamp when the certificate was issued.
    */
  var issuedAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * The certificate authority that issued the certificate.
    */
  var issuerCA: js.UndefOr[IssuerCA] = js.native
  
  /**
    * The algorithm used to generate the key pair (the public and private key) of the certificate.
    */
  var keyAlgorithm: js.UndefOr[KeyAlgorithm] = js.native
  
  /**
    * The name of the certificate (e.g., my-certificate).
    */
  var name: js.UndefOr[CertificateName] = js.native
  
  /**
    * The timestamp when the certificate expires.
    */
  var notAfter: js.UndefOr[IsoDate] = js.native
  
  /**
    * The timestamp when the certificate is first valid.
    */
  var notBefore: js.UndefOr[IsoDate] = js.native
  
  /**
    * An object that describes the status of the certificate renewal managed by Lightsail.
    */
  var renewalSummary: js.UndefOr[RenewalSummary] = js.native
  
  /**
    * The validation failure reason, if any, of the certificate. The following failure reasons are possible:     NO_AVAILABLE_CONTACTS  - This failure applies to email validation, which is not available for Lightsail certificates.     ADDITIONAL_VERIFICATION_REQUIRED  - Lightsail requires additional information to process this certificate request. This can happen as a fraud-protection measure, such as when the domain ranks within the Alexa top 1000 websites. To provide the required information, use the AWS Support Center to contact AWS Support.  You cannot request a certificate for Amazon-owned domain names such as those ending in amazonaws.com, cloudfront.net, or elasticbeanstalk.com.      DOMAIN_NOT_ALLOWED  - One or more of the domain names in the certificate request was reported as an unsafe domain by VirusTotal. To correct the problem, search for your domain name on the VirusTotal website. If your domain is reported as suspicious, see Google Help for Hacked Websites to learn what you can do. If you believe that the result is a false positive, notify the organization that is reporting the domain. VirusTotal is an aggregate of several antivirus and URL scanners and cannot remove your domain from a block list itself. After you correct the problem and the VirusTotal registry has been updated, request a new certificate. If you see this error and your domain is not included in the VirusTotal list, visit the AWS Support Center and create a case.     INVALID_PUBLIC_DOMAIN  - One or more of the domain names in the certificate request is not valid. Typically, this is because a domain name in the request is not a valid top-level domain. Try to request a certificate again, correcting any spelling errors or typos that were in the failed request, and ensure that all domain names in the request are for valid top-level domains. For example, you cannot request a certificate for example.invalidpublicdomain because invalidpublicdomain is not a valid top-level domain.     OTHER  - Typically, this failure occurs when there is a typographical error in one or more of the domain names in the certificate request. Try to request a certificate again, correcting any spelling errors or typos that were in the failed request.   
    */
  var requestFailureReason: js.UndefOr[RequestFailureReason] = js.native
  
  /**
    * The reason the certificate was revoked. This value is present only when the certificate status is REVOKED.
    */
  var revocationReason: js.UndefOr[RevocationReason] = js.native
  
  /**
    * The timestamp when the certificate was revoked. This value is present only when the certificate status is REVOKED.
    */
  var revokedAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * The serial number of the certificate.
    */
  var serialNumber: js.UndefOr[SerialNumber] = js.native
  
  /**
    * The validation status of the certificate.
    */
  var status: js.UndefOr[CertificateStatus] = js.native
  
  /**
    * An array of strings that specify the alternate domains (e.g., example2.com) and subdomains (e.g., blog.example.com) of the certificate.
    */
  var subjectAlternativeNames: js.UndefOr[SubjectAlternativeNameList] = js.native
  
  /**
    * The support code. Include this code in your email to support when you have questions about your Lightsail certificate. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object Certificate {
  
  @scala.inline
  def apply(): Certificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certificate]
  }
  
  @scala.inline
  implicit class CertificateOps[Self <: Certificate] (val x: Self) extends AnyVal {
    
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
    def setArn(value: NonEmptyString): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    
    @scala.inline
    def setDomainValidationRecordsVarargs(value: DomainValidationRecord*): Self = this.set("domainValidationRecords", js.Array(value :_*))
    
    @scala.inline
    def setDomainValidationRecords(value: DomainValidationRecordList): Self = this.set("domainValidationRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainValidationRecords: Self = this.set("domainValidationRecords", js.undefined)
    
    @scala.inline
    def setEligibleToRenew(value: EligibleToRenew): Self = this.set("eligibleToRenew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEligibleToRenew: Self = this.set("eligibleToRenew", js.undefined)
    
    @scala.inline
    def setInUseResourceCount(value: InUseResourceCount): Self = this.set("inUseResourceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInUseResourceCount: Self = this.set("inUseResourceCount", js.undefined)
    
    @scala.inline
    def setIssuedAt(value: IsoDate): Self = this.set("issuedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuedAt: Self = this.set("issuedAt", js.undefined)
    
    @scala.inline
    def setIssuerCA(value: IssuerCA): Self = this.set("issuerCA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuerCA: Self = this.set("issuerCA", js.undefined)
    
    @scala.inline
    def setKeyAlgorithm(value: KeyAlgorithm): Self = this.set("keyAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyAlgorithm: Self = this.set("keyAlgorithm", js.undefined)
    
    @scala.inline
    def setName(value: CertificateName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotAfter(value: IsoDate): Self = this.set("notAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotAfter: Self = this.set("notAfter", js.undefined)
    
    @scala.inline
    def setNotBefore(value: IsoDate): Self = this.set("notBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotBefore: Self = this.set("notBefore", js.undefined)
    
    @scala.inline
    def setRenewalSummary(value: RenewalSummary): Self = this.set("renewalSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenewalSummary: Self = this.set("renewalSummary", js.undefined)
    
    @scala.inline
    def setRequestFailureReason(value: RequestFailureReason): Self = this.set("requestFailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestFailureReason: Self = this.set("requestFailureReason", js.undefined)
    
    @scala.inline
    def setRevocationReason(value: RevocationReason): Self = this.set("revocationReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevocationReason: Self = this.set("revocationReason", js.undefined)
    
    @scala.inline
    def setRevokedAt(value: IsoDate): Self = this.set("revokedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevokedAt: Self = this.set("revokedAt", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: SerialNumber): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialNumber: Self = this.set("serialNumber", js.undefined)
    
    @scala.inline
    def setStatus(value: CertificateStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubjectAlternativeNamesVarargs(value: DomainName*): Self = this.set("subjectAlternativeNames", js.Array(value :_*))
    
    @scala.inline
    def setSubjectAlternativeNames(value: SubjectAlternativeNameList): Self = this.set("subjectAlternativeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubjectAlternativeNames: Self = this.set("subjectAlternativeNames", js.undefined)
    
    @scala.inline
    def setSupportCode(value: String): Self = this.set("supportCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportCode: Self = this.set("supportCode", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
