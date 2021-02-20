package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certificate extends StObject {
  
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
  implicit class CertificateMutableBuilder[Self <: Certificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    @scala.inline
    def setDomainValidationRecords(value: DomainValidationRecordList): Self = StObject.set(x, "domainValidationRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainValidationRecordsUndefined: Self = StObject.set(x, "domainValidationRecords", js.undefined)
    
    @scala.inline
    def setDomainValidationRecordsVarargs(value: DomainValidationRecord*): Self = StObject.set(x, "domainValidationRecords", js.Array(value :_*))
    
    @scala.inline
    def setEligibleToRenew(value: EligibleToRenew): Self = StObject.set(x, "eligibleToRenew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEligibleToRenewUndefined: Self = StObject.set(x, "eligibleToRenew", js.undefined)
    
    @scala.inline
    def setInUseResourceCount(value: InUseResourceCount): Self = StObject.set(x, "inUseResourceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInUseResourceCountUndefined: Self = StObject.set(x, "inUseResourceCount", js.undefined)
    
    @scala.inline
    def setIssuedAt(value: IsoDate): Self = StObject.set(x, "issuedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuedAtUndefined: Self = StObject.set(x, "issuedAt", js.undefined)
    
    @scala.inline
    def setIssuerCA(value: IssuerCA): Self = StObject.set(x, "issuerCA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerCAUndefined: Self = StObject.set(x, "issuerCA", js.undefined)
    
    @scala.inline
    def setKeyAlgorithm(value: KeyAlgorithm): Self = StObject.set(x, "keyAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyAlgorithmUndefined: Self = StObject.set(x, "keyAlgorithm", js.undefined)
    
    @scala.inline
    def setName(value: CertificateName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotAfter(value: IsoDate): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotAfterUndefined: Self = StObject.set(x, "notAfter", js.undefined)
    
    @scala.inline
    def setNotBefore(value: IsoDate): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
    
    @scala.inline
    def setRenewalSummary(value: RenewalSummary): Self = StObject.set(x, "renewalSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenewalSummaryUndefined: Self = StObject.set(x, "renewalSummary", js.undefined)
    
    @scala.inline
    def setRequestFailureReason(value: RequestFailureReason): Self = StObject.set(x, "requestFailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestFailureReasonUndefined: Self = StObject.set(x, "requestFailureReason", js.undefined)
    
    @scala.inline
    def setRevocationReason(value: RevocationReason): Self = StObject.set(x, "revocationReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevocationReasonUndefined: Self = StObject.set(x, "revocationReason", js.undefined)
    
    @scala.inline
    def setRevokedAt(value: IsoDate): Self = StObject.set(x, "revokedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevokedAtUndefined: Self = StObject.set(x, "revokedAt", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: SerialNumber): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    @scala.inline
    def setStatus(value: CertificateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSubjectAlternativeNames(value: SubjectAlternativeNameList): Self = StObject.set(x, "subjectAlternativeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectAlternativeNamesUndefined: Self = StObject.set(x, "subjectAlternativeNames", js.undefined)
    
    @scala.inline
    def setSubjectAlternativeNamesVarargs(value: DomainName*): Self = StObject.set(x, "subjectAlternativeNames", js.Array(value :_*))
    
    @scala.inline
    def setSupportCode(value: String): Self = StObject.set(x, "supportCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportCodeUndefined: Self = StObject.set(x, "supportCode", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
