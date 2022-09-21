package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSceneRequest extends StObject {
  
  /**
    * The ID of the scene to delete.
    */
  var sceneId: Id
  
  /**
    * The ID of the workspace.
    */
  var workspaceId: Id
}
object DeleteSceneRequest {
  
  inline def apply(sceneId: Id, workspaceId: Id): DeleteSceneRequest = {
    val __obj = js.Dynamic.literal(sceneId = sceneId.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSceneRequest]
  }
  
  extension [Self <: DeleteSceneRequest](x: Self) {
    
    inline def setSceneId(value: Id): Self = StObject.set(x, "sceneId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
