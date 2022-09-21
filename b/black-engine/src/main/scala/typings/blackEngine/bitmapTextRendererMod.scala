package typings.blackEngine

import typings.blackEngine.rendererMod.Renderer
import typings.blackEngine.textureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bitmapTextRendererMod {
  
  @JSImport("black-engine/drivers/BitmapTextRenderer", "BitmapTextRenderer")
  @js.native
  open class BitmapTextRenderer () extends Renderer {
    
    /* private */ var mCanvas: Any = js.native
    
    /* private */ var mContext: Any = js.native
    
    def render(driver: Any, session: Any): Unit = js.native
    
    var texture: Texture | Null = js.native
  }
}
