package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLoadBalancerRequest extends js.Object {
  /**
    * The optional alternative domains and subdomains to use with your SSL/TLS certificate (e.g., www.example.com, example.com, m.example.com, blog.example.com).
    */
  var certificateAlternativeNames: js.UndefOr[DomainNameList] = js.native
  /**
    * The domain name with which your certificate is associated (e.g., example.com). If you specify certificateDomainName, then certificateName is required (and vice-versa).
    */
  var certificateDomainName: js.UndefOr[DomainName] = js.native
  /**
    * The name of the SSL/TLS certificate. If you specify certificateName, then certificateDomainName is required (and vice-versa).
    */
  var certificateName: js.UndefOr[ResourceName] = js.native
  /**
    * The path you provided to perform the load balancer health check. If you didn't specify a health check path, Lightsail uses the root path of your website (e.g., "/"). You may want to specify a custom health check path other than the root of your application if your home page loads slowly or has a lot of media or scripting on it.
    */
  var healthCheckPath: js.UndefOr[String] = js.native
  /**
    * The instance port where you're creating your load balancer.
    */
  var instancePort: Port = js.native
  /**
    * The name of your load balancer.
    */
  var loadBalancerName: ResourceName = js.native
  /**
    * The tag keys and optional values to add to the resource during create. Use the TagResource action to tag a resource after it's created.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateLoadBalancerRequest {
  @scala.inline
  def apply(instancePort: Port, loadBalancerName: ResourceName): CreateLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(instancePort = instancePort.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoadBalancerRequest]
  }
  @scala.inline
  implicit class CreateLoadBalancerRequestOps[Self <: CreateLoadBalancerRequest] (val x: Self) extends AnyVal {
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
    def setInstancePort(value: Port): Self = this.set("instancePort", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadBalancerName(value: ResourceName): Self = this.set("loadBalancerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateAlternativeNamesVarargs(value: DomainName*): Self = this.set("certificateAlternativeNames", js.Array(value :_*))
    @scala.inline
    def setCertificateAlternativeNames(value: DomainNameList): Self = this.set("certificateAlternativeNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateAlternativeNames: Self = this.set("certificateAlternativeNames", js.undefined)
    @scala.inline
    def setCertificateDomainName(value: DomainName): Self = this.set("certificateDomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateDomainName: Self = this.set("certificateDomainName", js.undefined)
    @scala.inline
    def setCertificateName(value: ResourceName): Self = this.set("certificateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateName: Self = this.set("certificateName", js.undefined)
    @scala.inline
    def setHealthCheckPath(value: String): Self = this.set("healthCheckPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthCheckPath: Self = this.set("healthCheckPath", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

