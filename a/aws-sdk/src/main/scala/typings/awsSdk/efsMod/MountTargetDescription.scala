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
}

object MountTargetDescription {
  @scala.inline
  def apply(
    FileSystemId: FileSystemId,
    LifeCycleState: LifeCycleState,
    MountTargetId: MountTargetId,
    SubnetId: SubnetId,
    AvailabilityZoneId: AvailabilityZoneId = null,
    AvailabilityZoneName: AvailabilityZoneName = null,
    IpAddress: IpAddress = null,
    NetworkInterfaceId: NetworkInterfaceId = null,
    OwnerId: AwsAccountId = null
  ): MountTargetDescription = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], LifeCycleState = LifeCycleState.asInstanceOf[js.Any], MountTargetId = MountTargetId.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
    if (AvailabilityZoneId != null) __obj.updateDynamic("AvailabilityZoneId")(AvailabilityZoneId.asInstanceOf[js.Any])
    if (AvailabilityZoneName != null) __obj.updateDynamic("AvailabilityZoneName")(AvailabilityZoneName.asInstanceOf[js.Any])
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountTargetDescription]
  }
}

