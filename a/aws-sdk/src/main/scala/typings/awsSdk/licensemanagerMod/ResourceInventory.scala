package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceInventory extends StObject {
  
  /**
    * Platform of the resource.
    */
  var Platform: js.UndefOr[String] = js.undefined
  
  /**
    * Platform version of the resource in the inventory.
    */
  var PlatformVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the account that owns the resource.
    */
  var ResourceOwningAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * Type of resource.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.licensemanagerMod.ResourceType] = js.undefined
}
object ResourceInventory {
  
  @scala.inline
  def apply(): ResourceInventory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceInventory]
  }
  
  @scala.inline
  implicit class ResourceInventoryMutableBuilder[Self <: ResourceInventory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    @scala.inline
    def setPlatformVersion(value: String): Self = StObject.set(x, "PlatformVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformVersionUndefined: Self = StObject.set(x, "PlatformVersion", js.undefined)
    
    @scala.inline
    def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setResourceOwningAccountId(value: String): Self = StObject.set(x, "ResourceOwningAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceOwningAccountIdUndefined: Self = StObject.set(x, "ResourceOwningAccountId", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
