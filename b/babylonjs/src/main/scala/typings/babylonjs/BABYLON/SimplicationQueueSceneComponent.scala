package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimplicationQueueSceneComponent extends ISceneComponent {
  
  var _beforeCameraUpdate: js.Any = js.native
}
object SimplicationQueueSceneComponent {
  
  @scala.inline
  def apply(
    _beforeCameraUpdate: js.Any,
    dispose: () => Unit,
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    scene: Scene
  ): SimplicationQueueSceneComponent = {
    val __obj = js.Dynamic.literal(_beforeCameraUpdate = _beforeCameraUpdate.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimplicationQueueSceneComponent]
  }
  
  @scala.inline
  implicit class SimplicationQueueSceneComponentMutableBuilder[Self <: SimplicationQueueSceneComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_beforeCameraUpdate(value: js.Any): Self = StObject.set(x, "_beforeCameraUpdate", value.asInstanceOf[js.Any])
  }
}
