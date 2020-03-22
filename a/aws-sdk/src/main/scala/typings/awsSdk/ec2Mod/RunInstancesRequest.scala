package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunInstancesRequest extends js.Object {
  /**
    * Reserved.
    */
  var AdditionalInfo: js.UndefOr[String] = js.native
  /**
    * The block device mapping entries.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingRequestList] = js.native
  /**
    * Information about the Capacity Reservation targeting option. If you do not specify this parameter, the instance's Capacity Reservation preference defaults to open, which enables it to run in any open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone).
    */
  var CapacityReservationSpecification: js.UndefOr[typings.awsSdk.ec2Mod.CapacityReservationSpecification] = js.native
  /**
    * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not specify a client token, a randomly generated token is used for the request to ensure idempotency. For more information, see Ensuring Idempotency. Constraints: Maximum 64 ASCII characters
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The CPU options for the instance. For more information, see Optimizing CPU Options in the Amazon Elastic Compute Cloud User Guide.
    */
  var CpuOptions: js.UndefOr[CpuOptionsRequest] = js.native
  /**
    * The credit option for CPU usage of the burstable performance instance. Valid values are standard and unlimited. To change this attribute after launch, use  ModifyInstanceCreditSpecification. For more information, see Burstable Performance Instances in the Amazon Elastic Compute Cloud User Guide. Default: standard (T2 instances) or unlimited (T3/T3a instances)
    */
  var CreditSpecification: js.UndefOr[CreditSpecificationRequest] = js.native
  /**
    * If you set this parameter to true, you can't terminate the instance using the Amazon EC2 console, CLI, or API; otherwise, you can. To change this attribute after launch, use ModifyInstanceAttribute. Alternatively, if you set InstanceInitiatedShutdownBehavior to terminate, you can terminate the instance by running the shutdown command from the instance. Default: false 
    */
  var DisableApiTermination: js.UndefOr[Boolean] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS-optimized instance. Default: false 
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.native
  /**
    * An elastic GPU to associate with the instance. An Elastic GPU is a GPU resource that you can attach to your Windows instance to accelerate the graphics performance of your applications. For more information, see  Amazon EC2 Elastic GPUs in the Amazon Elastic Compute Cloud User Guide.
    */
  var ElasticGpuSpecification: js.UndefOr[ElasticGpuSpecifications] = js.native
  /**
    * An elastic inference accelerator to associate with the instance. Elastic inference accelerators are a resource you can attach to your Amazon EC2 instances to accelerate your Deep Learning (DL) inference workloads.
    */
  var ElasticInferenceAccelerators: js.UndefOr[typings.awsSdk.ec2Mod.ElasticInferenceAccelerators] = js.native
  /**
    * Indicates whether an instance is enabled for hibernation. For more information, see Hibernate Your Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  var HibernationOptions: js.UndefOr[HibernationOptionsRequest] = js.native
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification] = js.native
  /**
    * The ID of the AMI. An AMI ID is required to launch an instance and must be specified here or in a launch template.
    */
  var ImageId: js.UndefOr[typings.awsSdk.ec2Mod.ImageId] = js.native
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown). Default: stop 
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.native
  /**
    * The market (purchasing) option for the instances. For RunInstances, persistent Spot Instance requests are only supported when InstanceInterruptionBehavior is set to either hibernate or stop.
    */
  var InstanceMarketOptions: js.UndefOr[InstanceMarketOptionsRequest] = js.native
  /**
    * The instance type. For more information, see Instance Types in the Amazon Elastic Compute Cloud User Guide. Default: m1.small 
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.native
  /**
    * [EC2-VPC] The number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses the IPv6 addresses from the range of your subnet. You cannot specify this option and the option to assign specific IPv6 addresses in the same request. You can specify this option if you've specified a minimum number of instances to launch. You cannot specify this option and the network interfaces option in the same request.
    */
  var Ipv6AddressCount: js.UndefOr[Integer] = js.native
  /**
    * [EC2-VPC] The IPv6 addresses from the range of the subnet to associate with the primary network interface. You cannot specify this option and the option to assign a number of IPv6 addresses in the same request. You cannot specify this option if you've specified a minimum number of instances to launch. You cannot specify this option and the network interfaces option in the same request.
    */
  var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.native
  /**
    * The ID of the kernel.  We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see  PV-GRUB in the Amazon Elastic Compute Cloud User Guide. 
    */
  var KernelId: js.UndefOr[String] = js.native
  /**
    * The name of the key pair. You can create a key pair using CreateKeyPair or ImportKeyPair.  If you do not specify a key pair, you can't connect to the instance unless you choose an AMI that is configured to allow users another way to log in. 
    */
  var KeyName: js.UndefOr[KeyPairName] = js.native
  /**
    * The launch template to use to launch the instances. Any parameters that you specify in RunInstances override the same parameters in the launch template. You can specify either the name or ID of a launch template, but not both.
    */
  var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.native
  /**
    * The license configurations.
    */
  var LicenseSpecifications: js.UndefOr[LicenseSpecificationListRequest] = js.native
  /**
    * The maximum number of instances to launch. If you specify more instances than Amazon EC2 can launch in the target Availability Zone, Amazon EC2 launches the largest possible number of instances above MinCount. Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more information about the default limits, and how to request an increase, see How many instances can I run in Amazon EC2 in the Amazon EC2 FAQ.
    */
  var MaxCount: Integer = js.native
  /**
    * The metadata options for the instance. For more information, see Instance Metadata and User Data.
    */
  var MetadataOptions: js.UndefOr[InstanceMetadataOptionsRequest] = js.native
  /**
    * The minimum number of instances to launch. If you specify a minimum that is more instances than Amazon EC2 can launch in the target Availability Zone, Amazon EC2 launches no instances. Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more information about the default limits, and how to request an increase, see How many instances can I run in Amazon EC2 in the Amazon EC2 General FAQ.
    */
  var MinCount: Integer = js.native
  /**
    * Specifies whether detailed monitoring is enabled for the instance.
    */
  var Monitoring: js.UndefOr[RunInstancesMonitoringEnabled] = js.native
  /**
    * The network interfaces to associate with the instance. If you specify a network interface, you must specify any security groups and subnets as part of the network interface.
    */
  var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList] = js.native
  /**
    * The placement for the instance.
    */
  var Placement: js.UndefOr[typings.awsSdk.ec2Mod.Placement] = js.native
  /**
    * [EC2-VPC] The primary IPv4 address. You must specify a value from the IPv4 address range of the subnet. Only one private IP address can be designated as primary. You can't specify this option if you've specified the option to designate a private IP address as the primary IP address in a network interface specification. You cannot specify this option if you're launching more than one instance in the request. You cannot specify this option and the network interfaces option in the same request.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  /**
    * The ID of the RAM disk to select. Some kernels require additional drivers at launch. Check the kernel requirements for information about whether you need to specify a RAM disk. To find kernel requirements, go to the AWS Resource Center and search for the kernel ID.  We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see  PV-GRUB in the Amazon Elastic Compute Cloud User Guide. 
    */
  var RamdiskId: js.UndefOr[String] = js.native
  /**
    * The IDs of the security groups. You can create a security group using CreateSecurityGroup. If you specify a network interface, you must specify any security groups as part of the network interface.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdStringList] = js.native
  /**
    * [EC2-Classic, default VPC] The names of the security groups. For a nondefault VPC, you must use security group IDs instead. If you specify a network interface, you must specify any security groups as part of the network interface. Default: Amazon EC2 uses the default security group.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupStringList] = js.native
  /**
    * [EC2-VPC] The ID of the subnet to launch the instance into. If you specify a network interface, you must specify any subnets as part of the network interface.
    */
  var SubnetId: js.UndefOr[String] = js.native
  /**
    * The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The specified tags are applied to all instances or volumes that are created during launch. To tag a resource after it has been created, see CreateTags.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  /**
    * The user data to make available to the instance. For more information, see Running Commands on Your Linux Instance at Launch (Linux) and Adding User Data (Windows). If you are using a command line tool, base64-encoding is performed for you, and you can load the text from a file. Otherwise, you must provide base64-encoded text. User data is limited to 16 KB.
    */
  var UserData: js.UndefOr[String] = js.native
}

object RunInstancesRequest {
  @scala.inline
  def apply(
    MaxCount: Integer,
    MinCount: Integer,
    AdditionalInfo: String = null,
    BlockDeviceMappings: BlockDeviceMappingRequestList = null,
    CapacityReservationSpecification: CapacityReservationSpecification = null,
    ClientToken: String = null,
    CpuOptions: CpuOptionsRequest = null,
    CreditSpecification: CreditSpecificationRequest = null,
    DisableApiTermination: js.UndefOr[scala.Boolean] = js.undefined,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    EbsOptimized: js.UndefOr[scala.Boolean] = js.undefined,
    ElasticGpuSpecification: ElasticGpuSpecifications = null,
    ElasticInferenceAccelerators: ElasticInferenceAccelerators = null,
    HibernationOptions: HibernationOptionsRequest = null,
    IamInstanceProfile: IamInstanceProfileSpecification = null,
    ImageId: ImageId = null,
    InstanceInitiatedShutdownBehavior: ShutdownBehavior = null,
    InstanceMarketOptions: InstanceMarketOptionsRequest = null,
    InstanceType: InstanceType = null,
    Ipv6AddressCount: Int | scala.Double = null,
    Ipv6Addresses: InstanceIpv6AddressList = null,
    KernelId: String = null,
    KeyName: KeyPairName = null,
    LaunchTemplate: LaunchTemplateSpecification = null,
    LicenseSpecifications: LicenseSpecificationListRequest = null,
    MetadataOptions: InstanceMetadataOptionsRequest = null,
    Monitoring: RunInstancesMonitoringEnabled = null,
    NetworkInterfaces: InstanceNetworkInterfaceSpecificationList = null,
    Placement: Placement = null,
    PrivateIpAddress: String = null,
    RamdiskId: String = null,
    SecurityGroupIds: SecurityGroupIdStringList = null,
    SecurityGroups: SecurityGroupStringList = null,
    SubnetId: String = null,
    TagSpecifications: TagSpecificationList = null,
    UserData: String = null
  ): RunInstancesRequest = {
    val __obj = js.Dynamic.literal(MaxCount = MaxCount.asInstanceOf[js.Any], MinCount = MinCount.asInstanceOf[js.Any])
    if (AdditionalInfo != null) __obj.updateDynamic("AdditionalInfo")(AdditionalInfo.asInstanceOf[js.Any])
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings.asInstanceOf[js.Any])
    if (CapacityReservationSpecification != null) __obj.updateDynamic("CapacityReservationSpecification")(CapacityReservationSpecification.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (CpuOptions != null) __obj.updateDynamic("CpuOptions")(CpuOptions.asInstanceOf[js.Any])
    if (CreditSpecification != null) __obj.updateDynamic("CreditSpecification")(CreditSpecification.asInstanceOf[js.Any])
    if (!js.isUndefined(DisableApiTermination)) __obj.updateDynamic("DisableApiTermination")(DisableApiTermination.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (!js.isUndefined(EbsOptimized)) __obj.updateDynamic("EbsOptimized")(EbsOptimized.asInstanceOf[js.Any])
    if (ElasticGpuSpecification != null) __obj.updateDynamic("ElasticGpuSpecification")(ElasticGpuSpecification.asInstanceOf[js.Any])
    if (ElasticInferenceAccelerators != null) __obj.updateDynamic("ElasticInferenceAccelerators")(ElasticInferenceAccelerators.asInstanceOf[js.Any])
    if (HibernationOptions != null) __obj.updateDynamic("HibernationOptions")(HibernationOptions.asInstanceOf[js.Any])
    if (IamInstanceProfile != null) __obj.updateDynamic("IamInstanceProfile")(IamInstanceProfile.asInstanceOf[js.Any])
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId.asInstanceOf[js.Any])
    if (InstanceInitiatedShutdownBehavior != null) __obj.updateDynamic("InstanceInitiatedShutdownBehavior")(InstanceInitiatedShutdownBehavior.asInstanceOf[js.Any])
    if (InstanceMarketOptions != null) __obj.updateDynamic("InstanceMarketOptions")(InstanceMarketOptions.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (Ipv6AddressCount != null) __obj.updateDynamic("Ipv6AddressCount")(Ipv6AddressCount.asInstanceOf[js.Any])
    if (Ipv6Addresses != null) __obj.updateDynamic("Ipv6Addresses")(Ipv6Addresses.asInstanceOf[js.Any])
    if (KernelId != null) __obj.updateDynamic("KernelId")(KernelId.asInstanceOf[js.Any])
    if (KeyName != null) __obj.updateDynamic("KeyName")(KeyName.asInstanceOf[js.Any])
    if (LaunchTemplate != null) __obj.updateDynamic("LaunchTemplate")(LaunchTemplate.asInstanceOf[js.Any])
    if (LicenseSpecifications != null) __obj.updateDynamic("LicenseSpecifications")(LicenseSpecifications.asInstanceOf[js.Any])
    if (MetadataOptions != null) __obj.updateDynamic("MetadataOptions")(MetadataOptions.asInstanceOf[js.Any])
    if (Monitoring != null) __obj.updateDynamic("Monitoring")(Monitoring.asInstanceOf[js.Any])
    if (NetworkInterfaces != null) __obj.updateDynamic("NetworkInterfaces")(NetworkInterfaces.asInstanceOf[js.Any])
    if (Placement != null) __obj.updateDynamic("Placement")(Placement.asInstanceOf[js.Any])
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress.asInstanceOf[js.Any])
    if (RamdiskId != null) __obj.updateDynamic("RamdiskId")(RamdiskId.asInstanceOf[js.Any])
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications.asInstanceOf[js.Any])
    if (UserData != null) __obj.updateDynamic("UserData")(UserData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunInstancesRequest]
  }
}

