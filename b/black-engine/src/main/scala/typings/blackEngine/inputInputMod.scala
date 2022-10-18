package typings.blackEngine

import typings.blackEngine.coreSystemMod.System
import typings.blackEngine.geomVectorMod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputInputMod {
  
  @JSImport("black-engine/input/Input", "Input")
  @js.native
  open class Input () extends System {
    
    /* private */ var __findTarget: Any = js.native
    
    /* private */ var __getPointerPos: Any = js.native
    
    /* private */ var __getTouchPos: Any = js.native
    
    /* private */ var __initListeners: Any = js.native
    
    def __initialize(): Unit = js.native
    
    /* private */ var __onKeyEvent: Any = js.native
    
    /* private */ var __onPointerEvent: Any = js.native
    
    /* private */ var __onPointerEventDoc: Any = js.native
    
    /* private */ var __processNativeEvent: Any = js.native
    
    /* private */ var __pushEvent: Any = js.native
    
    /* private */ var __updateKeyboard: Any = js.native
    
    def isPointerDown: Boolean = js.native
    
    /* private */ var mBoundListeners: Any = js.native
    
    /* private */ var mDom: Any = js.native
    
    /* private */ var mEventList: Any = js.native
    
    /* private */ var mInputListeners: Any = js.native
    
    /* private */ var mIsPointerDown: Any = js.native
    
    /* private */ var mKeyEventList: Any = js.native
    
    /* private */ var mKeyQueue: Any = js.native
    
    /* private */ var mLastInTargetComponent: Any = js.native
    
    /* private */ var mLockedTarget: Any = js.native
    
    /* private */ var mPointerPosition: Any = js.native
    
    /* private */ var mPointerQueue: Any = js.native
    
    /* private */ var mPressedKeys: Any = js.native
    
    /* private */ var mStagePosition: Any = js.native
    
    /* private */ var mTarget: Any = js.native
    
    /* private */ var mTargetComponent: Any = js.native
    
    /* private */ var mViewportPosition: Any = js.native
    
    def pointerPosition: Vector = js.native
    
    def pointerX: Double = js.native
    
    def pointerY: Double = js.native
    
    def pressedKeys: js.Array[Double] = js.native
    
    def stagePosition: Vector = js.native
    
    def stageX: Double = js.native
    
    def stageY: Double = js.native
    
    def viewportPosition: Vector = js.native
  }
}
