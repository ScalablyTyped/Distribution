package typings.blackEngine

import typings.blackEngine.componentMod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timerMod {
  
  @JSImport("black-engine/timers/Timer", "Timer")
  @js.native
  open class Timer () extends Component {
    def this(interval: Double) = this()
    def this(interval: Double, ticksCount: Double) = this()
    def this(interval: Unit, ticksCount: Double) = this()
    def this(interval: Double, ticksCount: Double, startOnAdded: Boolean) = this()
    def this(interval: Double, ticksCount: Unit, startOnAdded: Boolean) = this()
    def this(interval: Unit, ticksCount: Double, startOnAdded: Boolean) = this()
    def this(interval: Unit, ticksCount: Unit, startOnAdded: Boolean) = this()
    
    def currentTick: Double = js.native
    
    def elapsedSeconds: Double = js.native
    
    def interval: Double = js.native
    def interval_=(arg: Double): Unit = js.native
    
    def isComplete: Boolean = js.native
    
    def isRunning: Boolean = js.native
    
    /* private */ var mElapsedSeconds: Any = js.native
    
    /* private */ var mInterval: Any = js.native
    
    /* private */ var mIsRunning: Any = js.native
    
    /* private */ var mStartOnAdded: Any = js.native
    
    /* private */ var mTick: Any = js.native
    
    /* private */ var mTicksCount: Any = js.native
    
    /* private */ var mTotalElapsedSeconds: Any = js.native
    
    def onAdded(): Unit = js.native
    
    def pause(): Timer = js.native
    
    def reset(): Timer = js.native
    
    def secondsToNextTick: Double = js.native
    
    def start(): Timer = js.native
    
    def startOnAdded: Boolean = js.native
    def startOnAdded_=(arg: Boolean): Unit = js.native
    
    def stop(): Timer = js.native
    
    def ticksCount: Double = js.native
    def ticksCount_=(arg: Double): Unit = js.native
    
    def ticksLeft: Double = js.native
    
    def totalElapsedSeconds: Double = js.native
  }
}
