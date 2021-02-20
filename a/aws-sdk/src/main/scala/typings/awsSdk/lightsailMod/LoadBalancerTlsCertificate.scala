package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerTlsCertificate extends StObject {
  
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
  implicit class LoadBalancerTlsCertificateMutableBuilder[Self <: LoadBalancerTlsCertificate] (val x: Self) extends AnyVal {
    
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
    def setDomainValidationRecords(value: LoadBalancerTlsCertificateDomainValidationRecordList): Self = StObject.set(x, "domainValidationRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainValidationRecordsUndefined: Self = StObject.set(x, "domainValidationRecords", js.undefined)
    
    @scala.inline
    def setDomainValidationRecordsVarargs(value: LoadBalancerTlsCertificateDomainValidationRecord*): Self = StObject.set(x, "domainValidationRecords", js.Array(value :_*))
    
    @scala.inline
    def setFailureReason(value: LoadBalancerTlsCertificateFailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    @scala.inline
    def setIsAttached(value: Boolean): Self = StObject.set(x, "isAttached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAttachedUndefined: Self = StObject.set(x, "isAttached", js.undefined)
    
    @scala.inline
    def setIssuedAt(value: IsoDate): Self = StObject.set(x, "issuedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuedAtUndefined: Self = StObject.set(x, "issuedAt", js.undefined)
    
    @scala.inline
    def setIssuer(value: NonEmptyString): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    @scala.inline
    def setKeyAlgorithm(value: NonEmptyString): Self = StObject.set(x, "keyAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyAlgorithmUndefined: Self = StObject.set(x, "keyAlgorithm", js.undefined)
    
    @scala.inline
    def setLoadBalancerName(value: ResourceName): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerNameUndefined: Self = StObject.set(x, "loadBalancerName", js.undefined)
    
    @scala.inline
    def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
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
    def setRenewalSummary(value: LoadBalancerTlsCertificateRenewalSummary): Self = StObject.set(x, "renewalSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenewalSummaryUndefined: Self = StObject.set(x, "renewalSummary", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setRevocationReason(value: LoadBalancerTlsCertificateRevocationReason): Self = StObject.set(x, "revocationReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevocationReasonUndefined: Self = StObject.set(x, "revocationReason", js.undefined)
    
    @scala.inline
    def setRevokedAt(value: IsoDate): Self = StObject.set(x, "revokedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevokedAtUndefined: Self = StObject.set(x, "revokedAt", js.undefined)
    
    @scala.inline
    def setSerial(value: NonEmptyString): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialUndefined: Self = StObject.set(x, "serial", js.undefined)
    
    @scala.inline
    def setSignatureAlgorithm(value: NonEmptyString): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    
    @scala.inline
    def setStatus(value: LoadBalancerTlsCertificateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSubject(value: NonEmptyString): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectAlternativeNames(value: StringList): Self = StObject.set(x, "subjectAlternativeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectAlternativeNamesUndefined: Self = StObject.set(x, "subjectAlternativeNames", js.undefined)
    
    @scala.inline
    def setSubjectAlternativeNamesVarargs(value: String*): Self = StObject.set(x, "subjectAlternativeNames", js.Array(value :_*))
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
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
