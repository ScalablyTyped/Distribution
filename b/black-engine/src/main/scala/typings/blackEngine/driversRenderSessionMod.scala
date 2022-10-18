package typings.blackEngine

import typings.blackEngine.driversRendererMod.Renderer
import typings.blackEngine.geomMatrixMod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driversRenderSessionMod {
  
  @JSImport("black-engine/drivers/RenderSession", "RenderSession")
  @js.native
  open class RenderSession () extends StObject {
    
    var customTransform: Matrix | Null = js.native
    
    var endPassParentRenderers: js.Array[Renderer] = js.native
    
    var isBackBufferActive: Boolean = js.native
    
    var parentRenderers: js.Array[Renderer] = js.native
    
    def reset(): Unit = js.native
  }
}
