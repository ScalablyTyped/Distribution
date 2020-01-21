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
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateLoadBalancerRequest {
  @scala.inline
  def apply(
    instancePort: Port,
    loadBalancerName: ResourceName,
    certificateAlternativeNames: DomainNameList = null,
    certificateDomainName: DomainName = null,
    certificateName: ResourceName = null,
    healthCheckPath: String = null,
    tags: TagList = null
  ): CreateLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(instancePort = instancePort.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    if (certificateAlternativeNames != null) __obj.updateDynamic("certificateAlternativeNames")(certificateAlternativeNames.asInstanceOf[js.Any])
    if (certificateDomainName != null) __obj.updateDynamic("certificateDomainName")(certificateDomainName.asInstanceOf[js.Any])
    if (certificateName != null) __obj.updateDynamic("certificateName")(certificateName.asInstanceOf[js.Any])
    if (healthCheckPath != null) __obj.updateDynamic("healthCheckPath")(healthCheckPath.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoadBalancerRequest]
  }
}

