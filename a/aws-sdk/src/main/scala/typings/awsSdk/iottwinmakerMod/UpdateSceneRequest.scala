package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSceneRequest extends StObject {
  
  /**
    * A list of capabilities that the scene uses to render.
    */
  var capabilities: js.UndefOr[SceneCapabilities] = js.undefined
  
  /**
    * The relative path that specifies the location of the content definition file.
    */
  var contentLocation: js.UndefOr[S3Url] = js.undefined
  
  /**
    * The description of this scene.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the scene.
    */
  var sceneId: Id
  
  /**
    * The ID of the workspace that contains the scene.
    */
  var workspaceId: Id
}
object UpdateSceneRequest {
  
  inline def apply(sceneId: Id, workspaceId: Id): UpdateSceneRequest = {
    val __obj = js.Dynamic.literal(sceneId = sceneId.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSceneRequest]
  }
  
  extension [Self <: UpdateSceneRequest](x: Self) {
    
    inline def setCapabilities(value: SceneCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: SceneCapability*): Self = StObject.set(x, "capabilities", js.Array(value*))
    
    inline def setContentLocation(value: S3Url): Self = StObject.set(x, "contentLocation", value.asInstanceOf[js.Any])
    
    inline def setContentLocationUndefined: Self = StObject.set(x, "contentLocation", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setSceneId(value: Id): Self = StObject.set(x, "sceneId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
