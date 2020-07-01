package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagSpecification extends js.Object {
  /**
    * The type of resource to tag. Currently, the resource types that support tagging on creation are: capacity-reservation | client-vpn-endpoint | dedicated-host | dhcp-options | export-image-task | export-instance-task | fleet | fpga-image | host-reservation | import-image-task | import-snapshot-task | instance | internet-gateway | ipv4pool-ec2 | ipv6pool-ec2 | key-pair | launch-template | placement-group | prefix-list | launch-template | natgateway | network-acl | security-group | spot-fleet-request | snapshot | subnet | traffic-mirror-filter | traffic-mirror-session | traffic-mirror-target | transit-gateway | transit-gateway-attachment | transit-gateway-route-table | volume |vpc | vpc-endpoint (for interface and gateway endpoints) | vpc-endpoint-service (for AWS PrivateLink) | vpc-flow-log. To tag a resource after it has been created, see CreateTags.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.ec2Mod.ResourceType] = js.native
  /**
    * The tags to apply to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object TagSpecification {
  @scala.inline
  def apply(ResourceType: ResourceType = null, Tags: TagList = null): TagSpecification = {
    val __obj = js.Dynamic.literal()
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagSpecification]
  }
}

