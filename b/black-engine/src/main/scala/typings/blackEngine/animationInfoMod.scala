package typings.blackEngine

import typings.blackEngine.animationControllerMod.AnimationController
import typings.blackEngine.textureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationInfoMod {
  
  @JSImport("black-engine/animation/AnimationInfo", "AnimationInfo")
  @js.native
  open class AnimationInfo protected () extends StObject {
    def this(controller: AnimationController, name: String, frames: js.Array[Texture]) = this()
    def this(controller: AnimationController, name: String, frames: js.Array[Texture], fps: Double) = this()
    def this(
      controller: AnimationController,
      name: String,
      frames: js.Array[Texture],
      fps: Double,
      loop: Boolean
    ) = this()
    def this(controller: AnimationController, name: String, frames: js.Array[Texture], fps: Unit, loop: Boolean) = this()
    
    def __pause(): Unit = js.native
    
    def __play(): Texture = js.native
    
    def __stop(): Unit = js.native
    
    def __update(): Texture | Null = js.native
    
    def fps: Double = js.native
    def fps_=(arg: Double): Unit = js.native
    
    def frames: js.Array[Texture] = js.native
    
    def isComplete: Boolean = js.native
    
    def isPlaying: Boolean = js.native
    
    def loop: Boolean = js.native
    def loop_=(arg: Boolean): Unit = js.native
    
    /* private */ var mCompleted: Any = js.native
    
    /* private */ var mController: Any = js.native
    
    /* private */ var mCurrentFrame: Any = js.native
    
    /* private */ var mElapsed: Any = js.native
    
    /* private */ var mFPS: Any = js.native
    
    /* private */ var mFrameDuration: Any = js.native
    
    /* private */ var mFrames: Any = js.native
    
    /* private */ var mLoop: Any = js.native
    
    /* private */ var mName: Any = js.native
    
    /* private */ var mNextFrameAt: Any = js.native
    
    /* private */ var mPaused: Any = js.native
    
    /* private */ var mStopped: Any = js.native
    
    def name: String = js.native
  }
}
