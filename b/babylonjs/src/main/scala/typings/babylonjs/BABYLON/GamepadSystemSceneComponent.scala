package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GamepadSystemSceneComponent
  extends StObject
     with ISceneComponent {
  
  /* private */ var _beforeCameraUpdate: js.Any
}
object GamepadSystemSceneComponent {
  
  inline def apply(
    _beforeCameraUpdate: js.Any,
    dispose: () => Unit,
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    scene: Scene
  ): GamepadSystemSceneComponent = {
    val __obj = js.Dynamic.literal(_beforeCameraUpdate = _beforeCameraUpdate.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadSystemSceneComponent]
  }
  
  extension [Self <: GamepadSystemSceneComponent](x: Self) {
    
    inline def set_beforeCameraUpdate(value: js.Any): Self = StObject.set(x, "_beforeCameraUpdate", value.asInstanceOf[js.Any])
  }
}
