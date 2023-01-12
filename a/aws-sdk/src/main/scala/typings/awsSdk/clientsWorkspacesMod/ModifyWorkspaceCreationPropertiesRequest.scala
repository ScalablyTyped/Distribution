package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyWorkspaceCreationPropertiesRequest extends StObject {
  
  /**
    * The identifier of the directory.
    */
  var ResourceId: DirectoryId
  
  /**
    * The default properties for creating WorkSpaces.
    */
  var WorkspaceCreationProperties: typings.awsSdk.clientsWorkspacesMod.WorkspaceCreationProperties
}
object ModifyWorkspaceCreationPropertiesRequest {
  
  inline def apply(ResourceId: DirectoryId, WorkspaceCreationProperties: WorkspaceCreationProperties): ModifyWorkspaceCreationPropertiesRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], WorkspaceCreationProperties = WorkspaceCreationProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyWorkspaceCreationPropertiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyWorkspaceCreationPropertiesRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceId(value: DirectoryId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceCreationProperties(value: WorkspaceCreationProperties): Self = StObject.set(x, "WorkspaceCreationProperties", value.asInstanceOf[js.Any])
  }
}
