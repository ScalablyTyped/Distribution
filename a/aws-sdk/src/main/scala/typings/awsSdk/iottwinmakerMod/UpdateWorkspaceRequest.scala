package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkspaceRequest extends StObject {
  
  /**
    * The description of the workspace.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The ARN of the execution role associated with the workspace.
    */
  var role: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The ID of the workspace.
    */
  var workspaceId: Id
}
object UpdateWorkspaceRequest {
  
  inline def apply(workspaceId: Id): UpdateWorkspaceRequest = {
    val __obj = js.Dynamic.literal(workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkspaceRequest]
  }
  
  extension [Self <: UpdateWorkspaceRequest](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setRole(value: RoleArn): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
