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
    * The status of Lightsail's managed renewal of the certificate. Valid values are listed below.
    */
  var renewalStatus: js.UndefOr[LoadBalancerTlsCertificateRenewalStatus] = js.native
}

object LoadBalancerTlsCertificateRenewalSummary {
  @scala.inline
  def apply(
    domainValidationOptions: LoadBalancerTlsCertificateDomainValidationOptionList = null,
    renewalStatus: LoadBalancerTlsCertificateRenewalStatus = null
  ): LoadBalancerTlsCertificateRenewalSummary = {
    val __obj = js.Dynamic.literal()
    if (domainValidationOptions != null) __obj.updateDynamic("domainValidationOptions")(domainValidationOptions.asInstanceOf[js.Any])
    if (renewalStatus != null) __obj.updateDynamic("renewalStatus")(renewalStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerTlsCertificateRenewalSummary]
  }
}

