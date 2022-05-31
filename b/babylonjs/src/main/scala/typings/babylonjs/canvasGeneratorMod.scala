package typings.babylonjs

import typings.std.OffscreenCanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvasGeneratorMod {
  
  @JSImport("babylonjs/Misc/canvasGenerator", "CanvasGenerator")
  @js.native
  class CanvasGenerator () extends StObject
  /* static members */
  object CanvasGenerator {
    
    @JSImport("babylonjs/Misc/canvasGenerator", "CanvasGenerator")
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
}
