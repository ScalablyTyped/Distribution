package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCertificateManagerCertificateRenewalSummary extends js.Object {
  
  /**
    * Information about the validation of each domain name in the certificate, as it pertains to AWS Certificate Manager managed renewal. Provided only when the certificate type is AMAZON_ISSUED.
    */
  var DomainValidationOptions: js.UndefOr[AwsCertificateManagerCertificateDomainValidationOptions] = js.native
  
  /**
    * The status of the AWS Certificate Manager managed renewal of the certificate. Valid values: PENDING_AUTO_RENEWAL | PENDING_VALIDATION | SUCCESS | FAILED 
    */
  var RenewalStatus: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The reason that a renewal request was unsuccessful. Valid values: NO_AVAILABLE_CONTACTS | ADDITIONAL_VERIFICATION_REQUIRED | DOMAIN_NOT_ALLOWED | INVALID_PUBLIC_DOMAIN | DOMAIN_VALIDATION_DENIED | CAA_ERROR | PCA_LIMIT_EXCEEDED | PCA_INVALID_ARN | PCA_INVALID_STATE | PCA_REQUEST_FAILED | PCA_NAME_CONSTRAINTS_VALIDATION | PCA_RESOURCE_NOT_FOUND | PCA_INVALID_ARGS | PCA_INVALID_DURATION | PCA_ACCESS_DENIED | SLR_NOT_FOUND | OTHER 
    */
  var RenewalStatusReason: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when the renewal summary was last updated. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var UpdatedAt: js.UndefOr[NonEmptyString] = js.native
}
object AwsCertificateManagerCertificateRenewalSummary {
  
  @scala.inline
  def apply(): AwsCertificateManagerCertificateRenewalSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCertificateManagerCertificateRenewalSummary]
  }
  
  @scala.inline
  implicit class AwsCertificateManagerCertificateRenewalSummaryOps[Self <: AwsCertificateManagerCertificateRenewalSummary] (val x: Self) extends AnyVal {
    
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
    def setDomainValidationOptionsVarargs(value: AwsCertificateManagerCertificateDomainValidationOption*): Self = this.set("DomainValidationOptions", js.Array(value :_*))
    
    @scala.inline
    def setDomainValidationOptions(value: AwsCertificateManagerCertificateDomainValidationOptions): Self = this.set("DomainValidationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainValidationOptions: Self = this.set("DomainValidationOptions", js.undefined)
    
    @scala.inline
    def setRenewalStatus(value: NonEmptyString): Self = this.set("RenewalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenewalStatus: Self = this.set("RenewalStatus", js.undefined)
    
    @scala.inline
    def setRenewalStatusReason(value: NonEmptyString): Self = this.set("RenewalStatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenewalStatusReason: Self = this.set("RenewalStatusReason", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: NonEmptyString): Self = this.set("UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedAt: Self = this.set("UpdatedAt", js.undefined)
  }
}
