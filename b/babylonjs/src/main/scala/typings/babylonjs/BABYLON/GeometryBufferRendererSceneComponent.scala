package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeometryBufferRendererSceneComponent
  extends StObject
     with ISceneComponent {
  
  /* private */ var _gatherRenderTargets: Any
}
object GeometryBufferRendererSceneComponent {
  
  inline def apply(
    _gatherRenderTargets: Any,
    dispose: () => Unit,
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    scene: Scene
  ): GeometryBufferRendererSceneComponent = {
    val __obj = js.Dynamic.literal(_gatherRenderTargets = _gatherRenderTargets.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryBufferRendererSceneComponent]
  }
  
  extension [Self <: GeometryBufferRendererSceneComponent](x: Self) {
    
    inline def set_gatherRenderTargets(value: Any): Self = StObject.set(x, "_gatherRenderTargets", value.asInstanceOf[js.Any])
  }
}
