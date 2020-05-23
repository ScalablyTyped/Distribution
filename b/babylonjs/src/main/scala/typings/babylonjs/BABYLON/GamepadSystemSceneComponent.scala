package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamepadSystemSceneComponent extends ISceneComponent {
  var _beforeCameraUpdate: js.Any
}

object GamepadSystemSceneComponent {
  @scala.inline
  def apply(
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
}

