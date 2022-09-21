package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrePassRendererSceneComponent
  extends StObject
     with ISceneComponent {
  
  /* private */ var _afterCameraDraw: Any
  
  /* private */ var _afterRenderTargetDraw: Any
  
  /* private */ var _afterRenderingMeshStage: Any
  
  /* private */ var _beforeCameraDraw: Any
  
  /* private */ var _beforeClearStage: Any
  
  /* private */ var _beforeRenderTargetClearStage: Any
  
  /* private */ var _beforeRenderTargetDraw: Any
  
  /* private */ var _beforeRenderingMeshStage: Any
}
object PrePassRendererSceneComponent {
  
  inline def apply(
    _afterCameraDraw: Any,
    _afterRenderTargetDraw: Any,
    _afterRenderingMeshStage: Any,
    _beforeCameraDraw: Any,
    _beforeClearStage: Any,
    _beforeRenderTargetClearStage: Any,
    _beforeRenderTargetDraw: Any,
    _beforeRenderingMeshStage: Any,
    dispose: () => Unit,
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    scene: Scene
  ): PrePassRendererSceneComponent = {
    val __obj = js.Dynamic.literal(_afterCameraDraw = _afterCameraDraw.asInstanceOf[js.Any], _afterRenderTargetDraw = _afterRenderTargetDraw.asInstanceOf[js.Any], _afterRenderingMeshStage = _afterRenderingMeshStage.asInstanceOf[js.Any], _beforeCameraDraw = _beforeCameraDraw.asInstanceOf[js.Any], _beforeClearStage = _beforeClearStage.asInstanceOf[js.Any], _beforeRenderTargetClearStage = _beforeRenderTargetClearStage.asInstanceOf[js.Any], _beforeRenderTargetDraw = _beforeRenderTargetDraw.asInstanceOf[js.Any], _beforeRenderingMeshStage = _beforeRenderingMeshStage.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrePassRendererSceneComponent]
  }
  
  extension [Self <: PrePassRendererSceneComponent](x: Self) {
    
    inline def set_afterCameraDraw(value: Any): Self = StObject.set(x, "_afterCameraDraw", value.asInstanceOf[js.Any])
    
    inline def set_afterRenderTargetDraw(value: Any): Self = StObject.set(x, "_afterRenderTargetDraw", value.asInstanceOf[js.Any])
    
    inline def set_afterRenderingMeshStage(value: Any): Self = StObject.set(x, "_afterRenderingMeshStage", value.asInstanceOf[js.Any])
    
    inline def set_beforeCameraDraw(value: Any): Self = StObject.set(x, "_beforeCameraDraw", value.asInstanceOf[js.Any])
    
    inline def set_beforeClearStage(value: Any): Self = StObject.set(x, "_beforeClearStage", value.asInstanceOf[js.Any])
    
    inline def set_beforeRenderTargetClearStage(value: Any): Self = StObject.set(x, "_beforeRenderTargetClearStage", value.asInstanceOf[js.Any])
    
    inline def set_beforeRenderTargetDraw(value: Any): Self = StObject.set(x, "_beforeRenderTargetDraw", value.asInstanceOf[js.Any])
    
    inline def set_beforeRenderingMeshStage(value: Any): Self = StObject.set(x, "_beforeRenderingMeshStage", value.asInstanceOf[js.Any])
  }
}
