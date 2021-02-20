package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProceduralTextureSceneComponent extends ISceneComponent {
  
  var _beforeClear: js.Any = js.native
}
object ProceduralTextureSceneComponent {
  
  @scala.inline
  def apply(
    _beforeClear: js.Any,
    dispose: () => Unit,
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    scene: Scene
  ): ProceduralTextureSceneComponent = {
    val __obj = js.Dynamic.literal(_beforeClear = _beforeClear.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProceduralTextureSceneComponent]
  }
  
  @scala.inline
  implicit class ProceduralTextureSceneComponentMutableBuilder[Self <: ProceduralTextureSceneComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_beforeClear(value: js.Any): Self = StObject.set(x, "_beforeClear", value.asInstanceOf[js.Any])
  }
}
