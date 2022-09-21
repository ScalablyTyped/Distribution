package typings.blackEngine

import typings.blackEngine.messageDispatcherMod.MessageDispatcher
import typings.blackEngine.rectangleMod.Rectangle
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewportMod {
  
  @JSImport("black-engine/core/Viewport", "Viewport")
  @js.native
  open class Viewport () extends MessageDispatcher {
    def this(containerElement: HTMLElement) = this()
    
    def __initialize(): Unit = js.native
    
    /* private */ var __onResize: Any = js.native
    
    /* private */ var __update: Any = js.native
    
    /* private */ var backgroundColor: Any = js.native
    
    def dispose(): Unit = js.native
    
    def isLandscape: Boolean = js.native
    
    def isPortrait: Boolean = js.native
    
    def isPrimary(): Boolean = js.native
    
    /* private */ var isTransparent: Any = js.native
    
    /* private */ var mBoundResize: Any = js.native
    
    /* private */ var mChecksLeftSeconds: Any = js.native
    
    /* private */ var mContainerElement: Any = js.native
    
    /* private */ var mIsPrimary: Any = js.native
    
    /* private */ var mOrientation: Any = js.native
    
    /* private */ var mOrientationLock: Any = js.native
    
    /* private */ var mReflect: Any = js.native
    
    /* private */ var mRotation: Any = js.native
    
    /* private */ var mSize: Any = js.native
    
    /* private */ var mViewportElement: Any = js.native
    
    def nativeElement: Element = js.native
    
    def orientation: String = js.native
    
    def orientationLock: Boolean = js.native
    def orientationLock_=(arg: Boolean): Unit = js.native
    
    def orientation_=(arg: String): Unit = js.native
    
    def refresh(): Unit = js.native
    
    def rotation: Double = js.native
    
    def size: Rectangle = js.native
  }
}
