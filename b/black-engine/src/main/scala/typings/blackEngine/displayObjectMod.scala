package typings.blackEngine

import typings.blackEngine.blendModeMod.BlendMode
import typings.blackEngine.gameObjectMod.GameObject
import typings.blackEngine.rectangleMod.Rectangle
import typings.blackEngine.rendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object displayObjectMod {
  
  @JSImport("black-engine/display/DisplayObject", "DisplayObject")
  @js.native
  open class DisplayObject () extends GameObject {
    
    def alpha: Double = js.native
    def alpha_=(arg: Double): Unit = js.native
    
    def blendMode: String = js.native
    def blendMode_=(arg: String): Unit = js.native
    
    def cacheAsBitmap: Boolean = js.native
    
    def cacheAsBitmapDynamic: Boolean = js.native
    def cacheAsBitmapDynamic_=(arg: Boolean): Unit = js.native
    
    def cacheAsBitmap_=(arg: Boolean): Unit = js.native
    
    def clipRect: Rectangle = js.native
    def clipRect_=(arg: Rectangle): Unit = js.native
    
    def color: Double = js.native
    def color_=(arg: Double): Unit = js.native
    
    def getBounds(space: Any): Any = js.native
    def getBounds(space: Any, includeChildren: Boolean): Any = js.native
    def getBounds(space: Any, includeChildren: Boolean, outRect: Any): Any = js.native
    def getBounds(space: Any, includeChildren: Unit, outRect: Any): Any = js.native
    def getBounds(space: Unit, includeChildren: Boolean, outRect: Any): Any = js.native
    def getBounds(space: Unit, includeChildren: Unit, outRect: Any): Any = js.native
    
    def getRenderer(): Renderer = js.native
    
    def hitTest(localPoint: Any): GameObject | DisplayObject = js.native
    
    /* protected */ var mAlpha: Double = js.native
    
    /* protected */ var mBlendMode: BlendMode = js.native
    
    /* private */ var mCache: Any = js.native
    
    /* private */ var mCacheAsBitmap: Any = js.native
    
    /* private */ var mCacheAsBitmapDirty: Any = js.native
    
    /* private */ var mCacheAsBitmapDynamic: Any = js.native
    
    /* private */ var mCacheAsBitmapMatrixCache: Any = js.native
    
    /* private */ var mCacheBounds: Any = js.native
    
    /* protected */ var mClipRect: Rectangle = js.native
    
    /* protected */ var mColor: Double | Null = js.native
    
    /* protected */ var mRenderer: Renderer | Null = js.native
    
    /* protected */ var mSnapToPixels: Boolean = js.native
    
    /* protected */ var mVisible: Boolean = js.native
    
    def onGetLocalBounds(outRect: Any): Any = js.native
    
    def onHitTestMask(localPoint: Any): Boolean = js.native
    
    /* protected */ def onRender(): Unit = js.native
    
    def snapToPixels: Boolean = js.native
    def snapToPixels_=(arg: Boolean): Unit = js.native
    
    def visible: Boolean = js.native
    def visible_=(arg: Boolean): Unit = js.native
  }
}
