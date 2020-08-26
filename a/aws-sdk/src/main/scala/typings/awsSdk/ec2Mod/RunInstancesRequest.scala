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
    * The CPU options for the instance. For more information, see Optimizing CPU options in the Amazon Elastic Compute Cloud User Guide.
    */
  var CpuOptions: js.UndefOr[CpuOptionsRequest] = js.native
  /**
    * The credit option for CPU usage of the burstable performance instance. Valid values are standard and unlimited. To change this attribute after launch, use  ModifyInstanceCreditSpecification. For more information, see Burstable performance instances in the Amazon Elastic Compute Cloud User Guide. Default: standard (T2 instances) or unlimited (T3/T3a instances)
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
    * An elastic inference accelerator to associate with the instance. Elastic inference accelerators are a resource you can attach to your Amazon EC2 instances to accelerate your Deep Learning (DL) inference workloads. You cannot specify accelerators from different generations in the same request.
    */
  var ElasticInferenceAccelerators: js.UndefOr[typings.awsSdk.ec2Mod.ElasticInferenceAccelerators] = js.native
  /**
    * Indicates whether an instance is enabled for hibernation. For more information, see Hibernate your instance in the Amazon Elastic Compute Cloud User Guide.
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
    * The instance type. For more information, see Instance types in the Amazon Elastic Compute Cloud User Guide. Default: m1.small 
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
  var KernelId: js.UndefOr[typings.awsSdk.ec2Mod.KernelId] = js.native
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
    * The metadata options for the instance. For more information, see Instance metadata and user data.
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
  var RamdiskId: js.UndefOr[typings.awsSdk.ec2Mod.RamdiskId] = js.native
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
  var SubnetId: js.UndefOr[typings.awsSdk.ec2Mod.SubnetId] = js.native
  /**
    * The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The specified tags are applied to all instances or volumes that are created during launch. To tag a resource after it has been created, see CreateTags.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  /**
    * The user data to make available to the instance. For more information, see Running commands on your Linux instance at launch (Linux) and Adding User Data (Windows). If you are using a command line tool, base64-encoding is performed for you, and you can load the text from a file. Otherwise, you must provide base64-encoded text. User data is limited to 16 KB.
    */
  var UserData: js.UndefOr[String] = js.native
}

object RunInstancesRequest {
  @scala.inline
  def apply(MaxCount: Integer, MinCount: Integer): RunInstancesRequest = {
    val __obj = js.Dynamic.literal(MaxCount = MaxCount.asInstanceOf[js.Any], MinCount = MinCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunInstancesRequest]
  }
  @scala.inline
  implicit class RunInstancesRequestOps[Self <: RunInstancesRequest] (val x: Self) extends AnyVal {
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
    def setMaxCount(value: Integer): Self = this.set("MaxCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinCount(value: Integer): Self = this.set("MinCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdditionalInfo(value: String): Self = this.set("AdditionalInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalInfo: Self = this.set("AdditionalInfo", js.undefined)
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: BlockDeviceMapping*): Self = this.set("BlockDeviceMappings", js.Array(value :_*))
    @scala.inline
    def setBlockDeviceMappings(value: BlockDeviceMappingRequestList): Self = this.set("BlockDeviceMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockDeviceMappings: Self = this.set("BlockDeviceMappings", js.undefined)
    @scala.inline
    def setCapacityReservationSpecification(value: CapacityReservationSpecification): Self = this.set("CapacityReservationSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityReservationSpecification: Self = this.set("CapacityReservationSpecification", js.undefined)
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    @scala.inline
    def setCpuOptions(value: CpuOptionsRequest): Self = this.set("CpuOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpuOptions: Self = this.set("CpuOptions", js.undefined)
    @scala.inline
    def setCreditSpecification(value: CreditSpecificationRequest): Self = this.set("CreditSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreditSpecification: Self = this.set("CreditSpecification", js.undefined)
    @scala.inline
    def setDisableApiTermination(value: Boolean): Self = this.set("DisableApiTermination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableApiTermination: Self = this.set("DisableApiTermination", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setEbsOptimized(value: Boolean): Self = this.set("EbsOptimized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsOptimized: Self = this.set("EbsOptimized", js.undefined)
    @scala.inline
    def setElasticGpuSpecificationVarargs(value: ElasticGpuSpecification*): Self = this.set("ElasticGpuSpecification", js.Array(value :_*))
    @scala.inline
    def setElasticGpuSpecification(value: ElasticGpuSpecifications): Self = this.set("ElasticGpuSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticGpuSpecification: Self = this.set("ElasticGpuSpecification", js.undefined)
    @scala.inline
    def setElasticInferenceAcceleratorsVarargs(value: ElasticInferenceAccelerator*): Self = this.set("ElasticInferenceAccelerators", js.Array(value :_*))
    @scala.inline
    def setElasticInferenceAccelerators(value: ElasticInferenceAccelerators): Self = this.set("ElasticInferenceAccelerators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticInferenceAccelerators: Self = this.set("ElasticInferenceAccelerators", js.undefined)
    @scala.inline
    def setHibernationOptions(value: HibernationOptionsRequest): Self = this.set("HibernationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHibernationOptions: Self = this.set("HibernationOptions", js.undefined)
    @scala.inline
    def setIamInstanceProfile(value: IamInstanceProfileSpecification): Self = this.set("IamInstanceProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamInstanceProfile: Self = this.set("IamInstanceProfile", js.undefined)
    @scala.inline
    def setImageId(value: ImageId): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageId: Self = this.set("ImageId", js.undefined)
    @scala.inline
    def setInstanceInitiatedShutdownBehavior(value: ShutdownBehavior): Self = this.set("InstanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceInitiatedShutdownBehavior: Self = this.set("InstanceInitiatedShutdownBehavior", js.undefined)
    @scala.inline
    def setInstanceMarketOptions(value: InstanceMarketOptionsRequest): Self = this.set("InstanceMarketOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceMarketOptions: Self = this.set("InstanceMarketOptions", js.undefined)
    @scala.inline
    def setInstanceType(value: InstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    @scala.inline
    def setIpv6AddressCount(value: Integer): Self = this.set("Ipv6AddressCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6AddressCount: Self = this.set("Ipv6AddressCount", js.undefined)
    @scala.inline
    def setIpv6AddressesVarargs(value: InstanceIpv6Address*): Self = this.set("Ipv6Addresses", js.Array(value :_*))
    @scala.inline
    def setIpv6Addresses(value: InstanceIpv6AddressList): Self = this.set("Ipv6Addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6Addresses: Self = this.set("Ipv6Addresses", js.undefined)
    @scala.inline
    def setKernelId(value: KernelId): Self = this.set("KernelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKernelId: Self = this.set("KernelId", js.undefined)
    @scala.inline
    def setKeyName(value: KeyPairName): Self = this.set("KeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyName: Self = this.set("KeyName", js.undefined)
    @scala.inline
    def setLaunchTemplate(value: LaunchTemplateSpecification): Self = this.set("LaunchTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplate: Self = this.set("LaunchTemplate", js.undefined)
    @scala.inline
    def setLicenseSpecificationsVarargs(value: LicenseConfigurationRequest*): Self = this.set("LicenseSpecifications", js.Array(value :_*))
    @scala.inline
    def setLicenseSpecifications(value: LicenseSpecificationListRequest): Self = this.set("LicenseSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseSpecifications: Self = this.set("LicenseSpecifications", js.undefined)
    @scala.inline
    def setMetadataOptions(value: InstanceMetadataOptionsRequest): Self = this.set("MetadataOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadataOptions: Self = this.set("MetadataOptions", js.undefined)
    @scala.inline
    def setMonitoring(value: RunInstancesMonitoringEnabled): Self = this.set("Monitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitoring: Self = this.set("Monitoring", js.undefined)
    @scala.inline
    def setNetworkInterfacesVarargs(value: InstanceNetworkInterfaceSpecification*): Self = this.set("NetworkInterfaces", js.Array(value :_*))
    @scala.inline
    def setNetworkInterfaces(value: InstanceNetworkInterfaceSpecificationList): Self = this.set("NetworkInterfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaces: Self = this.set("NetworkInterfaces", js.undefined)
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("Placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("Placement", js.undefined)
    @scala.inline
    def setPrivateIpAddress(value: String): Self = this.set("PrivateIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("PrivateIpAddress", js.undefined)
    @scala.inline
    def setRamdiskId(value: RamdiskId): Self = this.set("RamdiskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRamdiskId: Self = this.set("RamdiskId", js.undefined)
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIdStringList): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroupName*): Self = this.set("SecurityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: SecurityGroupStringList): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
    @scala.inline
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
    @scala.inline
    def setUserData(value: String): Self = this.set("UserData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserData: Self = this.set("UserData", js.undefined)
  }
  
}

