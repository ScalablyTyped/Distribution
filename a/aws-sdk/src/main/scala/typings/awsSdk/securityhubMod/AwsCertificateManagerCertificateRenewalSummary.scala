package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCertificateManagerCertificateRenewalSummary extends StObject {
  
  /**
    * Information about the validation of each domain name in the certificate, as it pertains to Certificate Manager managed renewal. Provided only when the certificate type is AMAZON_ISSUED.
    */
  var DomainValidationOptions: js.UndefOr[AwsCertificateManagerCertificateDomainValidationOptions] = js.undefined
  
  /**
    * The status of the Certificate Manager managed renewal of the certificate. Valid values: PENDING_AUTO_RENEWAL | PENDING_VALIDATION | SUCCESS | FAILED 
    */
  var RenewalStatus: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The reason that a renewal request was unsuccessful. This attribute is used only when RenewalStatus is FAILED. Valid values: NO_AVAILABLE_CONTACTS | ADDITIONAL_VERIFICATION_REQUIRED | DOMAIN_NOT_ALLOWED | INVALID_PUBLIC_DOMAIN | DOMAIN_VALIDATION_DENIED | CAA_ERROR | PCA_LIMIT_EXCEEDED | PCA_INVALID_ARN | PCA_INVALID_STATE | PCA_REQUEST_FAILED | PCA_NAME_CONSTRAINTS_VALIDATION | PCA_RESOURCE_NOT_FOUND | PCA_INVALID_ARGS | PCA_INVALID_DURATION | PCA_ACCESS_DENIED | SLR_NOT_FOUND | OTHER 
    */
  var RenewalStatusReason: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates when the renewal summary was last updated. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var UpdatedAt: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCertificateManagerCertificateRenewalSummary {
  
  inline def apply(): AwsCertificateManagerCertificateRenewalSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCertificateManagerCertificateRenewalSummary]
  }
  
  extension [Self <: AwsCertificateManagerCertificateRenewalSummary](x: Self) {
    
    inline def setDomainValidationOptions(value: AwsCertificateManagerCertificateDomainValidationOptions): Self = StObject.set(x, "DomainValidationOptions", value.asInstanceOf[js.Any])
    
    inline def setDomainValidationOptionsUndefined: Self = StObject.set(x, "DomainValidationOptions", js.undefined)
    
    inline def setDomainValidationOptionsVarargs(value: AwsCertificateManagerCertificateDomainValidationOption*): Self = StObject.set(x, "DomainValidationOptions", js.Array(value*))
    
    inline def setRenewalStatus(value: NonEmptyString): Self = StObject.set(x, "RenewalStatus", value.asInstanceOf[js.Any])
    
    inline def setRenewalStatusReason(value: NonEmptyString): Self = StObject.set(x, "RenewalStatusReason", value.asInstanceOf[js.Any])
    
    inline def setRenewalStatusReasonUndefined: Self = StObject.set(x, "RenewalStatusReason", js.undefined)
    
    inline def setRenewalStatusUndefined: Self = StObject.set(x, "RenewalStatus", js.undefined)
    
    inline def setUpdatedAt(value: NonEmptyString): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
