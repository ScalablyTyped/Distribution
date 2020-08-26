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
    * The tag keys and optional values to add to the resource during create. Use the TagResource action to tag a resource after it's created.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateLoadBalancerTlsCertificateRequest {
  @scala.inline
  def apply(certificateDomainName: DomainName, certificateName: ResourceName, loadBalancerName: ResourceName): CreateLoadBalancerTlsCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateDomainName = certificateDomainName.asInstanceOf[js.Any], certificateName = certificateName.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoadBalancerTlsCertificateRequest]
  }
  @scala.inline
  implicit class CreateLoadBalancerTlsCertificateRequestOps[Self <: CreateLoadBalancerTlsCertificateRequest] (val x: Self) extends AnyVal {
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
    def setCertificateDomainName(value: DomainName): Self = this.set("certificateDomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateName(value: ResourceName): Self = this.set("certificateName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadBalancerName(value: ResourceName): Self = this.set("loadBalancerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateAlternativeNamesVarargs(value: DomainName*): Self = this.set("certificateAlternativeNames", js.Array(value :_*))
    @scala.inline
    def setCertificateAlternativeNames(value: DomainNameList): Self = this.set("certificateAlternativeNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateAlternativeNames: Self = this.set("certificateAlternativeNames", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

