package typings.blackEngine

import typings.blackEngine.matrixMod.Matrix
import typings.blackEngine.rendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderSessionMod {
  
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
