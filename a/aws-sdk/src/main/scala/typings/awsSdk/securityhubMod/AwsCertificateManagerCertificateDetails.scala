package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCertificateManagerCertificateDetails extends StObject {
  
  /**
    * The ARN of the private certificate authority (CA) that will be used to issue the certificate.
    */
  var CertificateAuthorityArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates when the certificate was requested. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreatedAt: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The fully qualified domain name (FQDN), such as www.example.com, that is secured by the certificate.
    */
  var DomainName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Contains information about the initial validation of each domain name that occurs as a result of the RequestCertificate request. Only provided if the certificate type is AMAZON_ISSUED.
    */
  var DomainValidationOptions: js.UndefOr[AwsCertificateManagerCertificateDomainValidationOptions] = js.undefined
  
  /**
    * Contains a list of Extended Key Usage X.509 v3 extension objects. Each object specifies a purpose for which the certificate public key can be used and consists of a name and an object identifier (OID).
    */
  var ExtendedKeyUsages: js.UndefOr[AwsCertificateManagerCertificateExtendedKeyUsages] = js.undefined
  
  /**
    * For a failed certificate request, the reason for the failure. Valid values: NO_AVAILABLE_CONTACTS | ADDITIONAL_VERIFICATION_REQUIRED | DOMAIN_NOT_ALLOWED | INVALID_PUBLIC_DOMAIN | DOMAIN_VALIDATION_DENIED | CAA_ERROR | PCA_LIMIT_EXCEEDED | PCA_INVALID_ARN | PCA_INVALID_STATE | PCA_REQUEST_FAILED | PCA_NAME_CONSTRAINTS_VALIDATION | PCA_RESOURCE_NOT_FOUND | PCA_INVALID_ARGS | PCA_INVALID_DURATION | PCA_ACCESS_DENIED | SLR_NOT_FOUND | OTHER 
    */
  var FailureReason: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates when the certificate was imported. Provided if the certificate type is IMPORTED. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var ImportedAt: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The list of ARNs for the AWS resources that use the certificate.
    */
  var InUseBy: js.UndefOr[StringList] = js.undefined
  
  /**
    * Indicates when the certificate was issued. Provided if the certificate type is AMAZON_ISSUED. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var IssuedAt: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the certificate authority that issued and signed the certificate.
    */
  var Issuer: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The algorithm that was used to generate the public-private key pair. Valid values: RSA_2048 | RSA_1024 | RSA_4096 | EC_prime256v1 | EC_secp384r1 | EC_secp521r1 
    */
  var KeyAlgorithm: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A list of key usage X.509 v3 extension objects.
    */
  var KeyUsages: js.UndefOr[AwsCertificateManagerCertificateKeyUsages] = js.undefined
  
  /**
    * The time after which the certificate becomes invalid. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var NotAfter: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The time before which the certificate is not valid. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var NotBefore: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Provides a value that specifies whether to add the certificate to a transparency log.
    */
  var Options: js.UndefOr[AwsCertificateManagerCertificateOptions] = js.undefined
  
  /**
    * Whether the certificate is eligible for renewal. Valid values: ELIGIBLE | INELIGIBLE 
    */
  var RenewalEligibility: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the status of the AWS Certificate Manager managed renewal for the certificate. Provided only when the certificate type is AMAZON_ISSUED.
    */
  var RenewalSummary: js.UndefOr[AwsCertificateManagerCertificateRenewalSummary] = js.undefined
  
  /**
    * The serial number of the certificate.
    */
  var Serial: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The algorithm that was used to sign the certificate.
    */
  var SignatureAlgorithm: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of the certificate. Valid values: PENDING_VALIDATION | ISSUED | INACTIVE | EXPIRED | VALIDATION_TIMED_OUT | REVOKED | FAILED 
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the entity that is associated with the public key contained in the certificate.
    */
  var Subject: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * One or more domain names (subject alternative names) included in the certificate. This list contains the domain names that are bound to the public key that is contained in the certificate. The subject alternative names include the canonical domain name (CN) of the certificate and additional domain names that can be used to connect to the website.
    */
  var SubjectAlternativeNames: js.UndefOr[StringList] = js.undefined
  
  /**
    * The source of the certificate. For certificates that AWS Certificate Manager provides, Type is AMAZON_ISSUED. For certificates that are imported with ImportCertificate, Type is IMPORTED. Valid values: IMPORTED | AMAZON_ISSUED | PRIVATE 
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCertificateManagerCertificateDetails {
  
  @scala.inline
  def apply(): AwsCertificateManagerCertificateDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCertificateManagerCertificateDetails]
  }
  
  @scala.inline
  implicit class AwsCertificateManagerCertificateDetailsMutableBuilder[Self <: AwsCertificateManagerCertificateDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateAuthorityArn(value: NonEmptyString): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthorityArnUndefined: Self = StObject.set(x, "CertificateAuthorityArn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: NonEmptyString): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setDomainName(value: NonEmptyString): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    @scala.inline
    def setDomainValidationOptions(value: AwsCertificateManagerCertificateDomainValidationOptions): Self = StObject.set(x, "DomainValidationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainValidationOptionsUndefined: Self = StObject.set(x, "DomainValidationOptions", js.undefined)
    
    @scala.inline
    def setDomainValidationOptionsVarargs(value: AwsCertificateManagerCertificateDomainValidationOption*): Self = StObject.set(x, "DomainValidationOptions", js.Array(value :_*))
    
    @scala.inline
    def setExtendedKeyUsages(value: AwsCertificateManagerCertificateExtendedKeyUsages): Self = StObject.set(x, "ExtendedKeyUsages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedKeyUsagesUndefined: Self = StObject.set(x, "ExtendedKeyUsages", js.undefined)
    
    @scala.inline
    def setExtendedKeyUsagesVarargs(value: AwsCertificateManagerCertificateExtendedKeyUsage*): Self = StObject.set(x, "ExtendedKeyUsages", js.Array(value :_*))
    
    @scala.inline
    def setFailureReason(value: NonEmptyString): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setImportedAt(value: NonEmptyString): Self = StObject.set(x, "ImportedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportedAtUndefined: Self = StObject.set(x, "ImportedAt", js.undefined)
    
    @scala.inline
    def setInUseBy(value: StringList): Self = StObject.set(x, "InUseBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInUseByUndefined: Self = StObject.set(x, "InUseBy", js.undefined)
    
    @scala.inline
    def setInUseByVarargs(value: NonEmptyString*): Self = StObject.set(x, "InUseBy", js.Array(value :_*))
    
    @scala.inline
    def setIssuedAt(value: NonEmptyString): Self = StObject.set(x, "IssuedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuedAtUndefined: Self = StObject.set(x, "IssuedAt", js.undefined)
    
    @scala.inline
    def setIssuer(value: NonEmptyString): Self = StObject.set(x, "Issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerUndefined: Self = StObject.set(x, "Issuer", js.undefined)
    
    @scala.inline
    def setKeyAlgorithm(value: NonEmptyString): Self = StObject.set(x, "KeyAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyAlgorithmUndefined: Self = StObject.set(x, "KeyAlgorithm", js.undefined)
    
    @scala.inline
    def setKeyUsages(value: AwsCertificateManagerCertificateKeyUsages): Self = StObject.set(x, "KeyUsages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUsagesUndefined: Self = StObject.set(x, "KeyUsages", js.undefined)
    
    @scala.inline
    def setKeyUsagesVarargs(value: AwsCertificateManagerCertificateKeyUsage*): Self = StObject.set(x, "KeyUsages", js.Array(value :_*))
    
    @scala.inline
    def setNotAfter(value: NonEmptyString): Self = StObject.set(x, "NotAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotAfterUndefined: Self = StObject.set(x, "NotAfter", js.undefined)
    
    @scala.inline
    def setNotBefore(value: NonEmptyString): Self = StObject.set(x, "NotBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotBeforeUndefined: Self = StObject.set(x, "NotBefore", js.undefined)
    
    @scala.inline
    def setOptions(value: AwsCertificateManagerCertificateOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    @scala.inline
    def setRenewalEligibility(value: NonEmptyString): Self = StObject.set(x, "RenewalEligibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenewalEligibilityUndefined: Self = StObject.set(x, "RenewalEligibility", js.undefined)
    
    @scala.inline
    def setRenewalSummary(value: AwsCertificateManagerCertificateRenewalSummary): Self = StObject.set(x, "RenewalSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenewalSummaryUndefined: Self = StObject.set(x, "RenewalSummary", js.undefined)
    
    @scala.inline
    def setSerial(value: NonEmptyString): Self = StObject.set(x, "Serial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialUndefined: Self = StObject.set(x, "Serial", js.undefined)
    
    @scala.inline
    def setSignatureAlgorithm(value: NonEmptyString): Self = StObject.set(x, "SignatureAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureAlgorithmUndefined: Self = StObject.set(x, "SignatureAlgorithm", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setSubject(value: NonEmptyString): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectAlternativeNames(value: StringList): Self = StObject.set(x, "SubjectAlternativeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectAlternativeNamesUndefined: Self = StObject.set(x, "SubjectAlternativeNames", js.undefined)
    
    @scala.inline
    def setSubjectAlternativeNamesVarargs(value: NonEmptyString*): Self = StObject.set(x, "SubjectAlternativeNames", js.Array(value :_*))
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
    
    @scala.inline
    def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
