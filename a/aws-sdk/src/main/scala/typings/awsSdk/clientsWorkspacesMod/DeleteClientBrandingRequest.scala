package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClientBrandingRequest extends StObject {
  
  /**
    * The device type for which you want to delete client branding.
    */
  var Platforms: ClientDeviceTypeList
  
  /**
    * The directory identifier of the WorkSpace for which you want to delete client branding.
    */
  var ResourceId: DirectoryId
}
object DeleteClientBrandingRequest {
  
  inline def apply(Platforms: ClientDeviceTypeList, ResourceId: DirectoryId): DeleteClientBrandingRequest = {
    val __obj = js.Dynamic.literal(Platforms = Platforms.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClientBrandingRequest]
  }
  
  extension [Self <: DeleteClientBrandingRequest](x: Self) {
    
    inline def setPlatforms(value: ClientDeviceTypeList): Self = StObject.set(x, "Platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsVarargs(value: ClientDeviceType*): Self = StObject.set(x, "Platforms", js.Array(value*))
    
    inline def setResourceId(value: DirectoryId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
