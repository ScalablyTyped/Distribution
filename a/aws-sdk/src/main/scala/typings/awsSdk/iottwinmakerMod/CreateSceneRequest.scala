package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSceneRequest extends StObject {
  
  /**
    * A list of capabilities that the scene uses to render itself.
    */
  var capabilities: js.UndefOr[SceneCapabilities] = js.undefined
  
  /**
    * The relative path that specifies the location of the content definition file.
    */
  var contentLocation: S3Url
  
  /**
    * The description for this scene.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the scene.
    */
  var sceneId: Id
  
  /**
    * Metadata that you can use to manage the scene.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The ID of the workspace that contains the scene.
    */
  var workspaceId: Id
}
object CreateSceneRequest {
  
  inline def apply(contentLocation: S3Url, sceneId: Id, workspaceId: Id): CreateSceneRequest = {
    val __obj = js.Dynamic.literal(contentLocation = contentLocation.asInstanceOf[js.Any], sceneId = sceneId.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSceneRequest]
  }
  
  extension [Self <: CreateSceneRequest](x: Self) {
    
    inline def setCapabilities(value: SceneCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: SceneCapability*): Self = StObject.set(x, "capabilities", js.Array(value*))
    
    inline def setContentLocation(value: S3Url): Self = StObject.set(x, "contentLocation", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setSceneId(value: Id): Self = StObject.set(x, "sceneId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
