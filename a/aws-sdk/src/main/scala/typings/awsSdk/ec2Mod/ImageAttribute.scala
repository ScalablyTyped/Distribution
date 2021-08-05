package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageAttribute extends StObject {
  
  /**
    * The block device mapping entries.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.undefined
  
  /**
    * A description for the AMI.
    */
  var Description: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[String] = js.undefined
  
  /**
    * The kernel ID.
    */
  var KernelId: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * The launch permissions.
    */
  var LaunchPermissions: js.UndefOr[LaunchPermissionList] = js.undefined
  
  /**
    * The product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.undefined
  
  /**
    * The RAM disk ID.
    */
  var RamdiskId: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
    */
  var SriovNetSupport: js.UndefOr[AttributeValue] = js.undefined
}
object ImageAttribute {
  
  inline def apply(): ImageAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageAttribute]
  }
  
  extension [Self <: ImageAttribute](x: Self) {
    
    inline def setBlockDeviceMappings(value: BlockDeviceMappingList): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    inline def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    inline def setBlockDeviceMappingsVarargs(value: BlockDeviceMapping*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value :_*))
    
    inline def setDescription(value: AttributeValue): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setKernelId(value: AttributeValue): Self = StObject.set(x, "KernelId", value.asInstanceOf[js.Any])
    
    inline def setKernelIdUndefined: Self = StObject.set(x, "KernelId", js.undefined)
    
    inline def setLaunchPermissions(value: LaunchPermissionList): Self = StObject.set(x, "LaunchPermissions", value.asInstanceOf[js.Any])
    
    inline def setLaunchPermissionsUndefined: Self = StObject.set(x, "LaunchPermissions", js.undefined)
    
    inline def setLaunchPermissionsVarargs(value: LaunchPermission*): Self = StObject.set(x, "LaunchPermissions", js.Array(value :_*))
    
    inline def setProductCodes(value: ProductCodeList): Self = StObject.set(x, "ProductCodes", value.asInstanceOf[js.Any])
    
    inline def setProductCodesUndefined: Self = StObject.set(x, "ProductCodes", js.undefined)
    
    inline def setProductCodesVarargs(value: ProductCode*): Self = StObject.set(x, "ProductCodes", js.Array(value :_*))
    
    inline def setRamdiskId(value: AttributeValue): Self = StObject.set(x, "RamdiskId", value.asInstanceOf[js.Any])
    
    inline def setRamdiskIdUndefined: Self = StObject.set(x, "RamdiskId", js.undefined)
    
    inline def setSriovNetSupport(value: AttributeValue): Self = StObject.set(x, "SriovNetSupport", value.asInstanceOf[js.Any])
    
    inline def setSriovNetSupportUndefined: Self = StObject.set(x, "SriovNetSupport", js.undefined)
  }
}
