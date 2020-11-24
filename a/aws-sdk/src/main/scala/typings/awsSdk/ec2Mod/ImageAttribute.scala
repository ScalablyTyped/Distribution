package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageAttribute extends js.Object {
  
  /**
    * The block device mapping entries.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.native
  
  /**
    * A description for the AMI.
    */
  var Description: js.UndefOr[AttributeValue] = js.native
  
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[String] = js.native
  
  /**
    * The kernel ID.
    */
  var KernelId: js.UndefOr[AttributeValue] = js.native
  
  /**
    * The launch permissions.
    */
  var LaunchPermissions: js.UndefOr[LaunchPermissionList] = js.native
  
  /**
    * The product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.native
  
  /**
    * The RAM disk ID.
    */
  var RamdiskId: js.UndefOr[AttributeValue] = js.native
  
  /**
    * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
    */
  var SriovNetSupport: js.UndefOr[AttributeValue] = js.native
}
object ImageAttribute {
  
  @scala.inline
  def apply(): ImageAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageAttribute]
  }
  
  @scala.inline
  implicit class ImageAttributeOps[Self <: ImageAttribute] (val x: Self) extends AnyVal {
    
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
    def setBlockDeviceMappingsVarargs(value: BlockDeviceMapping*): Self = this.set("BlockDeviceMappings", js.Array(value :_*))
    
    @scala.inline
    def setBlockDeviceMappings(value: BlockDeviceMappingList): Self = this.set("BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockDeviceMappings: Self = this.set("BlockDeviceMappings", js.undefined)
    
    @scala.inline
    def setDescription(value: AttributeValue): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setImageId(value: String): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageId: Self = this.set("ImageId", js.undefined)
    
    @scala.inline
    def setKernelId(value: AttributeValue): Self = this.set("KernelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelId: Self = this.set("KernelId", js.undefined)
    
    @scala.inline
    def setLaunchPermissionsVarargs(value: LaunchPermission*): Self = this.set("LaunchPermissions", js.Array(value :_*))
    
    @scala.inline
    def setLaunchPermissions(value: LaunchPermissionList): Self = this.set("LaunchPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchPermissions: Self = this.set("LaunchPermissions", js.undefined)
    
    @scala.inline
    def setProductCodesVarargs(value: ProductCode*): Self = this.set("ProductCodes", js.Array(value :_*))
    
    @scala.inline
    def setProductCodes(value: ProductCodeList): Self = this.set("ProductCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductCodes: Self = this.set("ProductCodes", js.undefined)
    
    @scala.inline
    def setRamdiskId(value: AttributeValue): Self = this.set("RamdiskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRamdiskId: Self = this.set("RamdiskId", js.undefined)
    
    @scala.inline
    def setSriovNetSupport(value: AttributeValue): Self = this.set("SriovNetSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSriovNetSupport: Self = this.set("SriovNetSupport", js.undefined)
  }
}
