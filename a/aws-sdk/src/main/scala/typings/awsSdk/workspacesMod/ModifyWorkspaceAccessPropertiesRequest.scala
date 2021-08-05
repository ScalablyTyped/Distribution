package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyWorkspaceAccessPropertiesRequest extends StObject {
  
  /**
    * The identifier of the directory.
    */
  var ResourceId: DirectoryId
  
  /**
    * The device types and operating systems to enable or disable for access.
    */
  var WorkspaceAccessProperties: typings.awsSdk.workspacesMod.WorkspaceAccessProperties
}
object ModifyWorkspaceAccessPropertiesRequest {
  
  inline def apply(ResourceId: DirectoryId, WorkspaceAccessProperties: WorkspaceAccessProperties): ModifyWorkspaceAccessPropertiesRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], WorkspaceAccessProperties = WorkspaceAccessProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyWorkspaceAccessPropertiesRequest]
  }
  
  extension [Self <: ModifyWorkspaceAccessPropertiesRequest](x: Self) {
    
    inline def setResourceId(value: DirectoryId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceAccessProperties(value: WorkspaceAccessProperties): Self = StObject.set(x, "WorkspaceAccessProperties", value.asInstanceOf[js.Any])
  }
}
