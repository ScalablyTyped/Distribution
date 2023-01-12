package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGPUCanvasContext extends StObject {
  
  /**
    * A convenient way to draw multiple frames over the swapchain texture sequence associated with
    * a canvas element. Each call internally constructs a new Surface that targets the current
    * GPUTexture in swapchain.
    *
    * This requires an environment where a global function called requestAnimationFrame is
    * available (e.g. on the web, not on Node). The internally created surface is flushed and
    * destroyed automatically by this wrapper once the `drawFrame` callback returns.
    *
    * Users can call canvasContext.requestAnimationFrame in the callback function to
    * draw multiple frames, e.g. of an animation.
    */
  def requestAnimationFrame(drawFrame: js.Function1[/* _ */ Canvas, Unit]): Unit
}
object WebGPUCanvasContext {
  
  inline def apply(requestAnimationFrame: js.Function1[/* _ */ Canvas, Unit] => Unit): WebGPUCanvasContext = {
    val __obj = js.Dynamic.literal(requestAnimationFrame = js.Any.fromFunction1(requestAnimationFrame))
    __obj.asInstanceOf[WebGPUCanvasContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebGPUCanvasContext] (val x: Self) extends AnyVal {
    
    inline def setRequestAnimationFrame(value: js.Function1[/* _ */ Canvas, Unit] => Unit): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction1(value))
  }
}
