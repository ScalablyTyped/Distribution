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
  def apply(InstanceId: InstanceId): ModifyInstancePlacementRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstancePlacementRequest]
  }
  @scala.inline
  implicit class ModifyInstancePlacementRequestOps[Self <: ModifyInstancePlacementRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAffinity(value: Affinity): Self = this.set("Affinity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAffinity: Self = this.set("Affinity", js.undefined)
    @scala.inline
    def setGroupName(value: PlacementGroupName): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
    @scala.inline
    def setHostId(value: DedicatedHostId): Self = this.set("HostId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostId: Self = this.set("HostId", js.undefined)
    @scala.inline
    def setHostResourceGroupArn(value: String): Self = this.set("HostResourceGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostResourceGroupArn: Self = this.set("HostResourceGroupArn", js.undefined)
    @scala.inline
    def setPartitionNumber(value: Integer): Self = this.set("PartitionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartitionNumber: Self = this.set("PartitionNumber", js.undefined)
    @scala.inline
    def setTenancy(value: HostTenancy): Self = this.set("Tenancy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTenancy: Self = this.set("Tenancy", js.undefined)
  }
  
}

