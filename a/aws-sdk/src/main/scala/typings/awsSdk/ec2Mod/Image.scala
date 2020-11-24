package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends js.Object {
  
  /**
    * The architecture of the image.
    */
  var Architecture: js.UndefOr[ArchitectureValues] = js.native
  
  /**
    * Any block device mapping entries.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.native
  
  /**
    * The date and time the image was created.
    */
  var CreationDate: js.UndefOr[String] = js.native
  
  /**
    * The description of the AMI that was provided during image creation.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether enhanced networking with ENA is enabled.
    */
  var EnaSupport: js.UndefOr[Boolean] = js.native
  
  /**
    * The hypervisor type of the image.
    */
  var Hypervisor: js.UndefOr[HypervisorType] = js.native
  
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[String] = js.native
  
  /**
    * The location of the AMI.
    */
  var ImageLocation: js.UndefOr[String] = js.native
  
  /**
    * The AWS account alias (for example, amazon, self) or the AWS account ID of the AMI owner.
    */
  var ImageOwnerAlias: js.UndefOr[String] = js.native
  
  /**
    * The type of image.
    */
  var ImageType: js.UndefOr[ImageTypeValues] = js.native
  
  /**
    * The kernel associated with the image, if any. Only applicable for machine images.
    */
  var KernelId: js.UndefOr[String] = js.native
  
  /**
    * The name of the AMI that was provided during image creation.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The AWS account ID of the image owner.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * This value is set to windows for Windows AMIs; otherwise, it is blank.
    */
  var Platform: js.UndefOr[PlatformValues] = js.native
  
  /**
    * The platform details associated with the billing code of the AMI. For more information, see Obtaining Billing Information in the Amazon Elastic Compute Cloud User Guide.
    */
  var PlatformDetails: js.UndefOr[String] = js.native
  
  /**
    * Any product codes associated with the AMI.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.native
  
  /**
    * Indicates whether the image has public launch permissions. The value is true if this image has public launch permissions or false if it has only implicit and explicit launch permissions.
    */
  var Public: js.UndefOr[Boolean] = js.native
  
  /**
    * The RAM disk associated with the image, if any. Only applicable for machine images.
    */
  var RamdiskId: js.UndefOr[String] = js.native
  
  /**
    * The device name of the root device volume (for example, /dev/sda1).
    */
  var RootDeviceName: js.UndefOr[String] = js.native
  
  /**
    * The type of root device used by the AMI. The AMI can use an EBS volume or an instance store volume.
    */
  var RootDeviceType: js.UndefOr[DeviceType] = js.native
  
  /**
    * Specifies whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
    */
  var SriovNetSupport: js.UndefOr[String] = js.native
  
  /**
    * The current state of the AMI. If the state is available, the image is successfully registered and can be used to launch an instance.
    */
  var State: js.UndefOr[ImageState] = js.native
  
  /**
    * The reason for the state change.
    */
  var StateReason: js.UndefOr[typings.awsSdk.ec2Mod.StateReason] = js.native
  
  /**
    * Any tags assigned to the image.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The operation of the Amazon EC2 instance and the billing code that is associated with the AMI. usageOperation corresponds to the lineitem/Operation column on your AWS Cost and Usage Report and in the AWS Price List API. For the list of UsageOperation codes, see Platform Details and Usage Operation Billing Codes in the Amazon Elastic Compute Cloud User Guide.
    */
  var UsageOperation: js.UndefOr[String] = js.native
  
  /**
    * The type of virtualization of the AMI.
    */
  var VirtualizationType: js.UndefOr[typings.awsSdk.ec2Mod.VirtualizationType] = js.native
}
object Image {
  
  @scala.inline
  def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    
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
    def setArchitecture(value: ArchitectureValues): Self = this.set("Architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchitecture: Self = this.set("Architecture", js.undefined)
    
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: BlockDeviceMapping*): Self = this.set("BlockDeviceMappings", js.Array(value :_*))
    
    @scala.inline
    def setBlockDeviceMappings(value: BlockDeviceMappingList): Self = this.set("BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockDeviceMappings: Self = this.set("BlockDeviceMappings", js.undefined)
    
    @scala.inline
    def setCreationDate(value: String): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEnaSupport(value: Boolean): Self = this.set("EnaSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnaSupport: Self = this.set("EnaSupport", js.undefined)
    
    @scala.inline
    def setHypervisor(value: HypervisorType): Self = this.set("Hypervisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHypervisor: Self = this.set("Hypervisor", js.undefined)
    
    @scala.inline
    def setImageId(value: String): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageId: Self = this.set("ImageId", js.undefined)
    
    @scala.inline
    def setImageLocation(value: String): Self = this.set("ImageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageLocation: Self = this.set("ImageLocation", js.undefined)
    
    @scala.inline
    def setImageOwnerAlias(value: String): Self = this.set("ImageOwnerAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageOwnerAlias: Self = this.set("ImageOwnerAlias", js.undefined)
    
    @scala.inline
    def setImageType(value: ImageTypeValues): Self = this.set("ImageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageType: Self = this.set("ImageType", js.undefined)
    
    @scala.inline
    def setKernelId(value: String): Self = this.set("KernelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelId: Self = this.set("KernelId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    
    @scala.inline
    def setPlatform(value: PlatformValues): Self = this.set("Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("Platform", js.undefined)
    
    @scala.inline
    def setPlatformDetails(value: String): Self = this.set("PlatformDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformDetails: Self = this.set("PlatformDetails", js.undefined)
    
    @scala.inline
    def setProductCodesVarargs(value: ProductCode*): Self = this.set("ProductCodes", js.Array(value :_*))
    
    @scala.inline
    def setProductCodes(value: ProductCodeList): Self = this.set("ProductCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductCodes: Self = this.set("ProductCodes", js.undefined)
    
    @scala.inline
    def setPublic(value: Boolean): Self = this.set("Public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublic: Self = this.set("Public", js.undefined)
    
    @scala.inline
    def setRamdiskId(value: String): Self = this.set("RamdiskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRamdiskId: Self = this.set("RamdiskId", js.undefined)
    
    @scala.inline
    def setRootDeviceName(value: String): Self = this.set("RootDeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootDeviceName: Self = this.set("RootDeviceName", js.undefined)
    
    @scala.inline
    def setRootDeviceType(value: DeviceType): Self = this.set("RootDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootDeviceType: Self = this.set("RootDeviceType", js.undefined)
    
    @scala.inline
    def setSriovNetSupport(value: String): Self = this.set("SriovNetSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSriovNetSupport: Self = this.set("SriovNetSupport", js.undefined)
    
    @scala.inline
    def setState(value: ImageState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setStateReason(value: StateReason): Self = this.set("StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateReason: Self = this.set("StateReason", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setUsageOperation(value: String): Self = this.set("UsageOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsageOperation: Self = this.set("UsageOperation", js.undefined)
    
    @scala.inline
    def setVirtualizationType(value: VirtualizationType): Self = this.set("VirtualizationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualizationType: Self = this.set("VirtualizationType", js.undefined)
  }
}
