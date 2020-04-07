package typings.babylonjs.BABYLON

import typings.babylonjs.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.EngineView")
@js.native
class EngineView () extends js.Object {
  /** Defines an optional camera used to render the view (will use active camera else) */
  var camera: js.UndefOr[Camera] = js.native
  /** Defines the canvas where to render the view */
  var target: HTMLCanvasElement = js.native
}

