package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProceduralTextureSceneComponent extends ISceneComponent {
  var _beforeClear: js.Any
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
}

