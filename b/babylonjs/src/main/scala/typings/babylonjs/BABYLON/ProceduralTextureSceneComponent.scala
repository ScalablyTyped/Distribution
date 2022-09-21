package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProceduralTextureSceneComponent
  extends StObject
     with ISceneComponent {
  
  /* private */ var _beforeClear: Any
}
object ProceduralTextureSceneComponent {
  
  inline def apply(
    _beforeClear: Any,
    dispose: () => Unit,
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    scene: Scene
  ): ProceduralTextureSceneComponent = {
    val __obj = js.Dynamic.literal(_beforeClear = _beforeClear.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProceduralTextureSceneComponent]
  }
  
  extension [Self <: ProceduralTextureSceneComponent](x: Self) {
    
    inline def set_beforeClear(value: Any): Self = StObject.set(x, "_beforeClear", value.asInstanceOf[js.Any])
  }
}
