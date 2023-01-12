package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostProcessRenderPipelineManagerSceneComponent
  extends StObject
     with ISceneComponent {
  
  /* private */ var _gatherRenderTargets: Any
}
object PostProcessRenderPipelineManagerSceneComponent {
  
  inline def apply(
    _gatherRenderTargets: Any,
    dispose: () => Unit,
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    scene: Scene
  ): PostProcessRenderPipelineManagerSceneComponent = {
    val __obj = js.Dynamic.literal(_gatherRenderTargets = _gatherRenderTargets.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostProcessRenderPipelineManagerSceneComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostProcessRenderPipelineManagerSceneComponent] (val x: Self) extends AnyVal {
    
    inline def set_gatherRenderTargets(value: Any): Self = StObject.set(x, "_gatherRenderTargets", value.asInstanceOf[js.Any])
  }
}
