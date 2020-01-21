package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLoadBalancerTlsCertificateRequest extends js.Object {
  /**
    * An array of strings listing alternative domains and subdomains for your SSL/TLS certificate. Lightsail will de-dupe the names for you. You can have a maximum of 9 alternative names (in addition to the 1 primary domain). We do not support wildcards (e.g., *.example.com).
    */
  var certificateAlternativeNames: js.UndefOr[DomainNameList] = js.native
  /**
    * The domain name (e.g., example.com) for your SSL/TLS certificate.
    */
  var certificateDomainName: DomainName = js.native
  /**
    * The SSL/TLS certificate name. You can have up to 10 certificates in your account at one time. Each Lightsail load balancer can have up to 2 certificates associated with it at one time. There is also an overall limit to the number of certificates that can be issue in a 365-day period. For more information, see Limits.
    */
  var certificateName: ResourceName = js.native
  /**
    * The load balancer name where you want to create the SSL/TLS certificate.
    */
  var loadBalancerName: ResourceName = js.native
  /**
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateLoadBalancerTlsCertificateRequest {
  @scala.inline
  def apply(
    certificateDomainName: DomainName,
    certificateName: ResourceName,
    loadBalancerName: ResourceName,
    certificateAlternativeNames: DomainNameList = null,
    tags: TagList = null
  ): CreateLoadBalancerTlsCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateDomainName = certificateDomainName.asInstanceOf[js.Any], certificateName = certificateName.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    if (certificateAlternativeNames != null) __obj.updateDynamic("certificateAlternativeNames")(certificateAlternativeNames.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoadBalancerTlsCertificateRequest]
  }
}

