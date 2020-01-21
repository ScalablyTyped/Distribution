package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailabilityZone extends js.Object {
  /**
    * [Network Load Balancers] If you need static IP addresses for your load balancer, you can specify one Elastic IP address per Availability Zone when you create an internal-facing load balancer. For internal load balancers, you can specify a private IP address from the IPv4 range of the subnet.
    */
  var LoadBalancerAddresses: js.UndefOr[typings.awsSdk.elbv2Mod.LoadBalancerAddresses] = js.native
  /**
    * The ID of the subnet. You can specify one subnet per Availability Zone.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.elbv2Mod.SubnetId] = js.native
  /**
    * The name of the Availability Zone.
    */
  var ZoneName: js.UndefOr[typings.awsSdk.elbv2Mod.ZoneName] = js.native
}

object AvailabilityZone {
  @scala.inline
  def apply(
    LoadBalancerAddresses: LoadBalancerAddresses = null,
    SubnetId: SubnetId = null,
    ZoneName: ZoneName = null
  ): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancerAddresses != null) __obj.updateDynamic("LoadBalancerAddresses")(LoadBalancerAddresses.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (ZoneName != null) __obj.updateDynamic("ZoneName")(ZoneName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailabilityZone]
  }
}

