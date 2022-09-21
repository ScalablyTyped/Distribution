package typings.blackEngine

import typings.blackEngine.componentMod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tweenMod {
  
  @JSImport("black-engine/animation/Tween", "Tween")
  @js.native
  open class Tween protected () extends Component {
    def this(values: Any) = this()
    def this(values: Any, duration: Double) = this()
    def this(values: Any, duration: Double, properties: Any) = this()
    def this(values: Any, duration: Unit, properties: Any) = this()
    def this(values: Any, duration: Double, properties: Any, plugins: Any) = this()
    def this(values: Any, duration: Double, properties: Unit, plugins: Any) = this()
    def this(values: Any, duration: Unit, properties: Any, plugins: Any) = this()
    def this(values: Any, duration: Unit, properties: Unit, plugins: Any) = this()
    
    def __collectStartingValues(): Unit = js.native
    
    /* private */ var __resume: Any = js.native
    
    /* private */ var __reverse: Any = js.native
    
    /* private */ var __start: Any = js.native
    
    /* private */ var __update: Any = js.native
    
    def chain(tween: Any): Tween = js.native
    
    def delay: Double = js.native
    def delay_=(arg: Double): Unit = js.native
    
    def duration: Double = js.native
    
    def ease: js.Function1[/* arg0 */ Double, Double] = js.native
    def ease_=(arg: js.Function1[/* arg0 */ Double, Double]): Unit = js.native
    
    def elapsed: Double = js.native
    
    def interpolation: js.Function2[/* arg0 */ js.Array[Any], /* arg1 */ Double, Double] = js.native
    def interpolation_=(arg: js.Function2[/* arg0 */ js.Array[Any], /* arg1 */ Double, Double]): Unit = js.native
    
    def isPlaying: Boolean = js.native
    
    def loop: Boolean = js.native
    def loop_=(arg: Boolean): Unit = js.native
    
    /* private */ var mDelay: Any = js.native
    
    /* private */ var mDuration: Any = js.native
    
    /* private */ var mEase: Any = js.native
    
    /* private */ var mElapsed: Any = js.native
    
    /* private */ var mInitiated: Any = js.native
    
    /* private */ var mInterpolation: Any = js.native
    
    /* private */ var mIsPaused: Any = js.native
    
    /* private */ var mIsPlaying: Any = js.native
    
    /* private */ var mIsYoyoBack: Any = js.native
    
    /* private */ var mPausedTime: Any = js.native
    
    /* private */ var mPlayOnAdded: Any = js.native
    
    /* private */ var mPlugins: Any = js.native
    
    /* private */ var mProperties: Any = js.native
    
    /* private */ var mRemoveOnComplete: Any = js.native
    
    /* private */ var mRepeatDelay: Any = js.native
    
    /* private */ var mRepeats: Any = js.native
    
    /* private */ var mReverseOnInit: Any = js.native
    
    /* private */ var mReversed: Any = js.native
    
    /* private */ var mStartTime: Any = js.native
    
    /* private */ var mStarted: Any = js.native
    
    /* private */ var mValues: Any = js.native
    
    /* private */ var mValuesStart: Any = js.native
    
    /* private */ var mYoyo: Any = js.native
    
    def onAdded(gameObject: Any): Unit = js.native
    
    def pause(): Tween = js.native
    
    def play(): Tween = js.native
    
    def playOnAdded: Boolean = js.native
    def playOnAdded_=(arg: Boolean): Unit = js.native
    
    def plugins: Any = js.native
    def plugins_=(arg: Any): Unit = js.native
    
    def removeOnComplete: Boolean = js.native
    def removeOnComplete_=(arg: Boolean): Unit = js.native
    
    def repeatDelay: Double = js.native
    def repeatDelay_=(arg: Double): Unit = js.native
    
    def repeats: Double = js.native
    def repeats_=(arg: Double): Unit = js.native
    
    def reset(): Tween = js.native
    
    def reverse(): Tween = js.native
    def reverse(asYoyo: Boolean): Tween = js.native
    
    def reversed: Boolean = js.native
    def reversed_=(arg: Boolean): Unit = js.native
    
    def set(values: Any): Unit = js.native
    
    def stop(): Tween = js.native
    
    def to(): Tween = js.native
    def to(values: Any): Tween = js.native
    def to(values: Any, duration: Double): Tween = js.native
    def to(values: Unit, duration: Double): Tween = js.native
    
    def yoyo: Boolean = js.native
    def yoyo_=(arg: Boolean): Unit = js.native
  }
}
