package typings.babylonjs.engineViewsMod

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.cameraMod.Camera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Engines/Extensions/engine.views", "EngineView")
@js.native
class EngineView () extends js.Object {
  /** Defines an optional camera used to render the view (will use active camera else) */
  var camera: js.UndefOr[Camera] = js.native
  /** Defines the canvas where to render the view */
  var target: HTMLCanvasElement = js.native
}

