package typings.blackEngine

import typings.blackEngine.graphicsRendererMod.GraphicsRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphicsRendererCanvasMod {
  
  @JSImport("black-engine/drivers/canvas/GraphicsRendererCanvas", "GraphicsRendererCanvas")
  @js.native
  open class GraphicsRendererCanvas () extends GraphicsRenderer {
    
    /* private */ var __drawCommandBuffer: Any = js.native
    
    /* private */ var __renderNode: Any = js.native
    
    def render(driver: Any, session: Any): Unit = js.native
  }
}
