package typings.babylonjs.mod

import typings.babylonjs.HTMLCanvasElement
import typings.std.OffscreenCanvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "CanvasGenerator")
@js.native
class CanvasGenerator ()
  extends typings.babylonjs.legacyMod.CanvasGenerator

/* static members */
@JSImport("babylonjs", "CanvasGenerator")
@js.native
object CanvasGenerator extends js.Object {
  /**
    * Create a new canvas (or offscreen canvas depending on the context)
    * @param width defines the expected width
    * @param height defines the expected height
    * @return a new canvas or offscreen canvas
    */
  def CreateCanvas(width: Double, height: Double): HTMLCanvasElement | OffscreenCanvas = js.native
}

