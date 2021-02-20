package typings.babylonjs.legacyMod

import typings.babylonjs.HTMLCanvasElement
import typings.std.OffscreenCanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "CanvasGenerator")
@js.native
class CanvasGenerator ()
  extends typings.babylonjs.indexMod.CanvasGenerator
/* static members */
object CanvasGenerator {
  
  /**
    * Create a new canvas (or offscreen canvas depending on the context)
    * @param width defines the expected width
    * @param height defines the expected height
    * @return a new canvas or offscreen canvas
    */
  @JSImport("babylonjs/Legacy/legacy", "CanvasGenerator.CreateCanvas")
  @js.native
  def CreateCanvas(width: Double, height: Double): HTMLCanvasElement | OffscreenCanvas = js.native
}
