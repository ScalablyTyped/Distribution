package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledInstancesLaunchSpecification extends js.Object {
  /**
    * The block device mapping entries.
    */
  var BlockDeviceMappings: js.UndefOr[ScheduledInstancesBlockDeviceMappingSet] = js.native
  /**
    * Indicates whether the instances are optimized for EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS-optimized instance. Default: false 
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.native
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[ScheduledInstancesIamInstanceProfile] = js.native
  /**
    * The ID of the Amazon Machine Image (AMI).
    */
  var ImageId: typings.awsSdk.ec2Mod.ImageId = js.native
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The ID of the kernel.
    */
  var KernelId: js.UndefOr[typings.awsSdk.ec2Mod.KernelId] = js.native
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[KeyPairName] = js.native
  /**
    * Enable or disable monitoring for the instances.
    */
  var Monitoring: js.UndefOr[ScheduledInstancesMonitoring] = js.native
  /**
    * The network interfaces.
    */
  var NetworkInterfaces: js.UndefOr[ScheduledInstancesNetworkInterfaceSet] = js.native
  /**
    * The placement information.
    */
  var Placement: js.UndefOr[ScheduledInstancesPlacement] = js.native
  /**
    * The ID of the RAM disk.
    */
  var RamdiskId: js.UndefOr[typings.awsSdk.ec2Mod.RamdiskId] = js.native
  /**
    * The IDs of the security groups.
    */
  var SecurityGroupIds: js.UndefOr[ScheduledInstancesSecurityGroupIdSet] = js.native
  /**
    * The ID of the subnet in which to launch the instances.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.ec2Mod.SubnetId] = js.native
  /**
    * The base64-encoded MIME user data.
    */
  var UserData: js.UndefOr[String] = js.native
}

object ScheduledInstancesLaunchSpecification {
  @scala.inline
  def apply(
    ImageId: ImageId,
    BlockDeviceMappings: ScheduledInstancesBlockDeviceMappingSet = null,
    EbsOptimized: js.UndefOr[Boolean] = js.undefined,
    IamInstanceProfile: ScheduledInstancesIamInstanceProfile = null,
    InstanceType: String = null,
    KernelId: KernelId = null,
    KeyName: KeyPairName = null,
    Monitoring: ScheduledInstancesMonitoring = null,
    NetworkInterfaces: ScheduledInstancesNetworkInterfaceSet = null,
    Placement: ScheduledInstancesPlacement = null,
    RamdiskId: RamdiskId = null,
    SecurityGroupIds: ScheduledInstancesSecurityGroupIdSet = null,
    SubnetId: SubnetId = null,
    UserData: String = null
  ): ScheduledInstancesLaunchSpecification = {
    val __obj = js.Dynamic.literal(ImageId = ImageId.asInstanceOf[js.Any])
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings.asInstanceOf[js.Any])
    if (!js.isUndefined(EbsOptimized)) __obj.updateDynamic("EbsOptimized")(EbsOptimized.get.asInstanceOf[js.Any])
    if (IamInstanceProfile != null) __obj.updateDynamic("IamInstanceProfile")(IamInstanceProfile.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (KernelId != null) __obj.updateDynamic("KernelId")(KernelId.asInstanceOf[js.Any])
    if (KeyName != null) __obj.updateDynamic("KeyName")(KeyName.asInstanceOf[js.Any])
    if (Monitoring != null) __obj.updateDynamic("Monitoring")(Monitoring.asInstanceOf[js.Any])
    if (NetworkInterfaces != null) __obj.updateDynamic("NetworkInterfaces")(NetworkInterfaces.asInstanceOf[js.Any])
    if (Placement != null) __obj.updateDynamic("Placement")(Placement.asInstanceOf[js.Any])
    if (RamdiskId != null) __obj.updateDynamic("RamdiskId")(RamdiskId.asInstanceOf[js.Any])
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (UserData != null) __obj.updateDynamic("UserData")(UserData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledInstancesLaunchSpecification]
  }
}

