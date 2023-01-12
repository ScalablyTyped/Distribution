package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DepthRendererSceneComponent
  extends StObject
     with ISceneComponent {
  
  /* private */ var _gatherActiveCameraRenderTargets: Any
  
  /* private */ var _gatherRenderTargets: Any
}
object DepthRendererSceneComponent {
  
  inline def apply(
    _gatherActiveCameraRenderTargets: Any,
    _gatherRenderTargets: Any,
    dispose: () => Unit,
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    scene: Scene
  ): DepthRendererSceneComponent = {
    val __obj = js.Dynamic.literal(_gatherActiveCameraRenderTargets = _gatherActiveCameraRenderTargets.asInstanceOf[js.Any], _gatherRenderTargets = _gatherRenderTargets.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthRendererSceneComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DepthRendererSceneComponent] (val x: Self) extends AnyVal {
    
    inline def set_gatherActiveCameraRenderTargets(value: Any): Self = StObject.set(x, "_gatherActiveCameraRenderTargets", value.asInstanceOf[js.Any])
    
    inline def set_gatherRenderTargets(value: Any): Self = StObject.set(x, "_gatherRenderTargets", value.asInstanceOf[js.Any])
  }
}
