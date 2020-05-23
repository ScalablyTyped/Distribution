package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstancePlacementRequest extends js.Object {
  /**
    * The affinity setting for the instance.
    */
  var Affinity: js.UndefOr[typings.awsSdk.ec2Mod.Affinity] = js.native
  /**
    * The name of the placement group in which to place the instance. For spread placement groups, the instance must have a tenancy of default. For cluster and partition placement groups, the instance must have a tenancy of default or dedicated. To remove an instance from a placement group, specify an empty string ("").
    */
  var GroupName: js.UndefOr[PlacementGroupName] = js.native
  /**
    * The ID of the Dedicated Host with which to associate the instance.
    */
  var HostId: js.UndefOr[DedicatedHostId] = js.native
  /**
    * The ARN of the host resource group in which to place the instance.
    */
  var HostResourceGroupArn: js.UndefOr[String] = js.native
  /**
    * The ID of the instance that you are modifying.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId = js.native
  /**
    * Reserved for future use.
    */
  var PartitionNumber: js.UndefOr[Integer] = js.native
  /**
    * The tenancy for the instance.
    */
  var Tenancy: js.UndefOr[HostTenancy] = js.native
}

object ModifyInstancePlacementRequest {
  @scala.inline
  def apply(
    InstanceId: InstanceId,
    Affinity: Affinity = null,
    GroupName: PlacementGroupName = null,
    HostId: DedicatedHostId = null,
    HostResourceGroupArn: String = null,
    PartitionNumber: js.UndefOr[Integer] = js.undefined,
    Tenancy: HostTenancy = null
  ): ModifyInstancePlacementRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    if (Affinity != null) __obj.updateDynamic("Affinity")(Affinity.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    if (HostId != null) __obj.updateDynamic("HostId")(HostId.asInstanceOf[js.Any])
    if (HostResourceGroupArn != null) __obj.updateDynamic("HostResourceGroupArn")(HostResourceGroupArn.asInstanceOf[js.Any])
    if (!js.isUndefined(PartitionNumber)) __obj.updateDynamic("PartitionNumber")(PartitionNumber.get.asInstanceOf[js.Any])
    if (Tenancy != null) __obj.updateDynamic("Tenancy")(Tenancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstancePlacementRequest]
  }
}

