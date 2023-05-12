package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FluidRendererSceneComponent
  extends StObject
     with ISceneComponent {
  
  /* private */ var _afterCameraDraw: Any
  
  /* private */ var _gatherActiveCameraRenderTargets: Any
}
object FluidRendererSceneComponent {
  
  inline def apply(
    _afterCameraDraw: Any,
    _gatherActiveCameraRenderTargets: Any,
    dispose: () => Unit,
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    scene: Scene
  ): FluidRendererSceneComponent = {
    val __obj = js.Dynamic.literal(_afterCameraDraw = _afterCameraDraw.asInstanceOf[js.Any], _gatherActiveCameraRenderTargets = _gatherActiveCameraRenderTargets.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[FluidRendererSceneComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FluidRendererSceneComponent] (val x: Self) extends AnyVal {
    
    inline def set_afterCameraDraw(value: Any): Self = StObject.set(x, "_afterCameraDraw", value.asInstanceOf[js.Any])
    
    inline def set_gatherActiveCameraRenderTargets(value: Any): Self = StObject.set(x, "_gatherActiveCameraRenderTargets", value.asInstanceOf[js.Any])
  }
}
