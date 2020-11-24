package typings.babylonjs

import typings.std.OffscreenCanvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/canvasGenerator", JSImport.Namespace)
@js.native
object canvasGeneratorMod extends js.Object {
  
  @js.native
  class CanvasGenerator () extends js.Object
  /* static members */
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
}
