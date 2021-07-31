package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCertificateManagerCertificateRenewalSummary extends StObject {
  
  /**
    * Information about the validation of each domain name in the certificate, as it pertains to AWS Certificate Manager managed renewal. Provided only when the certificate type is AMAZON_ISSUED.
    */
  var DomainValidationOptions: js.UndefOr[AwsCertificateManagerCertificateDomainValidationOptions] = js.undefined
  
  /**
    * The status of the AWS Certificate Manager managed renewal of the certificate. Valid values: PENDING_AUTO_RENEWAL | PENDING_VALIDATION | SUCCESS | FAILED 
    */
  var RenewalStatus: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The reason that a renewal request was unsuccessful. Valid values: NO_AVAILABLE_CONTACTS | ADDITIONAL_VERIFICATION_REQUIRED | DOMAIN_NOT_ALLOWED | INVALID_PUBLIC_DOMAIN | DOMAIN_VALIDATION_DENIED | CAA_ERROR | PCA_LIMIT_EXCEEDED | PCA_INVALID_ARN | PCA_INVALID_STATE | PCA_REQUEST_FAILED | PCA_NAME_CONSTRAINTS_VALIDATION | PCA_RESOURCE_NOT_FOUND | PCA_INVALID_ARGS | PCA_INVALID_DURATION | PCA_ACCESS_DENIED | SLR_NOT_FOUND | OTHER 
    */
  var RenewalStatusReason: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates when the renewal summary was last updated. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var UpdatedAt: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCertificateManagerCertificateRenewalSummary {
  
  @scala.inline
  def apply(): AwsCertificateManagerCertificateRenewalSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCertificateManagerCertificateRenewalSummary]
  }
  
  @scala.inline
  implicit class AwsCertificateManagerCertificateRenewalSummaryMutableBuilder[Self <: AwsCertificateManagerCertificateRenewalSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainValidationOptions(value: AwsCertificateManagerCertificateDomainValidationOptions): Self = StObject.set(x, "DomainValidationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainValidationOptionsUndefined: Self = StObject.set(x, "DomainValidationOptions", js.undefined)
    
    @scala.inline
    def setDomainValidationOptionsVarargs(value: AwsCertificateManagerCertificateDomainValidationOption*): Self = StObject.set(x, "DomainValidationOptions", js.Array(value :_*))
    
    @scala.inline
    def setRenewalStatus(value: NonEmptyString): Self = StObject.set(x, "RenewalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenewalStatusReason(value: NonEmptyString): Self = StObject.set(x, "RenewalStatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenewalStatusReasonUndefined: Self = StObject.set(x, "RenewalStatusReason", js.undefined)
    
    @scala.inline
    def setRenewalStatusUndefined: Self = StObject.set(x, "RenewalStatus", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: NonEmptyString): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
