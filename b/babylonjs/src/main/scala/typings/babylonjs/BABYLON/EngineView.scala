package typings.babylonjs.BABYLON

import typings.babylonjs.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EngineView extends js.Object {
  /** Defines an optional camera used to render the view (will use active camera else) */
  var camera: js.UndefOr[Camera] = js.undefined
  /** Defines the canvas where to render the view */
  var target: HTMLCanvasElement
}

object EngineView {
  @scala.inline
  def apply(target: HTMLCanvasElement, camera: Camera = null): EngineView = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineView]
  }
}

