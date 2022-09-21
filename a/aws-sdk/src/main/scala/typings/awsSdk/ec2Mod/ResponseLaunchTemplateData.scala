package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseLaunchTemplateData extends StObject {
  
  /**
    * The block device mappings.
    */
  var BlockDeviceMappings: js.UndefOr[LaunchTemplateBlockDeviceMappingList] = js.undefined
  
  /**
    * Information about the Capacity Reservation targeting option.
    */
  var CapacityReservationSpecification: js.UndefOr[LaunchTemplateCapacityReservationSpecificationResponse] = js.undefined
  
  /**
    * The CPU options for the instance. For more information, see Optimizing CPU options in the Amazon Elastic Compute Cloud User Guide.
    */
  var CpuOptions: js.UndefOr[LaunchTemplateCpuOptions] = js.undefined
  
  /**
    * The credit option for CPU usage of the instance.
    */
  var CreditSpecification: js.UndefOr[typings.awsSdk.ec2Mod.CreditSpecification] = js.undefined
  
  /**
    * Indicates whether the instance is enabled for stop protection. For more information, see Stop Protection.
    */
  var DisableApiStop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, indicates that the instance cannot be terminated using the Amazon EC2 console, command line tool, or API.
    */
  var DisableApiTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the instance is optimized for Amazon EBS I/O. 
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The elastic GPU specification.
    */
  var ElasticGpuSpecifications: js.UndefOr[ElasticGpuSpecificationResponseList] = js.undefined
  
  /**
    *  The elastic inference accelerator for the instance. 
    */
  var ElasticInferenceAccelerators: js.UndefOr[LaunchTemplateElasticInferenceAcceleratorResponseList] = js.undefined
  
  /**
    * Indicates whether the instance is enabled for Amazon Web Services Nitro Enclaves.
    */
  var EnclaveOptions: js.UndefOr[LaunchTemplateEnclaveOptions] = js.undefined
  
  /**
    * Indicates whether an instance is configured for hibernation. For more information, see Hibernate your instance in the Amazon Elastic Compute Cloud User Guide.
    */
  var HibernationOptions: js.UndefOr[LaunchTemplateHibernationOptions] = js.undefined
  
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[LaunchTemplateIamInstanceProfileSpecification] = js.undefined
  
  /**
    * The ID of the AMI that was used to launch the instance.
    */
  var ImageId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown).
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.undefined
  
  /**
    * The market (purchasing) option for the instances.
    */
  var InstanceMarketOptions: js.UndefOr[LaunchTemplateInstanceMarketOptions] = js.undefined
  
  /**
    * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance types with these attributes. If you specify InstanceRequirements, you can't specify InstanceTypes.
    */
  var InstanceRequirements: js.UndefOr[typings.awsSdk.ec2Mod.InstanceRequirements] = js.undefined
  
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.undefined
  
  /**
    * The ID of the kernel, if applicable.
    */
  var KernelId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[String] = js.undefined
  
  /**
    * The license configurations.
    */
  var LicenseSpecifications: js.UndefOr[LaunchTemplateLicenseList] = js.undefined
  
  /**
    * The maintenance options for your instance.
    */
  var MaintenanceOptions: js.UndefOr[LaunchTemplateInstanceMaintenanceOptions] = js.undefined
  
  /**
    * The metadata options for the instance. For more information, see Instance metadata and user data in the Amazon Elastic Compute Cloud User Guide.
    */
  var MetadataOptions: js.UndefOr[LaunchTemplateInstanceMetadataOptions] = js.undefined
  
  /**
    * The monitoring for the instance.
    */
  var Monitoring: js.UndefOr[LaunchTemplatesMonitoring] = js.undefined
  
  /**
    * The network interfaces.
    */
  var NetworkInterfaces: js.UndefOr[LaunchTemplateInstanceNetworkInterfaceSpecificationList] = js.undefined
  
  /**
    * The placement of the instance.
    */
  var Placement: js.UndefOr[LaunchTemplatePlacement] = js.undefined
  
  /**
    * The options for the instance hostname.
    */
  var PrivateDnsNameOptions: js.UndefOr[LaunchTemplatePrivateDnsNameOptions] = js.undefined
  
  /**
    * The ID of the RAM disk, if applicable.
    */
  var RamDiskId: js.UndefOr[String] = js.undefined
  
  /**
    * The security group IDs.
    */
  var SecurityGroupIds: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The security group names.
    */
  var SecurityGroups: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The tags that are applied to the resources that are created during instance launch.
    */
  var TagSpecifications: js.UndefOr[LaunchTemplateTagSpecificationList] = js.undefined
  
  /**
    * The user data for the instance. 
    */
  var UserData: js.UndefOr[String] = js.undefined
}
object ResponseLaunchTemplateData {
  
  inline def apply(): ResponseLaunchTemplateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseLaunchTemplateData]
  }
  
  extension [Self <: ResponseLaunchTemplateData](x: Self) {
    
    inline def setBlockDeviceMappings(value: LaunchTemplateBlockDeviceMappingList): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    inline def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    inline def setBlockDeviceMappingsVarargs(value: LaunchTemplateBlockDeviceMapping*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value*))
    
    inline def setCapacityReservationSpecification(value: LaunchTemplateCapacityReservationSpecificationResponse): Self = StObject.set(x, "CapacityReservationSpecification", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationSpecificationUndefined: Self = StObject.set(x, "CapacityReservationSpecification", js.undefined)
    
    inline def setCpuOptions(value: LaunchTemplateCpuOptions): Self = StObject.set(x, "CpuOptions", value.asInstanceOf[js.Any])
    
    inline def setCpuOptionsUndefined: Self = StObject.set(x, "CpuOptions", js.undefined)
    
    inline def setCreditSpecification(value: CreditSpecification): Self = StObject.set(x, "CreditSpecification", value.asInstanceOf[js.Any])
    
    inline def setCreditSpecificationUndefined: Self = StObject.set(x, "CreditSpecification", js.undefined)
    
    inline def setDisableApiStop(value: Boolean): Self = StObject.set(x, "DisableApiStop", value.asInstanceOf[js.Any])
    
    inline def setDisableApiStopUndefined: Self = StObject.set(x, "DisableApiStop", js.undefined)
    
    inline def setDisableApiTermination(value: Boolean): Self = StObject.set(x, "DisableApiTermination", value.asInstanceOf[js.Any])
    
    inline def setDisableApiTerminationUndefined: Self = StObject.set(x, "DisableApiTermination", js.undefined)
    
    inline def setEbsOptimized(value: Boolean): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    inline def setElasticGpuSpecifications(value: ElasticGpuSpecificationResponseList): Self = StObject.set(x, "ElasticGpuSpecifications", value.asInstanceOf[js.Any])
    
    inline def setElasticGpuSpecificationsUndefined: Self = StObject.set(x, "ElasticGpuSpecifications", js.undefined)
    
    inline def setElasticGpuSpecificationsVarargs(value: ElasticGpuSpecificationResponse*): Self = StObject.set(x, "ElasticGpuSpecifications", js.Array(value*))
    
    inline def setElasticInferenceAccelerators(value: LaunchTemplateElasticInferenceAcceleratorResponseList): Self = StObject.set(x, "ElasticInferenceAccelerators", value.asInstanceOf[js.Any])
    
    inline def setElasticInferenceAcceleratorsUndefined: Self = StObject.set(x, "ElasticInferenceAccelerators", js.undefined)
    
    inline def setElasticInferenceAcceleratorsVarargs(value: LaunchTemplateElasticInferenceAcceleratorResponse*): Self = StObject.set(x, "ElasticInferenceAccelerators", js.Array(value*))
    
    inline def setEnclaveOptions(value: LaunchTemplateEnclaveOptions): Self = StObject.set(x, "EnclaveOptions", value.asInstanceOf[js.Any])
    
    inline def setEnclaveOptionsUndefined: Self = StObject.set(x, "EnclaveOptions", js.undefined)
    
    inline def setHibernationOptions(value: LaunchTemplateHibernationOptions): Self = StObject.set(x, "HibernationOptions", value.asInstanceOf[js.Any])
    
    inline def setHibernationOptionsUndefined: Self = StObject.set(x, "HibernationOptions", js.undefined)
    
    inline def setIamInstanceProfile(value: LaunchTemplateIamInstanceProfileSpecification): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileUndefined: Self = StObject.set(x, "IamInstanceProfile", js.undefined)
    
    inline def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setInstanceInitiatedShutdownBehavior(value: ShutdownBehavior): Self = StObject.set(x, "InstanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
    
    inline def setInstanceInitiatedShutdownBehaviorUndefined: Self = StObject.set(x, "InstanceInitiatedShutdownBehavior", js.undefined)
    
    inline def setInstanceMarketOptions(value: LaunchTemplateInstanceMarketOptions): Self = StObject.set(x, "InstanceMarketOptions", value.asInstanceOf[js.Any])
    
    inline def setInstanceMarketOptionsUndefined: Self = StObject.set(x, "InstanceMarketOptions", js.undefined)
    
    inline def setInstanceRequirements(value: InstanceRequirements): Self = StObject.set(x, "InstanceRequirements", value.asInstanceOf[js.Any])
    
    inline def setInstanceRequirementsUndefined: Self = StObject.set(x, "InstanceRequirements", js.undefined)
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setKernelId(value: String): Self = StObject.set(x, "KernelId", value.asInstanceOf[js.Any])
    
    inline def setKernelIdUndefined: Self = StObject.set(x, "KernelId", js.undefined)
    
    inline def setKeyName(value: String): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
    inline def setLicenseSpecifications(value: LaunchTemplateLicenseList): Self = StObject.set(x, "LicenseSpecifications", value.asInstanceOf[js.Any])
    
    inline def setLicenseSpecificationsUndefined: Self = StObject.set(x, "LicenseSpecifications", js.undefined)
    
    inline def setLicenseSpecificationsVarargs(value: LaunchTemplateLicenseConfiguration*): Self = StObject.set(x, "LicenseSpecifications", js.Array(value*))
    
    inline def setMaintenanceOptions(value: LaunchTemplateInstanceMaintenanceOptions): Self = StObject.set(x, "MaintenanceOptions", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceOptionsUndefined: Self = StObject.set(x, "MaintenanceOptions", js.undefined)
    
    inline def setMetadataOptions(value: LaunchTemplateInstanceMetadataOptions): Self = StObject.set(x, "MetadataOptions", value.asInstanceOf[js.Any])
    
    inline def setMetadataOptionsUndefined: Self = StObject.set(x, "MetadataOptions", js.undefined)
    
    inline def setMonitoring(value: LaunchTemplatesMonitoring): Self = StObject.set(x, "Monitoring", value.asInstanceOf[js.Any])
    
    inline def setMonitoringUndefined: Self = StObject.set(x, "Monitoring", js.undefined)
    
    inline def setNetworkInterfaces(value: LaunchTemplateInstanceNetworkInterfaceSpecificationList): Self = StObject.set(x, "NetworkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "NetworkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: LaunchTemplateInstanceNetworkInterfaceSpecification*): Self = StObject.set(x, "NetworkInterfaces", js.Array(value*))
    
    inline def setPlacement(value: LaunchTemplatePlacement): Self = StObject.set(x, "Placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "Placement", js.undefined)
    
    inline def setPrivateDnsNameOptions(value: LaunchTemplatePrivateDnsNameOptions): Self = StObject.set(x, "PrivateDnsNameOptions", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsNameOptionsUndefined: Self = StObject.set(x, "PrivateDnsNameOptions", js.undefined)
    
    inline def setRamDiskId(value: String): Self = StObject.set(x, "RamDiskId", value.asInstanceOf[js.Any])
    
    inline def setRamDiskIdUndefined: Self = StObject.set(x, "RamDiskId", js.undefined)
    
    inline def setSecurityGroupIds(value: ValueStringList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSecurityGroups(value: ValueStringList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setTagSpecifications(value: LaunchTemplateTagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: LaunchTemplateTagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
    
    inline def setUserData(value: String): Self = StObject.set(x, "UserData", value.asInstanceOf[js.Any])
    
    inline def setUserDataUndefined: Self = StObject.set(x, "UserData", js.undefined)
  }
}
