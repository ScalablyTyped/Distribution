package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderingGroupInfo extends StObject {
  
  /**
    * The camera currently used for the rendering pass
    */
  var camera: Nullable[Camera]
  
  /**
    * The ID of the renderingGroup being processed
    */
  var renderingGroupId: Double
  
  /**
    * The Scene that being rendered
    */
  var scene: Scene
}
object RenderingGroupInfo {
  
  inline def apply(renderingGroupId: Double, scene: Scene): RenderingGroupInfo = {
    val __obj = js.Dynamic.literal(renderingGroupId = renderingGroupId.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], camera = null)
    __obj.asInstanceOf[RenderingGroupInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderingGroupInfo] (val x: Self) extends AnyVal {
    
    inline def setCamera(value: Nullable[Camera]): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraNull: Self = StObject.set(x, "camera", null)
    
    inline def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
    
    inline def setScene(value: Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
  }
}
