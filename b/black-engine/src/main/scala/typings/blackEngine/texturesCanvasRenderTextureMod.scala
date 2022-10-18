package typings.blackEngine

import typings.blackEngine.driversCanvasRenderTargetCanvasMod.RenderTargetCanvas
import typings.blackEngine.texturesTextureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object texturesCanvasRenderTextureMod {
  
  @JSImport("black-engine/textures/CanvasRenderTexture", "CanvasRenderTexture")
  @js.native
  open class CanvasRenderTexture protected () extends Texture {
    def this(width: Double, height: Double, scale: Double) = this()
    
    def __dumpToDocument(): Unit = js.native
    
    var renderTarget: RenderTargetCanvas = js.native
    
    def resize(width: Double, height: Double, scale: Double): Unit = js.native
  }
}
