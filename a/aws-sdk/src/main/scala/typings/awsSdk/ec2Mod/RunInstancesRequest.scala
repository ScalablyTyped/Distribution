package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunInstancesRequest extends StObject {
  
  /**
    * Reserved.
    */
  var AdditionalInfo: js.UndefOr[String] = js.undefined
  
  /**
    * The block device mapping entries.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingRequestList] = js.undefined
  
  /**
    * Information about the Capacity Reservation targeting option. If you do not specify this parameter, the instance's Capacity Reservation preference defaults to open, which enables it to run in any open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone).
    */
  var CapacityReservationSpecification: js.UndefOr[typings.awsSdk.ec2Mod.CapacityReservationSpecification] = js.undefined
  
  /**
    * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not specify a client token, a randomly generated token is used for the request to ensure idempotency. For more information, see Ensuring Idempotency. Constraints: Maximum 64 ASCII characters
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The CPU options for the instance. For more information, see Optimizing CPU options in the Amazon Elastic Compute Cloud User Guide.
    */
  var CpuOptions: js.UndefOr[CpuOptionsRequest] = js.undefined
  
  /**
    * The credit option for CPU usage of the burstable performance instance. Valid values are standard and unlimited. To change this attribute after launch, use  ModifyInstanceCreditSpecification. For more information, see Burstable performance instances in the Amazon Elastic Compute Cloud User Guide. Default: standard (T2 instances) or unlimited (T3/T3a instances)
    */
  var CreditSpecification: js.UndefOr[CreditSpecificationRequest] = js.undefined
  
  /**
    * If you set this parameter to true, you can't terminate the instance using the Amazon EC2 console, CLI, or API; otherwise, you can. To change this attribute after launch, use ModifyInstanceAttribute. Alternatively, if you set InstanceInitiatedShutdownBehavior to terminate, you can terminate the instance by running the shutdown command from the instance. Default: false 
    */
  var DisableApiTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS-optimized instance. Default: false 
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An elastic GPU to associate with the instance. An Elastic GPU is a GPU resource that you can attach to your Windows instance to accelerate the graphics performance of your applications. For more information, see  Amazon EC2 Elastic GPUs in the Amazon Elastic Compute Cloud User Guide.
    */
  var ElasticGpuSpecification: js.UndefOr[ElasticGpuSpecifications] = js.undefined
  
  /**
    * An elastic inference accelerator to associate with the instance. Elastic inference accelerators are a resource you can attach to your Amazon EC2 instances to accelerate your Deep Learning (DL) inference workloads. You cannot specify accelerators from different generations in the same request.
    */
  var ElasticInferenceAccelerators: js.UndefOr[typings.awsSdk.ec2Mod.ElasticInferenceAccelerators] = js.undefined
  
  /**
    * Indicates whether the instance is enabled for AWS Nitro Enclaves. For more information, see  What is AWS Nitro Enclaves? in the AWS Nitro Enclaves User Guide. You can't enable AWS Nitro Enclaves and hibernation on the same instance.
    */
  var EnclaveOptions: js.UndefOr[EnclaveOptionsRequest] = js.undefined
  
  /**
    * Indicates whether an instance is enabled for hibernation. For more information, see Hibernate your instance in the Amazon Elastic Compute Cloud User Guide. You can't enable hibernation and AWS Nitro Enclaves on the same instance.
    */
  var HibernationOptions: js.UndefOr[HibernationOptionsRequest] = js.undefined
  
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification] = js.undefined
  
  /**
    * The ID of the AMI. An AMI ID is required to launch an instance and must be specified here or in a launch template.
    */
  var ImageId: js.UndefOr[typings.awsSdk.ec2Mod.ImageId] = js.undefined
  
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown). Default: stop 
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.undefined
  
  /**
    * The market (purchasing) option for the instances. For RunInstances, persistent Spot Instance requests are only supported when InstanceInterruptionBehavior is set to either hibernate or stop.
    */
  var InstanceMarketOptions: js.UndefOr[InstanceMarketOptionsRequest] = js.undefined
  
  /**
    * The instance type. For more information, see Instance types in the Amazon Elastic Compute Cloud User Guide. Default: m1.small 
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.undefined
  
  /**
    * [EC2-VPC] The number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses the IPv6 addresses from the range of your subnet. You cannot specify this option and the option to assign specific IPv6 addresses in the same request. You can specify this option if you've specified a minimum number of instances to launch. You cannot specify this option and the network interfaces option in the same request.
    */
  var Ipv6AddressCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * [EC2-VPC] The IPv6 addresses from the range of the subnet to associate with the primary network interface. You cannot specify this option and the option to assign a number of IPv6 addresses in the same request. You cannot specify this option if you've specified a minimum number of instances to launch. You cannot specify this option and the network interfaces option in the same request.
    */
  var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.undefined
  
  /**
    * The ID of the kernel.  We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see  PV-GRUB in the Amazon Elastic Compute Cloud User Guide. 
    */
  var KernelId: js.UndefOr[typings.awsSdk.ec2Mod.KernelId] = js.undefined
  
  /**
    * The name of the key pair. You can create a key pair using CreateKeyPair or ImportKeyPair.  If you do not specify a key pair, you can't connect to the instance unless you choose an AMI that is configured to allow users another way to log in. 
    */
  var KeyName: js.UndefOr[KeyPairName] = js.undefined
  
  /**
    * The launch template to use to launch the instances. Any parameters that you specify in RunInstances override the same parameters in the launch template. You can specify either the name or ID of a launch template, but not both.
    */
  var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined
  
  /**
    * The license configurations.
    */
  var LicenseSpecifications: js.UndefOr[LicenseSpecificationListRequest] = js.undefined
  
  /**
    * The maximum number of instances to launch. If you specify more instances than Amazon EC2 can launch in the target Availability Zone, Amazon EC2 launches the largest possible number of instances above MinCount. Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more information about the default limits, and how to request an increase, see How many instances can I run in Amazon EC2 in the Amazon EC2 FAQ.
    */
  var MaxCount: Integer
  
  /**
    * The metadata options for the instance. For more information, see Instance metadata and user data.
    */
  var MetadataOptions: js.UndefOr[InstanceMetadataOptionsRequest] = js.undefined
  
  /**
    * The minimum number of instances to launch. If you specify a minimum that is more instances than Amazon EC2 can launch in the target Availability Zone, Amazon EC2 launches no instances. Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more information about the default limits, and how to request an increase, see How many instances can I run in Amazon EC2 in the Amazon EC2 General FAQ.
    */
  var MinCount: Integer
  
  /**
    * Specifies whether detailed monitoring is enabled for the instance.
    */
  var Monitoring: js.UndefOr[RunInstancesMonitoringEnabled] = js.undefined
  
  /**
    * The network interfaces to associate with the instance. If you specify a network interface, you must specify any security groups and subnets as part of the network interface.
    */
  var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList] = js.undefined
  
  /**
    * The placement for the instance.
    */
  var Placement: js.UndefOr[typings.awsSdk.ec2Mod.Placement] = js.undefined
  
  /**
    * [EC2-VPC] The primary IPv4 address. You must specify a value from the IPv4 address range of the subnet. Only one private IP address can be designated as primary. You can't specify this option if you've specified the option to designate a private IP address as the primary IP address in a network interface specification. You cannot specify this option if you're launching more than one instance in the request. You cannot specify this option and the network interfaces option in the same request.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the RAM disk to select. Some kernels require additional drivers at launch. Check the kernel requirements for information about whether you need to specify a RAM disk. To find kernel requirements, go to the AWS Resource Center and search for the kernel ID.  We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see  PV-GRUB in the Amazon Elastic Compute Cloud User Guide. 
    */
  var RamdiskId: js.UndefOr[typings.awsSdk.ec2Mod.RamdiskId] = js.undefined
  
  /**
    * The IDs of the security groups. You can create a security group using CreateSecurityGroup. If you specify a network interface, you must specify any security groups as part of the network interface.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdStringList] = js.undefined
  
  /**
    * [EC2-Classic, default VPC] The names of the security groups. For a nondefault VPC, you must use security group IDs instead. If you specify a network interface, you must specify any security groups as part of the network interface. Default: Amazon EC2 uses the default security group.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupStringList] = js.undefined
  
  /**
    * [EC2-VPC] The ID of the subnet to launch the instance into. If you specify a network interface, you must specify any subnets as part of the network interface.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.ec2Mod.SubnetId] = js.undefined
  
  /**
    * The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The specified tags are applied to all instances or volumes that are created during launch. To tag a resource after it has been created, see CreateTags.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  
  /**
    * The user data to make available to the instance. For more information, see Running commands on your Linux instance at launch (Linux) and Adding User Data (Windows). If you are using a command line tool, base64-encoding is performed for you, and you can load the text from a file. Otherwise, you must provide base64-encoded text. User data is limited to 16 KB.
    */
  var UserData: js.UndefOr[String] = js.undefined
}
object RunInstancesRequest {
  
  inline def apply(MaxCount: Integer, MinCount: Integer): RunInstancesRequest = {
    val __obj = js.Dynamic.literal(MaxCount = MaxCount.asInstanceOf[js.Any], MinCount = MinCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunInstancesRequest]
  }
  
  extension [Self <: RunInstancesRequest](x: Self) {
    
    inline def setAdditionalInfo(value: String): Self = StObject.set(x, "AdditionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "AdditionalInfo", js.undefined)
    
    inline def setBlockDeviceMappings(value: BlockDeviceMappingRequestList): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    inline def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    inline def setBlockDeviceMappingsVarargs(value: BlockDeviceMapping*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value :_*))
    
    inline def setCapacityReservationSpecification(value: CapacityReservationSpecification): Self = StObject.set(x, "CapacityReservationSpecification", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationSpecificationUndefined: Self = StObject.set(x, "CapacityReservationSpecification", js.undefined)
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setCpuOptions(value: CpuOptionsRequest): Self = StObject.set(x, "CpuOptions", value.asInstanceOf[js.Any])
    
    inline def setCpuOptionsUndefined: Self = StObject.set(x, "CpuOptions", js.undefined)
    
    inline def setCreditSpecification(value: CreditSpecificationRequest): Self = StObject.set(x, "CreditSpecification", value.asInstanceOf[js.Any])
    
    inline def setCreditSpecificationUndefined: Self = StObject.set(x, "CreditSpecification", js.undefined)
    
    inline def setDisableApiTermination(value: Boolean): Self = StObject.set(x, "DisableApiTermination", value.asInstanceOf[js.Any])
    
    inline def setDisableApiTerminationUndefined: Self = StObject.set(x, "DisableApiTermination", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setEbsOptimized(value: Boolean): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    inline def setElasticGpuSpecification(value: ElasticGpuSpecifications): Self = StObject.set(x, "ElasticGpuSpecification", value.asInstanceOf[js.Any])
    
    inline def setElasticGpuSpecificationUndefined: Self = StObject.set(x, "ElasticGpuSpecification", js.undefined)
    
    inline def setElasticGpuSpecificationVarargs(value: ElasticGpuSpecification*): Self = StObject.set(x, "ElasticGpuSpecification", js.Array(value :_*))
    
    inline def setElasticInferenceAccelerators(value: ElasticInferenceAccelerators): Self = StObject.set(x, "ElasticInferenceAccelerators", value.asInstanceOf[js.Any])
    
    inline def setElasticInferenceAcceleratorsUndefined: Self = StObject.set(x, "ElasticInferenceAccelerators", js.undefined)
    
    inline def setElasticInferenceAcceleratorsVarargs(value: ElasticInferenceAccelerator*): Self = StObject.set(x, "ElasticInferenceAccelerators", js.Array(value :_*))
    
    inline def setEnclaveOptions(value: EnclaveOptionsRequest): Self = StObject.set(x, "EnclaveOptions", value.asInstanceOf[js.Any])
    
    inline def setEnclaveOptionsUndefined: Self = StObject.set(x, "EnclaveOptions", js.undefined)
    
    inline def setHibernationOptions(value: HibernationOptionsRequest): Self = StObject.set(x, "HibernationOptions", value.asInstanceOf[js.Any])
    
    inline def setHibernationOptionsUndefined: Self = StObject.set(x, "HibernationOptions", js.undefined)
    
    inline def setIamInstanceProfile(value: IamInstanceProfileSpecification): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileUndefined: Self = StObject.set(x, "IamInstanceProfile", js.undefined)
    
    inline def setImageId(value: ImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setInstanceInitiatedShutdownBehavior(value: ShutdownBehavior): Self = StObject.set(x, "InstanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
    
    inline def setInstanceInitiatedShutdownBehaviorUndefined: Self = StObject.set(x, "InstanceInitiatedShutdownBehavior", js.undefined)
    
    inline def setInstanceMarketOptions(value: InstanceMarketOptionsRequest): Self = StObject.set(x, "InstanceMarketOptions", value.asInstanceOf[js.Any])
    
    inline def setInstanceMarketOptionsUndefined: Self = StObject.set(x, "InstanceMarketOptions", js.undefined)
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setIpv6AddressCount(value: Integer): Self = StObject.set(x, "Ipv6AddressCount", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressCountUndefined: Self = StObject.set(x, "Ipv6AddressCount", js.undefined)
    
    inline def setIpv6Addresses(value: InstanceIpv6AddressList): Self = StObject.set(x, "Ipv6Addresses", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressesUndefined: Self = StObject.set(x, "Ipv6Addresses", js.undefined)
    
    inline def setIpv6AddressesVarargs(value: InstanceIpv6Address*): Self = StObject.set(x, "Ipv6Addresses", js.Array(value :_*))
    
    inline def setKernelId(value: KernelId): Self = StObject.set(x, "KernelId", value.asInstanceOf[js.Any])
    
    inline def setKernelIdUndefined: Self = StObject.set(x, "KernelId", js.undefined)
    
    inline def setKeyName(value: KeyPairName): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
    inline def setLaunchTemplate(value: LaunchTemplateSpecification): Self = StObject.set(x, "LaunchTemplate", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateUndefined: Self = StObject.set(x, "LaunchTemplate", js.undefined)
    
    inline def setLicenseSpecifications(value: LicenseSpecificationListRequest): Self = StObject.set(x, "LicenseSpecifications", value.asInstanceOf[js.Any])
    
    inline def setLicenseSpecificationsUndefined: Self = StObject.set(x, "LicenseSpecifications", js.undefined)
    
    inline def setLicenseSpecificationsVarargs(value: LicenseConfigurationRequest*): Self = StObject.set(x, "LicenseSpecifications", js.Array(value :_*))
    
    inline def setMaxCount(value: Integer): Self = StObject.set(x, "MaxCount", value.asInstanceOf[js.Any])
    
    inline def setMetadataOptions(value: InstanceMetadataOptionsRequest): Self = StObject.set(x, "MetadataOptions", value.asInstanceOf[js.Any])
    
    inline def setMetadataOptionsUndefined: Self = StObject.set(x, "MetadataOptions", js.undefined)
    
    inline def setMinCount(value: Integer): Self = StObject.set(x, "MinCount", value.asInstanceOf[js.Any])
    
    inline def setMonitoring(value: RunInstancesMonitoringEnabled): Self = StObject.set(x, "Monitoring", value.asInstanceOf[js.Any])
    
    inline def setMonitoringUndefined: Self = StObject.set(x, "Monitoring", js.undefined)
    
    inline def setNetworkInterfaces(value: InstanceNetworkInterfaceSpecificationList): Self = StObject.set(x, "NetworkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "NetworkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: InstanceNetworkInterfaceSpecification*): Self = StObject.set(x, "NetworkInterfaces", js.Array(value :_*))
    
    inline def setPlacement(value: Placement): Self = StObject.set(x, "Placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "Placement", js.undefined)
    
    inline def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
    
    inline def setRamdiskId(value: RamdiskId): Self = StObject.set(x, "RamdiskId", value.asInstanceOf[js.Any])
    
    inline def setRamdiskIdUndefined: Self = StObject.set(x, "RamdiskId", js.undefined)
    
    inline def setSecurityGroupIds(value: SecurityGroupIdStringList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    inline def setSecurityGroups(value: SecurityGroupStringList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: SecurityGroupName*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
    
    inline def setUserData(value: String): Self = StObject.set(x, "UserData", value.asInstanceOf[js.Any])
    
    inline def setUserDataUndefined: Self = StObject.set(x, "UserData", js.undefined)
  }
}
