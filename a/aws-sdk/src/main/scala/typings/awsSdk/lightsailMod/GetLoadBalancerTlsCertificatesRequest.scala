package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoadBalancerTlsCertificatesRequest extends js.Object {
  /**
    * The name of the load balancer you associated with your SSL/TLS certificate.
    */
  var loadBalancerName: ResourceName = js.native
}

object GetLoadBalancerTlsCertificatesRequest {
  @scala.inline
  def apply(loadBalancerName: ResourceName): GetLoadBalancerTlsCertificatesRequest = {
    val __obj = js.Dynamic.literal(loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancerTlsCertificatesRequest]
  }
}

