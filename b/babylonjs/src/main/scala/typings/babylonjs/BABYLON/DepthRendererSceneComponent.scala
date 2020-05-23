package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepthRendererSceneComponent extends ISceneComponent {
  var _gatherActiveCameraRenderTargets: js.Any
  var _gatherRenderTargets: js.Any
}

object DepthRendererSceneComponent {
  @scala.inline
  def apply(
    _gatherActiveCameraRenderTargets: js.Any,
    _gatherRenderTargets: js.Any,
    dispose: () => Unit,
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    scene: Scene
  ): DepthRendererSceneComponent = {
    val __obj = js.Dynamic.literal(_gatherActiveCameraRenderTargets = _gatherActiveCameraRenderTargets.asInstanceOf[js.Any], _gatherRenderTargets = _gatherRenderTargets.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthRendererSceneComponent]
  }
}

