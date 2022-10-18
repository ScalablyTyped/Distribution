package typings.blackEngine

import typings.blackEngine.driversRendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driversCanvasEmitterRendererCanvasMod {
  
  @JSImport("black-engine/drivers/canvas/EmitterRendererCanvas", "EmitterRendererCanvas")
  @js.native
  open class EmitterRendererCanvas () extends Renderer {
    
    /* private */ var __renderParticle: Any = js.native
    
    /* private */ var __tmpLocal: Any = js.native
    
    /* private */ var __tmpWorld: Any = js.native
    
    var isLocal: Boolean = js.native
    
    def preRender(driver: Any, session: Any): Unit = js.native
    
    def render(driver: Any, session: Any): Unit = js.native
  }
}
