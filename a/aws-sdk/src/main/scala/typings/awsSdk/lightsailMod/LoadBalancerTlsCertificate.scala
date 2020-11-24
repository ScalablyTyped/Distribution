package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerTlsCertificate extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the SSL/TLS certificate.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The time when you created your SSL/TLS certificate.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * The domain name for your SSL/TLS certificate.
    */
  var domainName: js.UndefOr[DomainName] = js.native
  
  /**
    * An array of LoadBalancerTlsCertificateDomainValidationRecord objects describing the records.
    */
  var domainValidationRecords: js.UndefOr[LoadBalancerTlsCertificateDomainValidationRecordList] = js.native
  
  /**
    * The validation failure reason, if any, of the certificate. The following failure reasons are possible:     NO_AVAILABLE_CONTACTS  - This failure applies to email validation, which is not available for Lightsail certificates.     ADDITIONAL_VERIFICATION_REQUIRED  - Lightsail requires additional information to process this certificate request. This can happen as a fraud-protection measure, such as when the domain ranks within the Alexa top 1000 websites. To provide the required information, use the AWS Support Center to contact AWS Support.  You cannot request a certificate for Amazon-owned domain names such as those ending in amazonaws.com, cloudfront.net, or elasticbeanstalk.com.      DOMAIN_NOT_ALLOWED  - One or more of the domain names in the certificate request was reported as an unsafe domain by VirusTotal. To correct the problem, search for your domain name on the VirusTotal website. If your domain is reported as suspicious, see Google Help for Hacked Websites to learn what you can do. If you believe that the result is a false positive, notify the organization that is reporting the domain. VirusTotal is an aggregate of several antivirus and URL scanners and cannot remove your domain from a block list itself. After you correct the problem and the VirusTotal registry has been updated, request a new certificate. If you see this error and your domain is not included in the VirusTotal list, visit the AWS Support Center and create a case.     INVALID_PUBLIC_DOMAIN  - One or more of the domain names in the certificate request is not valid. Typically, this is because a domain name in the request is not a valid top-level domain. Try to request a certificate again, correcting any spelling errors or typos that were in the failed request, and ensure that all domain names in the request are for valid top-level domains. For example, you cannot request a certificate for example.invalidpublicdomain because invalidpublicdomain is not a valid top-level domain.     OTHER  - Typically, this failure occurs when there is a typographical error in one or more of the domain names in the certificate request. Try to request a certificate again, correcting any spelling errors or typos that were in the failed request.   
    */
  var failureReason: js.UndefOr[LoadBalancerTlsCertificateFailureReason] = js.native
  
  /**
    * When true, the SSL/TLS certificate is attached to the Lightsail load balancer.
    */
  var isAttached: js.UndefOr[Boolean] = js.native
  
  /**
    * The time when the SSL/TLS certificate was issued.
    */
  var issuedAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * The issuer of the certificate.
    */
  var issuer: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The algorithm used to generate the key pair (the public and private key).
    */
  var keyAlgorithm: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The load balancer name where your SSL/TLS certificate is attached.
    */
  var loadBalancerName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The AWS Region and Availability Zone where you created your certificate.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  
  /**
    * The name of the SSL/TLS certificate (e.g., my-certificate).
    */
  var name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The timestamp when the SSL/TLS certificate expires.
    */
  var notAfter: js.UndefOr[IsoDate] = js.native
  
  /**
    * The timestamp when the SSL/TLS certificate is first valid.
    */
  var notBefore: js.UndefOr[IsoDate] = js.native
  
  /**
    * An object that describes the status of the certificate renewal managed by Lightsail.
    */
  var renewalSummary: js.UndefOr[LoadBalancerTlsCertificateRenewalSummary] = js.native
  
  /**
    * The resource type (e.g., LoadBalancerTlsCertificate).     Instance  - A Lightsail instance (a virtual private server)     StaticIp  - A static IP address     KeyPair  - The key pair used to connect to a Lightsail instance     InstanceSnapshot  - A Lightsail instance snapshot     Domain  - A DNS zone     PeeredVpc  - A peered VPC     LoadBalancer  - A Lightsail load balancer     LoadBalancerTlsCertificate  - An SSL/TLS certificate associated with a Lightsail load balancer     Disk  - A Lightsail block storage disk     DiskSnapshot  - A block storage disk snapshot  
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  
  /**
    * The reason the certificate was revoked. This value is present only when the certificate status is REVOKED.
    */
  var revocationReason: js.UndefOr[LoadBalancerTlsCertificateRevocationReason] = js.native
  
  /**
    * The timestamp when the certificate was revoked. This value is present only when the certificate status is REVOKED.
    */
  var revokedAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * The serial number of the certificate.
    */
  var serial: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The algorithm that was used to sign the certificate.
    */
  var signatureAlgorithm: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The validation status of the SSL/TLS certificate. Valid values are below.
    */
  var status: js.UndefOr[LoadBalancerTlsCertificateStatus] = js.native
  
  /**
    * The name of the entity that is associated with the public key contained in the certificate.
    */
  var subject: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * An array of strings that specify the alternate domains (e.g., example2.com) and subdomains (e.g., blog.example.com) for the certificate.
    */
  var subjectAlternativeNames: js.UndefOr[StringList] = js.native
  
  /**
    * The support code. Include this code in your email to support when you have questions about your Lightsail load balancer or SSL/TLS certificate. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object LoadBalancerTlsCertificate {
  
  @scala.inline
  def apply(): LoadBalancerTlsCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerTlsCertificate]
  }
  
  @scala.inline
  implicit class LoadBalancerTlsCertificateOps[Self <: LoadBalancerTlsCertificate] (val x: Self) extends AnyVal {
    
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
    def setDomainValidationRecordsVarargs(value: LoadBalancerTlsCertificateDomainValidationRecord*): Self = this.set("domainValidationRecords", js.Array(value :_*))
    
    @scala.inline
    def setDomainValidationRecords(value: LoadBalancerTlsCertificateDomainValidationRecordList): Self = this.set("domainValidationRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainValidationRecords: Self = this.set("domainValidationRecords", js.undefined)
    
    @scala.inline
    def setFailureReason(value: LoadBalancerTlsCertificateFailureReason): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    
    @scala.inline
    def setIsAttached(value: Boolean): Self = this.set("isAttached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAttached: Self = this.set("isAttached", js.undefined)
    
    @scala.inline
    def setIssuedAt(value: IsoDate): Self = this.set("issuedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuedAt: Self = this.set("issuedAt", js.undefined)
    
    @scala.inline
    def setIssuer(value: NonEmptyString): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    
    @scala.inline
    def setKeyAlgorithm(value: NonEmptyString): Self = this.set("keyAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyAlgorithm: Self = this.set("keyAlgorithm", js.undefined)
    
    @scala.inline
    def setLoadBalancerName(value: ResourceName): Self = this.set("loadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancerName: Self = this.set("loadBalancerName", js.undefined)
    
    @scala.inline
    def setLocation(value: ResourceLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    
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
    def setRenewalSummary(value: LoadBalancerTlsCertificateRenewalSummary): Self = this.set("renewalSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenewalSummary: Self = this.set("renewalSummary", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setRevocationReason(value: LoadBalancerTlsCertificateRevocationReason): Self = this.set("revocationReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevocationReason: Self = this.set("revocationReason", js.undefined)
    
    @scala.inline
    def setRevokedAt(value: IsoDate): Self = this.set("revokedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevokedAt: Self = this.set("revokedAt", js.undefined)
    
    @scala.inline
    def setSerial(value: NonEmptyString): Self = this.set("serial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerial: Self = this.set("serial", js.undefined)
    
    @scala.inline
    def setSignatureAlgorithm(value: NonEmptyString): Self = this.set("signatureAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureAlgorithm: Self = this.set("signatureAlgorithm", js.undefined)
    
    @scala.inline
    def setStatus(value: LoadBalancerTlsCertificateStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubject(value: NonEmptyString): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setSubjectAlternativeNamesVarargs(value: String*): Self = this.set("subjectAlternativeNames", js.Array(value :_*))
    
    @scala.inline
    def setSubjectAlternativeNames(value: StringList): Self = this.set("subjectAlternativeNames", value.asInstanceOf[js.Any])
    
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
