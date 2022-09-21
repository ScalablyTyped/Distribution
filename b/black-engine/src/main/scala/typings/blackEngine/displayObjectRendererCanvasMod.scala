package typings.blackEngine

import typings.blackEngine.rendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object displayObjectRendererCanvasMod {
  
  @JSImport("black-engine/drivers/canvas/DisplayObjectRendererCanvas", "DisplayObjectRendererCanvas")
  @js.native
  open class DisplayObjectRendererCanvas () extends Renderer {
    
    def __refreshBitmapCache(): Unit = js.native
    
    def begin(driver: Any, session: Any): Unit = js.native
    
    /* private */ var mBakeInvertedMatrix: Any = js.native
    
    /* private */ var mCacheAsBitmapDirty: Any = js.native
    
    /* private */ var mCacheAsBitmapMatrixCache: Any = js.native
    
    /* private */ var mCacheBounds: Any = js.native
    
    /* private */ var mCacheTexture: Any = js.native
    
    var mIsCached: Boolean = js.native
    
    /* private */ var mIsClipped: Any = js.native
    
    def preRender(driver: Any, session: Any): Unit = js.native
    
    def render(driver: Any, session: Any): Unit = js.native
    
    def upload(driver: Any, session: Any): Unit = js.native
  }
}
