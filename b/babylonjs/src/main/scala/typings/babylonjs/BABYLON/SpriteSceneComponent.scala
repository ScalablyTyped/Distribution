package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpriteSceneComponent extends ISceneComponent {
  var _pickSpriteButKeepRay: js.Any
  var _pointerDown: js.Any
  var _pointerMove: js.Any
  var _pointerUp: js.Any
  /** @hidden */
  var _spritePredicate: js.Any
}

object SpriteSceneComponent {
  @scala.inline
  def apply(
    _pickSpriteButKeepRay: js.Any,
    _pointerDown: js.Any,
    _pointerMove: js.Any,
    _pointerUp: js.Any,
    _spritePredicate: js.Any,
    dispose: () => Unit,
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    scene: Scene
  ): SpriteSceneComponent = {
    val __obj = js.Dynamic.literal(_pickSpriteButKeepRay = _pickSpriteButKeepRay.asInstanceOf[js.Any], _pointerDown = _pointerDown.asInstanceOf[js.Any], _pointerMove = _pointerMove.asInstanceOf[js.Any], _pointerUp = _pointerUp.asInstanceOf[js.Any], _spritePredicate = _spritePredicate.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSceneComponent]
  }
}

