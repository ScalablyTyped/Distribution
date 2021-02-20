package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseLaunchTemplateData extends StObject {
  
  /**
    * The block device mappings.
    */
  var BlockDeviceMappings: js.UndefOr[LaunchTemplateBlockDeviceMappingList] = js.native
  
  /**
    * Information about the Capacity Reservation targeting option.
    */
  var CapacityReservationSpecification: js.UndefOr[LaunchTemplateCapacityReservationSpecificationResponse] = js.native
  
  /**
    * The CPU options for the instance. For more information, see Optimizing CPU Options in the Amazon Elastic Compute Cloud User Guide.
    */
  var CpuOptions: js.UndefOr[LaunchTemplateCpuOptions] = js.native
  
  /**
    * The credit option for CPU usage of the instance.
    */
  var CreditSpecification: js.UndefOr[typings.awsSdk.ec2Mod.CreditSpecification] = js.native
  
  /**
    * If set to true, indicates that the instance cannot be terminated using the Amazon EC2 console, command line tool, or API.
    */
  var DisableApiTermination: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the instance is optimized for Amazon EBS I/O. 
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.native
  
  /**
    * The elastic GPU specification.
    */
  var ElasticGpuSpecifications: js.UndefOr[ElasticGpuSpecificationResponseList] = js.native
  
  /**
    *  The elastic inference accelerator for the instance. 
    */
  var ElasticInferenceAccelerators: js.UndefOr[LaunchTemplateElasticInferenceAcceleratorResponseList] = js.native
  
  /**
    * Indicates whether the instance is enabled for AWS Nitro Enclaves.
    */
  var EnclaveOptions: js.UndefOr[LaunchTemplateEnclaveOptions] = js.native
  
  /**
    * Indicates whether an instance is configured for hibernation. For more information, see Hibernate Your Instance in the Amazon Elastic Compute Cloud User Guide.
    */
  var HibernationOptions: js.UndefOr[LaunchTemplateHibernationOptions] = js.native
  
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[LaunchTemplateIamInstanceProfileSpecification] = js.native
  
  /**
    * The ID of the AMI that was used to launch the instance.
    */
  var ImageId: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown).
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.native
  
  /**
    * The market (purchasing) option for the instances.
    */
  var InstanceMarketOptions: js.UndefOr[LaunchTemplateInstanceMarketOptions] = js.native
  
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.native
  
  /**
    * The ID of the kernel, if applicable.
    */
  var KernelId: js.UndefOr[String] = js.native
  
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[String] = js.native
  
  /**
    * The license configurations.
    */
  var LicenseSpecifications: js.UndefOr[LaunchTemplateLicenseList] = js.native
  
  /**
    * The metadata options for the instance. For more information, see Instance Metadata and User Data in the Amazon Elastic Compute Cloud User Guide.
    */
  var MetadataOptions: js.UndefOr[LaunchTemplateInstanceMetadataOptions] = js.native
  
  /**
    * The monitoring for the instance.
    */
  var Monitoring: js.UndefOr[LaunchTemplatesMonitoring] = js.native
  
  /**
    * The network interfaces.
    */
  var NetworkInterfaces: js.UndefOr[LaunchTemplateInstanceNetworkInterfaceSpecificationList] = js.native
  
  /**
    * The placement of the instance.
    */
  var Placement: js.UndefOr[LaunchTemplatePlacement] = js.native
  
  /**
    * The ID of the RAM disk, if applicable.
    */
  var RamDiskId: js.UndefOr[String] = js.native
  
  /**
    * The security group IDs.
    */
  var SecurityGroupIds: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The security group names.
    */
  var SecurityGroups: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The tags.
    */
  var TagSpecifications: js.UndefOr[LaunchTemplateTagSpecificationList] = js.native
  
  /**
    * The user data for the instance. 
    */
  var UserData: js.UndefOr[String] = js.native
}
object ResponseLaunchTemplateData {
  
  @scala.inline
  def apply(): ResponseLaunchTemplateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseLaunchTemplateData]
  }
  
  @scala.inline
  implicit class ResponseLaunchTemplateDataMutableBuilder[Self <: ResponseLaunchTemplateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockDeviceMappings(value: LaunchTemplateBlockDeviceMappingList): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: LaunchTemplateBlockDeviceMapping*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value :_*))
    
    @scala.inline
    def setCapacityReservationSpecification(value: LaunchTemplateCapacityReservationSpecificationResponse): Self = StObject.set(x, "CapacityReservationSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityReservationSpecificationUndefined: Self = StObject.set(x, "CapacityReservationSpecification", js.undefined)
    
    @scala.inline
    def setCpuOptions(value: LaunchTemplateCpuOptions): Self = StObject.set(x, "CpuOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuOptionsUndefined: Self = StObject.set(x, "CpuOptions", js.undefined)
    
    @scala.inline
    def setCreditSpecification(value: CreditSpecification): Self = StObject.set(x, "CreditSpecification", value.asInstanceOf[js.Any])
    
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
    def setElasticGpuSpecifications(value: ElasticGpuSpecificationResponseList): Self = StObject.set(x, "ElasticGpuSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticGpuSpecificationsUndefined: Self = StObject.set(x, "ElasticGpuSpecifications", js.undefined)
    
    @scala.inline
    def setElasticGpuSpecificationsVarargs(value: ElasticGpuSpecificationResponse*): Self = StObject.set(x, "ElasticGpuSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setElasticInferenceAccelerators(value: LaunchTemplateElasticInferenceAcceleratorResponseList): Self = StObject.set(x, "ElasticInferenceAccelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticInferenceAcceleratorsUndefined: Self = StObject.set(x, "ElasticInferenceAccelerators", js.undefined)
    
    @scala.inline
    def setElasticInferenceAcceleratorsVarargs(value: LaunchTemplateElasticInferenceAcceleratorResponse*): Self = StObject.set(x, "ElasticInferenceAccelerators", js.Array(value :_*))
    
    @scala.inline
    def setEnclaveOptions(value: LaunchTemplateEnclaveOptions): Self = StObject.set(x, "EnclaveOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnclaveOptionsUndefined: Self = StObject.set(x, "EnclaveOptions", js.undefined)
    
    @scala.inline
    def setHibernationOptions(value: LaunchTemplateHibernationOptions): Self = StObject.set(x, "HibernationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHibernationOptionsUndefined: Self = StObject.set(x, "HibernationOptions", js.undefined)
    
    @scala.inline
    def setIamInstanceProfile(value: LaunchTemplateIamInstanceProfileSpecification): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamInstanceProfileUndefined: Self = StObject.set(x, "IamInstanceProfile", js.undefined)
    
    @scala.inline
    def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    @scala.inline
    def setInstanceInitiatedShutdownBehavior(value: ShutdownBehavior): Self = StObject.set(x, "InstanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceInitiatedShutdownBehaviorUndefined: Self = StObject.set(x, "InstanceInitiatedShutdownBehavior", js.undefined)
    
    @scala.inline
    def setInstanceMarketOptions(value: LaunchTemplateInstanceMarketOptions): Self = StObject.set(x, "InstanceMarketOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceMarketOptionsUndefined: Self = StObject.set(x, "InstanceMarketOptions", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setKernelId(value: String): Self = StObject.set(x, "KernelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelIdUndefined: Self = StObject.set(x, "KernelId", js.undefined)
    
    @scala.inline
    def setKeyName(value: String): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
    @scala.inline
    def setLicenseSpecifications(value: LaunchTemplateLicenseList): Self = StObject.set(x, "LicenseSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseSpecificationsUndefined: Self = StObject.set(x, "LicenseSpecifications", js.undefined)
    
    @scala.inline
    def setLicenseSpecificationsVarargs(value: LaunchTemplateLicenseConfiguration*): Self = StObject.set(x, "LicenseSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setMetadataOptions(value: LaunchTemplateInstanceMetadataOptions): Self = StObject.set(x, "MetadataOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataOptionsUndefined: Self = StObject.set(x, "MetadataOptions", js.undefined)
    
    @scala.inline
    def setMonitoring(value: LaunchTemplatesMonitoring): Self = StObject.set(x, "Monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringUndefined: Self = StObject.set(x, "Monitoring", js.undefined)
    
    @scala.inline
    def setNetworkInterfaces(value: LaunchTemplateInstanceNetworkInterfaceSpecificationList): Self = StObject.set(x, "NetworkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfacesUndefined: Self = StObject.set(x, "NetworkInterfaces", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: LaunchTemplateInstanceNetworkInterfaceSpecification*): Self = StObject.set(x, "NetworkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setPlacement(value: LaunchTemplatePlacement): Self = StObject.set(x, "Placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "Placement", js.undefined)
    
    @scala.inline
    def setRamDiskId(value: String): Self = StObject.set(x, "RamDiskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRamDiskIdUndefined: Self = StObject.set(x, "RamDiskId", js.undefined)
    
    @scala.inline
    def setSecurityGroupIds(value: ValueStringList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: ValueStringList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setTagSpecifications(value: LaunchTemplateTagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: LaunchTemplateTagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setUserData(value: String): Self = StObject.set(x, "UserData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDataUndefined: Self = StObject.set(x, "UserData", js.undefined)
  }
}
