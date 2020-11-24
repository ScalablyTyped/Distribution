package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestLaunchTemplateData extends js.Object {
  
  /**
    * The block device mapping.
    */
  var BlockDeviceMappings: js.UndefOr[LaunchTemplateBlockDeviceMappingRequestList] = js.native
  
  /**
    * The Capacity Reservation targeting option. If you do not specify this parameter, the instance's Capacity Reservation preference defaults to open, which enables it to run in any open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone).
    */
  var CapacityReservationSpecification: js.UndefOr[LaunchTemplateCapacityReservationSpecificationRequest] = js.native
  
  /**
    * The CPU options for the instance. For more information, see Optimizing CPU Options in the Amazon Elastic Compute Cloud User Guide.
    */
  var CpuOptions: js.UndefOr[LaunchTemplateCpuOptionsRequest] = js.native
  
  /**
    * The credit option for CPU usage of the instance. Valid for T2, T3, or T3a instances only.
    */
  var CreditSpecification: js.UndefOr[CreditSpecificationRequest] = js.native
  
  /**
    * If you set this parameter to true, you can't terminate the instance using the Amazon EC2 console, CLI, or API; otherwise, you can. To change this attribute after launch, use ModifyInstanceAttribute. Alternatively, if you set InstanceInitiatedShutdownBehavior to terminate, you can terminate the instance by running the shutdown command from the instance.
    */
  var DisableApiTermination: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal Amazon EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS-optimized instance.
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.native
  
  /**
    * An elastic GPU to associate with the instance.
    */
  var ElasticGpuSpecifications: js.UndefOr[ElasticGpuSpecificationList] = js.native
  
  /**
    *  The elastic inference accelerator for the instance. 
    */
  var ElasticInferenceAccelerators: js.UndefOr[LaunchTemplateElasticInferenceAcceleratorList] = js.native
  
  /**
    * Indicates whether the instance is enabled for AWS Nitro Enclaves. For more information, see  What is AWS Nitro Enclaves? in the AWS Nitro Enclaves User Guide. You can't enable AWS Nitro Enclaves and hibernation on the same instance.
    */
  var EnclaveOptions: js.UndefOr[LaunchTemplateEnclaveOptionsRequest] = js.native
  
  /**
    * Indicates whether an instance is enabled for hibernation. This parameter is valid only if the instance meets the hibernation prerequisites. For more information, see Hibernate Your Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  var HibernationOptions: js.UndefOr[LaunchTemplateHibernationOptionsRequest] = js.native
  
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[LaunchTemplateIamInstanceProfileSpecificationRequest] = js.native
  
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[typings.awsSdk.ec2Mod.ImageId] = js.native
  
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown). Default: stop 
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.native
  
  /**
    * The market (purchasing) option for the instances.
    */
  var InstanceMarketOptions: js.UndefOr[LaunchTemplateInstanceMarketOptionsRequest] = js.native
  
  /**
    * The instance type. For more information, see Instance Types in the Amazon Elastic Compute Cloud User Guide.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.native
  
  /**
    * The ID of the kernel.  We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see User Provided Kernels in the Amazon Elastic Compute Cloud User Guide. 
    */
  var KernelId: js.UndefOr[typings.awsSdk.ec2Mod.KernelId] = js.native
  
  /**
    * The name of the key pair. You can create a key pair using CreateKeyPair or ImportKeyPair.  If you do not specify a key pair, you can't connect to the instance unless you choose an AMI that is configured to allow users another way to log in. 
    */
  var KeyName: js.UndefOr[KeyPairName] = js.native
  
  /**
    * The license configurations.
    */
  var LicenseSpecifications: js.UndefOr[LaunchTemplateLicenseSpecificationListRequest] = js.native
  
  /**
    * The metadata options for the instance. For more information, see Instance Metadata and User Data in the Amazon Elastic Compute Cloud User Guide.
    */
  var MetadataOptions: js.UndefOr[LaunchTemplateInstanceMetadataOptionsRequest] = js.native
  
  /**
    * The monitoring for the instance.
    */
  var Monitoring: js.UndefOr[LaunchTemplatesMonitoringRequest] = js.native
  
  /**
    * One or more network interfaces. If you specify a network interface, you must specify any security groups and subnets as part of the network interface.
    */
  var NetworkInterfaces: js.UndefOr[LaunchTemplateInstanceNetworkInterfaceSpecificationRequestList] = js.native
  
  /**
    * The placement for the instance.
    */
  var Placement: js.UndefOr[LaunchTemplatePlacementRequest] = js.native
  
  /**
    * The ID of the RAM disk.  We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see User Provided Kernels in the Amazon Elastic Compute Cloud User Guide. 
    */
  var RamDiskId: js.UndefOr[RamdiskId] = js.native
  
  /**
    * One or more security group IDs. You can create a security group using CreateSecurityGroup. You cannot specify both a security group ID and security name in the same request.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdStringList] = js.native
  
  /**
    * [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security group IDs instead. You cannot specify both a security group ID and security name in the same request.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupStringList] = js.native
  
  /**
    * The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The specified tags are applied to all instances or volumes that are created during launch. To tag a resource after it has been created, see CreateTags.
    */
  var TagSpecifications: js.UndefOr[LaunchTemplateTagSpecificationRequestList] = js.native
  
  /**
    * The Base64-encoded user data to make available to the instance. For more information, see Running Commands on Your Linux Instance at Launch (Linux) and Adding User Data (Windows).
    */
  var UserData: js.UndefOr[String] = js.native
}
object RequestLaunchTemplateData {
  
  @scala.inline
  def apply(): RequestLaunchTemplateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLaunchTemplateData]
  }
  
  @scala.inline
  implicit class RequestLaunchTemplateDataOps[Self <: RequestLaunchTemplateData] (val x: Self) extends AnyVal {
    
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
    def setBlockDeviceMappingsVarargs(value: LaunchTemplateBlockDeviceMappingRequest*): Self = this.set("BlockDeviceMappings", js.Array(value :_*))
    
    @scala.inline
    def setBlockDeviceMappings(value: LaunchTemplateBlockDeviceMappingRequestList): Self = this.set("BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockDeviceMappings: Self = this.set("BlockDeviceMappings", js.undefined)
    
    @scala.inline
    def setCapacityReservationSpecification(value: LaunchTemplateCapacityReservationSpecificationRequest): Self = this.set("CapacityReservationSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacityReservationSpecification: Self = this.set("CapacityReservationSpecification", js.undefined)
    
    @scala.inline
    def setCpuOptions(value: LaunchTemplateCpuOptionsRequest): Self = this.set("CpuOptions", value.asInstanceOf[js.Any])
    
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
    def setEbsOptimized(value: Boolean): Self = this.set("EbsOptimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsOptimized: Self = this.set("EbsOptimized", js.undefined)
    
    @scala.inline
    def setElasticGpuSpecificationsVarargs(value: ElasticGpuSpecification*): Self = this.set("ElasticGpuSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setElasticGpuSpecifications(value: ElasticGpuSpecificationList): Self = this.set("ElasticGpuSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticGpuSpecifications: Self = this.set("ElasticGpuSpecifications", js.undefined)
    
    @scala.inline
    def setElasticInferenceAcceleratorsVarargs(value: LaunchTemplateElasticInferenceAccelerator*): Self = this.set("ElasticInferenceAccelerators", js.Array(value :_*))
    
    @scala.inline
    def setElasticInferenceAccelerators(value: LaunchTemplateElasticInferenceAcceleratorList): Self = this.set("ElasticInferenceAccelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticInferenceAccelerators: Self = this.set("ElasticInferenceAccelerators", js.undefined)
    
    @scala.inline
    def setEnclaveOptions(value: LaunchTemplateEnclaveOptionsRequest): Self = this.set("EnclaveOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnclaveOptions: Self = this.set("EnclaveOptions", js.undefined)
    
    @scala.inline
    def setHibernationOptions(value: LaunchTemplateHibernationOptionsRequest): Self = this.set("HibernationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHibernationOptions: Self = this.set("HibernationOptions", js.undefined)
    
    @scala.inline
    def setIamInstanceProfile(value: LaunchTemplateIamInstanceProfileSpecificationRequest): Self = this.set("IamInstanceProfile", value.asInstanceOf[js.Any])
    
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
    def setInstanceMarketOptions(value: LaunchTemplateInstanceMarketOptionsRequest): Self = this.set("InstanceMarketOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceMarketOptions: Self = this.set("InstanceMarketOptions", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setKernelId(value: KernelId): Self = this.set("KernelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelId: Self = this.set("KernelId", js.undefined)
    
    @scala.inline
    def setKeyName(value: KeyPairName): Self = this.set("KeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyName: Self = this.set("KeyName", js.undefined)
    
    @scala.inline
    def setLicenseSpecificationsVarargs(value: LaunchTemplateLicenseConfigurationRequest*): Self = this.set("LicenseSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setLicenseSpecifications(value: LaunchTemplateLicenseSpecificationListRequest): Self = this.set("LicenseSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseSpecifications: Self = this.set("LicenseSpecifications", js.undefined)
    
    @scala.inline
    def setMetadataOptions(value: LaunchTemplateInstanceMetadataOptionsRequest): Self = this.set("MetadataOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataOptions: Self = this.set("MetadataOptions", js.undefined)
    
    @scala.inline
    def setMonitoring(value: LaunchTemplatesMonitoringRequest): Self = this.set("Monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoring: Self = this.set("Monitoring", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: LaunchTemplateInstanceNetworkInterfaceSpecificationRequest*): Self = this.set("NetworkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaces(value: LaunchTemplateInstanceNetworkInterfaceSpecificationRequestList): Self = this.set("NetworkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaces: Self = this.set("NetworkInterfaces", js.undefined)
    
    @scala.inline
    def setPlacement(value: LaunchTemplatePlacementRequest): Self = this.set("Placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("Placement", js.undefined)
    
    @scala.inline
    def setRamDiskId(value: RamdiskId): Self = this.set("RamDiskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRamDiskId: Self = this.set("RamDiskId", js.undefined)
    
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
    def setTagSpecificationsVarargs(value: LaunchTemplateTagSpecificationRequest*): Self = this.set("TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTagSpecifications(value: LaunchTemplateTagSpecificationRequestList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
    
    @scala.inline
    def setUserData(value: String): Self = this.set("UserData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserData: Self = this.set("UserData", js.undefined)
  }
}
