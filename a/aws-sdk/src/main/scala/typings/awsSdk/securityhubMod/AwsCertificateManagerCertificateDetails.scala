package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCertificateManagerCertificateDetails extends js.Object {
  
  /**
    * The ARN of the private certificate authority (CA) that will be used to issue the certificate.
    */
  var CertificateAuthorityArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when the certificate was requested. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreatedAt: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The fully qualified domain name (FQDN), such as www.example.com, that is secured by the certificate.
    */
  var DomainName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Contains information about the initial validation of each domain name that occurs as a result of the RequestCertificate request. Only provided if the certificate type is AMAZON_ISSUED.
    */
  var DomainValidationOptions: js.UndefOr[AwsCertificateManagerCertificateDomainValidationOptions] = js.native
  
  /**
    * Contains a list of Extended Key Usage X.509 v3 extension objects. Each object specifies a purpose for which the certificate public key can be used and consists of a name and an object identifier (OID).
    */
  var ExtendedKeyUsages: js.UndefOr[AwsCertificateManagerCertificateExtendedKeyUsages] = js.native
  
  /**
    * For a failed certificate request, the reason for the failure. Valid values: NO_AVAILABLE_CONTACTS | ADDITIONAL_VERIFICATION_REQUIRED | DOMAIN_NOT_ALLOWED | INVALID_PUBLIC_DOMAIN | DOMAIN_VALIDATION_DENIED | CAA_ERROR | PCA_LIMIT_EXCEEDED | PCA_INVALID_ARN | PCA_INVALID_STATE | PCA_REQUEST_FAILED | PCA_NAME_CONSTRAINTS_VALIDATION | PCA_RESOURCE_NOT_FOUND | PCA_INVALID_ARGS | PCA_INVALID_DURATION | PCA_ACCESS_DENIED | SLR_NOT_FOUND | OTHER 
    */
  var FailureReason: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when the certificate was imported. Provided if the certificate type is IMPORTED. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var ImportedAt: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The list of ARNs for the AWS resources that use the certificate.
    */
  var InUseBy: js.UndefOr[StringList] = js.native
  
  /**
    * Indicates when the certificate was issued. Provided if the certificate type is AMAZON_ISSUED. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var IssuedAt: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the certificate authority that issued and signed the certificate.
    */
  var Issuer: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The algorithm that was used to generate the public-private key pair. Valid values: RSA_2048 | RSA_1024 | RSA_4096 | EC_prime256v1 | EC_secp384r1 | EC_secp521r1 
    */
  var KeyAlgorithm: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A list of key usage X.509 v3 extension objects.
    */
  var KeyUsages: js.UndefOr[AwsCertificateManagerCertificateKeyUsages] = js.native
  
  /**
    * The time after which the certificate becomes invalid. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var NotAfter: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The time before which the certificate is not valid. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var NotBefore: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Provides a value that specifies whether to add the certificate to a transparency log.
    */
  var Options: js.UndefOr[AwsCertificateManagerCertificateOptions] = js.native
  
  /**
    * Whether the certificate is eligible for renewal. Valid values: ELIGIBLE | INELIGIBLE 
    */
  var RenewalEligibility: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Information about the status of the AWS Certificate Manager managed renewal for the certificate. Provided only when the certificate type is AMAZON_ISSUED.
    */
  var RenewalSummary: js.UndefOr[AwsCertificateManagerCertificateRenewalSummary] = js.native
  
  /**
    * The serial number of the certificate.
    */
  var Serial: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The algorithm that was used to sign the certificate.
    */
  var SignatureAlgorithm: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The status of the certificate. Valid values: PENDING_VALIDATION | ISSUED | INACTIVE | EXPIRED | VALIDATION_TIMED_OUT | REVOKED | FAILED 
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the entity that is associated with the public key contained in the certificate.
    */
  var Subject: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * One or more domain names (subject alternative names) included in the certificate. This list contains the domain names that are bound to the public key that is contained in the certificate. The subject alternative names include the canonical domain name (CN) of the certificate and additional domain names that can be used to connect to the website.
    */
  var SubjectAlternativeNames: js.UndefOr[StringList] = js.native
  
  /**
    * The source of the certificate. For certificates that AWS Certificate Manager provides, Type is AMAZON_ISSUED. For certificates that are imported with ImportCertificate, Type is IMPORTED. Valid values: IMPORTED | AMAZON_ISSUED | PRIVATE 
    */
  var Type: js.UndefOr[NonEmptyString] = js.native
}
object AwsCertificateManagerCertificateDetails {
  
  @scala.inline
  def apply(): AwsCertificateManagerCertificateDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCertificateManagerCertificateDetails]
  }
  
  @scala.inline
  implicit class AwsCertificateManagerCertificateDetailsOps[Self <: AwsCertificateManagerCertificateDetails] (val x: Self) extends AnyVal {
    
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
    def setCertificateAuthorityArn(value: NonEmptyString): Self = this.set("CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateAuthorityArn: Self = this.set("CertificateAuthorityArn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: NonEmptyString): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    
    @scala.inline
    def setDomainName(value: NonEmptyString): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("DomainName", js.undefined)
    
    @scala.inline
    def setDomainValidationOptionsVarargs(value: AwsCertificateManagerCertificateDomainValidationOption*): Self = this.set("DomainValidationOptions", js.Array(value :_*))
    
    @scala.inline
    def setDomainValidationOptions(value: AwsCertificateManagerCertificateDomainValidationOptions): Self = this.set("DomainValidationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainValidationOptions: Self = this.set("DomainValidationOptions", js.undefined)
    
    @scala.inline
    def setExtendedKeyUsagesVarargs(value: AwsCertificateManagerCertificateExtendedKeyUsage*): Self = this.set("ExtendedKeyUsages", js.Array(value :_*))
    
    @scala.inline
    def setExtendedKeyUsages(value: AwsCertificateManagerCertificateExtendedKeyUsages): Self = this.set("ExtendedKeyUsages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtendedKeyUsages: Self = this.set("ExtendedKeyUsages", js.undefined)
    
    @scala.inline
    def setFailureReason(value: NonEmptyString): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    
    @scala.inline
    def setImportedAt(value: NonEmptyString): Self = this.set("ImportedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportedAt: Self = this.set("ImportedAt", js.undefined)
    
    @scala.inline
    def setInUseByVarargs(value: NonEmptyString*): Self = this.set("InUseBy", js.Array(value :_*))
    
    @scala.inline
    def setInUseBy(value: StringList): Self = this.set("InUseBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInUseBy: Self = this.set("InUseBy", js.undefined)
    
    @scala.inline
    def setIssuedAt(value: NonEmptyString): Self = this.set("IssuedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuedAt: Self = this.set("IssuedAt", js.undefined)
    
    @scala.inline
    def setIssuer(value: NonEmptyString): Self = this.set("Issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuer: Self = this.set("Issuer", js.undefined)
    
    @scala.inline
    def setKeyAlgorithm(value: NonEmptyString): Self = this.set("KeyAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyAlgorithm: Self = this.set("KeyAlgorithm", js.undefined)
    
    @scala.inline
    def setKeyUsagesVarargs(value: AwsCertificateManagerCertificateKeyUsage*): Self = this.set("KeyUsages", js.Array(value :_*))
    
    @scala.inline
    def setKeyUsages(value: AwsCertificateManagerCertificateKeyUsages): Self = this.set("KeyUsages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyUsages: Self = this.set("KeyUsages", js.undefined)
    
    @scala.inline
    def setNotAfter(value: NonEmptyString): Self = this.set("NotAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotAfter: Self = this.set("NotAfter", js.undefined)
    
    @scala.inline
    def setNotBefore(value: NonEmptyString): Self = this.set("NotBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotBefore: Self = this.set("NotBefore", js.undefined)
    
    @scala.inline
    def setOptions(value: AwsCertificateManagerCertificateOptions): Self = this.set("Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("Options", js.undefined)
    
    @scala.inline
    def setRenewalEligibility(value: NonEmptyString): Self = this.set("RenewalEligibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenewalEligibility: Self = this.set("RenewalEligibility", js.undefined)
    
    @scala.inline
    def setRenewalSummary(value: AwsCertificateManagerCertificateRenewalSummary): Self = this.set("RenewalSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenewalSummary: Self = this.set("RenewalSummary", js.undefined)
    
    @scala.inline
    def setSerial(value: NonEmptyString): Self = this.set("Serial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerial: Self = this.set("Serial", js.undefined)
    
    @scala.inline
    def setSignatureAlgorithm(value: NonEmptyString): Self = this.set("SignatureAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureAlgorithm: Self = this.set("SignatureAlgorithm", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setSubject(value: NonEmptyString): Self = this.set("Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("Subject", js.undefined)
    
    @scala.inline
    def setSubjectAlternativeNamesVarargs(value: NonEmptyString*): Self = this.set("SubjectAlternativeNames", js.Array(value :_*))
    
    @scala.inline
    def setSubjectAlternativeNames(value: StringList): Self = this.set("SubjectAlternativeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubjectAlternativeNames: Self = this.set("SubjectAlternativeNames", js.undefined)
    
    @scala.inline
    def setType(value: NonEmptyString): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
