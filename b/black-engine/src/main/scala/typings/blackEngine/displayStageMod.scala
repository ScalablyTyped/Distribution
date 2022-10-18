package typings.blackEngine

import typings.blackEngine.coreGameObjectMod.GameObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object displayStageMod {
  
  @JSImport("black-engine/display/Stage", "Stage")
  @js.native
  open class Stage () extends GameObject {
    
    /* private */ var __refresh: Any = js.native
    
    def centerX: Double = js.native
    
    def centerY: Double = js.native
    
    def getBounds(space: Any): Any = js.native
    def getBounds(space: Any, includeChildren: Boolean): Any = js.native
    def getBounds(space: Any, includeChildren: Boolean, outRect: Any): Any = js.native
    def getBounds(space: Any, includeChildren: Unit, outRect: Any): Any = js.native
    def getBounds(space: Unit, includeChildren: Boolean, outRect: Any): Any = js.native
    def getBounds(space: Unit, includeChildren: Unit, outRect: Any): Any = js.native
    
    /* private */ var mCacheHeight: Any = js.native
    
    /* private */ var mCacheWidth: Any = js.native
    
    /* private */ var mDPR: Any = js.native
    
    /* private */ var mHeight: Any = js.native
    
    /* private */ var mScaleMode: Any = js.native
    
    /* private */ var mStageHeight: Any = js.native
    
    /* private */ var mStageScaleFactor: Any = js.native
    
    /* private */ var mStageWidth: Any = js.native
    
    /* private */ var mWidth: Any = js.native
    
    def onGetLocalBounds(outRect: Any): Any = js.native
    
    def refresh(): Unit = js.native
    
    def renderHeight: Double = js.native
    
    def renderWidth: Double = js.native
    
    def scaleFactor: Double = js.native
    
    def scaleMode: String = js.native
    def scaleMode_=(arg: String): Unit = js.native
    
    def setSize(width: Double, height: Double): Unit = js.native
  }
}
