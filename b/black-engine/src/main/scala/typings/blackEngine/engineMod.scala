package typings.blackEngine

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.blackEngine.componentMod.Component
import typings.blackEngine.gameObjectMod.GameObject
import typings.blackEngine.messageDispatcherMod.MessageDispatcher
import typings.blackEngine.systemMod.System
import typings.blackEngine.videoNullDriverMod.VideoNullDriver
import typings.blackEngine.viewportMod.Viewport
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineMod {
  
  @JSImport("black-engine/Engine", "Engine")
  @js.native
  open class Engine protected () extends MessageDispatcher {
    def this(
      containerElementId: String,
      gameClass: Instantiable0[GameObject],
      videoDriverClass: Instantiable3[/* arg1 */ HTMLElement, /* arg2 */ Double, /* arg3 */ Double, VideoNullDriver]
    ) = this()
    def this(
      containerElementId: String,
      gameClass: Instantiable0[GameObject],
      videoDriverClass: Instantiable3[/* arg1 */ HTMLElement, /* arg2 */ Double, /* arg3 */ Double, VideoNullDriver],
      systemClasses: js.Array[Instantiable0[System]]
    ) = this()
    
    /* private */ var __addSystem: Any = js.native
    
    /* private */ var __bootStage: Any = js.native
    
    /* private */ var __bootSystems: Any = js.native
    
    /* private */ var __bootVideo: Any = js.native
    
    /* private */ var __bootViewport: Any = js.native
    
    def __checkVisibility(): Unit = js.native
    
    def __dispose(): Unit = js.native
    
    def __initialize(): Unit = js.native
    
    /* private */ var __internalSystemPostUpdate: Any = js.native
    
    /* private */ var __internalSystemRender: Any = js.native
    
    /* private */ var __internalUpdate: Any = js.native
    
    def __onVisibilityChange(): Unit = js.native
    
    /* private */ var __onVisibilityChangeFallback: Any = js.native
    
    def __setUnpaused(): Unit = js.native
    
    /* private */ var __update: Any = js.native
    
    def containerElement: Element = js.native
    
    def containerElementId: String = js.native
    
    def destroy(): Unit = js.native
    
    def frameNum: Double = js.native
    
    def getSystem[T](typeName: T): T | Null = js.native
    
    def hasSystem(systemTypeName: Any): Boolean = js.native
    
    var id: Double = js.native
    
    def isPaused: Boolean = js.native
    
    /* private */ var mContainerElement: Any = js.native
    
    /* private */ var mContainerElementId: Any = js.native
    
    /* private */ var mFrameNum: Any = js.native
    
    /* private */ var mFrameTimes: Any = js.native
    
    /* private */ var mGameClass: Any = js.native
    
    /* private */ var mGameObject: Any = js.native
    
    /* private */ var mIsPanic: Any = js.native
    
    /* private */ var mIsRunning: Any = js.native
    
    /* private */ var mIsStarted: Any = js.native
    
    /* private */ var mLastRenderTime: Any = js.native
    
    /* private */ var mLastUpdateTime: Any = js.native
    
    /* private */ var mMaxUpdatesPerFrame: Any = js.native
    
    /* private */ var mNumUpdates: Any = js.native
    
    /* private */ var mPauseOnBlur: Any = js.native
    
    /* private */ var mPauseOnHide: Any = js.native
    
    /* private */ var mPaused: Any = js.native
    
    /* private */ var mPendingDispose: Any = js.native
    
    /* private */ var mRAFHandle: Any = js.native
    
    /* private */ var mStage: Any = js.native
    
    /* private */ var mStageHeight: Any = js.native
    
    /* private */ var mStageWidth: Any = js.native
    
    /* private */ var mSystemClasses: Any = js.native
    
    /* private */ var mSystems: Any = js.native
    
    /* private */ var mTagCache: Any = js.native
    
    /* private */ var mUnpausing: Any = js.native
    
    /* private */ var mUseHiDPR: Any = js.native
    
    /* private */ var mVideo: Any = js.native
    
    /* private */ var mVideoDriverClass: Any = js.native
    
    /* private */ var mViewport: Any = js.native
    
    /* private */ var mWasStopped: Any = js.native
    
    def maxUpdatesPerFrame: Double = js.native
    def maxUpdatesPerFrame_=(arg: Double): Unit = js.native
    
    def numUpdates: Double = js.native
    
    /* protected */ def onChildrenAdded(child: GameObject, parent: Any): Unit = js.native
    
    /* protected */ def onChildrenChanged(child: GameObject): Unit = js.native
    
    /* protected */ def onChildrenRemoved(child: GameObject): Unit = js.native
    
    /* protected */ def onComponentAdded(child: GameObject, component: Component): Unit = js.native
    
    /* protected */ def onComponentRemoved(child: GameObject, component: Component): Unit = js.native
    
    /* protected */ def onTagUpdated(child: GameObject): Unit = js.native
    /* protected */ def onTagUpdated(child: GameObject, oldTag: String): Unit = js.native
    /* protected */ def onTagUpdated(child: GameObject, oldTag: String, newTag: String): Unit = js.native
    /* protected */ def onTagUpdated(child: GameObject, oldTag: Null, newTag: String): Unit = js.native
    
    def pause(): Unit = js.native
    
    def pauseOnBlur: Boolean = js.native
    def pauseOnBlur_=(arg: Boolean): Unit = js.native
    
    def pauseOnHide: Boolean = js.native
    def pauseOnHide_=(arg: Boolean): Unit = js.native
    
    def resume(): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    def ups: Double = js.native
    def ups_=(arg: Double): Unit = js.native
    
    def useHiDPR: Boolean = js.native
    def useHiDPR_=(arg: Boolean): Unit = js.native
    
    def viewport: Viewport = js.native
  }
}
