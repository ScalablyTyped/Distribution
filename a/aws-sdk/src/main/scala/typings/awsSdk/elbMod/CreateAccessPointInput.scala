package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccessPointInput extends js.Object {
  /**
    * One or more Availability Zones from the same region as the load balancer. You must specify at least one Availability Zone. You can add more Availability Zones after you create the load balancer using EnableAvailabilityZonesForLoadBalancer.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.elbMod.AvailabilityZones] = js.native
  /**
    * The listeners. For more information, see Listeners for Your Classic Load Balancer in the Classic Load Balancers Guide.
    */
  var Listeners: typings.awsSdk.elbMod.Listeners = js.native
  /**
    * The name of the load balancer. This name must be unique within your set of load balancers for the region, must have a maximum of 32 characters, must contain only alphanumeric characters or hyphens, and cannot begin or end with a hyphen.
    */
  var LoadBalancerName: AccessPointName = js.native
  /**
    * The type of a load balancer. Valid only for load balancers in a VPC. By default, Elastic Load Balancing creates an Internet-facing load balancer with a DNS name that resolves to public IP addresses. For more information about Internet-facing and Internal load balancers, see Load Balancer Scheme in the Elastic Load Balancing User Guide. Specify internal to create a load balancer with a DNS name that resolves to private IP addresses.
    */
  var Scheme: js.UndefOr[LoadBalancerScheme] = js.native
  /**
    * The IDs of the security groups to assign to the load balancer.
    */
  var SecurityGroups: js.UndefOr[typings.awsSdk.elbMod.SecurityGroups] = js.native
  /**
    * The IDs of the subnets in your VPC to attach to the load balancer. Specify one subnet per Availability Zone specified in AvailabilityZones.
    */
  var Subnets: js.UndefOr[typings.awsSdk.elbMod.Subnets] = js.native
  /**
    * A list of tags to assign to the load balancer. For more information about tagging your load balancer, see Tag Your Classic Load Balancer in the Classic Load Balancers Guide.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateAccessPointInput {
  @scala.inline
  def apply(
    Listeners: Listeners,
    LoadBalancerName: AccessPointName,
    AvailabilityZones: AvailabilityZones = null,
    Scheme: LoadBalancerScheme = null,
    SecurityGroups: SecurityGroups = null,
    Subnets: Subnets = null,
    Tags: TagList = null
  ): CreateAccessPointInput = {
    val __obj = js.Dynamic.literal(Listeners = Listeners.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (Scheme != null) __obj.updateDynamic("Scheme")(Scheme.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessPointInput]
  }
}

