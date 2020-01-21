package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Placement extends js.Object {
  /**
    * The affinity setting for the instance on the Dedicated Host. This parameter is not supported for the ImportInstance command.
    */
  var Affinity: js.UndefOr[String] = js.native
  /**
    * The Availability Zone of the instance. If not specified, an Availability Zone will be automatically chosen for you based on the load balancing criteria for the Region.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The name of the placement group the instance is in.
    */
  var GroupName: js.UndefOr[String] = js.native
  /**
    * The ID of the Dedicated Host on which the instance resides. This parameter is not supported for the ImportInstance command.
    */
  var HostId: js.UndefOr[String] = js.native
  /**
    * The ARN of the host resource group in which to launch the instances. If you specify a host resource group ARN, omit the Tenancy parameter or set it to host.
    */
  var HostResourceGroupArn: js.UndefOr[String] = js.native
  /**
    * The number of the partition the instance is in. Valid only if the placement group strategy is set to partition.
    */
  var PartitionNumber: js.UndefOr[Integer] = js.native
  /**
    * Reserved for future use.
    */
  var SpreadDomain: js.UndefOr[String] = js.native
  /**
    * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware. The host tenancy is not supported for the ImportInstance command.
    */
  var Tenancy: js.UndefOr[typings.awsSdk.ec2Mod.Tenancy] = js.native
}

object Placement {
  @scala.inline
  def apply(
    Affinity: String = null,
    AvailabilityZone: String = null,
    GroupName: String = null,
    HostId: String = null,
    HostResourceGroupArn: String = null,
    PartitionNumber: Int | scala.Double = null,
    SpreadDomain: String = null,
    Tenancy: Tenancy = null
  ): Placement = {
    val __obj = js.Dynamic.literal()
    if (Affinity != null) __obj.updateDynamic("Affinity")(Affinity.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    if (HostId != null) __obj.updateDynamic("HostId")(HostId.asInstanceOf[js.Any])
    if (HostResourceGroupArn != null) __obj.updateDynamic("HostResourceGroupArn")(HostResourceGroupArn.asInstanceOf[js.Any])
    if (PartitionNumber != null) __obj.updateDynamic("PartitionNumber")(PartitionNumber.asInstanceOf[js.Any])
    if (SpreadDomain != null) __obj.updateDynamic("SpreadDomain")(SpreadDomain.asInstanceOf[js.Any])
    if (Tenancy != null) __obj.updateDynamic("Tenancy")(Tenancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placement]
  }
}

