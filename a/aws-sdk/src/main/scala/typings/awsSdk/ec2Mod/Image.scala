package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  /**
    * The architecture of the image.
    */
  var Architecture: js.UndefOr[ArchitectureValues] = js.undefined
  
  /**
    * Any block device mapping entries.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.undefined
  
  /**
    * The date and time the image was created.
    */
  var CreationDate: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the AMI that was provided during image creation.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether enhanced networking with ENA is enabled.
    */
  var EnaSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The hypervisor type of the image.
    */
  var Hypervisor: js.UndefOr[HypervisorType] = js.undefined
  
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[String] = js.undefined
  
  /**
    * The location of the AMI.
    */
  var ImageLocation: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS account alias (for example, amazon, self) or the AWS account ID of the AMI owner.
    */
  var ImageOwnerAlias: js.UndefOr[String] = js.undefined
  
  /**
    * The type of image.
    */
  var ImageType: js.UndefOr[ImageTypeValues] = js.undefined
  
  /**
    * The kernel associated with the image, if any. Only applicable for machine images.
    */
  var KernelId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the AMI that was provided during image creation.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS account ID of the image owner.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * This value is set to windows for Windows AMIs; otherwise, it is blank.
    */
  var Platform: js.UndefOr[PlatformValues] = js.undefined
  
  /**
    * The platform details associated with the billing code of the AMI. For more information, see Obtaining Billing Information in the Amazon Elastic Compute Cloud User Guide.
    */
  var PlatformDetails: js.UndefOr[String] = js.undefined
  
  /**
    * Any product codes associated with the AMI.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.undefined
  
  /**
    * Indicates whether the image has public launch permissions. The value is true if this image has public launch permissions or false if it has only implicit and explicit launch permissions.
    */
  var Public: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The RAM disk associated with the image, if any. Only applicable for machine images.
    */
  var RamdiskId: js.UndefOr[String] = js.undefined
  
  /**
    * The device name of the root device volume (for example, /dev/sda1).
    */
  var RootDeviceName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of root device used by the AMI. The AMI can use an EBS volume or an instance store volume.
    */
  var RootDeviceType: js.UndefOr[DeviceType] = js.undefined
  
  /**
    * Specifies whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
    */
  var SriovNetSupport: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the AMI. If the state is available, the image is successfully registered and can be used to launch an instance.
    */
  var State: js.UndefOr[ImageState] = js.undefined
  
  /**
    * The reason for the state change.
    */
  var StateReason: js.UndefOr[typings.awsSdk.ec2Mod.StateReason] = js.undefined
  
  /**
    * Any tags assigned to the image.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The operation of the Amazon EC2 instance and the billing code that is associated with the AMI. usageOperation corresponds to the lineitem/Operation column on your AWS Cost and Usage Report and in the AWS Price List API. For the list of UsageOperation codes, see Platform Details and Usage Operation Billing Codes in the Amazon Elastic Compute Cloud User Guide.
    */
  var UsageOperation: js.UndefOr[String] = js.undefined
  
  /**
    * The type of virtualization of the AMI.
    */
  var VirtualizationType: js.UndefOr[typings.awsSdk.ec2Mod.VirtualizationType] = js.undefined
}
object Image {
  
  @scala.inline
  def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchitecture(value: ArchitectureValues): Self = StObject.set(x, "Architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchitectureUndefined: Self = StObject.set(x, "Architecture", js.undefined)
    
    @scala.inline
    def setBlockDeviceMappings(value: BlockDeviceMappingList): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: BlockDeviceMapping*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value :_*))
    
    @scala.inline
    def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEnaSupport(value: Boolean): Self = StObject.set(x, "EnaSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnaSupportUndefined: Self = StObject.set(x, "EnaSupport", js.undefined)
    
    @scala.inline
    def setHypervisor(value: HypervisorType): Self = StObject.set(x, "Hypervisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHypervisorUndefined: Self = StObject.set(x, "Hypervisor", js.undefined)
    
    @scala.inline
    def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    @scala.inline
    def setImageLocation(value: String): Self = StObject.set(x, "ImageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageLocationUndefined: Self = StObject.set(x, "ImageLocation", js.undefined)
    
    @scala.inline
    def setImageOwnerAlias(value: String): Self = StObject.set(x, "ImageOwnerAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageOwnerAliasUndefined: Self = StObject.set(x, "ImageOwnerAlias", js.undefined)
    
    @scala.inline
    def setImageType(value: ImageTypeValues): Self = StObject.set(x, "ImageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageTypeUndefined: Self = StObject.set(x, "ImageType", js.undefined)
    
    @scala.inline
    def setKernelId(value: String): Self = StObject.set(x, "KernelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelIdUndefined: Self = StObject.set(x, "KernelId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setPlatform(value: PlatformValues): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformDetails(value: String): Self = StObject.set(x, "PlatformDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformDetailsUndefined: Self = StObject.set(x, "PlatformDetails", js.undefined)
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    @scala.inline
    def setProductCodes(value: ProductCodeList): Self = StObject.set(x, "ProductCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCodesUndefined: Self = StObject.set(x, "ProductCodes", js.undefined)
    
    @scala.inline
    def setProductCodesVarargs(value: ProductCode*): Self = StObject.set(x, "ProductCodes", js.Array(value :_*))
    
    @scala.inline
    def setPublic(value: Boolean): Self = StObject.set(x, "Public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicUndefined: Self = StObject.set(x, "Public", js.undefined)
    
    @scala.inline
    def setRamdiskId(value: String): Self = StObject.set(x, "RamdiskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRamdiskIdUndefined: Self = StObject.set(x, "RamdiskId", js.undefined)
    
    @scala.inline
    def setRootDeviceName(value: String): Self = StObject.set(x, "RootDeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDeviceNameUndefined: Self = StObject.set(x, "RootDeviceName", js.undefined)
    
    @scala.inline
    def setRootDeviceType(value: DeviceType): Self = StObject.set(x, "RootDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDeviceTypeUndefined: Self = StObject.set(x, "RootDeviceType", js.undefined)
    
    @scala.inline
    def setSriovNetSupport(value: String): Self = StObject.set(x, "SriovNetSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSriovNetSupportUndefined: Self = StObject.set(x, "SriovNetSupport", js.undefined)
    
    @scala.inline
    def setState(value: ImageState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReason(value: StateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setUsageOperation(value: String): Self = StObject.set(x, "UsageOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageOperationUndefined: Self = StObject.set(x, "UsageOperation", js.undefined)
    
    @scala.inline
    def setVirtualizationType(value: VirtualizationType): Self = StObject.set(x, "VirtualizationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualizationTypeUndefined: Self = StObject.set(x, "VirtualizationType", js.undefined)
  }
}
