package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MountTargetDescription extends js.Object {
  /**
    * The unique and consistent identifier of the Availability Zone (AZ) that the mount target resides in. For example, use1-az1 is an AZ ID for the us-east-1 Region and it has the same location in every AWS account.
    */
  var AvailabilityZoneId: js.UndefOr[typings.awsSdk.efsMod.AvailabilityZoneId] = js.native
  /**
    * The name of the Availability Zone (AZ) that the mount target resides in. AZs are independently mapped to names for each AWS account. For example, the Availability Zone us-east-1a for your AWS account might not be the same location as us-east-1a for another AWS account.
    */
  var AvailabilityZoneName: js.UndefOr[typings.awsSdk.efsMod.AvailabilityZoneName] = js.native
  /**
    * The ID of the file system for which the mount target is intended.
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId = js.native
  /**
    * Address at which the file system can be mounted by using the mount target.
    */
  var IpAddress: js.UndefOr[typings.awsSdk.efsMod.IpAddress] = js.native
  /**
    * Lifecycle state of the mount target.
    */
  var LifeCycleState: typings.awsSdk.efsMod.LifeCycleState = js.native
  /**
    * System-assigned mount target ID.
    */
  var MountTargetId: typings.awsSdk.efsMod.MountTargetId = js.native
  /**
    * The ID of the network interface that Amazon EFS created when it created the mount target.
    */
  var NetworkInterfaceId: js.UndefOr[typings.awsSdk.efsMod.NetworkInterfaceId] = js.native
  /**
    * AWS account ID that owns the resource.
    */
  var OwnerId: js.UndefOr[AwsAccountId] = js.native
  /**
    * The ID of the mount target's subnet.
    */
  var SubnetId: typings.awsSdk.efsMod.SubnetId = js.native
  /**
    * The Virtual Private Cloud (VPC) ID that the mount target is configured in.
    */
  var VpcId: js.UndefOr[typings.awsSdk.efsMod.VpcId] = js.native
}

object MountTargetDescription {
  @scala.inline
  def apply(
    FileSystemId: FileSystemId,
    LifeCycleState: LifeCycleState,
    MountTargetId: MountTargetId,
    SubnetId: SubnetId
  ): MountTargetDescription = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], LifeCycleState = LifeCycleState.asInstanceOf[js.Any], MountTargetId = MountTargetId.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountTargetDescription]
  }
  @scala.inline
  implicit class MountTargetDescriptionOps[Self <: MountTargetDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = this.set("FileSystemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLifeCycleState(value: LifeCycleState): Self = this.set("LifeCycleState", value.asInstanceOf[js.Any])
    @scala.inline
    def setMountTargetId(value: MountTargetId): Self = this.set("MountTargetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailabilityZoneId(value: AvailabilityZoneId): Self = this.set("AvailabilityZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZoneId: Self = this.set("AvailabilityZoneId", js.undefined)
    @scala.inline
    def setAvailabilityZoneName(value: AvailabilityZoneName): Self = this.set("AvailabilityZoneName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZoneName: Self = this.set("AvailabilityZoneName", js.undefined)
    @scala.inline
    def setIpAddress(value: IpAddress): Self = this.set("IpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddress: Self = this.set("IpAddress", js.undefined)
    @scala.inline
    def setNetworkInterfaceId(value: NetworkInterfaceId): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("NetworkInterfaceId", js.undefined)
    @scala.inline
    def setOwnerId(value: AwsAccountId): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

