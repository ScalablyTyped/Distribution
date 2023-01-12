package typings.awsSdk.clientsWorkspacesMod

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
  var WorkspaceAccessProperties: typings.awsSdk.clientsWorkspacesMod.WorkspaceAccessProperties
}
object ModifyWorkspaceAccessPropertiesRequest {
  
  inline def apply(ResourceId: DirectoryId, WorkspaceAccessProperties: WorkspaceAccessProperties): ModifyWorkspaceAccessPropertiesRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], WorkspaceAccessProperties = WorkspaceAccessProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyWorkspaceAccessPropertiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyWorkspaceAccessPropertiesRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceId(value: DirectoryId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceAccessProperties(value: WorkspaceAccessProperties): Self = StObject.set(x, "WorkspaceAccessProperties", value.asInstanceOf[js.Any])
  }
}
