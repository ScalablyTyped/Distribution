package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrePassRendererSceneComponent
  extends StObject
     with ISceneComponent {
  
  /* private */ var _afterCameraDraw: js.Any
  
  /* private */ var _afterRenderingMeshStage: js.Any
  
  /* private */ var _beforeCameraDraw: js.Any
  
  /* private */ var _beforeClearStage: js.Any
  
  /* private */ var _beforeRenderingMeshStage: js.Any
}
object PrePassRendererSceneComponent {
  
  inline def apply(
    _afterCameraDraw: js.Any,
    _afterRenderingMeshStage: js.Any,
    _beforeCameraDraw: js.Any,
    _beforeClearStage: js.Any,
    _beforeRenderingMeshStage: js.Any,
    dispose: () => Unit,
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    scene: Scene
  ): PrePassRendererSceneComponent = {
    val __obj = js.Dynamic.literal(_afterCameraDraw = _afterCameraDraw.asInstanceOf[js.Any], _afterRenderingMeshStage = _afterRenderingMeshStage.asInstanceOf[js.Any], _beforeCameraDraw = _beforeCameraDraw.asInstanceOf[js.Any], _beforeClearStage = _beforeClearStage.asInstanceOf[js.Any], _beforeRenderingMeshStage = _beforeRenderingMeshStage.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrePassRendererSceneComponent]
  }
  
  extension [Self <: PrePassRendererSceneComponent](x: Self) {
    
    inline def set_afterCameraDraw(value: js.Any): Self = StObject.set(x, "_afterCameraDraw", value.asInstanceOf[js.Any])
    
    inline def set_afterRenderingMeshStage(value: js.Any): Self = StObject.set(x, "_afterRenderingMeshStage", value.asInstanceOf[js.Any])
    
    inline def set_beforeCameraDraw(value: js.Any): Self = StObject.set(x, "_beforeCameraDraw", value.asInstanceOf[js.Any])
    
    inline def set_beforeClearStage(value: js.Any): Self = StObject.set(x, "_beforeClearStage", value.asInstanceOf[js.Any])
    
    inline def set_beforeRenderingMeshStage(value: js.Any): Self = StObject.set(x, "_beforeRenderingMeshStage", value.asInstanceOf[js.Any])
  }
}
