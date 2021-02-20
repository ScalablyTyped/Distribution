package typings.babylonjs

import typings.std.OffscreenCanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvasGeneratorMod {
  
  @JSImport("babylonjs/Misc/canvasGenerator", "CanvasGenerator")
  @js.native
  class CanvasGenerator () extends StObject
  /* static members */
  object CanvasGenerator {
    
    /**
      * Create a new canvas (or offscreen canvas depending on the context)
      * @param width defines the expected width
      * @param height defines the expected height
      * @return a new canvas or offscreen canvas
      */
    @JSImport("babylonjs/Misc/canvasGenerator", "CanvasGenerator.CreateCanvas")
    @js.native
    def CreateCanvas(width: Double, height: Double): HTMLCanvasElement | OffscreenCanvas = js.native
  }
}
