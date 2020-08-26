package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerTlsCertificateRenewalSummary extends js.Object {
  /**
    * Contains information about the validation of each domain name in the certificate, as it pertains to Lightsail's managed renewal. This is different from the initial validation that occurs as a result of the RequestCertificate request.
    */
  var domainValidationOptions: js.UndefOr[LoadBalancerTlsCertificateDomainValidationOptionList] = js.native
  /**
    * The renewal status of the certificate. The following renewal status are possible:     PendingAutoRenewal  - Lightsail is attempting to automatically validate the domain names of the certificate. No further action is required.      PendingValidation  - Lightsail couldn't automatically validate one or more domain names of the certificate. You must take action to validate these domain names or the certificate won't be renewed. Check to make sure your certificate's domain validation records exist in your domain's DNS, and that your certificate remains in use.     Success  - All domain names in the certificate are validated, and Lightsail renewed the certificate. No further action is required.      Failed  - One or more domain names were not validated before the certificate expired, and Lightsail did not renew the certificate. You can request a new certificate using the CreateCertificate action.  
    */
  var renewalStatus: js.UndefOr[LoadBalancerTlsCertificateRenewalStatus] = js.native
}

object LoadBalancerTlsCertificateRenewalSummary {
  @scala.inline
  def apply(): LoadBalancerTlsCertificateRenewalSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerTlsCertificateRenewalSummary]
  }
  @scala.inline
  implicit class LoadBalancerTlsCertificateRenewalSummaryOps[Self <: LoadBalancerTlsCertificateRenewalSummary] (val x: Self) extends AnyVal {
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
    def setDomainValidationOptionsVarargs(value: LoadBalancerTlsCertificateDomainValidationOption*): Self = this.set("domainValidationOptions", js.Array(value :_*))
    @scala.inline
    def setDomainValidationOptions(value: LoadBalancerTlsCertificateDomainValidationOptionList): Self = this.set("domainValidationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainValidationOptions: Self = this.set("domainValidationOptions", js.undefined)
    @scala.inline
    def setRenewalStatus(value: LoadBalancerTlsCertificateRenewalStatus): Self = this.set("renewalStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenewalStatus: Self = this.set("renewalStatus", js.undefined)
  }
  
}

