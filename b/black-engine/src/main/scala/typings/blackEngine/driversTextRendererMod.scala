package typings.blackEngine

import typings.blackEngine.driversRendererMod.Renderer
import typings.blackEngine.texturesTextureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driversTextRendererMod {
  
  @JSImport("black-engine/drivers/TextRenderer", "TextRenderer")
  @js.native
  open class TextRenderer () extends Renderer {
    
    /* private */ var mCanvas: Any = js.native
    
    /* private */ var mContext: Any = js.native
    
    /* private */ var mMetrics: Any = js.native
    
    /* private */ var mTransform: Any = js.native
    
    /* private */ var mTransformCache: Any = js.native
    
    /* private */ var mUseTransformCache: Any = js.native
    
    def preRender(driver: Any, session: Any): Unit = js.native
    
    def render(driver: Any, session: Any): Unit = js.native
    
    /* private */ var renderSegment: Any = js.native
    
    var texture: Texture = js.native
    
    def updateTransform(): Unit = js.native
    
    def upload(driver: Any, session: Any): Unit = js.native
  }
}
