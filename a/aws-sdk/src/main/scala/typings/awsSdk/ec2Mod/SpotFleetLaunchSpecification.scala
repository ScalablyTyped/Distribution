package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotFleetLaunchSpecification extends js.Object {
  /**
    * Deprecated.
    */
  var AddressingType: js.UndefOr[String] = js.native
  /**
    * One or more block devices that are mapped to the Spot Instances. You can't specify both a snapshot ID and an encryption value. This is because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume, it is not blank and its encryption status is used for the volume encryption status.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.native
  /**
    * Indicates whether the instances are optimized for EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS Optimized instance. Default: false 
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.native
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification] = js.native
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[String] = js.native
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.native
  /**
    * The ID of the kernel.
    */
  var KernelId: js.UndefOr[String] = js.native
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[String] = js.native
  /**
    * Enable or disable monitoring for the instances.
    */
  var Monitoring: js.UndefOr[SpotFleetMonitoring] = js.native
  /**
    * One or more network interfaces. If you specify a network interface, you must specify subnet IDs and security group IDs using the network interface.
    */
  var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList] = js.native
  /**
    * The placement information.
    */
  var Placement: js.UndefOr[SpotPlacement] = js.native
  /**
    * The ID of the RAM disk. Some kernels require additional drivers at launch. Check the kernel requirements for information about whether you need to specify a RAM disk. To find kernel requirements, refer to the AWS Resource Center and search for the kernel ID.
    */
  var RamdiskId: js.UndefOr[String] = js.native
  /**
    * One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security groups. When requesting instances in EC2-Classic, you can specify the names or the IDs of the security groups.
    */
  var SecurityGroups: js.UndefOr[GroupIdentifierList] = js.native
  /**
    * The maximum price per unit hour that you are willing to pay for a Spot Instance. If this value is not specified, the default is the Spot price specified for the fleet. To determine the Spot price per unit hour, divide the Spot price by the value of WeightedCapacity.
    */
  var SpotPrice: js.UndefOr[String] = js.native
  /**
    * The IDs of the subnets in which to launch the instances. To specify multiple subnets, separate them using commas; for example, "subnet-1234abcdeexample1, subnet-0987cdef6example2".
    */
  var SubnetId: js.UndefOr[String] = js.native
  /**
    * The tags to apply during creation.
    */
  var TagSpecifications: js.UndefOr[SpotFleetTagSpecificationList] = js.native
  /**
    * The Base64-encoded user data that instances use when starting up.
    */
  var UserData: js.UndefOr[String] = js.native
  /**
    * The number of units provided by the specified instance type. These are the same units that you chose to set the target capacity in terms of instances, or a performance characteristic such as vCPUs, memory, or I/O. If the target capacity divided by this value is not a whole number, Amazon EC2 rounds the number of instances to the next whole number. If this value is not specified, the default is 1.
    */
  var WeightedCapacity: js.UndefOr[Double] = js.native
}

object SpotFleetLaunchSpecification {
  @scala.inline
  def apply(
    AddressingType: String = null,
    BlockDeviceMappings: BlockDeviceMappingList = null,
    EbsOptimized: js.UndefOr[Boolean] = js.undefined,
    IamInstanceProfile: IamInstanceProfileSpecification = null,
    ImageId: String = null,
    InstanceType: InstanceType = null,
    KernelId: String = null,
    KeyName: String = null,
    Monitoring: SpotFleetMonitoring = null,
    NetworkInterfaces: InstanceNetworkInterfaceSpecificationList = null,
    Placement: SpotPlacement = null,
    RamdiskId: String = null,
    SecurityGroups: GroupIdentifierList = null,
    SpotPrice: String = null,
    SubnetId: String = null,
    TagSpecifications: SpotFleetTagSpecificationList = null,
    UserData: String = null,
    WeightedCapacity: js.UndefOr[Double] = js.undefined
  ): SpotFleetLaunchSpecification = {
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
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    if (SpotPrice != null) __obj.updateDynamic("SpotPrice")(SpotPrice.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications.asInstanceOf[js.Any])
    if (UserData != null) __obj.updateDynamic("UserData")(UserData.asInstanceOf[js.Any])
    if (!js.isUndefined(WeightedCapacity)) __obj.updateDynamic("WeightedCapacity")(WeightedCapacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetLaunchSpecification]
  }
}

