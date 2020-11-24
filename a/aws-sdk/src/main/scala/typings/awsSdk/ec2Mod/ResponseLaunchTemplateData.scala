package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseLaunchTemplateData extends js.Object {
  
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
  implicit class ResponseLaunchTemplateDataOps[Self <: ResponseLaunchTemplateData] (val x: Self) extends AnyVal {
    
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
    def setBlockDeviceMappingsVarargs(value: LaunchTemplateBlockDeviceMapping*): Self = this.set("BlockDeviceMappings", js.Array(value :_*))
    
    @scala.inline
    def setBlockDeviceMappings(value: LaunchTemplateBlockDeviceMappingList): Self = this.set("BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockDeviceMappings: Self = this.set("BlockDeviceMappings", js.undefined)
    
    @scala.inline
    def setCapacityReservationSpecification(value: LaunchTemplateCapacityReservationSpecificationResponse): Self = this.set("CapacityReservationSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacityReservationSpecification: Self = this.set("CapacityReservationSpecification", js.undefined)
    
    @scala.inline
    def setCpuOptions(value: LaunchTemplateCpuOptions): Self = this.set("CpuOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuOptions: Self = this.set("CpuOptions", js.undefined)
    
    @scala.inline
    def setCreditSpecification(value: CreditSpecification): Self = this.set("CreditSpecification", value.asInstanceOf[js.Any])
    
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
    def setElasticGpuSpecificationsVarargs(value: ElasticGpuSpecificationResponse*): Self = this.set("ElasticGpuSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setElasticGpuSpecifications(value: ElasticGpuSpecificationResponseList): Self = this.set("ElasticGpuSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticGpuSpecifications: Self = this.set("ElasticGpuSpecifications", js.undefined)
    
    @scala.inline
    def setElasticInferenceAcceleratorsVarargs(value: LaunchTemplateElasticInferenceAcceleratorResponse*): Self = this.set("ElasticInferenceAccelerators", js.Array(value :_*))
    
    @scala.inline
    def setElasticInferenceAccelerators(value: LaunchTemplateElasticInferenceAcceleratorResponseList): Self = this.set("ElasticInferenceAccelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticInferenceAccelerators: Self = this.set("ElasticInferenceAccelerators", js.undefined)
    
    @scala.inline
    def setEnclaveOptions(value: LaunchTemplateEnclaveOptions): Self = this.set("EnclaveOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnclaveOptions: Self = this.set("EnclaveOptions", js.undefined)
    
    @scala.inline
    def setHibernationOptions(value: LaunchTemplateHibernationOptions): Self = this.set("HibernationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHibernationOptions: Self = this.set("HibernationOptions", js.undefined)
    
    @scala.inline
    def setIamInstanceProfile(value: LaunchTemplateIamInstanceProfileSpecification): Self = this.set("IamInstanceProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamInstanceProfile: Self = this.set("IamInstanceProfile", js.undefined)
    
    @scala.inline
    def setImageId(value: String): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageId: Self = this.set("ImageId", js.undefined)
    
    @scala.inline
    def setInstanceInitiatedShutdownBehavior(value: ShutdownBehavior): Self = this.set("InstanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceInitiatedShutdownBehavior: Self = this.set("InstanceInitiatedShutdownBehavior", js.undefined)
    
    @scala.inline
    def setInstanceMarketOptions(value: LaunchTemplateInstanceMarketOptions): Self = this.set("InstanceMarketOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceMarketOptions: Self = this.set("InstanceMarketOptions", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setKernelId(value: String): Self = this.set("KernelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelId: Self = this.set("KernelId", js.undefined)
    
    @scala.inline
    def setKeyName(value: String): Self = this.set("KeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyName: Self = this.set("KeyName", js.undefined)
    
    @scala.inline
    def setLicenseSpecificationsVarargs(value: LaunchTemplateLicenseConfiguration*): Self = this.set("LicenseSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setLicenseSpecifications(value: LaunchTemplateLicenseList): Self = this.set("LicenseSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseSpecifications: Self = this.set("LicenseSpecifications", js.undefined)
    
    @scala.inline
    def setMetadataOptions(value: LaunchTemplateInstanceMetadataOptions): Self = this.set("MetadataOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataOptions: Self = this.set("MetadataOptions", js.undefined)
    
    @scala.inline
    def setMonitoring(value: LaunchTemplatesMonitoring): Self = this.set("Monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoring: Self = this.set("Monitoring", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: LaunchTemplateInstanceNetworkInterfaceSpecification*): Self = this.set("NetworkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaces(value: LaunchTemplateInstanceNetworkInterfaceSpecificationList): Self = this.set("NetworkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaces: Self = this.set("NetworkInterfaces", js.undefined)
    
    @scala.inline
    def setPlacement(value: LaunchTemplatePlacement): Self = this.set("Placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("Placement", js.undefined)
    
    @scala.inline
    def setRamDiskId(value: String): Self = this.set("RamDiskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRamDiskId: Self = this.set("RamDiskId", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: ValueStringList): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: String*): Self = this.set("SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: ValueStringList): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: LaunchTemplateTagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTagSpecifications(value: LaunchTemplateTagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
    
    @scala.inline
    def setUserData(value: String): Self = this.set("UserData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserData: Self = this.set("UserData", js.undefined)
  }
}
