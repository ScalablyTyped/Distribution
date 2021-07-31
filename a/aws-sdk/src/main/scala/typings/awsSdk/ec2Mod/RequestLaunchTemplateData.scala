package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestLaunchTemplateData extends StObject {
  
  /**
    * The block device mapping.
    */
  var BlockDeviceMappings: js.UndefOr[LaunchTemplateBlockDeviceMappingRequestList] = js.undefined
  
  /**
    * The Capacity Reservation targeting option. If you do not specify this parameter, the instance's Capacity Reservation preference defaults to open, which enables it to run in any open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone).
    */
  var CapacityReservationSpecification: js.UndefOr[LaunchTemplateCapacityReservationSpecificationRequest] = js.undefined
  
  /**
    * The CPU options for the instance. For more information, see Optimizing CPU Options in the Amazon Elastic Compute Cloud User Guide.
    */
  var CpuOptions: js.UndefOr[LaunchTemplateCpuOptionsRequest] = js.undefined
  
  /**
    * The credit option for CPU usage of the instance. Valid for T2, T3, or T3a instances only.
    */
  var CreditSpecification: js.UndefOr[CreditSpecificationRequest] = js.undefined
  
  /**
    * If you set this parameter to true, you can't terminate the instance using the Amazon EC2 console, CLI, or API; otherwise, you can. To change this attribute after launch, use ModifyInstanceAttribute. Alternatively, if you set InstanceInitiatedShutdownBehavior to terminate, you can terminate the instance by running the shutdown command from the instance.
    */
  var DisableApiTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS-optimized instance.
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An elastic GPU to associate with the instance.
    */
  var ElasticGpuSpecifications: js.UndefOr[ElasticGpuSpecificationList] = js.undefined
  
  /**
    *  The elastic inference accelerator for the instance. 
    */
  var ElasticInferenceAccelerators: js.UndefOr[LaunchTemplateElasticInferenceAcceleratorList] = js.undefined
  
  /**
    * Indicates whether the instance is enabled for AWS Nitro Enclaves. For more information, see  What is AWS Nitro Enclaves? in the AWS Nitro Enclaves User Guide. You can't enable AWS Nitro Enclaves and hibernation on the same instance.
    */
  var EnclaveOptions: js.UndefOr[LaunchTemplateEnclaveOptionsRequest] = js.undefined
  
  /**
    * Indicates whether an instance is enabled for hibernation. This parameter is valid only if the instance meets the hibernation prerequisites. For more information, see Hibernate Your Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  var HibernationOptions: js.UndefOr[LaunchTemplateHibernationOptionsRequest] = js.undefined
  
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[LaunchTemplateIamInstanceProfileSpecificationRequest] = js.undefined
  
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[typings.awsSdk.ec2Mod.ImageId] = js.undefined
  
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown). Default: stop 
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.undefined
  
  /**
    * The market (purchasing) option for the instances.
    */
  var InstanceMarketOptions: js.UndefOr[LaunchTemplateInstanceMarketOptionsRequest] = js.undefined
  
  /**
    * The instance type. For more information, see Instance Types in the Amazon Elastic Compute Cloud User Guide.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.undefined
  
  /**
    * The ID of the kernel.  We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see User Provided Kernels in the Amazon Elastic Compute Cloud User Guide. 
    */
  var KernelId: js.UndefOr[typings.awsSdk.ec2Mod.KernelId] = js.undefined
  
  /**
    * The name of the key pair. You can create a key pair using CreateKeyPair or ImportKeyPair.  If you do not specify a key pair, you can't connect to the instance unless you choose an AMI that is configured to allow users another way to log in. 
    */
  var KeyName: js.UndefOr[KeyPairName] = js.undefined
  
  /**
    * The license configurations.
    */
  var LicenseSpecifications: js.UndefOr[LaunchTemplateLicenseSpecificationListRequest] = js.undefined
  
  /**
    * The metadata options for the instance. For more information, see Instance Metadata and User Data in the Amazon Elastic Compute Cloud User Guide.
    */
  var MetadataOptions: js.UndefOr[LaunchTemplateInstanceMetadataOptionsRequest] = js.undefined
  
  /**
    * The monitoring for the instance.
    */
  var Monitoring: js.UndefOr[LaunchTemplatesMonitoringRequest] = js.undefined
  
  /**
    * One or more network interfaces. If you specify a network interface, you must specify any security groups and subnets as part of the network interface.
    */
  var NetworkInterfaces: js.UndefOr[LaunchTemplateInstanceNetworkInterfaceSpecificationRequestList] = js.undefined
  
  /**
    * The placement for the instance.
    */
  var Placement: js.UndefOr[LaunchTemplatePlacementRequest] = js.undefined
  
  /**
    * The ID of the RAM disk.  We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see User Provided Kernels in the Amazon Elastic Compute Cloud User Guide. 
    */
  var RamDiskId: js.UndefOr[RamdiskId] = js.undefined
  
  /**
    * One or more security group IDs. You can create a security group using CreateSecurityGroup. You cannot specify both a security group ID and security name in the same request.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdStringList] = js.undefined
  
  /**
    * [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security group IDs instead. You cannot specify both a security group ID and security name in the same request.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupStringList] = js.undefined
  
  /**
    * The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The specified tags are applied to all instances or volumes that are created during launch. To tag a resource after it has been created, see CreateTags.
    */
  var TagSpecifications: js.UndefOr[LaunchTemplateTagSpecificationRequestList] = js.undefined
  
  /**
    * The Base64-encoded user data to make available to the instance. For more information, see Running Commands on Your Linux Instance at Launch (Linux) and Adding User Data (Windows).
    */
  var UserData: js.UndefOr[String] = js.undefined
}
object RequestLaunchTemplateData {
  
  @scala.inline
  def apply(): RequestLaunchTemplateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLaunchTemplateData]
  }
  
  @scala.inline
  implicit class RequestLaunchTemplateDataMutableBuilder[Self <: RequestLaunchTemplateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockDeviceMappings(value: LaunchTemplateBlockDeviceMappingRequestList): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: LaunchTemplateBlockDeviceMappingRequest*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value :_*))
    
    @scala.inline
    def setCapacityReservationSpecification(value: LaunchTemplateCapacityReservationSpecificationRequest): Self = StObject.set(x, "CapacityReservationSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityReservationSpecificationUndefined: Self = StObject.set(x, "CapacityReservationSpecification", js.undefined)
    
    @scala.inline
    def setCpuOptions(value: LaunchTemplateCpuOptionsRequest): Self = StObject.set(x, "CpuOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuOptionsUndefined: Self = StObject.set(x, "CpuOptions", js.undefined)
    
    @scala.inline
    def setCreditSpecification(value: CreditSpecificationRequest): Self = StObject.set(x, "CreditSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditSpecificationUndefined: Self = StObject.set(x, "CreditSpecification", js.undefined)
    
    @scala.inline
    def setDisableApiTermination(value: Boolean): Self = StObject.set(x, "DisableApiTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableApiTerminationUndefined: Self = StObject.set(x, "DisableApiTermination", js.undefined)
    
    @scala.inline
    def setEbsOptimized(value: Boolean): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    @scala.inline
    def setElasticGpuSpecifications(value: ElasticGpuSpecificationList): Self = StObject.set(x, "ElasticGpuSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticGpuSpecificationsUndefined: Self = StObject.set(x, "ElasticGpuSpecifications", js.undefined)
    
    @scala.inline
    def setElasticGpuSpecificationsVarargs(value: ElasticGpuSpecification*): Self = StObject.set(x, "ElasticGpuSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setElasticInferenceAccelerators(value: LaunchTemplateElasticInferenceAcceleratorList): Self = StObject.set(x, "ElasticInferenceAccelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticInferenceAcceleratorsUndefined: Self = StObject.set(x, "ElasticInferenceAccelerators", js.undefined)
    
    @scala.inline
    def setElasticInferenceAcceleratorsVarargs(value: LaunchTemplateElasticInferenceAccelerator*): Self = StObject.set(x, "ElasticInferenceAccelerators", js.Array(value :_*))
    
    @scala.inline
    def setEnclaveOptions(value: LaunchTemplateEnclaveOptionsRequest): Self = StObject.set(x, "EnclaveOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnclaveOptionsUndefined: Self = StObject.set(x, "EnclaveOptions", js.undefined)
    
    @scala.inline
    def setHibernationOptions(value: LaunchTemplateHibernationOptionsRequest): Self = StObject.set(x, "HibernationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHibernationOptionsUndefined: Self = StObject.set(x, "HibernationOptions", js.undefined)
    
    @scala.inline
    def setIamInstanceProfile(value: LaunchTemplateIamInstanceProfileSpecificationRequest): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamInstanceProfileUndefined: Self = StObject.set(x, "IamInstanceProfile", js.undefined)
    
    @scala.inline
    def setImageId(value: ImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    @scala.inline
    def setInstanceInitiatedShutdownBehavior(value: ShutdownBehavior): Self = StObject.set(x, "InstanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceInitiatedShutdownBehaviorUndefined: Self = StObject.set(x, "InstanceInitiatedShutdownBehavior", js.undefined)
    
    @scala.inline
    def setInstanceMarketOptions(value: LaunchTemplateInstanceMarketOptionsRequest): Self = StObject.set(x, "InstanceMarketOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceMarketOptionsUndefined: Self = StObject.set(x, "InstanceMarketOptions", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setKernelId(value: KernelId): Self = StObject.set(x, "KernelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelIdUndefined: Self = StObject.set(x, "KernelId", js.undefined)
    
    @scala.inline
    def setKeyName(value: KeyPairName): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
    @scala.inline
    def setLicenseSpecifications(value: LaunchTemplateLicenseSpecificationListRequest): Self = StObject.set(x, "LicenseSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseSpecificationsUndefined: Self = StObject.set(x, "LicenseSpecifications", js.undefined)
    
    @scala.inline
    def setLicenseSpecificationsVarargs(value: LaunchTemplateLicenseConfigurationRequest*): Self = StObject.set(x, "LicenseSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setMetadataOptions(value: LaunchTemplateInstanceMetadataOptionsRequest): Self = StObject.set(x, "MetadataOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataOptionsUndefined: Self = StObject.set(x, "MetadataOptions", js.undefined)
    
    @scala.inline
    def setMonitoring(value: LaunchTemplatesMonitoringRequest): Self = StObject.set(x, "Monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringUndefined: Self = StObject.set(x, "Monitoring", js.undefined)
    
    @scala.inline
    def setNetworkInterfaces(value: LaunchTemplateInstanceNetworkInterfaceSpecificationRequestList): Self = StObject.set(x, "NetworkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfacesUndefined: Self = StObject.set(x, "NetworkInterfaces", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: LaunchTemplateInstanceNetworkInterfaceSpecificationRequest*): Self = StObject.set(x, "NetworkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setPlacement(value: LaunchTemplatePlacementRequest): Self = StObject.set(x, "Placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "Placement", js.undefined)
    
    @scala.inline
    def setRamDiskId(value: RamdiskId): Self = StObject.set(x, "RamDiskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRamDiskIdUndefined: Self = StObject.set(x, "RamDiskId", js.undefined)
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIdStringList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroupStringList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroupName*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setTagSpecifications(value: LaunchTemplateTagSpecificationRequestList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: LaunchTemplateTagSpecificationRequest*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setUserData(value: String): Self = StObject.set(x, "UserData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDataUndefined: Self = StObject.set(x, "UserData", js.undefined)
  }
}
