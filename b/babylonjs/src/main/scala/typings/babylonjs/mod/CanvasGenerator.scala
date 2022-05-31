package typings.babylonjs.mod

import typings.babylonjs.HTMLCanvasElement
import typings.std.OffscreenCanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "CanvasGenerator")
@js.native
class CanvasGenerator ()
  extends typings.babylonjs.legacyMod.CanvasGenerator
/* static members */
object CanvasGenerator {
  
  @JSImport("babylonjs", "CanvasGenerator")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a new canvas (or offscreen canvas depending on the context)
    * @param width defines the expected width
    * @param height defines the expected height
    * @return a new canvas or offscreen canvas
    */
  inline def CreateCanvas(width: Double, height: Double): HTMLCanvasElement | OffscreenCanvas = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCanvas")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement | OffscreenCanvas]
}
