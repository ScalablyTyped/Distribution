package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /**
    * A string map that contains the following information for the service that you specify in ServiceId:   The attributes that apply to the records that are defined in the service.    For each attribute, the applicable value.   Supported attribute keys include the following:  AWS_ALIAS_DNS_NAME     If you want AWS Cloud Map to create a Route 53 alias record that routes traffic to an Elastic Load Balancing load balancer, specify the DNS name that is associated with the load balancer. For information about how to get the DNS name, see "DNSName" in the topic AliasTarget. Note the following:   The configuration for the service that is specified by ServiceId must include settings for an A record, an AAAA record, or both.   In the service that is specified by ServiceId, the value of RoutingPolicy must be WEIGHTED.   If the service that is specified by ServiceId includes HealthCheckConfig settings, AWS Cloud Map will create the health check, but it won't associate the health check with the alias record.   Auto naming currently doesn't support creating alias records that route traffic to AWS resources other than ELB load balancers.   If you specify a value for AWS_ALIAS_DNS_NAME, don't specify values for any of the AWS_INSTANCE attributes.    AWS_INSTANCE_CNAME  If the service configuration includes a CNAME record, the domain name that you want Route 53 to return in response to DNS queries, for example, example.com. This value is required if the service specified by ServiceId includes settings for an CNAME record.  AWS_INSTANCE_IPV4  If the service configuration includes an A record, the IPv4 address that you want Route 53 to return in response to DNS queries, for example, 192.0.2.44. This value is required if the service specified by ServiceId includes settings for an A record. If the service includes settings for an SRV record, you must specify a value for AWS_INSTANCE_IPV4, AWS_INSTANCE_IPV6, or both.  AWS_INSTANCE_IPV6  If the service configuration includes an AAAA record, the IPv6 address that you want Route 53 to return in response to DNS queries, for example, 2001:0db8:85a3:0000:0000:abcd:0001:2345. This value is required if the service specified by ServiceId includes settings for an AAAA record. If the service includes settings for an SRV record, you must specify a value for AWS_INSTANCE_IPV4, AWS_INSTANCE_IPV6, or both.  AWS_INSTANCE_PORT  If the service includes an SRV record, the value that you want Route 53 to return for the port. If the service includes HealthCheckConfig, the port on the endpoint that you want Route 53 to send requests to.  This value is required if you specified settings for an SRV record when you created the service.
    */
  var Attributes: js.UndefOr[typings.awsSdk.servicediscoveryMod.Attributes] = js.native
  /**
    * A unique string that identifies the request and that allows failed RegisterInstance requests to be retried without the risk of executing the operation twice. You must use a unique CreatorRequestId string every time you submit a RegisterInstance request if you're registering additional instances for the same namespace and service. CreatorRequestId can be any unique string, for example, a date/time stamp.
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.native
  /**
    * An identifier that you want to associate with the instance. Note the following:   If the service that is specified by ServiceId includes settings for an SRV record, the value of InstanceId is automatically included as part of the value for the SRV record. For more information, see DnsRecord$Type.   You can use this value to update an existing instance.   To register a new instance, you must specify a value that is unique among instances that you register by using the same service.    If you specify an existing InstanceId and ServiceId, AWS Cloud Map updates the existing DNS records. If there's also an existing health check, AWS Cloud Map deletes the old health check and creates a new one.   The health check isn't deleted immediately, so it will still appear for a while if you submit a ListHealthChecks request, for example.   
    */
  var Id: ResourceId = js.native
}

object Instance {
  @scala.inline
  def apply(Id: ResourceId, Attributes: Attributes = null, CreatorRequestId: ResourceId = null): Instance = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

