package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceSummary extends js.Object {
  /**
    * A string map that contains the following information:   The attributes that are associate with the instance.    For each attribute, the applicable value.   Supported attribute keys include the following:    AWS_ALIAS_DNS_NAME: For an alias record that routes traffic to an Elastic Load Balancing load balancer, the DNS name that is associated with the load balancer.     AWS_INSTANCE_CNAME: For a CNAME record, the domain name that Route 53 returns in response to DNS queries, for example, example.com.    AWS_INSTANCE_IPV4: For an A record, the IPv4 address that Route 53 returns in response to DNS queries, for example, 192.0.2.44.    AWS_INSTANCE_IPV6: For an AAAA record, the IPv6 address that Route 53 returns in response to DNS queries, for example, 2001:0db8:85a3:0000:0000:abcd:0001:2345.    AWS_INSTANCE_PORT: For an SRV record, the value that Route 53 returns for the port. In addition, if the service includes HealthCheckConfig, the port on the endpoint that Route 53 sends requests to.  
    */
  var Attributes: js.UndefOr[typings.awsSdk.servicediscoveryMod.Attributes] = js.native
  /**
    * The ID for an instance that you created by using a specified service.
    */
  var Id: js.UndefOr[ResourceId] = js.native
}

object InstanceSummary {
  @scala.inline
  def apply(Attributes: Attributes = null, Id: ResourceId = null): InstanceSummary = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceSummary]
  }
}

