package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoleUsageType extends StObject {
  
  /**
    * The name of the Region where the service-linked role is being used.
    */
  var Region: js.UndefOr[RegionNameType] = js.undefined
  
  /**
    * The name of the resource that is using the service-linked role.
    */
  var Resources: js.UndefOr[ArnListType] = js.undefined
}
object RoleUsageType {
  
  @scala.inline
  def apply(): RoleUsageType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleUsageType]
  }
  
  @scala.inline
  implicit class RoleUsageTypeMutableBuilder[Self <: RoleUsageType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegion(value: RegionNameType): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    @scala.inline
    def setResources(value: ArnListType): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: arnType*): Self = StObject.set(x, "Resources", js.Array(value :_*))
  }
}
