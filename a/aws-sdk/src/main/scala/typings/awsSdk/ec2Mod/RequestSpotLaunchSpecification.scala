package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestSpotLaunchSpecification extends js.Object {
  /**
    * Deprecated.
    */
  var AddressingType: js.UndefOr[String] = js.native
  /**
    * One or more block device mapping entries. You can't specify both a snapshot ID and an encryption value. This is because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank and its encryption status is used for the volume encryption status.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.native
  /**
    * Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS Optimized instance. Default: false 
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.native
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification] = js.native
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[typings.awsSdk.ec2Mod.ImageId] = js.native
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.native
  /**
    * The ID of the kernel.
    */
  var KernelId: js.UndefOr[typings.awsSdk.ec2Mod.KernelId] = js.native
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[KeyPairName] = js.native
  /**
    * Indicates whether basic or detailed monitoring is enabled for the instance. Default: Disabled
    */
  var Monitoring: js.UndefOr[RunInstancesMonitoringEnabled] = js.native
  /**
    * One or more network interfaces. If you specify a network interface, you must specify subnet IDs and security group IDs using the network interface.
    */
  var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList] = js.native
  /**
    * The placement information for the instance.
    */
  var Placement: js.UndefOr[SpotPlacement] = js.native
  /**
    * The ID of the RAM disk.
    */
  var RamdiskId: js.UndefOr[typings.awsSdk.ec2Mod.RamdiskId] = js.native
  /**
    * One or more security group IDs.
    */
  var SecurityGroupIds: js.UndefOr[RequestSpotLaunchSpecificationSecurityGroupIdList] = js.native
  /**
    * One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security groups. When requesting instances in EC2-Classic, you can specify the names or the IDs of the security groups.
    */
  var SecurityGroups: js.UndefOr[RequestSpotLaunchSpecificationSecurityGroupList] = js.native
  /**
    * The IDs of the subnets in which to launch the instance. To specify multiple subnets, separate them using commas; for example, "subnet-1234abcdeexample1, subnet-0987cdef6example2".
    */
  var SubnetId: js.UndefOr[typings.awsSdk.ec2Mod.SubnetId] = js.native
  /**
    * The Base64-encoded user data for the instance. User data is limited to 16 KB.
    */
  var UserData: js.UndefOr[String] = js.native
}

object RequestSpotLaunchSpecification {
  @scala.inline
  def apply(
    AddressingType: String = null,
    BlockDeviceMappings: BlockDeviceMappingList = null,
    EbsOptimized: js.UndefOr[Boolean] = js.undefined,
    IamInstanceProfile: IamInstanceProfileSpecification = null,
    ImageId: ImageId = null,
    InstanceType: InstanceType = null,
    KernelId: KernelId = null,
    KeyName: KeyPairName = null,
    Monitoring: RunInstancesMonitoringEnabled = null,
    NetworkInterfaces: InstanceNetworkInterfaceSpecificationList = null,
    Placement: SpotPlacement = null,
    RamdiskId: RamdiskId = null,
    SecurityGroupIds: RequestSpotLaunchSpecificationSecurityGroupIdList = null,
    SecurityGroups: RequestSpotLaunchSpecificationSecurityGroupList = null,
    SubnetId: SubnetId = null,
    UserData: String = null
  ): RequestSpotLaunchSpecification = {
    val __obj = js.Dynamic.literal()
    if (AddressingType != null) __obj.updateDynamic("AddressingType")(AddressingType.asInstanceOf[js.Any])
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings.asInstanceOf[js.Any])
    if (!js.isUndefined(EbsOptimized)) __obj.updateDynamic("EbsOptimized")(EbsOptimized.get.asInstanceOf[js.Any])
    if (IamInstanceProfile != null) __obj.updateDynamic("IamInstanceProfile")(IamInstanceProfile.asInstanceOf[js.Any])
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (KernelId != null) __obj.updateDynamic("KernelId")(KernelId.asInstanceOf[js.Any])
    if (KeyName != null) __obj.updateDynamic("KeyName")(KeyName.asInstanceOf[js.Any])
    if (Monitoring != null) __obj.updateDynamic("Monitoring")(Monitoring.asInstanceOf[js.Any])
    if (NetworkInterfaces != null) __obj.updateDynamic("NetworkInterfaces")(NetworkInterfaces.asInstanceOf[js.Any])
    if (Placement != null) __obj.updateDynamic("Placement")(Placement.asInstanceOf[js.Any])
    if (RamdiskId != null) __obj.updateDynamic("RamdiskId")(RamdiskId.asInstanceOf[js.Any])
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (UserData != null) __obj.updateDynamic("UserData")(UserData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSpotLaunchSpecification]
  }
}

